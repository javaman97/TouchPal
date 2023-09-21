package p018cn.sharesdk.framework.p020b.p022b;

import android.content.Context;
import android.text.TextUtils;
import com.p023a.p024a.p032b.p037d.C0781a;
import p018cn.sharesdk.framework.p020b.p021a.C0636c;

/* renamed from: cn.sharesdk.framework.b.b.e */
public class C0644e extends C0642c {

    /* renamed from: b */
    private static int f1561b;

    /* renamed from: c */
    private static long f1562c;

    /* renamed from: a */
    public long f1563a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[EXT]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1562c = j;
    }

    /* renamed from: a */
    public boolean mo2318a(Context context) {
        C0636c a = C0636c.m3622a(context);
        f1561b = a.mo2296b("insertExitEventCount");
        f1562c = a.mo2292a("lastInsertExitEventTime");
        return super.mo2318a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2312b() {
        return C0781a.f1973a;
    }

    /* renamed from: b */
    public void mo2319b(Context context) {
        super.mo2319b(context);
        C0636c a = C0636c.m3622a(context);
        a.mo2294a("lastInsertExitEventTime", Long.valueOf(f1562c));
        a.mo2293a("insertExitEventCount", f1561b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2313c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo2314d() {
        return (long) f1561b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1562c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1561b++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1555m)) {
            sb.append(this.f1555m);
        }
        sb.append('|').append(this.f1563a / 1000);
        return sb.toString();
    }
}
