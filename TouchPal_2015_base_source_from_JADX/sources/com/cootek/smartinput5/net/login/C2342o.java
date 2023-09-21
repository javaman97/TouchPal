package com.cootek.smartinput5.net.login;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.p048d.C1246d;

/* renamed from: com.cootek.smartinput5.net.login.o */
/* compiled from: TLoginActivity */
class C2342o implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10325a;

    C2342o(TLoginActivity tLoginActivity) {
        this.f10325a = tLoginActivity;
    }

    public void onClick(View view) {
        String str;
        String str2 = null;
        boolean z = false;
        if (!C1584bI.m7141a(this.f10325a.f10269b, (Runnable) new C2343p(this), false)) {
            z = true;
        }
        if (z) {
            C1246d.m6010a(this.f10325a.f10269b).mo4591a("LOGIN/REGISTER", C1246d.f3954z, C1246d.f3933e);
            Editable text = this.f10325a.f10252D.getText();
            if (text != null) {
                str = text.toString().trim();
            } else {
                str = null;
            }
            Editable text2 = this.f10325a.f10253E.getText();
            if (text2 != null) {
                str2 = text2.toString().trim();
            }
            if (str == null || !TLoginActivity.m10658a(str)) {
                this.f10325a.m10670c(6);
            } else if (str2 == null || !TextUtils.equals(str, str2)) {
                this.f10325a.m10670c(9);
            } else {
                Editable text3 = this.f10325a.f10255G.getText();
                if (text3 == null) {
                    this.f10325a.m10670c(7);
                    return;
                }
                int b = this.f10325a.m10685g(text3.toString());
                if (b != -1) {
                    this.f10325a.m10670c(b);
                    C1246d.m6010a(this.f10325a.f10269b).mo4591a("LOGIN/REGISTER", C1246d.f3772ap, C1246d.f3933e);
                    return;
                }
                this.f10325a.m10674c(str, text3.toString());
            }
        }
    }
}
