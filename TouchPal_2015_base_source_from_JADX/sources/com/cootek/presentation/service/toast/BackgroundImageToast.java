package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class BackgroundImageToast extends PresentToast {
    public static final Parcelable.Creator<BackgroundImageToast> CREATOR = new Parcelable.Creator<BackgroundImageToast>() {
        public BackgroundImageToast createFromParcel(Parcel parcel) {
            return new BackgroundImageToast(parcel);
        }

        public BackgroundImageToast[] newArray(int i) {
            return new BackgroundImageToast[i];
        }
    };
    private static final int IMAGE_DEFAULT = 0;
    private static final int IMAGE_EVENT = 1;
    private String endTime;
    private int imageType;
    private String startTime;

    public BackgroundImageToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_IMAGE_TYPE);
        if (attributeValue == null) {
            this.imageType = 0;
        } else if (attributeValue.equalsIgnoreCase("default")) {
            this.imageType = 0;
        } else if (attributeValue.equalsIgnoreCase("event")) {
            this.imageType = 1;
        } else {
            this.imageType = 0;
            throw new IllegalArgumentException(PresentConfigXmlTag.TOAST_ATTR_IMAGE_TYPE);
        }
        if (this.imageType == 1) {
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_START_TIME);
            if (attributeValue2 != null) {
                this.startTime = attributeValue2;
            }
            String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_END_TIME);
            if (attributeValue3 != null) {
                this.endTime = attributeValue3;
            }
        }
    }

    public BackgroundImageToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
        this.imageType = parcel.readInt();
        if (this.imageType == 1) {
            this.startTime = parcel.readString();
            this.endTime = parcel.readString();
        }
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
        parcel.writeInt(this.imageType);
        if (this.imageType == 1) {
            parcel.writeString(this.startTime);
            parcel.writeString(this.endTime);
        }
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
        if (PresentationSystem.DUMPINFO) {
            StringBuilder sb = new StringBuilder();
            sb.append("imageType: ");
            sb.append(this.imageType);
            if (this.imageType == 1) {
                sb.append(" startTime: ");
                sb.append(this.startTime);
                sb.append(" endTime: ");
                sb.append(this.endTime);
            }
            sb.append(C0911j.f2473c);
            Log.d("Noah", sb.toString());
        }
    }

    public int getImageType() {
        return this.imageType;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
}
