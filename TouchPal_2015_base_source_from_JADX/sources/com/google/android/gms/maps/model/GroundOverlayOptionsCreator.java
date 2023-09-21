package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class GroundOverlayOptionsCreator implements Parcelable.Creator<GroundOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16824a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, groundOverlayOptions.mo12899i());
        C3540b.m15457a(parcel, 2, groundOverlayOptions.mo12887bp(), false);
        C3540b.m15459a(parcel, 3, (Parcelable) groundOverlayOptions.getLocation(), i, false);
        C3540b.m15454a(parcel, 4, groundOverlayOptions.getWidth());
        C3540b.m15454a(parcel, 5, groundOverlayOptions.getHeight());
        C3540b.m15459a(parcel, 6, (Parcelable) groundOverlayOptions.getBounds(), i, false);
        C3540b.m15454a(parcel, 7, groundOverlayOptions.getBearing());
        C3540b.m15454a(parcel, 8, groundOverlayOptions.getZIndex());
        C3540b.m15463a(parcel, 9, groundOverlayOptions.isVisible());
        C3540b.m15454a(parcel, 10, groundOverlayOptions.getTransparency());
        C3540b.m15454a(parcel, 11, groundOverlayOptions.getAnchorU());
        C3540b.m15454a(parcel, 12, groundOverlayOptions.getAnchorV());
        C3540b.m15451C(parcel, d);
    }

    public GroundOverlayOptions createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    iBinder = C3538a.m15435m(parcel, b);
                    break;
                case 3:
                    latLng = (LatLng) C3538a.m15416a(parcel, b, LatLng.CREATOR);
                    break;
                case 4:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 5:
                    f2 = C3538a.m15430i(parcel, b);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) C3538a.m15416a(parcel, b, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = C3538a.m15430i(parcel, b);
                    break;
                case 8:
                    f4 = C3538a.m15430i(parcel, b);
                    break;
                case 9:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 10:
                    f5 = C3538a.m15430i(parcel, b);
                    break;
                case 11:
                    f6 = C3538a.m15430i(parcel, b);
                    break;
                case 12:
                    f7 = C3538a.m15430i(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public GroundOverlayOptions[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
