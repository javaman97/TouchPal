package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.SharedPreferences;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.R */
/* compiled from: FeatureType */
public enum C1361R {
    AUTO,
    COMPACT,
    ECONOMIC,
    FULL;
    

    /* renamed from: e */
    private static C1361R f4223e;

    /* renamed from: com.cootek.smartinput5.func.R$a */
    /* compiled from: FeatureType */
    public interface C1362a {
        /* renamed from: a */
        int mo4416a();

        /* renamed from: b */
        int mo4417b();
    }

    /* renamed from: a */
    public abstract boolean mo5766a(int i, int i2);

    /* renamed from: a */
    public static C1361R m6244a(Context context, int i, C1362a aVar) {
        if (f4223e == null) {
            f4223e = m6249b(context, i, aVar);
        }
        return f4223e;
    }

    /* renamed from: b */
    static final C1361R m6249b(Context context, int i, C1362a aVar) {
        boolean z = true;
        C1361R r = FULL;
        C1361R a = m6243a(i);
        if (a != AUTO) {
            return a;
        }
        SharedPreferences a2 = m6242a(context);
        C1361R a3 = m6245a(context, a2);
        if (a3.ordinal() <= AUTO.ordinal() && m6247a(a2)) {
            z = false;
        }
        if (!z) {
            return r;
        }
        C1361R a4 = m6246a(aVar);
        if (a3.ordinal() > a4.ordinal()) {
            return a3;
        }
        return a4;
    }

    /* renamed from: a */
    private static boolean m6247a(SharedPreferences sharedPreferences) {
        if (sharedPreferences.getInt(Settings.getKeyById(Settings.IME_CUR_VERSION), 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static C1361R m6243a(int i) {
        if (i <= 0 || i >= values().length) {
            return AUTO;
        }
        return values()[i];
    }

    /* renamed from: a */
    private static SharedPreferences m6242a(Context context) {
        return context.getSharedPreferences(Settings.SETTINGS_FILE_NAME, 0);
    }

    /* renamed from: a */
    private static C1361R m6245a(Context context, SharedPreferences sharedPreferences) {
        int i = sharedPreferences.getInt(Settings.getKeyById(Settings.CURRENT_PERFORMANCE_MODE), 0);
        if (i <= 0 || i >= values().length) {
            return AUTO;
        }
        return values()[i];
    }

    /* renamed from: a */
    private static C1361R m6246a(C1362a aVar) {
        if (aVar == null) {
            return FULL;
        }
        return m6248b(aVar.mo4417b(), aVar.mo4416a());
    }

    /* renamed from: b */
    private static C1361R m6248b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            for (C1361R r : values()) {
                if (r.mo5766a(i, i2)) {
                    return r;
                }
            }
        }
        return FULL;
    }
}
