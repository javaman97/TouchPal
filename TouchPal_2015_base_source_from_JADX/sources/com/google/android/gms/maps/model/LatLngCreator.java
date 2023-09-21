package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class LatLngCreator implements Parcelable.Creator<LatLng> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16835a(LatLng latLng, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, latLng.mo12914i());
        C3540b.m15453a(parcel, 2, latLng.latitude);
        C3540b.m15453a(parcel, 3, latLng.longitude);
        C3540b.m15451C(parcel, d);
    }

    public LatLng createFromParcel(Parcel parcel) {
        double d = 0.0d;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    d2 = C3538a.m15431j(parcel, b);
                    break;
                case 3:
                    d = C3538a.m15431j(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new LatLng(i, d2, d);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
