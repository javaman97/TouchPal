package com.cootek.smartinput5.presentations;

import android.webkit.WebView;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.presentations.x */
/* compiled from: PresentationWebviewActivity */
class C2523x extends TWebView.C2194a {

    /* renamed from: b */
    final /* synthetic */ PresentationWebviewActivity f10865b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2523x(PresentationWebviewActivity presentationWebviewActivity, TWebView tWebView) {
        super();
        this.f10865b = presentationWebviewActivity;
        tWebView.getClass();
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (i == 100) {
            this.f10865b.m11197a(2);
        }
    }
}
