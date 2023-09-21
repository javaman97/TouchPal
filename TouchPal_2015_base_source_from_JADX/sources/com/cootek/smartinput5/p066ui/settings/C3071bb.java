package com.cootek.smartinput5.p066ui.settings;

import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1411aV;

/* renamed from: com.cootek.smartinput5.ui.settings.bb */
/* compiled from: KeyboardCustomizePlugin */
public class C3071bb implements C1411aV.C1412a {
    /* renamed from: a */
    public int mo6036a() {
        m14318c();
        Engine.getInstance().getWidgetManager().mo9632af().mo10102d();
        return 0;
    }

    /* renamed from: b */
    private void m14317b() {
    }

    /* renamed from: c */
    private void m14318c() {
        Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_COMMIT_INPUT);
        Engine.getInstance().processEvent();
    }
}
