package com.cootek.smartinput5.net.login;

import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.C */
/* compiled from: TLoginActivity */
class C2317C implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10184a;

    C2317C(TLoginActivity tLoginActivity) {
        this.f10184a = tLoginActivity;
    }

    public void onClick(View view) {
        boolean z = false;
        if (!this.f10184a.m10699m()) {
            if (!C1584bI.m7141a(this.f10184a.f10269b, (Runnable) new C2318D(this), false)) {
                z = true;
            }
            if (z) {
                C1246d.m6010a(this.f10184a.f10269b).mo4591a(C1246d.f3766aj, "CLICK", C1246d.f3933e);
                this.f10184a.m10691i();
            }
        }
    }
}
