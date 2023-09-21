package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

public class RecognizerResult implements Parcelable {
    public static final Parcelable.Creator<RecognizerResult> CREATOR = new C3973a();

    /* renamed from: a */
    private String f16232a = "";

    public RecognizerResult(Parcel parcel) {
        this.f16232a = parcel.readString();
    }

    public RecognizerResult(String str) {
        if (str != null) {
            this.f16232a = str;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.f16232a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16232a);
    }
}
