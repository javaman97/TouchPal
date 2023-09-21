package android.support.p001v4.p016k;

/* renamed from: android.support.v4.k.k */
/* compiled from: Pools */
public final class C0313k {

    /* renamed from: android.support.v4.k.k$a */
    /* compiled from: Pools */
    public interface C0314a<T> {
        /* renamed from: a */
        T mo990a();

        /* renamed from: a */
        boolean mo991a(T t);
    }

    private C0313k() {
    }

    /* renamed from: android.support.v4.k.k$b */
    /* compiled from: Pools */
    public static class C0315b<T> implements C0314a<T> {

        /* renamed from: a */
        private final Object[] f788a;

        /* renamed from: b */
        private int f789b;

        public C0315b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f788a = new Object[i];
        }

        /* renamed from: a */
        public T mo990a() {
            if (this.f789b <= 0) {
                return null;
            }
            int i = this.f789b - 1;
            T t = this.f788a[i];
            this.f788a[i] = null;
            this.f789b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo991a(T t) {
            if (m1272b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f789b >= this.f788a.length) {
                return false;
            } else {
                this.f788a[this.f789b] = t;
                this.f789b++;
                return true;
            }
        }

        /* renamed from: b */
        private boolean m1272b(T t) {
            for (int i = 0; i < this.f789b; i++) {
                if (this.f788a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.k.k$c */
    /* compiled from: Pools */
    public static class C0316c<T> extends C0315b<T> {

        /* renamed from: a */
        private final Object f790a = new Object();

        public C0316c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo990a() {
            T a;
            synchronized (this.f790a) {
                a = super.mo990a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo991a(T t) {
            boolean a;
            synchronized (this.f790a) {
                a = super.mo991a(t);
            }
            return a;
        }
    }
}
