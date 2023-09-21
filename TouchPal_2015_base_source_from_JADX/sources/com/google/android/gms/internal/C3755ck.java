package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ck */
public class C3755ck implements Parcelable.Creator<C3737cc.C3745f> {
    /* renamed from: a */
    static void m16502a(C3737cc.C3745f fVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = fVar.mo12183bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, fVar.mo12205i());
        }
        if (bH.contains(2)) {
            C3540b.m15460a(parcel, 2, fVar.getDepartment(), true);
        }
        if (bH.contains(3)) {
            C3540b.m15460a(parcel, 3, fVar.getDescription(), true);
        }
        if (bH.contains(4)) {
            C3540b.m15460a(parcel, 4, fVar.getEndDate(), true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, fVar.getLocation(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15460a(parcel, 6, fVar.getName(), true);
        }
        if (bH.contains(7)) {
            C3540b.m15463a(parcel, 7, fVar.isPrimary());
        }
        if (bH.contains(8)) {
            C3540b.m15460a(parcel, 8, fVar.getStartDate(), true);
        }
        if (bH.contains(9)) {
            C3540b.m15460a(parcel, 9, fVar.getTitle(), true);
        }
        if (bH.contains(10)) {
            C3540b.m15470c(parcel, 10, fVar.getType());
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: F */
    public C3737cc.C3745f createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    str7 = C3538a.m15433l(parcel, b);
                    hashSet.add(2);
                    break;
                case 3:
                    str6 = C3538a.m15433l(parcel, b);
                    hashSet.add(3);
                    break;
                case 4:
                    str5 = C3538a.m15433l(parcel, b);
                    hashSet.add(4);
                    break;
                case 5:
                    str4 = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = C3538a.m15433l(parcel, b);
                    hashSet.add(6);
                    break;
                case 7:
                    z = C3538a.m15424c(parcel, b);
                    hashSet.add(7);
                    break;
                case 8:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(8);
                    break;
                case 9:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(9);
                    break;
                case 10:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(10);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3745f(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: af */
    public C3737cc.C3745f[] newArray(int i) {
        return new C3737cc.C3745f[i];
    }
}
