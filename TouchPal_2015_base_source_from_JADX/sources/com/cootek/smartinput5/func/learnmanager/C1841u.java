package com.cootek.smartinput5.func.learnmanager;

import android.content.DialogInterface;
import com.cootek.smartinput5.plugin.twitter.C2417r;

/* renamed from: com.cootek.smartinput5.func.learnmanager.u */
/* compiled from: TwitterProgressDialogActivity */
class C1841u implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ TwitterProgressDialogActivity f6136a;

    C1841u(TwitterProgressDialogActivity twitterProgressDialogActivity) {
        this.f6136a = twitterProgressDialogActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C1831l.f6120s = true;
        C2417r.m11027a().mo8183n();
        C1831l.f6119r = false;
    }
}
