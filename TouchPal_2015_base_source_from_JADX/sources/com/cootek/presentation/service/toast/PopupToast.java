package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PopupToast extends PresentToast {
    public static final Parcelable.Creator<PopupToast> CREATOR = new Parcelable.Creator<PopupToast>() {
        public PopupToast createFromParcel(Parcel parcel) {
            return new PopupToast(parcel);
        }

        public PopupToast[] newArray(int i) {
            return new PopupToast[i];
        }
    };

    public PopupToast(Parcel parcel) {
        super(parcel);
    }

    public PopupToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
    }

    public void postParse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
}
