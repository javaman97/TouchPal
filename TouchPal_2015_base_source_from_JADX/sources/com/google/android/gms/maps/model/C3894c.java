package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.c */
public class C3894c {
    /* renamed from: a */
    static void m16856a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
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
}
