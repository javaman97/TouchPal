package com.cootek.presentation.service;

import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class GlobalStrategy {
    public static final int ANY = 3;
    public static final int MOBILE = 2;
    public static final int SAME_AS_CHECK = 5;
    private static final String TAG = "GlobalStrategy";
    public static final int WIFI = 1;
    public static final int WIFI_FIRST = 4;
    public int checkConnection = 3;
    public float checkInterval = 1.0f;
    public int startupQuietDays = 0;
    public int statusbarQuietDays = 0;
    public int toolbarQuietDays = 0;

    public static GlobalStrategy generate(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, IllegalArgumentException {
        xmlPullParser.require(2, (String) null, PresentConfigXmlTag.STRATEGY_ROOT);
        String name = xmlPullParser.getName();
        GlobalStrategy globalStrategy = new GlobalStrategy();
        if (PresentConfigXmlTag.STRATEGY_ROOT.equals(name)) {
            globalStrategy.checkConnection = getValueForConnection(xmlPullParser.getAttributeValue((String) null, "connection"));
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "checkInterval");
            if (attributeValue != null) {
                try {
                    globalStrategy.checkInterval = Float.parseFloat(attributeValue);
                    String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "toolbarQuietDays");
                    if (attributeValue2 != null) {
                        try {
                            globalStrategy.toolbarQuietDays = Integer.parseInt(attributeValue2);
                            String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "statusbarQuietDays");
                            if (attributeValue3 != null) {
                                try {
                                    globalStrategy.statusbarQuietDays = Integer.parseInt(attributeValue3);
                                    String attributeValue4 = xmlPullParser.getAttributeValue((String) null, "startupQuietDays");
                                    if (attributeValue4 != null) {
                                        try {
                                            globalStrategy.startupQuietDays = Integer.parseInt(attributeValue4);
                                        } catch (NumberFormatException e) {
                                            throw e;
                                        }
                                    }
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } catch (NumberFormatException e3) {
                            throw e3;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (NumberFormatException e4) {
                    throw e4;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        xmlPullParser.nextTag();
        xmlPullParser.require(3, (String) null, PresentConfigXmlTag.STRATEGY_ROOT);
        return globalStrategy;
    }

    private static int getValueForConnection(String str) throws XmlPullParserException {
        if (str.equalsIgnoreCase("WiFi")) {
            return 1;
        }
        if (str.equalsIgnoreCase("WiFi_First")) {
            return 4;
        }
        if (str.equalsIgnoreCase("Mobile")) {
            return 2;
        }
        if (str.equalsIgnoreCase("Any")) {
            return 3;
        }
        if (str.equalsIgnoreCase("SameAsCheck")) {
            return 5;
        }
        throw new XmlPullParserException("connection value format invalid!");
    }

    private String getConnection(int i) {
        switch (i) {
            case 1:
                return "WiFi";
            case 2:
                return "Mobile";
            case 3:
                return "Any";
            case 4:
                return "WiFi_First";
            case 5:
                return "SameAsCheck";
            default:
                return "Any";
        }
    }

    public void dump() {
        StringBuffer stringBuffer = new StringBuffer("===Global Strategy===\n");
        stringBuffer.append("connection: ");
        stringBuffer.append(getConnection(this.checkConnection));
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("chekInterval: ");
        stringBuffer.append(this.checkInterval);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("toolbarQuietDays: ");
        stringBuffer.append(this.toolbarQuietDays);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("statusbarQuietDays: ");
        stringBuffer.append(this.statusbarQuietDays);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("startupQuietDays: ");
        stringBuffer.append(this.startupQuietDays);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, stringBuffer.toString());
        }
    }
}
