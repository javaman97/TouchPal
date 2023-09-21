package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.k */
public class C3925k {
    /* renamed from: a */
    static void m16900a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, visibleRegion.mo13095i());
        C3540b.m15459a(parcel, 2, (Parcelable) visibleRegion.nearLeft, i, false);
        C3540b.m15459a(parcel, 3, (Parcelable) visibleRegion.nearRight, i, false);
        C3540b.m15459a(parcel, 4, (Parcelable) visibleRegion.farLeft, i, false);
        C3540b.m15459a(parcel, 5, (Parcelable) visibleRegion.farRight, i, false);
        C3540b.m15459a(parcel, 6, (Parcelable) visibleRegion.latLngBounds, i, false);
        C3540b.m15451C(parcel, d);
    }
}
