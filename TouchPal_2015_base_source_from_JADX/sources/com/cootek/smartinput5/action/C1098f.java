package com.cootek.smartinput5.action;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.action.f */
/* compiled from: ActionDownloadEmojiPack */
final class C1098f implements Parcelable.Creator<ActionDownloadEmojiPack> {
    C1098f() {
    }

    /* renamed from: a */
    public ActionDownloadEmojiPack[] newArray(int i) {
        return new ActionDownloadEmojiPack[i];
    }

    /* renamed from: a */
    public ActionDownloadEmojiPack createFromParcel(Parcel parcel) {
        return new ActionDownloadEmojiPack(parcel);
    }
}
