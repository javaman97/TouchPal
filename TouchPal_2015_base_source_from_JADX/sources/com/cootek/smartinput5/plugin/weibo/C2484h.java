package com.cootek.smartinput5.plugin.weibo;

import android.widget.Toast;
import com.cootek.smartinput5.plugin.weibo.AuthorizeActivity;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.plugin.weibo.h */
/* compiled from: AuthorizeActivity */
class C2484h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity.C2474a f10762a;

    C2484h(AuthorizeActivity.C2474a aVar) {
        this.f10762a = aVar;
    }

    public void run() {
        Toast.makeText(AuthorizeActivity.this, AuthorizeActivity.this.getResString(R.string.weibo_connect_failed), 0).show();
    }
}
