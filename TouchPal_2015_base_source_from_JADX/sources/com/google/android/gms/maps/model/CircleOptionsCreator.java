package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class CircleOptionsCreator implements Parcelable.Creator<CircleOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16820a(CircleOptions circleOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, circleOptions.mo12855i());
        C3540b.m15459a(parcel, 2, (Parcelable) circleOptions.getCenter(), i, false);
        C3540b.m15453a(parcel, 3, circleOptions.getRadius());
        C3540b.m15454a(parcel, 4, circleOptions.getStrokeWidth());
        C3540b.m15470c(parcel, 5, circleOptions.getStrokeColor());
        C3540b.m15470c(parcel, 6, circleOptions.getFillColor());
        C3540b.m15454a(parcel, 7, circleOptions.getZIndex());
        C3540b.m15463a(parcel, 8, circleOptions.isVisible());
        C3540b.m15451C(parcel, d);
    }

    public CircleOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    latLng = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    d = C3538a.m15431j(parcel, b);
                    break;
                case 4:
                    f2 = C3538a.m15430i(parcel, b);
                    break;
                case 5:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 6:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 7:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 8:
                    z = C3538a.m15424c(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public CircleOptions[] newArray(int i) {
        return new CircleOptions[i];
    }
}
