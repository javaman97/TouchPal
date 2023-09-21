package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.net.TWebView;

/* renamed from: com.cootek.smartinput5.ui.settings.dY */
/* compiled from: TypingSpeedActivity */
class C3187dY extends TWebView.C2194a {

    /* renamed from: b */
    final /* synthetic */ TypingSpeedActivity f14243b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3187dY(TypingSpeedActivity typingSpeedActivity, TWebView tWebView) {
        super();
        this.f14243b = typingSpeedActivity;
        tWebView.getClass();
    }

    public void onConsoleMessage(String str, int i, String str2) {
        C1017y.m5228d("TypingSpeedActivity", str + " -- From line " + i + " of " + str2);
    }
}
