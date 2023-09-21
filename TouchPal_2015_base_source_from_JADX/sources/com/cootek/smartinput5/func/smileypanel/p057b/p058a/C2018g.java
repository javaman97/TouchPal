package com.cootek.smartinput5.func.smileypanel.p057b.p058a;

import android.text.TextUtils;
import com.cootek.smartinput5.func.smileypanel.C2043d;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.a.g */
/* compiled from: EmojiCategory */
public enum C2018g {
    people(C2014c.class),
    nature(C2012a.class),
    objects(C2013b.class),
    places(C2015d.class),
    symbols(C2017f.class),
    f7020f(C2016e.class);
    

    /* renamed from: g */
    private final Class<?> f7022g;

    private C2018g(Class<?> cls) {
        this.f7022g = cls;
    }

    /* renamed from: a */
    public Class<?> mo7368a() {
        return this.f7022g;
    }

    /* renamed from: a */
    public static C2043d m9323a(String str) {
        Class<?> cls;
        C2018g[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            C2018g gVar = values[i];
            if (TextUtils.equals(gVar.toString(), str)) {
                cls = gVar.mo7368a();
                break;
            }
            i++;
        }
        if (cls == null && TextUtils.isEmpty(str)) {
            cls = people.mo7368a();
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C2043d) cls.newInstance();
        } catch (InstantiationException e) {
            return null;
        } catch (IllegalAccessException e2) {
            return null;
        }
    }
}
