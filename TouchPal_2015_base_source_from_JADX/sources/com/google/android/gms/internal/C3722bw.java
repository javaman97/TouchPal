package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.bw */
public class C3722bw implements Parcelable.Creator<C3721bv> {
    /* renamed from: a */
    static void m16326a(C3721bv bvVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, bvVar.getDescription(), false);
        C3540b.m15470c(parcel, 1000, bvVar.mo11864i());
        C3540b.m15469b(parcel, 2, bvVar.mo11859bE(), false);
        C3540b.m15469b(parcel, 3, bvVar.mo11860bF(), false);
        C3540b.m15463a(parcel, 4, bvVar.mo11861bG());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: V */
    public C3721bv[] newArray(int i) {
        return new C3721bv[i];
    }

    /* renamed from: v */
    public C3721bv createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int c = C3538a.m15422c(parcel);
        ArrayList arrayList2 = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    arrayList2 = C3538a.m15423c(parcel, b, C3807x.CREATOR);
                    break;
                case 3:
                    arrayList = C3538a.m15423c(parcel, b, C3807x.CREATOR);
                    break;
                case 4:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 1000:
                    i = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3721bv(i, str, arrayList2, arrayList, z);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
