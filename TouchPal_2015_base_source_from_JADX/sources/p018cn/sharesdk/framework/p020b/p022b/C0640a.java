package p018cn.sharesdk.framework.p020b.p022b;

import com.p023a.p024a.p032b.p037d.C0781a;

/* renamed from: cn.sharesdk.framework.b.b.a */
public class C0640a extends C0642c {

    /* renamed from: c */
    private static int f1537c;

    /* renamed from: d */
    private static long f1538d;

    /* renamed from: a */
    public int f1539a;

    /* renamed from: b */
    public String f1540b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[API]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1538d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2312b() {
        return C0781a.f1973a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2313c() {
        return 50;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo2314d() {
        return (long) f1537c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1538d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1537c++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1539a);
        sb.append('|').append(this.f1540b);
        return sb.toString();
    }
}
