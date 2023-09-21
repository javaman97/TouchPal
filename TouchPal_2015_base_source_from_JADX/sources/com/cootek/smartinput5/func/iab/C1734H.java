package com.cootek.smartinput5.func.iab;

import com.cootek.smartinput5.func.iab.C1746T;
import com.cootek.smartinput5.net.cmd.C2250J;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.iab.H */
/* compiled from: IabHelper */
class C1734H implements C1746T.C1750d {

    /* renamed from: a */
    final /* synthetic */ ArrayList f5689a;

    /* renamed from: b */
    final /* synthetic */ C1730E f5690b;

    C1734H(C1730E e, ArrayList arrayList) {
        this.f5690b = e;
        this.f5689a = arrayList;
    }

    /* renamed from: a */
    public void mo5743a(int i) {
        if (i == 0) {
            Iterator it = this.f5689a.iterator();
            while (it.hasNext()) {
                this.f5690b.m7997b((C2250J.C2252b) it.next());
            }
        }
    }
}
