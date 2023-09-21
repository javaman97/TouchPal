package com.cootek.smartinput5.func;

import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;

/* renamed from: com.cootek.smartinput5.func.aF */
/* compiled from: LanguageManager */
class C1393aF implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f4404a;

    /* renamed from: b */
    final /* synthetic */ C1389aD f4405b;

    C1393aF(C1389aD aDVar, String str) {
        this.f4405b = aDVar;
        this.f4404a = str;
    }

    public void run() {
        Settings.getInstance().setIntSetting(4, Settings.getInstance().getIntSetting(4, 9, this.f4404a, (Config) null), 9, this.f4404a, (Config) null, true);
    }
}
