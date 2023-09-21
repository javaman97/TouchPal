package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.action.PresentAction;
import com.cootek.presentation.service.config.DownloadFile;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.presentation.service.feature.PresentFeature;
import com.cootek.presentation.service.history.PresentHistoryManager;
import com.cootek.presentation.service.history.PresentStatisticUploader;
import com.cootek.smartinput5.func.C1351J;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class PresentToast implements Parcelable {
    public static final int CLEAR_AFTER_ACTION = 1;
    public static final int CLEAR_AFTER_CLOSE = 2;
    public static final int CLEAR_NOT_ALLOW = 4;
    public static final int DOWNLOAD_AFTER_MATCH = 1;
    public static final int DOWNLOAD_AFTER_PARSE = 0;
    public static final String DOWNLOAD_DIRECT = "direct";
    public static final String DOWNLOAD_REDIRECT = "redirect";
    public static final int DOWNLOAD_TYPE_DIRECT = 0;
    public static final int DOWNLOAD_TYPE_REDIRECT = 1;
    public static final int ENSURE_ANY = 3;
    public static final int ENSURE_MOBILE = 2;
    public static final int ENSURE_NONE = 4;
    public static final int ENSURE_WIFI = 1;
    public static final int NOT_SHOW_AGAIN_AFTER_ACTION = 4;
    public static final int NOT_SHOW_AGAIN_AFTER_CLEAN = 2;
    public static final int NOT_SHOW_AGAIN_AFTER_CLICK = 1;
    public static final int NOT_SHOW_AGAIN_NONE = 0;
    protected static final String TAG = "PresentToast";
    public DownloadFile autoFileDownloader = null;
    protected int clearRule;
    public boolean clickClean;
    public int downloadStrategy;
    public int ensureNetwork;
    private PresentAction mAction;
    private String mActionConfirm = null;
    private boolean mAllowClean;
    private String mAutoDownloadUrl = null;
    private String mDescription = null;
    private String mDisplay = null;
    private long mDownloadLimitDays = 259200000;
    private boolean[] mDownloadPeroid = {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    private int mDownloadType;
    private PresentFeature mFeature;
    private String mId;
    private String mImageUrl = null;
    private int mNotShowAgain;
    private String mTag = null;

    /* access modifiers changed from: protected */
    public abstract void dumpSpecial();

    /* access modifiers changed from: protected */
    public abstract void onCleared();

    /* access modifiers changed from: protected */
    public abstract void onClicked();

    /* access modifiers changed from: protected */
    public abstract void onShown();

    public abstract void postParse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException;

    /* access modifiers changed from: protected */
    public abstract void readFromParcelSpecial(Parcel parcel);

    /* access modifiers changed from: protected */
    public abstract void writeToParcelSpecial(Parcel parcel, int i);

    public PresentToast(Parcel parcel) {
        readFromParcel(parcel);
    }

    private final void readFromParcel(Parcel parcel) {
        boolean z = true;
        this.mId = parcel.readString();
        this.mDisplay = parcel.readString();
        this.mDescription = parcel.readString();
        this.mTag = parcel.readString();
        if (parcel.readByte() != 1) {
            z = false;
        }
        this.mAllowClean = z;
        readFromParcelSpecial(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mDisplay);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mTag);
        parcel.writeByte((byte) (this.mAllowClean ? 1 : 0));
        writeToParcelSpecial(parcel, i);
    }

    public PresentToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_ALLOW_CLEAN);
        if (attributeValue != null) {
            this.mAllowClean = Boolean.parseBoolean(attributeValue);
        } else {
            this.mAllowClean = true;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_CLICK_CLEAN);
        if (attributeValue2 != null) {
            this.clickClean = Boolean.parseBoolean(attributeValue2);
        } else {
            this.clickClean = false;
        }
        parseClearRules(xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_CLEAR_RULE));
        parseNotShowAgain(xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_NOT_SHOW_AGAIN));
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_ENSURE_NETWORK);
        if (attributeValue3 == null) {
            this.ensureNetwork = 4;
        } else if (attributeValue3.equalsIgnoreCase("Wifi")) {
            this.ensureNetwork = 1;
        } else if (attributeValue3.equalsIgnoreCase("Mobile")) {
            this.ensureNetwork = 2;
        } else if (attributeValue3.equalsIgnoreCase("Any")) {
            this.ensureNetwork = 3;
        } else if (attributeValue3.equalsIgnoreCase("None")) {
            this.ensureNetwork = 4;
        } else {
            this.ensureNetwork = 4;
            throw new IllegalArgumentException(PresentConfigXmlTag.TOAST_ATTR_ENSURE_NETWORK);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_DOWNLOAD_LIMIT_DAYS);
        if (attributeValue4 != null) {
            setDownloadLimitDays(attributeValue4);
        }
        String attributeValue5 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_DOWNLOAD_PERIOD);
        if (attributeValue5 != null) {
            setDownloadPeroid(attributeValue5);
        }
        String attributeValue6 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_DOWNLOAD_TYPE);
        if (attributeValue6 != null) {
            if (DOWNLOAD_DIRECT.equalsIgnoreCase(attributeValue6)) {
                i = 0;
            } else if (DOWNLOAD_REDIRECT.equalsIgnoreCase(attributeValue6)) {
                i = 1;
            } else {
                i = 0;
            }
            setDownloadType(i);
        }
        String attributeValue7 = xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_DOWNLOAD_STRATEGY);
        if (attributeValue7 == null) {
            this.downloadStrategy = 0;
        } else if (attributeValue7.equalsIgnoreCase("afterMatch")) {
            this.downloadStrategy = 1;
        } else if (attributeValue7.equalsIgnoreCase("afterParse")) {
            this.downloadStrategy = 0;
        } else {
            this.downloadStrategy = 0;
            throw new IllegalArgumentException(PresentConfigXmlTag.TOAST_ATTR_DOWNLOAD_STRATEGY);
        }
        this.mTag = xmlPullParser.getAttributeValue((String) null, "tag");
        xmlPullParser.getAttributeValue((String) null, PresentConfigXmlTag.TOAST_ATTR_TOAST_DURATION);
    }

    private void parseClearRules(String str) {
        if (str == null) {
            this.clearRule = 1;
            return;
        }
        this.clearRule = 0;
        for (String trim : str.split("\\|")) {
            String trim2 = trim.trim();
            if (trim2 == null) {
                this.clearRule |= 1;
            } else if (trim2.equalsIgnoreCase("afterAction")) {
                this.clearRule |= 1;
            } else if (trim2.equalsIgnoreCase("afterClose")) {
                this.clearRule |= 2;
            } else if (trim2.equalsIgnoreCase("none")) {
                this.clearRule = 4;
            } else {
                this.clearRule |= 1;
            }
        }
    }

    private void parseNotShowAgain(String str) {
        if (str == null) {
            this.mNotShowAgain = 0;
            return;
        }
        this.mNotShowAgain = 0;
        for (String trim : str.split("\\|")) {
            String trim2 = trim.trim();
            if (trim2 == null) {
                this.mNotShowAgain |= 0;
            } else if (trim2.equalsIgnoreCase("afterClick")) {
                this.mNotShowAgain |= 1;
            } else if (trim2.equalsIgnoreCase("afterClean")) {
                this.mNotShowAgain |= 2;
            } else if (trim2.equalsIgnoreCase("afterAction")) {
                this.mNotShowAgain |= 4;
            } else {
                this.mNotShowAgain |= 0;
            }
        }
    }

    private boolean notShowAgain(int i) {
        return (this.mNotShowAgain & i) != 0;
    }

    public boolean clearRuleSupported(int i) {
        return (this.clearRule & i) != 0;
    }

    public void setAction(PresentAction presentAction) {
        this.mAction = presentAction;
    }

    public void setFeature(PresentFeature presentFeature) {
        this.mFeature = presentFeature;
        this.mId = presentFeature.featureId;
    }

    public void setDownloadLimitDays(String str) {
        this.mDownloadLimitDays = (long) (Integer.parseInt(str) * 24 * 60 * 60 * 1000);
    }

    public long getDownloadLimitDays() {
        return this.mDownloadLimitDays;
    }

    public void setDownloadType(int i) {
        this.mDownloadType = i;
    }

    public int getDownloadType() {
        return this.mDownloadType;
    }

    public void setDownloadPeroid(String str) {
        try {
            String[] split = str.split("\\|");
            for (int i = 0; i < 24; i++) {
                this.mDownloadPeroid[i] = false;
            }
            for (int i2 = 0; i2 < split.length; i2++) {
                int parseInt = Integer.parseInt(split[i2].split(C1351J.f4161f)[1]);
                for (int parseInt2 = Integer.parseInt(split[i2].split(C1351J.f4161f)[0]); parseInt2 <= parseInt; parseInt2++) {
                    this.mDownloadPeroid[parseInt2] = true;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }

    public boolean downloadPeriodMeetCondition(long j) {
        long featureSettingLong = PresentationSystem.getInstance().getHistoryManager().getFeatureSettingLong(this.mId, PresentHistoryManager.FIRST_OCCUR_TIMESTAMP);
        if (featureSettingLong == 0) {
            return false;
        }
        if (j - featureSettingLong >= this.mDownloadLimitDays) {
            return true;
        }
        if (!this.mDownloadPeroid[Integer.parseInt(new SimpleDateFormat("yyyyMMddHHmmss").format(Long.valueOf(j)).substring(8, 10))]) {
            return false;
        }
        return true;
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setActionConfirm(String str) {
        this.mActionConfirm = str;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public void setImagePath(String str) {
        PresentationSystem.getInstance().getHistoryManager().setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IMAGE_PATH, str);
    }

    public void setAutoDownloadUrl(String str) {
        this.mAutoDownloadUrl = str;
    }

    public PresentAction getAction() {
        return this.mAction;
    }

    public String getId() {
        return this.mId;
    }

    public String getAutoDownloadUrl() {
        return this.mAutoDownloadUrl;
    }

    public PresentFeature getFeature() {
        return this.mFeature;
    }

    public String getDisplay() {
        return this.mDisplay;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public boolean isReady() {
        return isImageReady() && isDownloadReady();
    }

    public boolean isImageReady() {
        if (TextUtils.isEmpty(this.mImageUrl)) {
            return true;
        }
        if (TextUtils.isEmpty(getImagePathInner()) || !new File(getImagePathInner()).exists()) {
            return false;
        }
        return true;
    }

    public boolean isDownloadReady() {
        if (TextUtils.isEmpty(this.mAutoDownloadUrl)) {
            return true;
        }
        if (TextUtils.isEmpty(getDownloadFilePathInner()) || !new File(getDownloadFilePathInner()).exists()) {
            return false;
        }
        return true;
    }

    public String getImagePath() {
        return PresentationManager.getPresentImagePath(this.mId);
    }

    public String getImagePathInner() {
        return PresentationSystem.getInstance().getPresentImagePath(this.mId);
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean canShowClose() {
        return this.mAllowClean;
    }

    public String getActionConfirm() {
        return this.mActionConfirm;
    }

    public String getDownloadFilePath() {
        return PresentationManager.getDownloadFilePath(this.mId);
    }

    public String getDownloadFilePathInner() {
        return PresentationSystem.getInstance().getDownloadFilePath(this.mId);
    }

    public final boolean isShowing() {
        return PresentationSystem.getInstance().getHistoryManager().getFeatureSettingBoolean(this.mFeature.featureId, PresentHistoryManager.IS_SHOWN);
    }

    public final void onToastClicked() {
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_CLICKED, true);
        if (notShowAgain(1)) {
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_CLEAR, true);
        }
        PresentationSystem.getInstance().getPresentStatisticUploader().addItem("CLICK", (String) null, getFeature().featureId);
        onClicked();
        PresentationSystem.getInstance().sortPresentation();
    }

    public final void onToastCleared(int i) {
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        if (historyManager.getFeatureSettingBoolean(this.mFeature.featureId, PresentHistoryManager.IS_SHOWN)) {
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_CLEAR, false);
            if (i == 11) {
                if (notShowAgain(2)) {
                    historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_CLEAR, true);
                }
            } else if (i != 8 && notShowAgain(4)) {
                historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_CLEAR, true);
            }
            int i2 = this.mFeature.promptTimes;
            if (!(this.mFeature.getFeatureGroup() == null || this.mFeature.getFeatureGroup().promptTimes == -10000)) {
                int i3 = this.mFeature.getFeatureGroup().promptTimes;
            }
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.CLEAR_TYPE, Integer.valueOf(i));
            if (i == 11) {
                PresentationSystem.getInstance().setCleanType(11);
            } else {
                PresentationSystem.getInstance().setCleanType(10);
            }
            PresentStatisticUploader presentStatisticUploader = PresentationSystem.getInstance().getPresentStatisticUploader();
            presentStatisticUploader.addItem(PresentStatisticUploader.TYPE_DISMISS, presentStatisticUploader.getSubType(i), getFeature().featureId);
            onCleared();
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_SHOWN, false);
            PresentationSystem.getInstance().sortPresentation();
        }
    }

    public final void onToastShown() {
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        if (!historyManager.getFeatureSettingBoolean(this.mFeature.featureId, PresentHistoryManager.IS_SHOWN)) {
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.LAST_PRESENT_TIMESTAMP, Long.valueOf(SystemFacade.currentTimeMillis()));
            historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.ALREADY_PRESNET_TIMES, Integer.valueOf(historyManager.getFeatureSettingInt(this.mFeature.featureId, PresentHistoryManager.ALREADY_PRESNET_TIMES) + 1));
            PresentationSystem.getInstance().getPresentStatisticUploader().addItem("SHOW", (String) null, getFeature().featureId);
        }
        onShown();
        historyManager.setFeatureSetting(this.mFeature.featureId, PresentHistoryManager.IS_SHOWN, true);
    }

    public void dump() {
        this.mFeature.dump();
        dumpCommon();
        dumpSpecial();
        this.mAction.dump();
    }

    private void dumpCommon() {
        StringBuffer stringBuffer = new StringBuffer("===Toast===\n");
        stringBuffer.append("display: ");
        stringBuffer.append(this.mDisplay);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("description: ");
        stringBuffer.append(this.mDescription);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("imageUrl: ");
        stringBuffer.append(this.mImageUrl);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("actionConfirm: ");
        stringBuffer.append(this.mActionConfirm);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("clickClean: ");
        stringBuffer.append(this.clickClean);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("clearRule: ");
        stringBuffer.append(this.clearRule);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("autoDownloadUrl: ");
        stringBuffer.append(this.mAutoDownloadUrl);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("downloadStrategy: ");
        stringBuffer.append(this.downloadStrategy);
        stringBuffer.append(C0911j.f2473c);
        stringBuffer.append("ensureNetwork: ");
        stringBuffer.append(this.ensureNetwork);
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, stringBuffer.toString());
        }
    }

    public boolean canShow() {
        if (this.mAction == null) {
            return false;
        }
        return this.mAction.meetCondition();
    }

    public int getCleanType(int i) {
        return i;
    }

    public void addStatisticItem(int i) {
        String str;
        String str2;
        switch (i) {
            case 1:
                str = "INSTALL";
                str2 = "FINISH";
                break;
            case 2:
                str = PresentStatisticUploader.TYPE_DOWNLOAD;
                str2 = "FINISH";
                break;
            case 4:
                str = PresentStatisticUploader.TYPE_LOCALAPP;
                str2 = PresentStatisticUploader.SUBTYPE_LAUNCHED;
                break;
            case 6:
                str = PresentStatisticUploader.TYPE_WEBPAGE;
                str2 = PresentStatisticUploader.SUBTYPE_LOADED;
                break;
            case 7:
                str = PresentStatisticUploader.TYPE_WEBPAGE;
                str2 = PresentStatisticUploader.SUBTYPE_OPENED;
                break;
            case 12:
                str = "INSTALL";
                str2 = "START";
                break;
            case 14:
                str = PresentStatisticUploader.TYPE_DOWNLOAD;
                str2 = PresentStatisticUploader.SUBTYPE_HANDLED;
                break;
            default:
                return;
        }
        PresentationSystem.getInstance().getPresentStatisticUploader().addItem(str, str2, getId());
    }
}
