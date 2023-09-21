package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.common.data.c */
public class C3524c<T extends SafeParcelable> extends DataBuffer<T> {

    /* renamed from: X */
    private static final String[] f15261X = {"data"};

    /* renamed from: Y */
    private final Parcelable.Creator<T> f15262Y;

    public C3524c(C3525d dVar, Parcelable.Creator<T> creator) {
        super(dVar);
        this.f15262Y = creator;
    }

    /* renamed from: d */
    public T get(int i) {
        byte[] e = this.f15255S.mo10982e("data", i, 0);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(e, 0, e.length);
        obtain.setDataPosition(0);
        T t = (SafeParcelable) this.f15262Y.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }
}
