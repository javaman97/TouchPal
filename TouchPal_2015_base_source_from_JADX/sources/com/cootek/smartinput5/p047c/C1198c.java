package com.cootek.smartinput5.p047c;

import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.c.c */
/* compiled from: IPluginPinConfig */
public abstract class C1198c {

    /* renamed from: a */
    int f3558a = Settings.PLUGIN_PINNED;

    /* renamed from: b */
    int f3559b = 23;

    /* renamed from: a */
    public abstract String mo4460a();

    /* renamed from: b */
    public boolean mo4469b() {
        return Settings.getInstance().getBoolSetting(this.f3558a, this.f3559b, mo4460a(), (Config) null);
    }

    /* renamed from: c */
    public boolean mo4470c() {
        boolean z;
        if (!mo4469b()) {
            z = true;
        } else {
            z = false;
        }
        Settings.getInstance().setBoolSetting(this.f3558a, z, this.f3559b, mo4460a(), (Config) null, false);
        return z;
    }
}
