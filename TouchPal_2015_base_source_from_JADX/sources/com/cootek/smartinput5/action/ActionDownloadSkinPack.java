package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p066ui.settings.SkinInfoHandler;

public class ActionDownloadSkinPack extends ParcelableAction {
    public static final Parcelable.Creator<ActionDownloadSkinPack> CREATOR = new C1100h();

    /* renamed from: a */
    private String f3114a;

    /* renamed from: b */
    private String f3115b;

    /* renamed from: c */
    private String f3116c;

    public ActionDownloadSkinPack(String str, String str2) {
        this(str, "", str2);
    }

    public ActionDownloadSkinPack(String str, String str2, String str3) {
        this.f3114a = str;
        this.f3115b = str2;
        this.f3116c = str3;
    }

    ActionDownloadSkinPack(Parcel parcel) {
        this.f3114a = parcel.readString();
        this.f3115b = parcel.readString();
        this.f3116c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3114a);
        parcel.writeString(this.f3115b);
        parcel.writeString(this.f3116c);
    }

    public void run() {
        if (TextUtils.isEmpty(this.f3115b)) {
            C2361q.m10797b().mo7999a(this.f3114a, this.f3116c);
            return;
        }
        SkinInfoHandler skinInfoHandler = new SkinInfoHandler(C1368X.m6313b(), (WebView) null);
        if (C1368X.m6324d() && skinInfoHandler != null) {
            skinInfoHandler.downloadPackage(this.f3114a, this.f3115b, this.f3116c);
        }
    }
}
