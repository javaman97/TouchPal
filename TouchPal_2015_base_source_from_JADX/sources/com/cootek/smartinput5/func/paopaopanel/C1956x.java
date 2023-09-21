package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.view.View;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.FunctionBar;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.x */
/* compiled from: PluginTab */
class C1956x implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C1199d f6651a;

    /* renamed from: b */
    final /* synthetic */ Context f6652b;

    /* renamed from: c */
    final /* synthetic */ C1953u f6653c;

    C1956x(C1953u uVar, C1199d dVar, Context context) {
        this.f6653c = uVar;
        this.f6651a = dVar;
        this.f6652b = context;
    }

    public void onClick(View view) {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager != null) {
            C1937f W = widgetManager.mo9617W();
            this.f6651a.mo4454b();
            if (W == null) {
                return;
            }
            if (W.mo7134i()) {
                FunctionBar h = widgetManager.mo9650h();
                if (this.f6651a.mo4456d().mo4470c()) {
                    C1246d.m6010a(this.f6652b).mo4591a(C1246d.f3887cy, this.f6651a.mo4454b(), C1246d.f3783b);
                }
                if (h != null) {
                    h.mo8552o();
                    return;
                }
                return;
            }
            this.f6651a.mo4453a(this.f6652b);
            C1246d.m6010a(this.f6652b).mo4591a(C1246d.f3885cw, this.f6651a.mo4454b(), C1246d.f3783b);
            C1056a.m5588a().mo4264a(C1056a.f2967aa + this.f6651a.mo4454b(), this.f6652b);
            this.f6653c.f6647e.post(new C1957y(this, W));
        }
    }
}
