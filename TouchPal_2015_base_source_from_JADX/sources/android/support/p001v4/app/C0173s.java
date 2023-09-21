package android.support.p001v4.app;

import android.os.Bundle;
import android.support.p001v4.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: android.support.v4.app.s */
/* compiled from: FragmentManager */
public abstract class C0173s {

    /* renamed from: a */
    public static final int f433a = 1;

    /* renamed from: android.support.v4.app.s$a */
    /* compiled from: FragmentManager */
    public interface C0174a {
        /* renamed from: a */
        int mo466a();

        /* renamed from: b */
        int mo471b();

        /* renamed from: c */
        int mo473c();

        /* renamed from: d */
        CharSequence mo474d();

        /* renamed from: e */
        CharSequence mo475e();

        /* renamed from: j */
        String mo477j();
    }

    /* renamed from: android.support.v4.app.s$b */
    /* compiled from: FragmentManager */
    public interface C0175b {
        /* renamed from: a */
        void mo563a();
    }

    /* renamed from: a */
    public abstract C0036E mo542a();

    /* renamed from: a */
    public abstract Fragment.SavedState mo543a(Fragment fragment);

    /* renamed from: a */
    public abstract Fragment mo544a(int i);

    /* renamed from: a */
    public abstract Fragment mo545a(Bundle bundle, String str);

    /* renamed from: a */
    public abstract Fragment mo546a(String str);

    /* renamed from: a */
    public abstract void mo547a(int i, int i2);

    /* renamed from: a */
    public abstract void mo548a(Bundle bundle, String str, Fragment fragment);

    /* renamed from: a */
    public abstract void mo549a(C0175b bVar);

    /* renamed from: a */
    public abstract void mo550a(String str, int i);

    /* renamed from: a */
    public abstract void mo551a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract C0174a mo553b(int i);

    /* renamed from: b */
    public abstract void mo554b(C0175b bVar);

    /* renamed from: b */
    public abstract boolean mo555b(int i, int i2);

    /* renamed from: b */
    public abstract boolean mo556b(String str, int i);

    /* renamed from: c */
    public abstract boolean mo557c();

    /* renamed from: d */
    public abstract void mo558d();

    /* renamed from: e */
    public abstract boolean mo559e();

    /* renamed from: f */
    public abstract int mo560f();

    /* renamed from: g */
    public abstract List<Fragment> mo561g();

    /* renamed from: h */
    public abstract boolean mo562h();

    @Deprecated
    /* renamed from: b */
    public C0036E mo552b() {
        return mo542a();
    }

    /* renamed from: a */
    public static void m659a(boolean z) {
        C0176t.f445b = z;
    }
}
