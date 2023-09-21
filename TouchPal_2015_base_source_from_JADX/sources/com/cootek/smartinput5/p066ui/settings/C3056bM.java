package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.net.C2228ao;

/* renamed from: com.cootek.smartinput5.ui.settings.bM */
/* compiled from: OnlineShopActivity */
class C3056bM extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ OnlineShopActivity f14004a;

    C3056bM(OnlineShopActivity onlineShopActivity) {
        this.f14004a = onlineShopActivity;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        boolean unused = this.f14004a.f13576C = true;
        long unused2 = this.f14004a.f13577D = System.currentTimeMillis();
        if (str.startsWith("log://")) {
            webView.stopLoading();
        }
        C1368X.m6320c().mo5825K().stop();
        C1368X.m6320c().mo5825K().setBlockJsInit(true);
        if (!this.f14004a.m13914b(str)) {
            this.f14004a.f13581w.sendEmptyMessage(0);
            this.f14004a.f13579u.getSettings().setBlockNetworkImage(true);
            this.f14004a.f13581w.removeMessages(2);
            this.f14004a.f13581w.sendEmptyMessageDelayed(2, (long) this.f14004a.f13575B);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f14004a.f13576C) {
            boolean unused = this.f14004a.f13576C = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f14004a.f13577D;
            long unused2 = this.f14004a.f13577D = 0;
            try {
                C2228ao.m10094a().mo7756a(str, C1466av.f4697f);
            } catch (Exception e) {
            }
            this.f14004a.m13903a(webView, str);
        }
        C1368X.m6320c().mo5825K().setBlockJsInit(false);
        if (this.f14004a.m13914b(str)) {
            this.f14004a.f13581w.sendEmptyMessage(1);
            this.f14004a.f13579u.loadUrl("javascript:setReloadUrl(\"" + this.f14004a.f13582x + "\")");
        } else {
            this.f14004a.f13579u.getSettings().setBlockNetworkImage(false);
            this.f14004a.f13581w.sendEmptyMessage(1);
            this.f14004a.f13581w.removeMessages(2);
        }
        super.onPageFinished(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("http")) {
            try {
                this.f14004a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (ActivityNotFoundException e) {
                return true;
            }
        } else {
            this.f14004a.f13579u.loadUrl(str);
            return true;
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f14004a.m13915c();
        this.f14004a.f13581w.sendEmptyMessage(1);
    }

    public void onLoadResource(WebView webView, String str) {
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a = C2228ao.m10094a().mo7755a(webView.getContext(), Uri.parse(str).getLastPathSegment());
        return a != null ? a : super.shouldInterceptRequest(webView, str);
    }
}
