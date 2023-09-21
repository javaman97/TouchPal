package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.d */
public class C3895d {
    /* renamed from: a */
    static void m16857a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, latLngBounds.mo12922i());
        C3540b.m15459a(parcel, 2, (Parcelable) latLngBounds.southwest, i, false);
        C3540b.m15459a(parcel, 3, (Parcelable) latLngBounds.northeast, i, false);
        C3540b.m15451C(parcel, d);
    }
}
