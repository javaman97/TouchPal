package com.cootek.smartinput5.net.login;

import android.content.Intent;
import android.view.View;

/* renamed from: com.cootek.smartinput5.net.login.q */
/* compiled from: TLoginActivity */
class C2344q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10327a;

    C2344q(TLoginActivity tLoginActivity) {
        this.f10327a = tLoginActivity;
    }

    public void onClick(View view) {
        this.f10327a.f10269b.startActivity(new Intent(this.f10327a.f10269b, FindPasswordActivity.class));
    }
}
