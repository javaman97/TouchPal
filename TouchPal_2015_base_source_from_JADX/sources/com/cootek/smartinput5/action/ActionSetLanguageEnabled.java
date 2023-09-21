package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1498a;

public class ActionSetLanguageEnabled extends ParcelableAction {
    public static final Parcelable.Creator<ActionSetLanguageEnabled> CREATOR = new C1102j();

    /* renamed from: a */
    private String f3120a;

    /* renamed from: b */
    private boolean f3121b;

    public ActionSetLanguageEnabled(String str, boolean z) {
        this.f3120a = str;
        this.f3121b = z;
    }

    ActionSetLanguageEnabled(Parcel parcel) {
        this.f3120a = parcel.readString();
        this.f3121b = parcel.readInt() != 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3120a);
        parcel.writeInt(this.f3121b ? 1 : 0);
    }

    public void run() {
        C1498a l;
        if (!TextUtils.isEmpty(this.f3120a) && (l = C1368X.m6320c().mo5842o().mo5954l(this.f3120a)) != null) {
            l.mo6151a(this.f3121b);
        }
    }
}
