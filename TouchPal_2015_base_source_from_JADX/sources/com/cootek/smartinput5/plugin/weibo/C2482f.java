package com.cootek.smartinput5.plugin.weibo;

import android.app.Activity;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.plugin.weibo.AuthorizeActivity;
import com.weibo.net.C4057s;
import com.weibo.net.C4060v;

/* renamed from: com.cootek.smartinput5.plugin.weibo.f */
/* compiled from: AuthorizeActivity */
class C2482f extends Thread {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10760a;

    C2482f(AuthorizeActivity authorizeActivity) {
        this.f10760a = authorizeActivity;
    }

    public void run() {
        C4057s a = C4057s.m17245a();
        a.mo15021a("3492286671", "c4b21948fbe3073c0a2d405d296983c8");
        a.mo15026c("http://www.chubao.cn");
        a.mo15017a((Activity) this.f10760a, (C4060v) new AuthorizeActivity.C2474a());
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
        }
        this.f10760a.finish();
    }
}
