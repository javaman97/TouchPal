package com.cootek.smartinput5.func;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.cootek.smartinput5.func.resource.p055ui.C1976b;
import com.emoji.keyboard.touchpal.R;

public class WebPageLoader extends C1976b {

    /* renamed from: a */
    public static final String f4242a = "webpageUrl";

    /* renamed from: b */
    private String f4243b = null;

    /* renamed from: c */
    private WebView f4244c;

    /* renamed from: a */
    private void m6277a() {
        this.f4243b = getIntent().getStringExtra(f4242a);
    }

    /* renamed from: b */
    private void m6278b() {
        this.f4244c = (WebView) findViewById(R.id.webpage);
        WebSettings settings = this.f4244c.getSettings();
        settings.setCacheMode(-1);
        settings.setJavaScriptEnabled(true);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.webpage_loader);
        m6278b();
        m6277a();
        this.f4244c.loadUrl(this.f4243b);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        System.exit(0);
        super.onDestroy();
    }
}
