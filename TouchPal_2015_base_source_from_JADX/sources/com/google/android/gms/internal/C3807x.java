package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: com.google.android.gms.internal.x */
public final class C3807x implements SafeParcelable {
    public static final C3808y CREATOR = new C3808y();

    /* renamed from: aJ */
    private final int f15903aJ;

    /* renamed from: ab */
    private final int f15904ab;

    /* renamed from: ci */
    private final int f15905ci;

    /* renamed from: cj */
    private final String f15906cj;

    /* renamed from: ck */
    private final String f15907ck;

    /* renamed from: cl */
    private final String f15908cl;

    /* renamed from: cm */
    private final String f15909cm;

    public C3807x(int i, int i2, int i3, String str, String str2, String str3, String str4) {
        this.f15904ab = i;
        this.f15903aJ = i2;
        this.f15905ci = i3;
        this.f15906cj = str;
        this.f15907ck = str2;
        this.f15908cl = str3;
        this.f15909cm = str4;
    }

    /* renamed from: I */
    public int mo12424I() {
        return this.f15905ci;
    }

    /* renamed from: J */
    public String mo12425J() {
        return this.f15906cj;
    }

    /* renamed from: K */
    public String mo12426K() {
        return this.f15907ck;
    }

    /* renamed from: L */
    public String mo12427L() {
        return this.f15909cm;
    }

    /* renamed from: M */
    public boolean mo12428M() {
        return this.f15903aJ == 1 && this.f15905ci == -1;
    }

    /* renamed from: N */
    public boolean mo12429N() {
        return this.f15903aJ == 2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3807x)) {
            return false;
        }
        C3807x xVar = (C3807x) obj;
        return this.f15904ab == xVar.f15904ab && this.f15903aJ == xVar.f15903aJ && this.f15905ci == xVar.f15905ci && C3799r.m16669a(this.f15906cj, xVar.f15906cj) && C3799r.m16669a(this.f15907ck, xVar.f15907ck);
    }

    public String getDisplayName() {
        return this.f15908cl;
    }

    public int getType() {
        return this.f15903aJ;
    }

    public int hashCode() {
        return C3799r.hashCode(Integer.valueOf(this.f15904ab), Integer.valueOf(this.f15903aJ), Integer.valueOf(this.f15905ci), this.f15906cj, this.f15907ck);
    }

    /* renamed from: i */
    public int mo12435i() {
        return this.f15904ab;
    }

    public String toString() {
        if (mo12429N()) {
            return String.format("Person [%s] %s", new Object[]{mo12426K(), getDisplayName()});
        } else if (mo12428M()) {
            return String.format("Circle [%s] %s", new Object[]{mo12425J(), getDisplayName()});
        } else {
            return String.format("Group [%s] %s", new Object[]{mo12425J(), getDisplayName()});
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C3808y.m16697a(this, parcel, i);
    }
}
