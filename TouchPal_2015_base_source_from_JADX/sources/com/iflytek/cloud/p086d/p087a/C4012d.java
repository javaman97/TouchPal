package com.iflytek.cloud.p086d.p087a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p086d.p087a.C4008a;

/* renamed from: com.iflytek.cloud.d.a.d */
final class C4012d extends Handler {

    /* renamed from: a */
    final /* synthetic */ C4008a.C4009a f16388a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4012d(C4008a.C4009a aVar, Looper looper) {
        super(looper);
        this.f16388a = aVar;
    }

    public void handleMessage(Message message) {
        if (this.f16388a.f16381b != null) {
            switch (message.what) {
                case 0:
                    this.f16388a.f16381b.onError((SpeechError) message.obj);
                    break;
                case 1:
                    this.f16388a.f16381b.onVolumeChanged(message.arg1);
                    break;
                case 2:
                    this.f16388a.f16381b.onBeginOfSpeech();
                    break;
                case 3:
                    this.f16388a.f16381b.onEndOfSpeech();
                    break;
                case 4:
                    this.f16388a.f16381b.onResult((RecognizerResult) message.obj, message.arg1 == 1);
                    if (!this.f16388a.f16382c) {
                        C4008a.this.mo14734b("ui_frs");
                        boolean unused = this.f16388a.f16382c = true;
                    }
                    if (1 == message.arg1) {
                        C4008a.this.mo14734b("ui_lrs");
                        break;
                    }
                    break;
                case 6:
                    Message message2 = (Message) message.obj;
                    this.f16388a.f16381b.onEvent(message2.what, message2.arg1, message2.arg2, (Bundle) message2.obj);
                    break;
            }
            super.handleMessage(message);
        }
    }
}
