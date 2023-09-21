package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.k */
/* compiled from: TranslationSearchFragment */
class C2156k extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C2153h f9156a;

    C2156k(C2153h hVar) {
        this.f9156a = hVar;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f9156a.f9151j.sendEmptyMessage(1);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f9156a.f9151j.sendEmptyMessage(2);
        boolean unused = this.f9156a.f9152k = true;
        if (!TextUtils.isEmpty(this.f9156a.f9153l)) {
            this.f9156a.m9736a(this.f9156a.f9153l);
        }
    }
}
