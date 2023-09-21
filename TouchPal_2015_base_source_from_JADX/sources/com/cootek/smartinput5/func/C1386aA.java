package com.cootek.smartinput5.func;

import com.cootek.smartinput5.action.ActionDownloadSkinPack;

/* renamed from: com.cootek.smartinput5.func.aA */
/* compiled from: JsHandler */
class C1386aA implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4342a;

    /* renamed from: b */
    final /* synthetic */ String f4343b;

    /* renamed from: c */
    final /* synthetic */ String f4344c;

    /* renamed from: d */
    final /* synthetic */ JsHandler f4345d;

    C1386aA(JsHandler jsHandler, String str, String str2, String str3) {
        this.f4345d = jsHandler;
        this.f4342a = str;
        this.f4343b = str2;
        this.f4344c = str3;
    }

    public void run() {
        this.f4345d.mHandler.post(new ActionDownloadSkinPack(this.f4342a, this.f4343b, this.f4344c));
    }
}
