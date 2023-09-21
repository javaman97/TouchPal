package com.cootek.presentation.service.action;

import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PresentActionFactory {
    public static PresentAction generate(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "action");
        if (attributeValue == null) {
            return null;
        }
        try {
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_LAUNCH_LOCAL_APP)) {
                return new LaunchLocalAppAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_DOWNLOAD_IN_STATUS)) {
                return new DownloadInStatusAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_LAUNCH_WEB_VIEW)) {
                return new LaunchWebViewAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_LAUNCH_APP_INSTALLER)) {
                return new LaunchAppInstallerAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_CHANGE_LOCAL_SETTINGS)) {
                return new ChangeLocalSettingsAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_HANDLE_DOWNLOADED_FILE)) {
                return new DownloadInBackgroundAction(xmlPullParser);
            }
            if (attributeValue.equals("dummy")) {
                return new DummyAction(xmlPullParser);
            }
            if (attributeValue.equals(PresentConfigXmlTag.ACTION_TYPE_EXECUTE_SOME_TOAST)) {
                return new ExecuteToastAction(xmlPullParser);
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
