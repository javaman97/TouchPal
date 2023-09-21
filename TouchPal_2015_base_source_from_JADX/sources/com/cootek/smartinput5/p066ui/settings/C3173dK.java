package com.cootek.smartinput5.p066ui.settings;

import android.content.DialogInterface;
import android.os.Message;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.net.C2373x;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.dK */
/* compiled from: TouchPalCloudActivity */
class C3173dK implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C3172dJ f14228a;

    C3173dK(C3172dJ dJVar) {
        this.f14228a = dJVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f14228a.f14227a.m14113s();
        Message obtainMessage = this.f14228a.f14227a.f13748r.obtainMessage(1);
        obtainMessage.obj = this.f14228a.f14227a.mo7241b((int) R.string.logout_in_progress);
        this.f14228a.f14227a.f13748r.sendMessage(obtainMessage);
        C1617br.m7367a().mo6331a((C2373x.C2376b) new C3174dL(this));
    }
}
