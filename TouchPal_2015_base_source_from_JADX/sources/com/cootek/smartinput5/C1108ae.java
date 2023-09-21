package com.cootek.smartinput5;

import android.content.Context;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.ae */
/* compiled from: TouchPalIME */
class C1108ae implements C1452i.C1453a {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f3126a;

    C1108ae(TouchPalIME touchPalIME) {
        this.f3126a = touchPalIME;
    }

    /* renamed from: a */
    public void mo4255a() {
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
        if (bVar == C1452i.C1454b.success && C1368X.m6324d()) {
            this.f3126a.doOnWindowShown();
        }
    }
}
