package com.cootek.presentation.sdk;

public interface IActionDriver {
    void autoInstall(String str);

    boolean changeBoolSetting(String str, boolean z, boolean z2);

    boolean changeIntSetting(String str, int i, boolean z);

    boolean changeLongSetting(String str, long j, boolean z);

    boolean changeStringSetting(String str, String str2, boolean z);

    void close(String str);

    void contentUpdated();

    void download(int i, String str, String str2, String str3, boolean z);

    String getDownloadConfirmMessage();

    String getNonWifiMessage();

    boolean launchApp(String str, String str2, String str3, String str4);

    boolean openUrl(String str, String str2, boolean z);

    void saveTypeUsage(String str, String str2, String str3);

    void showActionConfirmDialog(String str, String str2);
}
