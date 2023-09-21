package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.i */
/* compiled from: ActionOnFileDownloaded */
final class C1101i implements Parcelable.Creator<ActionOnFileDownloaded> {
    C1101i() {
    }

    /* renamed from: a */
    public ActionOnFileDownloaded[] newArray(int i) {
        return new ActionOnFileDownloaded[i];
    }

    /* renamed from: a */
    public ActionOnFileDownloaded createFromParcel(Parcel parcel) {
        return new ActionOnFileDownloaded(parcel);
    }
}
