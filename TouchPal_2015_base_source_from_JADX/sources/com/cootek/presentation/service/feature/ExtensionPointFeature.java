package com.cootek.presentation.service.feature;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class ExtensionPointFeature extends AppPromoteFeature {
    public static String TAG = "ExtentsionPointFeature";
    private String mExtensionConditions = null;
    private String mExtensionPoint;

    public ExtensionPointFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_EXTENSION_POINT);
        if (attributeValue != null) {
            this.mExtensionPoint = attributeValue;
            String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_EXTENSION_CONDITIONS);
            if (attributeValue2 != null) {
                this.mExtensionConditions = attributeValue2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(PresentConfigXmlTag.FEATURE_ATTR_EXTENSION_POINT);
    }

    /* access modifiers changed from: protected */
    public boolean matchSpecial(String str) {
        if (!super.matchSpecial(str) || !TextUtils.equals(str, this.mExtensionPoint)) {
            return false;
        }
        if (this.mExtensionConditions == null) {
            return true;
        }
        try {
            return PresentationSystem.getInstance().getNativeAppInfo().canExtend(this.mExtensionPoint, this.mExtensionConditions);
        } catch (RemoteException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        if (PresentationSystem.DUMPINFO) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("extensionPoint: ");
            stringBuffer.append(this.mExtensionPoint);
            stringBuffer.append(C0911j.f2473c);
            Log.i(TAG, stringBuffer.toString());
        }
    }
}
