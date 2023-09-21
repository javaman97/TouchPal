package com.appsflyer;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class AppsFlyerProperties {
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String EXTENSION = "sdkExtension";
    public static final String IS_MONITOR = "shouldMonitor";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private static AppsFlyerProperties instance = new AppsFlyerProperties();
    private boolean isDisableLog;
    private boolean isLaunchCalled;
    private boolean isOnReceiveCalled;
    private Map<String, Object> properties = new HashMap();
    private String referrer;

    private AppsFlyerProperties() {
    }

    public static AppsFlyerProperties getInstance() {
        return instance;
    }

    public void set(String str, String str2) {
        this.properties.put(str, str2);
    }

    public void set(String str, String[] strArr) {
        this.properties.put(str, strArr);
    }

    public String[] getStringArray(String str) {
        return (String[]) this.properties.get(str);
    }

    public String getString(String str) {
        return (String) this.properties.get(str);
    }

    public void set(String str, boolean z) {
        this.properties.put(str, Boolean.toString(z));
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        return string == null ? z : Boolean.valueOf(string).booleanValue();
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.isOnReceiveCalled;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.isOnReceiveCalled = true;
    }

    /* access modifiers changed from: protected */
    public boolean isLaunchCollectedReferrerd() {
        return this.isLaunchCalled;
    }

    /* access modifiers changed from: protected */
    public void setLaunchCollectedReferrer() {
        this.isLaunchCalled = true;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        this.referrer = str;
    }

    public String getReferrer(Context context) {
        if (this.referrer != null) {
            return this.referrer;
        }
        return context.getSharedPreferences("appsflyer-data", 0).getString("referrer", (String) null);
    }

    public void disableLogOutput(boolean z) {
        this.isDisableLog = z;
    }

    public boolean isDisableLog() {
        return this.isDisableLog;
    }
}
