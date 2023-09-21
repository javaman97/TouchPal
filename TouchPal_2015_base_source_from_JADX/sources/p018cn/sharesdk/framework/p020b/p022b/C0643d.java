package p018cn.sharesdk.framework.p020b.p022b;

import com.p023a.p024a.p032b.p037d.C0781a;

/* renamed from: cn.sharesdk.framework.b.b.d */
public class C0643d extends C0642c {

    /* renamed from: d */
    private static int f1556d;

    /* renamed from: n */
    private static long f1557n;

    /* renamed from: a */
    public String f1558a;

    /* renamed from: b */
    public int f1559b;

    /* renamed from: c */
    public String f1560c = "";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[EVT]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1557n = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2312b() {
        return C0781a.f1973a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2313c() {
        return 30;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo2314d() {
        return (long) f1556d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1557n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1556d++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1558a);
        sb.append('|').append(this.f1559b);
        sb.append('|').append(this.f1560c);
        return sb.toString();
    }
}
