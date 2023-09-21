package com.cootek.presentation.service.toast;

import android.os.Parcel;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class BannerAdsToast extends PresentToast {
    public static final int AD_TYPE_APK_RECOMMEND = 1;
    public static final int AD_TYPE_HYPER_LINK = 2;
    public static final int AD_TYPE_XXX = 3;
    public String adType;
    public String toastCategory;

    public BannerAdsToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
    }

    public BannerAdsToast(Parcel parcel) {
        super(parcel);
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
    }

    /* access modifiers changed from: protected */
    public void onShown() {
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
    }
}
