package com.cootek.smartinput5.plugin.weibo;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.plugin.weibo.b */
/* compiled from: AuthorizeActivity */
class C2478b implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10756a;

    C2478b(AuthorizeActivity authorizeActivity) {
        this.f10756a = authorizeActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        boolean unused = this.f10756a.f10745h = true;
        this.f10756a.finish();
    }
}
