package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.C0819c;
import com.android.volley.C0840s;
import com.android.volley.C0884y;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.android.volley.o */
/* compiled from: Request */
public abstract class C0833o<T> implements Comparable<C0833o<T>> {

    /* renamed from: a */
    private static final String f2188a = "UTF-8";

    /* renamed from: m */
    private static final long f2189m = 3000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0884y.C0885a f2190b;

    /* renamed from: c */
    private final int f2191c;

    /* renamed from: d */
    private final String f2192d;

    /* renamed from: e */
    private final int f2193e;

    /* renamed from: f */
    private final C0840s.C0841a f2194f;

    /* renamed from: g */
    private Integer f2195g;

    /* renamed from: h */
    private C0837q f2196h;

    /* renamed from: i */
    private boolean f2197i;

    /* renamed from: j */
    private boolean f2198j;

    /* renamed from: k */
    private boolean f2199k;

    /* renamed from: l */
    private long f2200l;

    /* renamed from: n */
    private C0880u f2201n;

    /* renamed from: o */
    private C0819c.C0820a f2202o;

    /* renamed from: p */
    private Object f2203p;

    /* renamed from: com.android.volley.o$a */
    /* compiled from: Request */
    public interface C0834a {

        /* renamed from: a */
        public static final int f2204a = -1;

        /* renamed from: b */
        public static final int f2205b = 0;

        /* renamed from: c */
        public static final int f2206c = 1;

        /* renamed from: d */
        public static final int f2207d = 2;

        /* renamed from: e */
        public static final int f2208e = 3;

        /* renamed from: f */
        public static final int f2209f = 4;

        /* renamed from: g */
        public static final int f2210g = 5;

        /* renamed from: h */
        public static final int f2211h = 6;

        /* renamed from: i */
        public static final int f2212i = 7;
    }

