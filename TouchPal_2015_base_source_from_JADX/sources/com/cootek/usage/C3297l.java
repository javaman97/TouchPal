package com.cootek.usage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.cootek.usage.l */
class C3297l {

    /* renamed from: a */
    private static final String f14501a = "usage_setting";

    /* renamed from: b */
    private static volatile C3297l f14502b;

    /* renamed from: c */
    private SharedPreferences f14503c;

    private C3297l(Context context) {
        this.f14503c = context.getSharedPreferences(f14501a, 0);
    }

    /* renamed from: a */
    static C3297l m14606a() {
        if (f14502b == null) {
            synchronized (C3297l.class) {
                if (f14502b == null) {
                    f14502b = new C3297l(UsageRecorder.f14422a.getContext());
                }
            }
        }
        return f14502b;
    }

    /* renamed from: d */
    private static String m14607d(String str) {
        return "last_" + str;
    }

    /* renamed from: e */
    private static String m14608e(String str) {
        return "keyid_" + str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo10499a(String str) {
        return this.f14503c.getLong(m14607d(str), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10500a(String str, long j) {
        this.f14503c.edit().putLong(m14607d(str), j).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo10501b(String str) {
        return this.f14503c.getLong(m14607d(str), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10502b(String str, long j) {
        this.f14503c.edit().putLong(m14607d(str), j).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo10503c(String str) {
        return this.f14503c.getLong(m14608e(str), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10504c(String str, long j) {
        this.f14503c.edit().putLong(m14608e(str), j).commit();
    }
}
