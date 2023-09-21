package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3737cc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cm */
public class C3757cm implements Parcelable.Creator<C3737cc.C3747h> {
    /* renamed from: a */
    static void m16508a(C3737cc.C3747h hVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        Set<Integer> bH = hVar.mo12219bH();
        if (bH.contains(1)) {
            C3540b.m15470c(parcel, 1, hVar.mo12231i());
        }
        if (bH.contains(3)) {
            C3540b.m15470c(parcel, 3, hVar.mo12220cu());
        }
        if (bH.contains(4)) {
            C3540b.m15460a(parcel, 4, hVar.getValue(), true);
        }
        if (bH.contains(5)) {
            C3540b.m15460a(parcel, 5, hVar.getLabel(), true);
        }
        if (bH.contains(6)) {
            C3540b.m15470c(parcel, 6, hVar.getType());
        }
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: H */
    public C3737cc.C3747h createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int c = C3538a.m15422c(parcel);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i3 = C3538a.m15427f(parcel, b);
                    hashSet.add(1);
                    break;
                case 3:
                    i = C3538a.m15427f(parcel, b);
                    hashSet.add(3);
                    break;
                case 4:
                    str = C3538a.m15433l(parcel, b);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = C3538a.m15433l(parcel, b);
                    hashSet.add(5);
                    break;
                case 6:
                    i2 = C3538a.m15427f(parcel, b);
                    hashSet.add(6);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3737cc.C3747h(hashSet, i3, str2, i2, str, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ah */
    public C3737cc.C3747h[] newArray(int i) {
        return new C3737cc.C3747h[i];
    }
}
