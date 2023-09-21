package p018cn.sharesdk.framework.authorize;

import android.app.Instrumentation;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.authorize.i */
class C0630i extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0629h f1505a;

    C0630i(C0629h hVar) {
        this.f1505a = hVar;
    }

    public void run() {
        try {
            new Instrumentation().sendKeyDownUpSync(4);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            AuthorizeListener authorizeListener = this.f1505a.f1504a.f1486a.getAuthorizeListener();
            if (authorizeListener != null) {
                authorizeListener.onCancel();
            }
            this.f1505a.f1504a.finish();
        }
    }
}
