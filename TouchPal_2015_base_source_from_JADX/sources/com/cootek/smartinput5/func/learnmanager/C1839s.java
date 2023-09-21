package com.cootek.smartinput5.func.learnmanager;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.learnmanager.s */
/* compiled from: TwitterLearnSuccessActivity */
class C1839s implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ TwitterLearnSuccessActivity f6134a;

    C1839s(TwitterLearnSuccessActivity twitterLearnSuccessActivity) {
        this.f6134a = twitterLearnSuccessActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        new Thread(new C1840t(this)).start();
        this.f6134a.finish();
    }
}
