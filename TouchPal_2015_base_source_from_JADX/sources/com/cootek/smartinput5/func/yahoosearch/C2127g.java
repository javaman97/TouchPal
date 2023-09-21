package com.cootek.smartinput5.func.yahoosearch;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.g */
/* compiled from: BrowserActivity */
class C2127g extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f9071a;

    C2127g(BrowserActivity browserActivity) {
        this.f9071a = browserActivity;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f9071a.f9033A.sendEmptyMessage(0);
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f9071a.f9033A.sendEmptyMessage(1);
        super.onPageFinished(webView, str);
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f9071a.f9033A.sendEmptyMessage(2);
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("http")) {
            return false;
        }
        this.f9071a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return true;
    }
}
