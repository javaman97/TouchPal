package com.cootek.presentation.service.action;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigParser;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChangeLocalSettingsAction extends PresentAction {
    private Map<String, Boolean> mMapBoolSettings = new TreeMap();
    private Map<String, Integer> mMapIntegerSettings = new TreeMap();
    private Map<String, Long> mMapLongSettings = new TreeMap();
    private Map<String, Boolean> mMapOnlyDefault = new HashMap();
    private Map<String, String> mMapStringSettings = new TreeMap();

    private boolean settingTypesMatched(String str) {
        if (str.equals("bool") || str.equals("integer") || str.equals("long") || str.equals("string")) {
            return true;
        }
        return false;
    }

    public ChangeLocalSettingsAction(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        super(xmlPullParser);
        xmlPullParser.nextTag();
        while (settingTypesMatched(xmlPullParser.getName())) {
            String name = xmlPullParser.getName();
            int eventType = xmlPullParser.getEventType();
            if (eventType == 2 && name.equals("bool")) {
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
                String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_ONLY_FOR_DEFAULT);
                String readText = PresentConfigParser.readText(xmlPullParser);
                if (readText.equals("false") || readText.equals("true")) {
                    this.mMapBoolSettings.put(attributeValue, Boolean.valueOf(Boolean.parseBoolean(readText)));
                    this.mMapOnlyDefault.put(attributeValue, Boolean.valueOf(Boolean.parseBoolean(attributeValue2)));
                }
            } else if (eventType == 2 && name.equals("long")) {
                String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "name");
                String attributeValue4 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_ONLY_FOR_DEFAULT);
                try {
                    this.mMapLongSettings.put(attributeValue3, Long.valueOf(Long.parseLong(PresentConfigParser.readText(xmlPullParser))));
                    this.mMapOnlyDefault.put(attributeValue3, Boolean.valueOf(Boolean.parseBoolean(attributeValue4)));
                } catch (NumberFormatException e) {
                }
            } else if (eventType == 2 && name.equals("integer")) {
                String attributeValue5 = xmlPullParser.getAttributeValue((String) null, "name");
                String attributeValue6 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_ONLY_FOR_DEFAULT);
                try {
                    this.mMapIntegerSettings.put(attributeValue5, Integer.valueOf(Integer.parseInt(PresentConfigParser.readText(xmlPullParser))));
                    this.mMapOnlyDefault.put(attributeValue5, Boolean.valueOf(Boolean.parseBoolean(attributeValue6)));
                } catch (NumberFormatException e2) {
                }
            } else if (eventType == 2 && name.equals("string")) {
                String attributeValue7 = xmlPullParser.getAttributeValue((String) null, "name");
                String attributeValue8 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_ONLY_FOR_DEFAULT);
                this.mMapStringSettings.put(attributeValue7, PresentConfigParser.readText(xmlPullParser));
                this.mMapOnlyDefault.put(attributeValue7, Boolean.valueOf(Boolean.parseBoolean(attributeValue8)));
            }
            xmlPullParser.nextTag();
        }
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String next : this.mMapBoolSettings.keySet()) {
            stringBuffer.append("setting: ");
            stringBuffer.append(next);
            stringBuffer.append(", value: ");
            stringBuffer.append(this.mMapBoolSettings.get(next));
            stringBuffer.append(", onlyDefault: ");
            stringBuffer.append(this.mMapOnlyDefault.get(next));
            stringBuffer.append(C0911j.f2473c);
        }
        for (String next2 : this.mMapIntegerSettings.keySet()) {
            stringBuffer.append("setting: ");
            stringBuffer.append(next2);
            stringBuffer.append(", value: ");
            stringBuffer.append(this.mMapIntegerSettings.get(next2));
            stringBuffer.append(", onlyDefault: ");
            stringBuffer.append(this.mMapOnlyDefault.get(next2));
            stringBuffer.append(C0911j.f2473c);
        }
        for (String next3 : this.mMapLongSettings.keySet()) {
            stringBuffer.append("setting: ");
            stringBuffer.append(next3);
            stringBuffer.append(", value: ");
            stringBuffer.append(this.mMapLongSettings.get(next3));
            stringBuffer.append(", onlyDefault: ");
            stringBuffer.append(this.mMapOnlyDefault.get(next3));
            stringBuffer.append(C0911j.f2473c);
        }
        for (String next4 : this.mMapStringSettings.keySet()) {
            stringBuffer.append("setting: ");
            stringBuffer.append(next4);
            stringBuffer.append(", value: ");
            stringBuffer.append(this.mMapStringSettings.get(next4));
            stringBuffer.append(", onlyDefault: ");
            stringBuffer.append(this.mMapOnlyDefault.get(next4));
            stringBuffer.append(C0911j.f2473c);
        }
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public void onClick(PresentToast presentToast, boolean z) {
        if (PresentationSystem.getInstance().getActionDriver() != null) {
            boolean z2 = !TextUtils.isEmpty(presentToast.getActionConfirm());
            if (z || !z2) {
                try {
                    for (String next : this.mMapBoolSettings.keySet()) {
                        PresentationSystem.getInstance().getActionDriver().changeBoolSetting(next, this.mMapBoolSettings.get(next).booleanValue(), this.mMapOnlyDefault.get(next).booleanValue());
                    }
                    for (String next2 : this.mMapLongSettings.keySet()) {
                        PresentationSystem.getInstance().getActionDriver().changeLongSetting(next2, this.mMapLongSettings.get(next2).longValue(), this.mMapOnlyDefault.get(next2).booleanValue());
                    }
                    for (String next3 : this.mMapIntegerSettings.keySet()) {
                        PresentationSystem.getInstance().getActionDriver().changeIntSetting(next3, this.mMapIntegerSettings.get(next3).intValue(), this.mMapOnlyDefault.get(next3).booleanValue());
                    }
                    for (String next4 : this.mMapStringSettings.keySet()) {
                        PresentationSystem.getInstance().getActionDriver().changeStringSetting(next4, this.mMapStringSettings.get(next4), this.mMapOnlyDefault.get(next4).booleanValue());
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                presentToast.onToastClicked();
                PresentationSystem.getInstance().actionPerformed(13, new String[0]);
                if (presentToast.clickClean) {
                    PresentationSystem.getInstance().setCleanType(9);
                    try {
                        PresentationSystem.getInstance().getActionDriver().close(presentToast.getId());
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                try {
                    PresentationSystem.getInstance().getActionDriver().showActionConfirmDialog(presentToast.getId(), presentToast.getActionConfirm());
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public boolean meetAction(int i, String[] strArr) {
        if (i == 13) {
            return true;
        }
        return false;
    }
}
