package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.func.component.u */
/* compiled from: ContactImporterChecker */
public class C1688u extends C2220ah {
    public C1688u(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.NEXT_CONTACT_IMPORT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 30.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.NEXT_CONTACT_IMPORT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, false);
        C1368X.m6320c().mo5817C().mo6559a();
        mo7752i();
    }

    /* renamed from: a_ */
    public boolean mo6478a_() {
        return false;
    }
}
