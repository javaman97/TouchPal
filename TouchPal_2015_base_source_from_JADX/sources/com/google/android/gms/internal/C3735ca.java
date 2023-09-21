package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ca */
public class C3735ca implements Parcelable.Creator<C3725bz> {
    /* renamed from: a */
    static void m16384a(C3725bz bzVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = bzVar.mo12004bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, bzVar.mo12021i());
        }
        if (bH.contains(2)) {
            C3540b.m15460a(parcel, 2, bzVar.getId(), true);
        }
        if (bH.contains(4)) {
            C3540b.m15459a(parcel, 4, (Parcelable) bzVar.mo12005bY(), i, true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, bzVar.getStartDate(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15459a(parcel, 6, (Parcelable) bzVar.mo12006bZ(), i, true);
        }
        if (bH.contains(7)) {
            C3540b.m15460a(parcel, 7, bzVar.getType(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: X */
    public C3725bz[] newArray(int i) {
        return new C3725bz[i];
    }

    /* renamed from: x */
    public C3725bz createFromParcel(Parcel parcel) {
        String str = null;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        C3723bx bxVar = null;
        String str2 = null;
        C3723bx bxVar2 = null;
        String str3 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    str3 = C3538a.m15433l(parcel, b);
                    hashSet.add(2);
                    break;
                case 4:
                    hashSet.add(4);
                    bxVar2 = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 5:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    hashSet.add(6);
                    bxVar = (C3723bx) C3538a.m15416a(parcel, b, C3723bx.CREATOR);
                    break;
                case 7:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(7);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3725bz(hashSet, i, str3, bxVar2, str2, bxVar, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
