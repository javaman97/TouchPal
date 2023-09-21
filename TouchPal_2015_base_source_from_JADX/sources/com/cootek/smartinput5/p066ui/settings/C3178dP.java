package com.cootek.smartinput5.p066ui.settings;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.ui.settings.dP */
/* compiled from: TouchPalFAQActivity */
class C3178dP extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ TouchPalFAQActivity f14233a;

    C3178dP(TouchPalFAQActivity touchPalFAQActivity) {
        this.f14233a = touchPalFAQActivity;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f14233a.f13755b.sendEmptyMessage(0);
        C1368X.m6320c().mo5825K().stop();
        C1368X.m6320c().mo5825K().setBlockJsInit(true);
        if (!this.f14233a.m14119a(str)) {
            this.f14233a.f13756c.getSettings().setBlockNetworkImage(true);
            this.f14233a.f13755b.removeMessages(2);
            this.f14233a.f13755b.sendEmptyMessageDelayed(2, 30000);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(WebView webView, String str) {
        C1368X.m6320c().mo5825K().setBlockJsInit(false);
        if (this.f14233a.m14119a(str)) {
            this.f14233a.f13756c.loadUrl("javascript:setReloadUrl(\"" + this.f14233a.f13757d + "\")");
        } else {
            this.f14233a.f13755b.removeMessages(2);
            this.f14233a.f13756c.getSettings().setBlockNetworkImage(false);
        }
        this.f14233a.f13755b.sendEmptyMessage(1);
        super.onPageFinished(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f14233a.m14120b();
        this.f14233a.f13755b.sendEmptyMessage(1);
    }
}
