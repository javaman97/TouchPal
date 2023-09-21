package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3538a;
import com.google.android.gms.common.internal.safeparcel.C3540b;

/* renamed from: com.google.android.gms.common.data.e */
public class C3528e implements Parcelable.Creator<C3525d> {
    /* renamed from: a */
    static void m15373a(C3525d dVar, Parcel parcel, int i) {
        int d = C3540b.m15472d(parcel);
        C3540b.m15466a(parcel, 1, dVar.mo10990j(), false);
        C3540b.m15470c(parcel, 1000, dVar.mo10988i());
        C3540b.m15465a(parcel, 2, (T[]) dVar.mo10991k(), i, false);
        C3540b.m15470c(parcel, 3, dVar.getStatusCode());
        C3540b.m15456a(parcel, 4, dVar.mo10992l(), false);
        C3540b.m15451C(parcel, d);
    }

    /* renamed from: a */
    public C3525d createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int c = C3538a.m15422c(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < c) {
            int b = C3538a.m15419b(parcel);
            switch (C3538a.m15434m(b)) {
                case 1:
                    strArr = C3538a.m15445w(parcel, b);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) C3538a.m15421b(parcel, b, CursorWindow.CREATOR);
                    break;
                case 3:
                    i = C3538a.m15427f(parcel, b);
                    break;
                case 4:
                    bundle = C3538a.m15436n(parcel, b);
                    break;
                case 1000:
                    i2 = C3538a.m15427f(parcel, b);
                    break;
                default:
                    C3538a.m15420b(parcel, b);
                    break;
            }
        }
        if (parcel.dataPosition() != c) {
            throw new C3538a.C3539a("Overread allowed size end=" + c, parcel);
        }
        C3525d dVar = new C3525d(i2, strArr, cursorWindowArr, i, bundle);
        dVar.mo10987h();
        return dVar;
    }

    /* renamed from: g */
    public C3525d[] newArray(int i) {
        return new C3525d[i];
    }
}
