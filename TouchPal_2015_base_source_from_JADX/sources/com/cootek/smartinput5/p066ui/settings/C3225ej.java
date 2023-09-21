package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.text.TextUtils;

/* renamed from: com.cootek.smartinput5.ui.settings.ej */
/* compiled from: UsrWordManageActivity */
class C3225ej implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ UsrWordManageActivity f14290a;

    C3225ej(UsrWordManageActivity usrWordManageActivity) {
        this.f14290a = usrWordManageActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f14290a.f13797t != null) {
            String obj = this.f14290a.f13797t.getText().toString();
            if (!TextUtils.isEmpty(obj)) {
                this.f14290a.m14150a(obj);
            }
        }
        this.f14290a.m14168g();
    }
}
