package com.cootek.smartinput5.p066ui.settings;

import android.app.ProgressDialog;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.x */
/* compiled from: BaiduAuthActivity */
class C3249x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaiduAuthActivity f14321a;

    C3249x(BaiduAuthActivity baiduAuthActivity) {
        this.f14321a = baiduAuthActivity;
    }

    public void run() {
        ProgressDialog unused = this.f14321a.f13386k = new ProgressDialog(this.f14321a);
        this.f14321a.f13386k.setTitle(this.f14321a.mo7241b((int) R.string.optpage_pcs_restore_dic));
        this.f14321a.f13386k.setMessage(this.f14321a.mo7241b((int) R.string.optpage_pcs_preparing));
        Thread thread = new Thread(new C3250y(this));
        this.f14321a.f13386k.setOnCancelListener(new C2950C(this, thread));
        this.f14321a.f13386k.setCanceledOnTouchOutside(false);
        this.f14321a.f13386k.show();
        thread.start();
    }
}
