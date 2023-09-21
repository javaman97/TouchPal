package p018cn.sharesdk.framework.p020b.p022b;

import android.content.Context;
import android.text.TextUtils;
import com.p023a.p024a.p032b.p037d.C0781a;
import p018cn.sharesdk.framework.p020b.p021a.C0636c;

/* renamed from: cn.sharesdk.framework.b.b.g */
public class C0647g extends C0642c {

    /* renamed from: a */
    private static int f1579a;

    /* renamed from: b */
    private static long f1580b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[RUN]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1580b = j;
    }

    /* renamed from: a */
    public boolean mo2318a(Context context) {
        C0636c a = C0636c.m3622a(context);
        f1579a = a.mo2296b("insertRunEventCount");
        f1580b = a.mo2292a("lastInsertRunEventTime");
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
        a.mo2294a("lastInsertRunEventTime", Long.valueOf(f1580b));
        a.mo2293a("insertRunEventCount", f1579a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo2313c() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public long mo2314d() {
        return (long) f1579a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1580b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1579a++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|');
        if (!TextUtils.isEmpty(this.f1555m)) {
            sb.append(this.f1555m);
        }
        return sb.toString();
    }
}
