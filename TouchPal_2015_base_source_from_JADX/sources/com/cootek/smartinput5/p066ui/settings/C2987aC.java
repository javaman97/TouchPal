package com.cootek.smartinput5.p066ui.settings;

import android.annotation.TargetApi;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* renamed from: com.cootek.smartinput5.ui.settings.aC */
/* compiled from: GetMoreSkinFragment */
class C2987aC extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ C3039ay f13811a;

    C2987aC(C3039ay ayVar) {
        this.f13811a = ayVar;
    }

    @TargetApi(8)
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        super.onConsoleMessage(consoleMessage);
        return true;
    }
}
