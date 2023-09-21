package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3799r;

public final class LocationRequest implements SafeParcelable {
    public static final LocationRequestCreator CREATOR = new LocationRequestCreator();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;

    /* renamed from: ab */
    private final int f15928ab;

    /* renamed from: fB */
    long f15929fB;

    /* renamed from: fC */
    long f15930fC;

    /* renamed from: fD */
    boolean f15931fD;

    /* renamed from: fE */
    int f15932fE;

    /* renamed from: fF */
    float f15933fF;

    /* renamed from: fw */
    long f15934fw;
    int mPriority;

    public LocationRequest() {
        this.f15928ab = 1;
        this.mPriority = 102;
        this.f15929fB = 3600000;
        this.f15930fC = 600000;
        this.f15931fD = false;
        this.f15934fw = Long.MAX_VALUE;
        this.f15932fE = Integer.MAX_VALUE;
        this.f15933fF = 0.0f;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f) {
        this.f15928ab = i;
        this.mPriority = i2;
        this.f15929fB = j;
        this.f15930fC = j2;
        this.f15931fD = z;
        this.f15934fw = j3;
        this.f15932fE = i3;
        this.f15933fF = f;
    }

    /* renamed from: M */
    private static void m16709M(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    /* renamed from: N */
    public static String m16710N(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    /* renamed from: a */
    private static void m16711a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    /* renamed from: c */
    private static void m16712c(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.mPriority == locationRequest.mPriority && this.f15929fB == locationRequest.f15929fB && this.f15930fC == locationRequest.f15930fC && this.f15931fD == locationRequest.f15931fD && this.f15934fw == locationRequest.f15934fw && this.f15932fE == locationRequest.f15932fE && this.f15933fF == locationRequest.f15933fF;
    }

    public long getExpirationTime() {
        return this.f15934fw;
    }

    public long getFastestInterval() {
        return this.f15930fC;
    }

    public long getInterval() {
        return this.f15929fB;
    }

    public int getNumUpdates() {
        return this.f15932fE;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public float getSmallestDisplacement() {
        return this.f15933fF;
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.mPriority), Long.valueOf(this.f15929fB), Long.valueOf(this.f15930fC), Boolean.valueOf(this.f15931fD), Long.valueOf(this.f15934fw), Integer.valueOf(this.f15932fE), Float.valueOf(this.f15933fF));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12497i() {
        return this.f15928ab;
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.f15934fw = Long.MAX_VALUE;
        } else {
            this.f15934fw = elapsedRealtime + j;
        }
        if (this.f15934fw < 0) {
            this.f15934fw = 0;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        this.f15934fw = j;
        if (this.f15934fw < 0) {
            this.f15934fw = 0;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        m16712c(j);
        this.f15931fD = true;
        this.f15930fC = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        m16712c(j);
        this.f15929fB = j;
        if (!this.f15931fD) {
            this.f15930fC = (long) (((double) this.f15929fB) / 6.0d);
        }
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + i);
        }
        this.f15932fE = i;
        return this;
    }

    public LocationRequest setPriority(int i) {
        m16709M(i);
        this.mPriority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        m16711a(f);
        this.f15933fF = f;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[").append(m16710N(this.mPriority));
        if (this.mPriority != 105) {
            sb.append(" requested=");
            sb.append(this.f15929fB + "ms");
        }
        sb.append(" fastest=");
        sb.append(this.f15930fC + "ms");
        if (this.f15934fw != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append((this.f15934fw - SystemClock.elapsedRealtime()) + "ms");
        }
        if (this.f15932fE != Integer.MAX_VALUE) {
            sb.append(" num=").append(this.f15932fE);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LocationRequestCreator.m16714a(this, parcel, i);
    }
}
