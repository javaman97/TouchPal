package com.cootek.smartinput5.net.login;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.TWebView;
import com.cootek.smartinput5.net.cmd.C2240B;
import com.cootek.smartinput5.net.cmd.C2261Q;

public class GoogleLoginWebviewActivity extends C1976b {

    /* renamed from: a */
    public static final String f10202a = "token";

    /* renamed from: b */
    private static final String f10203b = "GoogleLoginWebviewActivity";

    /* renamed from: i */
    private static final String f10204i = "https://accounts.google.com/o/oauth2/auth?scope=email%20profile&redirect_uri=http://localhost&response_type=code&client_id=86843878091-a5sh71ndls2jbvngmkj6e5pm7n4hiv9h.apps.googleusercontent.com";

    /* renamed from: j */
    private static final int f10205j = 0;

    /* renamed from: k */
    private static final int f10206k = 1;

    /* renamed from: c */
    private Context f10207c;

    /* renamed from: d */
    private TWebView f10208d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ProgressDialog f10209e;

    /* renamed from: f */
    private C2373x f10210f;

    /* renamed from: g */
    private C2240B f10211g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f10212h = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f10213l = new C2334g(this);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10207c = this;
        C1368X.m6317b(this.f10207c);
        this.f10209e = new ProgressDialog(this.f10207c);
        this.f10209e.setProgressStyle(0);
        this.f10209e.setCanceledOnTouchOutside(false);
        this.f10209e.setOnCancelListener(new C2335h(this));
        this.f10208d = new TWebView(this.f10207c);
        this.f10208d.getSettings().setJavaScriptEnabled(true);
        this.f10208d.getSettings().setSavePassword(false);
        this.f10208d.setOnProgressCancelListener(new C2336i(this));
        TWebView tWebView = this.f10208d;
        TWebView tWebView2 = this.f10208d;
        tWebView2.getClass();
        tWebView.setWebViewClient(new C2337j(this, tWebView2));
        this.f10208d.mo7696a(f10204i);
        setContentView(this.f10208d);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f10208d != null) {
            if (this.f10208d.getParent() != null) {
                ((ViewGroup) this.f10208d.getParent()).removeAllViews();
            }
            this.f10208d.removeAllViews();
            this.f10208d.destroy();
            this.f10208d = null;
        }
        super.onDestroy();
        C1368X.m6325e();
        System.gc();
        System.exit(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m10629a(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(C2240B.f9479c)) {
            return false;
        }
        int indexOf = str.indexOf("?code=");
        if (indexOf != -1) {
            try {
                m10627a(str.substring(indexOf + 6).split(C2261Q.f9808n)[0]);
                webView.loadUrl("about:blank");
                return true;
            } catch (Exception e) {
                m10633b((String) null);
                return false;
            }
        } else {
            m10633b((String) null);
            return false;
        }
    }

    /* renamed from: a */
    private void m10627a(String str) {
        if (!this.f10212h) {
            this.f10212h = true;
            if (this.f10211g == null) {
                this.f10211g = new C2240B(str);
            } else {
                this.f10211g.mo7775a(str);
            }
            if (this.f10210f == null) {
                this.f10210f = new C2373x(this.f10211g);
            } else {
                this.f10210f.f10444a = this.f10211g;
            }
            this.f10213l.sendEmptyMessage(1);
            this.f10210f.mo8060a((C2373x.C2376b) new C2338k(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10625a() {
        m10628a(true, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10633b(String str) {
        m10628a(false, str);
    }

    /* renamed from: a */
    private void m10628a(boolean z, String str) {
        if (z) {
            setResult(0);
        } else {
            Intent intent = null;
            if (!TextUtils.isEmpty(str)) {
                intent = new Intent();
                intent.putExtra("token", str);
            }
            setResult(-1, intent);
        }
        finish();
    }
}
