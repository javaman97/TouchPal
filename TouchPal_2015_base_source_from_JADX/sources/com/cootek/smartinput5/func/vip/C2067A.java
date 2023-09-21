package com.cootek.smartinput5.func.vip;

import android.widget.Toast;
import com.cootek.smartinput5.func.C1617br;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.vip.A */
/* compiled from: VipInfoActivity */
class C2067A implements C1617br.C1618a {

    /* renamed from: a */
    final /* synthetic */ C2116z f8877a;

    C2067A(C2116z zVar) {
        this.f8877a = zVar;
    }

    /* renamed from: a */
    public void mo6073a(boolean z) {
        this.f8877a.f8989a.m9604p();
        if (!C1617br.m7367a().mo6335b()) {
            this.f8877a.f8989a.m9609u();
        } else {
            this.f8877a.f8989a.m9566a();
        }
        if (!C1617br.m7367a().mo6340g().mo7971k()) {
            Toast.makeText(this.f8877a.f8989a, this.f8877a.f8989a.m9577b((int) R.string.vip_canceled_toast), 1).show();
        }
    }
}
