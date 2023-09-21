package com.iflytek.cloud;

import android.os.RemoteException;
import com.iflytek.speech.GrammarListener;

/* renamed from: com.iflytek.cloud.c */
final class C4003c extends GrammarListener.Stub {

    /* renamed from: a */
    final /* synthetic */ GrammarListener f16353a;

    /* renamed from: b */
    final /* synthetic */ SpeechRecognizer f16354b;

    C4003c(SpeechRecognizer speechRecognizer, GrammarListener grammarListener) {
        this.f16354b = speechRecognizer;
        this.f16353a = grammarListener;
    }

    public void onBuildFinish(String str, int i) throws RemoteException {
        if (this.f16353a != null) {
            this.f16353a.onBuildFinish(str, i == 0 ? null : new SpeechError(i));
        }
    }
}
