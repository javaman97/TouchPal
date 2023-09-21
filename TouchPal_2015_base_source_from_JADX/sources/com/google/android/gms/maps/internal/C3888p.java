package com.google.android.gms.maps.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.C3552c;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3851c;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.internal.p */
public class C3888p {

    /* renamed from: gN */
    private static Context f16020gN;

    /* renamed from: gO */
    private static C3851c f16021gO;

    /* renamed from: a */
    private static <T> T m16806a(ClassLoader classLoader, String str) {
        try {
            return m16808c(((ClassLoader) C3802s.m16678d(classLoader)).loadClass(str));
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class " + str);
        }
    }

    /* renamed from: bm */
    private static Class<?> m16807bm() {
        try {
            return Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    /* renamed from: c */
    private static <T> T m16808c(Class<?> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException("Unable to instantiate the dynamic class " + cls.getName());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unable to call the default constructor of " + cls.getName());
        }
    }

    private static Context getRemoteContext(Context context) {
        if (f16020gN == null) {
            if (m16807bm() != null) {
                f16020gN = context;
            } else {
                f16020gN = GooglePlayServicesUtil.getRemoteContext(context);
            }
        }
        return f16020gN;
    }

    /* renamed from: i */
    public static C3851c m16809i(Context context) throws GooglePlayServicesNotAvailableException {
        C3802s.m16678d(context);
        m16811k(context);
        if (f16021gO == null) {
            m16812l(context);
        }
        if (f16021gO != null) {
            return f16021gO;
        }
        f16021gO = C3851c.C3852a.m16769v((IBinder) m16806a(getRemoteContext(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
        m16810j(context);
        return f16021gO;
    }

    /* renamed from: j */
    private static void m16810j(Context context) {
        try {
            f16021gO.mo12774a(C3552c.m15490f(getRemoteContext(context).getResources()), (int) GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public static void m16811k(Context context) throws GooglePlayServicesNotAvailableException {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (isGooglePlayServicesAvailable != 0) {
            throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
        }
    }

    /* renamed from: l */
    private static void m16812l(Context context) {
        Class<?> bm = m16807bm();
        if (bm != null) {
            Log.i(C3888p.class.getSimpleName(), "Making Creator statically");
            f16021gO = (C3851c) m16808c(bm);
            m16810j(context);
        }
    }
}
