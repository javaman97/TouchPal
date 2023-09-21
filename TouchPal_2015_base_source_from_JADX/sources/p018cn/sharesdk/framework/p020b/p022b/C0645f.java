package p018cn.sharesdk.framework.p020b.p022b;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.cootek.p042a.p043a.C0911j;
import com.p023a.p024a.p032b.p037d.C0781a;
import java.util.ArrayList;
import java.util.HashMap;
import p018cn.sharesdk.framework.utils.C0662a;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.framework.b.b.f */
public class C0645f extends C0642c {

    /* renamed from: p */
    private static int f1564p;

    /* renamed from: q */
    private static long f1565q;

    /* renamed from: a */
    public int f1566a;

    /* renamed from: b */
    public String f1567b;

    /* renamed from: c */
    public String f1568c;

    /* renamed from: d */
    public String f1569d = "";

    /* renamed from: n */
    public C0646a f1570n = new C0646a();

    /* renamed from: o */
    public String f1571o;

    /* renamed from: cn.sharesdk.framework.b.b.f$a */
    public static class C0646a {

        /* renamed from: a */
        public String f1572a = "";

        /* renamed from: b */
        public String f1573b;

        /* renamed from: c */
        public ArrayList<String> f1574c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<String> f1575d = new ArrayList<>();

        /* renamed from: e */
        public ArrayList<String> f1576e = new ArrayList<>();

        /* renamed from: f */
        public ArrayList<Bitmap> f1577f = new ArrayList<>();

        /* renamed from: g */
        public HashMap<String, Object> f1578g;

        public String toString() {
            HashMap hashMap = new HashMap();
            hashMap.put("text", this.f1573b);
            hashMap.put("url", this.f1574c);
            if (this.f1575d != null && this.f1575d.size() > 0) {
                hashMap.put("imgs", this.f1575d);
            }
            if (this.f1578g != null) {
                hashMap.put("attch", new C0665d().mo2495a(this.f1578g));
            }
            return new C0665d().mo2495a((HashMap<String, Object>) hashMap);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo2310a() {
        return "[SHR]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2311a(long j) {
        f1565q = j;
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
        return (long) f1564p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo2315e() {
        return f1565q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo2316f() {
        f1564p++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append('|').append(this.f1566a);
        sb.append('|').append(this.f1567b);
        sb.append('|').append(TextUtils.isEmpty(this.f1568c) ? "" : this.f1568c);
        sb.append('|').append(this.f1569d);
        sb.append('|');
        if (this.f1570n != null) {
            try {
                String encodeToString = Base64.encodeToString(C0662a.m3785a(this.f1548f.substring(0, 16), this.f1570n.toString()), 0);
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
        if (!TextUtils.isEmpty(this.f1571o)) {
            try {
                String encodeToString2 = Base64.encodeToString(C0662a.m3785a(this.f1548f.substring(0, 16), this.f1571o), 0);
                if (encodeToString2.contains(C0911j.f2473c)) {
                    encodeToString2 = encodeToString2.replace(C0911j.f2473c, "");
                }
                sb.append(encodeToString2);
            } catch (Throwable th2) {
                C0666e.m3838b(th2);
            }
        }
        return sb.toString();
    }
}
