package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cg */
public class C3751cg implements Parcelable.Creator<C3737cc.C3739b.C3740a> {
    /* renamed from: a */
    static void m16490a(C3737cc.C3739b.C3740a aVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = aVar.mo12131bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, aVar.mo12140i());
        }
        if (bH.contains(2)) {
            C3540b.m15470c(parcel, 2, aVar.getLeftImageOffset());
        }
        if (bH.contains(3)) {
            C3540b.m15470c(parcel, 3, aVar.getTopImageOffset());
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: B */
    public C3737cc.C3739b.C3740a createFromParcel(Parcel parcel) {
        int i = 0;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i3 = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(2);
                    break;
                case 3:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(3);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3739b.C3740a(hashSet, i3, i2, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ab */
    public C3737cc.C3739b.C3740a[] newArray(int i) {
        return new C3737cc.C3739b.C3740a[i];
    }
}
