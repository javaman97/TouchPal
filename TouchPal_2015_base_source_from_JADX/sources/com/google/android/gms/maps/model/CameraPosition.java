package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3799r;
import com.google.android.gms.internal.C3802s;
import com.google.android.gms.maps.internal.C3889q;

public final class CameraPosition implements SafeParcelable {
    public static final CameraPositionCreator CREATOR = new CameraPositionCreator();

    /* renamed from: ab */
    private final int f16025ab;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public static final class Builder {

        /* renamed from: gR */
        private LatLng f16026gR;

        /* renamed from: gS */
        private float f16027gS;

        /* renamed from: gT */
        private float f16028gT;

        /* renamed from: gU */
        private float f16029gU;

        public Builder() {
        }

        public Builder(CameraPosition cameraPosition) {
            this.f16026gR = cameraPosition.target;
            this.f16027gS = cameraPosition.zoom;
            this.f16028gT = cameraPosition.tilt;
            this.f16029gU = cameraPosition.bearing;
        }

        public Builder bearing(float f) {
            this.f16029gU = f;
            return this;
        }

        public CameraPosition build() {
            return new CameraPosition(this.f16026gR, this.f16027gS, this.f16028gT, this.f16029gU);
        }

        public Builder target(LatLng latLng) {
            this.f16026gR = latLng;
            return this;
        }

        public Builder tilt(float f) {
            this.f16028gT = f;
            return this;
        }

        public Builder zoom(float f) {
            this.f16027gS = f;
            return this;
        }
    }

    CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C3802s.m16675b(latLng, (Object) "null camera target");
        C3802s.m16676b(0.0f <= f2 && f2 <= 90.0f, (Object) "Tilt needs to be between 0 and 90 inclusive");
        this.f16025ab = i;
        this.target = latLng;
        this.zoom = f;
        this.tilt = f2 + 0.0f;
        this.bearing = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CameraPosition cameraPosition) {
        return new Builder(cameraPosition);
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(2) ? obtainAttributes.getFloat(2, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 0.0f) : 0.0f));
        Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(5)) {
            builder.zoom(obtainAttributes.getFloat(5, 0.0f));
        }
        if (obtainAttributes.hasValue(1)) {
            builder.bearing(obtainAttributes.getFloat(1, 0.0f));
        }
        if (obtainAttributes.hasValue(4)) {
            builder.tilt(obtainAttributes.getFloat(4, 0.0f));
        }
        return builder.build();
    }

    public static final CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing);
    }

    public int hashCode() {
        return C3799r.hashCode(this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12818i() {
        return this.f16025ab;
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("target", this.target).mo12413a("zoom", Float.valueOf(this.zoom)).mo12413a("tilt", Float.valueOf(this.tilt)).mo12413a("bearing", Float.valueOf(this.bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (C3889q.m16813bn()) {
            C3892a.m16854a(this, parcel, i);
        } else {
            CameraPositionCreator.m16818a(this, parcel, i);
        }
    }
}
