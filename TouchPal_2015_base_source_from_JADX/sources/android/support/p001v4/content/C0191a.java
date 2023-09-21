package android.support.p001v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p001v4.p016k.C0319n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;

/* renamed from: android.support.v4.content.a */
/* compiled from: AsyncTaskLoader */
public abstract class C0191a<D> extends C0210l<D> {

    /* renamed from: a */
    static final String f486a = "AsyncTaskLoader";

    /* renamed from: b */
    static final boolean f487b = false;

    /* renamed from: c */
    volatile C0191a<D>.a f488c;

    /* renamed from: d */
    volatile C0191a<D>.a f489d;

    /* renamed from: e */
    long f490e;

    /* renamed from: f */
    long f491f = -10000;

    /* renamed from: g */
    Handler f492g;

    /* renamed from: d */
    public abstract D mo634d();

    /* renamed from: android.support.v4.content.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C0192a extends C0217o<Void, Void, D> implements Runnable {

        /* renamed from: a */
        D f493a;

        /* renamed from: b */
        boolean f494b;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public CountDownLatch f496e = new CountDownLatch(1);

        C0192a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo637a(Void... voidArr) {
            this.f493a = C0191a.this.mo635e();
            return this.f493a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo640a(D d) {
            try {
                C0191a.this.mo631b(this, d);
            } finally {
                this.f496e.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo639a() {
            try {
                C0191a.this.mo628a(this, this.f493a);
            } finally {
                this.f496e.countDown();
            }
        }

        public void run() {
            this.f494b = false;
            C0191a.this.mo633c();
        }
    }

    public C0191a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo627a(long j) {
        this.f490e = j;
        if (j != 0) {
            this.f492g = new Handler();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo626a() {
        super.mo626a();
        mo632b();
        this.f488c = new C0192a();
        mo633c();
    }

    /* renamed from: b */
    public boolean mo632b() {
        boolean z = false;
        if (this.f488c != null) {
            if (this.f489d != null) {
                if (this.f488c.f494b) {
                    this.f488c.f494b = false;
                    this.f492g.removeCallbacks(this.f488c);
                }
                this.f488c = null;
            } else if (this.f488c.f494b) {
                this.f488c.f494b = false;
                this.f492g.removeCallbacks(this.f488c);
                this.f488c = null;
            } else {
                z = this.f488c.mo702a(false);
                if (z) {
                    this.f489d = this.f488c;
                }
                this.f488c = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo629a(D d) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo633c() {
        if (this.f489d == null && this.f488c != null) {
            if (this.f488c.f494b) {
                this.f488c.f494b = false;
                this.f492g.removeCallbacks(this.f488c);
            }
            if (this.f490e <= 0 || SystemClock.uptimeMillis() >= this.f491f + this.f490e) {
                this.f488c.mo700a(C0217o.f559d, (Params[]) null);
                return;
            }
            this.f488c.f494b = true;
            this.f492g.postAtTime(this.f488c, this.f491f + this.f490e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo628a(C0191a<D>.a aVar, D d) {
        mo629a(d);
        if (this.f489d == aVar) {
            mo675C();
            this.f491f = SystemClock.uptimeMillis();
            this.f489d = null;
            mo633c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo631b(C0191a<D>.a aVar, D d) {
        if (this.f488c != aVar) {
            mo628a(aVar, d);
        } else if (mo683s()) {
            mo629a(d);
        } else {
            mo674B();
            this.f491f = SystemClock.uptimeMillis();
            this.f488c = null;
            mo647b(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public D mo635e() {
        return mo634d();
    }

    /* renamed from: f */
    public void mo636f() {
        C0191a<D>.a aVar = this.f488c;
        if (aVar != null) {
            try {
                aVar.f496e.await();
            } catch (InterruptedException e) {
            }
        }
    }

    /* renamed from: a */
    public void mo630a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo630a(str, fileDescriptor, printWriter, strArr);
        if (this.f488c != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f488c);
            printWriter.print(" waiting=");
            printWriter.println(this.f488c.f494b);
        }
        if (this.f489d != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f489d);
            printWriter.print(" waiting=");
            printWriter.println(this.f489d.f494b);
        }
        if (this.f490e != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0319n.m1309a(this.f490e, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0319n.m1308a(this.f491f, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
