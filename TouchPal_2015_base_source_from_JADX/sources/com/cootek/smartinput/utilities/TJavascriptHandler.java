package com.cootek.smartinput.utilities;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.nativejsapis.JavascriptHandler;
import com.cootek.smartinput.utilities.C0994c;
import com.cootek.smartinput5.action.ActionDownloadSkinPack;
import com.cootek.smartinput5.action.ActionSetSkin;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p066ui.settings.SkinInfoHandler;
import com.cootek.smartinput5.presentations.C2515q;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p018cn.sharesdk.framework.Platform;

public class TJavascriptHandler extends JavascriptHandler {
    private static final String CALLBACK_METHOD = "callbackMethod";
    private static final String CALLBACK_PARAMS = "callbackParams";
    public static final String EXTRA_STRING_JS_METHOD = "TJavascriptHandler.EXTRA_JS_METHOD";
    public static final String EXTRA_STRING_SHARE_CALLBACK_FLAG = "TJavascriptHandler.EXTRA_SHARE_CALLBACK_FLAG";
    private static final int MSG_CALLBACK_WEBVIEW = 1;
    public static final String SETTING_TYPE_BOOL = "bool";
    public static final String SETTING_TYPE_INT = "int";
    public static final String SETTING_TYPE_LONG = "long";
    public static final String SETTING_TYPE_STRING = "string";
    public static final String SHARE_PARAM_DLG_TITLE = "dlgTitle";
    public static final String SHARE_PARAM_SCREENSHOT = "screenshot";
    private static final String TAG = "TJavascriptHandler";
    /* access modifiers changed from: private */
    public Activity mActivity;
    private String mBackpressHandler;
    private Handler mCallbackHandler = new C1012t(this);
    private boolean mFinishOnShareMessageCallback = false;
    private Handler mHandler = new C1013u(this);
    private IPCManager mIPCManager;
    private Messenger mMessenger;
    private boolean mNotifyOtherProcessShareMessageCallback = false;
    private String mOnResumeHandler;
    private SkinInfoHandler mSkinInfoHandler;

    public TJavascriptHandler(Context context, WebView webView) {
        super(context, webView);
    }

    public void setIPCManager(IPCManager iPCManager) {
        this.mIPCManager = iPCManager;
        registerMessenger();
    }

