package com.cootek.smartinput5.p066ui;

import android.view.View;

/* renamed from: com.cootek.smartinput5.ui.bw */
/* compiled from: PluginButtonItem */
class C2772bw implements View.OnLongClickListener {

    /* renamed from: a */
    final /* synthetic */ C2770bu f12360a;

    C2772bw(C2770bu buVar) {
        this.f12360a = buVar;
    }

    public boolean onLongClick(View view) {
        this.f12360a.mo8891e();
        if (!this.f12360a.f12352d || this.f12360a.f12354f == null) {
            return false;
        }
        return this.f12360a.f12354f.onLongClick(view);
    }
}
