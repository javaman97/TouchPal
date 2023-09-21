package android.support.p001v4.app;

import android.os.Bundle;
import android.support.p001v4.app.C0048J;
import android.support.p001v4.content.C0210l;
import android.support.p001v4.p016k.C0303f;
import android.support.p001v4.p016k.C0318m;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.app.K */
/* compiled from: LoaderManager */
class C0050K extends C0048J {

    /* renamed from: a */
    static final String f84a = "LoaderManager";

    /* renamed from: b */
    static boolean f85b = false;

    /* renamed from: c */
    final C0318m<C0051a> f86c = new C0318m<>();

    /* renamed from: d */
    final C0318m<C0051a> f87d = new C0318m<>();

    /* renamed from: e */
    final String f88e;

    /* renamed from: f */
    C0167o f89f;

    /* renamed from: g */
    boolean f90g;

    /* renamed from: h */
    boolean f91h;

    /* renamed from: i */
    boolean f92i;

    /* renamed from: j */
    boolean f93j;

    /* renamed from: android.support.v4.app.K$a */
    /* compiled from: LoaderManager */
    final class C0051a implements C0210l.C0212b<Object> {

        /* renamed from: a */
        final int f94a;

        /* renamed from: b */
        final Bundle f95b;

        /* renamed from: c */
        C0048J.C0049a<Object> f96c;

        /* renamed from: d */
        C0210l<Object> f97d;

        /* renamed from: e */
        boolean f98e;

        /* renamed from: f */
        boolean f99f;

        /* renamed from: g */
        Object f100g;

        /* renamed from: h */
        boolean f101h;

        /* renamed from: i */
        boolean f102i;

        /* renamed from: j */
        boolean f103j;

        /* renamed from: k */
        boolean f104k;

        /* renamed from: l */
        boolean f105l;

        /* renamed from: m */
        boolean f106m;

        /* renamed from: n */
        C0051a f107n;

