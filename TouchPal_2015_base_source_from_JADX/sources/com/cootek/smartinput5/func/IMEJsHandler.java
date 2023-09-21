package com.cootek.smartinput5.func;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.cootek.smartinput5.action.ActionAttachedPackageRemoved;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.action.ActionDownloadCellPack;
import com.cootek.smartinput5.action.ActionDownloadEmojiPack;
import com.cootek.smartinput5.action.ActionDownloadLanguagePack;
import com.cootek.smartinput5.action.ActionDownloadSkinPack;
import com.cootek.smartinput5.action.ActionSetLanguageEnabled;
import com.cootek.smartinput5.action.ActionSetSkin;
import com.cootek.smartinput5.action.ActionStartBatchDownloadMode;
import com.cootek.smartinput5.action.ActionStopBatchDownloadMode;
import com.cootek.smartinput5.action.ParcelableAction;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2207Y;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.settings.SkinInfoHandler;
import com.emoji.keyboard.touchpal.R;
import org.json.JSONArray;

public class IMEJsHandler {
    private static final String TAG = "IMEJsHandler";
    private static IMEJsHandler sInst;
    private Handler mHandler = new C1442ar(this);
    private IPCManager mIPCManager;
    private Messenger mMessenger;
    private C2197U mNonApkDownloader;
    private SkinInfoHandler mSkinInfoHandler;
    private WebView mWebView;

    public static IMEJsHandler getInstance() {
        if (sInst == null) {
            sInst = new IMEJsHandler((WebView) null);
        }
        return sInst;
    }

    public IMEJsHandler(WebView webView) {
        setWebView(webView);
    }

    public void setWebView(WebView webView) {
        this.mWebView = webView;
        if (webView != null) {
            this.mSkinInfoHandler = new SkinInfoHandler(webView.getContext(), webView);
            this.mNonApkDownloader = new C2207Y(webView.getContext());
            return;
        }
        this.mSkinInfoHandler = null;
        this.mNonApkDownloader = null;
    }

