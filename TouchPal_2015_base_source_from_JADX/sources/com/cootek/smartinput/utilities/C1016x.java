package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.x */
/* compiled from: TJavascriptHandler */
class C1016x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2657a;

    /* renamed from: b */
    final /* synthetic */ String f2658b;

    /* renamed from: c */
    final /* synthetic */ String f2659c;

    /* renamed from: d */
    final /* synthetic */ String f2660d;

    /* renamed from: e */
    final /* synthetic */ String f2661e;

    /* renamed from: f */
    final /* synthetic */ String f2662f;

    /* renamed from: g */
    final /* synthetic */ TJavascriptHandler f2663g;

    C1016x(TJavascriptHandler tJavascriptHandler, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f2663g = tJavascriptHandler;
        this.f2657a = str;
        this.f2658b = str2;
        this.f2659c = str3;
        this.f2660d = str4;
        this.f2661e = str5;
        this.f2662f = str6;
    }

    public void run() {
        this.f2663g.share(this.f2657a, this.f2658b, this.f2659c, this.f2660d, this.f2661e, this.f2662f);
    }
}
