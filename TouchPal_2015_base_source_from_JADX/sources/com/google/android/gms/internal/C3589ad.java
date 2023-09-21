package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3586ab;

/* renamed from: com.google.android.gms.internal.ad */
public class C3589ad implements Parcelable.Creator<C3586ab.C3587a> {
    /* renamed from: a */
    static void m15598a(C3586ab.C3587a aVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, aVar.versionCode);
        C3540b.m15460a(parcel, 2, aVar.f15449cr, false);
        C3540b.m15470c(parcel, 3, aVar.f15450cs);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: h */
    public C3586ab.C3587a createFromParcel(Parcel parcel) {
        int i = 0;
        int c = C3538a.m15422c(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    i = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3586ab.C3587a(i2, str, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: q */
    public C3586ab.C3587a[] newArray(int i) {
        return new C3586ab.C3587a[i];
    }
}
