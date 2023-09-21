package com.cootek.smartinput5.func;

import android.content.Context;

/* renamed from: com.cootek.smartinput5.func.bl */
/* compiled from: SuperDictManager */
class C1611bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f5190a;

    /* renamed from: b */
    final /* synthetic */ String f5191b;

    /* renamed from: c */
    final /* synthetic */ String f5192c;

    /* renamed from: d */
    final /* synthetic */ C1608bk f5193d;

    C1611bl(C1608bk bkVar, Context context, String str, String str2) {
        this.f5193d = bkVar;
        this.f5190a = context;
        this.f5191b = str;
        this.f5192c = str2;
    }

    public void run() {
        this.f5193d.mo6308a(this.f5190a, this.f5191b, this.f5192c);
    }
}
