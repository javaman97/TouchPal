package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.j */
/* compiled from: ActionSetLanguageEnabled */
final class C1102j implements Parcelable.Creator<ActionSetLanguageEnabled> {
    C1102j() {
    }

    /* renamed from: a */
    public ActionSetLanguageEnabled[] newArray(int i) {
        return new ActionSetLanguageEnabled[i];
    }

    /* renamed from: a */
    public ActionSetLanguageEnabled createFromParcel(Parcel parcel) {
        return new ActionSetLanguageEnabled(parcel);
    }
}
