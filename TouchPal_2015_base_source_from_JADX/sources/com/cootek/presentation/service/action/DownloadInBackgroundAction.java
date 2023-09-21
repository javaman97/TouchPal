package com.cootek.presentation.service.action;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.DownloadFile;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class DownloadInBackgroundAction extends PresentAction {
    private DownloadFile mDownloadFile;
    private DownloadFile.IFileProcesser mFileProcesser = new DownloadFile.IFileProcesser() {
        public String process(String str) {
            boolean z;
            try {
                z = PresentationSystem.getInstance().getActionDriver().handleDownloadedFile(DownloadInBackgroundAction.this.mProcessModuleId, str);
            } catch (RemoteException e) {
                e.printStackTrace();
                z = false;
            }
            if (z) {
                PresentationSystem.getInstance().actionPerformed(14, DownloadInBackgroundAction.this.mProcessModuleId, DownloadInBackgroundAction.this.mRequestUrl);
            }
            return str;
        }
    };
    /* access modifiers changed from: private */
    public String mProcessModuleId;
    private boolean mRequestToken;
    /* access modifiers changed from: private */
    public String mRequestUrl;

    public DownloadInBackgroundAction(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        this.mRequestUrl = xmlPullParser.getAttributeValue((String) null, "url");
        this.mProcessModuleId = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_PROCESS_MODLUE);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "requestToken");
        if (attributeValue == null || (!attributeValue.equals("false") && !attributeValue.equals("true"))) {
            this.mRequestToken = false;
        } else {
            this.mRequestToken = Boolean.parseBoolean(attributeValue);
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        if (attributeValue2 == null) {
            this.cleanAcknowledge = 0;
        } else if (attributeValue2.equalsIgnoreCase("downloadProcessed")) {
            this.cleanAcknowledge = 14;
        } else {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_CLEAN_ACKNOWLEDGE);
        }
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("requestUrl: ");
        stringBuffer.append(this.mRequestUrl);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("processMoudle: ");
        stringBuffer.append(this.mProcessModuleId);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public void onClick(PresentToast presentToast, boolean z) {
        if (PresentationSystem.getInstance().getActionDriver() != null && !TextUtils.isEmpty(this.mProcessModuleId) && !TextUtils.isEmpty(this.mRequestUrl)) {
            try {
                String downloadRequestUrl = PresentationSystem.getInstance().getActionDriver().getDownloadRequestUrl(this.mProcessModuleId, this.mRequestUrl);
                if (!TextUtils.isEmpty(downloadRequestUrl)) {
                    doRequest(PresentationSystem.getInstance().getContext(), downloadRequestUrl, presentToast);
                    if (presentToast.clickClean) {
                        PresentationSystem.getInstance().setCleanType(9);
                        try {
                            PresentationSystem.getInstance().getActionDriver().close(presentToast.getId());
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (RemoteException e2) {
            }
        }
    }

    public boolean meetAction(int i, String[] strArr) {
        if (i != 14 || !TextUtils.equals(strArr[0], this.mProcessModuleId) || !TextUtils.equals(strArr[1], this.mRequestUrl)) {
            return false;
        }
        return true;
    }

    private void doRequest(Context context, String str, PresentToast presentToast) {
        if (NetworkUtil.meetNetwork(presentToast.ensureNetwork)) {
            if (this.mDownloadFile == null) {
                this.mDownloadFile = new DownloadFile(str, presentToast.getId(), this.mRequestToken, this.mFileProcesser);
            }
            this.mDownloadFile.startDownload();
        }
    }
}
