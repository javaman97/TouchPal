package com.cootek.smartinput5.func.skin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.cootek.smartinput5.func.skin.g */
/* compiled from: SponsorThemeActivity */
class C1993g extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ SponsorThemeActivity f6837a;

    C1993g(SponsorThemeActivity sponsorThemeActivity) {
        this.f6837a = sponsorThemeActivity;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f6837a.f6827p.sendEmptyMessage(257);
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f6837a.f6827p.sendEmptyMessage(258);
        super.onPageFinished(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f6837a.f6827p.sendEmptyMessage(259);
        super.onReceivedError(webView, i, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("http")) {
            this.f6837a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
        this.f6837a.f6824m.loadUrl(str);
        return true;
    }
}
