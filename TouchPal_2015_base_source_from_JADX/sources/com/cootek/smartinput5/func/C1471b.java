package com.cootek.smartinput5.func;

import android.speech.tts.TextToSpeech;

/* renamed from: com.cootek.smartinput5.func.b */
/* compiled from: AccessibilityManager */
class C1471b implements TextToSpeech.OnUtteranceCompletedListener {

    /* renamed from: a */
    final /* synthetic */ C1372a f4721a;

    C1471b(C1372a aVar) {
        this.f4721a = aVar;
    }

    public void onUtteranceCompleted(String str) {
        this.f4721a.m6372f();
    }
}
