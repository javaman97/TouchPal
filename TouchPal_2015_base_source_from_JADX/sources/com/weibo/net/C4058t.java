package com.weibo.net;

import android.os.Bundle;
import android.webkit.CookieSyncManager;
import com.cootek.smartinput.utilities.C1017y;

/* renamed from: com.weibo.net.t */
/* compiled from: Weibo */
class C4058t implements C4060v {

    /* renamed from: a */
    final /* synthetic */ C4057s f16539a;

    C4058t(C4057s sVar) {
        this.f16539a = sVar;
    }

    /* renamed from: a */
    public void mo8261a(Bundle bundle) {
        CookieSyncManager.getInstance().sync();
        if (this.f16539a.f16534o == null) {
            C4053p unused = this.f16539a.f16534o = new C4053p(bundle.getString("access_token"), C4057s.f16531m);
        }
        this.f16539a.f16534o.mo15002c(bundle.getString("access_token"));
        this.f16539a.f16534o.mo15000b(bundle.getString(C4057s.f16527i));
        if (this.f16539a.mo15029h()) {
            this.f16539a.f16536q.mo8261a(bundle);
            return;
        }
        C1017y.m5228d("Weibo-authorize", "Failed to receive access token");
        this.f16539a.f16536q.mo8263a(new C4061w("Failed to receive access token."));
    }

    /* renamed from: a */
    public void mo8262a(C4042e eVar) {
        this.f16539a.f16536q.mo8262a(eVar);
    }

    /* renamed from: a */
    public void mo8263a(C4061w wVar) {
        this.f16539a.f16536q.mo8263a(wVar);
    }

    /* renamed from: a */
    public void mo8260a() {
        this.f16539a.f16536q.mo8260a();
    }
}
