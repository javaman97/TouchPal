package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

public class ActivityRecognitionResultCreator implements Parcelable.Creator<ActivityRecognitionResult> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* renamed from: a */
    static void m16705a(ActivityRecognitionResult activityRecognitionResult, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15469b(parcel, 1, activityRecognitionResult.f15914fp, false);
        C3540b.m15470c(parcel, 1000, activityRecognitionResult.mo12455i());
        C3540b.m15455a(parcel, 2, activityRecognitionResult.f15915fq);
        C3540b.m15455a(parcel, 3, activityRecognitionResult.f15916fr);
        C3540b.m15451C(parcel, d);
    }

    public ActivityRecognitionResult createFromParcel(Parcel parcel) {
        long j = 0;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        ArrayList arrayList = null;
        long j2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    arrayList = C3538a.m15423c(parcel, b, DetectedActivity.CREATOR);
                    break;
                case 2:
                    j2 = C3538a.m15428g(parcel, b);
                    break;
                case 3:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 1000:
                    i = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new ActivityRecognitionResult(i, arrayList, j2, j);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    public ActivityRecognitionResult[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
