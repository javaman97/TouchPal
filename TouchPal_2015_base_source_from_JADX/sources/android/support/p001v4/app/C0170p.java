package android.support.p001v4.app;

import android.os.Handler;
import android.os.Message;

/* renamed from: android.support.v4.app.p */
/* compiled from: FragmentActivity */
class C0170p extends Handler {

    /* renamed from: a */
    final /* synthetic */ C0167o f431a;

    C0170p(C0167o oVar) {
        this.f431a = oVar;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.f431a.mStopped) {
                    this.f431a.doReallyStop(false);
                    return;
                }
                return;
            case 2:
                this.f431a.onResumeFragments();
                this.f431a.mFragments.mo596j();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
