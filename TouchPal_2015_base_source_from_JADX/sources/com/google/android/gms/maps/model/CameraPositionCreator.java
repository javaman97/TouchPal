package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class CameraPositionCreator implements Parcelable.Creator<CameraPosition> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16818a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, cameraPosition.mo12818i());
        C3540b.m15459a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C3540b.m15454a(parcel, 3, cameraPosition.zoom);
        C3540b.m15454a(parcel, 4, cameraPosition.tilt);
        C3540b.m15454a(parcel, 5, cameraPosition.bearing);
        C3540b.m15451C(parcel, d);
    }

    public CameraPosition createFromParcel(Parcel parcel) {
        float f = 0.0f;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    latLng = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    f3 = C3538a.m15430i(parcel, b);
                    break;
                case 4:
                    f2 = C3538a.m15430i(parcel, b);
                    break;
                case 5:
                    f = C3538a.m15430i(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new CameraPosition(i, latLng, f3, f2, f);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
