package com.iflytek.cloud.p086d.p087a;

import android.os.Bundle;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

/* renamed from: com.iflytek.cloud.d.a.b */
final class C4010b implements SpeechListener {

    /* renamed from: a */
    final /* synthetic */ GrammarListener f16384a;

    /* renamed from: b */
    final /* synthetic */ C4008a f16385b;

    C4010b(C4008a aVar, GrammarListener grammarListener) {
        this.f16385b = aVar;
        this.f16384a = grammarListener;
    }

    public void onCompleted(SpeechError speechError) {
        if (speechError != null) {
            this.f16384a.onBuildFinish((String) null, speechError);
        }
    }

    public void onData(byte[] bArr) {
        this.f16384a.onBuildFinish(new String(bArr), (SpeechError) null);
    }

    public void onEvent(int i, Bundle bundle) {
    }
}
