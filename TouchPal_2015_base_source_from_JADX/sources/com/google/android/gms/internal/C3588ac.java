package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3586ab;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ac */
public class C3588ac implements Parcelable.Creator<C3586ab> {
    /* renamed from: a */
    static void m15595a(C3586ab abVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, abVar.mo11390i());
        C3540b.m15469b(parcel, 2, abVar.mo11383Q(), false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: g */
    public C3586ab createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    arrayList = C3538a.m15423c(parcel, b, C3586ab.C3587a.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3586ab(i, arrayList);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: p */
    public C3586ab[] newArray(int i) {
        return new C3586ab[i];
    }
}
