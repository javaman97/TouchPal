package com.cootek.smartinput5.func.component;

import android.text.format.Time;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.func.component.c */
/* compiled from: AutoRebuildChecker */
public class C1668c extends C2220ah {

    /* renamed from: a */
    private static final int f5446a = 1;

    /* renamed from: b */
    private static final int f5447b = 3;

    public C1668c(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.AUTO_REBUILD_NEXT_CHECK_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.AUTO_REBUILD_NEXT_CHECK_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (m7662e()) {
            if (m7663g()) {
                m7664k();
            }
            mo7752i();
            return;
        }
        mo6538f();
    }

    /* renamed from: e */
    private boolean m7662e() {
        Time time = new Time();
        time.setToNow();
        return time.hour == 3;
    }

    /* renamed from: g */
    private boolean m7663g() {
        boolean z = true;
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.AUTO_REBUILD_ENABLED) & true;
        if (Settings.getInstance().getBoolSetting(Settings.LAST_CHECK_IMAGE_RESULT)) {
            z = false;
        }
        return z & boolSetting;
    }

    /* renamed from: k */
    private void m7664k() {
        C1659T t = new C1659T(C1368X.m6313b());
        Engine.setBusyState(true);
        t.mo6481a(false);
        Engine.setBusyState(false);
    }
}
