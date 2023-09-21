package com.cootek.presentation.service.feature;

import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PresentFeatureGroup {
    public static final int NAN = -10000;
    public int initialPromptDays;
    public float promptInterval;
    public int promptTimes;

    public PresentFeatureGroup(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_INITIAL_PROMPT_DAYS);
        if (attributeValue != null) {
            this.initialPromptDays = Integer.parseInt(attributeValue);
        } else {
            this.initialPromptDays = -10000;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_PROMPT_INTERVAL);
        if (attributeValue2 != null) {
            this.promptInterval = Float.parseFloat(attributeValue2);
        } else {
            this.promptInterval = -10000.0f;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_PROMPT_TIMES);
        if (attributeValue3 != null) {
            this.promptTimes = Integer.parseInt(attributeValue3);
        } else {
            this.promptTimes = -10000;
        }
        xmlPullParser.nextTag();
    }
}
