package com.weibo.net;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.cmd.C2250J;
import com.emoji.keyboard.touchpal.R;

public class WeiboDialog extends C1976b {

    /* renamed from: a */
    static final FrameLayout.LayoutParams f16471a = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: h */
    private static final String f16472h = "Weibo-WebView";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4057s f16473b;

    /* renamed from: c */
    private String f16474c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4060v f16475d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressDialog f16476e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WebView f16477f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RelativeLayout f16478g;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16476e = new ProgressDialog(this);
        this.f16476e.requestWindowFeature(1);
        this.f16476e.setMessage(getResString(R.string.weibo_load_auth_web));
        requestWindowFeature(1);
        this.f16478g = new RelativeLayout(this);
        this.f16473b = C4057s.m17245a();
        this.f16475d = this.f16473b.mo15028g();
        this.f16474c = getIntent().getStringExtra("URL_OAUTH2");
        m17167a();
        addContentView(this.f16478g, new ViewGroup.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f16478g.removeAllViews();
        this.f16477f.removeAllViews();
        this.f16477f.removeAllViews();
        this.f16477f.destroy();
        this.f16477f = null;
        this.f16478g = null;
        System.gc();
    }

    /* renamed from: a */
    private void m17167a() {
        this.f16477f = new WebView(getApplicationContext());
        this.f16477f.clearCache(false);
        this.f16477f.clearHistory();
        this.f16477f.getSettings().setJavaScriptEnabled(true);
        this.f16477f.getSettings().setSupportZoom(true);
        this.f16477f.getSettings().setSaveFormData(false);
        this.f16477f.getSettings().setSavePassword(false);
        this.f16477f.getSettings().setBuiltInZoomControls(true);
        this.f16477f.setWebViewClient(new C4036a());
        this.f16477f.loadUrl(this.f16474c);
        this.f16477f.setLayoutParams(f16471a);
        this.f16477f.setVisibility(4);
        this.f16478g.addView(this.f16477f);
    }

    /* renamed from: com.weibo.net.WeiboDialog$a */
    private class C4036a extends WebViewClient {
        private C4036a() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C1017y.m5228d(WeiboDialog.f16472h, "Redirect URL: " + str);
            if (str.startsWith(WeiboDialog.this.f16473b.mo15027f())) {
                WeiboDialog.this.m17168a(webView, str);
                WeiboDialog.this.finish();
            } else {
                WeiboDialog.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
            return true;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WeiboDialog.this.f16475d.mo8262a(new C4042e(str, i, str2));
            WeiboDialog.this.finish();
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C1017y.m5228d(WeiboDialog.f16472h, "onPageStarted URL: " + str);
            if (str.startsWith(WeiboDialog.this.f16473b.mo15027f())) {
                WeiboDialog.this.m17168a(webView, str);
                webView.stopLoading();
                WeiboDialog.this.finish();
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            WeiboDialog.this.f16476e.setOnCancelListener(new C4059u(this));
            WeiboDialog.this.f16476e.show();
        }

        public void onPageFinished(WebView webView, String str) {
            C1017y.m5228d(WeiboDialog.f16472h, "onPageFinished URL: " + str);
            super.onPageFinished(webView, str);
            WeiboDialog.this.f16476e.dismiss();
            WeiboDialog.this.f16478g.setBackgroundColor(0);
            WeiboDialog.this.f16477f.setVisibility(0);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.proceed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17168a(WebView webView, String str) {
        Bundle b = C4054q.m17237b(str);
        String string = b.getString("error");
        String string2 = b.getString(C2250J.f9627c);
        if (string == null && string2 == null) {
            this.f16475d.mo8261a(b);
        } else if (string.equals("access_denied")) {
            this.f16475d.mo8260a();
        } else {
            this.f16475d.mo8263a(new C4061w(string, Integer.parseInt(string2)));
        }
    }
}
