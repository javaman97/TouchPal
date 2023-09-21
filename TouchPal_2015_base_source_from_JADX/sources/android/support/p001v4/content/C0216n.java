package android.support.p001v4.content;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: android.support.v4.content.n */
/* compiled from: LocalBroadcastManager */
class C0216n extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0213m f555a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0216n(C0213m mVar, Looper looper) {
        super(looper);
        this.f555a = mVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.f555a.m883a();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
