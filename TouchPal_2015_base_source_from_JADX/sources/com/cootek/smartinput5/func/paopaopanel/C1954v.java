package com.cootek.smartinput5.func.paopaopanel;

import com.cootek.smartinput5.p066ui.p067a.C2659d;
import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.v */
/* compiled from: PluginTab */
class C1954v implements Comparator<C2659d> {

    /* renamed from: a */
    final /* synthetic */ C1953u f6648a;

    C1954v(C1953u uVar) {
        this.f6648a = uVar;
    }

    /* renamed from: a */
    public int compare(C2659d dVar, C2659d dVar2) {
        C1950r rVar = (C1950r) dVar;
        C1950r rVar2 = (C1950r) dVar2;
        if (rVar.f6626f != rVar2.f6626f) {
            return rVar.f6626f - rVar2.f6626f;
        }
        return rVar.mo8984i().compareTo(rVar2.mo8984i());
    }
}
