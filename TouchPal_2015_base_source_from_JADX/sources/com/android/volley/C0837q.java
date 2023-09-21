package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.volley.q */
/* compiled from: RequestQueue */
public class C0837q {

    /* renamed from: f */
    private static final int f2221f = 4;

    /* renamed from: a */
    private AtomicInteger f2222a;

    /* renamed from: b */
    private final Map<String, Queue<C0833o<?>>> f2223b;

    /* renamed from: c */
    private final Set<C0833o<?>> f2224c;

    /* renamed from: d */
    private final PriorityBlockingQueue<C0833o<?>> f2225d;

    /* renamed from: e */
    private final PriorityBlockingQueue<C0833o<?>> f2226e;

    /* renamed from: g */
    private final C0819c f2227g;

    /* renamed from: h */
    private final C0827i f2228h;

    /* renamed from: i */
    private final C0843t f2229i;

    /* renamed from: j */
    private C0828j[] f2230j;

    /* renamed from: k */
    private C0821d f2231k;

    /* renamed from: com.android.volley.q$a */
    /* compiled from: RequestQueue */
    public interface C0838a {
        /* renamed from: a */
        boolean mo3100a(C0833o<?> oVar);
    }

    public C0837q(C0819c cVar, C0827i iVar, int i, C0843t tVar) {
        this.f2222a = new AtomicInteger();
        this.f2223b = new HashMap();
        this.f2224c = new HashSet();
        this.f2225d = new PriorityBlockingQueue<>();
        this.f2226e = new PriorityBlockingQueue<>();
        this.f2227g = cVar;
        this.f2228h = iVar;
        this.f2230j = new C0828j[i];
        this.f2229i = tVar;
    }

    public C0837q(C0819c cVar, C0827i iVar, int i) {
        this(cVar, iVar, i, new C0824g(new Handler(Looper.getMainLooper())));
    }

    public C0837q(C0819c cVar, C0827i iVar) {
        this(cVar, iVar, 4);
    }

    /* renamed from: a */
    public void mo3093a() {
        mo3096b();
        this.f2231k = new C0821d(this.f2225d, this.f2226e, this.f2227g, this.f2229i);
        this.f2231k.start();
        for (int i = 0; i < this.f2230j.length; i++) {
            C0828j jVar = new C0828j(this.f2226e, this.f2228h, this.f2227g, this.f2229i);
            this.f2230j[i] = jVar;
            jVar.start();
        }
    }

    /* renamed from: b */
    public void mo3096b() {
        if (this.f2231k != null) {
            this.f2231k.mo3036a();
        }
        for (int i = 0; i < this.f2230j.length; i++) {
            if (this.f2230j[i] != null) {
                this.f2230j[i].mo3049a();
            }
        }
    }

    /* renamed from: c */
    public int mo3098c() {
        return this.f2222a.incrementAndGet();
    }

    /* renamed from: d */
    public C0819c mo3099d() {
        return this.f2227g;
    }

    /* renamed from: a */
    public void mo3094a(C0838a aVar) {
        synchronized (this.f2224c) {
            for (C0833o next : this.f2224c) {
                if (aVar.mo3100a(next)) {
                    next.mo3073i();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3095a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
        }
        mo3094a((C0838a) new C0839r(this, obj));
    }

    /* renamed from: a */
    public <T> C0833o<T> mo3092a(C0833o<T> oVar) {
        oVar.mo3055a(this);
        synchronized (this.f2224c) {
            this.f2224c.add(oVar);
        }
        oVar.mo3053a(mo3098c());
        oVar.mo3061a("add-to-queue");
        if (!oVar.mo3084t()) {
            this.f2226e.add(oVar);
        } else {
            synchronized (this.f2223b) {
                String g = oVar.mo3071g();
                if (this.f2223b.containsKey(g)) {
                    Queue queue = this.f2223b.get(g);
                    if (queue == null) {
                        queue = new LinkedList();
                    }
                    queue.add(oVar);
                    this.f2223b.put(g, queue);
                    if (C0884y.f2331b) {
                        C0884y.m4876a("Request for cacheKey=%s is in flight, putting on hold.", g);
                    }
                } else {
                    this.f2223b.put(g, (Object) null);
                    this.f2225d.add(oVar);
                }
            }
        }
        return oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3097b(C0833o<?> oVar) {
        synchronized (this.f2224c) {
            this.f2224c.remove(oVar);
        }
        if (oVar.mo3084t()) {
            synchronized (this.f2223b) {
                String g = oVar.mo3071g();
                Queue remove = this.f2223b.remove(g);
                if (remove != null) {
                    if (C0884y.f2331b) {
                        C0884y.m4876a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), g);
                    }
                    this.f2225d.addAll(remove);
                }
            }
        }
    }
}
