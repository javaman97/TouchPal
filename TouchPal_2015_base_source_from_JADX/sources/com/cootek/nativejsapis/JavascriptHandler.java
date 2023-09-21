package com.cootek.nativejsapis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.common.utils.DownloadImageTask;
import com.cootek.common.utils.ExternalStorage;
import com.cootek.common.utils.NetworkLocalImageUtil;
import com.cootek.common.utils.TResourceManager;
import com.cootek.common.utils.ToastWidget;
import com.cootek.geo.AbsGeoLocationItem;
import com.cootek.geo.GeoLocationManager;
import com.cootek.smartdialer.ITService;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1415aX;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import p018cn.sharesdk.facebook.Facebook;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.PlatformActionListener;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.onekeyshare.OnekeyShare;
import p018cn.sharesdk.sina.weibo.SinaWeibo;
import p018cn.sharesdk.twitter.Twitter;
import p018cn.sharesdk.wechat.friends.Wechat;
import p018cn.sharesdk.wechat.moments.WechatMoments;

public abstract class JavascriptHandler {
    public static String DIALER_INTENT_CALL_PHONE = "com.cootek.presentation.action.CALL_PHONE";
    public static String DIALER_INTENT_PARAM_NAME = "name";
    public static String DIALER_INTENT_PARAM_NUMBER = "number";
    public static String DIALER_SERVICE = "com.cootek.smartdialer.PresentationJsHandlerService";
    public static final String DOWNLOAD_PARAM_APPNAME = "appName";
    public static final String DOWNLOAD_PARAM_AUTO_INSTALL = "autoInstall";
    public static final String DOWNLOAD_PARAM_NEED_CONFIRM = "needConfirm";
    public static final String DOWNLOAD_PARAM_NON_WIFI_REMINDER = "nonWifiReminder";
    public static final String DOWNLOAD_PARAM_PKGNAME = "pkgName";
    public static final String DOWNLOAD_PARAM_REQUEST_TOKEN = "requestToken";
    public static final String DOWNLOAD_PARAM_URL = "url";
    public static final String INTENT_PARAM_ACTION = "action";
    public static final String INTENT_PARAM_CLASS_NAME = "className";
    public static final String INTENT_PARAM_DATA = "data";
    public static final String INTENT_PARAM_IS_SERVICE = "isService";
    public static final String INTENT_PARAM_JSON_CATEGORY_ARRAY = "jsonCategoryArray";
    public static final String INTENT_PARAM_JSON_EXTRA_DATA = "jsonExtra";
    public static final String INTENT_PARAM_PKGNAME = "pkgName";
    public static final String INTENT_PARAM_TYPE = "type";
    public static final String LOCATION_LATITUDE = "latitude";
    public static final String LOCATION_LONGITUDE = "longitude";
    public static final String MESSAGE_TYPE_SMS = "sms";
    public static final String MESSAGE_TYPE_WEIXIN_TO_FRIEND = "weixin_friend";
    public static final String MESSAGE_TYPE_WEIXIN_TO_GROUP = "weixin_group";
    public static String PACKAGE_NAME_SMART_DIALER = C1415aX.f4527f;
    public static final String SHARE_CALLBACK_FLAG_CANCEL = "share_cancel";
    public static final String SHARE_CALLBACK_FLAG_FAIL = "share_fail";
    public static final String SHARE_CALLBACK_FLAG_SUCCESS = "share_success";
    public static final String SHARE_PARAM_APPKEY = "appKey";
    public static final String SHARE_PARAM_APP_EXTRA_INFO = "appExtraInfo";
    public static final String SHARE_PARAM_APP_FILE_PATH = "appFilePath";
    public static final String SHARE_PARAM_FILE_PATH = "filePath";
    public static final String SHARE_PARAM_IMAGE_PATH = "imagePath";
    public static final String SHARE_PARAM_IMAGE_URL = "imageUrl";
    public static final String SHARE_PARAM_JS_CALLBACK = "callback";
    public static final String SHARE_PARAM_MSG = "msg";
    public static final String SHARE_PARAM_MUSIC_RELATED_URL = "musicRelatedUrl";
    public static final String SHARE_PARAM_MUSIC_URL = "musicUrl";
    public static final String SHARE_PARAM_TITLE = "title";
    public static final String SHARE_PARAM_TYPE = "type";
    public static final String SHARE_PARAM_URL = "url";
    public static final String SHARE_PARAM_VIDEO_URL = "videoUrl";
    public static final String SHARE_TYPE_FACEBOOK = "facebook";
    public static final String SHARE_TYPE_TWITTER = "twitter";
    public static final String SHARE_TYPE_WECHAT = "wechat";
    public static final String SHARE_TYPE_WECHAT_MOMENT = "wechat_moment";
    public static final String SHARE_TYPE_WEIBO = "sina_weibo";
    private static final String TAG = "PJavaScriptHandler";
    public static final String WEB_CALLBACK_METHOD_NAME_APK_DOWNLOADED = "onApkDownloaded";
    public static final String WEB_CALLBACK_METHOD_NAME_PKG_INSTALLED = "onPkgInstalled";
    public static final String WEB_CALLBACK_METHOD_PARAM_PKGNAME = "pkgName";
    public static final String WEB_CALLBACK_METHOD_PARAM_URL = "url";
    private ServiceConnection mConnection;
    protected Context mContext;
    private Handler mHandler = new Handler();
    /* access modifiers changed from: private */
    public ITService mITService;
    private GeoLocationManager mLocationManager;
    /* access modifiers changed from: private */
    public TResourceManager mResourceManager;
    protected WebView mWebview;

