package com.cootek.presentation.service.action;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class LaunchWebViewAction extends PresentAction {
    public boolean requestToken;
    public String url;
    public String webTitle;

    public LaunchWebViewAction(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        this.webTitle = xmlPullParser.getAttributeValue((String) null, "title");
        this.url = xmlPullParser.getAttributeValue((String) null, "url");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "requestToken");
        if (attributeValue != null) {
            this.requestToken = Boolean.parseBoolean(attributeValue);
        } else {
            this.requestToken = false;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        if (attributeValue2 == null) {
            this.cleanAcknowledge = 0;
        } else if (attributeValue2.equalsIgnoreCase("pageLoaded")) {
            this.cleanAcknowledge = 6;
        } else if (attributeValue2.equalsIgnoreCase("pageOpened")) {
            this.cleanAcknowledge = 7;
        } else {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        }
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("webTitle: ");
        stringBuffer.append(this.webTitle);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("url: ");
        stringBuffer.append(this.url);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("requestToken: ");
        stringBuffer.append(this.requestToken);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public void onClick(PresentToast presentToast, boolean z) {
        boolean z2;
        if (PresentationSystem.getInstance().getActionDriver() != null) {
            boolean z3 = !TextUtils.isEmpty(presentToast.getActionConfirm());
            if (z || !z3) {
                try {
                    z2 = PresentationSystem.getInstance().getActionDriver().openUrl(this.url, this.webTitle, this.requestToken);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    z2 = false;
                }
                if (!z2) {
                    PresentationSystem.getInstance().clickException(presentToast);
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
        if (i == 6) {
            if (strArr == null || strArr.length != 1) {
                return false;
            }
            if (strArr[0].endsWith(this.url)) {
                return true;
            }
        } else if (i == 7) {
            if (strArr == null || strArr.length != 1) {
                return false;
            }
            if (strArr[0].endsWith(this.url)) {
                return true;
            }
        } else if (i == 8) {
            return false;
        } else {
            return false;
        }
        return false;
    }
}
