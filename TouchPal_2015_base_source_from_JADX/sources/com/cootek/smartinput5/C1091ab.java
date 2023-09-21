package com.cootek.smartinput5;

import android.content.Context;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.ab */
/* compiled from: TouchPalIME */
class C1091ab implements C1452i.C1453a {

    /* renamed from: a */
    final /* synthetic */ TouchPalIME f3091a;

    C1091ab(TouchPalIME touchPalIME) {
        this.f3091a = touchPalIME;
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
        if (bVar == C1452i.C1454b.success) {
            boolean unused = this.f3091a.initialize();
            this.f3091a.setupInputView();
        }
        this.f3091a.stopCheckAssetsInBackground(bVar);
        this.f3091a.stopPreparingWindow();
    }

    /* renamed from: a */
    public void mo4255a() {
        this.f3091a.stopPreparingWindow();
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
    }
}
