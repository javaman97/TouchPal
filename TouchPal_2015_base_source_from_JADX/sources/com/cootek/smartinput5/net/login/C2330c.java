package com.cootek.smartinput5.net.login;

import android.text.Editable;
import android.view.View;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.net.login.c */
/* compiled from: FindPasswordActivity */
class C2330c implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FindPasswordActivity f10291a;

    C2330c(FindPasswordActivity findPasswordActivity) {
        this.f10291a = findPasswordActivity;
    }

    public void onClick(View view) {
        boolean z = false;
        if (!C1584bI.m7141a(this.f10291a.f10193b, (Runnable) new C2331d(this), false)) {
            z = true;
        }
        if (z) {
            Editable text = this.f10291a.f10196i.getText();
            if (text == null || !TLoginActivity.m10658a(text.toString())) {
                this.f10291a.m10612a(2);
                return;
            }
            this.f10291a.m10616a(text.toString());
        }
    }
}
