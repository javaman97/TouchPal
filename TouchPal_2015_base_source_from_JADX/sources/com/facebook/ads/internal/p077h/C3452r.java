package com.facebook.ads.internal.p077h;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.ads.internal.h.r */
public class C3452r implements ThreadFactory {

    /* renamed from: a */
    protected final AtomicLong f15006a = new AtomicLong();

    /* renamed from: b */
    private int f15007b = Thread.currentThread().getPriority();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo10779a() {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", new Object[]{Long.valueOf(this.f15006a.incrementAndGet()), Long.valueOf(System.currentTimeMillis())});
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread((ThreadGroup) null, runnable, mo10779a(), 0);
        thread.setPriority(this.f15007b);
        return thread;
    }
}
