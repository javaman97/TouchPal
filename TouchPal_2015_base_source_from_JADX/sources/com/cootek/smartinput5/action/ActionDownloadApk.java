package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.net.C2361q;

public class ActionDownloadApk extends ParcelableAction {
    public static final Parcelable.Creator<ActionDownloadApk> CREATOR = new C1096d();

    /* renamed from: a */
    private String f3106a;

    /* renamed from: b */
    private String f3107b;

    /* renamed from: c */
    private String f3108c;

    public ActionDownloadApk(String str, String str2, String str3) {
        this.f3106a = str;
        this.f3107b = str2;
        this.f3108c = str3;
    }

    public ActionDownloadApk(Parcel parcel) {
        this.f3106a = parcel.readString();
        this.f3107b = parcel.readString();
        this.f3108c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3106a);
        parcel.writeString(this.f3107b);
        parcel.writeString(this.f3108c);
    }

    public void run() {
        C2361q.m10797b().mo8025k(this.f3106a, this.f3107b, this.f3108c);
    }
}
