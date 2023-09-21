package android.support.p001v4.p004c.p005a;

import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: android.support.v4.c.a.a */
/* compiled from: DrawableCompat */
public class C0184a {

    /* renamed from: a */
    static final C0186b f485a;

    /* renamed from: android.support.v4.c.a.a$b */
    /* compiled from: DrawableCompat */
    interface C0186b {
        /* renamed from: a */
        void mo623a(Drawable drawable);

        /* renamed from: a */
        void mo624a(Drawable drawable, boolean z);

        /* renamed from: b */
        boolean mo625b(Drawable drawable);
    }

    /* renamed from: android.support.v4.c.a.a$a */
    /* compiled from: DrawableCompat */
    static class C0185a implements C0186b {
        C0185a() {
        }

        /* renamed from: a */
        public void mo623a(Drawable drawable) {
        }

        /* renamed from: a */
        public void mo624a(Drawable drawable, boolean z) {
        }

        /* renamed from: b */
        public boolean mo625b(Drawable drawable) {
            return false;
        }
    }

    /* renamed from: android.support.v4.c.a.a$c */
    /* compiled from: DrawableCompat */
    static class C0187c extends C0185a {
        C0187c() {
        }

        /* renamed from: a */
        public void mo623a(Drawable drawable) {
            C0189b.m777a(drawable);
        }
    }

    /* renamed from: android.support.v4.c.a.a$d */
    /* compiled from: DrawableCompat */
    static class C0188d extends C0187c {
        C0188d() {
        }

        /* renamed from: a */
        public void mo624a(Drawable drawable, boolean z) {
            C0190c.m778a(drawable, z);
        }

        /* renamed from: b */
        public boolean mo625b(Drawable drawable) {
            return C0190c.m779a(drawable);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            f485a = new C0188d();
        } else if (i >= 11) {
            f485a = new C0187c();
        } else {
            f485a = new C0185a();
        }
    }

    /* renamed from: a */
    public static void m765a(Drawable drawable) {
        f485a.mo623a(drawable);
    }

    /* renamed from: a */
    public static void m766a(Drawable drawable, boolean z) {
        f485a.mo624a(drawable, z);
    }

    /* renamed from: b */
    public static boolean m767b(Drawable drawable) {
        return f485a.mo625b(drawable);
    }
}
