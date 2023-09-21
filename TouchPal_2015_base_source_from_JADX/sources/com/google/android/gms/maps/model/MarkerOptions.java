package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C3549b;
import com.google.android.gms.maps.internal.C3889q;

public final class MarkerOptions implements SafeParcelable {
    public static final MarkerOptionsCreator CREATOR = new MarkerOptionsCreator();

    /* renamed from: ab */
    private final int f16059ab;

    /* renamed from: hc */
    private boolean f16060hc;

    /* renamed from: hk */
    private float f16061hk;

    /* renamed from: hl */
    private float f16062hl;

    /* renamed from: hr */
    private LatLng f16063hr;

    /* renamed from: hs */
    private String f16064hs;

    /* renamed from: ht */
    private String f16065ht;

    /* renamed from: hu */
    private BitmapDescriptor f16066hu;

    /* renamed from: hv */
    private boolean f16067hv;

    /* renamed from: hw */
    private boolean f16068hw;

    /* renamed from: hx */
    private float f16069hx;

    /* renamed from: hy */
    private float f16070hy;

    /* renamed from: hz */
    private float f16071hz;

    public MarkerOptions() {
        this.f16061hk = 0.5f;
        this.f16062hl = 1.0f;
        this.f16060hc = true;
        this.f16068hw = false;
        this.f16069hx = 0.0f;
        this.f16070hy = 0.5f;
        this.f16071hz = 0.0f;
        this.f16059ab = 1;
    }

    MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5) {
        this.f16061hk = 0.5f;
        this.f16062hl = 1.0f;
        this.f16060hc = true;
        this.f16068hw = false;
        this.f16069hx = 0.0f;
        this.f16070hy = 0.5f;
        this.f16071hz = 0.0f;
        this.f16059ab = i;
        this.f16063hr = latLng;
        this.f16064hs = str;
        this.f16065ht = str2;
        this.f16066hu = iBinder == null ? null : new BitmapDescriptor(C3549b.C3550a.m15488l(iBinder));
        this.f16061hk = f;
        this.f16062hl = f2;
        this.f16067hv = z;
        this.f16060hc = z2;
        this.f16068hw = z3;
        this.f16069hx = f3;
        this.f16070hy = f4;
        this.f16071hz = f5;
    }

    public MarkerOptions anchor(float f, float f2) {
        this.f16061hk = f;
        this.f16062hl = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bq */
    public IBinder mo12957bq() {
        if (this.f16066hu == null) {
            return null;
        }
        return this.f16066hu.mo12814aW().asBinder();
    }

    public int describeContents() {
        return 0;
    }

    public MarkerOptions draggable(boolean z) {
        this.f16067hv = z;
        return this;
    }

    public MarkerOptions flat(boolean z) {
        this.f16068hw = z;
        return this;
    }

    public float getAnchorU() {
        return this.f16061hk;
    }

    public float getAnchorV() {
        return this.f16062hl;
    }

    public BitmapDescriptor getIcon() {
        return this.f16066hu;
    }

    public float getInfoWindowAnchorU() {
        return this.f16070hy;
    }

    public float getInfoWindowAnchorV() {
        return this.f16071hz;
    }

    public LatLng getPosition() {
        return this.f16063hr;
    }

    public float getRotation() {
        return this.f16069hx;
    }

    public String getSnippet() {
        return this.f16065ht;
    }

    public String getTitle() {
        return this.f16064hs;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12970i() {
        return this.f16059ab;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        this.f16066hu = bitmapDescriptor;
        return this;
    }

    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.f16070hy = f;
        this.f16071hz = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.f16067hv;
    }

    public boolean isFlat() {
        return this.f16068hw;
    }

    public boolean isVisible() {
        return this.f16060hc;
    }

    public MarkerOptions position(LatLng latLng) {
        this.f16063hr = latLng;
        return this;
    }

    public MarkerOptions rotation(float f) {
        this.f16069hx = f;
        return this;
    }

    public MarkerOptions snippet(String str) {
        this.f16065ht = str;
        return this;
    }

    public MarkerOptions title(String str) {
        this.f16064hs = str;
        return this;
    }

    public MarkerOptions visible(boolean z) {
        this.f16060hc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3897f.m16859a(this, parcel, i);
        } else {
            MarkerOptionsCreator.m16838a(this, parcel, i);
        }
    }
}
