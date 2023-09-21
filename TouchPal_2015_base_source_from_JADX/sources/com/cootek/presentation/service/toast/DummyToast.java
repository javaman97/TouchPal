package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import org.xmlpull.v1.XmlPullParser;

public class DummyToast extends PresentToast {
    public static final Parcelable.Creator<DummyToast> CREATOR = new Parcelable.Creator<DummyToast>() {
        public DummyToast createFromParcel(Parcel parcel) {
            return new DummyToast(parcel);
        }

        public DummyToast[] newArray(int i) {
            return new DummyToast[i];
        }
    };

    public DummyToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public DummyToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
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

    public void postParse(XmlPullParser xmlPullParser) {
    }
}
