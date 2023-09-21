package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3590ae;
import com.google.android.gms.internal.C3595ah;

/* renamed from: com.google.android.gms.internal.ag */
public class C3594ag implements Parcelable.Creator<C3595ah.C3597b> {
    /* renamed from: a */
    static void m15643a(C3595ah.C3597b bVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, bVar.versionCode);
        C3540b.m15460a(parcel, 2, bVar.f15467cH, false);
        C3540b.m15459a(parcel, 3, (Parcelable) bVar.f15468cI, i, false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: j */
    public C3595ah.C3597b createFromParcel(Parcel parcel) {
        C3590ae.C3591a aVar = null;
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
                    aVar = (C3590ae.C3591a) C3538a.m15416a(parcel, b, C3590ae.C3591a.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3595ah.C3597b(i, str, aVar);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: s */
    public C3595ah.C3597b[] newArray(int i) {
        return new C3595ah.C3597b[i];
    }
}
