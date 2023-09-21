package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.h */
/* compiled from: ActionDownloadSkinPack */
final class C1100h implements Parcelable.Creator<ActionDownloadSkinPack> {
    C1100h() {
    }

    /* renamed from: a */
    public ActionDownloadSkinPack[] newArray(int i) {
        return new ActionDownloadSkinPack[i];
    }

    /* renamed from: a */
    public ActionDownloadSkinPack createFromParcel(Parcel parcel) {
        return new ActionDownloadSkinPack(parcel);
    }
}
