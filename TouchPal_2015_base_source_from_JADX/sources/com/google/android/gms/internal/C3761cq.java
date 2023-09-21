package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.cq */
public class C3761cq implements SafeParcelable {
    public static final C3762cr CREATOR = new C3762cr();

    /* renamed from: ab */
    private final int f15816ab;

    /* renamed from: kA */
    private final ArrayList<C3807x> f15817kA;

    /* renamed from: kB */
    private final Bundle f15818kB;

    /* renamed from: kC */
    private final boolean f15819kC;

    /* renamed from: ky */
    private final int f15820ky;

    /* renamed from: kz */
    private final ArrayList<C3807x> f15821kz;

    public C3761cq(int i, ArrayList<C3807x> arrayList, ArrayList<C3807x> arrayList2, Bundle bundle, boolean z, int i2) {
        this.f15816ab = i;
        this.f15821kz = arrayList;
        this.f15817kA = arrayList2;
        this.f15818kB = bundle;
        this.f15819kC = z;
        this.f15820ky = i2;
    }

    /* renamed from: cJ */
    public int mo12297cJ() {
        return this.f15820ky;
    }

    /* renamed from: cK */
    public ArrayList<C3807x> mo12298cK() {
        return this.f15821kz;
    }

    /* renamed from: cL */
    public ArrayList<C3807x> mo12299cL() {
        return this.f15817kA;
    }

    /* renamed from: cM */
    public Bundle mo12300cM() {
        return this.f15818kB;
    }

    /* renamed from: cN */
    public boolean mo12301cN() {
        return this.f15819kC;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3761cq)) {
            return false;
        }
        C3761cq cqVar = (C3761cq) obj;
        return this.f15816ab == cqVar.f15816ab && C3799r.m16669a(this.f15821kz, cqVar.f15821kz) && C3799r.m16669a(this.f15817kA, cqVar.f15817kA) && C3799r.m16669a(this.f15818kB, cqVar.f15818kB) && C3799r.m16669a(Integer.valueOf(this.f15820ky), Integer.valueOf(cqVar.f15820ky));
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.f15816ab), this.f15821kz, this.f15817kA, this.f15818kB, Integer.valueOf(this.f15820ky));
    }

    /* renamed from: i */
    public int mo12305i() {
        return this.f15816ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3762cr.m16535a(this, parcel, i);
    }
}
