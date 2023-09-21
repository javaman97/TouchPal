package com.cootek.smartinput5.func.iab;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.cootek.smartinput5.action.ActionAddPromotion;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.func.iab.google.C1787g;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class PurchaseChannelChooseActivity extends C1976b implements PurchaseChooserJSHandler, C1746T.C1747a {
    private static final String APP_DETAILS_MARKET_PREFIX = "details?id=";
    private static final String APP_DETAILS_WEB_PREFIX = "play.google.com/store/apps/details?id=";
    public static final String AUTH_TOKEN = "auth_token";
    private static final String HANDLE_BACK_IN_WEBPAGE = "handleBackInWebPage";
    private static final String HTTPS_PROTOCOL = "https://";
    private static final String HTTP_PROTOCOL = "http://";
    private static final String MARKET_HTTPS_URL_PREFIX = "https://play.google.com/store/apps/details?id=";
    private static final String MARKET_HTTP_URL_PREFIX = "http://play.google.com/store/apps/details?id=";
    private static final String MARKET_PROTOCOL = "market://";
    private static final String MARKET_URL_PREFIX = "market://details?id=";
    private static final int MSG_FINISH_CHOOSER_PAGE = 2;
    private static final int MSG_LAUNCH_LOCAL_PURCHASE_WITH_TRANS_ID = 3;
    private static final int MSG_NOTIFY_PURCHASE_VIA_PROMOTION_APPS = 6;
    private static final int MSG_SET_HANDLE_BACK_TAG = 5;
    private static final int MSG_SET_PURCHASE_RESULT = 4;
    private static final int MSG_SHOW_CHOOSER_PAGE = 1;
    public static final String PURCHASE_APP_NAME = "appName";
    public static final String PURCHASE_CHANNEL_NAME = "channelName";
    private static final String PURCHASE_CHOOSER_HANDLER_NAME = "chooser_handler";
    public static final String PURCHASE_EXTR_INFO_STRING = "extraInfoString";
    public static final String PURCHASE_GOODS_ID = "goodsId";
    public static final String PURCHASE_LOCAL_SUPPORTED_CHANNELS = "localSupportedChannels";
    public static final String PURCHASE_RESULT = "purchaseResult";
    public static final String PURCHASE_STATUS = "status";
    public static final String PURCHASE_TRADE = "trade";
    public static final String PURCHASE_TRANS_ID = "transId";
    private static final String TAG = "PurchaseChannelChooseActivity";
    private boolean mHandleBackInWebPage = false;
    private Handler mHandler = new C1755W(this);
    /* access modifiers changed from: private */
    public String mPurchaseUrl;
    /* access modifiers changed from: private */
    public long mStartTime;
    private TWebView mWebView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C1368X.m6317b((Context) this);
        C1368X.m6320c().mo5839l().bindService();
        setToken();
        setFinishResult(-1, getIntent().getIntExtra(PURCHASE_GOODS_ID, 0), "not_purchased");
        setContentView(R.layout.purchase_channel_chooser);
        setupWebView();
        setupLocalPurchaseChannel();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (C1787g.m8211a()) {
            C1787g.m8212b().mo6786a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    private void setToken() {
        String stringExtra = getIntent().getStringExtra(AUTH_TOKEN);
        if (!TextUtils.isEmpty(stringExtra)) {
            C2188Q.m9853a().mo7680a(stringExtra);
        }
    }

    private void setupLocalPurchaseChannel() {
        showProgressDialog(C1974m.m9063a((Context) this, (int) R.string.vip_setup), new C1756X(this));
        C1730E.m7962a((Context) this);
        C1730E.m7972a((C1746T.C1747a) this);
        C1730E.m8005d().mo6685e();
    }

    /* access modifiers changed from: private */
    public String getCancelLabel() {
        String stringExtra = getIntent().getStringExtra(PURCHASE_TRADE);
        if (TextUtils.isEmpty(stringExtra)) {
            return String.valueOf(getIntent().getIntExtra(PURCHASE_GOODS_ID, 0));
        }
        return stringExtra;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        notifyGoogleBindResult();
        if (C1730E.m8004c()) {
            C1730E.m7996b((C1746T.C1747a) this);
            C1730E.m8005d().mo6686f();
        }
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5839l().destroy();
        }
        C1368X.m6325e();
    }

    public void showChooserPage() {
        Message obtain = Message.obtain();
        obtain.what = 1;
        this.mHandler.sendMessage(obtain);
    }

    public void launchLocalPurchase(int i, String str, String str2, String str3) {
        Message obtain = Message.obtain();
        obtain.what = 3;
        Bundle bundle = new Bundle();
        bundle.putInt(PURCHASE_GOODS_ID, i);
        bundle.putString(PURCHASE_TRANS_ID, str3);
        bundle.putString(PURCHASE_CHANNEL_NAME, str);
        bundle.putString(PURCHASE_EXTR_INFO_STRING, str2);
        obtain.setData(bundle);
        this.mHandler.sendMessage(obtain);
    }

    public void finishChooserPage() {
        Message obtain = Message.obtain();
        obtain.what = 2;
        this.mHandler.sendMessage(obtain);
    }

    public void setPurchaseResult(int i, String str) {
        Message obtain = Message.obtain();
        obtain.what = 4;
        Bundle bundle = new Bundle();
        bundle.putInt(PURCHASE_GOODS_ID, i);
        bundle.putString("status", str);
        obtain.setData(bundle);
        this.mHandler.sendMessage(obtain);
    }

    public void notifyPurchaseViaPromotionApps(int i, String str, String str2) {
        Message obtain = Message.obtain();
        obtain.what = 6;
        Bundle bundle = new Bundle();
        bundle.putString(PURCHASE_CHANNEL_NAME, str);
        bundle.putString("appName", str2);
        obtain.setData(bundle);
        this.mHandler.sendMessage(obtain);
    }

    public void setHandleBackTag(boolean z) {
        Message obtain = Message.obtain();
        obtain.what = 5;
        Bundle bundle = new Bundle();
        bundle.putBoolean(HANDLE_BACK_IN_WEBPAGE, z);
        obtain.setData(bundle);
        this.mHandler.sendMessage(obtain);
    }

    /* access modifiers changed from: private */
    public void doSetHandleBackInWeb(boolean z) {
        this.mHandleBackInWebPage = z;
    }

    private String buildUrl() {
        StringBuilder sb = new StringBuilder();
        addPurchaseChannel(sb);
        addGoodsDetails(sb);
        addSupportedLocalChannel(sb);
        addLocale(sb);
        addCountryCode(sb);
        return sb.toString();
    }

    private void addLocale(StringBuilder sb) {
        sb.append("&locale=");
        sb.append(C2225al.m10051a((Context) this));
    }

    private void addCountryCode(StringBuilder sb) {
        String country = getResources().getConfiguration().locale.getCountry();
        sb.append("&country_code=");
        sb.append(country);
    }

    private void addSupportedLocalChannel(StringBuilder sb) {
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra(PURCHASE_LOCAL_SUPPORTED_CHANNELS);
        if (stringArrayListExtra != null) {
            Iterator<String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                sb.append("&support_channel_name=");
                sb.append(it.next());
            }
        }
    }

    private void addPurchaseChannel(StringBuilder sb) {
        int o = C2225al.m10081o(this);
        sb.append(C2225al.m10064c(this, o));
        sb.append(C2258O.LOAD_PURCHASE_CHANNEL.mo7825a(o));
    }

    private void addGoodsDetails(StringBuilder sb) {
        String str = null;
        if (getIntent().hasExtra(PURCHASE_TRADE)) {
            str = getIntent().getStringExtra(PURCHASE_TRADE);
        }
        if (str != null) {
            sb.append("?trade_name=");
            sb.append(str);
            return;
        }
        sb.append("?goods_id=");
        sb.append(getIntent().getIntExtra(PURCHASE_GOODS_ID, 0));
    }

    private void setupWebView() {
        this.mWebView = new TWebView(this);
        ((ViewGroup) findViewById(R.id.root)).addView(this.mWebView, new LinearLayout.LayoutParams(-1, -1));
        updateWebViewVisibility(4);
        this.mWebView.setIPCManager(C1368X.m6320c().mo5839l());
        this.mWebView.setWebViewClient(getWebViewClient(this.mWebView));
        this.mWebView.setWebChromeClient(getChromeClient());
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.addJavascriptInterface(this, PURCHASE_CHOOSER_HANDLER_NAME);
    }

    private WebChromeClient getChromeClient() {
        return new C1757Y(this);
    }

    private WebViewClient getWebViewClient(TWebView tWebView) {
        tWebView.getClass();
        return new C1758Z(this, tWebView);
    }

    private boolean handleMarketUrl(String str) {
        boolean z = false;
        if (str != null) {
            if (str.startsWith(MARKET_HTTP_URL_PREFIX)) {
                str = str.replace(MARKET_HTTP_URL_PREFIX, MARKET_URL_PREFIX);
            } else if (str.startsWith(MARKET_HTTPS_URL_PREFIX)) {
                str = str.replace(MARKET_HTTPS_URL_PREFIX, MARKET_URL_PREFIX);
            }
            if (str.startsWith(MARKET_URL_PREFIX)) {
                z = true;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.addFlags(Engine.EXCEPTION_ERROR);
                intent.addFlags(1073741824);
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    public boolean handleSpecialUrl(String str) {
        boolean handleErrorCode = handleErrorCode(str);
        if (!handleErrorCode) {
            return handleMarketUrl(str);
        }
        return handleErrorCode;
    }

    private boolean handleErrorCode(String str) {
        if (str == null || !str.contains(C2258O.PURCHASE_CHANNEL_ERROR.mo7824a())) {
            return false;
        }
        int errorCode = getErrorCode(str);
        doHandleErrorCode(errorCode);
        loadChannelFinished(errorCode);
        return true;
    }

    /* access modifiers changed from: private */
    public void loadChannelFinished(int i) {
        C1779g.m8164a(getIntent().getIntExtra(PURCHASE_GOODS_ID, 0), i, this.mStartTime);
    }

    private void doHandleErrorCode(int i) {
        C1794k.m8279c(this, getIntent().getIntExtra(PURCHASE_GOODS_ID, 0), i);
    }

    private int getErrorCode(String str) {
        String substring;
        String[] split;
        int i = 0;
        int indexOf = str.indexOf(C2261Q.f9807m);
        if (!(indexOf == -1 || (substring = str.substring(indexOf + 1)) == null || (split = substring.split(C2261Q.f9808n)) == null)) {
            for (String str2 : split) {
                if (str2 != null && str2.contains("error_code=")) {
                    try {
                        i = Integer.valueOf(str2.replace("error_code=", "")).intValue();
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }
        return i;
    }

    private String getCookie() {
        String c = C2188Q.m9853a().mo7683c();
        if (!TextUtils.isEmpty(c)) {
            return "auth_token=" + c + ";path=/";
        }
        return null;
    }

    private void loadUrl(String str) {
        if (this.mWebView != null) {
            C2225al.m10056a((Context) this, str, getCookie());
            this.mWebView.loadUrl(str);
        }
    }

    /* access modifiers changed from: private */
    public void stopLoading() {
        if (this.mWebView != null) {
            this.mWebView.stopLoading();
        }
    }

    /* access modifiers changed from: private */
    public void showOverrideProgress(DialogInterface.OnCancelListener onCancelListener) {
        if (this.mWebView != null) {
            this.mWebView.setOnProgressCancelListener(onCancelListener);
            this.mWebView.mo7699c();
        }
    }

    /* access modifiers changed from: private */
    public void hideOverrideProgress() {
        if (this.mWebView != null) {
            this.mWebView.mo7700d();
        }
    }

    private void showProgressDialog(String str, DialogInterface.OnCancelListener onCancelListener) {
        C1789h.m8227a().mo6795a((Context) this, (C1789h.C1791b) new C1762ab(this, str, onCancelListener));
    }

    private void dismissProgressDialog() {
        C1789h.m8227a().mo6796b();
    }

    private void finishWithResult(int i, String str) {
        setFinishResult(-1, i, str);
        finish();
    }

    /* access modifiers changed from: private */
    public void setFinishResult(int i, int i2, String str) {
        setResult(-1, getFinishIntent(i2, str));
    }

    private Intent getFinishIntent(int i, String str) {
        Intent intent = new Intent();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("goods_id", i);
            jSONObject.put("status", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        intent.putExtra(PURCHASE_RESULT, jSONObject.toString());
        return intent;
    }

    private void updateWebViewVisibility(int i) {
        if (this.mWebView != null) {
            this.mWebView.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    public void doShowChooserPage() {
        dismissProgressDialog();
        updateWebViewVisibility(0);
    }

    /* access modifiers changed from: private */
    public void doLaunchLocalPurchaseWithTransId(int i, String str, String str2, String str3) {
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6672a((Activity) this, i, str, str2, str3);
        }
    }

    /* access modifiers changed from: private */
    public void doLaunchLocalPurchase(int i, String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        if (C1730E.m8004c()) {
            C1730E.m8005d().mo6683b((Activity) this, i, str, jSONObject);
        }
    }

    private void prepareChooserPage() {
        this.mStartTime = System.currentTimeMillis();
        this.mPurchaseUrl = buildUrl();
        loadUrl(this.mPurchaseUrl);
    }

    public void onSetupFinished() {
        if (!isFinishing()) {
            prepareChooserPage();
        }
    }

    public void onServiceDisconnected() {
    }

    public void onPurchaseFinished(int i, String str) {
        if (!isFinishing()) {
            if ("purchase_success".equals(str) || this.mWebView.getVisibility() != 0) {
                finishWithResult(i, str);
            }
        }
    }

    public void onUpdateFinished() {
    }

    public void onBackPressed() {
        boolean z = false;
        if (this.mWebView != null && this.mWebView.getVisibility() == 0) {
            z = handleBackPressed();
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    private boolean handleBackPressed() {
        if (this.mHandleBackInWebPage) {
            notifyWebPageBackHappened();
            return true;
        } else if (!this.mWebView.canGoBack()) {
            return false;
        } else {
            this.mWebView.goBack();
            return true;
        }
    }

    private void notifyWebPageBackHappened() {
        this.mWebView.loadUrl("javascript:goBack()");
    }

    private void notifyGoogleBindResult() {
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.BIND_GOOGLE_SERVICE_FAILED);
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 3);
        bundle.putInt(IPCManager.SETTING_KEY, Settings.BIND_GOOGLE_SERVICE_FAILED);
        bundle.putBoolean(IPCManager.SETTING_VALUE, boolSetting);
        obtain.setData(bundle);
        try {
            C1368X.m6320c().mo5839l().sendMessage(obtain);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void addPromotionApp(String str, String str2) {
        if (C1368X.m6324d()) {
            try {
                C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionAddPromotion(str, str2));
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }
}
