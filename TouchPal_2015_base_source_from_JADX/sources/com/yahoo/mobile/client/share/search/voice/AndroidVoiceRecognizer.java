package com.yahoo.mobile.client.share.search.voice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizer;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizerListener;
import com.yahoo.mobile.client.share.search.interfaces.SpeechError;
import java.util.ArrayList;

public class AndroidVoiceRecognizer implements RecognitionListener, IVoiceRecognizer {

    /* renamed from: c */
    private static String f17358c = "AndroidVoiceRecognizer";

    /* renamed from: a */
    protected Context f17359a;

    /* renamed from: b */
    protected IVoiceRecognizerListener f17360b;

    /* renamed from: d */
    private SpeechRecognizer f17361d;

    /* renamed from: e */
    private int f17362e;

    /* renamed from: a */
    static /* synthetic */ String m17795a(int i) {
        switch (i) {
            case 1:
                return "Network operation timed out";
            case 2:
                return "Network error";
            case 3:
                return "Audio recording error";
            case 4:
                return "Server error";
            case 5:
                return "Client error";
            case 6:
                return "No speech input";
            case 7:
                return "No recognition result matched";
            case 8:
                return "RecognitionService busy";
            case 9:
                return "Insufficient permission";
            default:
                return "Audio recording error";
        }
    }

    public AndroidVoiceRecognizer(Context context, String str, IVoiceRecognizerListener iVoiceRecognizerListener) {
        if (!SpeechRecognizer.isRecognitionAvailable(context)) {
            throw new RuntimeException("No speech recognition service available on the system");
        }
        this.f17359a = context;
        this.f17360b = iVoiceRecognizerListener;
        this.f17361d = SpeechRecognizer.createSpeechRecognizer(this.f17359a);
        if (this.f17361d != null) {
            this.f17361d.setRecognitionListener(this);
            return;
        }
        throw new RuntimeException("Problems creating speech recognition service");
    }

    protected AndroidVoiceRecognizer() {
    }

    public void startRecording() {
        SpeechRecognizer speechRecognizer = this.f17361d;
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("calling_package", "voice.recognition.test");
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        speechRecognizer.startListening(intent);
    }

    public float getAudioLevel() {
        if (this.f17362e < 0) {
            return 0.0f;
        }
        return (float) this.f17362e;
    }

    public void stopRecording() {
        this.f17361d.stopListening();
    }

    public void cancel() {
        this.f17361d.cancel();
    }

    public void onReadyForSpeech(Bundle bundle) {
        String str = f17358c;
        if (this.f17360b != null) {
            this.f17360b.onRecordingBegin(this);
        }
    }

    public void onBeginningOfSpeech() {
        String str = f17358c;
    }

    public void onRmsChanged(float f) {
        String str = f17358c;
        new StringBuilder("onRmsChanged = ").append(f);
        this.f17362e = (int) (5.0f * f);
    }

    public void onBufferReceived(byte[] bArr) {
        String str = f17358c;
    }

    public void onEndOfSpeech() {
        String str = f17358c;
        if (this.f17360b != null) {
            this.f17360b.onRecordingDone(this);
        }
    }

    public void onError(final int i) {
        String str = f17358c;
        new StringBuilder("error ").append(i);
        if (this.f17360b != null) {
            this.f17360b.onError(this, new SpeechError() {
                public final String getErrorDetail() {
                    return AndroidVoiceRecognizer.m17795a(i);
                }

                public final int getErrorCode() {
                    return i;
                }
            });
        }
    }

    public void onResults(Bundle bundle) {
        String str = f17358c;
        new StringBuilder("onResults ").append(bundle);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        String str2 = "";
        if (stringArrayList != null && stringArrayList.size() > 0) {
            str2 = stringArrayList.get(0);
        }
        if (this.f17360b != null) {
            this.f17360b.onResults(this, str2);
        }
    }

    public void onPartialResults(Bundle bundle) {
        String str = f17358c;
    }

    public void onEvent(int i, Bundle bundle) {
        String str = f17358c;
        new StringBuilder("onEvent ").append(i);
    }

    public String getVoiceRecognitionProvider() {
        return "Android";
    }

    public void destroy() {
        if (this.f17361d != null) {
            this.f17361d.destroy();
        }
    }
}
