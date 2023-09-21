package com.cootek.smartinput5.plugin.typingrace;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.F */
/* compiled from: RankList */
class C2429F implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2427D f10615a;

    C2429F(C2427D d) {
        this.f10615a = d;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10615a.f10613a.startActivity(new Intent(this.f10615a.f10613a, Guide.class));
        this.f10615a.f10613a.finish();
    }
}
