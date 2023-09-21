package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.iflytek.cloud.b */
final class C3999b extends Handler {

    /* renamed from: a */
    final /* synthetic */ SpeechRecognizer f16349a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3999b(SpeechRecognizer speechRecognizer, Looper looper) {
        super(looper);
        this.f16349a = speechRecognizer;
    }

    public void handleMessage(Message message) {
        if (this.f16349a.f16244f != null) {
            this.f16349a.f16244f.onInit(0);
        }
    }
}
