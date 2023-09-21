package com.facebook.ads.internal.p077h;

import com.facebook.ads.internal.p071b.C3390a;
import com.facebook.ads.internal.p074e.C3401d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.h.e */
public class C3435e {

    /* renamed from: a */
    private static Map<String, Long> f14968a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<String, Long> f14969b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<String, String> f14970c = new ConcurrentHashMap();

    /* renamed from: a */
    private static long m15050a(String str, C3390a aVar) {
        if (f14968a.containsKey(str)) {
            return f14968a.get(str).longValue();
        }
        switch (aVar) {
            case BANNER:
                return 15000;
            default:
                return -1000;
        }
    }

    /* renamed from: a */
    public static void m15051a(long j, C3401d dVar) {
        f14968a.put(m15056d(dVar), Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m15052a(String str, C3401d dVar) {
        f14970c.put(m15056d(dVar), str);
    }

    /* renamed from: a */
    public static boolean m15053a(C3401d dVar) {
        String d = m15056d(dVar);
        if (!f14969b.containsKey(d)) {
            return false;
        }
        return System.currentTimeMillis() - f14969b.get(d).longValue() < m15050a(d, dVar.mo10697b());
    }

    /* renamed from: b */
    public static void m15054b(C3401d dVar) {
        f14969b.put(m15056d(dVar), Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: c */
    public static String m15055c(C3401d dVar) {
        return f14970c.get(m15056d(dVar));
    }

    /* renamed from: d */
    private static String m15056d(C3401d dVar) {
        int i = 0;
        Object[] objArr = new Object[6];
        objArr[0] = dVar.mo10696a();
        objArr[1] = dVar.mo10697b();
        objArr[2] = dVar.f14843i;
        objArr[3] = Integer.valueOf(dVar.mo10698c() == null ? 0 : dVar.mo10698c().mo10841b());
        if (dVar.mo10698c() != null) {
            i = dVar.mo10698c().mo10840a();
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = Integer.valueOf(dVar.mo10699d());
        return String.format("%s:%s:%s:%d:%d:%d", objArr);
    }
}
