package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.aM */
/* compiled from: LimitationManager */
class C1401aM implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f4434a;

    /* renamed from: b */
    final /* synthetic */ Context f4435b;

    /* renamed from: c */
    final /* synthetic */ C1396aI f4436c;

    C1401aM(C1396aI aIVar, String str, Context context) {
        this.f4436c = aIVar;
        this.f4434a = str;
        this.f4435b = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                this.f4436c.m6563c(this.f4434a, this.f4435b);
                return;
            case 1:
                this.f4436c.m6553a(this.f4434a, this.f4435b);
                return;
            case 2:
                this.f4436c.m6565d(this.f4434a, this.f4435b);
                return;
            default:
                return;
        }
    }
}
