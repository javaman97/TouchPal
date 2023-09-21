package com.cootek.smartinput5.func.p052b;

import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.func.b.aU */
/* compiled from: LanguageListInfo */
class C1520aU implements Comparator<C1498a> {

    /* renamed from: a */
    final /* synthetic */ HashMap f4756a;

    /* renamed from: b */
    final /* synthetic */ C1519aT f4757b;

    C1520aU(C1519aT aTVar, HashMap hashMap) {
        this.f4757b = aTVar;
        this.f4756a = hashMap;
    }

    /* renamed from: a */
    public int compare(C1498a aVar, C1498a aVar2) {
        return C1519aT.m6944a(aVar.f4727f, (HashMap<String, Integer>) this.f4756a) - C1519aT.m6944a(aVar2.f4727f, (HashMap<String, Integer>) this.f4756a);
    }
}
