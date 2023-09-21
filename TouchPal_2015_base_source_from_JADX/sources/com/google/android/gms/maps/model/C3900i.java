package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.i */
public class C3900i {
    /* renamed from: a */
    static void m16862a(Tile tile, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, tile.mo13064i());
        C3540b.m15470c(parcel, 2, tile.width);
        C3540b.m15470c(parcel, 3, tile.height);
        C3540b.m15464a(parcel, 4, tile.data, false);
        C3540b.m15451C(parcel, d);
    }
}
