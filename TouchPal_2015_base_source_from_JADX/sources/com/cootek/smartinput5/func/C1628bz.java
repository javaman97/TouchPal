package com.cootek.smartinput5.func;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.smartinput5.func.TypingSpeedData;

/* renamed from: com.cootek.smartinput5.func.bz */
/* compiled from: TypingSpeedData */
final class C1628bz implements Parcelable.Creator {
    C1628bz() {
    }

    /* renamed from: a */
    public TypingSpeedData.Meta createFromParcel(Parcel parcel) {
        return new TypingSpeedData.Meta(parcel);
    }

    /* renamed from: a */
    public TypingSpeedData.Meta[] newArray(int i) {
        return new TypingSpeedData.Meta[i];
    }
}
