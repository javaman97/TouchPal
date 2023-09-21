package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.model.e */
public class C3896e {
    /* renamed from: a */
    static void m16858a(LatLng latLng, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, latLng.mo12914i());
        C3540b.m15453a(parcel, 2, latLng.latitude);
        C3540b.m15453a(parcel, 3, latLng.longitude);
        C3540b.m15451C(parcel, d);
    }
}
