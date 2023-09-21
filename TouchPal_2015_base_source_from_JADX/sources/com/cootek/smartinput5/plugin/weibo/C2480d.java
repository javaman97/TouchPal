package com.cootek.smartinput5.plugin.weibo;

import android.widget.Toast;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.weibo.d */
/* compiled from: AuthorizeActivity */
class C2480d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10758a;

    C2480d(AuthorizeActivity authorizeActivity) {
        this.f10758a = authorizeActivity;
    }

    public void run() {
        Toast.makeText(this.f10758a, this.f10758a.getResString(R.string.weibo_load_auth_web), 0).show();
    }
}
