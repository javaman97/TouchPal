package com.cootek.presentation.service.feature;

import android.content.pm.PackageInfo;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.xmlpull.v1.XmlPullParser;

public class SensitiveAppUsageFeature extends AppPromoteFeature {
    private static final String SEPERATOR = ";";
    public String[] sensitivePackageNames;

    public SensitiveAppUsageFeature(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS);
        if (attributeValue != null) {
            this.sensitivePackageNames = attributeValue.split(";");
            return;
        }
        throw new IllegalArgumentException(PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS);
    }

    public boolean matchSpecial(String str) {
        PackageInfo packageInfo = PresentationSystem.getInstance().getPackageInfo(this.packageName);
        if (packageInfo == null) {
            return false;
        }
        if (packageInfo.versionCode <= this.packageOldVersion) {
            return false;
        }
        String str2 = null;
        try {
            str2 = PresentationSystem.getInstance().getNativeAppInfo().getHostPackageName();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String[] strArr = this.sensitivePackageNames;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (Pattern.matches(strArr[i], str2)) {
                    return true;
                }
                i++;
            } catch (PatternSyntaxException e2) {
            }
        }
        return false;
    }
}
