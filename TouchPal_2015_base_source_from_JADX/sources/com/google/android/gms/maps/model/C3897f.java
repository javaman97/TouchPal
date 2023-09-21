package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.f */
public class C3897f {
    /* renamed from: a */
    static void m16859a(MarkerOptions markerOptions, Parcel parcel, int i) {
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
        C3540b.m15451C(parcel, d);
    }
}
