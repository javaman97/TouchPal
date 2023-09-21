package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class StatusbarToast extends PresentToast {
    public static final Parcelable.Creator<StatusbarToast> CREATOR = new Parcelable.Creator<StatusbarToast>() {
        public StatusbarToast createFromParcel(Parcel parcel) {
            return new StatusbarToast(parcel);
        }

        public StatusbarToast[] newArray(int i) {
            return new StatusbarToast[i];
        }
    };
    public boolean showLogo;

    public StatusbarToast(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_SHOW_LOGO);
        if (attributeValue != null) {
            this.showLogo = Boolean.parseBoolean(attributeValue);
        } else {
            this.showLogo = true;
        }
    }

    public StatusbarToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void onClicked() {
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        PresentationSystem.getInstance().getHistoryManager().setLastStatusbarPresentTime(SystemFacade.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    public void onShown() {
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(PresentConfigXmlTag.TOAST_ATTR_SHOW_LOGO);
        stringBuffer.append(this.showLogo);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i("PresentToast", stringBuffer.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
        boolean z = true;
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.showLogo = z;
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.showLogo ? 1 : 0));
    }

    public void postParse(XmlPullParser xmlPullParser) {
    }
}
