package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.facebook.ads.internal.view.C3479c;

/* renamed from: com.facebook.ads.D */
public class C3327D {

    /* renamed from: com.facebook.ads.D$a */
    public enum C3328a {
        HEIGHT_100(-1, 100),
        HEIGHT_120(-1, 120),
        HEIGHT_300(-1, Settings.SUPER_DICT_DOWNLOADED),
        HEIGHT_400(-1, 400);
        

        /* renamed from: e */
        private final int f14583e;

        /* renamed from: f */
        private final int f14584f;

        private C3328a(int i, int i2) {
            this.f14583e = i;
            this.f14584f = i2;
        }

        /* renamed from: a */
        public int mo10525a() {
            return this.f14583e;
        }

        /* renamed from: b */
        public int mo10526b() {
            return this.f14584f;
        }
    }

    /* renamed from: a */
    public static View m14670a(Context context, C3509x xVar, C3328a aVar) {
        return m14671a(context, xVar, aVar, (C3329E) null);
    }

    /* renamed from: a */
    public static View m14671a(Context context, C3509x xVar, C3328a aVar, C3329E e) {
        if (e == null) {
            e = new C3329E();
        }
        return new C3479c(context, xVar, aVar, e);
    }
}
