package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.internal.bj */
public class C3687bj implements Parcelable.Creator<C3686bi> {
    /* renamed from: a */
    static void m16146a(C3686bi biVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15460a(parcel, 1, biVar.getRequestId(), false);
        C3540b.m15470c(parcel, 1000, biVar.mo11754i());
        C3540b.m15455a(parcel, 2, biVar.getExpirationTime());
        C3540b.m15462a(parcel, 3, biVar.mo11744aT());
        C3540b.m15453a(parcel, 4, biVar.getLatitude());
        C3540b.m15453a(parcel, 5, biVar.getLongitude());
        C3540b.m15454a(parcel, 6, biVar.mo11745aU());
        C3540b.m15470c(parcel, 7, biVar.mo11746aV());
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: R */
    public C3686bi[] newArray(int i) {
        return new C3686bi[i];
    }

    /* renamed from: t */
    public C3686bi createFromParcel(Parcel parcel) {
        double d = 0.0d;
        short s = 0;
        int c = C3538a.m15422c(parcel);
        String str = null;
        float f = 0.0f;
        long j = 0;
        double d2 = 0.0d;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    str = C3538a.m15433l(parcel, b);
                    break;
                case 2:
                    j = C3538a.m15428g(parcel, b);
                    break;
                case 3:
                    s = C3538a.m15426e(parcel, b);
                    break;
                case 4:
                    d2 = C3538a.m15431j(parcel, b);
                    break;
                case 5:
                    d = C3538a.m15431j(parcel, b);
                    break;
                case 6:
                    f = C3538a.m15430i(parcel, b);
                    break;
                case 7:
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
            return new C3686bi(i2, str, i, s, d2, d, f, j);
        }
        throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
    }
}
