package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class LocationRequestCreator implements Parcelable.Creator<LocationRequest> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16714a(LocationRequest locationRequest, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, locationRequest.mPriority);
        C3540b.m15470c(parcel, 1000, locationRequest.mo12497i());
        C3540b.m15455a(parcel, 2, locationRequest.f15929fB);
        C3540b.m15455a(parcel, 3, locationRequest.f15930fC);
        C3540b.m15463a(parcel, 4, locationRequest.f15931fD);
        C3540b.m15455a(parcel, 5, locationRequest.f15934fw);
        C3540b.m15470c(parcel, 6, locationRequest.f15932fE);
        C3540b.m15454a(parcel, 7, locationRequest.f15933fF);
        C3540b.m15451C(parcel, d);
    }

    public LocationRequest createFromParcel(Parcel parcel) {
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 3:
                    j2 = C3538a.m15428g(parcel, b);
                    break;
                case 4:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 5:
                    j3 = C3538a.m15428g(parcel, b);
                    break;
                case 6:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 7:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 1000:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new LocationRequest(i3, i, j, j2, z, j3, i2, f);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
