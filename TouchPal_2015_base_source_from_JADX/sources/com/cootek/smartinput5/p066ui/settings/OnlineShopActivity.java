package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cootek.smartinput5.action.ActionCollectData;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.asset.C1446c;
import com.cootek.smartinput5.func.asset.C1451h;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.OnlineShopActivity */
public class OnlineShopActivity extends C1976b implements C1730E.C1731a {

    /* renamed from: A */
    private static final int f13549A = 30000;

    /* renamed from: E */
    private static final int f13550E = 0;

    /* renamed from: F */
    private static final int f13551F = 1;

    /* renamed from: G */
    private static final int f13552G = 2;

    /* renamed from: H */
    private static final int f13553H = 0;

    /* renamed from: a */
    public static final String f13554a = "OnlineShopActivity.EXTRA_START_PAGE";

    /* renamed from: b */
    public static final String f13555b = "OnlineShopActivity.EXTRA_SOURCE";

    /* renamed from: c */
    public static final String f13556c = "OnlineShopActivity.EXTRA_PKG_NAME";

    /* renamed from: d */
    public static final String f13557d = "OnlineShopActivity.EXTRA_TAG";

    /* renamed from: e */
    public static final String f13558e = "source_more_shop";

    /* renamed from: f */
    public static final String f13559f = "source_more_cell";

    /* renamed from: g */
    public static final String f13560g = "source_more_language";

    /* renamed from: h */
    public static final String f13561h = "source_more_skin";

    /* renamed from: i */
    public static final String f13562i = "source_quick_skin_more";

    /* renamed from: j */
    public static final String f13563j = "source_setting_skin_more";

    /* renamed from: k */
    public static final String f13564k = "source_skin_update_dialog";

    /* renamed from: l */
    public static final String f13565l = "source_emoji_button";

    /* renamed from: m */
    public static final String f13566m = "source_purchase_vip_success_dialog";

    /* renamed from: n */
    public static final String f13567n = "source_presentation_default";

    /* renamed from: o */
    public static final String f13568o = "source_presentation_skin";

    /* renamed from: p */
    public static final String f13569p = "source_presentation_language";

    /* renamed from: q */
    public static final String f13570q = "source_presentation_cell";

    /* renamed from: r */
    public static final String f13571r = "source_presentation_more";

    /* renamed from: s */
    public static final String f13572s = "source_setting_cell_more";

    /* renamed from: t */
    public static final String f13573t = "source_emoji_style_choose";

    /* renamed from: z */
    private static final String f13574z = "network_error.html";
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f13575B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f13576C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long f13577D;

    /* renamed from: I */
    private boolean f13578I = false;

    /* renamed from: u */
    TWebView f13579u;

    /* renamed from: v */
    ProgressDialog f13580v;

    /* renamed from: w */
    Handler f13581w;

    /* renamed from: x */
    String f13582x;

