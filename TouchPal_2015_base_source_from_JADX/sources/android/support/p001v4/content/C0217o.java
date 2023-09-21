package android.support.p001v4.content;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.support.v4.content.o */
/* compiled from: ModernAsyncTask */
abstract class C0217o<Params, Progress, Result> {

    /* renamed from: a */
    private static final String f556a = "AsyncTask";

    /* renamed from: b */
    private static final int f557b = 5;

    /* renamed from: c */
    private static final int f558c = 128;

    /* renamed from: d */
    public static final Executor f559d = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f562g, f561f);

    /* renamed from: e */
    private static final int f560e = 1;

    /* renamed from: f */
    private static final ThreadFactory f561f = new C0223p();

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f562g = new LinkedBlockingQueue(10);

    /* renamed from: h */
    private static final int f563h = 1;

    /* renamed from: i */
    private static final int f564i = 2;

    /* renamed from: j */
    private static final C0220b f565j = new C0220b((C0223p) null);

    /* renamed from: k */
    private static volatile Executor f566k = f559d;

    /* renamed from: l */
    private final C0222d<Params, Result> f567l = new C0224q(this);

    /* renamed from: m */
    private final FutureTask<Result> f568m = new C0225r(this, this.f567l);

    /* renamed from: n */
    private volatile C0221c f569n = C0221c.PENDING;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f570o = new AtomicBoolean();

    /* renamed from: android.support.v4.content.o$c */
    /* compiled from: ModernAsyncTask */
    public enum C0221c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo637a(Params... paramsArr);

    /* renamed from: b */
    public static void m893b() {
        f565j.getLooper();
    }

    /* renamed from: a */
    public static void m892a(Executor executor) {
        f566k = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m896c(Result result) {
        if (!this.f570o.get()) {
            m897d(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m897d(Result result) {
        f565j.obtainMessage(1, new C0219a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: c */
    public final C0221c mo705c() {
        return this.f569n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo707d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo640a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo704b(Progress... progressArr) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo703b(Result result) {
        mo639a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo639a() {
    }

    /* renamed from: e */
    public final boolean mo709e() {
        return this.f568m.isCancelled();
    }

    /* renamed from: a */
    public final boolean mo702a(boolean z) {
        return this.f568m.cancel(z);
    }

    /* renamed from: f */
    public final Result mo710f() throws InterruptedException, ExecutionException {
        return this.f568m.get();
    }

    /* renamed from: a */
    public final Result mo701a(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f568m.get(j, timeUnit);
    }

    /* renamed from: c */
    public final C0217o<Params, Progress, Result> mo706c(Params... paramsArr) {
        return mo700a(f566k, paramsArr);
    }

    /* renamed from: a */
    public final C0217o<Params, Progress, Result> mo700a(Executor executor, Params... paramsArr) {
        if (this.f569n != C0221c.PENDING) {
            switch (this.f569n) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f569n = C0221c.RUNNING;
        mo707d();
        this.f567l.f578b = paramsArr;
        executor.execute(this.f568m);
        return this;
    }

    /* renamed from: a */
    public static void m891a(Runnable runnable) {
        f566k.execute(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo708d(Progress... progressArr) {
        if (!mo709e()) {
            f565j.obtainMessage(2, new C0219a(this, progressArr)).sendToTarget();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m898e(Result result) {
        if (mo709e()) {
            mo703b(result);
        } else {
            mo640a(result);
        }
        this.f569n = C0221c.FINISHED;
    }

    /* renamed from: android.support.v4.content.o$b */
    /* compiled from: ModernAsyncTask */
    private static class C0220b extends Handler {
        private C0220b() {
        }

        /* synthetic */ C0220b(C0223p pVar) {
            this();
        }

        public void handleMessage(Message message) {
            C0219a aVar = (C0219a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f572a.m898e(aVar.f573b[0]);
                    return;
                case 2:
                    aVar.f572a.mo704b((Progress[]) aVar.f573b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.content.o$d */
    /* compiled from: ModernAsyncTask */
    private static abstract class C0222d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f578b;

        private C0222d() {
        }

        /* synthetic */ C0222d(C0223p pVar) {
            this();
        }
    }

    /* renamed from: android.support.v4.content.o$a */
    /* compiled from: ModernAsyncTask */
    private static class C0219a<Data> {

        /* renamed from: a */
        final C0217o f572a;

        /* renamed from: b */
        final Data[] f573b;

        C0219a(C0217o oVar, Data... dataArr) {
            this.f572a = oVar;
            this.f573b = dataArr;
        }
    }
}
