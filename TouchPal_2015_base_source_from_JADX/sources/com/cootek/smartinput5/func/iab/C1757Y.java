package com.cootek.smartinput5.func.iab;

import android.annotation.TargetApi;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

/* renamed from: com.cootek.smartinput5.func.iab.Y */
/* compiled from: PurchaseChannelChooseActivity */
class C1757Y extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ PurchaseChannelChooseActivity f5730a;

    C1757Y(PurchaseChannelChooseActivity purchaseChannelChooseActivity) {
        this.f5730a = purchaseChannelChooseActivity;
    }

    @TargetApi(8)
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        super.onConsoleMessage(consoleMessage);
        return true;
    }
}
