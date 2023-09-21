package android.support.p001v4.p014i;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import java.io.FileNotFoundException;

/* renamed from: android.support.v4.i.a */
/* compiled from: PrintHelper */
public final class C0269a {

    /* renamed from: a */
    public static final int f652a = 1;

    /* renamed from: b */
    public static final int f653b = 2;

    /* renamed from: c */
    public static final int f654c = 1;

    /* renamed from: d */
    public static final int f655d = 2;

    /* renamed from: e */
    public static final int f656e = 1;

    /* renamed from: f */
    public static final int f657f = 2;

    /* renamed from: g */
    C0273c f658g;

    /* renamed from: android.support.v4.i.a$c */
    /* compiled from: PrintHelper */
    interface C0273c {
        /* renamed from: a */
        int mo810a();

        /* renamed from: a */
        void mo811a(int i);

        /* renamed from: a */
        void mo812a(String str, Bitmap bitmap);

        /* renamed from: a */
        void mo813a(String str, Uri uri) throws FileNotFoundException;

        /* renamed from: b */
        int mo814b();

        /* renamed from: b */
        void mo815b(int i);

        /* renamed from: c */
        int mo816c();

        /* renamed from: c */
        void mo817c(int i);
    }

    /* renamed from: a */
    public static boolean m1059a() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }

    /* renamed from: android.support.v4.i.a$b */
    /* compiled from: PrintHelper */
    private static final class C0272b implements C0273c {

        /* renamed from: a */
        int f660a;

        /* renamed from: b */
        int f661b;

        /* renamed from: c */
        int f662c;

        private C0272b() {
            this.f660a = 2;
            this.f661b = 2;
            this.f662c = 1;
        }

        /* renamed from: a */
        public void mo811a(int i) {
            this.f660a = i;
        }

        /* renamed from: b */
        public int mo814b() {
            return this.f661b;
        }

        /* renamed from: b */
        public void mo815b(int i) {
            this.f661b = i;
        }

        /* renamed from: c */
        public void mo817c(int i) {
            this.f662c = i;
        }

        /* renamed from: c */
        public int mo816c() {
            return this.f662c;
        }

        /* renamed from: a */
        public int mo810a() {
            return this.f660a;
        }

        /* renamed from: a */
        public void mo812a(String str, Bitmap bitmap) {
        }

        /* renamed from: a */
        public void mo813a(String str, Uri uri) {
        }
    }

    /* renamed from: android.support.v4.i.a$a */
    /* compiled from: PrintHelper */
    private static final class C0271a implements C0273c {

        /* renamed from: a */
        private final C0274b f659a;

        C0271a(Context context) {
            this.f659a = new C0274b(context);
        }

        /* renamed from: a */
        public void mo811a(int i) {
            this.f659a.mo819a(i);
        }

        /* renamed from: a */
        public int mo810a() {
            return this.f659a.mo818a();
        }

        /* renamed from: b */
        public void mo815b(int i) {
            this.f659a.mo823b(i);
        }

        /* renamed from: b */
        public int mo814b() {
            return this.f659a.mo824c();
        }

        /* renamed from: c */
        public void mo817c(int i) {
            this.f659a.mo825c(i);
        }

        /* renamed from: c */
        public int mo816c() {
            return this.f659a.mo822b();
        }

        /* renamed from: a */
        public void mo812a(String str, Bitmap bitmap) {
            this.f659a.mo820a(str, bitmap);
        }

        /* renamed from: a */
        public void mo813a(String str, Uri uri) throws FileNotFoundException {
            this.f659a.mo821a(str, uri);
        }
    }

    public C0269a(Context context) {
        if (m1059a()) {
            this.f658g = new C0271a(context);
        } else {
            this.f658g = new C0272b();
        }
    }

    /* renamed from: a */
    public void mo802a(int i) {
        this.f658g.mo811a(i);
    }

    /* renamed from: b */
    public int mo805b() {
        return this.f658g.mo810a();
    }

    /* renamed from: b */
    public void mo806b(int i) {
        this.f658g.mo815b(i);
    }

    /* renamed from: c */
    public int mo807c() {
        return this.f658g.mo814b();
    }

    /* renamed from: c */
    public void mo808c(int i) {
        this.f658g.mo817c(i);
    }

    /* renamed from: d */
    public int mo809d() {
        return this.f658g.mo816c();
    }

    /* renamed from: a */
    public void mo803a(String str, Bitmap bitmap) {
        this.f658g.mo812a(str, bitmap);
    }

    /* renamed from: a */
    public void mo804a(String str, Uri uri) throws FileNotFoundException {
        this.f658g.mo813a(str, uri);
    }
}
