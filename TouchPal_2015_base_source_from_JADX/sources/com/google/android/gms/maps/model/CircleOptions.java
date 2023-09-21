package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.C0333F;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3889q;

public final class CircleOptions implements SafeParcelable {
    public static final CircleOptionsCreator CREATOR = new CircleOptionsCreator();

    /* renamed from: ab */
    private final int f16031ab;

    /* renamed from: gW */
    private LatLng f16032gW;

    /* renamed from: gX */
    private double f16033gX;

    /* renamed from: gY */
    private float f16034gY;

    /* renamed from: gZ */
    private int f16035gZ;

    /* renamed from: ha */
    private int f16036ha;

    /* renamed from: hb */
    private float f16037hb;

    /* renamed from: hc */
    private boolean f16038hc;

    public CircleOptions() {
        this.f16032gW = null;
        this.f16033gX = 0.0d;
        this.f16034gY = 10.0f;
        this.f16035gZ = C0333F.f835s;
        this.f16036ha = 0;
        this.f16037hb = 0.0f;
        this.f16038hc = true;
        this.f16031ab = 1;
    }

    CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.f16032gW = null;
        this.f16033gX = 0.0d;
        this.f16034gY = 10.0f;
        this.f16035gZ = C0333F.f835s;
        this.f16036ha = 0;
        this.f16037hb = 0.0f;
        this.f16038hc = true;
        this.f16031ab = i;
        this.f16032gW = latLng;
        this.f16033gX = d;
        this.f16034gY = f;
        this.f16035gZ = i2;
        this.f16036ha = i3;
        this.f16037hb = f2;
        this.f16038hc = z;
    }

    public CircleOptions center(LatLng latLng) {
        this.f16032gW = latLng;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i) {
        this.f16036ha = i;
        return this;
    }

    public LatLng getCenter() {
        return this.f16032gW;
    }

    public int getFillColor() {
        return this.f16036ha;
    }

    public double getRadius() {
        return this.f16033gX;
    }

    public int getStrokeColor() {
        return this.f16035gZ;
    }

    public float getStrokeWidth() {
        return this.f16034gY;
    }

    public float getZIndex() {
        return this.f16037hb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12855i() {
        return this.f16031ab;
    }

    public boolean isVisible() {
        return this.f16038hc;
    }

    public CircleOptions radius(double d) {
        this.f16033gX = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.f16035gZ = i;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        this.f16034gY = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.f16038hc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3893b.m16855a(this, parcel, i);
        } else {
            CircleOptionsCreator.m16820a(this, parcel, i);
        }
    }

    public CircleOptions zIndex(float f) {
        this.f16037hb = f;
        return this;
    }
}
