package p018cn.sharesdk.framework.authorize;

import android.os.Message;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.utils.C0663b;
import p018cn.sharesdk.framework.utils.UIHandler;

/* renamed from: cn.sharesdk.framework.authorize.j */
class C0631j extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0627g f1506a;

    C0631j(C0627g gVar) {
        this.f1506a = gVar;
    }

    public void run() {
        if ("none".equals(new C0663b(this.f1506a.activity).mo2483l())) {
            UIHandler.sendEmptyMessage(2, this.f1506a);
            return;
        }
        if (ShareSDK.isRemoveCookieOnAuthorize()) {
            CookieSyncManager.createInstance(this.f1506a.activity);
            CookieManager.getInstance().removeAllCookie();
        }
        Message message = new Message();
        message.what = 2;
        message.obj = this.f1506a.f1486a.getAuthorizeUrl();
        UIHandler.sendMessage(message, this.f1506a);
    }
}
