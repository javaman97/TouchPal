package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.C3799r;

/* renamed from: com.google.android.gms.plus.a */
public class C3932a implements SafeParcelable {
    public static final C3933b CREATOR = new C3933b();

    /* renamed from: ab */
    private final int f16140ab;

    /* renamed from: g */
    private final String f16141g;

    /* renamed from: hY */
    private final String[] f16142hY;

    /* renamed from: hZ */
    private final String f16143hZ;

    /* renamed from: ia */
    private final String f16144ia;

    /* renamed from: ib */
    private final String f16145ib;

    /* renamed from: ik */
    private final String[] f16146ik;

    /* renamed from: il */
    private final String[] f16147il;

    public C3932a(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f16140ab = i;
        this.f16141g = str;
        this.f16146ik = strArr;
        this.f16147il = strArr2;
        this.f16142hY = strArr3;
        this.f16143hZ = str2;
        this.f16144ia = str3;
        this.f16145ib = str4;
    }

    public C3932a(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4) {
        this.f16140ab = 1;
        this.f16141g = str;
        this.f16146ik = strArr;
        this.f16147il = strArr2;
        this.f16142hY = strArr3;
        this.f16143hZ = str2;
        this.f16144ia = str3;
        this.f16145ib = str4;
    }

    /* renamed from: bA */
    public String[] mo13288bA() {
        return this.f16142hY;
    }

    /* renamed from: bB */
    public String mo13289bB() {
        return this.f16143hZ;
    }

    /* renamed from: bC */
    public String mo13290bC() {
        return this.f16144ia;
    }

    /* renamed from: bD */
    public String mo13291bD() {
        return this.f16145ib;
    }

    /* renamed from: by */
    public String[] mo13292by() {
        return this.f16146ik;
    }

    /* renamed from: bz */
    public String[] mo13293bz() {
        return this.f16147il;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3932a)) {
            return false;
        }
        C3932a aVar = (C3932a) obj;
        return this.f16140ab == aVar.f16140ab && C3799r.m16669a(this.f16141g, aVar.f16141g) && C3799r.m16669a(this.f16146ik, aVar.f16146ik) && C3799r.m16669a(this.f16147il, aVar.f16147il) && C3799r.m16669a(this.f16142hY, aVar.f16142hY) && C3799r.m16669a(this.f16143hZ, aVar.f16143hZ) && C3799r.m16669a(this.f16144ia, aVar.f16144ia) && C3799r.m16669a(this.f16145ib, aVar.f16145ib);
    }

    public String getAccountName() {
        return this.f16141g;
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.f16140ab), this.f16141g, this.f16146ik, this.f16147il, this.f16142hY, this.f16143hZ, this.f16144ia, this.f16145ib);
    }

    /* renamed from: i */
    public int mo13298i() {
        return this.f16140ab;
    }

    public String toString() {
        return C3799r.m16670c(this).mo12413a("versionCode", Integer.valueOf(this.f16140ab)).mo12413a("accountName", this.f16141g).mo12413a("requestedScopes", this.f16146ik).mo12413a("visibleActivities", this.f16147il).mo12413a("requiredFeatures", this.f16142hY).mo12413a("packageNameForAuth", this.f16143hZ).mo12413a("callingPackageName", this.f16144ia).mo12413a("applicationName", this.f16145ib).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3933b.m16919a(this, parcel, i);
    }
}
