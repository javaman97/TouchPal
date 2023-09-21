package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.d */
/* compiled from: BaiduAuthActivity */
class C3162d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BaiduAuthActivity f14210a;

    C3162d(BaiduAuthActivity baiduAuthActivity) {
        this.f14210a = baiduAuthActivity;
    }

    public void run() {
        this.f14210a.m13684m();
        Toast.makeText(this.f14210a, this.f14210a.mo7241b((int) R.string.optpage_pcs_login), 0).show();
    }
}
