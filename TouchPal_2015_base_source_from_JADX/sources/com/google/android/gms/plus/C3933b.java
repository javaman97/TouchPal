package com.google.android.gms.plus;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.plus.b */
public class C3933b implements Parcelable.Creator<C3932a> {
    /* renamed from: a */
    static void m16919a(C3932a aVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, aVar.getAccountName(), false);
        C3540b.m15470c(parcel, 1000, aVar.mo13298i());
        C3540b.m15466a(parcel, 2, aVar.mo13292by(), false);
        C3540b.m15466a(parcel, 3, aVar.mo13293bz(), false);
        C3540b.m15466a(parcel, 4, aVar.mo13288bA(), false);
        C3540b.m15460a(parcel, 5, aVar.mo13289bB(), false);
        C3540b.m15460a(parcel, 6, aVar.mo13290bC(), false);
        C3540b.m15460a(parcel, 7, aVar.mo13291bD(), false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: U */
    public C3932a[] newArray(int i) {
        return new C3932a[i];
    }

    /* renamed from: u */
    public C3932a createFromParcel(Parcel parcel) {
        String str = null;
        int c = C3538a.m15422c(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str4 = null;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str4 = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    strArr3 = C3538a.m15445w(parcel, b);
                    break;
                case 3:
                    strArr2 = C3538a.m15445w(parcel, b);
                    break;
                case 4:
                    strArr = C3538a.m15445w(parcel, b);
                    break;
                case 5:
                    str3 = C3538a.m15433l(parcel, b);
                    break;
                case 6:
                    str2 = C3538a.m15433l(parcel, b);
                    break;
                case 7:
                    str = C3538a.m15433l(parcel, b);
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
            return new C3932a(i, str4, strArr3, strArr2, strArr, str3, str2, str);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
