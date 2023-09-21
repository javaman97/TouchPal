package p018cn.sharesdk.wechat.friends;

import android.os.Bundle;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;

/* renamed from: cn.sharesdk.wechat.friends.a */
class C0698a implements AuthorizeListener {

    /* renamed from: a */
    final /* synthetic */ Wechat f1693a;

    C0698a(Wechat wechat) {
        this.f1693a = wechat;
    }

    public void onCancel() {
        if (this.f1693a.listener != null) {
            this.f1693a.listener.onCancel(this.f1693a, 1);
        }
    }

    public void onComplete(Bundle bundle) {
        this.f1693a.afterRegister(1, (Object) null);
    }

    public void onError(Throwable th) {
        if (this.f1693a.listener != null) {
            this.f1693a.listener.onError(this.f1693a, 1, th);
        }
    }
}
