package com.cootek.smartinput5.p050f;

import android.view.View;

/* renamed from: com.cootek.smartinput5.f.j */
/* compiled from: WizardPopupWindow */
class C1329j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1319a f4057a;

    C1329j(C1319a aVar) {
        this.f4057a = aVar;
    }

    public void onClick(View view) {
        if ((System.currentTimeMillis() / 1000) - ((long) this.f4057a.f4036g) > 1) {
            this.f4057a.mo5545c();
        }
    }
}
