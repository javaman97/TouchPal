package com.cootek.smartinput.utilities;

import android.os.Handler;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput.utilities.C */
/* compiled from: WorkerHandler */
public class C0986C {

    /* renamed from: c */
    private static final String f2555c = "worker";

    /* renamed from: d */
    private static final int f2556d = 0;

    /* renamed from: e */
    private static final int f2557e = 1;

    /* renamed from: f */
    private static int f2558f = 0;

    /* renamed from: g */
    private static final int f2559g = 1;

    /* renamed from: a */
    LinkedList<C0985B> f2560a = new LinkedList<>();

    /* renamed from: b */
    Object f2561b = new Object();

    /* renamed from: h */
    private Thread[] f2562h = new Thread[1];

    /* renamed from: i */
    private int f2563i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f2564j = new C0988D(this);

    /* renamed from: c */
    static /* synthetic */ int m5106c() {
        int i = f2558f;
        f2558f = i + 1;
        return i;
    }

    public C0986C(int i) {
        this.f2563i = i;
        for (int i2 = 0; i2 < 1; i2++) {
            this.f2562h[i2] = new Thread(new C0987a(this));
            this.f2562h[i2].start();
        }
    }

    /* renamed from: a */
    public int mo4038a() {
        return this.f2563i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C0985B mo4040b() {
        return this.f2560a.poll();
    }

    /* renamed from: e */
    private synchronized void m5107e(C0985B b) {
        this.f2560a.offer(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4039a(C0985B b) {
        b.f2553c = false;
        b.f2551a = true;
        b.mo4035f();
        m5107e(b);
        synchronized (this.f2561b) {
            this.f2561b.notify();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4041b(C0985B b) {
        b.f2553c = false;
        this.f2564j.removeMessages(0, b);
        this.f2564j.sendMessage(this.f2564j.obtainMessage(0, b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4042c(C0985B b) {
        if (b != null) {
            this.f2564j.removeMessages(0, b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4043d(C0985B b) {
        this.f2564j.sendMessage(this.f2564j.obtainMessage(1, b));
    }

    /* renamed from: com.cootek.smartinput.utilities.C$a */
    /* compiled from: WorkerHandler */
    class C0987a extends C0985B {

        /* renamed from: e */
        int f2565e = C0986C.m5106c();

        C0987a(C0986C c) {
        }

        public void run() {
            while (true) {
                C0985B b = C0986C.this.mo4040b();
                if (b != null) {
                    if (!b.mo4033d()) {
                        b.run();
                    }
                    C0986C.this.mo4043d(b);
                } else {
                    synchronized (C0986C.this.f2561b) {
                        try {
                            C0986C.this.f2561b.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo4036g() {
        }

        /* renamed from: f */
        public void mo4035f() {
        }

        /* renamed from: b */
        public void mo4030b(Object obj) {
        }
    }
}
