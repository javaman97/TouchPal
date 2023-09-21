package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3889q;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final GroundOverlayOptionsCreator CREATOR = new GroundOverlayOptionsCreator();
    public static final float NO_DIMENSION = -1.0f;

    /* renamed from: ab */
    private final int f16040ab;

    /* renamed from: gU */
    private float f16041gU;

    /* renamed from: hb */
    private float f16042hb;

    /* renamed from: hc */
    private boolean f16043hc;

    /* renamed from: he */
    private BitmapDescriptor f16044he;

    /* renamed from: hf */
    private LatLng f16045hf;

    /* renamed from: hg */
    private float f16046hg;

    /* renamed from: hh */
    private float f16047hh;

    /* renamed from: hi */
    private LatLngBounds f16048hi;

    /* renamed from: hj */
    private float f16049hj;

    /* renamed from: hk */
    private float f16050hk;

    /* renamed from: hl */
    private float f16051hl;

    public GroundOverlayOptions() {
        this.f16043hc = true;
        this.f16049hj = 0.0f;
        this.f16050hk = 0.5f;
        this.f16051hl = 0.5f;
        this.f16040ab = 1;
    }

    GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7) {
        this.f16043hc = true;
        this.f16049hj = 0.0f;
        this.f16050hk = 0.5f;
        this.f16051hl = 0.5f;
        this.f16040ab = i;
        this.f16044he = new BitmapDescriptor(C3549b.C3550a.m15488l(iBinder));
        this.f16045hf = latLng;
        this.f16046hg = f;
        this.f16047hh = f2;
        this.f16048hi = latLngBounds;
        this.f16041gU = f3;
        this.f16042hb = f4;
        this.f16043hc = z;
        this.f16049hj = f5;
        this.f16050hk = f6;
        this.f16051hl = f7;
    }

    /* renamed from: a */
    private GroundOverlayOptions m16821a(LatLng latLng, float f, float f2) {
        this.f16045hf = latLng;
        this.f16046hg = f;
        this.f16047hh = f2;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f2) {
        this.f16050hk = f;
        this.f16051hl = f2;
        return this;
    }

    public GroundOverlayOptions bearing(float f) {
        this.f16041gU = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bp */
    public IBinder mo12887bp() {
        return this.f16044he.mo12814aW().asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public float getAnchorU() {
        return this.f16050hk;
    }

    public float getAnchorV() {
        return this.f16051hl;
    }

    public float getBearing() {
        return this.f16041gU;
    }

    public LatLngBounds getBounds() {
        return this.f16048hi;
    }

    public float getHeight() {
        return this.f16047hh;
    }

    public BitmapDescriptor getImage() {
        return this.f16044he;
    }

    public LatLng getLocation() {
        return this.f16045hf;
    }

    public float getTransparency() {
        return this.f16049hj;
    }

    public float getWidth() {
        return this.f16046hg;
    }

    public float getZIndex() {
        return this.f16042hb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12899i() {
        return this.f16040ab;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        this.f16044he = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.f16043hc;
    }

    public GroundOverlayOptions position(LatLng latLng, float f) {
        boolean z = true;
        C3802s.m16673a(this.f16048hi == null, "Position has already been set using positionFromBounds");
        C3802s.m16676b(latLng != null, (Object) "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        C3802s.m16676b(z, (Object) "Width must be non-negative");
        return m16821a(latLng, f, -1.0f);
    }

    public GroundOverlayOptions position(LatLng latLng, float f, float f2) {
        boolean z = true;
        C3802s.m16673a(this.f16048hi == null, "Position has already been set using positionFromBounds");
        C3802s.m16676b(latLng != null, (Object) "Location must be specified");
        C3802s.m16676b(f >= 0.0f, (Object) "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        C3802s.m16676b(z, (Object) "Height must be non-negative");
        return m16821a(latLng, f, f2);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        C3802s.m16673a(this.f16045hf == null, "Position has already been set using position: " + this.f16045hf);
        this.f16048hi = latLngBounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f) {
        C3802s.m16676b(f >= 0.0f && f <= 1.0f, (Object) "Transparency must be in the range [0..1]");
        this.f16049hj = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean z) {
        this.f16043hc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3894c.m16856a(this, parcel, i);
        } else {
            GroundOverlayOptionsCreator.m16824a(this, parcel, i);
        }
    }

    public GroundOverlayOptions zIndex(float f) {
        this.f16042hb = f;
        return this;
    }
}
