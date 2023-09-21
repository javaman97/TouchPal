package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.p066ui.settings.C3134cc;
import java.util.Comparator;

/* renamed from: com.cootek.smartinput5.ui.settings.ce */
/* compiled from: SeparatedListAdapter */
class C3138ce implements Comparator<C3134cc.C3136b> {

    /* renamed from: a */
    final /* synthetic */ C3134cc f14178a;

    C3138ce(C3134cc ccVar) {
        this.f14178a = ccVar;
    }

    /* renamed from: a */
    public int compare(C3134cc.C3136b bVar, C3134cc.C3136b bVar2) {
        if (bVar == null || bVar2 == null || bVar.f14172b == null) {
            return 0;
        }
        return bVar.f14172b.compareTo(bVar2.f14172b);
    }
}
