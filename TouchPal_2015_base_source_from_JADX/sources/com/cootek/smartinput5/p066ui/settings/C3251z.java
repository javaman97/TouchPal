package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.z */
/* compiled from: BaiduAuthActivity */
class C3251z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3250y f14323a;

    C3251z(C3250y yVar) {
        this.f14323a = yVar;
    }

    public void run() {
        Toast.makeText(this.f14323a.f14322a.f14321a.getApplicationContext(), this.f14323a.f14322a.f14321a.mo7241b((int) R.string.baidu_pcs_restore_no_history), 0).show();
    }
}
