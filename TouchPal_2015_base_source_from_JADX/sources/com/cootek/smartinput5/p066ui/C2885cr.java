package com.cootek.smartinput5.p066ui;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.cr */
/* compiled from: SoftSymbolPad */
public class C2885cr extends C2811cf {

    /* renamed from: b */
    private static final String f13109b = "SoftSymbolPad";

    /* renamed from: a */
    SymGridView f13110a;

    public C2885cr(String str) {
        this(str, 0);
    }

    public C2885cr(String str, int i) {
        super(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo9191m() {
        this.f12548W = new C2886cs(this);
    }

    /* renamed from: a */
    public void mo7433a() {
        super.mo7433a();
        if (this.f13110a != null) {
            this.f13110a.mo8755c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7435b() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        this.f12532E = widgetManager.mo9651i().mo9718d() + this.f12532E;
    }

    /* renamed from: a */
    public void mo9557a(SymGridView symGridView) {
        this.f13110a = symGridView;
        this.f13110a.setNextPageKey((PageKey) mo9182b("sk_next"));
        this.f13110a.mo8755c();
    }
}
