package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.g */
public class C3898g {
    /* renamed from: a */
    static void m16860a(PolygonOptions polygonOptions, Parcel parcel, int i) {
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
}
