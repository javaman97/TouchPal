package com.cootek.smartinput5.func.paopaopanel;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.s */
/* compiled from: PluginPanelItem */
class C1951s implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1950r f6641a;

    C1951s(C1950r rVar) {
        this.f6641a = rVar;
    }

    public void onClick(View view) {
        if (this.f6641a.f6627g != null) {
            this.f6641a.f6627g.onClick(view);
        }
        if (Engine.getInstance().getWidgetManager().mo9617W().mo7134i()) {
            this.f6641a.mo7164b();
        } else {
            this.f6641a.mo8891e();
        }
    }
}
