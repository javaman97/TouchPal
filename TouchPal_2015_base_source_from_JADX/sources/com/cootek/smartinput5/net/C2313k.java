package com.cootek.smartinput5.net;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.net.k */
/* compiled from: AutoBackupDictionaryChecker */
public class C2313k extends C2220ah {

    /* renamed from: a */
    private static final int f10179a = 1;

    public C2313k(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.AUTO_BACKUP_DICTIONARY_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.AUTO_BACKUP_DICTIONARY_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        C1368X.m6320c().mo5826L().mo6210a(0);
        mo7752i();
    }

    /* renamed from: a_ */
    public boolean mo6478a_() {
        return false;
    }
}
