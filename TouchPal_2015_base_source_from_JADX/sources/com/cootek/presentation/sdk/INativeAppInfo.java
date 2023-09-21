package com.cootek.presentation.sdk;

import android.view.inputmethod.EditorInfo;

public interface INativeAppInfo {
    boolean canExtend(String str, String str2);

    boolean canPointHolderShow(String str, String str2, String str3);

    boolean canPointSelfShow(String str, String str2);

    boolean getBoolSetting(String str);

    EditorInfo getCurrentEditorInfo();

    long getFirstInstallTimestamp();

    int getInitialMobileQuietDays();

    int getInitialQuietDays();

    int getIntSetting(String str);

    String getLocalConfigFilePath();

    long getLongSetting(String str);

    String getStringSetting(String str);

    long getUpdateCheckInterval();
}
