package com.cootek.presentation.service.action;

import android.os.RemoteException;
import android.text.TextUtils;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class LaunchAppInstallerAction extends PresentAction {
    public boolean autoStart;
    public String pkgName;

    public LaunchAppInstallerAction(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        if (attributeValue == null) {
            this.cleanAcknowledge = 0;
        } else if (attributeValue.equalsIgnoreCase("finishInstall")) {
            this.cleanAcknowledge = 1;
        } else {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_AUTO_START);
        if (attributeValue2 != null) {
            this.autoStart = Boolean.parseBoolean(attributeValue2);
        } else {
            this.autoStart = false;
        }
        this.pkgName = xmlPullParser.getAttributeValue((String) null, "packageName");
        if (this.pkgName == null) {
            throw new IllegalArgumentException();
        }
    }

    public void dumpSpecial() {
    }

    public void onClick(PresentToast presentToast, boolean z) {
        if (PresentationSystem.getInstance().getActionDriver() != null) {
            boolean z2 = !TextUtils.isEmpty(presentToast.getActionConfirm());
            if (z || !z2) {
                try {
                    PresentationSystem.getInstance().getActionDriver().autoInstall(presentToast.getDownloadFilePathInner());
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
        if (i == 1) {
            if (strArr == null || strArr.length < 1) {
                return false;
            }
            if (strArr[0].equals(this.pkgName)) {
                return true;
            }
        } else if (i == 8) {
            return false;
        }
        return false;
    }

    public void autoPerformNextAction(int i, String[] strArr) {
        if (this.autoStart && i == 1 && strArr != null && strArr.length >= 1) {
            try {
                PresentationSystem.getInstance().getActionDriver().launchApp(strArr[0], (String) null, (String) null, (String) null);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
