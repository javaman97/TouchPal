package com.cootek.smartinput5.presentations;

import com.cootek.smartinput5.presentations.C2503g;
import com.cootek.smartinput5.presentations.p064a.C2491c;
import com.cootek.smartinput5.presentations.p064a.C2495g;
import com.cootek.smartinput5.presentations.p064a.C2496h;

/* renamed from: com.cootek.smartinput5.presentations.m */
/* compiled from: GeneralJudgeFactory */
public enum C2511m {
    GENERAL_SKIN(C2496h.class),
    GENERAL_SETTING(C2495g.class),
    DEFAULT(C2491c.class);
    

    /* renamed from: d */
    private C2503g.C2504a f10823d;

    private C2511m(Class<? extends C2503g.C2504a> cls) {
        try {
            this.f10823d = (C2503g.C2504a) cls.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public C2503g.C2504a mo8308a() {
        return this.f10823d;
    }
}
