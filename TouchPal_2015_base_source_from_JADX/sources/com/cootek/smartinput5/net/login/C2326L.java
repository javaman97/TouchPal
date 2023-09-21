package com.cootek.smartinput5.net.login;

import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.cootek.smartinput5.func.C1584bI;

/* renamed from: com.cootek.smartinput5.net.login.L */
/* compiled from: TLoginActivity */
class C2326L implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10218a;

    C2326L(TLoginActivity tLoginActivity) {
        this.f10218a = tLoginActivity;
    }

    public void onClick(View view) {
        boolean z = false;
        if (!C1584bI.m7141a(this.f10218a.f10269b, (Runnable) new C2327M(this), false)) {
            z = true;
        }
        if (z) {
            Editable text = this.f10218a.f10251C.getText();
            if (text == null || TextUtils.isEmpty(text)) {
                this.f10218a.m10670c(6);
                return;
            }
            Editable text2 = this.f10218a.f10254F.getText();
            if (text2 == null || TextUtils.isEmpty(text2)) {
                this.f10218a.m10670c(7);
                return;
            }
            this.f10218a.m10667b(text.toString(), text2.toString());
        }
    }
}
