package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.Geofence;

/* renamed from: com.google.android.gms.internal.bi */
public class C3686bi implements SafeParcelable, Geofence {
    public static final C3687bj CREATOR = new C3687bj();

    /* renamed from: ab */
    private final int f15593ab;

    /* renamed from: fA */
    private final float f15594fA;

    /* renamed from: fU */
    private final long f15595fU;

    /* renamed from: fu */
    private final String f15596fu;

    /* renamed from: fv */
    private final int f15597fv;

    /* renamed from: fx */
    private final short f15598fx;

    /* renamed from: fy */
    private final double f15599fy;

    /* renamed from: fz */
    private final double f15600fz;

    public C3686bi(int i, String str, int i2, short s, double d, double d2, float f, long j) {
        m16136A(str);
        m16140b(f);
        m16139a(d, d2);
        int P = m16137P(i2);
        this.f15593ab = i;
        this.f15598fx = s;
        this.f15596fu = str;
        this.f15599fy = d;
        this.f15600fz = d2;
        this.f15594fA = f;
        this.f15595fU = j;
        this.f15597fv = P;
    }

    public C3686bi(String str, int i, short s, double d, double d2, float f, long j) {
        this(1, str, i, s, d, d2, f, j);
    }

    /* renamed from: A */
    private static void m16136A(String str) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
        }
    }

    /* renamed from: P */
    private static int m16137P(int i) {
        int i2 = i & 3;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    /* renamed from: Q */
    private static String m16138Q(int i) {
        switch (i) {
            case 1:
                return "CIRCLE";
            default:
                return null;
        }
    }

    /* renamed from: a */
    private static void m16139a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    /* renamed from: b */
    private static void m16140b(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    /* renamed from: c */
    public static C3686bi m16141c(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        C3686bi t = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    /* renamed from: aT */
    public short mo11744aT() {
        return this.f15598fx;
    }

    /* renamed from: aU */
    public float mo11745aU() {
        return this.f15594fA;
    }

    /* renamed from: aV */
    public int mo11746aV() {
        return this.f15597fv;
    }

    public int describeContents() {
        C3687bj bjVar = CREATOR;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C3686bi)) {
            return false;
        }
        C3686bi biVar = (C3686bi) obj;
        if (this.f15594fA != biVar.f15594fA) {
            return false;
        }
        if (this.f15599fy != biVar.f15599fy) {
            return false;
        }
        if (this.f15600fz != biVar.f15600fz) {
            return false;
        }
        return this.f15598fx == biVar.f15598fx;
    }

    public long getExpirationTime() {
        return this.f15595fU;
    }

    public double getLatitude() {
        return this.f15599fy;
    }

    public double getLongitude() {
        return this.f15600fz;
    }

    public String getRequestId() {
        return this.f15596fu;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f15599fy);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f15600fz);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f15594fA)) * 31) + this.f15598fx) * 31) + this.f15597fv;
    }

    /* renamed from: i */
    public int mo11754i() {
        return this.f15593ab;
    }

    public String toString() {
        return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", new Object[]{m16138Q(this.f15598fx), this.f15596fu, Integer.valueOf(this.f15597fv), Double.valueOf(this.f15599fy), Double.valueOf(this.f15600fz), Float.valueOf(this.f15594fA), Long.valueOf(this.f15595fU)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3687bj bjVar = CREATOR;
        C3687bj.m16146a(this, parcel, i);
    }
}
