package com.cootek.smartinput.utilities;

import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.cmd.C2268c;

/* renamed from: com.cootek.smartinput.utilities.v */
/* compiled from: TJavascriptHandler */
class C1014v extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f2654a;

    /* renamed from: b */
    final /* synthetic */ TJavascriptHandler f2655b;

    C1014v(TJavascriptHandler tJavascriptHandler, String str) {
        this.f2655b = tJavascriptHandler;
        this.f2654a = str;
    }

    public void run() {
        C2209a.m9956a().mo7727a(this.f2655b.mContext, C2209a.C2210a.DIRECTLY, false, C2268c.C2269a.TJSH);
        this.f2655b.callbackWebview(this.f2654a);
        this.f2655b.writeBackToken();
        super.run();
    }
}
