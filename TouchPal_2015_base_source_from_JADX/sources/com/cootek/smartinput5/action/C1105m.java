package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.m */
/* compiled from: ActionStopBatchDownloadMode */
final class C1105m implements Parcelable.Creator<ActionStopBatchDownloadMode> {
    C1105m() {
    }

    /* renamed from: a */
    public ActionStopBatchDownloadMode[] newArray(int i) {
        return new ActionStopBatchDownloadMode[i];
    }

    /* renamed from: a */
    public ActionStopBatchDownloadMode createFromParcel(Parcel parcel) {
        return new ActionStopBatchDownloadMode(parcel);
    }
}