    public void setIPCManager(IPCManager iPCManager) {
        this.mIPCManager = iPCManager;
        registerMessenger();
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

    /* access modifiers changed from: private */
    public void handleSettingsChanged(Bundle bundle) {
        if (bundle != null && this.mIPCManager != null) {
            this.mIPCManager.handleSettingsChanged(bundle);
        }
    }

    /* access modifiers changed from: private */
    public void handleDoExtralAction(Bundle bundle) {
        if (bundle != null && C1368X.m6324d() && bundle.getInt(IPCManager.EXTRA_ACTION_TYPE) == 10) {
            int i = bundle.getInt(C1811k.f5998p);
            String string = bundle.getString(C1811k.f5999q);
            C1389aD o = C1368X.m6320c().mo5842o();
            JSONArray jSONArray = new JSONArray();
            if (i == C1368X.m6320c().mo5841n().mo5935b()) {
                if (this.mSkinInfoHandler != null) {
                    this.mSkinInfoHandler.queryAllSkinPacks();
                }
            } else if (i == o.mo5935b()) {
                o.mo5941e();
                C1498a m = o.mo5956m(string);
                if (m != null) {
                    string = m.f4727f;
                    if (C1549b.f4831b.equals(string)) {
                        jSONArray.put(C1549b.f4832c);
                    } else if (C1549b.f4832c.equals(string)) {
                        jSONArray.put(C1549b.f4831b);
                    }
                }
            } else if (i == C2003a.m9262c().mo5935b() && string != null && string.startsWith(C1811k.f5996n)) {
                String[] split = string.split("\\.");
                int length = split.length - 1;
                if (length < 0) {
                    length = 0;
                }
                string = C2197U.f9278p + split[length];
            }
            if (!TextUtils.isEmpty(string)) {
                jSONArray.put(string);
            }
            this.mWebView.loadUrl(String.format("javascript:onAttachedPackageChanged(\"%s\")", new Object[]{jSONArray.toString().replace("\"", "\\\"")}));
        }
    }

    /* access modifiers changed from: private */
    public void handleBatchDownloadFinished(Bundle bundle) {
        if (bundle != null) {
            this.mWebView.loadUrl(String.format("javascript:onBatchDownloadFinished(\"%s\")", new Object[]{bundle.getString(IPCManager.DOWNLOADED_PACKAGE_LIST).toString().replace("\"", "\\\"")}));
        }
    }

    private void processParcelableAction(ParcelableAction parcelableAction, boolean z) {
        if (z) {
            if (this.mIPCManager != null) {
                try {
                    this.mIPCManager.sendMessageForParcelableAction(parcelableAction);
                } catch (RemoteException e) {
                }
            }
        } else if (this.mHandler != null) {
            this.mHandler.post(parcelableAction);
        } else {
            parcelableAction.run();
        }
    }

    public boolean downloadSkinPackage(String str, String str2, String str3) {
        return downloadSkinPackage(str, str2, str3, this.mNonApkDownloader);
    }

    public boolean downloadSkinPackage(String str, String str2, String str3, C2197U u) {
        C2361q.m10797b().mo7997a(u);
        processParcelableAction(new ActionDownloadSkinPack(str, str2, str3), false);
        return true;
    }

    public boolean isSkinPackageInstalled(String str) {
        return isSkinPackageInstalled(str, this.mSkinInfoHandler);
    }

    public boolean isSkinPackageInstalled(String str, SkinInfoHandler skinInfoHandler) {
        if (skinInfoHandler == null) {
            return false;
        }
        return skinInfoHandler.isPackageInstalled(str);
    }

    public boolean isSkinCompatible(String str) {
        return isSkinCompatible(str, this.mSkinInfoHandler);
    }

    public boolean isSkinCompatible(String str, SkinInfoHandler skinInfoHandler) {
        if (skinInfoHandler == null) {
            return false;
        }
        return skinInfoHandler.isPackageCompatible(str);
    }

    public boolean downloadLanguagePackage(String str) {
        return downloadLanguagePackage(str, this.mNonApkDownloader);
    }

    public boolean downloadLanguagePackage(String str, C2197U u) {
        C2361q.m10797b().mo7997a(u);
        processParcelableAction(new ActionDownloadLanguagePack(str), false);
        return true;
    }

    public boolean isLanguageInstalled(String str) {
        return C1368X.m6320c().mo5842o().mo5960o(str) && !C1389aD.m6423C(str);
    }

    public boolean downloadCellPackage(String str, String str2) {
        return downloadCellPackage(str, str2, this.mNonApkDownloader);
    }

    public boolean downloadCellPackage(String str, String str2, C2197U u) {
        C2361q.m10797b().mo7997a(u);
        processParcelableAction(new ActionDownloadCellPack(str, str2, C1974m.m9063a(C1368X.m6313b(), (int) R.string.CELLDICT_PACK_TARGET_VERSION)), false);
        return true;
    }

    public boolean isCellInstalled(String str) {
        String e = C1960r.m8999e(str);
        C1960r r = C1368X.m6320c().mo5845r();
        return r.mo7209l(r.mo7201f(e));
    }

    public boolean downloadEmojiItem(String str) {
        return downloadEmojiItem(str, this.mNonApkDownloader);
    }

    public boolean downloadEmojiItem(String str, C2197U u) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C1351J.m6196h()) {
            C1351J.m6189a(C1368X.m6313b());
            return false;
        } else if (!str.startsWith(C2197U.f9278p)) {
            return false;
        } else {
            C2361q.m10797b().mo7997a(u);
            processParcelableAction(new ActionDownloadEmojiPack(str), false);
            return true;
        }
    }

    public boolean isEmojiItemInstalled(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith(C2197U.f9278p)) {
            return C2003a.m9262c().mo7354i();
        }
        return false;
    }

    public void setSkinEnable(String str) {
        Settings.getInstance().setStringSetting(80, str);
        processParcelableAction(new ActionSetSkin(str), true);
    }

    public String getEnabledSkin() {
        return Settings.getInstance().getStringSetting(80);
    }

    public void uninstallSkin(String str) {
        uninstallSkin(str, this.mSkinInfoHandler);
    }

    public void uninstallSkin(String str, SkinInfoHandler skinInfoHandler) {
        C1601bg l = C1368X.m6320c().mo5841n().mo6284l(str);
        if (l != null && skinInfoHandler != null && skinInfoHandler.isPackageInstalled(str)) {
            l.f5932a.mo6025d();
            processParcelableAction(new ActionAttachedPackageRemoved(str), true);
        }
    }

    public boolean isLanguageEnabled(String str) {
        C1498a l = C1368X.m6320c().mo5842o().mo5954l(str);
        if (l != null) {
            return l.mo6158h();
        }
        return false;
    }

    public boolean isLanguageCompatible(String str) {
        C1498a l = C1368X.m6320c().mo5842o().mo5954l(str);
        if (l != null) {
            return l.mo6156f();
        }
        return false;
    }

    public String getInstalledLanguage() {
        String[] h = C1368X.m6320c().mo5842o().mo5947h();
        JSONArray jSONArray = new JSONArray();
        for (String put : h) {
            jSONArray.put(put);
        }
        return jSONArray.toString();
    }

    public void setLanguageEnable(String str, boolean z) {
        if (C1368X.m6320c().mo5842o().mo5954l(str) != null) {
            processParcelableAction(new ActionSetLanguageEnabled(str, z), true);
        }
    }

    public void startBatchDownloadMode() {
        startBatchDownloadMode(this.mNonApkDownloader);
    }

    public void startBatchDownloadMode(C2197U u) {
        C2361q.m10797b().mo7997a(u);
        processParcelableAction(new ActionStartBatchDownloadMode(), false);
    }

    public void stopBatchDownloadMode() {
        stopBatchDownloadMode(this.mNonApkDownloader);
    }

    public void stopBatchDownloadMode(C2197U u) {
        C2361q.m10797b().mo7997a(u);
        processParcelableAction(new ActionStopBatchDownloadMode(), false);
    }

    public void collectData(String str, String str2) {
        processParcelableAction(new ActionCollectData(str, C1246d.f3935g, str2, 1), true);
    }

    public int getImeVersion() {
        return Settings.getInstance().getIntSetting(Settings.IME_CUR_VERSION);
    }
}
