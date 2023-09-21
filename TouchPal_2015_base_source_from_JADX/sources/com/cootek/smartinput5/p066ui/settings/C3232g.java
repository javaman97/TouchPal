package com.cootek.smartinput5.p066ui.settings;

import android.app.ProgressDialog;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.g */
/* compiled from: BaiduAuthActivity */
class C3232g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaiduAuthActivity f14299a;

    C3232g(BaiduAuthActivity baiduAuthActivity) {
        this.f14299a = baiduAuthActivity;
    }

    public void run() {
        ProgressDialog unused = this.f14299a.f13386k = new ProgressDialog(this.f14299a);
        this.f14299a.f13386k.setTitle(this.f14299a.mo7241b((int) R.string.optpage_pcs_backup_dic));
        this.f14299a.f13386k.setMessage(this.f14299a.mo7241b((int) R.string.optpage_pcs_preparing));
        Thread thread = new Thread(new C3233h(this));
        this.f14299a.f13386k.setOnCancelListener(new C3236k(this, thread));
        this.f14299a.f13386k.setCanceledOnTouchOutside(false);
        this.f14299a.f13386k.show();
        thread.start();
    }
}
