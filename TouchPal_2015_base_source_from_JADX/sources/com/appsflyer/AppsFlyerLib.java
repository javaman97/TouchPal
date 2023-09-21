package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.engine.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLib extends BroadcastReceiver {
    static final String AF_COUNTER_PREF = "appsFlyerCount";
    protected static final String AF_SHARED_PREF = "appsflyer-data";
    private static final String ANDROID_ID_CACHED_PREF = "androidIdCached";
    public static final String APPS_TRACKING_URL = "https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.16&app_id=";
    public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final Uri ATTRIBUTION_ID_CONTENT_URI = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    static final String ATTRIBUTION_ID_PREF = "attributionId";
    private static final String CACHED_CHANNEL_PREF = "CACHED_CHANNEL";
    private static final String CACHED_URL_PARAMTER = "&isCachedRequest=true";
    private static final String CALL_SERVER_ACTION = "call server.";
    private static final String DEEPLINK_ATTR_PREF = "deeplinkAttribution";
    private static final String ERROR_PREFIX = "ERROR:";
    static final String FIRST_INSTALL_PREF = "appsFlyerFirstInstall";
    private static final List<String> IGNORABLE_KEYS = Arrays.asList(new String[]{"is_cache"});
    private static final String IMEI_CACHED_PREF = "imeiCached";
    private static final String INSTALL_STORE_PREF = "INSTALL_STORE";
    private static final String INSTALL_UPDATE_DATE_FORMAT = "yyyy-MM-dd_hhmmZ";
    public static final String LOG_TAG = "AppsFlyer_1.16";
    private static final String ON_RECIEVE_CALLED = "onRecieve called. refferer=";
    private static final String PREPARE_DATA_ACTION = "collect data for server";
    private static final String PRE_INSTALL_PREF = "preInstallName";
    protected static final String REFERRER_PREF = "referrer";
    public static final String SDK_BUILD_NUMBER = "1.16";
    static final String SENT_SUCCESSFULLY_PREF = "sentSuccessfully";
    public static final String SERVER_BUILD_NUMBER = "2.3";
    private static final String SERVER_RESPONDED_ACTION = "response from server. status=";
    private static final String UNINSTALL_URL = "https://track.appsflyer.com/api/v2.3/uninsall?buildnumber=1.16";
    private static final String WARNING_PREFIX = "WARNING:";
    /* access modifiers changed from: private */
    public static ScheduledExecutorService cacheScheduler = null;
    /* access modifiers changed from: private */
    public static AppsFlyerConversionListener conversionDataListener = null;
    /* access modifiers changed from: private */
    public static boolean isDuringCheckCache = false;
    /* access modifiers changed from: private */
    public static long lastCacheCheck;

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            sendUninstall(intent.getDataString(), context);
            return;
        }
        String stringExtra = intent.getStringExtra(AppsFlyerProperties.IS_MONITOR);
        if (stringExtra != null) {
            Log.i(LOG_TAG, "Turning on monitoring.");
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_MONITOR, stringExtra.equals("true"));
            monitor(context, (String) null, MonitorMessages.START_TRACKING, context.getPackageName());
            return;
        }
        Log.i(LOG_TAG, "****** onReceive called *******");
        debugAction("******* onReceive: ", "", context);
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra(REFERRER_PREF);
        if (shouldLog(context)) {
            Log.i(LOG_TAG, LogMessages.PLAY_STORE_REFERRER_RECIEVED + stringExtra2);
        }
        if (stringExtra2 != null) {
            debugAction("BroadcastReceiver got referrer: ", stringExtra2, context);
            debugAction(ON_RECIEVE_CALLED, stringExtra2, context);
            SharedPreferences.Editor edit = context.getSharedPreferences(AF_SHARED_PREF, 0).edit();
            edit.putString(REFERRER_PREF, stringExtra2);
            edit.commit();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isLaunchCollectedReferrerd()) {
                Log.i(LOG_TAG, "onReceive: isLaunchCalled");
                runInBackground(context, (String) null, (String) null, (String) null, stringExtra2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0 A[SYNTHETIC, Splitter:B:26:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sendUninstall(java.lang.String r7, android.content.Context r8) {
        /*
            r6 = this;
            r3 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0123 }
            r0.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = "https://track.appsflyer.com/api/v2.3/uninsall?buildnumber=1.16"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0123 }
            boolean r1 = shouldLog(r8)     // Catch:{ Throwable -> 0x0123 }
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = "AppsFlyer_1.16"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0123 }
            r2.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r4 = "Calling server for uninstall url: "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ Throwable -> 0x0123 }
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0123 }
            android.util.Log.i(r1, r2)     // Catch:{ Throwable -> 0x0123 }
        L_0x002e:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Throwable -> 0x0123 }
            r1.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = "packageName"
            r1.put(r2, r7)     // Catch:{ Throwable -> 0x0123 }
            addAdvertiserIDData(r8, r1)     // Catch:{ Throwable -> 0x0123 }
            addDeviceTracking(r8, r1)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r1 = mapToString(r1)     // Catch:{ Throwable -> 0x0123 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x0123 }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x0123 }
            java.net.URLConnection r0 = r2.openConnection()     // Catch:{ Throwable -> 0x0123 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r2 = "POST"
            r0.setRequestMethod(r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            byte[] r2 = r1.getBytes()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            int r2 = r2.length     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r4 = "Content-Length"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r5.<init>()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r5 = ""
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r0.setRequestProperty(r4, r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r2 = "Connection"
            java.lang.String r4 = "close"
            r0.setRequestProperty(r2, r4)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r2 = 1
            r0.setDoOutput(r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bc }
            java.io.OutputStream r4 = r0.getOutputStream()     // Catch:{ all -> 0x00bc }
            r2.<init>(r4)     // Catch:{ all -> 0x00bc }
            r2.write(r1)     // Catch:{ all -> 0x0125 }
            if (r2 == 0) goto L_0x0090
            r2.close()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
        L_0x0090:
            int r1 = r0.getResponseCode()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x00f9
            boolean r1 = shouldLog(r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = "AppsFlyer_1.16"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r2.<init>()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r3 = "Uninstall sent successfully: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            android.util.Log.i(r1, r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
        L_0x00b6:
            if (r0 == 0) goto L_0x00bb
            r0.disconnect()
        L_0x00bb:
            return
        L_0x00bc:
            r1 = move-exception
            r2 = r3
        L_0x00be:
            if (r2 == 0) goto L_0x00c3
            r2.close()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
        L_0x00c3:
            throw r1     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
        L_0x00c4:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x00c7:
            boolean r1 = shouldLog(r8)     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x00f3
            java.lang.String r1 = "AppsFlyer_1.16"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0121 }
            r2.<init>()     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = "Failed to send uninstall: "
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = " :"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0121 }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x0121 }
        L_0x00f3:
            if (r3 == 0) goto L_0x00bb
            r3.disconnect()
            goto L_0x00bb
        L_0x00f9:
            boolean r1 = shouldLog(r8)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = "AppsFlyer_1.16"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            r2.<init>()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r3 = "Failed to send uninstall: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            android.util.Log.i(r1, r2)     // Catch:{ Throwable -> 0x00c4, all -> 0x0118 }
            goto L_0x00b6
        L_0x0118:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x011b:
            if (r3 == 0) goto L_0x0120
            r3.disconnect()
        L_0x0120:
            throw r0
        L_0x0121:
            r0 = move-exception
            goto L_0x011b
        L_0x0123:
            r0 = move-exception
            goto L_0x00c7
        L_0x0125:
            r1 = move-exception
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.sendUninstall(java.lang.String, android.content.Context):void");
    }

    private static void debugAction(String str, String str2, Context context) {
        if (context != null && "com.appsflyer".equals(context.getPackageName())) {
            DebugLogQueue.getInstance().push(str + str2);
        }
    }

    /* access modifiers changed from: private */
    public static boolean shouldLog(Context context) {
        return !AppsFlyerProperties.getInstance().isDisableLog();
    }

    protected static void setProperty(String str, String str2) {
        AppsFlyerProperties.getInstance().set(str, str2);
    }

    public static String getProperty(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    public static void setAppUserId(String str) {
        setProperty(AppsFlyerProperties.APP_USER_ID, str);
    }

    public static void setUserEmail(String str) {
        setProperty(AppsFlyerProperties.USER_EMAIL, str);
    }

    public static void setUserEmails(String... strArr) {
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.USER_EMAILS, strArr);
    }

    public static void setUseHTTPFalback(boolean z) {
        setProperty(AppsFlyerProperties.USE_HTTP_FALLBACK, Boolean.toString(z));
    }

    public static void setCollectAndroidID(boolean z) {
        setProperty(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
    }

    public static void setCollectMACAddress(boolean z) {
        setProperty(AppsFlyerProperties.COLLECT_MAC, Boolean.toString(z));
    }

    public static void setCollectIMEI(boolean z) {
        setProperty(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
    }

    public static void setAppsFlyerKey(String str) {
        setProperty(AppsFlyerProperties.AF_KEY, str);
        LogMessages.setDevKey(str);
    }

    public static String getAppUserId() {
        return getProperty(AppsFlyerProperties.APP_USER_ID);
    }

    public static void setAppId(String str) {
        setProperty("appid", str);
    }

    public static String getAppId() {
        return getProperty("appid");
    }

    public static void setExtension(String str) {
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    public static void setIsUpdate(boolean z) {
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public static void setCurrencyCode(String str) {
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public static void sendTracking(Context context) {
        sendTracking(context, (String) null);
        if (shouldLog(context)) {
            Log.i(LOG_TAG, LogMessages.START_LOG_MESSAGE + context.getPackageName());
        }
    }

    private static void monitor(Context context, String str, String str2, String str3) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.IS_MONITOR, false)) {
            Intent intent = new Intent(MonitorMessages.BROADCAST_ACTION);
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra(MonitorMessages.MESSAGE, str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra(MonitorMessages.PROCESS_ID, new Integer(Process.myPid()));
            intent.putExtra(MonitorMessages.EVENT_IDENTIFIER, str);
            intent.putExtra(MonitorMessages.SDK_VERSION, "2.3.1.16");
            context.sendBroadcast(intent);
        }
    }

    public static void setDeviceTrackingDisabled(boolean z) {
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    @Deprecated
    public static void sendTracking(Context context, String str) {
        sendTrackingWithEvent(context, str, (String) null, (String) null);
    }

    public static void sendTrackingWithEvent(Context context, String str, String str2) {
        sendTrackingWithEvent(context, (String) null, str, str2);
    }

    public static Map<String, String> getConversionData(Context context) throws AttributionIDNotReady {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer != null && referrer.length() > 0 && referrer.contains("af_tranid")) {
            return referrerStringToMap(referrer, context);
        }
        String string = sharedPreferences.getString(ATTRIBUTION_ID_PREF, (String) null);
        if (string != null && string.length() > 0) {
            return attributionStringToMap(string);
        }
        throw new AttributionIDNotReady();
    }

    public static void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (appsFlyerConversionListener != null) {
            conversionDataListener = appsFlyerConversionListener;
        }
    }

    @Deprecated
    public static void getConversionData(Context context, final ConversionDataListener conversionDataListener2) {
        registerConversionListener(context, new AppsFlyerConversionListener() {
            public void onInstallConversionDataLoaded(Map<String, String> map) {
                ConversionDataListener.this.onConversionDataLoaded(map);
            }

            public void onInstallConversionFailure(String str) {
                ConversionDataListener.this.onConversionFailure(str);
            }

            public void onAppOpenAttribution(Map<String, String> map) {
            }

            public void onAttributionFailure(String str) {
            }
        });
    }

    private static Map<String, String> referrerStringToMap(String str, Context context) {
        boolean z;
        HashMap hashMap = new HashMap();
        int indexOf = str.indexOf(38);
        if (indexOf < 0 || str.length() <= indexOf + 1) {
            z = false;
        } else {
            z = false;
            for (String split : str.split("\\&")) {
                String[] split2 = split.split("=");
                String str2 = split2.length > 1 ? split2[1] : "";
                String str3 = split2[0];
                if (str3.equals("c")) {
                    str3 = "campaign";
                } else if (str3.equals(MonitorMessages.PROCESS_ID)) {
                    str3 = "media_source";
                } else if (str3.equals("af_prt")) {
                    hashMap.put(str3, str2);
                    str3 = "agency";
                    z = true;
                }
                hashMap.put(str3, str2);
            }
            try {
                if (!hashMap.containsKey("install_time")) {
                    hashMap.put("install_time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
                }
            } catch (Exception e) {
                Log.w(LOG_TAG, "Could not fetch install time");
            }
            if (!hashMap.containsKey("af_status")) {
                hashMap.put("af_status", "Non-organic");
            }
        }
        if (z) {
            hashMap.remove("media_source");
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Map<String, String> attributionStringToMap(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!IGNORABLE_KEYS.contains(next)) {
                    hashMap.put(next, jSONObject.getString(next));
                }
            }
            return hashMap;
        } catch (JSONException e) {
            Log.w(LOG_TAG, e);
            return null;
        }
    }

    public static void sendTrackingWithEvent(Context context, String str, String str2, String str3) {
        if (!(str2 == null || str3 == null || !str3.matches("-?\\d+(\\.\\d+)?"))) {
            Log.i(LOG_TAG, "AppsFLyer: numeric value '" + str3 + "' for event '" + str2 + "' will be categorized as a revenue event.");
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer == null) {
            referrer = "";
        }
        runInBackground(context, str, str2, str3, referrer);
    }

    private static void runInBackground(Context context, String str, String str2, String str3, String str4) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        newSingleThreadScheduledExecutor.schedule(new DataCollector(context, str, str2, str3, str4, newSingleThreadScheduledExecutor), 5, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public static String getEventTag(Map<String, String> map) {
        String str = map.get(ServerParameters.TIMESTAMP);
        if (str == null || str.length() < 5) {
            return LOG_TAG;
        }
        return "AppsFlyer_1.16-" + str.substring(4);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void sendTrackingWithEvent(android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            if (r16 != 0) goto L_0x01b1
            r6 = 1
        L_0x0003:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r2 = "af_timestamp"
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            long r8 = r3.getTime()
            java.lang.String r3 = java.lang.Long.toString(r8)
            r4.put(r2, r3)
            java.lang.String r8 = getEventTag(r4)
            boolean r2 = shouldLog(r14)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x004e
            java.lang.String r2 = "collect data for server"
            java.lang.String r3 = ""
            debugAction(r2, r3, r14)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r2.<init>()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r3 = "******* sendTrackingWithEvent: "
            java.lang.StringBuilder r3 = r2.append(r3)     // Catch:{ Throwable -> 0x03c5 }
            if (r6 == 0) goto L_0x01b4
            java.lang.String r2 = "Launch"
        L_0x003a:
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x03c5 }
            android.util.Log.i(r8, r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r3 = "********* sendTrackingWithEvent: "
            if (r6 == 0) goto L_0x01b8
            java.lang.String r2 = "Launch"
        L_0x004b:
            debugAction(r3, r2, r14)     // Catch:{ Throwable -> 0x03c5 }
        L_0x004e:
            java.lang.String r3 = "EVENT_CREATED_WITH_NAME"
            if (r6 == 0) goto L_0x01bc
            java.lang.String r2 = "Launch"
        L_0x0054:
            monitor(r14, r8, r3, r2)     // Catch:{ Throwable -> 0x03c5 }
            com.appsflyer.cache.CacheManager r2 = com.appsflyer.cache.CacheManager.getInstance()     // Catch:{ Throwable -> 0x03c5 }
            r2.init(r14)     // Catch:{ Throwable -> 0x03c5 }
            android.content.pm.PackageManager r2 = r14.getPackageManager()     // Catch:{ Exception -> 0x0469 }
            java.lang.String r3 = r14.getPackageName()     // Catch:{ Exception -> 0x0469 }
            r5 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r5)     // Catch:{ Exception -> 0x0469 }
            java.lang.String[] r2 = r2.requestedPermissions     // Catch:{ Exception -> 0x0469 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x0469 }
            java.lang.String r3 = "android.permission.INTERNET"
            boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x0469 }
            if (r3 != 0) goto L_0x0088
            java.lang.String r3 = "AppsFlyer_1.16"
            java.lang.String r5 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            android.util.Log.w(r3, r5)     // Catch:{ Exception -> 0x0469 }
            r3 = 0
            java.lang.String r5 = "PERMISSION_INTERNET_MISSING"
            r7 = 0
            monitor(r14, r3, r5, r7)     // Catch:{ Exception -> 0x0469 }
        L_0x0088:
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r3 = r2.contains(r3)     // Catch:{ Exception -> 0x0469 }
            if (r3 != 0) goto L_0x0097
            java.lang.String r3 = "AppsFlyer_1.16"
            java.lang.String r5 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            android.util.Log.w(r3, r5)     // Catch:{ Exception -> 0x0469 }
        L_0x0097:
            java.lang.String r3 = "android.permission.ACCESS_WIFI_STATE"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0469 }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = "AppsFlyer_1.16"
            java.lang.String r3 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x0469 }
        L_0x00a6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r3.<init>()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "https://track.appsflyer.com/api/v2.3/androidevent?buildnumber=1.16&app_id="
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = r14.getPackageName()     // Catch:{ Throwable -> 0x03c5 }
            r2.append(r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "brand"
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "device"
            java.lang.String r5 = android.os.Build.DEVICE     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "product"
            java.lang.String r5 = android.os.Build.PRODUCT     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "sdk"
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "model"
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "deviceType"
            java.lang.String r5 = android.os.Build.TYPE     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "sdkExtension"
            java.lang.String r2 = r2.getString(r5)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x00fd
            int r5 = r2.length()     // Catch:{ Throwable -> 0x03c5 }
            if (r5 <= 0) goto L_0x00fd
            java.lang.String r5 = "sdkExtension"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x00fd:
            java.lang.String r2 = getConfiguredChannel(r14)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = getCachedChannel(r14, r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r5 == 0) goto L_0x010c
            java.lang.String r7 = "channel"
            r4.put(r7, r5)     // Catch:{ Throwable -> 0x03c5 }
        L_0x010c:
            if (r5 == 0) goto L_0x0114
            boolean r7 = r5.equals(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r7 == 0) goto L_0x0118
        L_0x0114:
            if (r5 != 0) goto L_0x011d
            if (r2 == 0) goto L_0x011d
        L_0x0118:
            java.lang.String r5 = "af_latestchannel"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x011d:
            java.lang.String r2 = getCachedStore(r14)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x012c
            java.lang.String r5 = "af_installstore"
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x012c:
            java.lang.String r2 = getPreInstallName(r14)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x013b
            java.lang.String r5 = "af_preinstall_name"
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x013b:
            java.lang.String r2 = getCurrentStore(r14)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x014a
            java.lang.String r5 = "af_currentstore"
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x014a:
            if (r15 == 0) goto L_0x0152
            int r2 = r15.length()     // Catch:{ Throwable -> 0x03c5 }
            if (r2 != 0) goto L_0x0158
        L_0x0152:
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r15 = getProperty(r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0158:
            if (r15 == 0) goto L_0x01c0
            int r2 = r15.length()     // Catch:{ Throwable -> 0x03c5 }
            if (r2 <= 0) goto L_0x01c0
            java.lang.String r2 = "appsflyerKey"
            r4.put(r2, r15)     // Catch:{ Throwable -> 0x03c5 }
            int r2 = r15.length()     // Catch:{ Throwable -> 0x03c5 }
            r5 = 8
            if (r2 <= r5) goto L_0x0179
            java.lang.String r2 = "dkh"
            r5 = 0
            r7 = 8
            java.lang.String r5 = r15.substring(r5, r7)     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0179:
            java.lang.String r2 = getAppUserId()     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x0184
            java.lang.String r5 = "appUserId"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0184:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "userEmails"
            java.lang.String[] r5 = r2.getStringArray(r5)     // Catch:{ Throwable -> 0x03c5 }
            if (r5 == 0) goto L_0x03cf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r7.<init>()     // Catch:{ Throwable -> 0x03c5 }
            int r9 = r5.length     // Catch:{ Throwable -> 0x03c5 }
            r2 = 0
        L_0x0197:
            if (r2 >= r9) goto L_0x01d1
            r10 = r5[r2]     // Catch:{ Throwable -> 0x03c5 }
            int r11 = r7.length()     // Catch:{ Throwable -> 0x03c5 }
            r12 = 1
            if (r11 <= r12) goto L_0x01a7
            r11 = 44
            r7.append(r11)     // Catch:{ Throwable -> 0x03c5 }
        L_0x01a7:
            java.lang.String r10 = com.appsflyer.HashUtils.toSHA1(r10)     // Catch:{ Throwable -> 0x03c5 }
            r7.append(r10)     // Catch:{ Throwable -> 0x03c5 }
            int r2 = r2 + 1
            goto L_0x0197
        L_0x01b1:
            r6 = 0
            goto L_0x0003
        L_0x01b4:
            r2 = r16
            goto L_0x003a
        L_0x01b8:
            r2 = r16
            goto L_0x004b
        L_0x01bc:
            r2 = r16
            goto L_0x0054
        L_0x01c0:
            java.lang.String r2 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.setAppsFlyerKey(...) to set it. "
            android.util.Log.e(r8, r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "DEV_KEY_MISSING"
            r3 = 0
            monitor(r14, r8, r2, r3)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "AppsFlyer will not track this event."
            android.util.Log.e(r8, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x01d0:
            return
        L_0x01d1:
            java.lang.String r2 = "sha1_el_arr"
            java.lang.String r5 = r7.toString()     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
        L_0x01da:
            if (r16 == 0) goto L_0x01ec
            java.lang.String r2 = "eventName"
            r0 = r16
            r4.put(r2, r0)     // Catch:{ Throwable -> 0x03c5 }
            if (r17 == 0) goto L_0x01ec
            java.lang.String r2 = "eventValue"
            r0 = r17
            r4.put(r2, r0)     // Catch:{ Throwable -> 0x03c5 }
        L_0x01ec:
            java.lang.String r2 = "appid"
            java.lang.String r2 = getProperty(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x01ff
            java.lang.String r2 = "appid"
            java.lang.String r5 = "appid"
            java.lang.String r5 = getProperty(r5)     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
        L_0x01ff:
            java.lang.String r2 = "currencyCode"
            java.lang.String r2 = getProperty(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x0231
            int r5 = r2.length()     // Catch:{ Throwable -> 0x03c5 }
            r7 = 3
            if (r5 == r7) goto L_0x022c
            java.lang.String r5 = "AppsFlyer_1.16"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r7.<init>()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "WARNING:currency code should be 3 characters!!! '"
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.StringBuilder r7 = r7.append(r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "' is not a legal value."
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x03c5 }
            android.util.Log.w(r5, r7)     // Catch:{ Throwable -> 0x03c5 }
        L_0x022c:
            java.lang.String r5 = "currency"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0231:
            java.lang.String r2 = "IS_UPDATE"
            java.lang.String r2 = getProperty(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x023e
            java.lang.String r5 = "isUpdate"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x023e:
            boolean r2 = isPreInstalledApp(r14)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "af_preinstalled"
            java.lang.String r2 = java.lang.Boolean.toString(r2)     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            android.content.ContentResolver r2 = r14.getContentResolver()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = getAttributionId(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x025a
            java.lang.String r5 = "fb"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x025a:
            addDeviceTracking(r14, r4)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = com.appsflyer.Installation.m4886id(r14)     // Catch:{ Exception -> 0x03e2 }
            if (r2 == 0) goto L_0x0268
            java.lang.String r5 = "uid"
            r4.put(r5, r2)     // Catch:{ Exception -> 0x03e2 }
        L_0x0268:
            java.lang.String r2 = "lang"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0466 }
            java.lang.String r5 = r5.getDisplayLanguage()     // Catch:{ Exception -> 0x0466 }
            r4.put(r2, r5)     // Catch:{ Exception -> 0x0466 }
        L_0x0275:
            java.lang.String r2 = "phone"
            java.lang.Object r2 = r14.getSystemService(r2)     // Catch:{ Exception -> 0x0463 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x0463 }
            java.lang.String r5 = "operator"
            java.lang.String r7 = r2.getSimOperatorName()     // Catch:{ Exception -> 0x0463 }
            r4.put(r5, r7)     // Catch:{ Exception -> 0x0463 }
            java.lang.String r5 = "carrier"
            java.lang.String r2 = r2.getNetworkOperatorName()     // Catch:{ Exception -> 0x0463 }
            r4.put(r5, r2)     // Catch:{ Exception -> 0x0463 }
        L_0x028f:
            java.lang.String r2 = "network"
            java.lang.String r5 = getNetwork(r14)     // Catch:{ Throwable -> 0x040d }
            r4.put(r2, r5)     // Catch:{ Throwable -> 0x040d }
        L_0x0298:
            addAdvertiserIDData(r14, r4)     // Catch:{ Throwable -> 0x03c5 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "yyyy-MM-dd_hhmmZ"
            r2.<init>(r5)     // Catch:{ Throwable -> 0x03c5 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x03c5 }
            r7 = 9
            if (r5 < r7) goto L_0x02c5
            android.content.pm.PackageManager r5 = r14.getPackageManager()     // Catch:{ Exception -> 0x0460 }
            java.lang.String r7 = r14.getPackageName()     // Catch:{ Exception -> 0x0460 }
            r9 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r9)     // Catch:{ Exception -> 0x0460 }
            long r10 = r5.firstInstallTime     // Catch:{ Exception -> 0x0460 }
            java.lang.String r5 = "installDate"
            java.util.Date r7 = new java.util.Date     // Catch:{ Exception -> 0x0460 }
            r7.<init>(r10)     // Catch:{ Exception -> 0x0460 }
            java.lang.String r7 = r2.format(r7)     // Catch:{ Exception -> 0x0460 }
            r4.put(r5, r7)     // Catch:{ Exception -> 0x0460 }
        L_0x02c5:
            android.content.pm.PackageManager r5 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r7 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r9 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r7 = "app_version_code"
            int r9 = r5.versionCode     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r4.put(r7, r9)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r7 = "app_version_name"
            java.lang.String r9 = r5.versionName     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r4.put(r7, r9)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            long r10 = r5.firstInstallTime     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            long r12 = r5.lastUpdateTime     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r5 = "date1"
            java.util.Date r7 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r7.<init>(r10)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r7 = r2.format(r7)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r4.put(r5, r7)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r5 = "date2"
            java.util.Date r7 = new java.util.Date     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r7.<init>(r12)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r7 = r2.format(r7)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            r4.put(r5, r7)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r2 = getFirstInstallDate(r2, r14)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
            java.lang.String r5 = "firstLaunchDate"
            r4.put(r5, r2)     // Catch:{ NameNotFoundException -> 0x045d, NoSuchFieldError -> 0x045a }
        L_0x030d:
            int r2 = r18.length()     // Catch:{ Throwable -> 0x03c5 }
            if (r2 <= 0) goto L_0x031a
            java.lang.String r2 = "referrer"
            r0 = r18
            r4.put(r2, r0)     // Catch:{ Throwable -> 0x03c5 }
        L_0x031a:
            java.lang.String r2 = "appsflyer-data"
            r5 = 0
            android.content.SharedPreferences r5 = r14.getSharedPreferences(r2, r5)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = "attributionId"
            r7 = 0
            java.lang.String r2 = r5.getString(r2, r7)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x0335
            int r7 = r2.length()     // Catch:{ Throwable -> 0x03c5 }
            if (r7 <= 0) goto L_0x0335
            java.lang.String r7 = "installAttribution"
            r4.put(r7, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0335:
            if (r6 == 0) goto L_0x0448
            boolean r2 = r14 instanceof android.app.Activity     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x0448
            r0 = r14
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ Throwable -> 0x03c5 }
            r2 = r0
            android.content.Intent r2 = r2.getIntent()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r7 = r2.getAction()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "android.intent.action.VIEW"
            if (r7 != r9) goto L_0x03b2
            android.net.Uri r2 = r2.getData()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r7 = "af_deeplink"
            java.lang.String r7 = r2.getQueryParameter(r7)     // Catch:{ Throwable -> 0x03c5 }
            if (r7 == 0) goto L_0x042c
            java.lang.String r7 = "af_deeplink_launch"
            java.lang.String r9 = "true"
            r4.put(r7, r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r7 = r2.getQuery()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x03c5 }
            java.util.Map r7 = referrerStringToMap(r7, r14)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = r2.getPath()     // Catch:{ Throwable -> 0x03c5 }
            if (r9 == 0) goto L_0x0379
            java.lang.String r9 = "path"
            java.lang.String r10 = r2.getPath()     // Catch:{ Throwable -> 0x03c5 }
            r7.put(r9, r10)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0379:
            java.lang.String r9 = r2.getScheme()     // Catch:{ Throwable -> 0x03c5 }
            if (r9 == 0) goto L_0x0388
            java.lang.String r9 = "scheme"
            java.lang.String r2 = r2.getScheme()     // Catch:{ Throwable -> 0x03c5 }
            r7.put(r9, r2)     // Catch:{ Throwable -> 0x03c5 }
        L_0x0388:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x03c5 }
            r2.<init>(r7)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "af_deeplink_attr"
            r4.put(r9, r2)     // Catch:{ Throwable -> 0x03c5 }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "deeplinkAttribution"
            r5.putString(r9, r2)     // Catch:{ Throwable -> 0x03c5 }
            r5.commit()     // Catch:{ Throwable -> 0x03c5 }
            com.appsflyer.AppsFlyerConversionListener r2 = conversionDataListener     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x03ab
            com.appsflyer.AppsFlyerConversionListener r2 = conversionDataListener     // Catch:{ Throwable -> 0x03c5 }
            r2.onAppOpenAttribution(r7)     // Catch:{ Throwable -> 0x03c5 }
        L_0x03ab:
            java.io.PrintStream r2 = java.lang.System.out     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "AppsFlyerLib.sendTrackingWithEvent"
            r2.println(r5)     // Catch:{ Throwable -> 0x03c5 }
        L_0x03b2:
            com.appsflyer.AppsFlyerLib$SendToServerRunnable r2 = new com.appsflyer.AppsFlyerLib$SendToServerRunnable     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x03c5 }
            android.content.Context r5 = r14.getApplicationContext()     // Catch:{ Throwable -> 0x03c5 }
            r7 = 0
            r2.<init>(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x03c5 }
            r2.run()     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x01d0
        L_0x03c5:
            r2 = move-exception
            java.lang.String r3 = r2.getLocalizedMessage()
            android.util.Log.e(r8, r3, r2)
            goto L_0x01d0
        L_0x03cf:
            java.lang.String r2 = "userEmail"
            java.lang.String r2 = getProperty(r2)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x01da
            java.lang.String r5 = "sha1_el"
            java.lang.String r2 = com.appsflyer.HashUtils.toSHA1(r2)     // Catch:{ Throwable -> 0x03c5 }
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x01da
        L_0x03e2:
            r2 = move-exception
            java.lang.String r5 = "AppsFlyer_1.16"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r7.<init>()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "ERROR:"
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "ERROR:"
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "could not get uid "
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.StringBuilder r2 = r7.append(r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x03c5 }
            android.util.Log.i(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x0268
        L_0x040d:
            r2 = move-exception
            java.lang.String r5 = "AppsFlyer_1.16"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03c5 }
            r7.<init>()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r9 = "checking network error "
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.StringBuilder r2 = r7.append(r2)     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x03c5 }
            android.util.Log.i(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x0298
        L_0x042c:
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ Throwable -> 0x03c5 }
            java.lang.String r5 = "AppsFlyerKey"
            java.lang.String r5 = getProperty(r5)     // Catch:{ Throwable -> 0x03c5 }
            com.appsflyer.AppsFlyerLib$ReAttributionIdFetcher r7 = new com.appsflyer.AppsFlyerLib$ReAttributionIdFetcher     // Catch:{ Throwable -> 0x03c5 }
            android.content.Context r9 = r14.getApplicationContext()     // Catch:{ Throwable -> 0x03c5 }
            r7.<init>(r9, r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            r10 = 100
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x03c5 }
            r2.schedule(r7, r10, r5)     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x03ab
        L_0x0448:
            if (r6 != 0) goto L_0x03b2
            java.lang.String r2 = "deeplinkAttribution"
            r7 = 0
            java.lang.String r2 = r5.getString(r2, r7)     // Catch:{ Throwable -> 0x03c5 }
            if (r2 == 0) goto L_0x03b2
            java.lang.String r5 = "af_deeplink_attr"
            r4.put(r5, r2)     // Catch:{ Throwable -> 0x03c5 }
            goto L_0x03b2
        L_0x045a:
            r2 = move-exception
            goto L_0x030d
        L_0x045d:
            r2 = move-exception
            goto L_0x030d
        L_0x0460:
            r5 = move-exception
            goto L_0x02c5
        L_0x0463:
            r2 = move-exception
            goto L_0x028f
        L_0x0466:
            r2 = move-exception
            goto L_0x0275
        L_0x0469:
            r2 = move-exception
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.sendTrackingWithEvent(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static void addDeviceTracking(Context context, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI, true);
        String string = sharedPreferences.getString(IMEI_CACHED_PREF, (String) null);
        if (z) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String str = (String) telephonyManager.getClass().getMethod("getDeviceId", new Class[0]).invoke(telephonyManager, new Object[0]);
                if (str == null) {
                    str = string;
                } else if (string == null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(IMEI_CACHED_PREF, str);
                    if (Build.VERSION.SDK_INT >= 9) {
                        edit.apply();
                    } else {
                        edit.commit();
                    }
                }
                if (str != null) {
                    map.put(Settings.IMEI, str);
                }
            } catch (Exception e) {
                Log.i(LOG_TAG, "WARNING:READ_PHONE_STATE is missing");
            }
        }
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true);
        String string2 = sharedPreferences.getString(ANDROID_ID_CACHED_PREF, (String) null);
        if (z2) {
            try {
                String string3 = Settings.Secure.getString(context.getContentResolver(), com.cootek.smartinput5.engine.Settings.ANDROID_ID);
                if (string3 != null) {
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putString(ANDROID_ID_CACHED_PREF, string3);
                    if (Build.VERSION.SDK_INT >= 9) {
                        edit2.apply();
                        string2 = string3;
                    } else {
                        edit2.commit();
                        string2 = string3;
                    }
                }
                if (string2 != null) {
                    map.put(com.cootek.smartinput5.engine.Settings.ANDROID_ID, string2);
                }
            } catch (Exception e2) {
            }
        }
    }

    private static boolean isAppsFlyerFirstLaunch(Context context) {
        if (!context.getSharedPreferences(AF_SHARED_PREF, 0).contains(AF_COUNTER_PREF)) {
            return true;
        }
        return false;
    }

    private static String getCachedStore(Context context) {
        String str = null;
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        if (sharedPreferences.contains(INSTALL_STORE_PREF)) {
            return sharedPreferences.getString(INSTALL_STORE_PREF, (String) null);
        }
        boolean isAppsFlyerFirstLaunch = isAppsFlyerFirstLaunch(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (isAppsFlyerFirstLaunch) {
            str = getCurrentStore(context);
        }
        edit.putString(INSTALL_STORE_PREF, str);
        edit.commit();
        return str;
    }

    private static String getCurrentStore(Context context) {
        Object obj;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (!(bundle == null || (obj = bundle.get("AF_STORE")) == null)) {
                return obj instanceof String ? (String) obj : obj.toString();
            }
        } catch (Exception e) {
            if (shouldLog(context)) {
                Log.i(LOG_TAG, "Could not find AF_STORE value in the manifest", e);
            }
        }
        return null;
    }

    private static String getPreInstallName(Context context) {
        String str;
        Object obj;
        String str2 = null;
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        if (sharedPreferences.contains(PRE_INSTALL_PREF)) {
            return sharedPreferences.getString(PRE_INSTALL_PREF, (String) null);
        }
        boolean isAppsFlyerFirstLaunch = isAppsFlyerFirstLaunch(context);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (isAppsFlyerFirstLaunch) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null || (obj = bundle.get("AF_PRE_INSTALL_NAME")) == null) {
                    str = null;
                } else {
                    str = obj instanceof String ? (String) obj : obj.toString();
                }
                str2 = str;
            } catch (Exception e) {
                if (shouldLog(context)) {
                    Log.i(LOG_TAG, "Could not find AF_PRE_INSTALL_NAME value in the manifest", e);
                }
            }
        }
        edit.putString(PRE_INSTALL_PREF, str2);
        edit.commit();
        return str2;
    }

    private static void checkCache(Context context) {
        if (!isDuringCheckCache && System.currentTimeMillis() - lastCacheCheck >= 15000 && cacheScheduler == null) {
            cacheScheduler = Executors.newSingleThreadScheduledExecutor();
            cacheScheduler.schedule(new CachedRequestSender(context), 1, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    public static String getConfiguredChannel(Context context) {
        String str;
        Object obj;
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string != null) {
            return string;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || (obj = bundle.get("CHANNEL")) == null) {
                str = string;
            } else {
                str = obj instanceof String ? (String) obj : obj.toString();
            }
            return str;
        } catch (Exception e) {
            Log.i(LOG_TAG, "Could not load CHANNEL value", e);
            return string;
        }
    }

    public static boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(LOG_TAG, "Could not check if app is pre installed", e);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static String getCachedChannel(Context context, String str) throws PackageManager.NameNotFoundException {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        if (sharedPreferences.contains(CACHED_CHANNEL_PREF)) {
            return sharedPreferences.getString(CACHED_CHANNEL_PREF, (String) null);
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(CACHED_CHANNEL_PREF, str);
        edit.commit();
        return str;
    }

    private static String getFirstInstallDate(SimpleDateFormat simpleDateFormat, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        String string = sharedPreferences.getString(FIRST_INSTALL_PREF, (String) null);
        if (string == null) {
            if (isAppsFlyerFirstLaunch(context)) {
                if (shouldLog(context)) {
                    Log.d(LOG_TAG, "AppsFlyer: first launch detected");
                }
                string = simpleDateFormat.format(new Date());
            } else {
                string = "";
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(FIRST_INSTALL_PREF, string);
            edit.commit();
        }
        if (shouldLog(context)) {
            Log.i(LOG_TAG, "AppsFlyer: first launch date: " + string);
        }
        return string;
    }

    private static void addAdvertiserIDData(Context context, Map<String, String> map) {
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            String id = advertisingIdInfo.getId();
            map.put(ServerParameters.ADVERTISING_ID_PARAM, id);
            String bool = Boolean.toString(!advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(ServerParameters.ADVERTISING_ID_ENABLED_PARAM, bool);
            AppsFlyerProperties.getInstance().set(ServerParameters.ADVERTISING_ID_PARAM, id);
            AppsFlyerProperties.getInstance().set(ServerParameters.ADVERTISING_ID_ENABLED_PARAM, bool);
        } catch (ClassNotFoundException e) {
            if (shouldLog(context)) {
                Log.i(LOG_TAG, "WARNING:Google Play services SDK jar is missing.");
            }
        } catch (Exception e2) {
            String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
            if (string != null) {
                map.put(ServerParameters.ADVERTISING_ID_PARAM, string);
            }
            String string2 = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_ENABLED_PARAM);
            if (string2 != null) {
                map.put(ServerParameters.ADVERTISING_ID_ENABLED_PARAM, string2);
            }
            if (e2.getLocalizedMessage() != null) {
                Log.i(LOG_TAG, e2.getLocalizedMessage());
            } else {
                Log.i(LOG_TAG, e2.toString());
            }
            debugAction("Could not fetch advertiser id: ", e2.getLocalizedMessage(), context);
        }
    }

    public static String getAttributionId(ContentResolver contentResolver) {
        String str = null;
        ContentResolver contentResolver2 = contentResolver;
        Cursor query = contentResolver2.query(ATTRIBUTION_ID_CONTENT_URI, new String[]{ATTRIBUTION_ID_COLUMN_NAME}, (String) null, (String[]) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndex(ATTRIBUTION_ID_COLUMN_NAME));
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e) {
                        }
                    }
                    return str;
                }
            } catch (Exception e2) {
                Log.w(LOG_TAG, "Could not collect cursor attribution", e2);
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e3) {
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e4) {
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            try {
                query.close();
            } catch (Exception e5) {
            }
        }
        return str;
    }

    /* access modifiers changed from: private */
    public static int getCounter(Context context, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AF_SHARED_PREF, 0);
        int i = sharedPreferences.getInt(AF_COUNTER_PREF, 0);
        if (!z) {
            return i;
        }
        int i2 = i + 1;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(AF_COUNTER_PREF, i2);
        edit.commit();
        return i2;
    }

    private static String getNetwork(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.getNetworkInfo(1).isConnectedOrConnecting()) {
            return "WIFI";
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            return "unkown";
        }
        return "MOBILE";
    }

    public static String getAppsFlyerUID(Context context) {
        return Installation.m4886id(context);
    }

    /* access modifiers changed from: private */
    public static void sendRequestToServer(String str, String str2, String str3, WeakReference<Context> weakReference, String str4, String str5, boolean z) throws IOException {
        URL url = new URL(str);
        if (shouldLog((Context) weakReference.get())) {
            Log.i(str5, "url: " + url.toString());
        }
        debugAction(CALL_SERVER_ACTION, C0911j.f2473c + url.toString() + "\nPOST:" + str2, (Context) weakReference.get());
        if (shouldLog((Context) weakReference.get())) {
            LogMessages.logMessageMaskKey(LogMessages.EVENT_DATA + str2);
        }
        monitor((Context) weakReference.get(), str5, MonitorMessages.EVENT_DATA, str2);
        if (z) {
            AppsFlyerProperties.getInstance().setLaunchCollectedReferrer();
        }
        try {
            callServer(url, str2, str3, weakReference, str4, str5, z);
        } catch (IOException e) {
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                debugAction("https failed: " + e.getLocalizedMessage(), "", (Context) weakReference.get());
                callServer(new URL(str.replace("https:", "http:")), str2, str3, weakReference, str4, str5, z);
                return;
            }
            Log.i(str5, LogMessages.SERVER_CALL_FAILRED + e.getLocalizedMessage());
            monitor((Context) weakReference.get(), str5, MonitorMessages.ERROR, e.getLocalizedMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db A[SYNTHETIC, Splitter:B:34:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void callServer(java.net.URL r7, java.lang.String r8, java.lang.String r9, java.lang.ref.WeakReference<android.content.Context> r10, java.lang.String r11, java.lang.String r12, boolean r13) throws java.io.IOException {
        /*
            r6 = 1
            r3 = 0
            java.lang.Object r0 = r10.get()
            android.content.Context r0 = (android.content.Context) r0
            java.net.URLConnection r1 = r7.openConnection()     // Catch:{ all -> 0x0112 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x00df }
            byte[] r2 = r8.getBytes()     // Catch:{ all -> 0x00df }
            int r2 = r2.length     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "Content-Length"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r5.<init>()     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r5 = ""
            java.lang.StringBuilder r2 = r2.append(r5)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r1.setRequestProperty(r4, r2)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "Connection"
            java.lang.String r4 = "close"
            r1.setRequestProperty(r2, r4)     // Catch:{ all -> 0x00df }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00df }
            r2 = 1
            r1.setDoOutput(r2)     // Catch:{ all -> 0x00df }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00d7 }
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ all -> 0x00d7 }
            r2.<init>(r4)     // Catch:{ all -> 0x00d7 }
            r2.write(r8)     // Catch:{ all -> 0x0115 }
            if (r2 == 0) goto L_0x0051
            r2.close()     // Catch:{ all -> 0x00df }
        L_0x0051:
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00df }
            boolean r3 = shouldLog(r0)     // Catch:{ all -> 0x00df }
            if (r3 == 0) goto L_0x0071
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r3.<init>()     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "response code: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ all -> 0x00df }
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00df }
            android.util.Log.i(r12, r3)     // Catch:{ all -> 0x00df }
        L_0x0071:
            java.lang.String r3 = "SERVER_RESPONSE_CODE"
            java.lang.String r4 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x00df }
            monitor(r0, r12, r3, r4)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "response from server. status="
            java.lang.String r4 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x00df }
            debugAction(r3, r4, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "appsflyer-data"
            r4 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)     // Catch:{ all -> 0x00df }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 != r4) goto L_0x00b0
            if (r11 == 0) goto L_0x0097
            com.appsflyer.cache.CacheManager r2 = com.appsflyer.cache.CacheManager.getInstance()     // Catch:{ all -> 0x00df }
            r2.deleteRequest(r11, r0)     // Catch:{ all -> 0x00df }
        L_0x0097:
            java.lang.Object r2 = r10.get()     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00b0
            if (r11 != 0) goto L_0x00b0
            android.content.SharedPreferences$Editor r2 = r3.edit()     // Catch:{ all -> 0x00df }
            java.lang.String r4 = "sentSuccessfully"
            java.lang.String r5 = "true"
            r2.putString(r4, r5)     // Catch:{ all -> 0x00df }
            r2.commit()     // Catch:{ all -> 0x00df }
            checkCache(r0)     // Catch:{ all -> 0x00df }
        L_0x00b0:
            java.lang.String r2 = "attributionId"
            r4 = 0
            java.lang.String r2 = r3.getString(r2, r4)     // Catch:{ all -> 0x00df }
            if (r2 != 0) goto L_0x00e6
            if (r9 == 0) goto L_0x00e6
            if (r13 == 0) goto L_0x00e6
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ all -> 0x00df }
            com.appsflyer.AppsFlyerLib$InstallAttributionIdFetcher r3 = new com.appsflyer.AppsFlyerLib$InstallAttributionIdFetcher     // Catch:{ all -> 0x00df }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x00df }
            r3.<init>(r0, r9, r2)     // Catch:{ all -> 0x00df }
            r4 = 10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00df }
            r2.schedule(r3, r4, r0)     // Catch:{ all -> 0x00df }
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.disconnect()
        L_0x00d6:
            return
        L_0x00d7:
            r0 = move-exception
            r2 = r3
        L_0x00d9:
            if (r2 == 0) goto L_0x00de
            r2.close()     // Catch:{ all -> 0x00df }
        L_0x00de:
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00df:
            r0 = move-exception
        L_0x00e0:
            if (r1 == 0) goto L_0x00e5
            r1.disconnect()
        L_0x00e5:
            throw r0
        L_0x00e6:
            if (r9 != 0) goto L_0x00ee
            java.lang.String r0 = "AppsFlyer dev key is missing."
            android.util.Log.w(r12, r0)     // Catch:{ all -> 0x00df }
            goto L_0x00d1
        L_0x00ee:
            if (r13 == 0) goto L_0x00d1
            com.appsflyer.AppsFlyerConversionListener r2 = conversionDataListener     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00d1
            java.lang.String r2 = "attributionId"
            r4 = 0
            java.lang.String r2 = r3.getString(r2, r4)     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x00d1
            r2 = 0
            int r2 = getCounter(r0, r2)     // Catch:{ all -> 0x00df }
            if (r2 <= r6) goto L_0x00d1
            java.util.Map r0 = getConversionData(r0)     // Catch:{ AttributionIDNotReady -> 0x0110 }
            if (r0 == 0) goto L_0x00d1
            com.appsflyer.AppsFlyerConversionListener r2 = conversionDataListener     // Catch:{ AttributionIDNotReady -> 0x0110 }
            r2.onInstallConversionDataLoaded(r0)     // Catch:{ AttributionIDNotReady -> 0x0110 }
            goto L_0x00d1
        L_0x0110:
            r0 = move-exception
            goto L_0x00d1
        L_0x0112:
            r0 = move-exception
            r1 = r3
            goto L_0x00e0
        L_0x0115:
            r0 = move-exception
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.callServer(java.net.URL, java.lang.String, java.lang.String, java.lang.ref.WeakReference, java.lang.String, java.lang.String, boolean):void");
    }

    private static class DataCollector implements Runnable {
        private String appsFlyerKey;
        private Context context;
        private String eventName;
        private String eventValue;
        private ExecutorService executor;
        private String referrer;

        private DataCollector(Context context2, String str, String str2, String str3, String str4, ExecutorService executorService) {
            this.context = context2;
            this.appsFlyerKey = str;
            this.eventName = str2;
            this.eventValue = str3;
            this.referrer = str4;
            this.executor = executorService;
        }

        public void run() {
            AppsFlyerLib.sendTrackingWithEvent(this.context, this.appsFlyerKey, this.eventName, this.eventValue, this.referrer);
            this.executor.shutdown();
        }
    }

    private static class SendToServerRunnable implements Runnable {
        private WeakReference<Context> ctxReference;
        boolean isLaunch;
        Map<String, String> params;
        private String urlString;

        private SendToServerRunnable(String str, Map<String, String> map, Context context, boolean z) {
            this.ctxReference = null;
            this.urlString = str;
            this.params = map;
            this.ctxReference = new WeakReference<>(context);
            this.isLaunch = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
            android.util.Log.e(r5, r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4 A[ExcHandler: Throwable (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0009] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                r3 = 0
                r2 = 1
                r4 = 0
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.params
                java.lang.String r5 = com.appsflyer.AppsFlyerLib.getEventTag(r0)
                java.lang.ref.WeakReference<android.content.Context> r0 = r9.ctxReference     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                android.content.Context r0 = (android.content.Context) r0     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r0 == 0) goto L_0x00f0
                com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r1 = r1.getReferrer(r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r1 == 0) goto L_0x0034
                int r6 = r1.length()     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r6 <= 0) goto L_0x0034
                java.util.Map<java.lang.String, java.lang.String> r6 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r7 = "referrer"
                java.lang.Object r6 = r6.get(r7)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r6 != 0) goto L_0x0034
                java.util.Map<java.lang.String, java.lang.String> r6 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r7 = "referrer"
                r6.put(r7, r1)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
            L_0x0034:
                java.lang.String r1 = "appsflyer-data"
                r6 = 0
                android.content.SharedPreferences r1 = r0.getSharedPreferences(r1, r6)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r6 = "true"
                java.lang.String r7 = "sentSuccessfully"
                java.lang.String r8 = ""
                java.lang.String r1 = r1.getString(r7, r8)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                boolean r6 = r6.equals(r1)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r7 = "eventName"
                java.lang.Object r1 = r1.get(r7)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r7 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r8 = "counter"
                if (r1 != 0) goto L_0x008c
                r1 = r2
            L_0x005a:
                int r0 = com.appsflyer.AppsFlyerLib.getCounter(r0, r1)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                r7.put(r8, r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                r0 = r6
            L_0x0066:
                java.util.Map<java.lang.String, java.lang.String> r1 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r6 = "isFirstCall"
                if (r0 != 0) goto L_0x008e
                r0 = r2
            L_0x006d:
                java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                r1.put(r6, r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r1 = "appsflyerKey"
                java.lang.Object r2 = r0.get(r1)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r2 == 0) goto L_0x0086
                int r0 = r2.length()     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                if (r0 != 0) goto L_0x0090
            L_0x0086:
                java.lang.String r0 = "Not sending data yet, waiting for dev key"
                android.util.Log.d(r5, r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
            L_0x008b:
                return
            L_0x008c:
                r1 = r4
                goto L_0x005a
            L_0x008e:
                r0 = r4
                goto L_0x006d
            L_0x0090:
                com.appsflyer.HashUtils r0 = new com.appsflyer.HashUtils     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                r0.<init>()     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r0 = r0.getHashCode(r1)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r4 = "af_v"
                r1.put(r4, r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.params     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r1 = com.appsflyer.AppsFlyerLib.mapToString(r0)     // Catch:{ IOException -> 0x00ed, Throwable -> 0x00e4 }
                java.lang.String r0 = r9.urlString     // Catch:{ IOException -> 0x00b3, Throwable -> 0x00e4 }
                java.lang.ref.WeakReference<android.content.Context> r3 = r9.ctxReference     // Catch:{ IOException -> 0x00b3, Throwable -> 0x00e4 }
                r4 = 0
                boolean r6 = r9.isLaunch     // Catch:{ IOException -> 0x00b3, Throwable -> 0x00e4 }
                com.appsflyer.AppsFlyerLib.sendRequestToServer(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00b3, Throwable -> 0x00e4 }
                goto L_0x008b
            L_0x00b3:
                r0 = move-exception
            L_0x00b4:
                if (r1 == 0) goto L_0x008b
                java.lang.ref.WeakReference<android.content.Context> r2 = r9.ctxReference
                if (r2 == 0) goto L_0x008b
                java.lang.String r2 = r9.urlString
                java.lang.String r3 = "&isCachedRequest=true"
                boolean r2 = r2.contains(r3)
                if (r2 != 0) goto L_0x008b
                java.lang.String r2 = r0.getMessage()
                android.util.Log.e(r5, r2, r0)
                com.appsflyer.cache.CacheManager r2 = com.appsflyer.cache.CacheManager.getInstance()
                com.appsflyer.cache.RequestCacheData r3 = new com.appsflyer.cache.RequestCacheData
                java.lang.String r0 = r9.urlString
                java.lang.String r4 = "1.16"
                r3.<init>(r0, r1, r4)
                java.lang.ref.WeakReference<android.content.Context> r0 = r9.ctxReference
                java.lang.Object r0 = r0.get()
                android.content.Context r0 = (android.content.Context) r0
                r2.cacheRequest(r3, r0)
                goto L_0x008b
            L_0x00e4:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                android.util.Log.e(r5, r1, r0)
                goto L_0x008b
            L_0x00ed:
                r0 = move-exception
                r1 = r3
                goto L_0x00b4
            L_0x00f0:
                r0 = r4
                goto L_0x0066
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.SendToServerRunnable.run():void");
        }
    }

    /* access modifiers changed from: private */
    public static String mapToString(Map<String, String> map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (String next : map.keySet()) {
            String str = map.get(next);
            String encode = str == null ? "" : URLEncoder.encode(str, Utils.UTF8);
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append(next).append('=').append(encode);
        }
        return sb.toString();
    }

    private static class InstallAttributionIdFetcher extends AttributionIdFetcher {
        public InstallAttributionIdFetcher(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        public String getUrl() {
            return "https://api.appsflyer.com/install_data/v3/";
        }

        /* access modifiers changed from: protected */
        public void callback(Map<String, String> map) {
            AppsFlyerLib.conversionDataListener.onInstallConversionDataLoaded(map);
        }

        /* access modifiers changed from: protected */
        public void callbackFailure(String str) {
            AppsFlyerLib.conversionDataListener.onInstallConversionFailure(str);
        }
    }

    private static class ReAttributionIdFetcher extends AttributionIdFetcher {
        public ReAttributionIdFetcher(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        public String getUrl() {
            return "https://sdk.appsflyer.com/reattr_data/";
        }

        /* access modifiers changed from: protected */
        public void callback(Map<String, String> map) {
            AppsFlyerLib.conversionDataListener.onAppOpenAttribution(map);
        }

        /* access modifiers changed from: protected */
        public void callbackFailure(String str) {
            AppsFlyerLib.conversionDataListener.onAttributionFailure(str);
        }
    }

    private static abstract class AttributionIdFetcher implements Runnable {
        private static AtomicInteger currentRequestsCounter = new AtomicInteger(0);
        private String appsFlyerDevKey;
        private WeakReference<Context> ctxReference = null;
        private ScheduledExecutorService executorService;

        /* access modifiers changed from: protected */
        public abstract void callback(Map<String, String> map);

        /* access modifiers changed from: protected */
        public abstract void callbackFailure(String str);

        public abstract String getUrl();

        public AttributionIdFetcher(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.ctxReference = new WeakReference<>(context);
            this.appsFlyerDevKey = str;
            this.executorService = scheduledExecutorService;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.io.BufferedReader] */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec A[SYNTHETIC, Splitter:B:35:0x00ec] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1 A[Catch:{ Throwable -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00fc A[Catch:{ all -> 0x0214 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x021c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                r3 = 0
                java.lang.String r0 = r7.appsFlyerDevKey
                if (r0 == 0) goto L_0x000d
                java.lang.String r0 = r7.appsFlyerDevKey
                int r0 = r0.length()
                if (r0 != 0) goto L_0x000e
            L_0x000d:
                return
            L_0x000e:
                java.util.concurrent.atomic.AtomicInteger r0 = currentRequestsCounter
                r0.incrementAndGet()
                java.lang.ref.WeakReference<android.content.Context> r0 = r7.ctxReference     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.Object r0 = r0.get()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                android.content.Context r0 = (android.content.Context) r0     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                if (r0 != 0) goto L_0x0028
                java.util.concurrent.atomic.AtomicInteger r0 = currentRequestsCounter
                r0.decrementAndGet()
                if (r3 == 0) goto L_0x000d
                r3.disconnect()
                goto L_0x000d
            L_0x0028:
                java.lang.String r1 = com.appsflyer.AppsFlyerLib.getConfiguredChannel(r0)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r2 = com.appsflyer.AppsFlyerLib.getCachedChannel(r0, r1)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r1 = ""
                if (r2 == 0) goto L_0x0047
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                r1.<init>()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = "-"
                java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
            L_0x0047:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                r2.<init>()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = r7.getUrl()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = r0.getPackageName()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r1 = r2.append(r1)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r2 = "?devkey="
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r2 = r7.appsFlyerDevKey     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r2 = "&device_id="
                java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r2 = com.appsflyer.AppsFlyerLib.getAppsFlyerUID(r0)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r2 = r1.append(r2)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                boolean r1 = com.appsflyer.AppsFlyerLib.shouldLog(r0)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                if (r1 == 0) goto L_0x009a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                r1.<init>()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = "Calling server for attribution url: "
                java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.StringBuilder r1 = r1.append(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                com.appsflyer.LogMessages.logMessageMaskKey(r1)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
            L_0x009a:
                java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = r2.toString()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                r1.<init>(r4)     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x0223, all -> 0x0220 }
                java.lang.String r4 = "GET"
                r1.setRequestMethod(r4)     // Catch:{ Throwable -> 0x00f5 }
                r4 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r4)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r4 = "Connection"
                java.lang.String r5 = "close"
                r1.setRequestProperty(r4, r5)     // Catch:{ Throwable -> 0x00f5 }
                r1.connect()     // Catch:{ Throwable -> 0x00f5 }
                int r4 = r1.getResponseCode()     // Catch:{ Throwable -> 0x00f5 }
                r5 = 200(0xc8, float:2.8E-43)
                if (r4 != r5) goto L_0x01c9
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f5 }
                r5.<init>()     // Catch:{ Throwable -> 0x00f5 }
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0227 }
                java.io.InputStream r4 = r1.getInputStream()     // Catch:{ all -> 0x0227 }
                r2.<init>(r4)     // Catch:{ all -> 0x0227 }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x022b }
                r4.<init>(r2)     // Catch:{ all -> 0x022b }
            L_0x00d8:
                java.lang.String r3 = r4.readLine()     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x011d
                java.lang.StringBuilder r3 = r5.append(r3)     // Catch:{ all -> 0x00e8 }
                r6 = 10
                r3.append(r6)     // Catch:{ all -> 0x00e8 }
                goto L_0x00d8
            L_0x00e8:
                r0 = move-exception
                r3 = r4
            L_0x00ea:
                if (r3 == 0) goto L_0x00ef
                r3.close()     // Catch:{ Throwable -> 0x00f5 }
            L_0x00ef:
                if (r2 == 0) goto L_0x00f4
                r2.close()     // Catch:{ Throwable -> 0x00f5 }
            L_0x00f4:
                throw r0     // Catch:{ Throwable -> 0x00f5 }
            L_0x00f5:
                r0 = move-exception
            L_0x00f6:
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLib.conversionDataListener     // Catch:{ all -> 0x0214 }
                if (r2 == 0) goto L_0x0103
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0214 }
                r7.callbackFailure(r2)     // Catch:{ all -> 0x0214 }
            L_0x0103:
                java.lang.String r2 = "AppsFlyer_1.16"
                java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0214 }
                android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x0214 }
                java.util.concurrent.atomic.AtomicInteger r0 = currentRequestsCounter
                r0.decrementAndGet()
                if (r1 == 0) goto L_0x0116
                r1.disconnect()
            L_0x0116:
                java.util.concurrent.ScheduledExecutorService r0 = r7.executorService
                r0.shutdown()
                goto L_0x000d
            L_0x011d:
                if (r4 == 0) goto L_0x0122
                r4.close()     // Catch:{ Throwable -> 0x00f5 }
            L_0x0122:
                if (r2 == 0) goto L_0x0127
                r2.close()     // Catch:{ Throwable -> 0x00f5 }
            L_0x0127:
                boolean r2 = com.appsflyer.AppsFlyerLib.shouldLog(r0)     // Catch:{ Throwable -> 0x00f5 }
                if (r2 == 0) goto L_0x0147
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f5 }
                r2.<init>()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r3 = "Attribution data: "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r3 = r5.toString()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00f5 }
                com.appsflyer.LogMessages.logMessageMaskKey(r2)     // Catch:{ Throwable -> 0x00f5 }
            L_0x0147:
                int r2 = r5.length()     // Catch:{ Throwable -> 0x00f5 }
                if (r2 <= 0) goto L_0x01ba
                if (r0 == 0) goto L_0x01ba
                java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x00f5 }
                java.util.Map r3 = com.appsflyer.AppsFlyerLib.attributionStringToMap(r2)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r2 = "iscache"
                java.lang.Object r2 = r3.get(r2)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x00f5 }
                if (r2 == 0) goto L_0x0169
                java.lang.String r4 = "true"
                boolean r4 = r4.equals(r2)     // Catch:{ Throwable -> 0x00f5 }
                if (r4 == 0) goto L_0x01a4
            L_0x0169:
                java.lang.String r4 = "appsflyer-data"
                r6 = 0
                android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r6)     // Catch:{ Throwable -> 0x00f5 }
                android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r6 = "attributionId"
                java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00f5 }
                r4.putString(r6, r5)     // Catch:{ Throwable -> 0x00f5 }
                r4.commit()     // Catch:{ Throwable -> 0x00f5 }
                boolean r4 = com.appsflyer.AppsFlyerLib.shouldLog(r0)     // Catch:{ Throwable -> 0x00f5 }
                if (r4 == 0) goto L_0x01a4
                java.lang.String r4 = "AppsFlyer_1.16"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f5 }
                r5.<init>()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r6 = "iscache="
                java.lang.StringBuilder r5 = r5.append(r6)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.StringBuilder r2 = r5.append(r2)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r5 = " caching conversion data"
                java.lang.StringBuilder r2 = r2.append(r5)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00f5 }
                android.util.Log.d(r4, r2)     // Catch:{ Throwable -> 0x00f5 }
            L_0x01a4:
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLib.conversionDataListener     // Catch:{ Throwable -> 0x00f5 }
                if (r2 == 0) goto L_0x01ba
                java.util.concurrent.atomic.AtomicInteger r2 = currentRequestsCounter     // Catch:{ Throwable -> 0x00f5 }
                int r2 = r2.intValue()     // Catch:{ Throwable -> 0x00f5 }
                r4 = 1
                if (r2 > r4) goto L_0x01ba
                java.util.Map r0 = com.appsflyer.AppsFlyerLib.getConversionData(r0)     // Catch:{ AttributionIDNotReady -> 0x01c6 }
            L_0x01b7:
                r7.callback(r0)     // Catch:{ Throwable -> 0x00f5 }
            L_0x01ba:
                java.util.concurrent.atomic.AtomicInteger r0 = currentRequestsCounter
                r0.decrementAndGet()
                if (r1 == 0) goto L_0x0116
                r1.disconnect()
                goto L_0x0116
            L_0x01c6:
                r0 = move-exception
                r0 = r3
                goto L_0x01b7
            L_0x01c9:
                com.appsflyer.AppsFlyerConversionListener r3 = com.appsflyer.AppsFlyerLib.conversionDataListener     // Catch:{ Throwable -> 0x00f5 }
                if (r3 == 0) goto L_0x01e9
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f5 }
                r3.<init>()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r4 = "Error connection to server: "
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Throwable -> 0x00f5 }
                int r4 = r1.getResponseCode()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x00f5 }
                r7.callbackFailure(r3)     // Catch:{ Throwable -> 0x00f5 }
            L_0x01e9:
                boolean r0 = com.appsflyer.AppsFlyerLib.shouldLog(r0)     // Catch:{ Throwable -> 0x00f5 }
                if (r0 == 0) goto L_0x01ba
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f5 }
                r0.<init>()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r3 = "AttributionIdFetcher response code: "
                java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ Throwable -> 0x00f5 }
                int r3 = r1.getResponseCode()     // Catch:{ Throwable -> 0x00f5 }
                java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r3 = "  url: "
                java.lang.StringBuilder r0 = r0.append(r3)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ Throwable -> 0x00f5 }
                java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00f5 }
                com.appsflyer.LogMessages.logMessageMaskKey(r0)     // Catch:{ Throwable -> 0x00f5 }
                goto L_0x01ba
            L_0x0214:
                r0 = move-exception
            L_0x0215:
                java.util.concurrent.atomic.AtomicInteger r2 = currentRequestsCounter
                r2.decrementAndGet()
                if (r1 == 0) goto L_0x021f
                r1.disconnect()
            L_0x021f:
                throw r0
            L_0x0220:
                r0 = move-exception
                r1 = r3
                goto L_0x0215
            L_0x0223:
                r0 = move-exception
                r1 = r3
                goto L_0x00f6
            L_0x0227:
                r0 = move-exception
                r2 = r3
                goto L_0x00ea
            L_0x022b:
                r0 = move-exception
                goto L_0x00ea
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLib.AttributionIdFetcher.run():void");
        }
    }

    private static class CachedRequestSender implements Runnable {
        private WeakReference<Context> ctxReference = null;

        public CachedRequestSender(Context context) {
            this.ctxReference = new WeakReference<>(context);
        }

        public void run() {
            if (!AppsFlyerLib.isDuringCheckCache) {
                long unused = AppsFlyerLib.lastCacheCheck = System.currentTimeMillis();
                if (this.ctxReference != null) {
                    boolean unused2 = AppsFlyerLib.isDuringCheckCache = true;
                    try {
                        String property = AppsFlyerLib.getProperty(AppsFlyerProperties.AF_KEY);
                        synchronized (this.ctxReference) {
                            for (RequestCacheData next : CacheManager.getInstance().getCachedRequests((Context) this.ctxReference.get())) {
                                if (AppsFlyerLib.shouldLog((Context) this.ctxReference.get())) {
                                    Log.i(AppsFlyerLib.LOG_TAG, "resending request: " + next.getRequestURL());
                                }
                                try {
                                    AppsFlyerLib.sendRequestToServer(next.getRequestURL() + AppsFlyerLib.CACHED_URL_PARAMTER, next.getPostData(), property, this.ctxReference, next.getCacheKey(), AppsFlyerLib.LOG_TAG, false);
                                } catch (Exception e) {
                                    Log.i(AppsFlyerLib.LOG_TAG, "Failed to resend cached request");
                                }
                            }
                        }
                        boolean unused3 = AppsFlyerLib.isDuringCheckCache = false;
                    } catch (Exception e2) {
                        try {
                            Log.e(AppsFlyerLib.LOG_TAG, "failed to check cache.");
                        } finally {
                            boolean unused4 = AppsFlyerLib.isDuringCheckCache = false;
                        }
                    }
                    AppsFlyerLib.cacheScheduler.shutdown();
                    ScheduledExecutorService unused5 = AppsFlyerLib.cacheScheduler = null;
                }
            }
        }
    }
}
