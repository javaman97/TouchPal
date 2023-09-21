package com.cootek.smartinput5.func.p052b;

import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.b.aM */
/* compiled from: LanguageAttr */
public enum C1511aM {
    is_chs,
    support_google_voice,
    support_wave,
    support_adjust_priority,
    has_dictionary,
    support_compound_word;
    

    /* renamed from: g */
    private ArrayList<C1550c> f4751g;

    /* renamed from: com.cootek.smartinput5.func.b.aM$a */
    /* compiled from: LanguageAttr */
    public interface C1512a {
        /* renamed from: a */
        void mo6170a(int i);

        /* renamed from: d */
        C1521aV mo6148d();

        /* renamed from: e */
        boolean mo6144e();

        /* renamed from: f */
        boolean mo6171f();

        /* renamed from: g */
        boolean mo6172g();

        /* renamed from: h */
        boolean mo6164h();

        /* renamed from: i */
        boolean mo6145i();

        /* renamed from: j */
        boolean mo6173j();

        /* renamed from: k */
        boolean mo6143k();

        /* renamed from: l */
        int mo6174l();
    }

    /* renamed from: a */
    public boolean mo6169a(C1512a aVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6168a(C1550c cVar) {
        if (!this.f4751g.contains(cVar)) {
            this.f4751g.add(cVar);
        }
    }

    /* renamed from: a */
    public ArrayList<C1550c> mo6167a() {
        return this.f4751g;
    }

    /* renamed from: b */
    public static void m6924b(C1550c cVar) {
        int i = 0;
        for (C1511aM aMVar : values()) {
            if (aMVar.mo6169a((C1512a) cVar)) {
                aMVar.mo6168a(cVar);
                i |= 1 << aMVar.ordinal();
            }
        }
        cVar.mo6170a(i);
    }

    /* renamed from: a */
    public static boolean m6923a(C1511aM aMVar, C1512a aVar) {
        return (aVar.mo6174l() & aMVar.ordinal()) == 1;
    }
}
