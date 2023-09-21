package com.iflytek.cloud;

import com.iflytek.msc.MSC;

public class Setting {

    /* renamed from: a */
    public static boolean f16233a = true;

    /* renamed from: b */
    public static boolean f16234b = true;

    /* renamed from: c */
    public static LOG_LEVEL f16235c = LOG_LEVEL.none;

    /* renamed from: d */
    public static String f16236d = null;

    public enum LOG_LEVEL {
        all,
        detail,
        normal,
        low,
        none
    }

    private Setting() {
    }

    public static void saveLogFile(LOG_LEVEL log_level, String str) {
        f16235c = log_level;
        f16236d = str;
    }

    public static void setLocationEnable(boolean z) {
        f16234b = z;
    }

    public static void showLogcat(boolean z) {
        f16233a = z;
        if (MSC.isLoaded()) {
            MSC.DebugLog(z);
        }
    }
}
