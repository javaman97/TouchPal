package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3889q;

public final class LatLngBounds implements SafeParcelable {
    public static final LatLngBoundsCreator CREATOR = new LatLngBoundsCreator();

    /* renamed from: ab */
    private final int f16053ab;
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {

        /* renamed from: hm */
        private double f16054hm = Double.POSITIVE_INFINITY;

        /* renamed from: hn */
        private double f16055hn = Double.NEGATIVE_INFINITY;

        /* renamed from: ho */
        private double f16056ho = Double.NaN;

        /* renamed from: hp */
        private double f16057hp = Double.NaN;

        /* renamed from: b */
        private boolean m16833b(double d) {
            boolean z = false;
            if (this.f16056ho <= this.f16057hp) {
                return this.f16056ho <= d && d <= this.f16057hp;
            }
            if (this.f16056ho <= d || d <= this.f16057hp) {
                z = true;
            }
            return z;
        }

        public LatLngBounds build() {
            C3802s.m16673a(!Double.isNaN(this.f16056ho), "no included points");
            return new LatLngBounds(new LatLng(this.f16054hm, this.f16056ho), new LatLng(this.f16055hn, this.f16057hp));
        }

        public Builder include(LatLng latLng) {
            this.f16054hm = Math.min(this.f16054hm, latLng.latitude);
            this.f16055hn = Math.max(this.f16055hn, latLng.latitude);
            double d = latLng.longitude;
            if (Double.isNaN(this.f16056ho)) {
                this.f16056ho = d;
                this.f16057hp = d;
            } else if (!m16833b(d)) {
                if (LatLngBounds.m16827b(this.f16056ho, d) < LatLngBounds.m16829c(this.f16057hp, d)) {
                    this.f16056ho = d;
                } else {
                    this.f16057hp = d;
                }
            }
            return this;
        }
    }

    LatLngBounds(int i, LatLng latLng, LatLng latLng2) {
        C3802s.m16675b(latLng, (Object) "null southwest");
        C3802s.m16675b(latLng2, (Object) "null northeast");
        C3802s.m16674a(latLng2.latitude >= latLng.latitude, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude));
        this.f16053ab = i;
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this(1, latLng, latLng2);
    }

    /* renamed from: a */
    private boolean m16826a(double d) {
        return this.southwest.latitude <= d && d <= this.northeast.latitude;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static double m16827b(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    /* renamed from: b */
    private boolean m16828b(double d) {
        boolean z = false;
        if (this.southwest.longitude <= this.northeast.longitude) {
            return this.southwest.longitude <= d && d <= this.northeast.longitude;
        }
        if (this.southwest.longitude <= d || d <= this.northeast.longitude) {
            z = true;
        }
        return z;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m16829c(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public boolean contains(LatLng latLng) {
        return m16826a(latLng.latitude) && m16828b(latLng.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public LatLng getCenter() {
        double d = (this.southwest.latitude + this.northeast.latitude) / 2.0d;
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        return new LatLng(d, d3 <= d2 ? (d2 + d3) / 2.0d : ((d2 + 360.0d) + d3) / 2.0d);
    }

    public int hashCode() {
        return C3799r.hashCode(this.southwest, this.northeast);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12922i() {
        return this.f16053ab;
    }

    public LatLngBounds including(LatLng latLng) {
        double d;
        double min = Math.min(this.southwest.latitude, latLng.latitude);
        double max = Math.max(this.northeast.latitude, latLng.latitude);
        double d2 = this.northeast.longitude;
        double d3 = this.southwest.longitude;
        double d4 = latLng.longitude;
        if (m16828b(d4)) {
            d4 = d3;
            d = d2;
        } else if (m16827b(d3, d4) < m16829c(d2, d4)) {
            d = d2;
        } else {
            double d5 = d3;
            d = d4;
            d4 = d5;
        }
        return new LatLngBounds(new LatLng(min, d4), new LatLng(max, d));
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("southwest", this.southwest).mo12413a("northeast", this.northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3895d.m16857a(this, parcel, i);
        } else {
            LatLngBoundsCreator.m16834a(this, parcel, i);
        }
    }
}
