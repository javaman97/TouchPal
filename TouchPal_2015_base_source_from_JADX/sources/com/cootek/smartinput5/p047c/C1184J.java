package com.cootek.smartinput5.p047c;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p066ui.p068b.C2717b;

/* renamed from: com.cootek.smartinput5.c.J */
/* compiled from: PluginStore */
public class C1184J extends C1199d {
    /* renamed from: b */
    public String mo4454b() {
        return C2717b.MORE_ONLINE_STORE.toString();
    }

    /* renamed from: c */
    public String mo4455c() {
        return C1411aV.f4489p;
    }

    /* renamed from: d */
    public C1198c mo4456d() {
        return new C1185K(this);
    }

    /* renamed from: e */
    public C1197b mo4457e() {
        return new C1186L(this);
    }

    /* renamed from: a */
    public void mo4453a(Context context) {
        Settings.getInstance().writeBack();
        C1584bI.m7145b(context, new C1187M(this), true);
    }

    /* renamed from: f */
    public boolean mo4458f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo4459g() {
        return false;
    }
}
