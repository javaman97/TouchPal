package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ch */
public class C3752ch implements Parcelable.Creator<C3737cc.C3739b.C3741b> {
    /* renamed from: a */
    static void m16493a(C3737cc.C3739b.C3741b bVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = bVar.mo12142bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, bVar.mo12153i());
        }
        if (bH.contains(2)) {
            C3540b.m15470c(parcel, 2, bVar.getHeight());
        }
        if (bH.contains(3)) {
            C3540b.m15460a(parcel, 3, bVar.getUrl(), true);
        }
        if (bH.contains(4)) {
            C3540b.m15470c(parcel, 4, bVar.getWidth());
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: C */
    public C3737cc.C3739b.C3741b createFromParcel(Parcel parcel) {
        int i = 0;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
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
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(3);
                    break;
                case 4:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(4);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3739b.C3741b(hashSet, i3, i2, str, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ac */
    public C3737cc.C3739b.C3741b[] newArray(int i) {
        return new C3737cc.C3739b.C3741b[i];
    }
}
