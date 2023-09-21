package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.func.C1416aY;

public class ActionAddPromotion extends ParcelableAction {
    public static final Parcelable.Creator<ActionAddPromotion> CREATOR = new C1093a();

    /* renamed from: a */
    private String f3095a;

    /* renamed from: b */
    private String f3096b;

    public ActionAddPromotion(String str, String str2) {
        this.f3095a = str;
        this.f3096b = str2;
    }

    public ActionAddPromotion(Parcel parcel) {
        this.f3095a = parcel.readString();
        this.f3096b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3095a);
        parcel.writeString(this.f3096b);
    }

    public void run() {
        C1416aY.m6654a(this.f3095a, this.f3096b);
    }
}
