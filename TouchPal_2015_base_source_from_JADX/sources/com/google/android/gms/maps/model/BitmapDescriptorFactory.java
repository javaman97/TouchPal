package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.model.internal.C3903a;

public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;

    /* renamed from: gQ */
    private static C3903a f16024gQ;

    private BitmapDescriptorFactory() {
    }

    /* renamed from: a */
    public static void m16815a(C3903a aVar) {
        if (f16024gQ == null) {
            f16024gQ = (C3903a) C3802s.m16678d(aVar);
        }
    }

    /* renamed from: bo */
    private static C3903a m16816bo() {
        return (C3903a) C3802s.m16675b(f16024gQ, (Object) "IBitmapDescriptorFactory is not initialized");
    }

    public static BitmapDescriptor defaultMarker() {
        try {
            return new BitmapDescriptor(m16816bo().mo13123bt());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor defaultMarker(float f) {
        try {
            return new BitmapDescriptor(m16816bo().mo13124c(f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromAsset(String str) {
        try {
            return new BitmapDescriptor(m16816bo().mo13118B(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        try {
            return new BitmapDescriptor(m16816bo().mo13122a(bitmap));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            return new BitmapDescriptor(m16816bo().mo13119C(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return new BitmapDescriptor(m16816bo().mo13120D(str));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            return new BitmapDescriptor(m16816bo().mo13121S(i));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
