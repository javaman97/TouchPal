package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class LatLngBoundsCreator implements Parcelable.Creator<LatLngBounds> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16834a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, latLngBounds.mo12922i());
        C3540b.m15459a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C3540b.m15459a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C3540b.m15451C(parcel, d);
    }

    public LatLngBounds createFromParcel(Parcel parcel) {
        LatLng latLng;
        LatLng latLng2;
        int i;
        LatLng latLng3 = null;
        int c = C3538a.m15422c(parcel);
        int i2 = 0;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    LatLng latLng5 = latLng3;
                    latLng2 = latLng4;
                    i = C3538a.m15427f(parcel, b);
                    latLng = latLng5;
                    break;
                case 2:
                    i = i2;
                    LatLng latLng6 = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    latLng = latLng3;
                    latLng2 = latLng6;
                    break;
                case 3:
                    latLng = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    latLng2 = latLng4;
                    i = i2;
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    latLng = latLng3;
                    latLng2 = latLng4;
                    i = i2;
                    break;
            }
            i2 = i;
            latLng4 = latLng2;
            latLng3 = latLng;
        }
        if (parcel.dataPosition() == c) {
            return new LatLngBounds(i2, latLng4, latLng3);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
