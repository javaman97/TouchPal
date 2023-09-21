package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class FullscreenToast extends PresentToast {
    public static final Parcelable.Creator<FullscreenToast> CREATOR = new Parcelable.Creator<FullscreenToast>() {
        public FullscreenToast createFromParcel(Parcel parcel) {
            return new FullscreenToast(parcel);
        }

        public FullscreenToast[] newArray(int i) {
            return new FullscreenToast[i];
        }
    };
    public String showPath;

    public FullscreenToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
    }

    public FullscreenToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
        this.showPath = parcel.readString();
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
        parcel.writeString(this.showPath);
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

    public boolean canShow() {
        boolean canShow = super.canShow();
        if (canShow && TextUtils.isEmpty(this.showPath)) {
            this.showPath = getShowPath(getDownloadFilePathInner());
        }
        return canShow;
    }

    private String getShowPath(String str) {
        if (str.endsWith(PresentConfigXmlTag.POSTFIX_FILE_PATH_HTML)) {
            return str;
        }
        return String.format("%s/%s", new Object[]{str, PresentConfigXmlTag.FULLSCREEN_URL_NAME});
    }

    public void postParse(XmlPullParser xmlPullParser) {
    }
}
