package com.cootek.smartinput5.func.smileypanel;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2917du;

/* renamed from: com.cootek.smartinput5.func.smileypanel.m */
/* compiled from: SoftSmileyPad */
public class C2063m extends C2811cf {

    /* renamed from: a */
    SmileyListView f8846a;

    public C2063m(String str) {
        this(str, 0);
    }

    public C2063m(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public void mo7433a() {
        super.mo7433a();
        if (this.f8846a != null) {
            this.f8846a.mo7316d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7435b() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        this.f12532E = widgetManager.mo9651i().mo9718d() + this.f12532E;
    }

    /* renamed from: a */
    public void mo7434a(SmileyListView smileyListView) {
        this.f8846a = smileyListView;
        this.f8846a.mo7316d();
    }
}
