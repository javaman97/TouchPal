package com.cootek.smartinput5.func;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.cootek.nativejsapis.DeviceInfo;
import com.cootek.nativejsapis.NativeLocalStorage;
import com.cootek.smartinput.utilities.TJavascriptHandler;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.action.ActionDownloadCellPack;
import com.cootek.smartinput5.action.ActionDownloadEmojiPack;
import com.cootek.smartinput5.action.ActionDownloadLanguagePack;
import com.cootek.smartinput5.action.ActionDownloadSkinPack;
import com.cootek.smartinput5.action.ActionStopShareSDK;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.func.iab.C1766af;
import com.cootek.smartinput5.func.iab.C1778f;
import com.cootek.smartinput5.func.nativeads.NativeAdsJsHandler;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2207Y;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2231ar;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.cootek.smartinput5.p066ui.settings.OnlineShopActivity;
import com.cootek.smartinput5.p066ui.settings.SkinInfoHandler;
import com.cootek.smartinput5.teaching.TutorialMissionActivity;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsHandler {
    private static final String CALLBACK_PARAMS = "callbackParams";
    private static final String CALLBACK_URL = "callbackUrl";
    public static final int CHANGE_CELL = 256;
    public static final int CHANGE_IAB_PURCHASE = 64;
    public static final int CHANGE_IAB_QUERY_PURCHASE = 16;
    public static final int CHANGE_IAB_QUERY_SKU = 32;
    public static final int CHANGE_IAB_SETUP = 128;
    public static final int CHANGE_LANGUAGE = 2;
    public static final int CHANGE_LOGIN_SUCCESS = 2048;
    public static final int CHANGE_MISSION = 1;
    public static final int CHANGE_MORE = 512;
    public static final int CHANGE_PAGE = 8;
    public static final int CHANGE_REFRESH = 1024;
    public static final int CHANGE_SKIN = 4;
    public static final String EXTRA_INT_MISSION_STATE = "com.cootek.smartinput5.func.AttachedPackageManager.EXTRA_INT_MISSION_STATE";
    public static final String EXTRA_STRING_MISSION_ID = "com.cootek.smartinput5.func.AttachedPackageManager.EXTRA_STRING_MISSION_ID";
    private static final String GOODS_TYPE_CELL = "cell";
    private static final String GOODS_TYPE_LANGUAGE = "language";
    private static final String GOODS_TYPE_MORE = "more";
    private static final String GOODS_TYPE_SKIN = "skin";
    private static final int MSG_CALLBACK_WEBVIEW = 257;
    private static final int MSG_LOAD_URL = 258;
    public static final int SHOP_PAGE_ACCOUNT = 7;
    public static final int SHOP_PAGE_DEFAULT = 1;
    public static final int SHOP_PAGE_LOGIN = 0;
    public static final int SHOP_PAGE_MISSION = 8;
    public static final int SHOP_PAGE_MYPLAY_LANGUAGE = 6;
    public static final int SHOP_PAGE_MYPLAY_SKIN = 5;
    public static final int SHOP_PAGE_TOUCHPAL_PLAY_CELL = 3;
    public static final int SHOP_PAGE_TOUCHPAL_PLAY_LANGUAGE = 2;
    public static final int SHOP_PAGE_TOUCHPAL_PLAY_MORE = 4;
    public static final int SHOP_PAGE_TOUCHPAL_PLAY_SKIN = 1;
    private static final String TAG = "shopJsHandler";
    private static final String Version = null;
    public static final int WEBVIEW_KEYCODE_BACK = 0;
    public static final int WEBVIEW_KEYCODE_MENU = 1;
    private Activity mActivity;
    private boolean mBlockJsInit = false;
    private int mChangeSet;
    /* access modifiers changed from: private */
    public ArrayList<String> mChangedPkgnameList = new ArrayList<>();
    /* access modifiers changed from: private */
    public Context mContext;
    private int mCurrentPageIndex = -1;
    /* access modifiers changed from: private */
    public Handler mHandler = new C1469ay(this);
    /* access modifiers changed from: private */
    public IPCManager mIPCManager;
    private C1352a mIabHandler = new C1352a(this, (C1469ay) null);
    private C1730E mIabHelper;
    private Messenger mMessenger;
    private C2197U mNonApkDownloader;
    /* access modifiers changed from: private */
    public String mPurchaseCallback;
    private HashSet<C1754V> mPurchasedList = new HashSet<>();
    /* access modifiers changed from: private */
    public String mQuerySkuDetailsCallback;
    private SkinInfoHandler mSkinHandler;
    private boolean mStarted;
    /* access modifiers changed from: private */
    public String mSyncOrderCallback;
    private TJavascriptHandler mTJavascriptHandler;
    /* access modifiers changed from: private */
    public WebView mWebView;
    private C2231ar mWebViewProgressDownloader;
    private HashMap<String, Integer> missionStateMap = new HashMap<>();
    private String tempMissionId = "mission_curve";

    public JsHandler(Context context, WebView webView) {
        this.mContext = context;
        this.mIPCManager = C1368X.m6320c().mo5839l();
    }

    public void start() {
        this.mStarted = true;
        this.mIPCManager.bindService();
        registerMessenger();
        if (C1132b.m5654a(this.mContext).mo4392a(C1135d.GOOGLE_IAB, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            if (this.mActivity != null) {
                C1730E.m7962a((Context) this.mActivity);
            } else {
                C1730E.m7962a(this.mContext);
            }
            this.mIabHelper = C1730E.m8005d();
            C1730E.m7972a((C1746T.C1747a) this.mIabHandler);
            this.mIabHelper.mo6685e();
        }
    }

    public void stop() {
        this.mStarted = false;
        this.mIPCManager.destroy();
        C1730E.m7996b((C1746T.C1747a) this.mIabHandler);
        if (this.mIabHelper != null) {
            this.mIabHelper.mo6686f();
            this.mIabHelper = null;
        }
    }

    public boolean hasStarted() {
        return this.mStarted;
    }

    public void setWebView(WebView webView) {
        setWebView(webView, true);
    }

    public void setWebView(WebView webView, boolean z) {
        if (z) {
            if (webView != null) {
                webView.addJavascriptInterface(this, "tpHandler");
                webView.addJavascriptInterface(new TouchPalInfo(this.mContext), "tpInfo");
                webView.addJavascriptInterface(webView, "webview");
                this.mTJavascriptHandler = new TJavascriptHandler(this.mContext, webView);
                this.mTJavascriptHandler.setIPCManager(this.mIPCManager);
                webView.addJavascriptInterface(this.mTJavascriptHandler, "CTKJavaScriptHandler");
                webView.addJavascriptInterface(new DeviceInfo(this.mContext), "CTKDeviceInfo");
                webView.addJavascriptInterface(new NativeLocalStorage(this.mContext, C1466av.f4714w), "CTKNativeLocalStorage");
                NativeAdsJsHandler.getInstance().setWebView(webView);
                NativeAdsJsHandler.getInstance().setIPCManager(this.mIPCManager);
                webView.addJavascriptInterface(NativeAdsJsHandler.getInstance(), "CTKNativeAds");
                IMEJsHandler.getInstance().setWebView(webView);
                IMEJsHandler.getInstance().setIPCManager(this.mIPCManager);
                webView.addJavascriptInterface(IMEJsHandler.getInstance(), "IMEHandler");
            } else if (this.mWebView != null) {
                this.mWebView.addJavascriptInterface((Object) null, "tpHandler");
            }
        }
        this.mWebView = webView;
        if (webView == null || !z) {
            this.mSkinHandler = null;
            this.mNonApkDownloader = null;
            this.mWebViewProgressDownloader = null;
            return;
        }
        this.mSkinHandler = new SkinInfoHandler(webView.getContext(), webView);
        this.mNonApkDownloader = new C2207Y(webView.getContext());
        this.mWebViewProgressDownloader = new C2231ar(webView.getContext(), webView);
    }

    public void setActivity(Activity activity) {
        this.mActivity = activity;
        if (this.mTJavascriptHandler != null) {
            this.mTJavascriptHandler.setActivity(this.mActivity);
        }
    }

    public void refreshWebView() {
        if (this.mHandler != null) {
            Message obtainMessage = this.mHandler.obtainMessage(258);
            obtainMessage.obj = "javascript:refresh()";
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public void goBack() {
        if (this.mHandler != null) {
            Message obtainMessage = this.mHandler.obtainMessage(258);
            obtainMessage.obj = "javascript:goBack()";
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public void setBlockJsInit(boolean z) {
        this.mBlockJsInit = z;
    }

    public boolean getBlockJsInit() {
        return this.mBlockJsInit;
    }

    public void setChangeSet(int i) {
    }

    public void launchShop(int i) {
        launchShop(i, (String) null);
    }

    public void launchShop(int i, String str) {
        launchShop(i, str, (String) null, (String) null);
    }

    public void launchShop(int i, String str, String str2, String str3) {
        if (C1132b.m5654a(this.mContext).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            if (Settings.getInstance().getBoolSetting(Settings.FIRST_ENTER_SHOP)) {
                Settings.getInstance().setBoolSetting(Settings.FIRST_ENTER_SHOP, false);
            }
            if (Settings.isInitialized()) {
                Settings.getInstance().writeBack();
            }
            Intent intent = new Intent();
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.setClass(this.mContext, OnlineShopActivity.class);
            intent.putExtra(OnlineShopActivity.f13554a, i);
            intent.putExtra(OnlineShopActivity.f13555b, str);
            intent.putExtra(OnlineShopActivity.f13556c, str2);
            intent.putExtra(OnlineShopActivity.f13557d, str3);
            this.mContext.startActivity(intent);
            if (Engine.isInitialized()) {
                Engine.getInstance().getIms().requestHideSelf(0);
            }
        }
    }

    private void registerMessenger() {
        if (this.mIPCManager != null && this.mMessenger == null) {
            this.mMessenger = new Messenger(this.mHandler);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.mMessenger;
            try {
                this.mIPCManager.sendMessage(obtain);
            } catch (RemoteException e) {
            }
        }
    }

    public void notifyMissionStateChanged(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = this.tempMissionId;
        }
        setMissionState(str, i);
        addChangeSet(1);
        launchShop(8);
    }

    public String getAppId() {
        return C1368X.m6320c().mo5832R();
    }

    public void active(String str) {
        new C1470az(this, str).start();
    }

    public String getCootekToken() {
        return C2188Q.m9853a().mo7683c();
    }

    public void setCootekToken(String str) {
        C2188Q.m9853a().mo7680a(str);
    }

    public void resetWebviewAuthToken() {
        if (this.mHandler != null) {
            Message obtainMessage = this.mHandler.obtainMessage(258);
            obtainMessage.obj = "javascript:resetAuthToken()";
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    private void writeBackToken() {
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 88);
        bundle.putString(IPCManager.SETTING_VALUE, C2188Q.m9853a().mo7683c());
        obtain.setData(bundle);
        try {
            this.mIPCManager.sendMessage(obtain);
        } catch (RemoteException e) {
        }
    }

    public void stopShareSDK() {
        C1600bf.m7225b(this.mContext);
        if (this.mIPCManager != null) {
            try {
                this.mIPCManager.sendMessageForParcelableAction(new ActionStopShareSDK());
            } catch (RemoteException e) {
            }
        }
    }

    public boolean isInteVersion() {
        return C1593bR.m7162a().f5075a;
    }

    public boolean isIntePackage() {
        return C1593bR.m7162a().f5077c;
    }

    public void setAccountType() {
    }

    public String getAccountType() {
        return null;
    }

    public boolean setMissionState(String str, int i) {
        if (i == 1) {
            Intent intent = new Intent();
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.setClass(this.mContext, TutorialMissionActivity.class);
            intent.putExtra(TutorialMissionActivity.f10943a, str);
            this.mContext.startActivity(intent);
            this.tempMissionId = str;
        }
        this.missionStateMap.put(str, Integer.valueOf(i));
        return true;
    }

    public int getMissionState(String str) {
        if (this.missionStateMap.containsKey(str)) {
            return this.missionStateMap.get(str).intValue();
        }
        return -1;
    }

    public void downloadSkinPackage(String str, String str2, String str3) {
        reloadItem("skin", str);
        if (C1368X.m6320c().mo5827M().mo5995b(1)) {
            C1368X.m6320c().mo5827M().mo5996c(1);
        }
        C2361q.m10797b().mo7997a(this.mNonApkDownloader);
        C1584bI.m7145b(this.mContext, new C1386aA(this, str, str2, str3), false);
        C1056a.m5588a().mo4264a(C1056a.f2990u, this.mContext);
    }

    public void downloadSkinPackageWithQuery(String str, String str2, String str3) {
        Message obtain = Message.obtain((Handler) null, 16);
        Bundle bundle = new Bundle();
        bundle.putString(IPCManager.SKIN_PACKAGE_NAME, str);
        bundle.putString(IPCManager.SKIN_PACKAGE_URL, str2);
        bundle.putString(IPCManager.SKIN_DISPLAY_NAME, str3);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    public void downloadSkinPackageWithProgress(String str, String str2, String str3) {
        reloadItem("skin", str);
        if (C1368X.m6320c().mo5827M().mo5995b(1)) {
            C1368X.m6320c().mo5827M().mo5996c(1);
        }
        C2361q.m10797b().mo7997a((C2197U) this.mWebViewProgressDownloader);
        this.mHandler.post(new ActionDownloadSkinPack(str, str2, str3));
        C1056a.m5588a().mo4264a(C1056a.f2990u, this.mContext);
    }

    public void cancelDownloadWithProgress() {
        this.mWebViewProgressDownloader.mo7663e();
    }

    public void enterOnlineShop() {
        C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 17));
    }

    public boolean isSkinPackageInstalled(String str) {
        return IMEJsHandler.getInstance().isSkinPackageInstalled(str, this.mSkinHandler);
    }

    public boolean isSkinCompatible(String str) {
        return IMEJsHandler.getInstance().isSkinCompatible(str, this.mSkinHandler);
    }

    public void setSkinEnable(String str) {
        IMEJsHandler.getInstance().setSkinEnable(str);
    }

    public String getEnabledSkin() {
        return IMEJsHandler.getInstance().getEnabledSkin();
    }

    public void uninstallSkin(String str) {
        IMEJsHandler.getInstance().uninstallSkin(str, this.mSkinHandler);
    }

    public boolean downloadLanguagePackage(String str) {
        if (C1368X.m6320c().mo5827M().mo5995b(0)) {
            C1368X.m6320c().mo5827M().mo5996c(0);
        }
        C2361q.m10797b().mo7997a(this.mNonApkDownloader);
        this.mHandler.post(new ActionDownloadLanguagePack(str));
        C1056a.m5588a().mo4264a(C1056a.f2991v, this.mContext);
        return true;
    }

    public void onLanguageDownloaded() {
        addChangeSet(2);
        refreshWebView();
    }

    public boolean isLanguageInstalled(String str) {
        return IMEJsHandler.getInstance().isLanguageInstalled(str);
    }

    public boolean isLanguageEnabled(String str) {
        return IMEJsHandler.getInstance().isLanguageEnabled(str);
    }

    public boolean isLanguageCompatible(String str) {
        return IMEJsHandler.getInstance().isLanguageCompatible(str);
    }

    public String getInstalledLanguage() {
        return IMEJsHandler.getInstance().getInstalledLanguage();
    }

    public void setLanguageEnable(String str, boolean z) {
        IMEJsHandler.getInstance().setLanguageEnable(str, z);
    }

    public boolean downloadCellPackage(String str, String str2) {
        C2361q.m10797b().mo7997a(this.mNonApkDownloader);
        this.mHandler.post(new ActionDownloadCellPack(str, str2, C1974m.m9063a(this.mContext, (int) R.string.CELLDICT_PACK_TARGET_VERSION)));
        C1056a.m5588a().mo4264a(C1056a.f2992w, this.mContext);
        return true;
    }

    public void onCellDownloaded() {
        addChangeSet(256);
        refreshWebView();
    }

    public boolean isCellInstalled(String str) {
        return IMEJsHandler.getInstance().isCellInstalled(str);
    }

    public boolean isMoreItemInstalled(String str) {
        return IMEJsHandler.getInstance().isEmojiItemInstalled(str);
    }

    public boolean downloadMoreItem(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C1351J.m6196h()) {
            C1351J.m6189a(this.mContext);
            return false;
        }
        C2361q.m10797b().mo7997a(this.mNonApkDownloader);
        if (!str.startsWith(C2197U.f9278p)) {
            return false;
        }
        this.mHandler.post(new ActionDownloadEmojiPack(str));
        C1056a.m5588a().mo4264a(C1056a.f2993x, this.mContext);
        return true;
    }

    public void startBatchDownloadMode() {
        IMEJsHandler.getInstance().startBatchDownloadMode(this.mNonApkDownloader);
    }

    public void stopBatchDownloadMode() {
        IMEJsHandler.getInstance().stopBatchDownloadMode(this.mNonApkDownloader);
    }

    public void shareText(String str, String str2) {
        if (this.mWebView != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(Engine.EXCEPTION_ERROR);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            this.mWebView.getContext().startActivity(Intent.createChooser(intent, str));
        }
    }

    public void copyText(String str, String str2) {
        ((ClipboardManager) this.mContext.getSystemService("clipboard")).setText(str);
        Toast.makeText(this.mContext, String.format(C1974m.m9063a(this.mContext, (int) R.string.copy_success), new Object[]{str2}), 0).show();
    }

    public void showToast(String str) {
        C2849W.m13205a().mo9478a(str, false);
    }

    public void showToast(String str, int i) {
        C2849W.m13205a().mo9477a(str, i);
    }

    public String getClientSize() {
        if (this.mWebView == null) {
            return null;
        }
        int width = this.mWebView.getWidth();
        int height = this.mWebView.getHeight();
        float f = this.mWebView.getResources().getDisplayMetrics().density;
        return String.format("{\"width\":%d, \"height\":%d}", new Object[]{Integer.valueOf((int) (((float) width) / f)), Integer.valueOf((int) (((float) height) / f))});
    }

    public String getNativeString(String str) {
        return C1368X.m6320c().mo5838k().mo6241b("@string/" + str);
    }

    public void exit() {
        if (this.mWebView != null) {
            writeBackToken();
            Settings.getInstance().writeBack();
            C2849W.m13205a().mo9479b();
            stop();
            Activity activity = (Activity) this.mWebView.getContext();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public String getRecommendUserID() {
        return C2209a.m9962c(this.mContext);
    }

    public String getIdentifier() {
        return C2225al.m10078l(this.mContext);
    }

    public String getSupportWaveLangs() {
        ArrayList<C1550c> y = C1389aD.m6469y();
        JSONArray jSONArray = new JSONArray();
        Iterator<C1550c> it = y.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().mo6190a());
        }
        return jSONArray.toString();
    }

    public String getChangedPkgnameList() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.mChangedPkgnameList.size(); i++) {
            jSONArray.put(this.mChangedPkgnameList.get(i));
        }
        this.mChangedPkgnameList.clear();
        return jSONArray.toString();
    }

    public void invalidate(long j) {
        if (this.mWebView != null) {
            this.mWebView.postInvalidateDelayed(j);
        }
    }

    public void setCurrentPageIndex(int i) {
        if (i > 0) {
            if (this.mCurrentPageIndex < 0 || this.mCurrentPageIndex == i) {
                removeChangeSet(8);
            } else {
                addChangeSet(8);
            }
            this.mCurrentPageIndex = i;
        }
    }

    public void onPageIndexChanged(int i) {
        removeChangeSet(8);
        this.mCurrentPageIndex = i;
    }

    public int getCurrentPageIndex() {
        return this.mCurrentPageIndex;
    }

    public void setNeedRefresh() {
        addChangeSet(1024);
    }

    public void updateResult() {
        if (this.mHandler != null && this.mChangeSet > 0) {
            Message obtainMessage = this.mHandler.obtainMessage(258);
            obtainMessage.obj = "javascript:refresh(" + this.mChangeSet + ")";
            this.mHandler.sendMessage(obtainMessage);
            this.mChangeSet = 0;
        }
    }

    public void addChangeSet(int i) {
        this.mChangeSet |= i;
    }

    public void removeChangeSet(int i) {
        this.mChangeSet ^= this.mChangeSet & i;
    }

    public boolean isIABSupported(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C1778f.f5818al;
        }
        if (this.mIabHelper == null) {
            return false;
        }
        return this.mIabHelper.mo6687g(str);
    }

    public void queryPurchases(String str) {
        if (isIABSupported(str)) {
            if (TextUtils.isEmpty(str)) {
                str = C1778f.f5818al;
            }
            this.mIabHelper.mo6679a(str, (C1746T.C1750d) this.mIabHandler);
        }
    }

    public void consumePurchase() {
    }

    public String getPurchase(String str, String str2) {
        if (!isIABSupported(str)) {
            return null;
        }
        C1754V d = this.mIabHelper.mo6719d(str2);
        if (d != null) {
            return d.mo6732i();
        }
        Log.i(TAG, String.format("getPurchase. null", new Object[0]));
        return null;
    }

    public void querySkuDetails(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            str = C1778f.f5818al;
        }
        this.mQuerySkuDetailsCallback = str3;
        try {
            JSONArray jSONArray = new JSONArray(str2);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            this.mIabHelper.mo6681a(str, (ArrayList<String>) arrayList, (C1746T.C1751e) this.mIabHandler);
        } catch (JSONException e) {
            e.printStackTrace();
            this.mIabHandler.mo5746b(C1778f.f5837o);
        }
    }

    public String getSkuDetails(String str, String str2) {
        C1766af c;
        if (isIABSupported(str) && (c = this.mIabHelper.mo6717c(str2)) != null) {
            return c.mo6760f();
        }
        return null;
    }

    public void doPurchase(String str, int i, String str2, String str3, String str4) {
        JSONObject jSONObject;
        this.mPurchaseCallback = str4;
        try {
            jSONObject = new JSONObject(str3);
        } catch (Exception e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (this.mIabHandler != null) {
            this.mIabHelper.mo6673a(this.mActivity, i, str2, jSONObject);
        }
    }

    public void gotoTouchPalSettings() {
        Intent intent = new Intent();
        intent.setFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(this.mActivity, TouchPalOption.class);
        this.mActivity.startActivity(intent);
    }

    public void purchaseVIP() {
        C1617br.m7367a().mo6327a(this.mContext);
    }

    public void updateServiceInfo(Context context) {
        if (this.mIabHelper != null) {
            this.mIabHelper.mo6684b(context);
        }
    }

    public void syncOrder(String str, String str2, String str3) {
        JSONArray jSONArray;
        if (this.mIabHelper == null) {
            this.mIabHandler.mo5745a((JSONArray) null);
            return;
        }
        this.mSyncOrderCallback = str3;
        try {
            jSONArray = new JSONArray(str2);
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        this.mIabHelper.mo6682a(str, jSONArray, (C1746T.C1748b) this.mIabHandler);
    }

    public boolean checkGoodsUsable(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("skin")) {
            return checkSDCardUsable(z);
        }
        if (str.equals("more")) {
            if (TextUtils.isEmpty(str2) || !str2.startsWith(C2197U.f9278p)) {
                return false;
            }
            return checkSDCardUsable(z);
        } else if (str.equals("language")) {
            return true;
        } else {
            if (str.equals("cell")) {
                return true;
            }
            return false;
        }
    }

    private boolean checkSDCardUsable(boolean z) {
        if (C1358O.m6239b() != null) {
            return true;
        }
        if (!z) {
            return false;
        }
        C2849W.m13205a().mo9478a(C1974m.m9063a(this.mContext, (int) R.string.sdcard_eject_goods_unusable_msg), false);
        return false;
    }

    public void updateGoodsInfo(String str) {
        int[] iArr;
        JSONException e;
        String[] strArr;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                iArr = new int[jSONArray.length()];
                try {
                    strArr = new String[jSONArray.length()];
                    int i = 0;
                    while (true) {
                        try {
                            int i2 = i;
                            if (i2 >= jSONArray.length()) {
                                break;
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(jSONArray.optString(i2));
                                iArr[i2] = jSONObject.optInt("goods_id");
                                strArr[i2] = jSONObject.optString("status");
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                            i = i2 + 1;
                        } catch (JSONException e3) {
                            e = e3;
                        }
                    }
                } catch (JSONException e4) {
                    JSONException jSONException = e4;
                    strArr = null;
                    e = jSONException;
                    e.printStackTrace();
                    C1368X.m6320c().mo5840m().mo6061a(iArr, strArr);
                }
            } catch (JSONException e5) {
                iArr = null;
                e = e5;
                strArr = null;
                e.printStackTrace();
                C1368X.m6320c().mo5840m().mo6061a(iArr, strArr);
            }
            C1368X.m6320c().mo5840m().mo6061a(iArr, strArr);
        }
    }

    public void reloadItem(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if ("skin".equals(str)) {
                if (this.mSkinHandler != null) {
                    this.mSkinHandler.queryAllSkinPacks();
                }
            } else if ("cell".equals(str)) {
                C1368X.m6320c().mo5845r().mo7199d();
            } else if ("language".equals(str)) {
                C1368X.m6320c().mo5842o().mo5941e();
            } else {
                if ("more".equals(str)) {
                }
            }
        }
    }

    public boolean isVIP() {
        return C1617br.m7367a().mo6335b();
    }

    /* access modifiers changed from: private */
    public void callbackWebview(String str) {
        callbackWebview(str, "");
    }

    /* access modifiers changed from: private */
    public void callbackWebview(String str, String str2) {
        Message obtainMessage = this.mHandler.obtainMessage(257);
        Bundle bundle = new Bundle();
        bundle.putString(CALLBACK_URL, str);
        bundle.putString(CALLBACK_PARAMS, str2);
        obtainMessage.setData(bundle);
        this.mHandler.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: private */
    public void doCallbackWebview(String str, String str2) {
        if (this.mWebView != null && !TextUtils.isEmpty(str)) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (str2 == null) {
                str2 = "";
            }
            objArr[1] = str2;
            this.mWebView.loadUrl(String.format("javascript:%s(%s)", objArr));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivity != null && (this.mActivity instanceof C1730E.C1731a) && i == ((C1730E.C1731a) this.mActivity).mo6691a() && i2 == -1) {
            addChangeSet(2048);
        }
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6668a(i, i2, intent);
        }
    }

    private void collectData(String str, String str2, String str3) {
        ActionCollectData actionCollectData = new ActionCollectData(str, str2, str3, 1);
        if (this.mIPCManager == null) {
            actionCollectData.run();
            return;
        }
        try {
            this.mIPCManager.sendMessageForParcelableAction(actionCollectData);
        } catch (RemoteException e) {
            actionCollectData.run();
        }
    }

    public String getServerAddress() {
        return C2225al.m10053a(this.mContext, C2258O.QUERY_STORE_INFO);
    }

    /* renamed from: com.cootek.smartinput5.func.JsHandler$a */
    private class C1352a implements C1746T.C1747a, C1746T.C1748b, C1746T.C1749c, C1746T.C1750d, C1746T.C1751e {
        private C1352a() {
        }

        /* synthetic */ C1352a(JsHandler jsHandler, C1469ay ayVar) {
            this();
        }

        public void onUpdateFinished() {
            JsHandler.this.addChangeSet(128);
            JsHandler.this.updateResult();
        }

        public void onPurchaseFinished(int i, String str) {
            JsHandler.this.callbackWebview(JsHandler.this.mPurchaseCallback, String.format("%d,'%s'", new Object[]{Integer.valueOf(i), str}));
        }

        /* renamed from: a */
        public void mo5744a(int i, C1754V v) {
        }

        /* renamed from: b */
        public void mo5746b(int i) {
            if (i == -10006) {
                JsHandler.this.callbackWebview(JsHandler.this.mQuerySkuDetailsCallback, "'error'");
            } else {
                JsHandler.this.callbackWebview(JsHandler.this.mQuerySkuDetailsCallback);
            }
        }

        /* renamed from: a */
        public void mo5743a(int i) {
            JsHandler.this.addChangeSet(16);
            JsHandler.this.updateResult();
        }

        public void onSetupFinished() {
            JsHandler.this.addChangeSet(128);
            JsHandler.this.updateResult();
        }

        /* renamed from: a */
        public void mo5745a(JSONArray jSONArray) {
            JsHandler jsHandler = JsHandler.this;
            String access$1100 = JsHandler.this.mSyncOrderCallback;
            Object[] objArr = new Object[1];
            objArr[0] = jSONArray == null ? null : jSONArray.toString();
            jsHandler.callbackWebview(access$1100, String.format("'%s'", objArr));
        }

        public void onServiceDisconnected() {
        }
    }

    public boolean showSettingButton() {
        if (this.mActivity != null && (this.mActivity instanceof OnlineShopActivity)) {
            return true;
        }
        return false;
    }
}
