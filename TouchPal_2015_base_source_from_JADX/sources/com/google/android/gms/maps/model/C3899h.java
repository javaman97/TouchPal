package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.h */
public class C3899h {
    /* renamed from: a */
    static void m16861a(PolylineOptions polylineOptions, Parcel parcel, int i) {
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
}
