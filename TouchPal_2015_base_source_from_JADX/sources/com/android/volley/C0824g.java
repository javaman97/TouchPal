package com.android.volley;

import android.os.Handler;
import com.cootek.smartinput5.p066ui.EnterKey;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.g */
/* compiled from: ExecutorDelivery */
public class C0824g implements C0843t {

    /* renamed from: a */
    private final Executor f2172a;

    public C0824g(Handler handler) {
        this.f2172a = new C0826h(this, handler);
    }

    public C0824g(Executor executor) {
        this.f2172a = executor;
    }

    /* renamed from: a */
    public void mo3043a(C0833o<?> oVar, C0840s<?> sVar) {
        mo3044a(oVar, sVar, (Runnable) null);
    }

    /* renamed from: a */
    public void mo3044a(C0833o<?> oVar, C0840s<?> sVar, Runnable runnable) {
        oVar.mo3089x();
        oVar.mo3061a("post-response");
        this.f2172a.execute(new C0825a(oVar, sVar, runnable));
    }

    /* renamed from: a */
    public void mo3045a(C0833o<?> oVar, C0883x xVar) {
        oVar.mo3061a("post-error");
        this.f2172a.execute(new C0825a(oVar, C0840s.m4728a(xVar), (Runnable) null));
    }

    /* renamed from: com.android.volley.g$a */
    /* compiled from: ExecutorDelivery */
    private class C0825a implements Runnable {

        /* renamed from: b */
        private final C0833o f2174b;

        /* renamed from: c */
        private final C0840s f2175c;

        /* renamed from: d */
        private final Runnable f2176d;

        public C0825a(C0833o oVar, C0840s sVar, Runnable runnable) {
            this.f2174b = oVar;
            this.f2175c = sVar;
            this.f2176d = runnable;
        }

        public void run() {
            if (this.f2174b.mo3074j()) {
                this.f2174b.mo3065b("canceled-at-delivery");
                return;
            }
            if (this.f2175c.mo3101a()) {
                this.f2174b.mo3064b(this.f2175c.f2234a);
            } else {
                this.f2174b.mo3063b(this.f2175c.f2236c);
            }
            if (this.f2175c.f2237d) {
                this.f2174b.mo3061a("intermediate-response");
            } else {
                this.f2174b.mo3065b(EnterKey.DONE);
            }
            if (this.f2176d != null) {
                this.f2176d.run();
            }
        }
    }
}
