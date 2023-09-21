package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.internal.al */
public class C3601al implements Parcelable.Creator<C3600ak> {
    /* renamed from: a */
    static void m15681a(C3600ak akVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, akVar.mo11466i());
        C3540b.m15458a(parcel, 2, akVar.mo11463al(), false);
        C3540b.m15459a(parcel, 3, (Parcelable) akVar.mo11464am(), i, false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: m */
    public C3600ak createFromParcel(Parcel parcel) {
        C3595ah ahVar = null;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        Parcel parcel2 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    parcel2 = C3538a.m15447y(parcel, b);
                    break;
                case 3:
                    ahVar = (C3595ah) C3538a.m15416a(parcel, b, C3595ah.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3600ak(i, parcel2, ahVar);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: v */
    public C3600ak[] newArray(int i) {
        return new C3600ak[i];
    }
}
