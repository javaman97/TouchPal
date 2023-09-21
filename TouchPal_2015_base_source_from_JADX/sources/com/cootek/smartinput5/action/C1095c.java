package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.c */
/* compiled from: ActionCollectData */
final class C1095c implements Parcelable.Creator<ActionCollectData> {
    C1095c() {
    }

    /* renamed from: a */
    public ActionCollectData[] newArray(int i) {
        return new ActionCollectData[i];
    }

    /* renamed from: a */
    public ActionCollectData createFromParcel(Parcel parcel) {
        return new ActionCollectData(parcel);
    }
}
