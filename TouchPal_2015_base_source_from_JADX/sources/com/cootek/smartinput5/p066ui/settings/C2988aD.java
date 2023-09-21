package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2228ao;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.settings.aD */
/* compiled from: GetMoreSkinFragment */
class C2988aD extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C3039ay f13812a;

    C2988aD(C3039ay ayVar) {
        this.f13812a = ayVar;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (str.startsWith("log://")) {
            webView.stopLoading();
        }
        C1368X.m6320c().mo5825K().stop();
        C1368X.m6320c().mo5825K().setBlockJsInit(true);
        if (!this.f13812a.m14283b(str)) {
            this.f13812a.f13963h.sendEmptyMessage(0);
            this.f13812a.f13966k.getSettings().setBlockNetworkImage(true);
            this.f13812a.f13963h.removeMessages(2);
            this.f13812a.f13963h.sendEmptyMessageDelayed(2, (long) this.f13812a.f13965j);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(WebView webView, String str) {
        C1368X.m6320c().mo5825K().setBlockJsInit(false);
        if (this.f13812a.m14283b(str)) {
            this.f13812a.f13966k.loadUrl("javascript:setReloadUrl(\"" + this.f13812a.f13964i + "\")");
            this.f13812a.f13963h.sendEmptyMessage(1);
        } else {
            this.f13812a.f13966k.getSettings().setBlockNetworkImage(false);
            this.f13812a.m14276a(webView, str);
            if (this.f13812a.f13968m) {
                this.f13812a.f13963h.sendEmptyMessage(1);
                this.f13812a.f13963h.removeMessages(2);
            }
        }
        super.onPageFinished(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("http")) {
            this.f13812a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
        this.f13812a.f13966k.loadUrl(str);
        return true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f13812a.m14293i();
        this.f13812a.f13963h.sendEmptyMessage(1);
        C1246d.m6010a((Context) this.f13812a.getActivity()).mo4594a(C1246d.f3852cP, true, C1246d.f3842cF);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = C2228ao.m10094a().mo7755a(webView.getContext(), Uri.parse(str).getLastPathSegment());
        return a != null ? a : super.shouldInterceptRequest(webView, str);
    }
}
