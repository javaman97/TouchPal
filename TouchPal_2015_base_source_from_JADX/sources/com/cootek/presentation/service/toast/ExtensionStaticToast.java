package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class ExtensionStaticToast extends PresentToast {
    public static final Parcelable.Creator<ExtensionStaticToast> CREATOR = new Parcelable.Creator<ExtensionStaticToast>() {
        public ExtensionStaticToast createFromParcel(Parcel parcel) {
            return new ExtensionStaticToast(parcel);
        }

        public ExtensionStaticToast[] newArray(int i) {
            return new ExtensionStaticToast[i];
        }
    };
    private int mExtensionPosition = -1;
    private String mGuidePointId;

    public ExtensionStaticToast(Parcel parcel) {
        super(parcel);
    }

    public ExtensionStaticToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_GUIDE_POINT_ID);
        if (attributeValue != null) {
            this.mGuidePointId = attributeValue;
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_EXTENSION_POSITION);
            if (attributeValue2 != null) {
                this.mExtensionPosition = Integer.parseInt(attributeValue2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(PresentConfigXmlTag.TOAST_ATTR_GUIDE_POINT_ID);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
        this.mGuidePointId = parcel.readString();
        this.mExtensionPosition = parcel.readInt();
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
        parcel.writeString(this.mGuidePointId);
        parcel.writeInt(this.mExtensionPosition);
    }

    public String getGuidePointId() {
        return this.mGuidePointId;
    }

    public int getExtensionPosition() {
        return this.mExtensionPosition;
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
            Log.d("Noah", "guidePointId: " + this.mGuidePointId);
        }
    }

    public void postParse(XmlPullParser xmlPullParser) {
    }
}
