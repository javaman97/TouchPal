package com.cootek.smartinput5.func.component;

import android.content.Context;
import com.cootek.smartinput5.func.component.C1671f;

/* renamed from: com.cootek.smartinput5.func.component.r */
/* compiled from: CloudSyncManager */
class C1685r implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f5501a;

    /* renamed from: b */
    final /* synthetic */ C1684q f5502b;

    C1685r(C1684q qVar, Context context) {
        this.f5502b = qVar;
        this.f5501a = context;
    }

    public void run() {
        for (Integer b : C1684q.f5499i) {
            C1671f.C1672a b2 = this.f5502b.mo6553b(this.f5501a, b);
            if (b2 != null) {
                b2.mo6487a().mo6527a(this.f5501a);
            }
        }
    }
}
