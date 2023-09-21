package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.ui.bs */
/* compiled from: PluginBar */
class C2768bs implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2770bu f12344a;

    /* renamed from: b */
    final /* synthetic */ C1199d f12345b;

    /* renamed from: c */
    final /* synthetic */ C2767br f12346c;

    C2768bs(C2767br brVar, C2770bu buVar, C1199d dVar) {
        this.f12346c = brVar;
        this.f12344a = buVar;
        this.f12345b = dVar;
    }

    public void onClick(View view) {
        C0904g.m4916a().mo3411c();
        if (!this.f12344a.mo8984i().equals("layout_selector")) {
            this.f12346c.m12638j();
        }
        if (!Engine.getInstance().isInputPaused()) {
            Engine.getInstance().commitKeyEvent(Engine.KEYCODE_FUN_CANCEL_VOICE);
            this.f12346c.m12639k();
            this.f12345b.mo4453a(this.f12346c.f12340c);
            C1246d.m6010a(this.f12346c.f12340c).mo4591a(C1246d.f3886cx, this.f12345b.mo4454b(), C1246d.f3783b);
            FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
            if (h != null) {
                h.mo8558r();
            }
        }
    }
}
