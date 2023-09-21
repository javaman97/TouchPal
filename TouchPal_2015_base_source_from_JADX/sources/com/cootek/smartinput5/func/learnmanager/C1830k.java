package com.cootek.smartinput5.func.learnmanager;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.func.learnmanager.k */
/* compiled from: SmsImporterchecker */
public class C1830k extends C2220ah {
    public C1830k(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.SMS_NEXT_IMPORT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 7.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.SMS_NEXT_IMPORT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        C1827i.f6103a = true;
        C1368X.m6320c().mo5819E().mo6873a();
        mo7752i();
    }

    /* renamed from: a_ */
    public boolean mo6478a_() {
        return false;
    }
}
