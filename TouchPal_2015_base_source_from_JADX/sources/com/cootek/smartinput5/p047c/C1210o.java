package com.cootek.smartinput5.p047c;

import android.content.Context;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.o */
/* compiled from: PluginHWMask */
public class C1210o extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.hw_mask.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4486m;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1211p(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1212q(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        mo4474a("sk_hw_mask");
        Engine.getInstance().getWidgetManager().mo9650h().mo8552o();
    }

    /* renamed from: f */
    public boolean mo4458f() {
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        return C1389aD.m6470y(currentLanguageId) && !C1549b.f4835f.equalsIgnoreCase(currentLanguageId);
    }

    /* renamed from: g */
    public boolean mo4459g() {
        return Engine.getInstance().isHandwriteMaskVisible();
    }
}
