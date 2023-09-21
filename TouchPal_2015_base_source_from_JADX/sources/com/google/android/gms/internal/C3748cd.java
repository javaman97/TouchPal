package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cd */
public class C3748cd implements Parcelable.Creator<C3737cc> {
    /* renamed from: a */
    static void m16481a(C3737cc ccVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = ccVar.mo12041bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, ccVar.mo12101i());
        }
        if (bH.contains(2)) {
            C3540b.m15460a(parcel, 2, ccVar.getAboutMe(), true);
        }
        if (bH.contains(3)) {
            C3540b.m15459a(parcel, 3, (Parcelable) ccVar.mo12042cc(), i, true);
        }
        if (bH.contains(4)) {
            C3540b.m15460a(parcel, 4, ccVar.getBirthday(), true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, ccVar.getBraggingRights(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15470c(parcel, 6, ccVar.getCircledByCount());
        }
        if (bH.contains(7)) {
            C3540b.m15459a(parcel, 7, (Parcelable) ccVar.mo12043cd(), i, true);
        }
        if (bH.contains(8)) {
            C3540b.m15460a(parcel, 8, ccVar.getCurrentLocation(), true);
        }
        if (bH.contains(9)) {
            C3540b.m15460a(parcel, 9, ccVar.getDisplayName(), true);
        }
        if (bH.contains(12)) {
            C3540b.m15470c(parcel, 12, ccVar.getGender());
        }
        if (bH.contains(14)) {
            C3540b.m15460a(parcel, 14, ccVar.getId(), true);
        }
        if (bH.contains(15)) {
            C3540b.m15459a(parcel, 15, (Parcelable) ccVar.mo12044ce(), i, true);
        }
        if (bH.contains(16)) {
            C3540b.m15463a(parcel, 16, ccVar.isPlusUser());
        }
        if (bH.contains(19)) {
            C3540b.m15459a(parcel, 19, (Parcelable) ccVar.mo12045cf(), i, true);
        }
        if (bH.contains(18)) {
            C3540b.m15460a(parcel, 18, ccVar.getLanguage(), true);
        }
        if (bH.contains(21)) {
            C3540b.m15470c(parcel, 21, ccVar.getObjectType());
        }
        if (bH.contains(20)) {
            C3540b.m15460a(parcel, 20, ccVar.getNickname(), true);
        }
        if (bH.contains(23)) {
            C3540b.m15469b(parcel, 23, ccVar.mo12047ch(), true);
        }
        if (bH.contains(22)) {
            C3540b.m15469b(parcel, 22, ccVar.mo12046cg(), true);
        }
        if (bH.contains(25)) {
            C3540b.m15470c(parcel, 25, ccVar.getRelationshipStatus());
        }
        if (bH.contains(24)) {
            C3540b.m15470c(parcel, 24, ccVar.getPlusOneCount());
        }
        if (bH.contains(27)) {
            C3540b.m15460a(parcel, 27, ccVar.getUrl(), true);
        }
        if (bH.contains(26)) {
            C3540b.m15460a(parcel, 26, ccVar.getTagline(), true);
        }
        if (bH.contains(29)) {
            C3540b.m15463a(parcel, 29, ccVar.isVerified());
        }
        if (bH.contains(28)) {
            C3540b.m15469b(parcel, 28, ccVar.mo12048ci(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: Y */
    public C3737cc[] newArray(int i) {
        return new C3737cc[i];
    }

    /* renamed from: y */
    public C3737cc createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        C3737cc.C3738a aVar = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        C3737cc.C3739b bVar = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        C3737cc.C3742c cVar = null;
        boolean z = false;
        String str7 = null;
        C3737cc.C3743d dVar = null;
        String str8 = null;
        int i4 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        ArrayList arrayList3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(2);
                    break;
                case 3:
                    hashSet.add(3);
                    aVar = (C3737cc.C3738a) C3538a.m15416a(parcel, b, C3737cc.C3738a.CREATOR);
                    break;
                case 4:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(4);
                    break;
                case 5:
                    str3 = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(6);
                    break;
                case 7:
                    hashSet.add(7);
                    bVar = (C3737cc.C3739b) C3538a.m15416a(parcel, b, C3737cc.C3739b.CREATOR);
                    break;
                case 8:
                    str4 = C3538a.m15433l(parcel, b);
                    hashSet.add(8);
                    break;
                case 9:
                    str5 = C3538a.m15433l(parcel, b);
                    hashSet.add(9);
                    break;
                case 12:
                    i3 = C3538a.m15427f(parcel, b);
                    hashSet.add(12);
                    break;
                case 14:
                    str6 = C3538a.m15433l(parcel, b);
                    hashSet.add(14);
                    break;
                case 15:
                    hashSet.add(15);
                    cVar = (C3737cc.C3742c) C3538a.m15416a(parcel, b, C3737cc.C3742c.CREATOR);
                    break;
                case 16:
                    z = C3538a.m15424c(parcel, b);
                    hashSet.add(16);
                    break;
                case 18:
                    str7 = C3538a.m15433l(parcel, b);
                    hashSet.add(18);
                    break;
                case 19:
                    hashSet.add(19);
                    dVar = (C3737cc.C3743d) C3538a.m15416a(parcel, b, C3737cc.C3743d.CREATOR);
                    break;
                case 20:
                    str8 = C3538a.m15433l(parcel, b);
                    hashSet.add(20);
                    break;
                case 21:
                    i4 = C3538a.m15427f(parcel, b);
                    hashSet.add(21);
                    break;
                case 22:
                    arrayList = C3538a.m15423c(parcel, b, C3737cc.C3745f.CREATOR);
                    hashSet.add(22);
                    break;
                case 23:
                    arrayList2 = C3538a.m15423c(parcel, b, C3737cc.C3746g.CREATOR);
                    hashSet.add(23);
                    break;
                case 24:
                    i5 = C3538a.m15427f(parcel, b);
                    hashSet.add(24);
                    break;
                case 25:
                    i6 = C3538a.m15427f(parcel, b);
                    hashSet.add(25);
                    break;
                case 26:
                    str9 = C3538a.m15433l(parcel, b);
                    hashSet.add(26);
                    break;
                case 27:
                    str10 = C3538a.m15433l(parcel, b);
                    hashSet.add(27);
                    break;
                case 28:
                    arrayList3 = C3538a.m15423c(parcel, b, C3737cc.C3747h.CREATOR);
                    hashSet.add(28);
                    break;
                case 29:
                    z2 = C3538a.m15424c(parcel, b);
                    hashSet.add(29);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc(hashSet, i, str, aVar, str2, str3, i2, bVar, str4, str5, i3, str6, cVar, z, str7, dVar, str8, i4, arrayList, arrayList2, i5, i6, str9, str10, arrayList3, z2);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
