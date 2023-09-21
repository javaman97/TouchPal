package com.cootek.smartinput5.func;

import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.cmd.C2268c;

/* renamed from: com.cootek.smartinput5.func.az */
/* compiled from: JsHandler */
class C1470az extends Thread {

    /* renamed from: a */
    final /* synthetic */ String f4719a;

    /* renamed from: b */
    final /* synthetic */ JsHandler f4720b;

    C1470az(JsHandler jsHandler, String str) {
        this.f4720b = jsHandler;
        this.f4719a = str;
    }

    public void run() {
        C2209a.m9956a().mo7727a(this.f4720b.mContext, C2209a.C2210a.DIRECTLY, false, C2268c.C2269a.JSH);
        this.f4720b.callbackWebview(this.f4719a);
        super.run();
    }
}
