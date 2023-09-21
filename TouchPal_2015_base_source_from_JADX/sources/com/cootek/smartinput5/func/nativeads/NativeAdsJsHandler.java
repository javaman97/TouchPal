package com.cootek.smartinput5.func.nativeads;

import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.smartinput5.action.ActionAddPromotion;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.action.ParcelableAction;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1416aY;
import com.cootek.smartinput5.p048d.C1246d;

public class NativeAdsJsHandler {
    private static final String TAG = "NativeAdsJsHandler";
    private static NativeAdsJsHandler sInst;
    private IPCManager mIPCManager;
    /* access modifiers changed from: private */
    public String mNativeAds;
    /* access modifiers changed from: private */
    public boolean mNativeAdsLoading = false;
    /* access modifiers changed from: private */
    public WebView mWebView;

    public static NativeAdsJsHandler getInstance() {
        if (sInst == null) {
            sInst = new NativeAdsJsHandler((WebView) null);
        }
        return sInst;
    }

    public NativeAdsJsHandler(WebView webView) {
        setWebView(webView);
    }

    public void setWebView(WebView webView) {
        this.mWebView = webView;
    }

    public void loadNativeAds(String str) {
        loadNativeAdsWithParameters(str, (String) null);
    }

    public void loadNativeAdsWithParameters(String str, String str2) {
        this.mNativeAds = "";
        this.mNativeAdsLoading = true;
        C1896t.m8712a().mo7035a(str, str2, new C1893q(this));
    }

    public String getNativeAds(String str) {
        if (TextUtils.isEmpty(this.mNativeAds) && !this.mNativeAdsLoading) {
            loadNativeAds(str);
        }
        return this.mNativeAds;
    }

    public void onNativeAdsShown(String str, String str2) {
        collectData("NATIVE_ADS/SHOW", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str2, C1246d.f3933e);
    }

    public void onNativeAdsClicked(String str, String str2) {
        collectData("NATIVE_ADS/CLICK", str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + str2, C1246d.f3933e);
        if (!TextUtils.isEmpty(str2)) {
            addPromotionApp(C1416aY.f4533d, str2);
        }
    }

    public void onNativeAdsAdded(String str) {
        callBackNativeAdsAdded("onNativeAdsAdded", str);
    }

    private void callBackNativeAdsAdded(String str, String str2) {
        if (str2 != null && this.mWebView != null) {
            this.mWebView.loadUrl(String.format("javascript:JSNativeAds.%s(\"%s\")", new Object[]{str, str2.replace("\"", "\\\"")}));
        }
    }

    public void setIPCManager(IPCManager iPCManager) {
        this.mIPCManager = iPCManager;
    }

    private void handleParcelableAction(ParcelableAction parcelableAction) {
        if (this.mIPCManager != null) {
            try {
                this.mIPCManager.sendMessageForParcelableAction(parcelableAction);
            } catch (RemoteException e) {
            }
        }
    }

    private void collectData(String str, String str2, String str3) {
        handleParcelableAction(new ActionCollectData(str, str3, str2, 1));
    }

    private void addPromotionApp(String str, String str2) {
        handleParcelableAction(new ActionAddPromotion(str, str2));
    }
}
