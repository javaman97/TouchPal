package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.p076g.C3416a;
import com.facebook.ads.internal.p077h.C3457w;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.adapters.l */
public class C3373l {

    /* renamed from: a */
    private static final Set<C3376n> f14700a = new HashSet();

    /* renamed from: b */
    private static final Map<C3416a, String> f14701b = new ConcurrentHashMap();

    static {
        Class<C3362b> cls;
        for (C3376n nVar : C3376n.values()) {
            switch (nVar.f14713g) {
                case BANNER:
                    cls = C3362b.class;
                    break;
                case INTERSTITIAL:
                    cls = C3365e.class;
                    break;
                case NATIVE:
                    cls = C3351A.class;
                    break;
                default:
                    cls = null;
                    break;
            }
            if (cls != null) {
                Class<?> cls2 = nVar.f14710d;
                if (cls2 == null) {
                    try {
                        cls2 = Class.forName(nVar.f14711e);
                    } catch (ClassNotFoundException e) {
                    }
                }
                if (cls2 != null && cls.isAssignableFrom(cls2)) {
                    f14700a.add(nVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static C3353a m14832a(C3375m mVar, C3416a aVar) {
        try {
            C3376n b = m14835b(mVar, aVar);
            if (b != null && f14700a.contains(b)) {
                Class<?> cls = b.f14710d;
                if (cls == null) {
                    cls = Class.forName(b.f14711e);
                }
                return (C3353a) cls.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static C3353a m14833a(String str, C3416a aVar) {
        return m14832a(C3375m.m14836a(str), aVar);
    }

    /* renamed from: a */
    public static String m14834a(C3416a aVar) {
        if (f14701b.containsKey(aVar)) {
            return f14701b.get(aVar);
        }
        HashSet hashSet = new HashSet();
        for (C3376n next : f14700a) {
            if (next.f14713g == aVar) {
                hashSet.add(next.f14712f.toString());
            }
        }
        String a = C3457w.m15105a(hashSet, ",");
        f14701b.put(aVar, a);
        return a;
    }

    /* renamed from: b */
    private static C3376n m14835b(C3375m mVar, C3416a aVar) {
        for (C3376n next : f14700a) {
            if (next.f14712f == mVar && next.f14713g == aVar) {
                return next;
            }
        }
        return null;
    }
}
