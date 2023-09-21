package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

public class PolylineOptionsCreator implements Parcelable.Creator<PolylineOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16843a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, polylineOptions.mo13054i());
        C3540b.m15469b(parcel, 2, polylineOptions.getPoints(), false);
        C3540b.m15454a(parcel, 3, polylineOptions.getWidth());
        C3540b.m15470c(parcel, 4, polylineOptions.getColor());
        C3540b.m15454a(parcel, 5, polylineOptions.getZIndex());
        C3540b.m15463a(parcel, 6, polylineOptions.isVisible());
        C3540b.m15463a(parcel, 7, polylineOptions.isGeodesic());
        C3540b.m15451C(parcel, d);
    }

    public PolylineOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        ArrayList arrayList = null;
        boolean z2 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    arrayList = C3538a.m15423c(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = C3538a.m15430i(parcel, b);
                    break;
                case 4:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 5:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 6:
                    z2 = C3538a.m15424c(parcel, b);
                    break;
                case 7:
                    z = C3538a.m15424c(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new PolylineOptions(i2, arrayList, f2, i, f, z2, z);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public PolylineOptions[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
