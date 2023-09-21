package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.co */
public class C3759co implements SafeParcelable {
    public static final C3760cp CREATOR = new C3760cp();

    /* renamed from: ab */
    private final int f15805ab;

    /* renamed from: jh */
    private final String f15806jh;

    /* renamed from: kq */
    private final List<C3807x> f15807kq;

    /* renamed from: kr */
    private final List<Uri> f15808kr;

    /* renamed from: ks */
    private final Uri f15809ks;

    /* renamed from: kt */
    private final String f15810kt;

    /* renamed from: ku */
    private final String f15811ku;

    /* renamed from: kv */
    private final String f15812kv;

    /* renamed from: kw */
    private final Bundle f15813kw;

    /* renamed from: kx */
    private final Bundle f15814kx;

    /* renamed from: ky */
    private final int f15815ky;

    public C3759co(int i, String str, List<C3807x> list, List<Uri> list2, Uri uri, String str2, String str3, String str4, Bundle bundle, Bundle bundle2, int i2) {
        this.f15805ab = i;
        this.f15806jh = str;
        this.f15807kq = list;
        this.f15808kr = list2;
        this.f15809ks = uri;
        this.f15810kt = str2;
        this.f15811ku = str3;
        this.f15812kv = str4;
        this.f15813kw = bundle;
        this.f15814kx = bundle2;
        this.f15815ky = i2;
    }

    /* renamed from: cB */
    public List<C3807x> mo12278cB() {
        return this.f15807kq;
    }

    /* renamed from: cC */
    public List<Uri> mo12279cC() {
        return this.f15808kr;
    }

    /* renamed from: cD */
    public Uri mo12280cD() {
        return this.f15809ks;
    }

    /* renamed from: cE */
    public String mo12281cE() {
        return this.f15810kt;
    }

    /* renamed from: cF */
    public String mo12282cF() {
        return this.f15811ku;
    }

    /* renamed from: cG */
    public String mo12283cG() {
        return this.f15812kv;
    }

    /* renamed from: cH */
    public Bundle mo12284cH() {
        return this.f15813kw;
    }

    /* renamed from: cI */
    public Bundle mo12285cI() {
        return this.f15814kx;
    }

    /* renamed from: cJ */
    public int mo12286cJ() {
        return this.f15815ky;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3759co)) {
            return false;
        }
        C3759co coVar = (C3759co) obj;
        return this.f15805ab == coVar.f15805ab && C3799r.m16669a(this.f15807kq, coVar.f15807kq) && C3799r.m16669a(this.f15808kr, coVar.f15808kr) && C3799r.m16669a(this.f15809ks, coVar.f15809ks) && C3799r.m16669a(this.f15810kt, coVar.f15810kt) && C3799r.m16669a(this.f15811ku, coVar.f15811ku) && C3799r.m16669a(this.f15812kv, coVar.f15812kv);
    }

    public String getId() {
        return this.f15806jh;
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.f15805ab), this.f15807kq, this.f15808kr, this.f15809ks, this.f15810kt, this.f15811ku, this.f15812kv);
    }

    /* renamed from: i */
    public int mo12291i() {
        return this.f15805ab;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3760cp.m16526a(this, parcel, i);
    }
}
