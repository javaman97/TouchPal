package com.cootek.smartinput5.presentations;

import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.smartinput5.net.C2188Q;

/* renamed from: com.cootek.smartinput5.presentations.r */
/* compiled from: PresentationClient */
class C2517r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2515q f10856a;

    C2517r(C2515q qVar) {
        this.f10856a = qVar;
    }

    public void run() {
        PresentationManager.startWork(this.f10856a.f10855z, new C2502f(this.f10856a.f10851u), C2188Q.m9853a().mo7683c());
        boolean unused = this.f10856a.f10854x = false;
    }
}
