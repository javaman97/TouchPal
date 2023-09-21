package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity implements SafeParcelable {
    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;

    /* renamed from: ab */
    private final int f15917ab;

    /* renamed from: fs */
    int f15918fs;

    /* renamed from: ft */
    int f15919ft;

    public DetectedActivity(int i, int i2) {
        this.f15917ab = 1;
        this.f15918fs = i;
        this.f15919ft = i2;
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.f15917ab = i;
        this.f15918fs = i2;
        this.f15919ft = i3;
    }

    /* renamed from: L */
    private int m16706L(int i) {
        if (i > 5) {
            return 4;
        }
        return i;
    }

    public int describeContents() {
        return 0;
    }

    public int getConfidence() {
        return this.f15919ft;
    }

    public int getType() {
        return m16706L(this.f15918fs);
    }

    /* renamed from: i */
    public int mo12463i() {
        return this.f15917ab;
    }

    public String toString() {
        return "DetectedActivity [type=" + getType() + ", confidence=" + this.f15919ft + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        DetectedActivityCreator.m16708a(this, parcel, i);
    }
}
