package com.cootek.smartinput5.p050f;

import android.os.Handler;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.f.d */
/* compiled from: WizardPopupWindow */
class C1323d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Handler f4047a;

    /* renamed from: b */
    final /* synthetic */ C1322c f4048b;

    C1323d(C1322c cVar, Handler handler) {
        this.f4048b = cVar;
        this.f4047a = handler;
    }

    public void run() {
        C1368X.m6320c().mo5820F().mo7498c();
        Settings.getInstance().setBoolSetting(Settings.V4_USRDICT_IMPORTED, true);
        this.f4048b.f4044c.setVisibility(0);
        this.f4048b.f4045d.setText(this.f4048b.f4046e.m6099b((int) R.string.restore_done));
        this.f4047a.postDelayed(new C1324e(this), 1000);
    }
}
