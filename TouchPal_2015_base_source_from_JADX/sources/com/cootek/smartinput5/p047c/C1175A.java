package com.cootek.smartinput5.p047c;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.A */
/* compiled from: PluginResizeKeyboard */
public class C1175A extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_RESIZE_KEYBOARD.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return "func";
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1176B(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1177C(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        if (Engine.isInitialized()) {
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            widgetManager.mo9632af().mo10098a(true);
            widgetManager.mo9632af().mo10102d();
            widgetManager.mo9632af().mo10098a(false);
        }
    }

    /* renamed from: f */
    public boolean mo4458f() {
        return !C1549b.f4835f.equals(Engine.getInstance().getCurrentLanguageId());
    }

    /* renamed from: g */
    public boolean mo4459g() {
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager().mo9632af().mo10106h()) {
            return false;
        }
        return true;
    }
}
