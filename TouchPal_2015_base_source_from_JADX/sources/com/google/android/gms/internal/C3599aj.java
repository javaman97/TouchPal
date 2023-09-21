package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3595ah;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.aj */
public class C3599aj implements Parcelable.Creator<C3595ah.C3596a> {
    /* renamed from: a */
    static void m15660a(C3595ah.C3596a aVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, aVar.versionCode);
        C3540b.m15460a(parcel, 2, aVar.className, false);
        C3540b.m15469b(parcel, 3, aVar.f15466cG, false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: l */
    public C3595ah.C3596a createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 3:
                    arrayList = C3538a.m15423c(parcel, b, C3595ah.C3597b.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3595ah.C3596a(i, str, arrayList);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: u */
    public C3595ah.C3596a[] newArray(int i) {
        return new C3595ah.C3596a[i];
    }
}
