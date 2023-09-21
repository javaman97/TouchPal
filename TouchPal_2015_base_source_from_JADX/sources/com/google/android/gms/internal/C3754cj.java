package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cj */
public class C3754cj implements Parcelable.Creator<C3737cc.C3743d> {
    /* renamed from: a */
    static void m16499a(C3737cc.C3743d dVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = dVar.mo12164bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, dVar.mo12181i());
        }
        if (bH.contains(2)) {
            C3540b.m15460a(parcel, 2, dVar.getFamilyName(), true);
        }
        if (bH.contains(3)) {
            C3540b.m15460a(parcel, 3, dVar.getFormatted(), true);
        }
        if (bH.contains(4)) {
            C3540b.m15460a(parcel, 4, dVar.getGivenName(), true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, dVar.getHonorificPrefix(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15460a(parcel, 6, dVar.getHonorificSuffix(), true);
        }
        if (bH.contains(7)) {
            C3540b.m15460a(parcel, 7, dVar.getMiddleName(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: E */
    public C3737cc.C3743d createFromParcel(Parcel parcel) {
        String str = null;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    str6 = C3538a.m15433l(parcel, b);
                    hashSet.add(2);
                    break;
                case 3:
                    str5 = C3538a.m15433l(parcel, b);
                    hashSet.add(3);
                    break;
                case 4:
                    str4 = C3538a.m15433l(parcel, b);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(6);
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
            return new C3737cc.C3743d(hashSet, i, str6, str5, str4, str3, str2, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ae */
    public C3737cc.C3743d[] newArray(int i) {
        return new C3737cc.C3743d[i];
    }
}
