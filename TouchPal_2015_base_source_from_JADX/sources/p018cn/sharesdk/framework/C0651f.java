package p018cn.sharesdk.framework;

import p018cn.sharesdk.framework.authorize.AuthorizeHelper;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.authorize.C0625e;
import p018cn.sharesdk.framework.authorize.C0626f;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.authorize.SSOListener;

/* renamed from: cn.sharesdk.framework.f */
public abstract class C0651f implements AuthorizeHelper {

    /* renamed from: a */
    protected Platform f1589a;

    /* renamed from: b */
    private AuthorizeListener f1590b;

    /* renamed from: c */
    private SSOListener f1591c;

    public C0651f(Platform platform) {
        this.f1589a = platform;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2388a(SSOListener sSOListener) {
        this.f1591c = sSOListener;
        C0625e eVar = new C0625e();
        eVar.mo2261a(sSOListener);
        eVar.mo2255a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2389b(AuthorizeListener authorizeListener) {
        this.f1590b = authorizeListener;
        C0627g gVar = new C0627g();
        gVar.mo2264a(this.f1590b);
        gVar.mo2255a(this);
    }

    /* renamed from: c */
    public int mo2390c() {
        return this.f1589a.getPlatformId();
    }

    public AuthorizeListener getAuthorizeListener() {
        return this.f1590b;
    }

    public Platform getPlatform() {
        return this.f1589a;
    }

    public SSOListener getSSOListener() {
        return this.f1591c;
    }

    public C0626f getSSOProcessor(C0625e eVar) {
        return null;
    }
}