    private void registerMessenger() {
        if (this.mIPCManager != null && this.mMessenger == null) {
            this.mMessenger = new Messenger(this.mCallbackHandler);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.mMessenger;
            try {
                this.mIPCManager.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
    }

    public void setNotifyOtherProcessShareMessageCallback(boolean z) {
        this.mNotifyOtherProcessShareMessageCallback = z;
    }

    public void setFinishOnShareMessageCallback(boolean z) {
        this.mFinishOnShareMessageCallback = z;
    }

    public void downloadApk(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("appName");
            String optString = jSONObject.optString("pkgName");
            boolean optBoolean = jSONObject.optBoolean(JavascriptHandler.DOWNLOAD_PARAM_NEED_CONFIRM, false);
            boolean optBoolean2 = jSONObject.optBoolean(JavascriptHandler.DOWNLOAD_PARAM_NON_WIFI_REMINDER, false);
            boolean optBoolean3 = jSONObject.optBoolean("autoInstall", false);
            boolean optBoolean4 = jSONObject.optBoolean("requestToken", false);
            C0994c.m5165a(string, C0994c.C0995a.START);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 5);
            bundle.putString(C2515q.f10829b, string);
            bundle.putString(C2515q.f10835h, string2);
            bundle.putString(C2515q.f10830c, optString);
            bundle.putBoolean(C2515q.f10838k, optBoolean);
            bundle.putBoolean(C2515q.f10839l, optBoolean2);
            bundle.putBoolean(C2515q.f10837j, optBoolean3);
            bundle.putBoolean(C2515q.f10832e, optBoolean4);
            if (this.mIPCManager != null) {
                Message obtain = Message.obtain((Handler) null, 4);
                obtain.setData(bundle);
                try {
                    this.mIPCManager.sendMessage(obtain);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else {
                C1368X.m6320c().mo5839l().handleExtralAction(bundle);
            }
            C1056a.m5588a().mo4264a(C1056a.f2994y, this.mContext);
        } catch (JSONException e2) {
        }
    }

    public void downloadSkinPackage(String str, String str2, String str3) {
        ActionDownloadSkinPack actionDownloadSkinPack = new ActionDownloadSkinPack(str, str2, str3);
        if (this.mIPCManager != null) {
            try {
                this.mIPCManager.sendMessageForParcelableAction(actionDownloadSkinPack);
            } catch (RemoteException e) {
            }
        } else if (this.mHandler != null) {
            this.mHandler.post(actionDownloadSkinPack);
        } else {
            actionDownloadSkinPack.run();
        }
    }

    public boolean isSkinPackageInstalled(String str) {
        if (this.mSkinInfoHandler == null) {
            this.mSkinInfoHandler = new SkinInfoHandler(this.mContext, this.mWebview);
        }
        return this.mSkinInfoHandler.isPackageInstalled(str);
    }

    public String getServerIp() {
        return null;
    }

    public void refreshAuthToken(String str) {
        new C1014v(this, str).start();
    }

    public String getAuthToken() {
        return C2188Q.m9853a().mo7683c();
    }

    public void setAuthToken(String str) {
        C2188Q.m9853a().mo7680a(str);
        writeBackToken(str);
    }

    public void restart() {
        if (this.mActivity != null) {
            this.mActivity.runOnUiThread(new C1015w(this));
        }
    }

    public void switchSkin(String str) {
        ActionSetSkin actionSetSkin = new ActionSetSkin(str);
        Settings.getInstance().setStringSetting(80, str);
        if (this.mIPCManager == null) {
            actionSetSkin.run();
            return;
        }
        try {
            this.mIPCManager.sendMessageForParcelableAction(new ActionSetSkin(str));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void shareMessage(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optString("type");
                this.mHandler.post(new C1016x(this, jSONObject.optString(SHARE_PARAM_DLG_TITLE), jSONObject.optString("title"), jSONObject.optString(JavascriptHandler.SHARE_PARAM_MSG), jSONObject.optString("imageUrl"), jSONObject.optString("url"), jSONObject.optString(SHARE_PARAM_SCREENSHOT)));
            } catch (JSONException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void share(String str, String str2, String str3, String str4, String str5, String str6) {
        Uri uri = null;
        if (!TextUtils.isEmpty(str6) && str6.equals("full")) {
            uri = C1584bI.m7125a(this.mActivity);
        }
        C1985g.m9134a(this.mContext, str, str2, str3, uri, str5, str4);
    }

    /* access modifiers changed from: protected */
    public void onShareMessageCancel(Platform platform, int i, String str) {
        super.onShareMessageCancel(platform, i, str);
        notifyProcessShareMessageCallback(str, JavascriptHandler.SHARE_CALLBACK_FLAG_CANCEL);
    }

    /* access modifiers changed from: protected */
    public void onShareMessageComplete(Platform platform, int i, HashMap<String, Object> hashMap, String str) {
        super.onShareMessageComplete(platform, i, hashMap, str);
        notifyProcessShareMessageCallback(str, JavascriptHandler.SHARE_CALLBACK_FLAG_SUCCESS);
    }

    /* access modifiers changed from: protected */
    public void onShareMessageError(Platform platform, int i, Throwable th, String str) {
        super.onShareMessageError(platform, i, th, str);
        notifyProcessShareMessageCallback(str, JavascriptHandler.SHARE_CALLBACK_FLAG_FAIL);
    }

    private void notifyProcessShareMessageCallback(String str, String str2) {
        if (this.mNotifyOtherProcessShareMessageCallback) {
            Message obtain = Message.obtain((Handler) null, 9);
            Bundle bundle = new Bundle();
            bundle.putString(EXTRA_STRING_JS_METHOD, str);
            bundle.putString(EXTRA_STRING_SHARE_CALLBACK_FLAG, str2);
            obtain.setData(bundle);
            C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
            if (this.mFinishOnShareMessageCallback && this.mActivity != null) {
                this.mActivity.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public void writeBackToken() {
        writeBackToken((String) null);
    }

    private void writeBackToken(String str) {
        if (this.mIPCManager != null) {
            Message obtain = Message.obtain((Handler) null, 3);
            Bundle bundle = new Bundle();
            bundle.putInt(IPCManager.SETTING_TYPE, 2);
            bundle.putInt(IPCManager.SETTING_KEY, 88);
            String str2 = IPCManager.SETTING_VALUE;
            if (TextUtils.isEmpty(str)) {
                str = C2188Q.m9853a().mo7683c();
            }
            bundle.putString(str2, str);
            obtain.setData(bundle);
            try {
                this.mIPCManager.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void callbackWebview(String str) {
        callbackWebview(str, "");
    }

    private void callbackWebview(String str, String str2) {
        if (this.mHandler != null) {
            Message obtainMessage = this.mHandler.obtainMessage(1);
            Bundle bundle = new Bundle();
            bundle.putString(CALLBACK_METHOD, str);
            bundle.putString(CALLBACK_PARAMS, str2);
            obtainMessage.setData(bundle);
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public void doCallbackWebview(String str, String str2) {
        if (this.mWebview != null && !TextUtils.isEmpty(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            this.mWebview.loadUrl(String.format("javascript:try{%s(%s)}catch(e){}", objArr));
        }
    }

    public void launchLocalApp(String str, String str2, String str3, String str4, boolean z) {
        super.launchLocalApp(str, str2, str3, str4, z);
    }

    public void enableBackpressHandler(String str) {
        this.mBackpressHandler = str;
    }

    public void disableBackpressHandler() {
        this.mBackpressHandler = null;
    }

    public void enableOnResumeHandler(String str) {
        this.mOnResumeHandler = str;
    }

    public void disableOnResumeHandler() {
        this.mOnResumeHandler = null;
    }

    public boolean handleBackpress() {
        if (this.mBackpressHandler == null) {
            return false;
        }
        callbackWebview(this.mBackpressHandler);
        return true;
    }

    public boolean handleOnResume() {
        if (this.mOnResumeHandler == null) {
            return false;
        }
        callbackWebview(this.mOnResumeHandler);
        return true;
    }

    public void openUrlSelf(String str) {
        if (this.mWebview != null && !TextUtils.isEmpty(str)) {
            if (this.mWebview instanceof TWebView) {
                ((TWebView) this.mWebview).mo7696a(str);
            } else {
                this.mWebview.loadUrl(str);
            }
        }
    }

    public String getSettingValue(String str, String str2, String str3) {
        Object obj = str2;
        if (Settings.isInitialized()) {
            int idByKey = Settings.getInstance().getIdByKey(str);
            if (SETTING_TYPE_INT.equals(str3)) {
                obj = Integer.valueOf(Settings.getInstance().getIntSetting(idByKey));
            } else if ("bool".equals(str3)) {
                obj = Boolean.valueOf(Settings.getInstance().getBoolSetting(idByKey));
            } else if ("long".equals(str3)) {
                obj = Long.valueOf(Settings.getInstance().getLongSetting(idByKey));
            } else {
                obj = str2;
                if ("string".equals(str3)) {
                    obj = Settings.getInstance().getStringSetting(idByKey);
                }
            }
        }
        return String.valueOf(obj);
    }

    public void setSettingValue(String str, String str2, String str3) {
        int i = 0;
        if (C1368X.m6324d() && Settings.isInitialized()) {
            Bundle bundle = new Bundle();
            int idByKey = Settings.getInstance().getIdByKey(str);
            if (SETTING_TYPE_INT.equals(str3)) {
                try {
                    i = Integer.valueOf(str2).intValue();
                } catch (NumberFormatException e) {
                }
                Settings.getInstance().setIntSetting(idByKey, i);
                bundle.putInt(IPCManager.SETTING_VALUE, i);
                i = 1;
            } else if ("bool".equals(str3)) {
                Settings.getInstance().setBoolSetting(idByKey, Boolean.valueOf(str2).booleanValue());
                bundle.putBoolean(IPCManager.SETTING_VALUE, Boolean.valueOf(str2).booleanValue());
                i = 3;
            } else if ("long".equals(str3)) {
                long j = 0;
                try {
                    j = Long.valueOf(str2).longValue();
                } catch (NumberFormatException e2) {
                }
                Settings.getInstance().setLongSetting(idByKey, j);
                bundle.putLong(IPCManager.SETTING_VALUE, j);
                i = 4;
            } else if ("string".equals(str3)) {
                Settings.getInstance().setStringSetting(idByKey, str2);
                i = 2;
                bundle.putString(IPCManager.SETTING_VALUE, str2);
            }
            bundle.putInt(IPCManager.SETTING_TYPE, i);
            bundle.putInt(IPCManager.SETTING_KEY, idByKey);
            Message obtain = Message.obtain((Handler) null, 3);
            if (C1368X.m6324d()) {
                obtain.setData(bundle);
            }
            try {
                C1368X.m6320c().mo5839l().sendMessage(obtain);
            } catch (RemoteException e3) {
                e3.printStackTrace();
            }
        }
    }
}
