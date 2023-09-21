package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechRecognizer;

/* renamed from: com.iflytek.cloud.f */
final class C4014f extends Handler {

    /* renamed from: a */
    final /* synthetic */ SpeechRecognizer.C3970a f16391a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4014f(SpeechRecognizer.C3970a aVar, Looper looper) {
        super(looper);
        this.f16391a = aVar;
    }

    public void handleMessage(Message message) {
        boolean z = true;
        if (this.f16391a.f16247b != null) {
            switch (message.what) {
                case 0:
                    this.f16391a.f16247b.onError((SpeechError) message.obj);
                    break;
                case 1:
                    this.f16391a.f16247b.onVolumeChanged(message.arg1);
                    break;
                case 2:
                    this.f16391a.f16247b.onBeginOfSpeech();
                    break;
                case 3:
                    this.f16391a.f16247b.onEndOfSpeech();
                    break;
                case 4:
                    RecognizerListener b = this.f16391a.f16247b;
                    RecognizerResult recognizerResult = (RecognizerResult) message.obj;
                    if (message.arg1 != 1) {
                        z = false;
                    }
                    b.onResult(recognizerResult, z);
                    break;
                case 6:
                    Message message2 = (Message) message.obj;
                    this.f16391a.f16247b.onEvent(message2.what, message2.arg1, message2.arg2, (Bundle) message2.obj);
                    break;
            }
            super.handleMessage(message);
        }
    }
}
