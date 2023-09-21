package com.cootek.presentation.service.action;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.history.PresentStatisticUploader;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class DownloadInStatusAction extends PresentAction {
    public String appName;
    public boolean autoInstall;
    public boolean autoStart;
    @Deprecated
    public boolean cancelable;
    public boolean downloadConfirm;
    public boolean needInstall;
    public boolean nonWifiReminder;
    @Deprecated
    public boolean pausable;
    public String pkgName;
    public boolean requestToken;
    public String url;

    public DownloadInStatusAction(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
        this.url = xmlPullParser.getAttributeValue((String) null, "url");
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "requestToken");
        if (attributeValue != null) {
            this.requestToken = Boolean.parseBoolean(attributeValue);
        } else {
            this.requestToken = false;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "autoInstall");
        if (attributeValue2 != null) {
            this.autoInstall = Boolean.parseBoolean(attributeValue2);
        } else {
            this.autoInstall = true;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_NEED_INSTALL);
        if (attributeValue3 != null) {
            this.needInstall = Boolean.parseBoolean(attributeValue3);
        } else {
            this.needInstall = true;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_AUTO_START);
        if (attributeValue4 != null) {
            this.autoStart = Boolean.parseBoolean(attributeValue4);
        } else {
            this.autoStart = false;
        }
        String attributeValue5 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CANCELABLE);
        if (attributeValue5 != null) {
            this.cancelable = Boolean.parseBoolean(attributeValue5);
        } else {
            this.cancelable = true;
        }
        String attributeValue6 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        if (attributeValue6 == null) {
            this.cleanAcknowledge = 0;
        } else if (attributeValue6.equalsIgnoreCase("finishDownload")) {
            this.cleanAcknowledge = 2;
        } else if (attributeValue6.equalsIgnoreCase("startDownload")) {
            this.cleanAcknowledge = 3;
        } else if (attributeValue6.equalsIgnoreCase("finishInstall")) {
            this.cleanAcknowledge = 1;
        } else if (attributeValue6.equalsIgnoreCase("startInstall")) {
            this.cleanAcknowledge = 12;
        } else {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        }
        String attributeValue7 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_DOWNLOAD_CONFIRM);
        if (attributeValue7 != null) {
            this.downloadConfirm = Boolean.parseBoolean(attributeValue7);
        } else {
            this.downloadConfirm = false;
        }
        String attributeValue8 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_NON_WIFI_REMINDER);
        if (attributeValue8 != null) {
            this.nonWifiReminder = Boolean.parseBoolean(attributeValue8);
        } else {
            this.nonWifiReminder = true;
        }
        String attributeValue9 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_PAUSABLE);
        if (attributeValue9 != null) {
            this.pausable = Boolean.parseBoolean(attributeValue9);
        } else {
            this.pausable = false;
        }
        this.pkgName = xmlPullParser.getAttributeValue((String) null, "packageName");
        if (this.pkgName == null) {
            throw new IllegalArgumentException();
        }
        this.appName = xmlPullParser.getAttributeValue((String) null, "appName");
        if (this.appName == null) {
            throw new IllegalArgumentException();
        }
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("autoStart: ");
        stringBuffer.append(this.autoStart);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("requestToken: ");
        stringBuffer.append(this.requestToken);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("downloadConfirm: ");
        stringBuffer.append(this.downloadConfirm);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("nonWifiReminder: ");
        stringBuffer.append(this.nonWifiReminder);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("pausable: ");
        stringBuffer.append(this.pausable);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("cancelable: ");
        stringBuffer.append(this.cancelable);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("autoInstall: ");
        stringBuffer.append(this.autoInstall);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("appName: ");
        stringBuffer.append(this.appName);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("pkgName: ");
        stringBuffer.append(this.pkgName);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public void onClick(PresentToast presentToast, boolean z) {
        boolean z2 = false;
        if (PresentationSystem.getInstance().getActionDriver() != null) {
            boolean z3 = !TextUtils.isEmpty(presentToast.getActionConfirm());
            if (this.nonWifiReminder && !NetworkUtil.getNetworkStatus().wifiConnected) {
                z2 = true;
            }
            if (z || (!z3 && !this.downloadConfirm && !z2)) {
                try {
                    PresentationSystem.getInstance().getActionDriver().download(0, this.url, this.pkgName, this.appName, this.needInstall);
                    PresentationSystem.getInstance().getPresentStatisticUploader().addItem(PresentStatisticUploader.TYPE_DOWNLOAD, "START", presentToast.getId());
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                if (presentToast.clearRuleSupported(1) && this.cleanAcknowledge == 3) {
                    try {
                        PresentationSystem.getInstance().getActionDriver().close(presentToast.getId());
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
                presentToast.onToastClicked();
                if (presentToast.clickClean) {
                    PresentationSystem.getInstance().setCleanType(9);
                    try {
                        PresentationSystem.getInstance().getActionDriver().close(presentToast.getId());
                    } catch (RemoteException e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                if (z3) {
                    sb.append(presentToast.getActionConfirm());
                    if (z2) {
                        sb.append(10);
                        try {
                            sb.append(PresentationSystem.getInstance().getActionDriver().getNonWifiMessage());
                        } catch (RemoteException e4) {
                            e4.printStackTrace();
                        }
                    }
                } else {
                    if (this.downloadConfirm) {
                        try {
                            sb.append(PresentationSystem.getInstance().getActionDriver().getDownloadConfirmMessage());
                        } catch (RemoteException e5) {
                            e5.printStackTrace();
                        }
                    }
                    if (z2) {
                        if (this.downloadConfirm) {
                            sb.append(10);
                        }
                        try {
                            sb.append(PresentationSystem.getInstance().getActionDriver().getNonWifiMessage());
                        } catch (RemoteException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                try {
                    PresentationSystem.getInstance().getActionDriver().showActionConfirmDialog(presentToast.getId(), sb.toString());
                } catch (RemoteException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    public boolean meetAction(int i, String[] strArr) {
        if (i == 2) {
            if (strArr == null || strArr.length < 1) {
                return false;
            }
            if (strArr[0].equals(this.url)) {
                return true;
            }
        } else if (i == 3) {
            if (strArr == null || strArr.length < 1) {
                return false;
            }
            if (strArr[0].equals(this.url)) {
                return true;
            }
        } else if (i == 12) {
            if (strArr == null || strArr.length < 1) {
                return false;
            }
            if (strArr[0].equals(this.pkgName)) {
                return true;
            }
        } else if (i == 1) {
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
        if (this.autoInstall && i == 2) {
            if (strArr != null && strArr.length >= 2) {
                try {
                    PresentationSystem.getInstance().getActionDriver().autoInstall(strArr[1]);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
        if (this.autoStart && i == 1 && strArr != null && strArr.length >= 1) {
            try {
                PresentationSystem.getInstance().getActionDriver().launchApp(strArr[0], (String) null, (String) null, (String) null);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }
}
