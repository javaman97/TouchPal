package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.bv */
public class C3721bv implements SafeParcelable {
    public static final C3722bw CREATOR = new C3722bw();

    /* renamed from: ab */
    private final int f15636ab;

    /* renamed from: di */
    private final String f15637di;

    /* renamed from: iA */
    private final ArrayList<C3807x> f15638iA;

    /* renamed from: iB */
    private final boolean f15639iB;

    /* renamed from: iz */
    private final ArrayList<C3807x> f15640iz;

    public C3721bv(int i, String str, ArrayList<C3807x> arrayList, ArrayList<C3807x> arrayList2, boolean z) {
        this.f15636ab = i;
        this.f15637di = str;
        this.f15640iz = arrayList;
        this.f15638iA = arrayList2;
        this.f15639iB = z;
    }

    /* renamed from: bE */
    public ArrayList<C3807x> mo11859bE() {
        return this.f15640iz;
    }

    /* renamed from: bF */
    public ArrayList<C3807x> mo11860bF() {
        return this.f15638iA;
    }

    /* renamed from: bG */
    public boolean mo11861bG() {
        return this.f15639iB;
    }

    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.f15637di;
    }

    /* renamed from: i */
    public int mo11864i() {
        return this.f15636ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3722bw.m16326a(this, parcel, i);
    }
}
