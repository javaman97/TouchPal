package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.bv */
/* compiled from: PluginButtonItem */
class C2771bv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2770bu f12359a;

    C2771bv(C2770bu buVar) {
        this.f12359a = buVar;
    }

    public void onClick(View view) {
        this.f12359a.mo8891e();
        if (this.f12359a.f12352d && this.f12359a.f12353e != null) {
            this.f12359a.f12353e.onClick(view);
        }
    }
}
