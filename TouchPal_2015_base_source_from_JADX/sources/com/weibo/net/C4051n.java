package com.weibo.net;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.weibo.net.n */
/* compiled from: ShareActivity */
class C4051n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ShareActivity f16495a;

    C4051n(ShareActivity shareActivity) {
        this.f16495a = shareActivity;
    }

    public void run() {
        Toast.makeText(this.f16495a, this.f16495a.getResString(R.string.send_sucess), 1).show();
    }
}
