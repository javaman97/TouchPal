package p018cn.sharesdk.framework.p020b.p022b;

import android.content.Context;

/* renamed from: cn.sharesdk.framework.b.b.c */
public abstract class C0642c {

    /* renamed from: e */
    public long f1547e;

    /* renamed from: f */
    public String f1548f;

    /* renamed from: g */
    public String f1549g;

    /* renamed from: h */
    public String f1550h;

    /* renamed from: i */
    public int f1551i;

    /* renamed from: j */
    public String f1552j;

    /* renamed from: k */
    public int f1553k;

    /* renamed from: l */
    public String f1554l;

    /* renamed from: m */
    public String f1555m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo2310a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2311a(long j);

    /* renamed from: a */
    public boolean mo2318a(Context context) {
        int b = mo2312b();
        int c = mo2313c();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mo2315e() < ((long) b)) {
            return mo2314d() < ((long) c);
        }
        mo2311a(currentTimeMillis);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2312b();

    /* renamed from: b */
    public void mo2319b(Context context) {
        mo2316f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo2313c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo2314d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract long mo2315e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo2316f();

    /* renamed from: g */
    public String mo2320g() {
        return this.f1549g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo2310a()).append(':');
        sb.append(this.f1547e).append('|');
        sb.append(this.f1548f).append('|');
        sb.append(this.f1549g).append('|');
        sb.append(this.f1550h).append('|');
        sb.append(this.f1551i).append('|');
        sb.append(this.f1552j).append('|');
        sb.append(this.f1553k).append('|');
        sb.append(this.f1554l);
        return sb.toString();
    }
}
