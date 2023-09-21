package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class FreecallHangupToast extends PresentToast {
    public static final Parcelable.Creator<FreecallHangupToast> CREATOR = new Parcelable.Creator<FreecallHangupToast>() {
        public FreecallHangupToast createFromParcel(Parcel parcel) {
            return new FreecallHangupToast(parcel);
        }

        public FreecallHangupToast[] newArray(int i) {
            return new FreecallHangupToast[i];
        }
    };
    private static final int TYPE_STRONG = 1;
    private static final int TYPE_WEAK = 0;
    private int mType;

    public FreecallHangupToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "type");
        if (attributeValue == null) {
            this.mType = 0;
        } else if (attributeValue.equalsIgnoreCase("weak")) {
            this.mType = 0;
        } else if (attributeValue.equalsIgnoreCase("strong")) {
            this.mType = 1;
        } else {
            this.mType = 0;
        }
    }

    public FreecallHangupToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
        this.mType = parcel.readInt();
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
        parcel.writeInt(this.mType);
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
            Log.d("Noah", "type: " + this.mType);
        }
    }

    public int getType() {
        return this.mType;
    }
}
