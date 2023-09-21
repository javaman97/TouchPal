package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p066ui.HandWriteMask;

/* renamed from: com.cootek.smartinput5.ui.settings.U */
/* compiled from: CellDictListActivity */
class C2978U implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2977T f13777a;

    C2978U(C2977T t) {
        this.f13777a = t;
    }

    public void run() {
        HandWriteMask.f11330g = 2;
        C1368X.m6320c().mo5848u().mo5595a();
        C2361q.m10797b().mo8024j(this.f13777a.f13728a.mo5597b(), this.f13777a.f13729b, (String) null);
    }
}
