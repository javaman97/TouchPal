package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cf */
public class C3750cf implements Parcelable.Creator<C3737cc.C3739b> {
    /* renamed from: a */
    static void m16487a(C3737cc.C3739b bVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = bVar.mo12116bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, bVar.mo12129i());
        }
        if (bH.contains(2)) {
            C3540b.m15459a(parcel, 2, (Parcelable) bVar.mo12117cl(), i, true);
        }
        if (bH.contains(3)) {
            C3540b.m15459a(parcel, 3, (Parcelable) bVar.mo12118cm(), i, true);
        }
        if (bH.contains(4)) {
            C3540b.m15470c(parcel, 4, bVar.getLayout());
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: A */
    public C3737cc.C3739b createFromParcel(Parcel parcel) {
        C3737cc.C3739b.C3741b bVar = null;
        int i = 0;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        C3737cc.C3739b.C3740a aVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 2:
                    hashSet.add(2);
                    aVar = (C3737cc.C3739b.C3740a) C3538a.m15416a(parcel, b, C3737cc.C3739b.C3740a.CREATOR);
                    break;
                case 3:
                    hashSet.add(3);
                    bVar = (C3737cc.C3739b.C3741b) C3538a.m15416a(parcel, b, C3737cc.C3739b.C3741b.CREATOR);
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
            return new C3737cc.C3739b(hashSet, i2, aVar, bVar, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: aa */
    public C3737cc.C3739b[] newArray(int i) {
        return new C3737cc.C3739b[i];
    }
}