    /* renamed from: y */
    private final String f13583y = "shopActivity";

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        try {
            C1368X.m6317b((Context) this);
            C1368X.m6320c().mo5827M().mo5991a(true);
            this.f13575B = C1132b.m5654a((Context) this).mo4397a(C1135d.ONLINE_SHOP_WEBVIEW_TIMEOUT, Integer.valueOf(f13549A)).intValue();
            this.f13581w = new C3053bJ(this);
            setContentView(R.layout.online_shop);
            m13901a(getIntent().getIntExtra(f13554a, 0), getIntent().getStringExtra(f13555b), getIntent().getStringExtra(f13556c), getIntent().getStringExtra(f13557d));
        } catch (C1451h e) {
            e.printStackTrace();
            C1446c.m6745a(this);
            this.f13578I = true;
        }
    }

    /* renamed from: a */
    private void m13901a(int i, String str, String str2, String str3) {
        m13912b();
        String b = m13911b(i, str, str2, str3);
        this.f13582x = b;
        m13906a(b);
    }

    /* renamed from: b */
    private String m13911b(int i, String str, String str2, String str3) {
        String a;
        int i2;
        if (C1593bR.m7162a().f5075a) {
            a = C1132b.m5654a((Context) this).mo4402a(C1135d.WEBVIEW_URL_ONLINE_SHOP_INTERNATIONAL, C2225al.m10054a((Context) this, getResString(R.string.webview_url_online_shop_international)));
        } else {
            a = C1132b.m5654a((Context) this).mo4402a(C1135d.WEBVIEW_URL_ONLINE_SHOP_MAINLAND, C2225al.m10054a((Context) this, getResString(R.string.webview_url_online_shop_mainland)));
        }
        String str4 = (a + "#") + "startPageIndex=" + i;
        if (!TextUtils.isEmpty(str)) {
            str4 = str4 + "&source=" + str;
        }
        if (!TextUtils.isEmpty(str2)) {
            str4 = str4 + "&pkg_name=" + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            str4 = str4 + "&tag=" + str3;
        }
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = getResources().getDisplayMetrics().heightPixels - i2;
        float f = this.f13579u.getResources().getDisplayMetrics().density;
        return str4 + String.format("&width=%d&height=%d", new Object[]{Integer.valueOf((int) (((float) i3) / f)), Integer.valueOf((int) (((float) i4) / f))});
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (!this.f13578I) {
            C1368X.m6320c().mo5825K().setWebView((WebView) null);
            C1368X.m6320c().mo5825K().stopShareSDK();
            this.f13581w = null;
            if (this.f13580v.isShowing()) {
                this.f13580v.dismiss();
            }
            this.f13580v = null;
            ((ViewGroup) this.f13579u.getParent()).removeAllViews();
            this.f13579u.removeAllViews();
            this.f13579u.destroy();
            this.f13579u = null;
            C1368X.m6296a(false);
            System.gc();
            System.exit(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (!this.f13578I) {
            C1368X.m6320c().mo5827M().mo5998d(2);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!this.f13578I) {
            C1368X.m6320c().mo5825K().setCurrentPageIndex(intent.getIntExtra(f13554a, -1));
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        if (!this.f13578I) {
            C1368X.m6320c().mo5825K().setNeedRefresh();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f13578I) {
            C1368X.m6320c().mo5842o().mo5977x();
            C1368X.m6320c().mo5827M().mo5998d(3);
            C1368X.m6320c().mo5825K().updateServiceInfo(this);
            C1368X.m6320c().mo5825K().updateResult();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (this.f13578I) {
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f13578I) {
            return false;
        }
        if (keyEvent.isTracking() && i == 4 && !m13914b((String) null)) {
            if (C1368X.m6320c().mo5825K().hasStarted()) {
                this.f13579u.loadUrl("javascript:onKeycode(0)");
                return true;
            } else if (this.f13579u.canGoBack()) {
                this.f13579u.goBack();
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
    }

    /* renamed from: b */
    private void m13912b() {
        this.f13579u = (TWebView) findViewById(R.id.online_shop_view);
        this.f13579u.getSettings().setSavePassword(false);
        this.f13579u.getSettings().setJavaScriptEnabled(true);
        this.f13579u.setScrollBarStyle(0);
        this.f13579u.getSettings().setDefaultTextEncodingName("utf-8");
        this.f13579u.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f13579u.requestFocus(130);
        m13902a(this.f13579u.getSettings(), this.f13579u.getContext());
        this.f13579u.setOnTouchListener(new C3054bK(this));
        this.f13579u.setWebChromeClient(new C3055bL(this));
        this.f13579u.setWebViewClient(new C3056bM(this));
        this.f13580v = new ProgressDialog(this);
        this.f13580v.setProgressStyle(0);
        this.f13580v.setMessage(getResString(R.string.loading));
        this.f13580v.setCanceledOnTouchOutside(false);
    }

    @TargetApi(7)
    /* renamed from: a */
    private void m13902a(WebSettings webSettings, Context context) {
        if (Build.VERSION.SDK_INT >= 7) {
            webSettings.setDomStorageEnabled(true);
            webSettings.setLoadWithOverviewMode(true);
            if (context.getCacheDir() != null) {
                webSettings.setAppCacheEnabled(true);
                webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            }
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Class<WebView> cls = WebView.class;
            try {
                cls.getMethod("setWebContentsDebuggingEnabled", new Class[]{Boolean.TYPE}).invoke((Object) null, new Object[]{true});
            } catch (Exception e) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13903a(WebView webView, String str) {
        if (this.f13579u != null) {
            this.f13579u.loadUrl("javascript:if(window.onPageFinished){onPageFinished();}");
        }
    }

    /* renamed from: a */
    private void m13906a(String str) {
        C1368X.m6320c().mo5825K().setWebView((WebView) null);
        C1368X.m6320c().mo5825K().setWebView(this.f13579u);
        C1368X.m6320c().mo5825K().setActivity(this);
        m13913b(this.f13579u, str);
    }

    /* renamed from: b */
    private void m13913b(WebView webView, String str) {
        webView.loadUrl(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m13914b(String str) {
        if (TextUtils.isEmpty(str) && this.f13579u != null) {
            str = this.f13579u.getUrl();
        }
        return !TextUtils.isEmpty(str) && str.indexOf(m13918d()) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13915c() {
        if (this.f13579u != null) {
            this.f13579u.loadUrl(m13918d());
            this.f13579u.loadUrl("javascript:setReloadUrl(\"" + this.f13582x + "\")");
        }
    }

    /* renamed from: d */
    private String m13918d() {
        return C1460o.m6799b().mo6105d(this, f13574z);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f13578I) {
            C1368X.m6320c().mo5825K().onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: a */
    public int mo6691a() {
        return 0;
    }

    /* renamed from: a */
    private void m13907a(String str, String str2, String str3) {
        if (C1368X.m6324d()) {
            try {
                C1368X.m6320c().mo5839l().sendMessageForParcelableAction(new ActionCollectData(str, str2, str3, 1));
            } catch (RemoteException e) {
            }
        }
    }
}
