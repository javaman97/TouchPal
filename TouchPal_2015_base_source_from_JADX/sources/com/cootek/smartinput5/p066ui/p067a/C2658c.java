package com.cootek.smartinput5.p066ui.p067a;

import com.cootek.smartinput5.presentations.C2503g;
import com.cootek.smartinput5.presentations.p064a.C2490b;

/* renamed from: com.cootek.smartinput5.ui.a.c */
/* compiled from: ExtensionPointType */
public enum C2658c {
    MORE_PANEL(C2490b.class),
    QUICK_SETTING_PANEL(C2490b.class),
    SKIN_PANEL(C2490b.class),
    FUNCTION_BAR_PLUGIN_LIST(C2490b.class);
    

    /* renamed from: e */
    private C2503g.C2504a f11977e;

    private C2658c(Class<?> cls) {
        this.f11977e = null;
        try {
            this.f11977e = (C2503g.C2504a) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public C2503g.C2504a mo8892a() {
        return this.f11977e;
    }
}
