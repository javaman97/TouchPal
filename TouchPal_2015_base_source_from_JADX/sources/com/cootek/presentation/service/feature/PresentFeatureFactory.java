package com.cootek.presentation.service.feature;

import android.text.TextUtils;
import android.util.Log;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PresentFeatureFactory {
    public static PresentFeature generate(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (PresentationSystem.DUMPINFO) {
            Log.e("PresentFeatureFactory", name);
        }
        try {
            if (TextUtils.isEmpty(name)) {
                return null;
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_APP_ROMOTE)) {
                return new AppPromoteFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_KEYWORDS_APP_PROMOTE)) {
                return new KeywordAppPromoteFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_NEW_WORDS_UPDATE)) {
                return new NewWordsUpdateFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_PERIODIC_TASKS)) {
                return new PeriodicTaskFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_PERSONAL_EVENT)) {
                return new PersonalEventFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_PUSH_EVENT)) {
                return new PushEventFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_SENSITIVE_APP_PROMOTE)) {
                return new SensitiveAppPromoteFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_SENSITIVE_APP_USAGE)) {
                return new SensitiveAppUsageFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_UPDATE_PROGRAM)) {
                return new UpdateProgramFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_EXTENSION_PIONT_FEATURE)) {
                return new ExtensionPointFeature(xmlPullParser);
            }
            if (name.equals(PresentConfigXmlTag.FEATURE_ROOT_TOAST_DRIVEN_FEATURE)) {
                return new ToastDrivenFeature(xmlPullParser);
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