    public abstract void downloadApk(String str);

    public abstract String getAuthToken();

    public abstract String getServerIp();

    public abstract void refreshAuthToken(String str);

    public abstract void restart();

    public abstract void setAuthToken(String str);

    public abstract void switchSkin(String str);

    public JavascriptHandler(Context context, WebView webView) {
        this.mContext = context;
        this.mWebview = webView;
        this.mResourceManager = new TResourceManager(this.mContext);
    }

    public int getApiLevel() {
        return 5;
    }

    public String getLocale() {
        return Locale.getDefault().toString();
    }

    public boolean enableDialerFun() {
        if (!isInstalled(PACKAGE_NAME_SMART_DIALER, (String) null)) {
            return false;
        }
        this.mConnection = new ServiceConnection() {
            public void onServiceDisconnected(ComponentName componentName) {
                JavascriptHandler.this.mITService = null;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                JavascriptHandler.this.mITService = ITService.Stub.asInterface(iBinder);
            }
        };
        return this.mContext.bindService(new Intent(DIALER_SERVICE), this.mConnection, 1);
    }

    public void destroyDialerFun() {
        if (this.mConnection != null) {
            try {
                this.mContext.unbindService(this.mConnection);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public void callPhone(String str, String str2) {
        Intent intent = new Intent(DIALER_INTENT_CALL_PHONE);
        if (isInstalled(PACKAGE_NAME_SMART_DIALER, (String) null)) {
            intent.putExtra(DIALER_INTENT_PARAM_NUMBER, str);
            intent.putExtra(DIALER_INTENT_PARAM_NAME, str2);
            this.mContext.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.CALL");
        intent2.setData(Uri.fromParts("tel", str, (String) null));
        intent2.setFlags(Engine.EXCEPTION_ERROR);
        this.mContext.startActivity(intent2);
    }

    public void callPhone(String str) {
        callPhone(str, (String) null);
    }

    public boolean isContact(String str) {
        if (isInstalled(PACKAGE_NAME_SMART_DIALER, (String) null) && this.mITService != null) {
            try {
                return this.mITService.isContact(str);
            } catch (RemoteException e) {
            }
        }
        if (Build.VERSION.SDK_INT >= 5) {
            return ContactProvider.isContact(this.mContext, str);
        }
        return false;
    }

    public void sendMessage(String str, String str2, String str3) {
        Intent intent = null;
        if (MESSAGE_TYPE_SMS.equals(str)) {
            intent = IntentProvider.getSMSIntent(str2, str3);
        }
        if (intent != null) {
            try {
                this.mContext.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void shareMessage(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("type");
            String optString2 = jSONObject.optString(SHARE_PARAM_MSG);
            String optString3 = jSONObject.optString("url");
            String optString4 = jSONObject.optString("title");
            String optString5 = jSONObject.optString(SHARE_PARAM_IMAGE_PATH);
            String optString6 = jSONObject.optString("imageUrl");
            String optString7 = jSONObject.optString("filePath");
            String optString8 = jSONObject.optString(SHARE_PARAM_APP_FILE_PATH);
            String optString9 = jSONObject.optString(SHARE_PARAM_APP_EXTRA_INFO);
            String optString10 = jSONObject.optString(SHARE_PARAM_MUSIC_URL);
            String optString11 = jSONObject.optString(SHARE_PARAM_MUSIC_RELATED_URL);
            String optString12 = jSONObject.optString(SHARE_PARAM_VIDEO_URL);
            String optString13 = jSONObject.optString(SHARE_PARAM_JS_CALLBACK);
            if (TextUtils.isEmpty(optString2) && TextUtils.isEmpty(optString3)) {
                str2 = "";
            } else if (TextUtils.isEmpty(optString3)) {
                str2 = optString2;
            } else if (TextUtils.isEmpty(optString2)) {
                str2 = optString3;
            } else {
                str2 = String.valueOf(optString2) + " \n" + optString3;
            }
            PlatformActionListener platformActionListener = getPlatformActionListener(optString13);
            if (SHARE_TYPE_WEIBO.equals(optString)) {
                Platform platform = ShareSDK.getPlatform(this.mContext, SinaWeibo.NAME);
                platform.setPlatformActionListener(platformActionListener);
                SinaWeibo.ShareParams shareParams = new SinaWeibo.ShareParams();
                if (!TextUtils.isEmpty(optString5)) {
                    shareParams.imagePath = optString5;
                } else if (!TextUtils.isEmpty(optString6)) {
                    shareParams.imageUrl = optString6;
                }
                shareParams.text = str2;
                platform.share(shareParams);
            } else if (SHARE_TYPE_TWITTER.equals(optString)) {
                Platform platform2 = ShareSDK.getPlatform(this.mContext, Twitter.NAME);
                platform2.setPlatformActionListener(platformActionListener);
                Twitter.ShareParams shareParams2 = new Twitter.ShareParams();
                shareParams2.text = str2;
                if (!TextUtils.isEmpty(optString5)) {
                    shareParams2.imagePath = optString5;
                    platform2.share(shareParams2);
                } else if (!TextUtils.isEmpty(optString6)) {
                    shareMessageAfterDownloadImage(platform2, shareParams2, optString6, optString13);
                } else {
                    platform2.share(shareParams2);
                }
            } else if (SHARE_TYPE_FACEBOOK.equals(optString)) {
                Platform platform3 = ShareSDK.getPlatform(this.mContext, Facebook.NAME);
                platform3.setPlatformActionListener(platformActionListener);
                Facebook.ShareParams shareParams3 = new Facebook.ShareParams();
                shareParams3.text = str2;
                if (!TextUtils.isEmpty(optString5)) {
                    shareParams3.imagePath = optString5;
                    platform3.share(shareParams3);
                } else if (!TextUtils.isEmpty(optString6)) {
                    shareMessageAfterDownloadImage(platform3, shareParams3, optString6, optString13);
                } else {
                    platform3.share(shareParams3);
                }
            } else if (SHARE_TYPE_WECHAT.equals(optString)) {
                Platform platform4 = ShareSDK.getPlatform(this.mContext, Wechat.NAME);
                platform4.setPlatformActionListener(platformActionListener);
                Wechat.ShareParams shareParams4 = new Wechat.ShareParams();
                shareParams4.text = optString2;
                if (!TextUtils.isEmpty(optString4)) {
                    shareParams4.title = optString4;
                }
                shareParams4.shareType = 1;
                if (!TextUtils.isEmpty(optString3)) {
                    shareParams4.shareType = 4;
                    shareParams4.url = optString3;
                } else if (!TextUtils.isEmpty(optString10)) {
                    shareParams4.shareType = 5;
                    shareParams4.musicUrl = optString10;
                    if (!TextUtils.isEmpty(optString11)) {
                        shareParams4.url = optString11;
                    }
                } else if (!TextUtils.isEmpty(optString12)) {
                    shareParams4.shareType = 6;
                    shareParams4.url = optString12;
                } else if (!TextUtils.isEmpty(optString8)) {
                    shareParams4.shareType = 7;
                    shareParams4.filePath = optString8;
                    if (!TextUtils.isEmpty(optString9)) {
                        shareParams4.extInfo = optString9;
                    }
                } else if (!TextUtils.isEmpty(optString7)) {
                    shareParams4.shareType = 8;
                    shareParams4.filePath = optString7;
                } else if (!TextUtils.isEmpty(optString6) || !TextUtils.isEmpty(optString5)) {
                    shareParams4.shareType = 2;
                }
                if (!TextUtils.isEmpty(optString6)) {
                    shareParams4.imageUrl = optString6;
                } else if (!TextUtils.isEmpty(optString5)) {
                    shareParams4.imagePath = optString5;
                }
                platform4.share(shareParams4);
            } else if (SHARE_TYPE_WECHAT_MOMENT.equals(optString)) {
                Platform platform5 = ShareSDK.getPlatform(this.mContext, WechatMoments.NAME);
                platform5.setPlatformActionListener(platformActionListener);
                WechatMoments.ShareParams shareParams5 = new WechatMoments.ShareParams();
                shareParams5.text = optString2;
                if (!TextUtils.isEmpty(optString4)) {
                    shareParams5.title = optString4;
                }
                shareParams5.shareType = 1;
                if (!TextUtils.isEmpty(optString3)) {
                    shareParams5.shareType = 4;
                    shareParams5.url = optString3;
                } else if (!TextUtils.isEmpty(optString10)) {
                    shareParams5.shareType = 5;
                    shareParams5.musicUrl = optString10;
                    if (!TextUtils.isEmpty(optString11)) {
                        shareParams5.url = optString11;
                    }
                } else if (!TextUtils.isEmpty(optString12)) {
                    shareParams5.shareType = 6;
                    shareParams5.url = optString12;
                } else if (!TextUtils.isEmpty(optString8)) {
                    shareParams5.shareType = 7;
                    shareParams5.filePath = optString8;
                    if (!TextUtils.isEmpty(optString9)) {
                        shareParams5.extInfo = optString9;
                    }
                } else if (!TextUtils.isEmpty(optString7)) {
                    shareParams5.shareType = 8;
                    shareParams5.filePath = optString7;
                } else if (!TextUtils.isEmpty(optString6) || !TextUtils.isEmpty(optString5)) {
                    shareParams5.shareType = 2;
                }
                if (!TextUtils.isEmpty(optString6)) {
                    shareParams5.imageUrl = optString6;
                } else if (!TextUtils.isEmpty(optString5)) {
                    shareParams5.imagePath = optString5;
                }
                platform5.share(shareParams5);
            } else {
                OnekeyShare onekeyShare = new OnekeyShare();
                onekeyShare.setCallback(platformActionListener);
                onekeyShare.setText(optString2);
                onekeyShare.setImageUrl(optString6);
                onekeyShare.setImagePath(optString5);
                onekeyShare.setUrl(optString3);
                onekeyShare.setTitle(optString4);
                onekeyShare.show(this.mContext);
            }
        } catch (Exception e) {
        }
    }

    private void shareMessageAfterDownloadImage(final Platform platform, final Platform.ShareParams shareParams, String str, final String str2) {
        String str3;
        if (platform == null || shareParams == null || TextUtils.isEmpty(str)) {
            onShareMessageError(platform, 0, (Throwable) null, str2);
            return;
        }
        String[] strArr = null;
        try {
            strArr = str.split("\\.");
        } catch (NullPointerException e) {
        }
        if (strArr == null || strArr.length <= 1) {
            str3 = "";
        } else {
            str3 = C1389aD.f4374j + strArr[strArr.length - 1];
            if (str3.contains("\\")) {
                str3 = "";
            }
        }
        new DownloadImageTask(ExternalStorage.getTempFile(str3), str, new DownloadImageTask.DownloadImageTaskCallback() {
            public void onSuccess(String str) {
                shareParams.imagePath = str;
                platform.share(shareParams);
            }

            public void onFailed() {
                JavascriptHandler.this.onShareMessageError(platform, 0, (Throwable) null, str2);
            }
        }).execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    public void onShareMessageCancel(Platform platform, int i, final String str) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (JavascriptHandler.this.mWebview != null && !TextUtils.isEmpty(str)) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s(\"%s\")", new Object[]{str, JavascriptHandler.SHARE_CALLBACK_FLAG_CANCEL}));
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onShareMessageComplete(Platform platform, int i, HashMap<String, Object> hashMap, final String str) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (JavascriptHandler.this.mWebview != null && !TextUtils.isEmpty(str)) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s(\"%s\")", new Object[]{str, JavascriptHandler.SHARE_CALLBACK_FLAG_SUCCESS}));
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onShareMessageError(Platform platform, int i, Throwable th, final String str) {
        this.mHandler.post(new Runnable() {
            public void run() {
                if (JavascriptHandler.this.mWebview != null && !TextUtils.isEmpty(str)) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s(\"%s\")", new Object[]{str, JavascriptHandler.SHARE_CALLBACK_FLAG_FAIL}));
                }
            }
        });
        if (th != null) {
            th.printStackTrace();
        }
    }

    private PlatformActionListener getPlatformActionListener(final String str) {
        return new PlatformActionListener() {
            public void onCancel(Platform platform, int i) {
                JavascriptHandler.this.onShareMessageCancel(platform, i, str);
            }

            public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                JavascriptHandler.this.onShareMessageComplete(platform, i, hashMap, str);
            }

            public void onError(Platform platform, int i, Throwable th) {
                JavascriptHandler.this.onShareMessageError(platform, i, th, str);
            }
        };
    }

    public boolean isInstalled(String str, String str2) {
        try {
            PackageInfo packageInfo = this.mContext.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            if (TextUtils.isEmpty(str2) || String.valueOf(packageInfo.versionCode).equals(str2)) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void launchLocalApp(String str, String str2, String str3, String str4, boolean z) {
        Intent launchLocalAppIntent = IntentProvider.getLaunchLocalAppIntent(this.mContext, str, str2, (String) null, str3, (String) null, str4, (String) null);
        if (z) {
            this.mContext.startService(launchLocalAppIntent);
            return;
        }
        try {
            launchLocalAppIntent.addFlags(Engine.EXCEPTION_ERROR);
            this.mContext.startActivity(launchLocalAppIntent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void launchLocalAppByClassName(String str, String str2, String str3, String str4, boolean z) {
        Intent launchLocalAppIntent = IntentProvider.getLaunchLocalAppIntent(this.mContext, str, (String) null, str2, str3, (String) null, str4, (String) null);
        if (z) {
            this.mContext.startService(launchLocalAppIntent);
            return;
        }
        try {
            launchLocalAppIntent.addFlags(Engine.EXCEPTION_ERROR);
            this.mContext.startActivity(launchLocalAppIntent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void launchLocalAppWithJsonParam(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            r7 = 0
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x0047 }
            r8.<init>(r12)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r1 = "pkgName"
            java.lang.String r1 = r8.optString(r1)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r2 = "action"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "className"
            java.lang.String r3 = r8.optString(r3)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "data"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r5 = "jsonExtra"
            java.lang.String r6 = r8.optString(r5)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = "type"
            java.lang.String r5 = r8.optString(r5)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r9 = "isService"
            r10 = 0
            boolean r0 = r8.optBoolean(r9, r10)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r9 = "jsonCategoryArray"
            java.lang.String r7 = r8.optString(r9)     // Catch:{ Exception -> 0x0079 }
            r8 = r0
        L_0x0039:
            android.content.Context r0 = r11.mContext
            android.content.Intent r0 = com.cootek.nativejsapis.IntentProvider.getLaunchLocalAppIntent(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L_0x0050
            android.content.Context r1 = r11.mContext
            r1.startService(r0)
        L_0x0046:
            return
        L_0x0047:
            r1 = move-exception
            r5 = r7
            r6 = r7
            r4 = r7
            r3 = r7
            r2 = r7
            r1 = r7
        L_0x004e:
            r8 = r0
            goto L_0x0039
        L_0x0050:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)     // Catch:{ ActivityNotFoundException -> 0x005b }
            android.content.Context r1 = r11.mContext     // Catch:{ ActivityNotFoundException -> 0x005b }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x005b }
            goto L_0x0046
        L_0x005b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0046
        L_0x0060:
            r2 = move-exception
            r5 = r7
            r6 = r7
            r4 = r7
            r3 = r7
            r2 = r7
            goto L_0x004e
        L_0x0067:
            r3 = move-exception
            r5 = r7
            r6 = r7
            r4 = r7
            r3 = r7
            goto L_0x004e
        L_0x006d:
            r4 = move-exception
            r5 = r7
            r6 = r7
            r4 = r7
            goto L_0x004e
        L_0x0072:
            r5 = move-exception
            r5 = r7
            r6 = r7
            goto L_0x004e
        L_0x0076:
            r5 = move-exception
            r5 = r7
            goto L_0x004e
        L_0x0079:
            r8 = move-exception
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.nativejsapis.JavascriptHandler.launchLocalAppWithJsonParam(java.lang.String):void");
    }

    private GeoLocationManager getLocationManager() {
        if (this.mLocationManager == null) {
            this.mLocationManager = new GeoLocationManager(this.mContext);
        }
        return this.mLocationManager;
    }

    public boolean isLocationServiceAvailable() {
        return getLocationManager().isLocationServiceAvailable();
    }

    public boolean isNetworkAvailable() {
        return false;
    }

    public boolean setGpsEnable(boolean z) {
        return getLocationManager().setGpsEnable(z);
    }

    public void setCacheEnable(boolean z, long j) {
        getLocationManager().setCacheEnable(z, j);
    }

    public boolean setGooglePositioningSystemEnable(boolean z) {
        GeoLocationManager locationManager = getLocationManager();
        if (z) {
            return locationManager.enableComponent(1, new String[0]);
        }
        return locationManager.disableComponent(1);
    }

    public boolean setBaiduPositioningSystemEnable(boolean z, String str) {
        GeoLocationManager locationManager = getLocationManager();
        if (!z) {
            return locationManager.disableComponent(2);
        }
        return locationManager.enableComponent(2, str);
    }

    public boolean setCooTekPositioningSystemEnable(boolean z) {
        GeoLocationManager locationManager = getLocationManager();
        if (!z) {
            return locationManager.disableComponent(4);
        }
        return locationManager.enableComponent(4, getServerIp(), getAuthToken());
    }

    public boolean requestLatestLocation(final String str, boolean z, long j) {
        return getLocationManager().requestLatestLocation(z, j, new GeoLocationManager.ILocationChangeListener() {
            public void onLocationChanged(AbsGeoLocationItem absGeoLocationItem) {
                String printJsonString;
                if (absGeoLocationItem == null) {
                    printJsonString = "{}";
                } else {
                    printJsonString = absGeoLocationItem.printJsonString();
                }
                JavascriptHandler.this.mWebview.loadUrl("javascript:" + str + "('" + printJsonString + "')");
            }
        });
    }

    public String getPhoneNumber() {
        if (isInstalled(PACKAGE_NAME_SMART_DIALER, (String) null) && this.mITService != null) {
            try {
                return this.mITService.getPhoneNumber();
            } catch (RemoteException e) {
            }
        }
        return ((TelephonyManager) this.mContext.getSystemService("phone")).getLine1Number();
    }

    public void openMap(String str, String str2) {
        openMapStartup(Uri.parse(String.format("geo:%s,%s", new Object[]{str, str2})));
    }

    public void openMap(String str) {
        openMapStartup(Uri.parse(String.format("geo:0,0?q=%s", new Object[]{str})));
    }

    public void openMapStartup(Uri uri) {
        try {
            this.mContext.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            showToastWithResId(this.mResourceManager.getIdByName("jssdk_no_map_install", "string"), 0);
        } catch (Exception e2) {
            showToastWithResId(this.mResourceManager.getIdByName("jssdk_open_map_failed", "string"), 0);
        }
    }

    public String getPhoneNumber(int i) {
        if (isInstalled(PACKAGE_NAME_SMART_DIALER, (String) null) && this.mITService != null) {
            try {
                return this.mITService.getPhoneNumberBySlot(i);
            } catch (RemoteException e) {
            }
        }
        return ((TelephonyManager) this.mContext.getSystemService("phone")).getLine1Number();
    }

    public void saveImage(final String str, final String str2, final String str3) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    byte[] imageFromNetwork = NetworkLocalImageUtil.getImageFromNetwork(str);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(imageFromNetwork, 0, imageFromNetwork.length);
                    String[] split = str.split("/");
                    File file = new File(ExternalStorage.getDirectory(str2), split[split.length - 1]);
                    NetworkLocalImageUtil.saveFile(decodeByteArray, file);
                    JavascriptHandler.this.mContext.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
                    final String str = str3;
                    ((Activity) JavascriptHandler.this.mContext).runOnUiThread(new Runnable() {
                        public void run() {
                            JavascriptHandler.this.showToastWithResId(JavascriptHandler.this.mResourceManager.getIdByName("jssdk_save_image_success", "string"), 0);
                            if (!TextUtils.isEmpty(str)) {
                                JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s(true)", new Object[]{str}));
                            }
                        }
                    });
                } catch (Exception e) {
                    final String str2 = str3;
                    ((Activity) JavascriptHandler.this.mContext).runOnUiThread(new Runnable() {
                        public void run() {
                            JavascriptHandler.this.showToastWithResId(JavascriptHandler.this.mResourceManager.getIdByName("jssdk_save_image_failure", "string"), 0);
                            if (!TextUtils.isEmpty(str2)) {
                                JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s(false)", new Object[]{str2}));
                            }
                        }
                    });
                }
            }
        }).start();
    }

    public boolean copyToClipboard(String str) {
        ((ClipboardManager) this.mContext.getSystemService("clipboard")).setText(str);
        return true;
    }

    public void showMessenger(String str, String str2, final String str3, final String str4) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setPositiveButton(17039370, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (JavascriptHandler.this.mWebview != null) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s()", new Object[]{str3}));
                }
            }
        });
        builder.setNegativeButton(17039360, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (JavascriptHandler.this.mWebview != null) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s()", new Object[]{str4}));
                }
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                if (JavascriptHandler.this.mWebview != null) {
                    JavascriptHandler.this.mWebview.loadUrl(String.format("javascript:%s()", new Object[]{str4}));
                }
            }
        });
        try {
            builder.create().show();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void showSystemShareDialog(String str) {
        if (this.mContext != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            intent.addFlags(Engine.EXCEPTION_ERROR);
            try {
                this.mContext.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void showContextMenu(String str, final String str2, String str3, final String str4) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        builder.setPositiveButton(17039361, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                JavascriptHandler.this.copyToClipboard(str2);
            }
        });
        builder.setNegativeButton(str3, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                JavascriptHandler.this.showSystemShareDialog(str4);
            }
        });
        try {
            builder.create().show();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public boolean uploadPic(String str, String str2, String str3) {
        return false;
    }

    /* access modifiers changed from: private */
    public void showToastWithResId(int i, int i2) {
        try {
            showToast(this.mContext.getString(i), i2);
        } catch (Exception e) {
        }
    }

    public void showToast(String str, int i) {
        boolean z = true;
        ToastWidget instance = ToastWidget.getInstance();
        Context context = this.mContext;
        if (i == 1) {
            z = false;
        }
        instance.showText(context, str, z);
    }
}
