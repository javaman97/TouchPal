package com.cootek.smartinput5.net.login;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.net.login.t */
/* compiled from: TLoginActivity */
class C2347t implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String[] f10330a;

    /* renamed from: b */
    final /* synthetic */ TLoginActivity f10331b;

    C2347t(TLoginActivity tLoginActivity, String[] strArr) {
        this.f10331b = tLoginActivity;
        this.f10330a = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10331b.m10666b(this.f10330a[i]);
    }
}
