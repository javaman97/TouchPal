package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.h */
/* compiled from: ExecutorDelivery */
class C0826h implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f2177a;

    /* renamed from: b */
    final /* synthetic */ C0824g f2178b;

    C0826h(C0824g gVar, Handler handler) {
        this.f2178b = gVar;
        this.f2177a = handler;
    }

    public void execute(Runnable runnable) {
        this.f2177a.post(runnable);
    }
}
