package com.cootek.presentation.service.feature;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.xmlpull.v1.XmlPullParser;

public class SensitiveAppPromoteFeature extends AppPromoteFeature {
    private static final String SEPERATOR = ";";
    public String[] sensitivePackageNames;

    public SensitiveAppPromoteFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS);
        if (attributeValue != null) {
            this.sensitivePackageNames = attributeValue.split(";");
            return;
        }
        throw new IllegalArgumentException(PresentConfigXmlTag.FEATURE_ATTR_SENSITIVE_APPS);
    }

    public boolean matchSpecial(String str) {
        if (!super.matchSpecial(str)) {
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

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        super.dumpSpecial();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sensitivePackageNames: ");
        for (String append : this.sensitivePackageNames) {
            stringBuffer.append(append);
            stringBuffer.append(";");
        }
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }
}
