package p018cn.sharesdk.framework.authorize;

import android.content.Intent;

/* renamed from: cn.sharesdk.framework.authorize.f */
public abstract class C0626f {

    /* renamed from: a */
    protected C0625e f1496a;

    /* renamed from: b */
    protected int f1497b;

    /* renamed from: c */
    protected SSOListener f1498c;

    public C0626f(C0625e eVar) {
        this.f1496a = eVar;
        this.f1498c = eVar.mo2254a().getSSOListener();
    }

    /* renamed from: a */
    public abstract void mo2050a();

    /* renamed from: a */
    public void mo2262a(int i) {
        this.f1497b = i;
    }

    /* renamed from: a */
    public void mo2051a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2263a(Intent intent) {
    }
}
