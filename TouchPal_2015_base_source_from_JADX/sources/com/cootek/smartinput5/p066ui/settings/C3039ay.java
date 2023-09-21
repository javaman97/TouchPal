package com.cootek.smartinput5.p066ui.settings;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.ay */
/* compiled from: GetMoreSkinFragment */
public class C3039ay extends C3041b {

    /* renamed from: b */
    private static final int f13956b = 0;

    /* renamed from: c */
    private static final int f13957c = 1;

    /* renamed from: d */
    private static final int f13958d = 2;

    /* renamed from: e */
    private static final String f13959e = "network_error.html";

    /* renamed from: f */
    private static final int f13960f = 30000;

    /* renamed from: g */
    private static final String f13961g = "/POPULAR_SKIN_CACHE";

    /* renamed from: a */
    private final String f13962a = "PopularSkin";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f13963h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f13964i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f13965j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public TWebView f13966k;

    /* renamed from: l */
    private LinearLayout f13967l = null;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f13968m = true;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public View f13969n;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13965j = f13960f;
        this.f13963h = new C3040az(this);
    }

    /* renamed from: a */
    private View m14273a(LayoutInflater layoutInflater) {
        if (layoutInflater == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.get_more_skin, (ViewGroup) null, false);
        this.f13967l = (LinearLayout) inflate.findViewById(R.id.popular_frame);
        return inflate;
    }

    public void onResume() {
        mo9982b();
        C1368X.m6320c().mo5827M().mo5998d(3);
        C1368X.m6320c().mo5825K().updateServiceInfo(getActivity());
        C1368X.m6320c().mo5825K().updateResult();
        super.onResume();
    }

    public void onStop() {
        C1368X.m6320c().mo5827M().mo5998d(2);
        super.onStop();
    }

    public void onDestroy() {
        C1368X.m6320c().mo5825K().setWebView((WebView) null);
        C1368X.m6320c().mo5825K().stopShareSDK();
        this.f13963h = null;
        if (this.f13966k != null) {
            ((ViewGroup) this.f13966k.getParent()).removeAllViews();
            this.f13966k.removeAllViews();
            this.f13966k.destroy();
            this.f13966k = null;
        }
        super.onDestroy();
    }

    /* renamed from: e */
    private void m14287e() {
        if (this.f13966k != null) {
            this.f13966k.getSettings().setSavePassword(false);
            this.f13966k.getSettings().setJavaScriptEnabled(true);
            this.f13966k.setScrollBarStyle(0);
            this.f13966k.getSettings().setDefaultTextEncodingName("utf-8");
            this.f13966k.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            this.f13966k.requestFocus(130);
            m14275a(this.f13966k.getSettings());
            this.f13966k.setWebPageStatusListener(new C2985aA(this));
            this.f13966k.setOnTouchListener(new C2986aB(this));
            this.f13966k.setWebChromeClient(new C2987aC(this));
            this.f13966k.setWebViewClient(new C2988aD(this));
            m14289f();
        }
    }

    @TargetApi(7)
    /* renamed from: f */
    private void m14289f() {
        String absolutePath = getActivity().getFilesDir().getAbsolutePath();
        this.f13966k.getSettings().setAppCacheEnabled(true);
        if (Build.VERSION.SDK_INT >= 7) {
            this.f13966k.getSettings().setAppCachePath(absolutePath + f13961g);
        }
        this.f13966k.getSettings().setCacheMode(-1);
    }

    /* renamed from: g */
    private void m14290g() {
        m14287e();
        String h = m14292h();
        this.f13964i = h;
        m14278a(h);
    }

    /* renamed from: h */
    private String m14292h() {
        return C1132b.m5654a((Context) getActivity()).mo4402a(C1135d.WEBVIEW_URL_POPULAR_SKIN, C2225al.m10054a((Context) getActivity(), C1974m.m9063a((Context) getActivity(), (int) R.string.popular_skin_page_url)));
    }

    @TargetApi(7)
    /* renamed from: a */
    private void m14275a(WebSettings webSettings) {
        if (Build.VERSION.SDK_INT >= 7) {
            webSettings.setDomStorageEnabled(true);
            webSettings.setLoadWithOverviewMode(true);
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
    public void m14276a(WebView webView, String str) {
        if (this.f13966k != null) {
            this.f13966k.loadUrl("javascript:if(window.onPageFinished){onPageFinished();}");
        }
    }

    /* renamed from: a */
    private void m14278a(String str) {
        if (this.f13966k != null) {
            C1368X.m6320c().mo5825K().setWebView((WebView) null);
            C1368X.m6320c().mo5825K().setWebView(this.f13966k);
            C1368X.m6320c().mo5825K().setActivity(getActivity());
            m14282b(this.f13966k, str);
        }
    }

    /* renamed from: b */
    private void m14282b(WebView webView, String str) {
        webView.loadUrl(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m14283b(String str) {
        if (TextUtils.isEmpty(str) && this.f13966k != null) {
            str = this.f13966k.getUrl();
        }
        return !TextUtils.isEmpty(str) && str.indexOf(m14294j()) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m14293i() {
        if (this.f13966k != null) {
            this.f13966k.loadUrl(m14294j());
            this.f13966k.loadUrl("javascript:setReloadUrl(\"" + this.f13964i + "\")");
        }
    }

    /* renamed from: j */
    private String m14294j() {
        return C1460o.m6799b().mo6105d(getActivity(), f13959e);
    }

    /* renamed from: d */
    public void mo10146d() {
        if (this.f13966k != null) {
            this.f13966k.loadUrl("javascript:onTabScrolled()");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo10077c() {
        if (!C1368X.m6324d()) {
            return null;
        }
        C1368X.m6320c().mo5841n().mo6268d();
        return null;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo10076a(Object obj) {
        this.f13969n = m14273a(mo10148a());
        if (this.f13967l != null) {
            this.f13966k = new TWebView(getActivity());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            if (Build.VERSION.SDK_INT >= 9) {
                this.f13966k.setOverScrollMode(2);
            }
            this.f13967l.addView(this.f13966k, layoutParams);
            m14290g();
        }
    }
}
