package com.iflytek.cloud.util.p088a.p089a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.iflytek.cloud.util.a.a.b */
final class C4020b implements Parcelable.Creator<C4019a> {
    C4020b() {
    }

    /* renamed from: a */
    public C4019a createFromParcel(Parcel parcel) {
        C4019a aVar = new C4019a();
        String unused = aVar.f16416a = parcel.readString();
        String unused2 = aVar.f16417b = parcel.readString();
        String unused3 = aVar.f16418c = parcel.readString();
        String unused4 = aVar.f16419d = parcel.readString();
        String unused5 = aVar.f16420e = parcel.readString();
        String unused6 = aVar.f16421f = parcel.readString();
        String unused7 = aVar.f16422g = parcel.readString();
        return aVar;
    }

    /* renamed from: a */
    public C4019a[] newArray(int i) {
        return new C4019a[i];
    }
}
