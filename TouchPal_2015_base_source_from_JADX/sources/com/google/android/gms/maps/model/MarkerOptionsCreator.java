package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class MarkerOptionsCreator implements Parcelable.Creator<MarkerOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16838a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, markerOptions.mo12970i());
        C3540b.m15459a(parcel, 2, (Parcelable) markerOptions.getPosition(), i, false);
        C3540b.m15460a(parcel, 3, markerOptions.getTitle(), false);
        C3540b.m15460a(parcel, 4, markerOptions.getSnippet(), false);
        C3540b.m15457a(parcel, 5, markerOptions.mo12957bq(), false);
        C3540b.m15454a(parcel, 6, markerOptions.getAnchorU());
        C3540b.m15454a(parcel, 7, markerOptions.getAnchorV());
        C3540b.m15463a(parcel, 8, markerOptions.isDraggable());
        C3540b.m15463a(parcel, 9, markerOptions.isVisible());
        C3540b.m15463a(parcel, 10, markerOptions.isFlat());
        C3540b.m15454a(parcel, 11, markerOptions.getRotation());
        C3540b.m15454a(parcel, 12, markerOptions.getInfoWindowAnchorU());
        C3540b.m15454a(parcel, 13, markerOptions.getInfoWindowAnchorV());
        C3540b.m15451C(parcel, d);
    }

    public MarkerOptions createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
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
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 4:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 5:
                    iBinder = C3538a.m15435m(parcel, b);
                    break;
                case 6:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 7:
                    f2 = C3538a.m15430i(parcel, b);
                    break;
                case 8:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 9:
                    z2 = C3538a.m15424c(parcel, b);
                    break;
                case 10:
                    z3 = C3538a.m15424c(parcel, b);
                    break;
                case 11:
                    f3 = C3538a.m15430i(parcel, b);
                    break;
                case 12:
                    f4 = C3538a.m15430i(parcel, b);
                    break;
                case 13:
                    f5 = C3538a.m15430i(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
