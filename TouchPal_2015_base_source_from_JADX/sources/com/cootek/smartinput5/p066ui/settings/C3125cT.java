package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.ui.settings.cT */
/* compiled from: SkinDownloadActivity */
class C3125cT implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TWebView f14139a;

    /* renamed from: b */
    final /* synthetic */ String f14140b;

    /* renamed from: c */
    final /* synthetic */ SkinDownloadActivity f14141c;

    C3125cT(SkinDownloadActivity skinDownloadActivity, TWebView tWebView, String str) {
        this.f14141c = skinDownloadActivity;
        this.f14139a = tWebView;
        this.f14140b = str;
    }

    public void run() {
        this.f14139a.mo7696a(this.f14140b);
    }
}
