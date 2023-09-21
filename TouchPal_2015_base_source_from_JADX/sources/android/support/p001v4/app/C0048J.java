package android.support.p001v4.app;

import android.os.Bundle;
import android.support.p001v4.content.C0210l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.J */
/* compiled from: LoaderManager */
public abstract class C0048J {

    /* renamed from: android.support.v4.app.J$a */
    /* compiled from: LoaderManager */
    public interface C0049a<D> {
        /* renamed from: a */
        C0210l<D> mo194a(int i, Bundle bundle);

        /* renamed from: a */
        void mo195a(C0210l<D> lVar);

        /* renamed from: a */
        void mo196a(C0210l<D> lVar, D d);
    }

    /* renamed from: a */
    public abstract <D> C0210l<D> mo188a(int i, Bundle bundle, C0049a<D> aVar);

    /* renamed from: a */
    public abstract void mo189a(int i);

    /* renamed from: a */
    public abstract void mo190a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract <D> C0210l<D> mo192b(int i);

    /* renamed from: b */
    public abstract <D> C0210l<D> mo193b(int i, Bundle bundle, C0049a<D> aVar);

    /* renamed from: a */
    public static void m102a(boolean z) {
        C0050K.f85b = z;
    }

    /* renamed from: a */
    public boolean mo191a() {
        return false;
    }
}
