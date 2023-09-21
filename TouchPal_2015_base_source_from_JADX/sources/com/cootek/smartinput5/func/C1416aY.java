package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.func.C1356N;
import com.cootek.smartinput5.p048d.C1246d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.aY */
/* compiled from: PromotionAppManager */
public class C1416aY implements C1356N.C1357a {

    /* renamed from: a */
    public static int f4530a = 0;

    /* renamed from: b */
    public static int f4531b = 1;

    /* renamed from: c */
    public static String f4532c = "Papaya";

    /* renamed from: d */
    public static String f4533d = "NativeAds";

    /* renamed from: e */
    public static final String[] f4534e = {f4532c, f4533d};

    /* renamed from: f */
    private static final String f4535f = "PromotionAppManager";

    /* renamed from: g */
    private static Map<String, C1417a> f4536g;

    /* renamed from: h */
    private static C1416aY f4537h;

    /* renamed from: com.cootek.smartinput5.func.aY$a */
    /* compiled from: PromotionAppManager */
    private static class C1417a {

        /* renamed from: a */
        int f4538a;

        /* renamed from: b */
        String f4539b;

        public C1417a(int i, String str) {
            this.f4538a = i;
            this.f4539b = str;
        }
    }

    private C1416aY() {
        f4536g = new HashMap();
        C1356N.m6227a().mo5755a((C1356N.C1357a) this);
    }

    /* renamed from: a */
    private static void m6653a() {
        if (f4537h == null) {
            f4537h = new C1416aY();
        }
    }

    /* renamed from: a */
    public static void m6654a(String str, String str2) {
        m6653a();
        if (m6655c(str) && f4536g.get(str2) == null) {
            f4536g.put(str2, new C1417a(f4530a, str));
        }
    }

    /* renamed from: a */
    public void mo5759a(String str) {
        m6653a();
        C1417a aVar = f4536g.get(str);
        if (aVar != null && aVar.f4538a == f4530a) {
            aVar.f4538a = f4531b;
            f4536g.put(str, aVar);
            Context b = C1368X.m6313b();
            if (b != null && f4533d.equals(aVar.f4539b)) {
                C1246d.m6010a(b).mo4591a("NATIVE_ADS/INSTALL", str, C1246d.f3933e);
            }
        }
    }

    /* renamed from: b */
    public void mo5760b(String str) {
    }

    /* renamed from: c */
    private static boolean m6655c(String str) {
        for (String equals : f4534e) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
