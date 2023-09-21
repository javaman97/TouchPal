package com.cootek.smartinput5.plugin.typingrace;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.typingrace.O */
/* compiled from: RankList */
class C2439O implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2438N f10634a;

    C2439O(C2438N n) {
        this.f10634a = n;
    }

    public void run() {
        Toast.makeText(this.f10634a.f10632a, this.f10634a.f10633b.getResString(R.string.send_failed), 1).show();
    }
}
