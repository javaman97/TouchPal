package com.cootek.presentation.service.feature;

import android.content.pm.PackageInfo;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class AppPromoteFeature extends PresentFeature {
    private static final String TAG = "AppPromoteFeature";
    public String packageName;
    public int packageOldVersion;

    public AppPromoteFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        this.packageName = xmlPullParser.getAttributeValue((String) null, "packageName");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_PACKAGE_OLD_VRESION);
        if (attributeValue != null) {
            try {
                this.packageOldVersion = Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                this.packageOldVersion = 0;
                throw e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean matchSpecial(String str) {
        PackageInfo packageInfo;
        if (this.packageName == null || (packageInfo = PresentationSystem.getInstance().getPackageInfo(this.packageName)) == null || packageInfo.versionCode <= this.packageOldVersion) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("packageName: ");
        stringBuffer.append(this.packageName);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("packageOldVersion: ");
        stringBuffer.append(this.packageOldVersion);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, stringBuffer.toString());
        }
    }
}
