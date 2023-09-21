package com.cootek.smartinput5.plugin.typingrace;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.n */
/* compiled from: Racing */
class C2461n implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2460m f10719a;

    C2461n(C2460m mVar) {
        this.f10719a = mVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10719a.f10718b.dismiss();
        Racing.this.finish();
        Racing.this.startActivity(new Intent(Racing.this, Guide.class));
    }
}
