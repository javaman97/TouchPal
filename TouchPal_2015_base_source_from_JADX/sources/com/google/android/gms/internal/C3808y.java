package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.internal.y */
public class C3808y implements Parcelable.Creator<C3807x> {
    /* renamed from: a */
    static void m16697a(C3807x xVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, xVar.getType());
        C3540b.m15470c(parcel, 1000, xVar.mo12435i());
        C3540b.m15470c(parcel, 2, xVar.mo12424I());
        C3540b.m15460a(parcel, 3, xVar.mo12425J(), false);
        C3540b.m15460a(parcel, 4, xVar.mo12426K(), false);
        C3540b.m15460a(parcel, 5, xVar.getDisplayName(), false);
        C3540b.m15460a(parcel, 6, xVar.mo12427L(), false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: e */
    public C3807x createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int c = C3538a.m15422c(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 3:
                    str4 = C3538a.m15433l(parcel, b);
                    break;
                case 4:
                    str3 = C3538a.m15433l(parcel, b);
                    break;
                case 5:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 6:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 1000:
                    i3 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3807x(i3, i2, i, str4, str3, str2, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: n */
    public C3807x[] newArray(int i) {
        return new C3807x[i];
    }
}
