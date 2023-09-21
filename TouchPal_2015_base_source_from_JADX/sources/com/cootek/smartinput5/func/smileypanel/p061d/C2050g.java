package com.cootek.smartinput5.func.smileypanel.p061d;

import android.text.TextUtils;
import com.cootek.smartinput5.func.smileypanel.C2043d;

/* renamed from: com.cootek.smartinput5.func.smileypanel.d.g */
/* compiled from: EmotionCategory */
public enum C2050g {
    horizontal(C2046c.class),
    happy(C2045b.class),
    wired(C2049f.class),
    negative(C2048e.class),
    love(C2047d.class),
    art(C2044a.class);
    

    /* renamed from: g */
    private final Class<?> f7114g;

    private C2050g(Class<?> cls) {
        this.f7114g = cls;
    }

    /* renamed from: a */
    public Class<?> mo7411a() {
        return this.f7114g;
    }

    /* renamed from: a */
    public static C2043d m9403a(String str) {
        Class<?> cls;
        C2050g[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls = null;
                break;
            }
            C2050g gVar = values[i];
            if (TextUtils.equals(gVar.toString(), str)) {
                cls = gVar.mo7411a();
                break;
            }
            i++;
        }
        if (cls == null && TextUtils.isEmpty(str)) {
            cls = horizontal.mo7411a();
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
