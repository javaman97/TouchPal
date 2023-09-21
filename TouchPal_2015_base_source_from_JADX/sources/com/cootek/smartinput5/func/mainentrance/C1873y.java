package com.cootek.smartinput5.func.mainentrance;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.cootek.smartinput5.func.mainentrance.y */
/* compiled from: WebViewProvider */
class C1873y extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C1872x f6251a;

    C1873y(C1872x xVar) {
        this.f6251a = xVar;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f6251a.m8607b(str)) {
            this.f6251a.f6247b.loadUrl(this.f6251a.m8610d());
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.equals(str, this.f6251a.f6250e)) {
            this.f6251a.f6247b.loadUrl(str);
            return true;
        }
        try {
            this.f6251a.f6246a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (ActivityNotFoundException e) {
            return true;
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f6251a.m8613f();
    }
}
