package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ci */
public class C3753ci implements Parcelable.Creator<C3737cc.C3742c> {
    /* renamed from: a */
    static void m16496a(C3737cc.C3742c cVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = cVar.mo12155bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, cVar.mo12162i());
        }
        if (bH.contains(2)) {
            C3540b.m15460a(parcel, 2, cVar.getUrl(), true);
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: D */
    public C3737cc.C3742c createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
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
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3742c(hashSet, i, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ad */
    public C3737cc.C3742c[] newArray(int i) {
        return new C3737cc.C3742c[i];
    }
}
