package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.internal.C3703bq;
import com.google.android.gms.plus.PlusOneDummyView;

/* renamed from: com.google.android.gms.internal.bu */
public final class C3719bu {

    /* renamed from: gN */
    private static Context f15634gN;

    /* renamed from: iy */
    private static C3703bq f15635iy;

    /* renamed from: com.google.android.gms.internal.bu$a */
    public static class C3720a extends Exception {
        public C3720a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static View m16319a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            return (View) C3552c.m15489a(m16321m(context).mo11793a(C3552c.m15490f(context), i, i2, str, i3));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* renamed from: a */
    public static View m16320a(Context context, int i, int i2, String str, String str2) {
        if (str != null) {
            return (View) C3552c.m15489a(m16321m(context).mo11794a(C3552c.m15490f(context), i, i2, str, str2));
        }
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            return new PlusOneDummyView(context, i);
        }
    }

    /* renamed from: m */
    private static C3703bq m16321m(Context context) throws C3720a {
        C3802s.m16678d(context);
        if (f15635iy == null) {
            if (f15634gN == null) {
                f15634gN = GooglePlayServicesUtil.getRemoteContext(context);
                if (f15634gN == null) {
                    throw new C3720a("Could not get remote context.");
                }
            }
            try {
                f15635iy = C3703bq.C3704a.m16225Z((IBinder) f15634gN.getClassLoader().loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            } catch (ClassNotFoundException e) {
                throw new C3720a("Could not load creator class.");
            } catch (InstantiationException e2) {
                throw new C3720a("Could not instantiate creator.");
            } catch (IllegalAccessException e3) {
                throw new C3720a("Could not access creator.");
            }
        }
        return f15635iy;
    }
}
