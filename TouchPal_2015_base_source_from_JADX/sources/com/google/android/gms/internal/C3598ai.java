package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import com.google.android.gms.internal.C3595ah;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ai */
public class C3598ai implements Parcelable.Creator<C3595ah> {
    /* renamed from: a */
    static void m15657a(C3595ah ahVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15470c(parcel, 1, ahVar.mo11446i());
        C3540b.m15469b(parcel, 2, ahVar.mo11442ai(), false);
        C3540b.m15460a(parcel, 3, ahVar.mo11443aj(), false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: k */
    public C3595ah createFromParcel(Parcel parcel) {
        String str = null;
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
                    arrayList = C3538a.m15423c(parcel, b, C3595ah.C3596a.CREATOR);
                    break;
                case 3:
                    str = C3538a.m15433l(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new C3595ah(i, arrayList, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: t */
    public C3595ah[] newArray(int i) {
        return new C3595ah[i];
    }
}
