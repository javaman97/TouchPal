package com.cootek.smartinput5.func.learnmanager;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.learnmanager.q */
/* compiled from: TwitterLearnSuccessActivity */
class C1837q implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ TwitterLearnSuccessActivity f6132a;

    C1837q(TwitterLearnSuccessActivity twitterLearnSuccessActivity) {
        this.f6132a = twitterLearnSuccessActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f6132a.finish();
    }
}
