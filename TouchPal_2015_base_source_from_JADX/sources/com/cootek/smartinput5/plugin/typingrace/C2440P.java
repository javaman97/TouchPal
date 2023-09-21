package com.cootek.smartinput5.plugin.typingrace;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.P */
/* compiled from: RankList */
class C2440P implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2438N f10635a;

    C2440P(C2438N n) {
        this.f10635a = n;
    }

    public void run() {
        Toast.makeText(this.f10635a.f10632a, this.f10635a.f10633b.getResString(R.string.send_sucess), 1).show();
    }
}
