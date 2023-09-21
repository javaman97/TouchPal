package android.support.p001v4.p012g;

import android.os.Build;
import java.net.Socket;
import java.net.SocketException;

/* renamed from: android.support.v4.g.e */
/* compiled from: TrafficStatsCompat */
public class C0254e {

    /* renamed from: a */
    private static final C0259c f644a;

    /* renamed from: android.support.v4.g.e$c */
    /* compiled from: TrafficStatsCompat */
    interface C0259c {
        /* renamed from: a */
        void mo786a();

        /* renamed from: a */
        void mo787a(int i);

        /* renamed from: a */
        void mo788a(int i, int i2);

        /* renamed from: a */
        void mo789a(Socket socket) throws SocketException;

        /* renamed from: b */
        int mo790b();

        /* renamed from: b */
        void mo791b(int i);

        /* renamed from: b */
        void mo792b(Socket socket) throws SocketException;
    }

    /* renamed from: android.support.v4.g.e$a */
    /* compiled from: TrafficStatsCompat */
    static class C0256a implements C0259c {

        /* renamed from: a */
        private ThreadLocal<C0257a> f645a = new C0260f(this);

        /* renamed from: android.support.v4.g.e$a$a */
        /* compiled from: TrafficStatsCompat */
        private static class C0257a {

            /* renamed from: a */
            public int f646a;

            private C0257a() {
                this.f646a = -1;
            }
        }

        C0256a() {
        }

        /* renamed from: a */
        public void mo786a() {
            this.f645a.get().f646a = -1;
        }

        /* renamed from: b */
        public int mo790b() {
            return this.f645a.get().f646a;
        }

        /* renamed from: a */
        public void mo787a(int i) {
        }

        /* renamed from: a */
        public void mo788a(int i, int i2) {
        }

        /* renamed from: b */
        public void mo791b(int i) {
            this.f645a.get().f646a = i;
        }

        /* renamed from: a */
        public void mo789a(Socket socket) {
        }

        /* renamed from: b */
        public void mo792b(Socket socket) {
        }
    }

    /* renamed from: android.support.v4.g.e$b */
    /* compiled from: TrafficStatsCompat */
    static class C0258b implements C0259c {
        C0258b() {
        }

        /* renamed from: a */
        public void mo786a() {
            C0261g.m1043a();
        }

        /* renamed from: b */
        public int mo790b() {
            return C0261g.m1047b();
        }

        /* renamed from: a */
        public void mo787a(int i) {
            C0261g.m1044a(i);
        }

        /* renamed from: a */
        public void mo788a(int i, int i2) {
            C0261g.m1045a(i, i2);
        }

        /* renamed from: b */
        public void mo791b(int i) {
            C0261g.m1048b(i);
        }

        /* renamed from: a */
        public void mo789a(Socket socket) throws SocketException {
            C0261g.m1046a(socket);
        }

        /* renamed from: b */
        public void mo792b(Socket socket) throws SocketException {
            C0261g.m1049b(socket);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f644a = new C0258b();
        } else {
            f644a = new C0256a();
        }
    }

    /* renamed from: a */
    public static void m1014a() {
        f644a.mo786a();
    }

    /* renamed from: b */
    public static int m1018b() {
        return f644a.mo790b();
    }

    /* renamed from: a */
    public static void m1015a(int i) {
        f644a.mo787a(i);
    }

    /* renamed from: a */
    public static void m1016a(int i, int i2) {
        f644a.mo788a(i, i2);
    }

    /* renamed from: b */
    public static void m1019b(int i) {
        f644a.mo791b(i);
    }

    /* renamed from: a */
    public static void m1017a(Socket socket) throws SocketException {
        f644a.mo789a(socket);
    }

    /* renamed from: b */
    public static void m1020b(Socket socket) throws SocketException {
        f644a.mo792b(socket);
    }
}
