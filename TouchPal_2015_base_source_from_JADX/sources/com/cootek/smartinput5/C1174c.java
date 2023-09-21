package com.cootek.smartinput5;

import android.content.Context;
import com.cootek.smartinput5.func.asset.C1452i;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.asset.DummyNotificationActionReceiver;

/* renamed from: com.cootek.smartinput5.c */
/* compiled from: GateActivity */
class C1174c implements C1452i.C1453a {

    /* renamed from: a */
    final /* synthetic */ GateActivity f3527a;

    C1174c(GateActivity gateActivity) {
        this.f3527a = gateActivity;
    }

    /* renamed from: a */
    public void mo4256a(Context context, C1452i.C1454b bVar) {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
        DummyNotificationActionReceiver.removeInitializingNotification(this.f3527a.getApplicationContext());
        switch (bVar) {
            case success:
                this.f3527a.m5249e();
                return;
            case extract_failed:
                this.f3527a.m5243b();
                return;
            case load_library_failed:
                this.f3527a.m5242a();
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo4255a() {
        C1460o.m6799b().mo6126b((C1452i.C1453a) this);
    }
}
