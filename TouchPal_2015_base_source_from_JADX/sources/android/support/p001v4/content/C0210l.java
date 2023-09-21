package android.support.p001v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p001v4.p016k.C0303f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.l */
/* compiled from: Loader */
public class C0210l<D> {

    /* renamed from: o */
    int f531o;

    /* renamed from: p */
    C0212b<D> f532p;

    /* renamed from: q */
    Context f533q;

    /* renamed from: r */
    boolean f534r = false;

    /* renamed from: s */
    boolean f535s = false;

    /* renamed from: t */
    boolean f536t = true;

    /* renamed from: u */
    boolean f537u = false;

    /* renamed from: v */
    boolean f538v = false;

    /* renamed from: android.support.v4.content.l$b */
    /* compiled from: Loader */
    public interface C0212b<D> {
        /* renamed from: a */
        void mo208a(C0210l<D> lVar, D d);
    }

    /* renamed from: android.support.v4.content.l$a */
    /* compiled from: Loader */
    public final class C0211a extends ContentObserver {
        public C0211a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0210l.this.mo676D();
        }
    }

    public C0210l(Context context) {
        this.f533q = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo647b(D d) {
        if (this.f532p != null) {
            this.f532p.mo208a(this, d);
        }
    }

    /* renamed from: p */
    public Context mo680p() {
        return this.f533q;
    }

    /* renamed from: q */
    public int mo681q() {
        return this.f531o;
    }

    /* renamed from: a */
    public void mo677a(int i, C0212b<D> bVar) {
        if (this.f532p != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f532p = bVar;
        this.f531o = i;
    }

    /* renamed from: a */
    public void mo678a(C0212b<D> bVar) {
        if (this.f532p == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f532p != bVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f532p = null;
        }
    }

    /* renamed from: r */
    public boolean mo682r() {
        return this.f534r;
    }

    /* renamed from: s */
    public boolean mo683s() {
        return this.f535s;
    }

    /* renamed from: t */
    public boolean mo684t() {
        return this.f536t;
    }

    /* renamed from: u */
    public final void mo686u() {
        this.f534r = true;
        this.f536t = false;
        this.f535s = false;
        mo651h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo651h() {
    }

    /* renamed from: v */
    public void mo687v() {
        mo626a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo626a() {
    }

    /* renamed from: w */
    public void mo688w() {
        this.f534r = false;
        mo652i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo652i() {
    }

    /* renamed from: x */
    public void mo689x() {
        this.f535s = true;
        mo690y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo690y() {
    }

    /* renamed from: z */
    public void mo691z() {
        mo653j();
        this.f536t = true;
        this.f534r = false;
        this.f535s = false;
        this.f537u = false;
        this.f538v = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo653j() {
    }

    /* renamed from: A */
    public boolean mo673A() {
        boolean z = this.f537u;
        this.f537u = false;
        this.f538v |= z;
        return z;
    }

    /* renamed from: B */
    public void mo674B() {
        this.f538v = false;
    }

    /* renamed from: C */
    public void mo675C() {
        if (this.f538v) {
            this.f537u = true;
        }
    }

    /* renamed from: D */
    public void mo676D() {
        if (this.f534r) {
            mo687v();
        } else {
            this.f537u = true;
        }
    }

    /* renamed from: c */
    public String mo679c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0303f.m1215a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0303f.m1215a(this, sb);
        sb.append(" id=");
        sb.append(this.f531o);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo630a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f531o);
        printWriter.print(" mListener=");
        printWriter.println(this.f532p);
        if (this.f534r || this.f537u || this.f538v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f534r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f537u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f538v);
        }
        if (this.f535s || this.f536t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f535s);
            printWriter.print(" mReset=");
            printWriter.println(this.f536t);
        }
    }
}
