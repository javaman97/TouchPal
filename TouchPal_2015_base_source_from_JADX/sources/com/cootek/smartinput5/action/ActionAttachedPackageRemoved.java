package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1811k;

public class ActionAttachedPackageRemoved extends ParcelableAction {
    public static final Parcelable.Creator<ActionAttachedPackageRemoved> CREATOR = new C1094b();

    /* renamed from: a */
    private String f3097a;

    public ActionAttachedPackageRemoved(String str) {
        this.f3097a = str;
    }

    ActionAttachedPackageRemoved(Parcel parcel) {
        this.f3097a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3097a);
    }

    public void run() {
        if (!TextUtils.isEmpty(this.f3097a)) {
            C1811k.m8322a().mo6819a(this.f3097a, false);
        }
    }
}
