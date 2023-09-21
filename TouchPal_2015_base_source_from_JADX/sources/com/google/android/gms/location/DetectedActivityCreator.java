package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

public class DetectedActivityCreator implements Parcelable.Creator<DetectedActivity> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16708a(DetectedActivity detectedActivity, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, detectedActivity.f15918fs);
        C3540b.m15470c(parcel, 1000, detectedActivity.mo12463i());
        C3540b.m15470c(parcel, 2, detectedActivity.f15919ft);
        C3540b.m15451C(parcel, d);
    }

    public DetectedActivity createFromParcel(Parcel parcel) {
        int i = 0;
        int c = C3538a.m15422c(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    i = C3538a.m15427f(parcel, b);
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
            return new DetectedActivity(i3, i2, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public DetectedActivity[] newArray(int i) {
        return new DetectedActivity[i];
    }
}
