package com.p023a.p024a.p032b;

import android.content.Context;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p026a.p027a.C0724c;
import com.p023a.p024a.p025a.p026a.p027a.p028a.C0719d;
import com.p023a.p024a.p025a.p026a.p029b.C0726a;
import com.p023a.p024a.p025a.p026a.p029b.C0727b;
import com.p023a.p024a.p025a.p030b.C0739c;
import com.p023a.p024a.p025a.p030b.p031a.C0735f;
import com.p023a.p024a.p032b.p033a.C0759g;
import com.p023a.p024a.p032b.p033a.p034a.C0746c;
import com.p023a.p024a.p032b.p035b.C0763a;
import com.p023a.p024a.p032b.p035b.C0766b;
import com.p023a.p024a.p032b.p036c.C0771a;
import com.p023a.p024a.p032b.p036c.C0777e;
import com.p023a.p024a.p032b.p037d.C0781a;
import com.p023a.p024a.p032b.p037d.C0783b;
import com.p023a.p024a.p041c.C0813d;
import com.p023a.p024a.p041c.C0816g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.a.a.b.a */
/* compiled from: DefaultConfigurationFactory */
public class C0741a {
    /* renamed from: a */
    public static Executor m4213a(int i, int i2, C0759g gVar) {
        return new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, gVar == C0759g.LIFO ? new C0746c() : new LinkedBlockingQueue(), m4214a(i2, "uil-pool-"));
    }

    /* renamed from: a */
    public static Executor m4212a() {
        return Executors.newCachedThreadPool(m4214a(5, "uil-pool-d-"));
    }

    /* renamed from: b */
    public static C0726a m4215b() {
        return new C0727b();
    }

    /* renamed from: a */
    public static C0725b m4208a(Context context, C0726a aVar, long j, int i) {
        File b = m4216b(context);
        if (j > 0 || i > 0) {
            try {
                return new C0719d(C0816g.m4640b(context), b, aVar, j, i);
            } catch (IOException e) {
                C0813d.m4623a((Throwable) e);
            }
        }
        return new C0724c(C0816g.m4637a(context), b, aVar);
    }

    /* renamed from: b */
    private static File m4216b(Context context) {
        File a = C0816g.m4639a(context, false);
        File file = new File(a, "uil-images");
        if (file.exists() || file.mkdir()) {
            return file;
        }
        return a;
    }

    /* renamed from: a */
    public static C0739c m4209a(int i) {
        if (i == 0) {
            i = (int) (Runtime.getRuntime().maxMemory() / 8);
        }
        return new C0735f(i);
    }

    /* renamed from: a */
    public static C0783b m4211a(Context context) {
        return new C0781a(context);
    }

    /* renamed from: a */
    public static C0766b m4210a(boolean z) {
        return new C0763a(z);
    }

    /* renamed from: c */
    public static C0771a m4217c() {
        return new C0777e();
    }

    /* renamed from: a */
    private static ThreadFactory m4214a(int i, String str) {
        return new C0742a(i, str);
    }

    /* renamed from: com.a.a.b.a$a */
    /* compiled from: DefaultConfigurationFactory */
    private static class C0742a implements ThreadFactory {

        /* renamed from: a */
        private static final AtomicInteger f1824a = new AtomicInteger(1);

        /* renamed from: b */
        private final ThreadGroup f1825b;

        /* renamed from: c */
        private final AtomicInteger f1826c = new AtomicInteger(1);

        /* renamed from: d */
        private final String f1827d;

        /* renamed from: e */
        private final int f1828e;

        C0742a(int i, String str) {
            this.f1828e = i;
            this.f1825b = Thread.currentThread().getThreadGroup();
            this.f1827d = str + f1824a.getAndIncrement() + "-thread-";
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f1825b, runnable, this.f1827d + this.f1826c.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            thread.setPriority(this.f1828e);
            return thread;
        }
    }
}
