package p018cn.sharesdk.wechat.moments;

import android.os.Bundle;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;

/* renamed from: cn.sharesdk.wechat.moments.a */
class C0699a implements AuthorizeListener {

    /* renamed from: a */
    final /* synthetic */ WechatMoments f1696a;

    C0699a(WechatMoments wechatMoments) {
        this.f1696a = wechatMoments;
    }

    public void onCancel() {
        if (this.f1696a.listener != null) {
            this.f1696a.listener.onCancel(this.f1696a, 1);
        }
    }

    public void onComplete(Bundle bundle) {
        this.f1696a.afterRegister(1, (Object) null);
    }

    public void onError(Throwable th) {
        if (this.f1696a.listener != null) {
            this.f1696a.listener.onError(this.f1696a, 1, th);
        }
    }
}
