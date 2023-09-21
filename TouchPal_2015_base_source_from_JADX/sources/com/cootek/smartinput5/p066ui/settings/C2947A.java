package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.A */
/* compiled from: BaiduAuthActivity */
class C2947A implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f13371a;

    /* renamed from: b */
    final /* synthetic */ C3250y f13372b;

    C2947A(C3250y yVar, boolean z) {
        this.f13372b = yVar;
        this.f13371a = z;
    }

    public void run() {
        if (this.f13371a) {
            long currentTimeMillis = System.currentTimeMillis();
            Settings.getInstance().setLongSetting(Settings.LAST_CLOUD_RESTORE_DICT_TIME, currentTimeMillis);
            this.f13372b.f14322a.f14321a.m13640a(currentTimeMillis, (int) Settings.LAST_CLOUD_RESTORE_DICT_TIME);
            this.f13372b.f14322a.f14321a.m13711y();
            Toast.makeText(this.f13372b.f14322a.f14321a.getApplicationContext(), this.f13372b.f14322a.f14321a.mo7241b((int) R.string.baidu_pcs_restore_succeed), 0).show();
        } else {
            Toast.makeText(this.f13372b.f14322a.f14321a.getApplicationContext(), this.f13372b.f14322a.f14321a.mo7241b((int) R.string.baidu_pcs_restore_failed), 0).show();
        }
        this.f13372b.f14322a.f14321a.f13386k.dismiss();
    }
}
