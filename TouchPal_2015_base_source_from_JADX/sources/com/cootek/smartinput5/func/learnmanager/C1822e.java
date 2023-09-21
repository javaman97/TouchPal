package com.cootek.smartinput5.func.learnmanager;

import android.content.DialogInterface;
import com.cootek.smartinput5.func.C1368X;

/* renamed from: com.cootek.smartinput5.func.learnmanager.e */
/* compiled from: LearnRetryActivity */
class C1822e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f6072a;

    /* renamed from: b */
    final /* synthetic */ LearnRetryActivity f6073b;

    C1822e(LearnRetryActivity learnRetryActivity, int i) {
        this.f6073b = learnRetryActivity;
        this.f6072a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C1368X.m6320c().mo5843p().mo6835a(this.f6072a);
        this.f6073b.finish();
    }
}
