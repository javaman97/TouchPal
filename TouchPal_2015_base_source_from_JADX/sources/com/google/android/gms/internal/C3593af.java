package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3590ae;

/* renamed from: com.google.android.gms.internal.af */
public class C3593af implements Parcelable.Creator<C3590ae.C3591a> {
    /* renamed from: a */
    static void m15640a(C3590ae.C3591a aVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, aVar.mo11428i());
        C3540b.m15470c(parcel, 2, aVar.mo11413R());
        C3540b.m15463a(parcel, 3, aVar.mo11416X());
        C3540b.m15470c(parcel, 4, aVar.mo11414S());
        C3540b.m15463a(parcel, 5, aVar.mo11417Y());
        C3540b.m15460a(parcel, 6, aVar.mo11418Z(), false);
        C3540b.m15470c(parcel, 7, aVar.mo11420aa());
        C3540b.m15460a(parcel, 8, aVar.mo11422ac(), false);
        C3540b.m15459a(parcel, 9, (Parcelable) aVar.mo11424ae(), i, false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: i */
    public C3590ae.C3591a createFromParcel(Parcel parcel) {
        C3809z zVar = null;
        int i = 0;
        int c = C3538a.m15422c(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i4 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                case 3:
                    z2 = C3538a.m15424c(parcel, b);
                    break;
                case 4:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 5:
                    z = C3538a.m15424c(parcel, b);
                    break;
                case 6:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 7:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 8:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 9:
                    zVar = (C3809z) C3538a.m15416a(parcel, b, C3809z.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3590ae.C3591a(i4, i3, z2, i2, z, str2, i, str, zVar);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: r */
    public C3590ae.C3591a[] newArray(int i) {
        return new C3590ae.C3591a[i];
    }
}
