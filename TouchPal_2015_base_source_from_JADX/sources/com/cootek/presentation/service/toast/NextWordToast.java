package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import org.xmlpull.v1.XmlPullParser;

public class NextWordToast extends PresentToast {
    public static final Parcelable.Creator<NextWordToast> CREATOR = new Parcelable.Creator<NextWordToast>() {
        public NextWordToast createFromParcel(Parcel parcel) {
            return new NextWordToast(parcel);
        }

        public NextWordToast[] newArray(int i) {
            return new NextWordToast[i];
        }
    };

    public NextWordToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public NextWordToast(Parcel parcel) {
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
