package com.cootek.presentation.service.action;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.LogMessages;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigParser;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import com.cootek.smartinput.utilities.TJavascriptHandler;
import com.cootek.smartinput5.p046b.C1132b;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class LaunchLocalAppAction extends PresentAction {
    public String data;
    public String extra;
    public String intent;
    public String packageName;

    public LaunchLocalAppAction(XmlPullParser xmlPullParser) throws IllegalArgumentException, XmlPullParserException, IOException {
        super(xmlPullParser);
        this.packageName = xmlPullParser.getAttributeValue((String) null, "packageName");
        if (this.packageName == null) {
            throw new IllegalArgumentException("packageName");
        }
        this.intent = xmlPullParser.getAttributeValue((String) null, "intent");
        if (this.intent == null) {
            throw new IllegalArgumentException("intent");
        }
        this.data = xmlPullParser.getAttributeValue((String) null, "data");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        if (attributeValue == null) {
            this.cleanAcknowledge = 0;
        } else if (attributeValue.equalsIgnoreCase("launched")) {
            this.cleanAcknowledge = 4;
        } else if (attributeValue.equalsIgnoreCase("quit")) {
            this.cleanAcknowledge = 5;
        } else {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        }
        xmlPullParser.nextTag();
        JSONArray jSONArray = new JSONArray();
        while (extraTypesMatched(xmlPullParser.getName())) {
            JSONObject jSONObject = new JSONObject();
            String name = xmlPullParser.getName();
            int eventType = xmlPullParser.getEventType();
            if (eventType == 2 && name.equals("bool")) {
                String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "name");
                String readText = PresentConfigParser.readText(xmlPullParser);
                if (readText.equals("false") || readText.equals("true")) {
                    Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(readText));
                    try {
                        jSONObject.put(C1132b.f3175g, attributeValue2);
                        jSONObject.put("type", "bool");
                        jSONObject.put("value", valueOf);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            } else if (eventType == 2 && name.equals("long")) {
                String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "name");
                try {
                    long parseLong = Long.parseLong(PresentConfigParser.readText(xmlPullParser));
                    try {
                        jSONObject.put(C1132b.f3175g, attributeValue3);
                        jSONObject.put("type", "long");
                        jSONObject.put("value", parseLong);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } catch (NumberFormatException e3) {
                }
            } else if (eventType == 2 && name.equals("integer")) {
                String attributeValue4 = xmlPullParser.getAttributeValue((String) null, "name");
                try {
                    int parseInt = Integer.parseInt(PresentConfigParser.readText(xmlPullParser));
                    try {
                        jSONObject.put(C1132b.f3175g, attributeValue4);
                        jSONObject.put("type", TJavascriptHandler.SETTING_TYPE_INT);
                        jSONObject.put("value", parseInt);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e4) {
                        e4.printStackTrace();
                    }
                } catch (NumberFormatException e5) {
                }
            } else if (eventType == 2 && name.equals("string")) {
                String attributeValue5 = xmlPullParser.getAttributeValue((String) null, "name");
                String readText2 = PresentConfigParser.readText(xmlPullParser);
                try {
                    jSONObject.put(C1132b.f3175g, attributeValue5);
                    jSONObject.put("type", "string");
                    jSONObject.put("value", readText2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
            xmlPullParser.nextTag();
        }
        this.extra = jSONArray.toString();
    }

    private boolean extraTypesMatched(String str) {
        if (str.equals("bool") || str.equals("integer") || str.equals("long") || str.equals("string")) {
            return true;
        }
        return false;
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("intent: ");
        stringBuffer.append(this.intent);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("packageName: ");
        stringBuffer.append(this.packageName);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append(LogMessages.EVENT_DATA);
        stringBuffer.append(this.data);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public boolean meetCondition() {
        if (!TextUtils.isEmpty(this.packageName) && PresentationSystem.getInstance().getPackageInfo(this.packageName) == null) {
            return false;
        }
        return true;
    }

    public void onClick(PresentToast presentToast, boolean z) {
        boolean z2 = false;
        if (PresentationSystem.getInstance().getActionDriver() != null) {
            if (!TextUtils.isEmpty(presentToast.getActionConfirm())) {
                z2 = true;
            }
            if (z || !z2) {
                try {
                    if (PresentationSystem.getInstance().getActionDriver().launchApp(this.packageName, this.intent, this.data, this.extra)) {
                        PresentationSystem.getInstance().actionPerformed(4, this.packageName, this.intent, this.data);
                    } else {
                        PresentationSystem.getInstance().clickException(presentToast);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                presentToast.onToastClicked();
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
        if (i == 4) {
            if (strArr.length != 3) {
                return false;
            }
            String str = strArr[0];
            String str2 = strArr[1];
            String str3 = strArr[2];
            if ((!TextUtils.isEmpty(this.packageName) && !str.equals(this.packageName)) || !str2.equals(this.intent)) {
                return false;
            }
            if ((!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(this.data)) && !str3.equals(this.data)) {
                return false;
            }
            return true;
        } else if (i != 5) {
            if (i == 8) {
            }
            return false;
        } else if (strArr.length != 1 || !strArr[0].equals(this.packageName)) {
            return false;
        } else {
            return true;
        }
    }
}
