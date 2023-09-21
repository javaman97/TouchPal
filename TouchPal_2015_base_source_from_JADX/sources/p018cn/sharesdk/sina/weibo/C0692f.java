package p018cn.sharesdk.sina.weibo;

import android.os.Bundle;
import com.weibo.net.C4057s;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.authorize.SSOListener;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.sina.weibo.f */
class C0692f implements SSOListener {

    /* renamed from: a */
    final /* synthetic */ AuthorizeListener f1677a;

    /* renamed from: b */
    final /* synthetic */ C0691e f1678b;

    C0692f(C0691e eVar, AuthorizeListener authorizeListener) {
        this.f1678b = eVar;
        this.f1677a = authorizeListener;
    }

    public void onCancel() {
        this.f1677a.onCancel();
    }

    public void onComplete(Bundle bundle) {
        try {
            Long.parseLong(bundle.getString(C4057s.f16527i));
            this.f1677a.onComplete(bundle);
        } catch (Throwable th) {
            onFailed(th);
        }
    }

    public void onFailed(Throwable th) {
        C0666e.m3838b(th);
        this.f1678b.mo2389b(this.f1677a);
    }
}
