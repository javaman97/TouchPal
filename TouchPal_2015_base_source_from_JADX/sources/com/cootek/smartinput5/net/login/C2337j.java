package com.cootek.smartinput5.net.login;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.net.login.j */
/* compiled from: GoogleLoginWebviewActivity */
class C2337j extends TWebView.C2195b {

    /* renamed from: a */
    final /* synthetic */ GoogleLoginWebviewActivity f10299a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2337j(GoogleLoginWebviewActivity googleLoginWebviewActivity, TWebView tWebView) {
        super();
        this.f10299a = googleLoginWebviewActivity;
        tWebView.getClass();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f10299a.m10629a(webView, str)) {
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!this.f10299a.m10629a(webView, str)) {
            super.onPageStarted(webView, str, bitmap);
        }
    }
}
