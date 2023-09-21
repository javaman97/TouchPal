package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class TileOverlayOptionsCreator implements Parcelable.Creator<TileOverlayOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16849a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, tileOverlayOptions.mo13081i());
        C3540b.m15457a(parcel, 2, tileOverlayOptions.mo13077bs(), false);
        C3540b.m15463a(parcel, 3, tileOverlayOptions.isVisible());
        C3540b.m15454a(parcel, 4, tileOverlayOptions.getZIndex());
        C3540b.m15451C(parcel, d);
    }

    public TileOverlayOptions createFromParcel(Parcel parcel) {
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        IBinder iBinder = null;
        float f = 0.0f;
        int i = 0;
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
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 4:
                    f = C3538a.m15430i(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new TileOverlayOptions(i, iBinder, z, f);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public TileOverlayOptions[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
