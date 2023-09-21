package com.cootek.smartinput5.plugin.twitter;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.plugin.twitter.e */
/* compiled from: AuthorizeActivity */
class C2404e implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10537a;

    C2404e(AuthorizeActivity authorizeActivity) {
        this.f10537a = authorizeActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        boolean unused = this.f10537a.f10506f = true;
        this.f10537a.finish();
        this.f10537a.f10502b.mo8183n();
    }
}