        public C0051a(int i, Bundle bundle, C0048J.C0049a<Object> aVar) {
            this.f94a = i;
            this.f95b = bundle;
            this.f96c = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo207a() {
            if (this.f102i && this.f103j) {
                this.f101h = true;
            } else if (!this.f101h) {
                this.f101h = true;
                if (C0050K.f85b) {
                    Log.v(C0050K.f84a, "  Starting: " + this);
                }
                if (this.f97d == null && this.f96c != null) {
                    this.f97d = this.f96c.mo194a(this.f94a, this.f95b);
                }
                if (this.f97d == null) {
                    return;
                }
                if (!this.f97d.getClass().isMemberClass() || Modifier.isStatic(this.f97d.getClass().getModifiers())) {
                    if (!this.f106m) {
                        this.f97d.mo677a(this.f94a, this);
                        this.f106m = true;
                    }
                    this.f97d.mo686u();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f97d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo210b() {
            if (C0050K.f85b) {
                Log.v(C0050K.f84a, "  Retaining: " + this);
            }
            this.f102i = true;
            this.f103j = this.f101h;
            this.f101h = false;
            this.f96c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo212c() {
            if (this.f102i) {
                if (C0050K.f85b) {
                    Log.v(C0050K.f84a, "  Finished Retaining: " + this);
                }
                this.f102i = false;
                if (this.f101h != this.f103j && !this.f101h) {
                    mo214e();
                }
            }
            if (this.f101h && this.f98e && !this.f104k) {
                mo211b(this.f97d, this.f100g);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo213d() {
            if (this.f101h && this.f104k) {
                this.f104k = false;
                if (this.f98e) {
                    mo211b(this.f97d, this.f100g);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo214e() {
            if (C0050K.f85b) {
                Log.v(C0050K.f84a, "  Stopping: " + this);
            }
            this.f101h = false;
            if (!this.f102i && this.f97d != null && this.f106m) {
                this.f106m = false;
                this.f97d.mo678a(this);
                this.f97d.mo688w();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo215f() {
            String str;
            if (C0050K.f85b) {
                Log.v(C0050K.f84a, "  Destroying: " + this);
            }
            this.f105l = true;
            boolean z = this.f99f;
            this.f99f = false;
            if (this.f96c != null && this.f97d != null && this.f98e && z) {
                if (C0050K.f85b) {
                    Log.v(C0050K.f84a, "  Reseting: " + this);
                }
                if (C0050K.this.f89f != null) {
                    String str2 = C0050K.this.f89f.mFragments.f452A;
                    C0050K.this.f89f.mFragments.f452A = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f96c.mo195a(this.f97d);
                } finally {
                    if (C0050K.this.f89f != null) {
                        C0050K.this.f89f.mFragments.f452A = str;
                    }
                }
            }
            this.f96c = null;
            this.f100g = null;
            this.f98e = false;
            if (this.f97d != null) {
                if (this.f106m) {
                    this.f106m = false;
                    this.f97d.mo678a(this);
                }
                this.f97d.mo691z();
            }
            if (this.f107n != null) {
                this.f107n.mo215f();
            }
        }

        /* renamed from: a */
        public void mo208a(C0210l<Object> lVar, Object obj) {
            if (C0050K.f85b) {
                Log.v(C0050K.f84a, "onLoadComplete: " + this);
            }
            if (this.f105l) {
                if (C0050K.f85b) {
                    Log.v(C0050K.f84a, "  Ignoring load complete -- destroyed");
                }
            } else if (C0050K.this.f86c.mo1014a(this.f94a) == this) {
                C0051a aVar = this.f107n;
                if (aVar != null) {
                    if (C0050K.f85b) {
                        Log.v(C0050K.f84a, "  Switching to pending loader: " + aVar);
                    }
                    this.f107n = null;
                    C0050K.this.f86c.mo1019b(this.f94a, null);
                    mo215f();
                    C0050K.this.mo197a(aVar);
                    return;
                }
                if (this.f100g != obj || !this.f98e) {
                    this.f100g = obj;
                    this.f98e = true;
                    if (this.f101h) {
                        mo211b(lVar, obj);
                    }
                }
                C0051a a = C0050K.this.f87d.mo1014a(this.f94a);
                if (!(a == null || a == this)) {
                    a.f99f = false;
                    a.mo215f();
                    C0050K.this.f87d.mo1021c(this.f94a);
                }
                if (C0050K.this.f89f != null && !C0050K.this.mo191a()) {
                    C0050K.this.f89f.mFragments.mo595i();
                }
            } else if (C0050K.f85b) {
                Log.v(C0050K.f84a, "  Ignoring load complete -- not active");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo211b(C0210l<Object> lVar, Object obj) {
            String str;
            if (this.f96c != null) {
                if (C0050K.this.f89f != null) {
                    String str2 = C0050K.this.f89f.mFragments.f452A;
                    C0050K.this.f89f.mFragments.f452A = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0050K.f85b) {
                        Log.v(C0050K.f84a, "  onLoadFinished in " + lVar + ": " + lVar.mo679c(obj));
                    }
                    this.f96c.mo196a(lVar, obj);
                    this.f99f = true;
                } finally {
                    if (C0050K.this.f89f != null) {
                        C0050K.this.f89f.mFragments.f452A = str;
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f94a);
            sb.append(" : ");
            C0303f.m1215a(this.f97d, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo209a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f94a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f95b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f96c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f97d);
            if (this.f97d != null) {
                this.f97d.mo630a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f98e || this.f99f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f98e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f99f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f100g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f101h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f104k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f105l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f102i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f103j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f106m);
            if (this.f107n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f107n);
                printWriter.println(":");
                this.f107n.mo209a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }
    }

    C0050K(String str, C0167o oVar, boolean z) {
        this.f88e = str;
        this.f89f = oVar;
        this.f90g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo198a(C0167o oVar) {
        this.f89f = oVar;
    }

    /* renamed from: c */
    private C0051a m112c(int i, Bundle bundle, C0048J.C0049a<Object> aVar) {
        C0051a aVar2 = new C0051a(i, bundle, aVar);
        aVar2.f97d = aVar.mo194a(i, bundle);
        return aVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private C0051a m113d(int i, Bundle bundle, C0048J.C0049a<Object> aVar) {
        try {
            this.f93j = true;
            C0051a c = m112c(i, bundle, aVar);
            mo197a(c);
            this.f93j = false;
            return c;
        } catch (Throwable th) {
            this.f93j = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo197a(C0051a aVar) {
        this.f86c.mo1019b(aVar.f94a, aVar);
        if (this.f90g) {
            aVar.mo207a();
        }
    }

    /* renamed from: a */
    public <D> C0210l<D> mo188a(int i, Bundle bundle, C0048J.C0049a<D> aVar) {
        if (this.f93j) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0051a a = this.f86c.mo1014a(i);
        if (f85b) {
            Log.v(f84a, "initLoader in " + this + ": args=" + bundle);
        }
        if (a == null) {
            a = m113d(i, bundle, aVar);
            if (f85b) {
                Log.v(f84a, "  Created new loader " + a);
            }
        } else {
            if (f85b) {
                Log.v(f84a, "  Re-using existing loader " + a);
            }
            a.f96c = aVar;
        }
        if (a.f98e && this.f90g) {
            a.mo211b(a.f97d, a.f100g);
        }
        return a.f97d;
    }

    /* renamed from: b */
    public <D> C0210l<D> mo193b(int i, Bundle bundle, C0048J.C0049a<D> aVar) {
        if (this.f93j) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0051a a = this.f86c.mo1014a(i);
        if (f85b) {
            Log.v(f84a, "restartLoader in " + this + ": args=" + bundle);
        }
        if (a != null) {
            C0051a a2 = this.f87d.mo1014a(i);
            if (a2 == null) {
                if (f85b) {
                    Log.v(f84a, "  Making last loader inactive: " + a);
                }
                a.f97d.mo689x();
                this.f87d.mo1019b(i, a);
            } else if (a.f98e) {
                if (f85b) {
                    Log.v(f84a, "  Removing last inactive loader: " + a);
                }
                a2.f99f = false;
                a2.mo215f();
                a.f97d.mo689x();
                this.f87d.mo1019b(i, a);
            } else if (!a.f101h) {
                if (f85b) {
                    Log.v(f84a, "  Current loader is stopped; replacing");
                }
                this.f86c.mo1019b(i, null);
                a.mo215f();
            } else {
                if (a.f107n != null) {
                    if (f85b) {
                        Log.v(f84a, "  Removing pending loader: " + a.f107n);
                    }
                    a.f107n.mo215f();
                    a.f107n = null;
                }
                if (f85b) {
                    Log.v(f84a, "  Enqueuing as new pending loader");
                }
                a.f107n = m112c(i, bundle, aVar);
                return a.f107n.f97d;
            }
        }
        return m113d(i, bundle, aVar).f97d;
    }

    /* renamed from: a */
    public void mo189a(int i) {
        if (this.f93j) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f85b) {
            Log.v(f84a, "destroyLoader in " + this + " of " + i);
        }
        int g = this.f86c.mo1028g(i);
        if (g >= 0) {
            this.f86c.mo1024d(g);
            this.f86c.mo1027f(g).mo215f();
        }
        int g2 = this.f87d.mo1028g(i);
        if (g2 >= 0) {
            this.f87d.mo1024d(g2);
            this.f87d.mo1027f(g2).mo215f();
        }
        if (this.f89f != null && !mo191a()) {
            this.f89f.mFragments.mo595i();
        }
    }

    /* renamed from: b */
    public <D> C0210l<D> mo192b(int i) {
        if (this.f93j) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0051a a = this.f86c.mo1014a(i);
        if (a == null) {
            return null;
        }
        if (a.f107n != null) {
            return a.f107n.f97d;
        }
        return a.f97d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo199b() {
        if (f85b) {
            Log.v(f84a, "Starting in " + this);
        }
        if (this.f90g) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f84a, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f90g = true;
        for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
            this.f86c.mo1027f(b).mo207a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo200c() {
        if (f85b) {
            Log.v(f84a, "Stopping in " + this);
        }
        if (!this.f90g) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f84a, "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
            this.f86c.mo1027f(b).mo214e();
        }
        this.f90g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo201d() {
        if (f85b) {
            Log.v(f84a, "Retaining in " + this);
        }
        if (!this.f90g) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f84a, "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f91h = true;
        this.f90g = false;
        for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
            this.f86c.mo1027f(b).mo210b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo202e() {
        if (this.f91h) {
            if (f85b) {
                Log.v(f84a, "Finished Retaining in " + this);
            }
            this.f91h = false;
            for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
                this.f86c.mo1027f(b).mo212c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo203f() {
        for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
            this.f86c.mo1027f(b).f104k = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo204g() {
        for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
            this.f86c.mo1027f(b).mo213d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo205h() {
        if (!this.f91h) {
            if (f85b) {
                Log.v(f84a, "Destroying Active in " + this);
            }
            for (int b = this.f86c.mo1017b() - 1; b >= 0; b--) {
                this.f86c.mo1027f(b).mo215f();
            }
            this.f86c.mo1020c();
        }
        if (f85b) {
            Log.v(f84a, "Destroying Inactive in " + this);
        }
        for (int b2 = this.f87d.mo1017b() - 1; b2 >= 0; b2--) {
            this.f87d.mo1027f(b2).mo215f();
        }
        this.f87d.mo1020c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0303f.m1215a(this.f89f, sb);
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo190a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f86c.mo1017b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f86c.mo1017b(); i++) {
                C0051a f = this.f86c.mo1027f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f86c.mo1026e(i));
                printWriter.print(": ");
                printWriter.println(f.toString());
                f.mo209a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f87d.mo1017b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f87d.mo1017b(); i2++) {
                C0051a f2 = this.f87d.mo1027f(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f87d.mo1026e(i2));
                printWriter.print(": ");
                printWriter.println(f2.toString());
                f2.mo209a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: a */
    public boolean mo191a() {
        boolean z;
        int b = this.f86c.mo1017b();
        boolean z2 = false;
        for (int i = 0; i < b; i++) {
            C0051a f = this.f86c.mo1027f(i);
            if (!f.f101h || f.f99f) {
                z = false;
            } else {
                z = true;
            }
            z2 |= z;
        }
        return z2;
    }
}
