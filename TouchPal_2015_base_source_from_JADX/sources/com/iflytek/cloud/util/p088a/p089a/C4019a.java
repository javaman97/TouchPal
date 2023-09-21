package com.iflytek.cloud.util.p088a.p089a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.iflytek.cloud.util.a.a.a */
public class C4019a implements Parcelable {
    public static final Parcelable.Creator<C4019a> CREATOR = new C4020b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f16416a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f16417b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f16418c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f16419d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f16420e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f16421f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f16422g = null;

    public C4019a() {
    }

    public C4019a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f16416a = str;
        this.f16417b = str2;
        this.f16418c = str3;
        this.f16419d = str4;
        this.f16420e = str5;
        this.f16422g = str6;
    }

    /* renamed from: a */
    public String mo14760a() {
        return this.f16416a;
    }

    /* renamed from: b */
    public String mo14761b() {
        return this.f16417b;
    }

    /* renamed from: c */
    public String mo14762c() {
        return this.f16419d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16416a);
        parcel.writeString(this.f16417b);
        parcel.writeString(this.f16418c);
        parcel.writeString(this.f16419d);
        parcel.writeString(this.f16420e);
        parcel.writeString(this.f16421f);
        parcel.writeString(this.f16422g);
    }
}
