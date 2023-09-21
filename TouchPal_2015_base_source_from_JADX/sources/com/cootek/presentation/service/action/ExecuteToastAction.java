package com.cootek.presentation.service.action;

import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.utils.NetworkUtil;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public class ExecuteToastAction extends PresentAction {
    private static final int EXECUTE_TYPE_RUN = 2;
    private static final int EXECUTE_TYPE_SHOW = 1;
    private final String mExecuteId;
    private final int mExecuteType;
    private final String mToastType;

    public ExecuteToastAction(XmlPullParser xmlPullParser) {
        super(xmlPullParser);
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "type");
        if (attributeValue == null) {
            throw new IllegalArgumentException("type");
        }
        if (attributeValue == null || !attributeValue.equalsIgnoreCase(PresentConfigXmlTag.EXECTUE_TYPE_EXECUTE)) {
            this.mExecuteType = 1;
        } else {
            this.mExecuteType = 2;
        }
        this.mExecuteId = xmlPullParser.getAttributeValue((String) null, "fid");
        if (this.mExecuteId == null) {
            throw new IllegalArgumentException("fid");
        }
        this.mToastType = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.ACTION_ATTR_TOAST_TYPE);
        if (this.mToastType == null) {
            throw new IllegalArgumentException(PresentConfigXmlTag.ACTION_ATTR_TOAST_TYPE);
        }
    }

    public void dumpSpecial() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("ExecuteType: ");
        stringBuffer.append(this.mExecuteType);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("ExecuteId: ");
        stringBuffer.append(this.mExecuteId);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(getClass().getSimpleName(), stringBuffer.toString());
        }
    }

    public boolean meetCondition() {
        PresentToast toastByFeatureId = PresentationSystem.getInstance().getToastByFeatureId(this.mExecuteId);
        if (toastByFeatureId == null || !NetworkUtil.meetNetwork(toastByFeatureId.ensureNetwork) || !toastByFeatureId.canShow() || !toastByFeatureId.getFeature().matchIgnoreCondition()) {
            return false;
        }
        if (toastByFeatureId.isReady()) {
            return true;
        }
        PresentationSystem.getInstance().prepareContent(toastByFeatureId.getId());
        return false;
    }

    public void onClick(PresentToast presentToast, boolean z) {
        if (this.mExecuteType != 1) {
            return;
        }
        if (this.mToastType.equalsIgnoreCase(PresentConfigXmlTag.TOAST_ROOT_DUMMY)) {
            PresentationSystem.getInstance().checkDummyToast(this.mExecuteId);
        } else if (this.mToastType.equalsIgnoreCase(PresentConfigXmlTag.TOAST_ROOT_STATUS_BAR)) {
            PresentationSystem.getInstance().checkStatusToast(this.mExecuteId);
        } else if (this.mToastType.equalsIgnoreCase(PresentConfigXmlTag.TOAST_ROOT_DESKTOP_SHORTCUT)) {
            PresentationSystem.getInstance().checkShortcutToast(this.mExecuteId);
        }
    }

    public boolean meetAction(int i, String[] strArr) {
        return true;
    }
}
