package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import org.xmlpull.v1.XmlPullParser;

public class CloudInputToast extends PresentToast {
    public static final Parcelable.Creator<CloudInputToast> CREATOR = new Parcelable.Creator<CloudInputToast>() {
        public CloudInputToast createFromParcel(Parcel parcel) {
            return new CloudInputToast(parcel);
        }

        public CloudInputToast[] newArray(int i) {
            return new CloudInputToast[i];
        }
    };

    public CloudInputToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public CloudInputToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void onClicked() {
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
    }

    /* access modifiers changed from: protected */
    public void onShown() {
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
    }

    public void postParse(XmlPullParser xmlPullParser) {
    }
}