    /* renamed from: com.android.volley.o$b */
    /* compiled from: Request */
    public enum C0835b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0840s<T> mo3059a(C0830l lVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo3064b(T t);

    @Deprecated
    public C0833o(String str, C0840s.C0841a aVar) {
        this(-1, str, aVar);
    }

    public C0833o(int i, String str, C0840s.C0841a aVar) {
        C0884y.C0885a aVar2;
        if (C0884y.C0885a.f2332a) {
            aVar2 = new C0884y.C0885a();
        } else {
            aVar2 = null;
        }
        this.f2190b = aVar2;
        this.f2197i = true;
        this.f2198j = false;
        this.f2199k = false;
        this.f2200l = 0;
        this.f2202o = null;
        this.f2191c = i;
        this.f2192d = str;
        this.f2194f = aVar;
        mo3056a((C0880u) new C0823f());
        this.f2193e = mo3157c(str);
    }

    /* renamed from: a */
    public int mo3051a() {
        return this.f2191c;
    }

    /* renamed from: a */
    public C0833o<?> mo3057a(Object obj) {
        this.f2203p = obj;
        return this;
    }

    /* renamed from: b */
    public Object mo3062b() {
        return this.f2203p;
    }

    /* renamed from: c */
    public C0840s.C0841a mo3066c() {
        return this.f2194f;
    }

    /* renamed from: d */
    public int mo3068d() {
        return this.f2193e;
    }

    /* renamed from: c */
    private static int mo3157c(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    public C0833o<?> mo3056a(C0880u uVar) {
        this.f2201n = uVar;
        return this;
    }

    /* renamed from: a */
    public void mo3061a(String str) {
        if (C0884y.C0885a.f2332a) {
            this.f2190b.mo3159a(str, Thread.currentThread().getId());
        } else if (this.f2200l == 0) {
            this.f2200l = SystemClock.elapsedRealtime();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3065b(String str) {
        if (this.f2196h != null) {
            this.f2196h.mo3097b(this);
        }
        if (C0884y.C0885a.f2332a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C0836p(this, str, id));
                return;
            }
            this.f2190b.mo3159a(str, id);
            this.f2190b.mo3158a(toString());
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2200l;
        if (elapsedRealtime >= f2189m) {
            C0884y.m4878b("%d ms: %s", Long.valueOf(elapsedRealtime), toString());
        }
    }

    /* renamed from: a */
    public C0833o<?> mo3055a(C0837q qVar) {
        this.f2196h = qVar;
        return this;
    }

    /* renamed from: a */
    public final C0833o<?> mo3053a(int i) {
        this.f2195g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: e */
    public final int mo3069e() {
        if (this.f2195g != null) {
            return this.f2195g.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    /* renamed from: f */
    public String mo3070f() {
        return this.f2192d;
    }

    /* renamed from: g */
    public String mo3071g() {
        return mo3070f();
    }

    /* renamed from: a */
    public C0833o<?> mo3054a(C0819c.C0820a aVar) {
        this.f2202o = aVar;
        return this;
    }

    /* renamed from: h */
    public C0819c.C0820a mo3072h() {
        return this.f2202o;
    }

    /* renamed from: i */
    public void mo3073i() {
        this.f2198j = true;
    }

    /* renamed from: j */
    public boolean mo3074j() {
        return this.f2198j;
    }

    /* renamed from: k */
    public Map<String, String> mo3075k() throws C0817a {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: l */
    public Map<String, String> mo3076l() throws C0817a {
        return mo3080p();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: m */
    public String mo3077m() {
        return mo3081q();
    }

    @Deprecated
    /* renamed from: n */
    public String mo3078n() {
        return mo3082r();
    }

    @Deprecated
    /* renamed from: o */
    public byte[] mo3079o() throws C0817a {
        Map<String, String> l = mo3076l();
        if (l == null || l.size() <= 0) {
            return null;
        }
        return m4677a(l, mo3077m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Map<String, String> mo3080p() throws C0817a {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo3081q() {
        return "UTF-8";
    }

    /* renamed from: r */
    public String mo3082r() {
        return "application/x-www-form-urlencoded; charset=" + mo3081q();
    }

    /* renamed from: s */
    public byte[] mo3083s() throws C0817a {
        Map<String, String> p = mo3080p();
        if (p == null || p.size() <= 0) {
            return null;
        }
        return m4677a(p, mo3081q());
    }

    /* renamed from: a */
    private byte[] m4677a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                sb.append(URLEncoder.encode((String) next.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode((String) next.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: a */
    public final C0833o<?> mo3058a(boolean z) {
        this.f2197i = z;
        return this;
    }

    /* renamed from: t */
    public final boolean mo3084t() {
        return this.f2197i;
    }

    /* renamed from: u */
    public C0835b mo3086u() {
        return C0835b.NORMAL;
    }

    /* renamed from: v */
    public final int mo3087v() {
        return this.f2201n.mo3039a();
    }

    /* renamed from: w */
    public C0880u mo3088w() {
        return this.f2201n;
    }

    /* renamed from: x */
    public void mo3089x() {
        this.f2199k = true;
    }

    /* renamed from: y */
    public boolean mo3090y() {
        return this.f2199k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0883x mo3060a(C0883x xVar) {
        return xVar;
    }

    /* renamed from: b */
    public void mo3063b(C0883x xVar) {
        if (this.f2194f != null) {
            this.f2194f.mo3102a(xVar);
        }
    }

    /* renamed from: a */
    public int compareTo(C0833o<T> oVar) {
        C0835b u = mo3086u();
        C0835b u2 = oVar.mo3086u();
        return u == u2 ? this.f2195g.intValue() - oVar.f2195g.intValue() : u2.ordinal() - u.ordinal();
    }

    public String toString() {
        return (this.f2198j ? "[X] " : "[ ] ") + mo3070f() + " " + ("0x" + Integer.toHexString(mo3068d())) + " " + mo3086u() + " " + this.f2195g;
    }
}
