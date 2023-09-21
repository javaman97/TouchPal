package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.e */
/* compiled from: ActionDownloadCellPack */
final class C1097e implements Parcelable.Creator<ActionDownloadCellPack> {
    C1097e() {
    }

    /* renamed from: a */
    public ActionDownloadCellPack[] newArray(int i) {
        return new ActionDownloadCellPack[i];
    }

    /* renamed from: a */
    public ActionDownloadCellPack createFromParcel(Parcel parcel) {
        return new ActionDownloadCellPack(parcel);
    }
}
