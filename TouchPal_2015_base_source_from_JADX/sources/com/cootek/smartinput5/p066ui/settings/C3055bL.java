package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.cootek.smartinput5.ui.settings.bL */
/* compiled from: OnlineShopActivity */
class C3055bL extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ OnlineShopActivity f14003a;

    C3055bL(OnlineShopActivity onlineShopActivity) {
        this.f14003a = onlineShopActivity;
    }

    public void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
        }
        super.onProgressChanged(webView, i);
    }

    @TargetApi(8)
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        super.onConsoleMessage(consoleMessage);
        return true;
    }
}
