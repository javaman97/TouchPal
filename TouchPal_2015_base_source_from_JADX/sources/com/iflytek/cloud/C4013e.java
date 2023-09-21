package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.speech.RecognizerListener;
import com.iflytek.speech.RecognizerResult;

/* renamed from: com.iflytek.cloud.e */
final class C4013e extends RecognizerListener.Stub {

    /* renamed from: a */
    final /* synthetic */ SpeechRecognizer f16389a;

    /* renamed from: b */
    final /* synthetic */ SpeechRecognizer.C3970a f16390b;

    C4013e(SpeechRecognizer.C3970a aVar, SpeechRecognizer speechRecognizer) {
        this.f16390b = aVar;
        this.f16389a = speechRecognizer;
    }

    public void onBeginOfSpeech() throws RemoteException {
        this.f16390b.f16249d.sendMessage(this.f16390b.f16249d.obtainMessage(2));
    }

    public void onEndOfSpeech() throws RemoteException {
        this.f16390b.f16249d.sendMessage(this.f16390b.f16249d.obtainMessage(3));
    }

    public void onError(int i) throws RemoteException {
        this.f16390b.f16249d.sendMessage(this.f16390b.f16249d.obtainMessage(0, new SpeechError(i)));
    }

    public void onEvent(int i, int i2, int i3, Bundle bundle) throws RemoteException {
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        message.arg2 = i3;
        message.obj = bundle;
        this.f16390b.f16249d.sendMessage(this.f16390b.f16249d.obtainMessage(6, 0, 0, message));
    }

    public void onResult(RecognizerResult recognizerResult, boolean z) throws RemoteException {
        int i = 1;
        Handler a = this.f16390b.f16249d;
        if (!z) {
            i = 0;
        }
        this.f16390b.f16249d.sendMessage(a.obtainMessage(4, i, 0, new RecognizerResult(recognizerResult.getResultString())));
    }

    public void onVolumeChanged(int i) throws RemoteException {
        this.f16390b.f16249d.sendMessage(this.f16390b.f16249d.obtainMessage(1, i, 0, (Object) null));
    }
}
