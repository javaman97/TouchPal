package com.cootek.smartinput5.func.yahoosearch;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.yahoosearch.p063ui.SearchBarScrollFrame;
import com.cootek.smartinput5.func.yahoosearch.p063ui.SearchBrowserWebView;
import com.cootek.smartinput5.func.yahoosearch.p063ui.SearchTabView;
import com.cootek.smartinput5.p048d.C1246d;
import com.emoji.keyboard.touchpal.R;

public class BrowserActivity extends C2135o implements SearchBrowserWebView.C2142a {

    /* renamed from: a */
    public static final String f9027a = "WEB_URL";

    /* renamed from: b */
    public static final String f9028b = "SEARCH_REFERER";

    /* renamed from: c */
    private static final int f9029c = 0;

    /* renamed from: m */
    private static final int f9030m = 1;

    /* renamed from: n */
    private static final int f9031n = 2;

    /* renamed from: y */
    private static int f9032y;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Handler f9033A = new C2121a(this);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f9034o = "";
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TextView f9035p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public SearchBrowserWebView f9036q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ProgressBar f9037r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SearchBarScrollFrame f9038s;

    /* renamed from: t */
    private SearchTabView f9039t;

    /* renamed from: u */
    private SearchTabView f9040u;

    /* renamed from: v */
    private SearchTabView f9041v;

    /* renamed from: w */
    private SearchTabView f9042w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f9043x = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f9044z = 0;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(7);
        setContentView(R.layout.browser_layout);
        getWindow().setFeatureInt(7, R.layout.browser_activity_title);
        C1368X.m6317b((Context) this);
        C2137q.m9700a((Context) this).mo7537a((Activity) this);
        this.f9037r = (ProgressBar) findViewById(R.id.webview_progress);
        f9032y = getResources().getDimensionPixelOffset(R.dimen.search_bar_height);
        m9680d();
        mo7502a();
        m9677c();
        m9682e();
    }

    @TargetApi(11)
    public void onPause() {
        super.onPause();
        this.f9036q.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7502a() {
        this.f9038s = (SearchBarScrollFrame) findViewById(R.id.browser_button_frame);
        super.mo7502a();
    }

    /* renamed from: c */
    private void m9677c() {
        this.f9040u = (SearchTabView) this.f9038s.findViewWithTag("back");
        this.f9040u.setOnClickListener(new C2122b(this));
        this.f9039t = (SearchTabView) this.f9038s.findViewWithTag("share");
        this.f9039t.setOnClickListener(new C2123c(this));
        this.f9041v = (SearchTabView) this.f9038s.findViewWithTag(C1246d.f3816bg);
        this.f9041v.setOnClickListener(new C2124d(this));
        this.f9042w = (SearchTabView) this.f9038s.findViewWithTag("save");
        this.f9042w.setOnClickListener(new C2125e(this));
        this.f9042w.setEnabled(false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: d */
    private void m9680d() {
        this.f9036q = (SearchBrowserWebView) findViewById(R.id.browser_webview);
        this.f9036q.getSettings().setCacheMode(-1);
        this.f9036q.getSettings().setJavaScriptEnabled(true);
        this.f9036q.setWebChromeClient(new C2126f(this));
        this.f9036q.setWebViewClient(new C2127g(this));
        this.f9036q.setScrollChangeListener(this);
    }

    /* renamed from: e */
    private void m9682e() {
        String stringExtra = getIntent().getStringExtra(f9027a);
        if (!TextUtils.isEmpty(stringExtra) && this.f9036q != null) {
            this.f9036q.stopLoading();
            this.f9036q.clearHistory();
            this.f9036q.loadUrl(stringExtra);
            this.f9036q.clearHistory();
            C1246d.m6010a((Context) this).mo4594a(C1246d.f3925ds, true, C1246d.f3923dq);
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m9682e();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m9683f() {
        this.f9042w.setEnabled(this.f9043x);
    }

    /* renamed from: a */
    public void mo7503a(int i) {
        if (this.f9044z + i > f9032y) {
            i = f9032y - this.f9044z;
        }
        if (this.f9044z + i < 0) {
            i = -this.f9044z;
        }
        this.f9044z += i;
        this.f9038s.scrollTo(0, -this.f9044z);
    }

    /* renamed from: b */
    public void mo7504b() {
        m9686g();
    }

    /* renamed from: g */
    private void m9686g() {
        if (this.f9044z > f9032y / 2) {
            this.f9044z = f9032y;
            this.f9038s.mo7559a(0, -f9032y);
            return;
        }
        this.f9044z = 0;
        this.f9038s.mo7559a(0, 0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f9036q.canGoBack()) {
            this.f9036q.goBack();
        } else {
            finish();
        }
        return false;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.search_open, R.anim.search_close);
    }

    public void onDestroy() {
        super.onDestroy();
        C1368X.m6325e();
    }
}
