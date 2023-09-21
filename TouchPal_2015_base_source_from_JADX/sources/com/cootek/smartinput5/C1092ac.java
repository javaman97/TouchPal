package com.cootek.smartinput5;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.ac */
/* compiled from: TouchPalIME */
class C1092ac implements C1452i.C1453a {

    /* renamed from: a */
    final /* synthetic */ EditorInfo f3092a;

    /* renamed from: b */
    final /* synthetic */ boolean f3093b;

    /* renamed from: c */
    final /* synthetic */ TouchPalIME f3094c;

    C1092ac(TouchPalIME touchPalIME, EditorInfo editorInfo, boolean z) {
        this.f3094c = touchPalIME;
        this.f3092a = editorInfo;
        this.f3093b = z;
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
        if (bVar == C1452i.C1454b.success) {
            boolean unused = this.f3094c.initialize();
            this.f3094c.setupInputView();
            this.f3094c.doOnStartInputView(this.f3092a, this.f3093b);
        } else {
            this.f3094c.requestHideSelf(0);
        }
        this.f3094c.stopCheckAssetsInBackground(bVar);
        C0904g.m4916a().mo3409b(C0898b.ON_START_INPUT_VIEW);
    }

    /* renamed from: a */
    public void mo4255a() {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
    }
}
