package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.aC */
/* compiled from: HandWriteMask */
class C2663aC implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2662aB f11980a;

    C2663aC(C2662aB aBVar) {
        this.f11980a = aBVar;
    }

    public void run() {
        C2361q.m10797b().mo8024j(C1368X.m6320c().mo5848u().mo5597b(), this.f11980a.f11979a.m11767a((int) R.string.paopao_handwrite_data_title), (String) null);
        this.f11980a.f11979a.setStatus(2);
    }
}
