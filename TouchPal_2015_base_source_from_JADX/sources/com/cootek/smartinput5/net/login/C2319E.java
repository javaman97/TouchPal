package com.cootek.smartinput5.net.login;

import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import p018cn.sharesdk.facebook.Facebook;

/* renamed from: com.cootek.smartinput5.net.login.E */
/* compiled from: TLoginActivity */
class C2319E implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10186a;

    C2319E(TLoginActivity tLoginActivity) {
        this.f10186a = tLoginActivity;
    }

    public void onClick(View view) {
        boolean z = false;
        if (!this.f10186a.m10699m()) {
            if (!C1584bI.m7141a(this.f10186a.f10269b, (Runnable) new C2320F(this), false)) {
                z = true;
            }
            if (z) {
                this.f10186a.m10673c(Facebook.NAME);
            }
        }
    }
}
