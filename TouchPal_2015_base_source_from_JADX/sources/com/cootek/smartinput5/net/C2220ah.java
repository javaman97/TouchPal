package com.cootek.smartinput5.net;

import com.cootek.smartinput5.func.component.C1658S;
import java.util.TimeZone;

/* renamed from: com.cootek.smartinput5.net.ah */
/* compiled from: UpdateCheckerBase */
public abstract class C2220ah implements C1658S {

    /* renamed from: a */
    private static final int f9383a = 1440;

    /* renamed from: b */
    private static final int f9384b = 60;

    /* renamed from: c */
    private long f9385c;

    /* renamed from: d */
    private C2221a f9386d;

    /* renamed from: com.cootek.smartinput5.net.ah$a */
    /* compiled from: UpdateCheckerBase */
    public interface C2221a {
        /* renamed from: a */
        void mo6522a(C2220ah ahVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo6450a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6452a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract float mo6455b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo6456c();

    public C2220ah(C2221a aVar) {
        this.f9386d = aVar;
    }

    /* renamed from: a */
    public void mo7750a(C2221a aVar) {
        this.f9386d = aVar;
    }

    /* renamed from: b */
    private static long m10028b(long j) {
        return (((long) TimeZone.getDefault().getRawOffset()) + j) / 1000;
    }

    /* renamed from: a */
    protected static int m10027a(long j) {
        return (int) (m10028b(j) / 60);
    }

    /* renamed from: e */
    private int mo6457e() {
        return m10027a(this.f9385c);
    }

    /* renamed from: h */
    public boolean mo6479h() {
        return mo7751b(false);
    }

    /* renamed from: b */
    public boolean mo7751b(boolean z) {
        this.f9385c = System.currentTimeMillis();
        long a = (long) mo6450a();
        int e = mo6457e();
        float b = mo6455b();
        if (b == -1.0f) {
            mo7753j();
            return false;
        }
        int i = (int) (b * 1440.0f);
        if (i <= 0) {
            i = f9383a;
        }
        if (!z) {
            if (((long) (e + i)) < a) {
                mo6452a(i + e);
            }
            if (((long) e) < a) {
                mo7753j();
                return false;
            }
        }
        mo6456c();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo7752i() {
        int e = mo6457e();
        int b = (int) (mo6455b() * 1440.0f);
        if (b <= 0) {
            b = f9383a;
        }
        mo6452a(b + e);
        mo7753j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6538f() {
        mo7753j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7753j() {
        if (this.f9386d != null) {
            this.f9386d.mo6522a(this);
        }
    }

    /* renamed from: a_ */
    public boolean mo6478a_() {
        return true;
    }
}
