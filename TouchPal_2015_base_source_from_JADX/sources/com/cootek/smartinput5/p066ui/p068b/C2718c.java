package com.cootek.smartinput5.p066ui.p068b;

import com.cootek.smartinput5.presentations.C2498b;
import com.cootek.smartinput5.presentations.C2503g;

/* renamed from: com.cootek.smartinput5.ui.b.c */
/* compiled from: GuidePointLocation */
public enum C2718c {
    ;
    

    /* renamed from: a */
    private C2498b f12151a;

    private C2718c(Class<? extends C2503g.C2504a> cls) {
        this.f12151a = null;
        try {
            this.f12151a = (C2498b) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public C2498b mo8988a() {
        return this.f12151a;
    }
}
