package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.internal.aa */
public class C3585aa implements Parcelable.Creator<C3809z> {
    /* renamed from: a */
    static void m15584a(C3809z zVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, zVar.mo12445i());
        C3540b.m15459a(parcel, 2, (Parcelable) zVar.mo12442O(), i, false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: f */
    public C3809z createFromParcel(Parcel parcel) {
        int c = C3538a.m15422c(parcel);
        int i = 0;
        C3586ab abVar = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 2:
                    abVar = (C3586ab) C3538a.m15416a(parcel, b, C3586ab.CREATOR);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3809z(i, abVar);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: o */
    public C3809z[] newArray(int i) {
        return new C3809z[i];
    }
}
