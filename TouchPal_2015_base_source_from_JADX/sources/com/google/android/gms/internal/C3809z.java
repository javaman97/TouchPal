package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3590ae;

/* renamed from: com.google.android.gms.internal.z */
public class C3809z implements SafeParcelable {
    public static final C3585aa CREATOR = new C3585aa();

    /* renamed from: ab */
    private final int f15910ab;

    /* renamed from: cn */
    private final C3586ab f15911cn;

    C3809z(int i, C3586ab abVar) {
        this.f15910ab = i;
        this.f15911cn = abVar;
    }

    private C3809z(C3586ab abVar) {
        this.f15910ab = 1;
        this.f15911cn = abVar;
    }

    /* renamed from: a */
    public static C3809z m16700a(C3590ae.C3592b<?, ?> bVar) {
        if (bVar instanceof C3586ab) {
            return new C3809z((C3586ab) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C3586ab mo12442O() {
        return this.f15911cn;
    }

    /* renamed from: P */
    public C3590ae.C3592b<?, ?> mo12443P() {
        if (this.f15911cn != null) {
            return this.f15911cn;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public int describeContents() {
        C3585aa aaVar = CREATOR;
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo12445i() {
        return this.f15910ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3585aa aaVar = CREATOR;
        C3585aa.m15584a(this, parcel, i);
    }
}
