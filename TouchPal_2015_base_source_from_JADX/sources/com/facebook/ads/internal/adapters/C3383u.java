package com.facebook.ads.internal.adapters;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.internal.adapters.u */
class C3383u extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C3382t f14741a;

    C3383u(C3382t tVar) {
        this.f14741a = tVar;
    }

    public void onProgressChanged(WebView webView, int i) {
        if (i == 100 && this.f14741a.f14737h != null) {
            this.f14741a.f14737h.mo10627a(this.f14741a);
        }
    }
}
