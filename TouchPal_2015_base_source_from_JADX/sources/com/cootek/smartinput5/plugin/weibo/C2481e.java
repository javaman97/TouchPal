package com.cootek.smartinput5.plugin.weibo;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.weibo.e */
/* compiled from: AuthorizeActivity */
class C2481e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10759a;

    C2481e(AuthorizeActivity authorizeActivity) {
        this.f10759a = authorizeActivity;
    }

    public void run() {
        Toast.makeText(this.f10759a, this.f10759a.getResString(R.string.weibo_connect_failed), 0).show();
    }
}
