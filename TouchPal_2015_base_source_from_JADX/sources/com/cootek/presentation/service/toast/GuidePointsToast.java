package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class GuidePointsToast extends PresentToast {
    public static final Parcelable.Creator<GuidePointsToast> CREATOR = new Parcelable.Creator<GuidePointsToast>() {
        public GuidePointsToast createFromParcel(Parcel parcel) {
            return new GuidePointsToast(parcel);
        }

        public GuidePointsToast[] newArray(int i) {
            return new GuidePointsToast[i];
        }
    };
    private GuidePointTree mTree;

    public GuidePointsToast(Parcel parcel) {
        super(parcel);
    }

    public GuidePointsToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
    }

    public void postParse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getName().equals(PresentConfigXmlTag.GUIDE_POINTS_GROUP)) {
            this.mTree = new GuidePointTree(getId(), xmlPullParser);
        }
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

    public int getChildrenCount(String str) {
        if (this.mTree == null) {
            return 0;
        }
        return this.mTree.childrenCount(str);
    }

    public int getGuideType(String str) {
        if (this.mTree == null) {
            return 0;
        }
        return this.mTree.getType(str);
    }

    public void clicked(String str) {
        if (this.mTree != null) {
            this.mTree.clicked(str);
        }
    }

    public void shown(String str) {
        if (this.mTree != null) {
            this.mTree.shown(str);
        }
    }
}
