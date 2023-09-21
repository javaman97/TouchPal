package com.cootek.smartinput5.func;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.cootek.smartinput5.func.by */
/* compiled from: TypingSpeedData */
final class C1627by implements Parcelable.Creator {
    C1627by() {
    }

    /* renamed from: a */
    public TypingSpeedData createFromParcel(Parcel parcel) {
        return new TypingSpeedData(parcel);
    }

    /* renamed from: a */
    public TypingSpeedData[] newArray(int i) {
        return new TypingSpeedData[i];
    }
}
