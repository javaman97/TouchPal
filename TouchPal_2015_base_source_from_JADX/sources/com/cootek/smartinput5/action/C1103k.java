package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.k */
/* compiled from: ActionSetSkin */
final class C1103k implements Parcelable.Creator<ActionSetSkin> {
    C1103k() {
    }

    /* renamed from: a */
    public ActionSetSkin[] newArray(int i) {
        return new ActionSetSkin[i];
    }

    /* renamed from: a */
    public ActionSetSkin createFromParcel(Parcel parcel) {
        return new ActionSetSkin(parcel);
    }
}
