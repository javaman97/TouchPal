package com.cootek.smartinput5.p066ui;

import android.view.View;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p066ui.C2756bh;

/* renamed from: com.cootek.smartinput5.ui.bi */
/* compiled from: LayoutSelectorView */
class C2758bi implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2756bh.C2757a f12313a;

    C2758bi(C2756bh.C2757a aVar) {
        this.f12313a = aVar;
    }

    public void onClick(View view) {
        Settings.getInstance().setIntSetting(3, this.f12313a.f12309h, 1, C1368X.m6320c().mo5835h().getLanguageCategory(Engine.getInstance().getCurrentLanguageId(), 1), (Config) null, true);
        C1056a.m5588a().mo4264a(C1056a.f2983n + this.f12313a.f12309h, C2756bh.this.f12294a);
        for (C2756bh.C2757a a : C2756bh.this.f12300g) {
            a.mo9035a(false);
        }
        this.f12313a.mo9035a(true);
        Engine.getInstance().getWidgetManager().mo9650h().mo8542g();
    }
}
