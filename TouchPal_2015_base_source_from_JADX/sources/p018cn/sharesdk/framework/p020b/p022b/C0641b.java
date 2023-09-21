package p018cn.sharesdk.framework.p020b.p022b;

import android.text.TextUtils;
import android.util.Base64;
import com.cootek.p042a.p043a.C0911j;
import com.p023a.p024a.p032b.p037d.C0781a;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b.b.b */
public class C0641b extends C0642c {

    /* renamed from: n */
    private static int f1541n;

    /* renamed from: o */
    private static long f1542o;

    /* renamed from: a */
    public int f1543a;

    /* renamed from: b */
    public String f1544b;

    /* renamed from: c */
    public String f1545c;

    /* renamed from: d */
    public String f1546d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[AUT]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1542o = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2312b() {
        return C0781a.f1973a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2313c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo2314d() {
        return (long) f1541n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1542o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1541n++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1543a);
        sb.append('|').append(this.f1544b);
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1546d)) {
            try {
                String encodeToString = Base64.encodeToString(C0662a.m3785a(this.f1548f.substring(0, 16), this.f1546d), 0);
                if (encodeToString.contains(C0911j.f2473c)) {
                    encodeToString = encodeToString.replace(C0911j.f2473c, "");
                }
                sb.append(encodeToString);
            } catch (Throwable th) {
                C0666e.m3838b(th);
            }
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1555m)) {
            sb.append(this.f1555m);
        }
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1545c)) {
            sb.append(this.f1545c);
        }
        return sb.toString();
    }
}
