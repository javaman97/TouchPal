package com.cootek.presentation.service.feature;

import android.os.RemoteException;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import org.xmlpull.v1.XmlPullParser;

public class PeriodicTaskFeature extends PresentFeature {
    String timestampSettingKey;

    public PeriodicTaskFeature(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.timestampSettingKey = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.FEATURE_ATTR_TIMESTAMP_SETTING_KEY);
    }

    public boolean matchSpecial(String str) {
        if (this.timestampSettingKey == null) {
            return true;
        }
        long j = 0;
        try {
            j = PresentationSystem.getInstance().getNativeAppInfo().getLongSetting(this.timestampSettingKey);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        long currentTimeMillis = SystemFacade.currentTimeMillis();
        if (this.promptInterval <= 0.0f) {
            return true;
        }
        if (((float) currentTimeMillis) > ((float) j) + this.promptInterval) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("timestampSettingKey: ");
        stringBuffer.append(this.timestampSettingKey);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }
}
