package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cl */
public class C3756cl implements Parcelable.Creator<C3737cc.C3746g> {
    /* renamed from: a */
    static void m16505a(C3737cc.C3746g gVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = gVar.mo12208bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, gVar.mo12216i());
        }
        if (bH.contains(2)) {
            C3540b.m15463a(parcel, 2, gVar.isPrimary());
        }
        if (bH.contains(3)) {
            C3540b.m15460a(parcel, 3, gVar.getValue(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: G */
    public C3737cc.C3746g createFromParcel(Parcel parcel) {
        boolean z = false;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    z = C3538a.m15424c(parcel, b);
                    hashSet.add(2);
                    break;
                case 3:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(3);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3746g(hashSet, i, z, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ag */
    public C3737cc.C3746g[] newArray(int i) {
        return new C3737cc.C3746g[i];
    }
}
