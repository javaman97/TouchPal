package com.cootek.smartinput5.net.login;

import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import p018cn.sharesdk.twitter.Twitter;

/* renamed from: com.cootek.smartinput5.net.login.G */
/* compiled from: TLoginActivity */
class C2321G implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10201a;

    C2321G(TLoginActivity tLoginActivity) {
        this.f10201a = tLoginActivity;
    }

    public void onClick(View view) {
        boolean z = false;
        if (!this.f10201a.m10699m()) {
            if (!C1584bI.m7141a(this.f10201a.f10269b, (Runnable) new C2322H(this), false)) {
                z = true;
            }
            if (z) {
                this.f10201a.m10673c(Twitter.NAME);
            }
        }
    }
}
