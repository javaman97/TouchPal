package com.cootek.smartinput5.net;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.X */
/* compiled from: PerfDataChecker */
public class C2206X extends C2220ah {

    /* renamed from: a */
    public static final String f9308a = "PerfDataChecker";

    public C2206X(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.PERF_DATA_NEXT_CHECK_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.PERF_DATA_NEXT_CHECK_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE) && C0904g.m4916a().mo3410b()) {
            String g = C0904g.m4916a().mo3418g();
            Context b = C1368X.m6313b();
            if (!TextUtils.isEmpty(g) && b != null) {
                C1246d.m6010a(b).mo4591a(C1246d.f3835bz, g, C1246d.f3934f);
                C0904g.m4916a().mo3413d();
            }
        }
        mo7752i();
    }

    /* renamed from: a_ */
    public boolean mo6478a_() {
        return false;
    }
}
