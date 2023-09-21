package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.maps.a */
public class C3832a {
    /* renamed from: a */
    static void m16752a(GoogleMapOptions googleMapOptions, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, googleMapOptions.mo12607i());
        C3540b.m15452a(parcel, 2, googleMapOptions.mo12586aZ());
        C3540b.m15452a(parcel, 3, googleMapOptions.mo12587ba());
        C3540b.m15470c(parcel, 4, googleMapOptions.getMapType());
        C3540b.m15459a(parcel, 5, (Parcelable) googleMapOptions.getCamera(), i, false);
        C3540b.m15452a(parcel, 6, googleMapOptions.mo12588bb());
        C3540b.m15452a(parcel, 7, googleMapOptions.mo12589bc());
        C3540b.m15452a(parcel, 8, googleMapOptions.mo12590bd());
        C3540b.m15452a(parcel, 9, googleMapOptions.mo12591be());
        C3540b.m15452a(parcel, 10, googleMapOptions.mo12592bf());
        C3540b.m15452a(parcel, 11, googleMapOptions.mo12593bg());
        C3540b.m15451C(parcel, d);
    }
}
