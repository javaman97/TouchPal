package com.cootek.smartinput5.func.component;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.func.component.a */
/* compiled from: AccountChecker */
public class C1666a extends C2220ah {

    /* renamed from: a */
    private static final String f5444a = "AccountChecker";

    public C1666a(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.ACCOUNT_CHECK_NEXT_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return 3.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.ACCOUNT_CHECK_NEXT_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        C1617br.m7367a().mo6328a((C1617br.C1618a) new C1667b(this));
    }
}
