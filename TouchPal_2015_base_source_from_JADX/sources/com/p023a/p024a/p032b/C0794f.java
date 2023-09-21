package com.p023a.p024a.p032b;

import com.p023a.p024a.p032b.p038e.C0790a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.a.a.b.f */
/* compiled from: ImageLoaderEngine */
class C0794f {

    /* renamed from: a */
    final C0785e f2055a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Executor f2056b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Executor f2057c;

    /* renamed from: d */
    private Executor f2058d;

    /* renamed from: e */
    private final Map<Integer, String> f2059e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    private final Map<String, ReentrantLock> f2060f = new WeakHashMap();

    /* renamed from: g */
    private final AtomicBoolean f2061g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f2062h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f2063i = new AtomicBoolean(false);

    /* renamed from: j */
    private final Object f2064j = new Object();

    C0794f(C0785e eVar) {
        this.f2055a = eVar;
        this.f2056b = eVar.f2000g;
        this.f2057c = eVar.f2001h;
        this.f2058d = C0741a.m4212a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2988a(C0802i iVar) {
        this.f2058d.execute(new C0799g(this, iVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2989a(C0807m mVar) {
        m4556h();
        this.f2057c.execute(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m4556h() {
        if (!this.f2055a.f2002i && ((ExecutorService) this.f2056b).isShutdown()) {
            this.f2056b = m4557i();
        }
        if (!this.f2055a.f2003j && ((ExecutorService) this.f2057c).isShutdown()) {
            this.f2057c = m4557i();
        }
    }

    /* renamed from: i */
    private Executor m4557i() {
        return C0741a.m4213a(this.f2055a.f2004k, this.f2055a.f2005l, this.f2055a.f2006m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo2984a(C0790a aVar) {
        return this.f2059e.get(Integer.valueOf(aVar.mo2980f()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2987a(C0790a aVar, String str) {
        this.f2059e.put(Integer.valueOf(aVar.mo2980f()), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2993b(C0790a aVar) {
        this.f2059e.remove(Integer.valueOf(aVar.mo2980f()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2991a(boolean z) {
        this.f2062h.set(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2994b(boolean z) {
        this.f2063i.set(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2986a() {
        this.f2061g.set(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2992b() {
        this.f2061g.set(false);
        synchronized (this.f2064j) {
            this.f2064j.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2995c() {
        if (!this.f2055a.f2002i) {
            ((ExecutorService) this.f2056b).shutdownNow();
        }
        if (!this.f2055a.f2003j) {
            ((ExecutorService) this.f2057c).shutdownNow();
        }
        this.f2059e.clear();
        this.f2060f.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2990a(Runnable runnable) {
        this.f2058d.execute(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ReentrantLock mo2985a(String str) {
        ReentrantLock reentrantLock = this.f2060f.get(str);
        if (reentrantLock != null) {
            return reentrantLock;
        }
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f2060f.put(str, reentrantLock2);
        return reentrantLock2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public AtomicBoolean mo2996d() {
        return this.f2061g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Object mo2997e() {
        return this.f2064j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2998f() {
        return this.f2062h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo2999g() {
        return this.f2063i.get();
    }
}
