package com.cootek.smartinput5.plugin.typingrace;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.q */
/* compiled from: Racing */
class C2464q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2462o f10723a;

    C2464q(C2462o oVar) {
        this.f10723a = oVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10723a.f10721b.dismiss();
        Racing.this.finish();
    }
}
