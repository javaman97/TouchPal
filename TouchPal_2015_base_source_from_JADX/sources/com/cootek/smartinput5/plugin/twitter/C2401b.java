package com.cootek.smartinput5.plugin.twitter;

import android.content.Context;

/* renamed from: com.cootek.smartinput5.plugin.twitter.b */
/* compiled from: AuthorizeActivity */
class C2401b extends Thread {

    /* renamed from: a */
    final /* synthetic */ AuthorizeActivity f10533a;

    C2401b(AuthorizeActivity authorizeActivity) {
        this.f10533a = authorizeActivity;
    }

    public void run() {
        try {
            C2423x.m11065a(new C2402c(this), (Runnable) null);
            this.f10533a.f10502b.mo8161a((Context) this.f10533a);
            this.f10533a.m10968d();
            if (!this.f10533a.f10506f) {
                this.f10533a.f10502b.mo8167b((Context) this.f10533a);
            }
            this.f10533a.m10968d();
            this.f10533a.finish();
            if (!this.f10533a.f10506f) {
                this.f10533a.m10960a(this.f10533a.f10504d);
            }
        } catch (C2421v e) {
            C2421v unused = this.f10533a.f10504d = e;
            this.f10533a.m10968d();
            this.f10533a.finish();
            if (!this.f10533a.f10506f) {
                this.f10533a.m10960a(this.f10533a.f10504d);
            }
        } catch (Throwable th) {
            this.f10533a.m10968d();
            this.f10533a.finish();
            if (!this.f10533a.f10506f) {
                this.f10533a.m10960a(this.f10533a.f10504d);
            }
            throw th;
        }
    }
}
