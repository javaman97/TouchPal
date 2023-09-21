package com.facebook.ads.internal;

import android.content.Context;
import android.os.Looper;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.p077h.C3456v;
import java.lang.reflect.Method;

/* renamed from: com.facebook.ads.internal.h */
public class C3429h {

    /* renamed from: a */
    private final String f14946a;

    /* renamed from: b */
    private final boolean f14947b;

    private C3429h(String str, boolean z) {
        this.f14946a = str;
        this.f14947b = z;
    }

    /* renamed from: a */
    public static C3429h m15039a(Context context, C3439h.C3441a aVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        } else if (aVar != null && !C3456v.m15103a(aVar.f14979b)) {
            return new C3429h(aVar.f14979b, aVar.f14980c);
        } else {
            Method a = C3439h.m15066a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
            if (a == null) {
                return null;
            }
            Object a2 = C3439h.m15063a((Object) null, a, context);
            if (a2 == null || ((Integer) a2).intValue() != 0) {
                return null;
            }
            Method a3 = C3439h.m15066a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
            if (a3 == null) {
                return null;
            }
            Object a4 = C3439h.m15063a((Object) null, a3, context);
            if (a4 == null) {
                return null;
            }
            Method a5 = C3439h.m15065a(a4.getClass(), "getId", (Class<?>[]) new Class[0]);
            Method a6 = C3439h.m15065a(a4.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
            if (a5 == null || a6 == null) {
                return null;
            }
            return new C3429h((String) C3439h.m15063a(a4, a5, new Object[0]), ((Boolean) C3439h.m15063a(a4, a6, new Object[0])).booleanValue());
        }
    }

    /* renamed from: a */
    public String mo10763a() {
        return this.f14946a;
    }

    /* renamed from: b */
    public boolean mo10764b() {
        return this.f14947b;
    }
}
