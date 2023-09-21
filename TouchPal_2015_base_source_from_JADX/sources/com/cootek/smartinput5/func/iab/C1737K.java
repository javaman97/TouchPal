package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.func.iab.C1746T;
import org.json.JSONArray;

/* renamed from: com.cootek.smartinput5.func.iab.K */
/* compiled from: IabHelper */
class C1737K implements C1746T.C1750d {

    /* renamed from: a */
    final /* synthetic */ C1767ag f5696a;

    /* renamed from: b */
    final /* synthetic */ C1746T.C1748b f5697b;

    /* renamed from: c */
    final /* synthetic */ C1730E f5698c;

    C1737K(C1730E e, C1767ag agVar, C1746T.C1748b bVar) {
        this.f5698c = e;
        this.f5696a = agVar;
        this.f5697b = bVar;
    }

    /* renamed from: a */
    public void mo5743a(int i) {
        boolean z = false;
        if (i == 0) {
            z = true;
            this.f5698c.m7973a(this.f5696a, this.f5697b);
        }
        if (!z) {
            this.f5698c.m7981a((JSONArray) null, this.f5697b);
        }
    }
}
