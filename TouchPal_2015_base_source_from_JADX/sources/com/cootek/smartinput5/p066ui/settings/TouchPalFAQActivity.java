package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.nativeads.NativeAdsJsHandler;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.TouchPalFAQActivity */
public class TouchPalFAQActivity extends C1976b {

    /* renamed from: f */
    private static final String f13749f = "network_error.html";

    /* renamed from: g */
    private static final int f13750g = 30000;

    /* renamed from: h */
    private static final int f13751h = 0;

    /* renamed from: i */
    private static final int f13752i = 1;

    /* renamed from: j */
    private static final int f13753j = 2;

    /* renamed from: a */
    ProgressDialog f13754a;

    /* renamed from: b */
    Handler f13755b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WebView f13756c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f13757d;

    /* renamed from: e */
    private View f13758e;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1368X.m6317b((Context) this);
        requestWindowFeature(1);
        setContentView(R.layout.faq_layout);
        this.f13755b = new C3177dO(this);
        m14116a();
    }

    public void onDestroy() {
        this.f13755b = null;
        if (this.f13754a.isShowing()) {
            this.f13754a.dismiss();
        }
        this.f13754a = null;
        ((ViewGroup) this.f13756c.getParent()).removeAllViews();
        this.f13756c.removeAllViews();
        this.f13756c.destroy();
        this.f13756c = null;
        super.onDestroy();
        C1368X.m6325e();
    }

    /* renamed from: a */
    private void m14116a() {
        this.f13756c = (WebView) findViewById(R.id.faq_webview);
        this.f13756c.setScrollBarStyle(0);
        this.f13756c.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        this.f13756c.getSettings().setJavaScriptEnabled(true);
        m14117a(this.f13756c.getSettings());
        NativeAdsJsHandler.getInstance().setWebView(this.f13756c);
        this.f13756c.addJavascriptInterface(NativeAdsJsHandler.getInstance(), "CTKNativeAds");
        this.f13756c.setWebViewClient(new C3178dP(this));
        this.f13754a = new ProgressDialog(this);
        this.f13754a.setProgressStyle(0);
        this.f13754a.setMessage(getResString(R.string.loading));
        this.f13754a.setCanceledOnTouchOutside(false);
        this.f13758e = findViewById(R.id.faq_back_btn);
        this.f13758e.setOnClickListener(new C3179dQ(this));
        C1368X.m6320c().mo5825K().setWebView(this.f13756c, false);
        C1368X.m6320c().mo5825K().setActivity(this);
        this.f13757d = C1974m.m9063a((Context) this, (int) R.string.faq_url);
        this.f13757d = C2225al.m10054a((Context) this, this.f13757d);
        this.f13757d = C1132b.m5654a((Context) this).mo4402a(C1135d.WEBVIEW_URL_FAQ, this.f13757d);
        this.f13756c.loadUrl(this.f13757d);
    }

    @TargetApi(7)
    /* renamed from: a */
    private void m14117a(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 7) {
            webSettings.setDomStorageEnabled(true);
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
    /* renamed from: b */
    public void m14120b() {
        if (this.f13756c != null) {
            this.f13756c.loadUrl(m14122c());
            this.f13756c.loadUrl("javascript:setReloadUrl(\"" + this.f13757d + "\")");
        }
    }

    /* renamed from: c */
    private String m14122c() {
        return C1460o.m6799b().mo6105d(this, f13749f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m14119a(String str) {
        if (TextUtils.isEmpty(str) && this.f13756c != null) {
            str = this.f13756c.getUrl();
        }
        return !TextUtils.isEmpty(str) && str.indexOf(m14122c()) == 0;
    }
}
