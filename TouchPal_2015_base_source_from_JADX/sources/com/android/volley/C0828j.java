package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.j */
/* compiled from: NetworkDispatcher */
public class C0828j extends Thread {

    /* renamed from: a */
    private final BlockingQueue<C0833o<?>> f2179a;

    /* renamed from: b */
    private final C0827i f2180b;

    /* renamed from: c */
    private final C0819c f2181c;

    /* renamed from: d */
    private final C0843t f2182d;

    /* renamed from: e */
    private volatile boolean f2183e = false;

    public C0828j(BlockingQueue<C0833o<?>> blockingQueue, C0827i iVar, C0819c cVar, C0843t tVar) {
        this.f2179a = blockingQueue;
        this.f2180b = iVar;
        this.f2181c = cVar;
        this.f2182d = tVar;
    }

    /* renamed from: a */
    public void mo3049a() {
        this.f2183e = true;
        interrupt();
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m4674a(C0833o<?> oVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(oVar.mo3068d());
        }
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                C0833o take = this.f2179a.take();
                try {
                    take.mo3061a("network-queue-take");
                    if (take.mo3074j()) {
                        take.mo3065b("network-discard-cancelled");
                    } else {
                        m4674a(take);
                        C0830l a = this.f2180b.mo3048a(take);
                        take.mo3061a("network-http-complete");
                        if (!a.f2187d || !take.mo3090y()) {
                            C0840s a2 = take.mo3059a(a);
                            take.mo3061a("network-parse-complete");
                            if (take.mo3084t() && a2.f2235b != null) {
                                this.f2181c.mo3030a(take.mo3071g(), a2.f2235b);
                                take.mo3061a("network-cache-written");
                            }
                            take.mo3089x();
                            this.f2182d.mo3043a((C0833o<?>) take, (C0840s<?>) a2);
                        } else {
                            take.mo3065b("not-modified");
                        }
                    }
                } catch (C0883x e) {
                    m4675a(take, e);
                } catch (Exception e2) {
                    C0884y.m4877a(e2, "Unhandled exception %s", e2.toString());
                    this.f2182d.mo3045a((C0833o<?>) take, new C0883x((Throwable) e2));
                }
            } catch (InterruptedException e3) {
                if (this.f2183e) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m4675a(C0833o<?> oVar, C0883x xVar) {
        this.f2182d.mo3045a(oVar, oVar.mo3060a(xVar));
    }
}
