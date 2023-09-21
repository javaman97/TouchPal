package com.cootek.smartinput5.presentations;

import com.cootek.smartinput5.p066ui.p068b.C2718c;
import com.cootek.smartinput5.presentations.C2503g;
import com.cootek.smartinput5.presentations.p064a.C2492d;

/* renamed from: com.cootek.smartinput5.presentations.n */
/* compiled from: GuidePointHolderJudgeFactory */
public class C2512n implements C2503g.C2505b {

    /* renamed from: a */
    private C2492d f10824a = new C2492d();

    /* renamed from: a */
    public C2503g.C2504a mo8303a(String str) {
        C2498b bVar;
        C2718c[] values = C2718c.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                bVar = values[i].mo8988a();
                if (bVar != null && bVar.mo8299c(str)) {
                    break;
                }
                i++;
            } else {
                bVar = null;
                break;
            }
        }
        if (bVar == null) {
            return this.f10824a;
        }
        return bVar;
    }
}
