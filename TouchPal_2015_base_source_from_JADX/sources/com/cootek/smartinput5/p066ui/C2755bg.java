package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2752be;

/* renamed from: com.cootek.smartinput5.ui.bg */
/* compiled from: LanguageSelectorPopup */
class C2755bg implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2752be f12292a;

    /* renamed from: b */
    final /* synthetic */ C2752be.C2753a f12293b;

    C2755bg(C2752be.C2753a aVar, C2752be beVar) {
        this.f12293b = aVar;
        this.f12292a = beVar;
    }

    public void onClick(View view) {
        Engine.getInstance().getWidgetManager().mo9650h().mo8542g();
        for (C2752be.C2753a a : C2752be.this.f12271k) {
            a.mo9030a(false);
        }
        this.f12293b.mo9030a(true);
        Engine.switchToLanguage(this.f12293b.f12278b.f4727f);
    }
}
