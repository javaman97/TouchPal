package com.cootek.smartinput5.func.iab;

import android.app.Activity;
import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.iab.C1730E;

/* renamed from: com.cootek.smartinput5.func.iab.C */
/* compiled from: IabErrorHandler */
class C1728C implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1727B f5640a;

    C1728C(C1727B b) {
        this.f5640a = b;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1779g.m8175b(C1779g.f5850b, "CLICK");
        if (!(this.f5640a.f5638a instanceof Activity) || !(this.f5640a.f5638a instanceof C1730E.C1731a)) {
            C1617br.m7367a().mo6333b(this.f5640a.f5638a);
        } else {
            C1617br.m7367a().mo6326a((Activity) this.f5640a.f5638a, ((C1730E.C1731a) this.f5640a.f5638a).mo6691a());
        }
    }
}
