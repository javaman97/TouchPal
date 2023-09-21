package com.cootek.smartinput5.plugin.typingrace;

import android.content.DialogInterface;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.y */
/* compiled from: Racing */
class C2472y implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C2470w f10735a;

    C2472y(C2470w wVar) {
        this.f10735a = wVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f10735a.f10733b.dismiss();
        Racing.this.finish();
    }
}
