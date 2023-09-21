package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.maps.internal.C3889q;

public final class VisibleRegion implements SafeParcelable {
    public static final VisibleRegionCreator CREATOR = new VisibleRegionCreator();

    /* renamed from: ab */
    private final int f16103ab;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this.f16103ab = i;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds2;
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.nearLeft.equals(visibleRegion.nearLeft) && this.nearRight.equals(visibleRegion.nearRight) && this.farLeft.equals(visibleRegion.farLeft) && this.farRight.equals(visibleRegion.farRight) && this.latLngBounds.equals(visibleRegion.latLngBounds);
    }

    public int hashCode() {
        return C3799r.hashCode(this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo13095i() {
        return this.f16103ab;
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("nearLeft", this.nearLeft).mo12413a("nearRight", this.nearRight).mo12413a("farLeft", this.farLeft).mo12413a("farRight", this.farRight).mo12413a("latLngBounds", this.latLngBounds).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3925k.m16900a(this, parcel, i);
        } else {
            VisibleRegionCreator.m16853a(this, parcel, i);
        }
    }
}
