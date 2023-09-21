package com.facebook.ads.internal.view;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.p077h.C3439h;

/* renamed from: com.facebook.ads.internal.view.b */
public class C3474b extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3476a f15073a;

    /* renamed from: com.facebook.ads.internal.view.b$a */
    public interface C3476a {
        /* renamed from: a */
        void mo10608a();

        /* renamed from: a */
        void mo10609a(int i);

        /* renamed from: a */
        void mo10610a(String str);
    }

    /* renamed from: com.facebook.ads.internal.view.b$b */
    private class C3477b extends WebViewClient {
        private C3477b() {
        }

        public void onLoadResource(WebView webView, String str) {
            C3474b.this.f15073a.mo10608a();
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (C3439h.m15069a()) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C3474b.this.f15073a.mo10610a(str);
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b$c */
    public static class C3478c {

        /* renamed from: a */
        private static final String f15075a = C3478c.class.getSimpleName();
    }

    public C3474b(Context context, C3476a aVar) {
        super(context);
        this.f15073a = aVar;
        m15187a();
    }

    /* renamed from: a */
    private void m15187a() {
        setWebViewClient(new C3477b());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        addJavascriptInterface(new C3478c(), "AdControl");
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f15073a != null) {
            this.f15073a.mo10609a(i);
        }
    }
}
