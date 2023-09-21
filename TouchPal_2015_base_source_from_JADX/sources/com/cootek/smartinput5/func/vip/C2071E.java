package com.cootek.smartinput5.func.vip;

import android.widget.Toast;
import com.cootek.smartinput5.func.iab.C1789h;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2259P;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.vip.E */
/* compiled from: VipInfoActivity */
class C2071E implements C2373x.C2376b {

    /* renamed from: a */
    final /* synthetic */ C2070D f8882a;

    C2071E(C2070D d) {
        this.f8882a = d;
    }

    /* renamed from: a */
    public void mo4601a(C2259P p) {
        C1789h.m8227a().mo6796b();
        if (p.f9746O == 200) {
            Toast.makeText(this.f8882a.f8881a.f8880a, this.f8882a.f8881a.f8880a.m9577b((int) R.string.logout_success_info), 1).show();
            this.f8882a.f8881a.f8880a.m9609u();
            return;
        }
        Toast.makeText(this.f8882a.f8881a.f8880a, this.f8882a.f8881a.f8880a.m9577b((int) R.string.logout_failed_info) + " " + this.f8882a.f8881a.f8880a.m9562a((int) R.string.error_code_string, Integer.valueOf(p.f9746O)), 1).show();
    }

    /* renamed from: b */
    public void mo4602b(C2259P p) {
        C1789h.m8227a().mo6796b();
    }
}
