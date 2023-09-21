package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import org.xmlpull.v1.XmlPullParser;

public class StartupToast extends PresentToast {
    public static final Parcelable.Creator<StartupToast> CREATOR = new Parcelable.Creator<StartupToast>() {
        public StartupToast createFromParcel(Parcel parcel) {
            return new StartupToast(parcel);
        }

        public StartupToast[] newArray(int i) {
            return new StartupToast[i];
        }
    };

    public StartupToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public StartupToast(Parcel parcel) {
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
        PresentationSystem.getInstance().getHistoryManager().setLastStartupPresentTime(SystemFacade.currentTimeMillis());
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
