package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.j */
public class C3924j {
    /* renamed from: a */
    static void m16899a(TileOverlayOptions tileOverlayOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, tileOverlayOptions.mo13081i());
        C3540b.m15457a(parcel, 2, tileOverlayOptions.mo13077bs(), false);
        C3540b.m15463a(parcel, 3, tileOverlayOptions.isVisible());
        C3540b.m15454a(parcel, 4, tileOverlayOptions.getZIndex());
        C3540b.m15451C(parcel, d);
    }
}
