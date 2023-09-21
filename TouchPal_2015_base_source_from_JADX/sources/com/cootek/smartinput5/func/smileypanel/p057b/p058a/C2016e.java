package com.cootek.smartinput5.func.smileypanel.p057b.p058a;

import com.cootek.smartinput5.func.smileypanel.C2043d;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.a.e */
/* compiled from: CategoryRecent */
public class C2016e implements C2043d {
    /* renamed from: a */
    public C2051e[] mo7367a() {
        ArrayList<C2019h> b = C2020i.m9332a().mo7377b();
        C2051e[] eVarArr = new C2051e[b.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= b.size()) {
                return eVarArr;
            }
            eVarArr[i2] = b.get((b.size() - 1) - i2);
            i = i2 + 1;
        }
    }
}
