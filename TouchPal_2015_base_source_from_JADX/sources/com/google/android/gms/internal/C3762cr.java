package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.cr */
public class C3762cr implements Parcelable.Creator<C3761cq> {
    /* renamed from: a */
    static void m16535a(C3761cq cqVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1000, cqVar.mo12305i());
        C3540b.m15469b(parcel, 2, cqVar.mo12298cK(), false);
        C3540b.m15469b(parcel, 3, cqVar.mo12299cL(), false);
        C3540b.m15456a(parcel, 4, cqVar.mo12300cM(), false);
        C3540b.m15463a(parcel, 5, cqVar.mo12301cN());
        C3540b.m15470c(parcel, 6, cqVar.mo12297cJ());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: J */
    public C3761cq createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int c = C3538a.m15422c(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 2:
                    arrayList2 = C3538a.m15423c(parcel, b, C3807x.CREATOR);
                    break;
                case 3:
                    arrayList = C3538a.m15423c(parcel, b, C3807x.CREATOR);
                    break;
                case 4:
                    bundle = C3538a.m15436n(parcel, b);
                    break;
                case 5:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 6:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 1000:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3761cq(i2, arrayList2, arrayList, bundle, z, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: aj */
    public C3761cq[] newArray(int i) {
        return new C3761cq[i];
    }
}
