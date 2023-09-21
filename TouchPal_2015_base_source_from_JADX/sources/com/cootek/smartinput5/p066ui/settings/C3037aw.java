package com.cootek.smartinput5.p066ui.settings;

import android.view.inputmethod.InputMethodManager;

/* renamed from: com.cootek.smartinput5.ui.settings.aw */
/* compiled from: EmotionKeyDialog */
class C3037aw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EmotionKeyDialog f13953a;

    C3037aw(EmotionKeyDialog emotionKeyDialog) {
        this.f13953a = emotionKeyDialog;
    }

    public void run() {
        this.f13953a.f13432c.requestFocus();
        this.f13953a.m13764a(true);
        ((InputMethodManager) this.f13953a.getSystemService("input_method")).toggleSoftInput(0, 2);
    }
}
