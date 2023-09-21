package com.cootek.smartinput5.p050f;

import android.view.View;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.f.g */
/* compiled from: WizardPopupWindow */
class C1326g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1319a f4051a;

    C1326g(C1319a aVar) {
        this.f4051a = aVar;
    }

    public void onClick(View view) {
        if ((System.currentTimeMillis() / 1000) - ((long) this.f4051a.f4036g) > 1) {
            this.f4051a.mo5545c();
            C1368X.m6320c().mo5850w().mo8408a();
            this.f4051a.f4036g = 0;
        }
    }
}
