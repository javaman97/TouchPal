package p018cn.sharesdk.framework.authorize;

import android.content.Intent;

/* renamed from: cn.sharesdk.framework.authorize.e */
public class C0625e extends C0621a {

    /* renamed from: b */
    protected SSOListener f1494b;

    /* renamed from: c */
    private C0626f f1495c;

    /* renamed from: a */
    public void mo2261a(SSOListener sSOListener) {
        this.f1494b = sSOListener;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f1495c.mo2051a(i, i2, intent);
    }

    public void onCreate() {
        this.f1495c = this.f1486a.getSSOProcessor(this);
        if (this.f1495c == null) {
            finish();
            AuthorizeListener authorizeListener = this.f1486a.getAuthorizeListener();
            if (authorizeListener != null) {
                authorizeListener.onError(new Throwable("Failed to start SSO for " + this.f1486a.getPlatform().getName()));
                return;
            }
            return;
        }
        this.f1495c.mo2262a(32973);
        this.f1495c.mo2050a();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        this.f1495c.mo2263a(intent);
    }
}
