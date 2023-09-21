package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.a */
public class C3892a {
    /* renamed from: a */
    static void m16854a(CameraPosition cameraPosition, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, cameraPosition.mo12818i());
        C3540b.m15459a(parcel, 2, (Parcelable) cameraPosition.target, i, false);
        C3540b.m15454a(parcel, 3, cameraPosition.zoom);
        C3540b.m15454a(parcel, 4, cameraPosition.tilt);
        C3540b.m15454a(parcel, 5, cameraPosition.bearing);
        C3540b.m15451C(parcel, d);
    }
}
