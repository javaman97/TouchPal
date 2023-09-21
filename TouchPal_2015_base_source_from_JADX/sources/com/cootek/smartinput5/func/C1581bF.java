package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.Intent;
import com.cootek.smartinput5.TouchPalOption;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.func.bF */
/* compiled from: UserDictReportActivity */
class C1581bF extends TouchPalOption.C1047c {

    /* renamed from: e */
    final /* synthetic */ C1580bE f5003e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1581bF(C1580bE bEVar, Context context, Intent intent) {
        super(context, intent);
        this.f5003e = bEVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Float f) {
        super.onPostExecute((Float) null);
        this.f5003e.f5002b.finish();
    }

    /* renamed from: a */
    public void mo4231a() {
        super.mo4231a();
        this.f5003e.f5002b.m6271a(C1246d.f3947s);
    }
}
