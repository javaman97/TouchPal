package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.C0333F;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.C3889q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();

    /* renamed from: ab */
    private final int f16073ab;

    /* renamed from: gY */
    private float f16074gY;

    /* renamed from: gZ */
    private int f16075gZ;

    /* renamed from: hB */
    private final List<LatLng> f16076hB;

    /* renamed from: hC */
    private final List<List<LatLng>> f16077hC;

    /* renamed from: hD */
    private boolean f16078hD;

    /* renamed from: ha */
    private int f16079ha;

    /* renamed from: hb */
    private float f16080hb;

    /* renamed from: hc */
    private boolean f16081hc;

    public PolygonOptions() {
        this.f16074gY = 10.0f;
        this.f16075gZ = C0333F.f835s;
        this.f16079ha = 0;
        this.f16080hb = 0.0f;
        this.f16081hc = true;
        this.f16078hD = false;
        this.f16073ab = 1;
        this.f16076hB = new ArrayList();
        this.f16077hC = new ArrayList();
    }

    PolygonOptions(int i, List<LatLng> list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f16074gY = 10.0f;
        this.f16075gZ = C0333F.f835s;
        this.f16079ha = 0;
        this.f16080hb = 0.0f;
        this.f16081hc = true;
        this.f16078hD = false;
        this.f16073ab = i;
        this.f16076hB = list;
        this.f16077hC = list2;
        this.f16074gY = f;
        this.f16075gZ = i2;
        this.f16079ha = i3;
        this.f16080hb = f2;
        this.f16081hc = z;
        this.f16078hD = z2;
    }

    public PolygonOptions add(LatLng latLng) {
        this.f16076hB.add(latLng);
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        this.f16076hB.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        for (LatLng add : iterable) {
            this.f16076hB.add(add);
        }
        return this;
    }

    public PolygonOptions addHole(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.f16077hC.add(arrayList);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: br */
    public List mo13008br() {
        return this.f16077hC;
    }

    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int i) {
        this.f16079ha = i;
        return this;
    }

    public PolygonOptions geodesic(boolean z) {
        this.f16078hD = z;
        return this;
    }

    public int getFillColor() {
        return this.f16079ha;
    }

    public List<List<LatLng>> getHoles() {
        return this.f16077hC;
    }

    public List<LatLng> getPoints() {
        return this.f16076hB;
    }

    public int getStrokeColor() {
        return this.f16075gZ;
    }

    public float getStrokeWidth() {
        return this.f16074gY;
    }

    public float getZIndex() {
        return this.f16080hb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13018i() {
        return this.f16073ab;
    }

    public boolean isGeodesic() {
        return this.f16078hD;
    }

    public boolean isVisible() {
        return this.f16081hc;
    }

    public PolygonOptions strokeColor(int i) {
        this.f16075gZ = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.f16074gY = f;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.f16081hc = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3898g.m16860a(this, parcel, i);
        } else {
            PolygonOptionsCreator.m16841a(this, parcel, i);
        }
    }

    public PolygonOptions zIndex(float f) {
        this.f16080hb = f;
        return this;
    }
}
