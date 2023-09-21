package com.cootek.presentation.service.feature;

import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.xmlpull.v1.XmlPullParser;

public class KeywordAppPromoteFeature extends AppPromoteFeature {
    private static final String SEPERATOR = ";";
    String[] keywordRegxs;

    public KeywordAppPromoteFeature(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_KEYWORDS);
        if (attributeValue != null) {
            this.keywordRegxs = attributeValue.split(";");
            return;
        }
        throw new IllegalArgumentException(PresentConfigXmlTag.FEATURE_ATTR_KEYWORDS);
    }

    public boolean matchSpecial(String str) {
        if (TextUtils.isEmpty(str) || !super.matchSpecial(str)) {
            return false;
        }
        String[] strArr = this.keywordRegxs;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                if (Pattern.matches(strArr[i], str)) {
                    return true;
                }
                i++;
            } catch (PatternSyntaxException e) {
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        super.dumpSpecial();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("keywordRegxs: ");
        for (String append : this.keywordRegxs) {
            stringBuffer.append(append);
            stringBuffer.append(";");
        }
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }
}
