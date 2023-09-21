package com.android.volley;

import android.os.Process;
import com.android.volley.C0819c;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.d */
/* compiled from: CacheDispatcher */
public class C0821d extends Thread {

    /* renamed from: a */
    private static final boolean f2157a = C0884y.f2331b;

    /* renamed from: b */
    private final BlockingQueue<C0833o<?>> f2158b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<C0833o<?>> f2159c;

    /* renamed from: d */
    private final C0819c f2160d;

    /* renamed from: e */
    private final C0843t f2161e;

    /* renamed from: f */
    private volatile boolean f2162f = false;

    public C0821d(BlockingQueue<C0833o<?>> blockingQueue, BlockingQueue<C0833o<?>> blockingQueue2, C0819c cVar, C0843t tVar) {
        this.f2158b = blockingQueue;
        this.f2159c = blockingQueue2;
        this.f2160d = cVar;
        this.f2161e = tVar;
    }

    /* renamed from: a */
    public void mo3036a() {
        this.f2162f = true;
        interrupt();
    }

    public void run() {
        if (f2157a) {
            C0884y.m4876a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f2160d.mo3029a();
        while (true) {
            try {
                C0833o take = this.f2158b.take();
                take.mo3061a("cache-queue-take");
                if (take.mo3074j()) {
                    take.mo3065b("cache-discard-canceled");
                } else {
                    C0819c.C0820a a = this.f2160d.mo3028a(take.mo3071g());
                    if (a == null) {
                        take.mo3061a("cache-miss");
                        this.f2159c.put(take);
                    } else if (a.mo3034a()) {
                        take.mo3061a("cache-hit-expired");
                        take.mo3054a(a);
                        this.f2159c.put(take);
                    } else {
                        take.mo3061a("cache-hit");
                        C0840s a2 = take.mo3059a(new C0830l(a.f2151a, a.f2156f));
                        take.mo3061a("cache-hit-parsed");
                        if (!a.mo3035b()) {
                            this.f2161e.mo3043a((C0833o<?>) take, (C0840s<?>) a2);
                        } else {
                            take.mo3061a("cache-hit-refresh-needed");
                            take.mo3054a(a);
                            a2.f2237d = true;
                            this.f2161e.mo3044a(take, a2, new C0822e(this, take));
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f2162f) {
                    return;
                }
            }
        }
    }
}
