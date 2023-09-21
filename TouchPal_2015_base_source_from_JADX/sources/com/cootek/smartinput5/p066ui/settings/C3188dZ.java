package com.cootek.smartinput5.p066ui.settings;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.ui.settings.dZ */
/* compiled from: TypingSpeedActivity */
class C3188dZ extends TWebView.C2195b {

    /* renamed from: a */
    final /* synthetic */ TypingSpeedActivity f14244a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3188dZ(TypingSpeedActivity typingSpeedActivity, TWebView tWebView) {
        super();
        this.f14244a = typingSpeedActivity;
        tWebView.getClass();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (Uri.parse(this.f14244a.f13770i).getHost().equals(Uri.parse(str).getHost())) {
            return false;
        }
        try {
            this.f14244a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
