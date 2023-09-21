package com.cootek.smartinput5.func.iab;

import android.content.Context;

/* renamed from: com.cootek.smartinput5.func.iab.i */
/* compiled from: IabDialogManager */
class C1792i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Object f5895a;

    /* renamed from: b */
    final /* synthetic */ Context f5896b;

    /* renamed from: c */
    final /* synthetic */ C1789h f5897c;

    C1792i(C1789h hVar, Object obj, Context context) {
        this.f5897c = hVar;
        this.f5895a = obj;
        this.f5896b = context;
    }

    public void run() {
        Object unused = this.f5897c.f5894d = this.f5895a;
        this.f5897c.m8233c(this.f5896b);
    }
}
