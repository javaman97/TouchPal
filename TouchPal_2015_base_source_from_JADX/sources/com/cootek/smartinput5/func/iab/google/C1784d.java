package com.cootek.smartinput5.func.iab.google;

import android.content.DialogInterface;
import android.view.View;
import com.cootek.smartinput5.func.iab.C1730E;
import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.func.iab.C1754V;
import com.cootek.smartinput5.func.iab.google.ControlActivity;

/* renamed from: com.cootek.smartinput5.func.iab.google.d */
/* compiled from: ControlActivity */
class C1784d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1754V f5876a;

    /* renamed from: b */
    final /* synthetic */ ControlActivity.C1780a f5877b;

    C1784d(ControlActivity.C1780a aVar, C1754V v) {
        this.f5877b = aVar;
        this.f5876a = v;
    }

    public void onClick(View view) {
        if (C1730E.m8004c()) {
            ControlActivity.this.m8182a("consuming", "", false, (DialogInterface.OnCancelListener) null);
            C1730E.m8005d().mo6676a(this.f5876a, (C1746T.C1749c) new C1785e(this));
        }
    }
}
