package com.cootek.smartinput5.func.smileypanel.p057b.p059b;

import android.text.TextUtils;
import com.cootek.smartinput5.func.smileypanel.C2043d;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.b.g */
/* compiled from: SelectedCategory */
public enum C2028g {
    people(C2024c.class),
    nature(C2022a.class),
    objects(C2023b.class),
    places(C2025d.class),
    symbols(C2027f.class),
    f7049f(C2026e.class);
    

    /* renamed from: g */
    private final Class<?> f7051g;

    private C2028g(Class<?> cls) {
        this.f7051g = cls;
    }

    /* renamed from: a */
    public Class<?> mo7379a() {
        return this.f7051g;
    }

    /* renamed from: a */
    public static C2043d m9345a(String str) {
        Class<?> cls;
        C2028g[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            C2028g gVar = values[i];
            if (TextUtils.equals(gVar.toString(), str)) {
                cls = gVar.mo7379a();
                break;
            }
            i++;
        }
        if (cls == null && TextUtils.isEmpty(str)) {
            cls = people.mo7379a();
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
