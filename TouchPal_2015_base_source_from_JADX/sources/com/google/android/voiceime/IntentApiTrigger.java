package com.google.android.voiceime;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.cootek.smartinput5.engine.ExtractTextProvider;
import java.util.HashSet;
import java.util.Set;

class IntentApiTrigger implements Trigger {
    private static final String TAG = "VoiceIntentApiTrigger";
    private final Handler mHandler;
    private final InputMethodService mInputMethodService;
    private String mLastRecognitionResult;
    private final ServiceBridge mServiceBridge = new ServiceBridge(new Callback() {
        public void onRecognitionResult(String str) {
            IntentApiTrigger.this.postResult(str);
        }
    });
    private IBinder mToken;
    private Set<Character> mUpperCaseChars = new HashSet();

    interface Callback {
        void onRecognitionResult(String str);
    }

    public IntentApiTrigger(InputMethodService inputMethodService) {
        this.mInputMethodService = inputMethodService;
        this.mUpperCaseChars.add('.');
        this.mUpperCaseChars.add('!');
        this.mUpperCaseChars.add('?');
        this.mUpperCaseChars.add(10);
        this.mHandler = new Handler();
    }

    public void startVoiceRecognition(String str) {
        this.mToken = this.mInputMethodService.getWindow().getWindow().getAttributes().token;
        this.mServiceBridge.startVoiceRecognition(this.mInputMethodService, str);
    }

    public static boolean isInstalled(InputMethodService inputMethodService) {
        if (inputMethodService.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() > 0) {
            return true;
        }
        return false;
    }

    private InputMethodManager getInputMethodManager() {
        return (InputMethodManager) this.mInputMethodService.getSystemService("input_method");
    }

    /* access modifiers changed from: private */
    public void postResult(String str) {
        this.mLastRecognitionResult = str;
        getInputMethodManager().showSoftInputFromInputMethod(this.mToken, 1);
    }

    public void onStartInputView() {
        Log.i(TAG, "#onStartInputView");
        if (this.mLastRecognitionResult != null) {
            scheduleCommit();
        }
    }

    private void scheduleCommit() {
        this.mHandler.post(new Runnable() {
            public void run() {
                IntentApiTrigger.this.commitResult();
            }
        });
    }

    /* access modifiers changed from: private */
    public void commitResult() {
        if (this.mLastRecognitionResult != null) {
            String str = this.mLastRecognitionResult;
            InputConnection currentInputConnection = this.mInputMethodService.getCurrentInputConnection();
            if (currentInputConnection == null) {
                Log.i(TAG, "Unable to commit recognition result, as the current input connection is null. Did someone kill the IME?");
            } else if (!currentInputConnection.beginBatchEdit()) {
                Log.i(TAG, "Unable to commit recognition result, as a batch edit cannot start");
            } else {
                try {
                    ExtractedText extractedText = ExtractTextProvider.getIns().getExtractedText(currentInputConnection, 1, 0);
                    if (extractedText == null) {
                        Log.i(TAG, "Unable to commit recognition result, as extracted text is null");
                        return;
                    }
                    if (extractedText.text != null) {
                        if (extractedText.selectionStart != extractedText.selectionEnd) {
                            currentInputConnection.deleteSurroundingText(extractedText.selectionStart, extractedText.selectionEnd);
                        }
                        str = format(extractedText, str);
                    }
                    if (!currentInputConnection.commitText(str, 0)) {
                        Log.i(TAG, "Unable to commit recognition result");
                        currentInputConnection.endBatchEdit();
                        return;
                    }
                    this.mLastRecognitionResult = null;
                    currentInputConnection.endBatchEdit();
                } finally {
                    currentInputConnection.endBatchEdit();
                }
            }
        }
    }

    private String format(ExtractedText extractedText, String str) {
        int i = extractedText.selectionStart - 1;
        while (i > 0 && Character.isWhitespace(extractedText.text.charAt(i))) {
            i--;
        }
        if (i == -1 || this.mUpperCaseChars.contains(Character.valueOf(extractedText.text.charAt(i)))) {
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        if (extractedText.selectionStart - 1 > 0 && !Character.isWhitespace(extractedText.text.charAt(extractedText.selectionStart - 1))) {
            str = " " + str;
        }
        if (extractedText.selectionEnd >= extractedText.text.length() || Character.isWhitespace(extractedText.text.charAt(extractedText.selectionEnd))) {
            return str;
        }
        return str + " ";
    }
}
