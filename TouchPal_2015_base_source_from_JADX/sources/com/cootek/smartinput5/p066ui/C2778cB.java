package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cB */
/* compiled from: SwitchLanguageDialog */
class C2778cB implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2892cy f12376a;

    C2778cB(C2892cy cyVar) {
        this.f12376a = cyVar;
    }

    public void onClick(View view) {
        Engine.switchToLanguage(this.f12376a.f13121b.f4727f);
        this.f12376a.mo8912a();
    }
}
