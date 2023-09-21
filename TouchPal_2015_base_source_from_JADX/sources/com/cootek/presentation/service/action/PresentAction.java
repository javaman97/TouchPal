package com.cootek.presentation.service.action;

import android.util.Log;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.presentation.service.PresentationSystem;
import com.cootek.presentation.service.toast.PresentToast;
import org.xmlpull.v1.XmlPullParser;

public abstract class PresentAction {
    public static final int ACTION_TYPE_DOWNLOAD_FINISHED = 2;
    public static final int ACTION_TYPE_DOWNLOAD_HANDLED = 14;
    public static final int ACTION_TYPE_DOWNLOAD_STARTED = 3;
    public static final int ACTION_TYPE_EXCEPTION = -1;
    public static final int ACTION_TYPE_HOST_APP_CLOSED = 8;
    public static final int ACTION_TYPE_INSTALL_FINISHED = 1;
    public static final int ACTION_TYPE_INSTALL_STARTED = 12;
    public static final int ACTION_TYPE_LOCAL_APP_LAUNCHED = 4;
    public static final int ACTION_TYPE_LOCAL_APP_QUIT = 5;
    public static final int ACTION_TYPE_NONE = 0;
    public static final int ACTION_TYPE_SETTINGS_CHANGED = 13;
    public static final int ACTION_TYPE_TOAST_CLEANED = 11;
    public static final int ACTION_TYPE_TOAST_CLICKED = 9;
    public static final int ACTION_TYPE_TOAST_CLOSED = 10;
    public static final int ACTION_TYPE_WEBPAGE_LOADED = 6;
    public static final int ACTION_TYPE_WEBPAGE_OPENED = 7;
    private static final String TAG = "PresentAction";
    public int cleanAcknowledge;

    public interface IActionListener {
        void actionPerformed(int i, String... strArr);

        void cleaned(String str);

        void clickException(PresentToast presentToast);

        void clicked(String str, boolean z);

        void closed(String str);

        void shown(String str);
    }

    public abstract void dumpSpecial();

    public abstract boolean meetAction(int i, String[] strArr);

    public abstract void onClick(PresentToast presentToast, boolean z);

    public PresentAction(XmlPullParser xmlPullParser) {
    }

    public void dump() {
        dumpCommon();
        dumpSpecial();
    }

    private String getAckType(int i) {
        switch (i) {
            case 0:
                return "none";
            case 1:
                return "finishInstall";
            case 2:
                return "finishDownload";
            case 3:
                return "startDownload";
            case 4:
                return "launched";
            case 5:
                return "quit";
            case 6:
                return "pageLoaded";
            case 7:
                return "pageOpened";
            case 14:
                return "handleDownload";
            default:
                return null;
        }
    }

    private void dumpCommon() {
        StringBuffer stringBuffer = new StringBuffer("===Action===\n");
        stringBuffer.append("cleanAcknowledge: ");
        stringBuffer.append(getAckType(this.cleanAcknowledge));
        stringBuffer.append(C0911j.f2473c);
        if (PresentationSystem.DUMPINFO) {
            Log.i(TAG, stringBuffer.toString());
        }
    }

    public boolean meetCondition() {
        return true;
    }

    public void autoPerformNextAction(int i, String[] strArr) {
    }
}
