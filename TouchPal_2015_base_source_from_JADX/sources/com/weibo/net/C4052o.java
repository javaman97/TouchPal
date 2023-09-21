package com.weibo.net;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.weibo.net.o */
/* compiled from: ShareActivity */
class C4052o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Exception f16496a;

    /* renamed from: b */
    final /* synthetic */ ShareActivity f16497b;

    C4052o(ShareActivity shareActivity, Exception exc) {
        this.f16497b = shareActivity;
        this.f16496a = exc;
    }

    public void run() {
        Toast.makeText(this.f16497b, String.format(this.f16497b.getResString(R.string.send_failed) + ":%s", new Object[]{this.f16496a.getMessage()}), 1).show();
    }
}
