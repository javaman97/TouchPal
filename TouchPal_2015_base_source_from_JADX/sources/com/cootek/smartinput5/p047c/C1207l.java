package com.cootek.smartinput5.p047c;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.l */
/* compiled from: PluginEdit */
public class C1207l extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.PLUGIN_EDIT.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4486m;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1208m(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1209n(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        mo4474a("sk_edit");
    }

    /* renamed from: f */
    public boolean mo4458f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo4459g() {
        if (Engine.isInitialized()) {
            return "eng_edit".equals(Engine.getInstance().getSurfaceTemplate());
        }
        return false;
    }
}
