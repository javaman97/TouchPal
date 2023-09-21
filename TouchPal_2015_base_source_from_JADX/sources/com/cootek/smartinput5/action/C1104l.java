package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.l */
/* compiled from: ActionStartBatchDownloadMode */
final class C1104l implements Parcelable.Creator<ActionStartBatchDownloadMode> {
    C1104l() {
    }

    /* renamed from: a */
    public ActionStartBatchDownloadMode[] newArray(int i) {
        return new ActionStartBatchDownloadMode[i];
    }

    /* renamed from: a */
    public ActionStartBatchDownloadMode createFromParcel(Parcel parcel) {
        return new ActionStartBatchDownloadMode(parcel);
    }
}
