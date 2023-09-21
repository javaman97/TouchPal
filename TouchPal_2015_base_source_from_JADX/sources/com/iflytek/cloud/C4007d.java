package com.iflytek.cloud;

import android.os.RemoteException;
import com.iflytek.speech.LexiconListener;

/* renamed from: com.iflytek.cloud.d */
final class C4007d extends LexiconListener.Stub {

    /* renamed from: a */
    final /* synthetic */ LexiconListener f16377a;

    /* renamed from: b */
    final /* synthetic */ SpeechRecognizer f16378b;

    C4007d(SpeechRecognizer speechRecognizer, LexiconListener lexiconListener) {
        this.f16378b = speechRecognizer;
        this.f16377a = lexiconListener;
    }

    public void onLexiconUpdated(String str, int i) throws RemoteException {
        if (this.f16377a != null) {
            this.f16377a.onLexiconUpdated(str, i == 0 ? null : new SpeechError(i));
        }
    }
}
