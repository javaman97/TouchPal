package com.iflytek.cloud.p086d.p087a;

import android.os.Bundle;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

/* renamed from: com.iflytek.cloud.d.a.c */
final class C4011c implements SpeechListener {

    /* renamed from: a */
    final /* synthetic */ LexiconListener f16386a;

    /* renamed from: b */
    final /* synthetic */ C4008a f16387b;

    C4011c(C4008a aVar, LexiconListener lexiconListener) {
        this.f16387b = aVar;
        this.f16386a = lexiconListener;
    }

    public void onCompleted(SpeechError speechError) {
        this.f16386a.onLexiconUpdated((String) null, speechError);
    }

    public void onData(byte[] bArr) {
    }

    public void onEvent(int i, Bundle bundle) {
    }
}
