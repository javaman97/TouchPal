package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.cp */
public class C3760cp implements Parcelable.Creator<C3759co> {
    /* renamed from: a */
    static void m16526a(C3759co coVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, coVar.getId(), false);
        C3540b.m15470c(parcel, 1000, coVar.mo12291i());
        C3540b.m15469b(parcel, 2, coVar.mo12278cB(), false);
        C3540b.m15469b(parcel, 3, coVar.mo12279cC(), false);
        C3540b.m15459a(parcel, 4, (Parcelable) coVar.mo12280cD(), i, false);
        C3540b.m15460a(parcel, 5, coVar.mo12281cE(), false);
        C3540b.m15460a(parcel, 6, coVar.mo12282cF(), false);
        C3540b.m15460a(parcel, 7, coVar.mo12283cG(), false);
        C3540b.m15456a(parcel, 8, coVar.mo12284cH(), false);
        C3540b.m15456a(parcel, 9, coVar.mo12285cI(), false);
        C3540b.m15470c(parcel, 10, coVar.mo12286cJ());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: I */
    public C3759co createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int c = C3538a.m15422c(parcel);
        Bundle bundle2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str4 = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    arrayList2 = C3538a.m15423c(parcel, b, C3807x.CREATOR);
                    break;
                case 3:
                    arrayList = C3538a.m15423c(parcel, b, Uri.CREATOR);
                    break;
                case 4:
                    uri = (Uri) C3538a.m15416a(parcel, b, Uri.CREATOR);
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
                case 8:
                    bundle2 = C3538a.m15436n(parcel, b);
                    break;
                case 9:
                    bundle = C3538a.m15436n(parcel, b);
                    break;
                case 10:
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
            return new C3759co(i2, str4, arrayList2, arrayList, uri, str3, str2, str, bundle2, bundle, i);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }

    /* renamed from: ai */
    public C3759co[] newArray(int i) {
        return new C3759co[i];
    }
}
