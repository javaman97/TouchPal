package com.cootek.smartinput5.plugin.weibo;

import android.content.Context;
import com.weibo.net.C4057s;
import com.weibo.net.C4061w;

/* renamed from: com.cootek.smartinput5.plugin.weibo.c */
/* compiled from: AuthorizeActivity */
class C2479c extends Thread {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10757a;

    C2479c(AuthorizeActivity authorizeActivity) {
        this.f10757a = authorizeActivity;
    }

    public void run() {
        C4057s a = C4057s.m17245a();
        a.mo15021a("3492286671", "c4b21948fbe3073c0a2d405d296983c8");
        try {
            this.f10757a.mo8256a(a.mo15015a((Context) this.f10757a, C4057s.m17252c(), C4057s.m17253d(), "weiboandroidsdk://FollowActivity").mo14995a());
            if (this.f10757a.f10744g != null && this.f10757a.f10744g.isShowing()) {
                this.f10757a.f10744g.dismiss();
            }
        } catch (C4061w e) {
            this.f10757a.mo8255a(e);
            if (this.f10757a.f10744g != null && this.f10757a.f10744g.isShowing()) {
                this.f10757a.f10744g.dismiss();
            }
        } catch (Throwable th) {
            if (this.f10757a.f10744g != null && this.f10757a.f10744g.isShowing()) {
                this.f10757a.f10744g.dismiss();
            }
            throw th;
        }
    }
}
