package p018cn.sharesdk.facebook;

import android.os.Bundle;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.authorize.SSOListener;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.facebook.e */
class C0608e implements SSOListener {

    /* renamed from: a */
    final /* synthetic */ AuthorizeListener f1458a;

    /* renamed from: b */
    final /* synthetic */ C0607d f1459b;

    C0608e(C0607d dVar, AuthorizeListener authorizeListener) {
        this.f1459b = dVar;
        this.f1458a = authorizeListener;
    }

    public void onCancel() {
        this.f1458a.onCancel();
    }

    public void onComplete(Bundle bundle) {
        this.f1458a.onComplete(bundle);
    }

    public void onFailed(Throwable th) {
        C0666e.m3838b(th);
        this.f1459b.mo2389b(this.f1458a);
    }
}
