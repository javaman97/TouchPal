package com.google.android.voiceime;

import android.annotation.SuppressLint;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1584bI;
import java.util.List;

@SuppressLint({"NewApi"})
class ImeTrigger implements Trigger {
    private static final String VOICE_IME_PACKAGE_PREFIX = "com.google.android";
    private static final String VOICE_IME_SUBTYPE_MODE = "voice";
    private final InputMethodService mInputMethodService;

    public ImeTrigger(InputMethodService inputMethodService) {
        this.mInputMethodService = inputMethodService;
    }

    public void startVoiceRecognition(String str) {
        InputMethodManager inputMethodManager = getInputMethodManager(this.mInputMethodService);
        InputMethodInfo voiceImeInputMethodInfo = getVoiceImeInputMethodInfo(inputMethodManager);
        if (voiceImeInputMethodInfo != null) {
            inputMethodManager.setInputMethodAndSubtype(this.mInputMethodService.getWindow().getWindow().getAttributes().token, voiceImeInputMethodInfo.getId(), getVoiceImeSubtype(inputMethodManager, voiceImeInputMethodInfo));
        }
    }

    private static InputMethodManager getInputMethodManager(InputMethodService inputMethodService) {
        return (InputMethodManager) inputMethodService.getSystemService("input_method");
    }

    private InputMethodSubtype getVoiceImeSubtype(InputMethodManager inputMethodManager, InputMethodInfo inputMethodInfo) throws SecurityException, IllegalArgumentException {
        List list = inputMethodManager.getShortcutInputMethodsAndSubtypes().get(inputMethodInfo);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (InputMethodSubtype) list.get(0);
    }

    private static InputMethodInfo getVoiceImeInputMethodInfo(InputMethodManager inputMethodManager) throws SecurityException, IllegalArgumentException {
        try {
            List<InputMethodInfo> enabledInputMethodList = inputMethodManager.getEnabledInputMethodList();
            if (enabledInputMethodList != null) {
                for (InputMethodInfo next : enabledInputMethodList) {
                    int i = 0;
                    while (true) {
                        if (i < next.getSubtypeCount()) {
                            if (VOICE_IME_SUBTYPE_MODE.equals(next.getSubtypeAt(i).getMode()) && next.getComponent().getPackageName().startsWith(VOICE_IME_PACKAGE_PREFIX)) {
                                return next;
                            }
                            i++;
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isInstalled(InputMethodService inputMethodService) {
        InputMethodInfo voiceImeInputMethodInfo;
        if (Build.VERSION.SDK_INT >= 14 && C1584bI.m7155h(inputMethodService) && !Engine.getInstance().getEditor().getEditorInfo().packageName.equals(C0978q.f2512c) && (voiceImeInputMethodInfo = getVoiceImeInputMethodInfo(getInputMethodManager(inputMethodService))) != null && voiceImeInputMethodInfo.getSubtypeCount() > 0) {
            return true;
        }
        return false;
    }

    public void onStartInputView() {
    }
}
