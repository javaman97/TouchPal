package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.b */
public class C3893b {
    /* renamed from: a */
    static void m16855a(CircleOptions circleOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, circleOptions.mo12855i());
        C3540b.m15459a(parcel, 2, (Parcelable) circleOptions.getCenter(), i, false);
        C3540b.m15453a(parcel, 3, circleOptions.getRadius());
        C3540b.m15454a(parcel, 4, circleOptions.getStrokeWidth());
        C3540b.m15470c(parcel, 5, circleOptions.getStrokeColor());
        C3540b.m15470c(parcel, 6, circleOptions.getFillColor());
        C3540b.m15454a(parcel, 7, circleOptions.getZIndex());
        C3540b.m15463a(parcel, 8, circleOptions.isVisible());
        C3540b.m15451C(parcel, d);
    }
}
