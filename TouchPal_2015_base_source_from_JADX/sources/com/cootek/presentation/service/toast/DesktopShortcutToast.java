package com.cootek.presentation.service.toast;

import android.os.Parcel;
import android.os.Parcelable;
import com.cootek.presentation.sdk.SystemFacade;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.history.PresentHistoryManager;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DesktopShortcutToast extends PresentToast {
    public static final Parcelable.Creator<DesktopShortcutToast> CREATOR = new Parcelable.Creator<DesktopShortcutToast>() {
        public DesktopShortcutToast createFromParcel(Parcel parcel) {
            return new DesktopShortcutToast(parcel);
        }

        public DesktopShortcutToast[] newArray(int i) {
            return new DesktopShortcutToast[i];
        }
    };
    public static final String INTENT_ACTION_DESKTOP_SHORTCUT_HANDLE = "intent.action.desktop.SHORTCUT_HANDLE";
    public boolean runInbackground = false;

    public DesktopShortcutToast(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void readFromParcelSpecial(Parcel parcel) {
    }

    /* access modifiers changed from: protected */
    public void writeToParcelSpecial(Parcel parcel, int i) {
    }

    public DesktopShortcutToast(XmlPullParser xmlPullParser) throws IllegalArgumentException {
        super(xmlPullParser);
    }

    public void postParse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
    }

    /* access modifiers changed from: protected */
    public void onClicked() {
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
    }

    /* access modifiers changed from: protected */
    public void onShown() {
        PresentHistoryManager historyManager = PresentationSystem.getInstance().getHistoryManager();
        String str = getFeature().featureId;
        if (historyManager.getFeatureSettingBoolean(str, PresentHistoryManager.IS_SHOWN)) {
            historyManager.setFeatureSetting(str, PresentHistoryManager.ALREADY_PRESNET_TIMES, Integer.valueOf(historyManager.getFeatureSettingInt(str, PresentHistoryManager.ALREADY_PRESNET_TIMES) + 1));
            historyManager.setFeatureSetting(str, PresentHistoryManager.LAST_PRESENT_TIMESTAMP, Long.valueOf(SystemFacade.currentTimeMillis()));
        }
    }

    /* access modifiers changed from: protected */
    public void dumpSpecial() {
    }
}
