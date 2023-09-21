package com.iflytek.cloud.p078a.p080b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p080b.C3983e;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;

/* renamed from: com.iflytek.cloud.a.b.f */
final class C3985f extends Handler {

    /* renamed from: a */
    final /* synthetic */ C3983e.C3984a f16317a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3985f(C3983e.C3984a aVar, Looper looper) {
        super(looper);
        this.f16317a = aVar;
    }

    public void handleMessage(Message message) {
        if (this.f16317a.f16315b != null) {
            C3990a.m17030a("SpeechListener onMsg = " + message.what);
            switch (message.what) {
                case 0:
                    this.f16317a.f16315b.onEvent(message.arg1, (Bundle) message.obj);
                    break;
                case 1:
                    this.f16317a.f16315b.onData((byte[]) message.obj);
                    break;
                case 2:
                    this.f16317a.f16315b.onCompleted((SpeechError) message.obj);
                    break;
            }
            super.handleMessage(message);
        }
    }
}
