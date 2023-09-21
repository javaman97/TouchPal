package com.cootek.smartinput5.plugin.typingrace;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.v */
/* compiled from: Racing */
class C2469v implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2467t f10731a;

    C2469v(C2467t tVar) {
        this.f10731a = tVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10731a.f10729b.dismiss();
        Racing.this.finish();
        Racing.this.startActivity(new Intent(Racing.this, Guide.class));
    }
}
