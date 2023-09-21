package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

public class PolygonOptionsCreator implements Parcelable.Creator<PolygonOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16841a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, polygonOptions.mo13018i());
        C3540b.m15469b(parcel, 2, polygonOptions.getPoints(), false);
        C3540b.m15471c(parcel, 3, polygonOptions.mo13008br(), false);
        C3540b.m15454a(parcel, 4, polygonOptions.getStrokeWidth());
        C3540b.m15470c(parcel, 5, polygonOptions.getStrokeColor());
        C3540b.m15470c(parcel, 6, polygonOptions.getFillColor());
        C3540b.m15454a(parcel, 7, polygonOptions.getZIndex());
        C3540b.m15463a(parcel, 8, polygonOptions.isVisible());
        C3540b.m15463a(parcel, 9, polygonOptions.isGeodesic());
        C3540b.m15451C(parcel, d);
    }

    public PolygonOptions createFromParcel(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
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
                    arrayList = C3538a.m15423c(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    C3538a.m15418a(parcel, b, arrayList2, getClass().getClassLoader());
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
                    z2 = C3538a.m15424c(parcel, b);
                    break;
                case 9:
                    z = C3538a.m15424c(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new PolygonOptions(i3, arrayList, arrayList2, f2, i2, i, f, z2, z);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
