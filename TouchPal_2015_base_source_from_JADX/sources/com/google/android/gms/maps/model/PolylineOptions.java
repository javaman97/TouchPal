package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.C0333F;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3889q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();

    /* renamed from: P */
    private int f16083P;

    /* renamed from: ab */
    private final int f16084ab;

    /* renamed from: hB */
    private final List<LatLng> f16085hB;

    /* renamed from: hD */
    private boolean f16086hD;

    /* renamed from: hb */
    private float f16087hb;

    /* renamed from: hc */
    private boolean f16088hc;

    /* renamed from: hg */
    private float f16089hg;

    public PolylineOptions() {
        this.f16089hg = 10.0f;
        this.f16083P = C0333F.f835s;
        this.f16087hb = 0.0f;
        this.f16088hc = true;
        this.f16086hD = false;
        this.f16084ab = 1;
        this.f16085hB = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2) {
        this.f16089hg = 10.0f;
        this.f16083P = C0333F.f835s;
        this.f16087hb = 0.0f;
        this.f16088hc = true;
        this.f16086hD = false;
        this.f16084ab = i;
        this.f16085hB = list;
        this.f16089hg = f;
        this.f16083P = i2;
        this.f16087hb = f2;
        this.f16088hc = z;
        this.f16086hD = z2;
    }

    public PolylineOptions add(LatLng latLng) {
        this.f16085hB.add(latLng);
        return this;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        this.f16085hB.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.f16085hB.add(add);
        }
        return this;
    }

    public PolylineOptions color(int i) {
        this.f16083P = i;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean z) {
        this.f16086hD = z;
        return this;
    }

    public int getColor() {
        return this.f16083P;
    }

    public List<LatLng> getPoints() {
        return this.f16085hB;
    }

    public float getWidth() {
        return this.f16089hg;
    }

    public float getZIndex() {
        return this.f16087hb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13054i() {
        return this.f16084ab;
    }

    public boolean isGeodesic() {
        return this.f16086hD;
    }

    public boolean isVisible() {
        return this.f16088hc;
    }

    public PolylineOptions visible(boolean z) {
        this.f16088hc = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.f16089hg = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3899h.m16861a(this, parcel, i);
        } else {
            PolylineOptionsCreator.m16843a(this, parcel, i);
        }
    }

    public PolylineOptions zIndex(float f) {
        this.f16087hb = f;
        return this;
    }
}
