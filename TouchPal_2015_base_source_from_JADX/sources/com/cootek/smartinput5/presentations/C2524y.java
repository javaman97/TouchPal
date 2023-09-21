package com.cootek.smartinput5.presentations;

import android.webkit.WebView;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.presentations.y */
/* compiled from: PresentationWebviewActivity */
class C2524y extends TWebView.C2195b {

    /* renamed from: a */
    final /* synthetic */ PresentationWebviewActivity f10866a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2524y(PresentationWebviewActivity presentationWebviewActivity, TWebView tWebView) {
        super();
        this.f10866a = presentationWebviewActivity;
        tWebView.getClass();
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f10866a.m11206b(str)) {
            this.f10866a.f10785a.loadUrl("javascript:setReloadUrl(\"" + this.f10866a.f10789g + "\")");
        }
        if (this.f10866a.f10792j) {
            this.f10866a.f10785a.mo7700d();
        }
        super.onPageFinished(webView, str);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f10866a.m11210e();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
