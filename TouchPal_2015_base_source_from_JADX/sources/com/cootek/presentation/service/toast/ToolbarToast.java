package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import org.xmlpull.v1.XmlPullParser;

public class ToolbarToast extends PresentToast {
    public static final Parcelable.Creator<ToolbarToast> CREATOR = new Parcelable.Creator<ToolbarToast>() {
        public ToolbarToast createFromParcel(Parcel parcel) {
            return new ToolbarToast(parcel);
        }

        public ToolbarToast[] newArray(int i) {
            return new ToolbarToast[i];
        }
    };

    public ToolbarToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public ToolbarToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void onClicked() {
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        PresentationSystem.getInstance().getHistoryManager().setLastToolbarPresentTime(SystemFacade.currentTimeMillis());
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
