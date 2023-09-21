package com.cootek.smartinput5.presentations;

import com.cootek.smartinput5.presentations.C2503g;
import com.cootek.smartinput5.presentations.p064a.C2487a;

/* renamed from: com.cootek.smartinput5.presentations.h */
/* compiled from: ConditionType */
public enum C2506h {
    EXTENSION(C2510l.class),
    GUIDE_POINT_HODLER(C2512n.class),
    GUIDE_POINT_SELF(C2513o.class);
    

    /* renamed from: d */
    private static final C2487a f10811d = null;

    /* renamed from: e */
    private C2503g.C2505b f10813e;

    static {
        f10811d = new C2487a();
    }

    private C2506h(Class<?> cls) {
        this.f10813e = null;
        try {
            this.f10813e = (C2503g.C2505b) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public boolean mo8304a(String str, String str2) {
        C2503g.C2504a a;
        C2487a.C2489a a2 = f10811d.mo8295a(str, str2);
        if (a2 != null && a2.mo8296a()) {
            return a2.mo8297b();
        }
        if (this.f10813e == null || (a = this.f10813e.mo8303a(str)) == null) {
            return false;
        }
        return a.mo8293a(str);
    }
}
