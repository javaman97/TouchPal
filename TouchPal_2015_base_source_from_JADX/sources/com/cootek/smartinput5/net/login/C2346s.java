package com.cootek.smartinput5.net.login;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.cootek.smartinput5.net.login.s */
/* compiled from: TLoginActivity */
class C2346s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TLoginActivity f10329a;

    C2346s(TLoginActivity tLoginActivity) {
        this.f10329a = tLoginActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f10329a.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS"));
        } catch (ActivityNotFoundException e) {
        }
    }
}
