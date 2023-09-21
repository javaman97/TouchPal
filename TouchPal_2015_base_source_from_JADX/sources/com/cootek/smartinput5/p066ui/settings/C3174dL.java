package com.cootek.smartinput5.p066ui.settings;

import android.widget.Toast;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.dL */
/* compiled from: TouchPalCloudActivity */
class C3174dL implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C3173dK f14229a;

    C3174dL(C3173dK dKVar) {
        this.f14229a = dKVar;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        this.f14229a.f14228a.f14227a.f13748r.sendEmptyMessage(0);
        if (p.f9746O == 200) {
            Toast.makeText(this.f14229a.f14228a.f14227a.f13734a, this.f14229a.f14228a.f14227a.mo7241b((int) R.string.logout_success_info), 1).show();
            this.f14229a.f14228a.f14227a.m14091h();
            return;
        }
        Toast.makeText(this.f14229a.f14228a.f14227a.f13734a, this.f14229a.f14228a.f14227a.mo7241b((int) R.string.logout_failed_info) + " " + this.f14229a.f14228a.f14227a.mo7237a((int) R.string.error_code_string, Integer.valueOf(p.f9746O)), 1).show();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        this.f14229a.f14228a.f14227a.f13748r.sendEmptyMessage(0);
    }
}
