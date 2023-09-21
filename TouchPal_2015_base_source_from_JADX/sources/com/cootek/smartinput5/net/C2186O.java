package com.cootek.smartinput5.net;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2220ah;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2305z;

/* renamed from: com.cootek.smartinput5.net.O */
/* compiled from: NetworkDataChecker */
public class C2186O extends C2220ah {

    /* renamed from: a */
    private static final String f9245a = "network_data_control";

    public C2186O(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.NETWORK_DATA_NEXT_CHECK_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 7.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.NETWORK_DATA_NEXT_CHECK_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        if (Settings.getInstance().getBoolSetting(Settings.USERDATA_COLLECT_ENABLE)) {
            C2305z zVar = new C2305z();
            zVar.f10165a = f9245a;
            new C2373x(zVar).mo8060a((C2373x.C2376b) new C2187P(this));
        }
        mo7752i();
    }
}
