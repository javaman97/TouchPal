package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.i */
/* compiled from: BaiduAuthActivity */
class C3234i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f14301a;

    /* renamed from: b */
    final /* synthetic */ C3233h f14302b;

    C3234i(C3233h hVar, boolean z) {
        this.f14302b = hVar;
        this.f14301a = z;
    }

    public void run() {
        if (this.f14301a) {
            long currentTimeMillis = System.currentTimeMillis();
            Settings.getInstance().setLongSetting(Settings.LAST_CLOUD_BACKUP_DICT_TIME, currentTimeMillis);
            this.f14302b.f14300a.f14299a.m13640a(currentTimeMillis, (int) Settings.LAST_CLOUD_BACKUP_DICT_TIME);
            this.f14302b.f14300a.f14299a.m13710x();
            Toast.makeText(this.f14302b.f14300a.f14299a.getApplicationContext(), this.f14302b.f14300a.f14299a.mo7241b((int) R.string.baidu_pcs_backup_succeed), 0).show();
        } else {
            Toast.makeText(this.f14302b.f14300a.f14299a.getApplicationContext(), this.f14302b.f14300a.f14299a.mo7241b((int) R.string.baidu_pcs_backup_failed), 0).show();
        }
        this.f14302b.f14300a.f14299a.f13386k.dismiss();
    }
}
