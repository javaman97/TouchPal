package com.cootek.presentation.service.feature;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class UpdateProgramFeature extends PresentFeature {
    int latestVersion;
    String packageName;

    public UpdateProgramFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException, XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.require(2, (String) null, PresentConfigXmlTag.FEATURE_ROOT_UPDATE_PROGRAM);
        this.packageName = xmlPullParser.getAttributeValue((String) null, "packageName");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_LATEST_VERSTION);
        if (attributeValue != null) {
            try {
                this.latestVersion = Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                this.latestVersion = 0;
                throw e;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean matchSpecial(String str) {
        if (TextUtils.isEmpty(this.packageName)) {
            this.packageName = PresentationSystem.getInstance().getContext().getPackageName();
        }
        PackageInfo packageInfo = PresentationSystem.getInstance().getPackageInfo(this.packageName);
        if (packageInfo != null && packageInfo.versionCode < this.latestVersion) {
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
        stringBuffer.append("latestVersion: ");
        stringBuffer.append(this.latestVersion);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }
}
