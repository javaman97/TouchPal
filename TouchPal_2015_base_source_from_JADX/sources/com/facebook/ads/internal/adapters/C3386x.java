package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.ads.internal.p077h.C3451q;
import com.facebook.ads.internal.p077h.C3456v;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.x */
public class C3386x extends C3368h {

    /* renamed from: b */
    private final WebView f14754b;

    /* renamed from: c */
    private C3385w f14755c;

    /* renamed from: d */
    private boolean f14756d;

    public C3386x(Context context, WebView webView, C3369i iVar) {
        super(context, iVar);
        this.f14754b = webView;
    }

    /* renamed from: a */
    private void m14896a(Map<String, String> map) {
        if (this.f14755c != null) {
            String f = this.f14755c.mo10647f();
            if (!C3456v.m15103a(f)) {
                new C3451q(map).execute(new String[]{f});
            }
        }
    }

    /* renamed from: a */
    public void mo10652a(C3385w wVar) {
        this.f14755c = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10637b() {
        if (this.f14755c != null) {
            if (this.f14754b != null && !C3456v.m15103a(this.f14755c.mo10648g())) {
                this.f14754b.loadUrl("javascript:" + this.f14755c.mo10648g());
            }
            m14896a((Map<String, String>) Collections.singletonMap("evt", "native_imp"));
        }
    }

    /* renamed from: c */
    public synchronized void mo10653c() {
        if (!this.f14756d && this.f14755c != null) {
            this.f14756d = true;
            if (this.f14754b != null && !C3456v.m15103a(this.f14755c.mo10646e())) {
                this.f14754b.loadUrl("javascript:" + this.f14755c.mo10646e());
            }
        }
    }

    /* renamed from: d */
    public void mo10654d() {
        m14896a((Map<String, String>) Collections.singletonMap("evt", "interstitial_displayed"));
    }
}
