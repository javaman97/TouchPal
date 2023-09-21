package com.cootek.smartinput5.net;

import android.content.Context;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1348H;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2220ah;

/* renamed from: com.cootek.smartinput5.net.p */
/* compiled from: DomainLookupChecker */
public class C2360p extends C2220ah {

    /* renamed from: a */
    private static final float f10390a = 0.5f;

    public C2360p(C2220ah.C2221a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6450a() {
        return Settings.getInstance().getIntSetting(Settings.DOMAIN_LOOKUP_NEXT_CHECK_TIME);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo6455b() {
        return f10390a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6452a(int i) {
        Settings.getInstance().setIntSetting(Settings.DOMAIN_LOOKUP_NEXT_CHECK_TIME, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo6456c() {
        Context b = C1368X.m6313b();
        if (b != null) {
            C1348H.m6160a().mo5593a(b);
        }
        mo7752i();
    }
}
