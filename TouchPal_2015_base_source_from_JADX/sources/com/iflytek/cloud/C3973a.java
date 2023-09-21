package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.iflytek.cloud.a */
final class C3973a implements Parcelable.Creator<RecognizerResult> {
    C3973a() {
    }

    /* renamed from: a */
    public RecognizerResult createFromParcel(Parcel parcel) {
        return new RecognizerResult(parcel);
    }

    /* renamed from: a */
    public RecognizerResult[] newArray(int i) {
        return new RecognizerResult[i];
    }
}
