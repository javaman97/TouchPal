package com.cootek.smartinput5.func.learnmanager;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.func.learnmanager.c */
/* compiled from: LearnRetryActivity */
class C1820c implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ LearnRetryActivity f6070a;

    C1820c(LearnRetryActivity learnRetryActivity) {
        this.f6070a = learnRetryActivity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f6070a.finish();
    }
}
