package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class VisibleRegionCreator implements Parcelable.Creator<VisibleRegion> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16853a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, visibleRegion.mo13095i());
        C3540b.m15459a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C3540b.m15459a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C3540b.m15459a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C3540b.m15459a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C3540b.m15459a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C3540b.m15451C(parcel, d);
    }

    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    latLng4 = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C3538a.m15416a(parcel, b, LatLngBounds.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
