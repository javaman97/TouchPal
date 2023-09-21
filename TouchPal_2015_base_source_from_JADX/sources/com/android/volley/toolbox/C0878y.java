package com.android.volley.toolbox;

import com.android.volley.C0833o;
import com.android.volley.C0840s;
import com.android.volley.C0883x;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.android.volley.toolbox.y */
/* compiled from: RequestFuture */
public class C0878y<T> implements C0840s.C0841a, C0840s.C0842b<T>, Future<T> {

    /* renamed from: a */
    private C0833o<?> f2324a;

    /* renamed from: b */
    private boolean f2325b = false;

    /* renamed from: c */
    private T f2326c;

    /* renamed from: d */
    private C0883x f2327d;

    /* renamed from: a */
    public static <E> C0878y<E> m4864a() {
        return new C0878y<>();
    }

    private C0878y() {
    }

    /* renamed from: a */
    public void mo3151a(C0833o<?> oVar) {
        this.f2324a = oVar;
    }

    public synchronized boolean cancel(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            if (this.f2324a != null) {
                if (!isDone()) {
                    this.f2324a.mo3073i();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public T get() throws InterruptedException, ExecutionException {
        try {
            return m4865a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m4865a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    /* renamed from: a */
    private synchronized T m4865a(Long l) throws InterruptedException, ExecutionException, TimeoutException {
        T t;
        if (this.f2327d != null) {
            throw new ExecutionException(this.f2327d);
        } else if (this.f2325b) {
            t = this.f2326c;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.f2327d != null) {
                throw new ExecutionException(this.f2327d);
            } else if (!this.f2325b) {
                throw new TimeoutException();
            } else {
                t = this.f2326c;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        if (this.f2324a == null) {
            return false;
        }
        return this.f2324a.mo3074j();
    }

    public synchronized boolean isDone() {
        return this.f2325b || this.f2327d != null || isCancelled();
    }

    /* renamed from: a */
    public synchronized void mo3103a(T t) {
        this.f2325b = true;
        this.f2326c = t;
        notifyAll();
    }

    /* renamed from: a */
    public synchronized void mo3102a(C0883x xVar) {
        this.f2327d = xVar;
        notifyAll();
    }
}
