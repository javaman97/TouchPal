package android.support.p001v4.p016k;

/* renamed from: android.support.v4.k.m */
/* compiled from: SparseArrayCompat */
public class C0318m<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f802a = new Object();

    /* renamed from: b */
    private boolean f803b;

    /* renamed from: c */
    private int[] f804c;

    /* renamed from: d */
    private Object[] f805d;

    /* renamed from: e */
    private int f806e;

    public C0318m() {
        this(10);
    }

    public C0318m(int i) {
        this.f803b = false;
        if (i == 0) {
            this.f804c = C0302e.f755a;
            this.f805d = C0302e.f757c;
        } else {
            int a = C0302e.m1209a(i);
            this.f804c = new int[a];
            this.f805d = new Object[a];
        }
        this.f806e = 0;
    }

    /* renamed from: a */
    public C0318m<E> clone() {
        try {
            C0318m<E> mVar = (C0318m) super.clone();
            try {
                mVar.f804c = (int[]) this.f804c.clone();
                mVar.f805d = (Object[]) this.f805d.clone();
                return mVar;
            } catch (CloneNotSupportedException e) {
                return mVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo1014a(int i) {
        return mo1015a(i, (Object) null);
    }

    /* renamed from: a */
    public E mo1015a(int i, E e) {
        int a = C0302e.m1210a(this.f804c, this.f806e, i);
        return (a < 0 || this.f805d[a] == f802a) ? e : this.f805d[a];
    }

    /* renamed from: b */
    public void mo1018b(int i) {
        int a = C0302e.m1210a(this.f804c, this.f806e, i);
        if (a >= 0 && this.f805d[a] != f802a) {
            this.f805d[a] = f802a;
            this.f803b = true;
        }
    }

    /* renamed from: c */
    public void mo1021c(int i) {
        mo1018b(i);
    }

    /* renamed from: d */
    public void mo1024d(int i) {
        if (this.f805d[i] != f802a) {
            this.f805d[i] = f802a;
            this.f803b = true;
        }
    }

    /* renamed from: a */
    public void mo1016a(int i, int i2) {
        int min = Math.min(this.f806e, i + i2);
        while (i < min) {
            mo1024d(i);
            i++;
        }
    }

    /* renamed from: d */
    private void m1288d() {
        int i = this.f806e;
        int[] iArr = this.f804c;
        Object[] objArr = this.f805d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f802a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f803b = false;
        this.f806e = i2;
    }

    /* renamed from: b */
    public void mo1019b(int i, E e) {
        int a = C0302e.m1210a(this.f804c, this.f806e, i);
        if (a >= 0) {
            this.f805d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 >= this.f806e || this.f805d[i2] != f802a) {
            if (this.f803b && this.f806e >= this.f804c.length) {
                m1288d();
                i2 = C0302e.m1210a(this.f804c, this.f806e, i) ^ -1;
            }
            if (this.f806e >= this.f804c.length) {
                int a2 = C0302e.m1209a(this.f806e + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.f804c, 0, iArr, 0, this.f804c.length);
                System.arraycopy(this.f805d, 0, objArr, 0, this.f805d.length);
                this.f804c = iArr;
                this.f805d = objArr;
            }
            if (this.f806e - i2 != 0) {
                System.arraycopy(this.f804c, i2, this.f804c, i2 + 1, this.f806e - i2);
                System.arraycopy(this.f805d, i2, this.f805d, i2 + 1, this.f806e - i2);
            }
            this.f804c[i2] = i;
            this.f805d[i2] = e;
            this.f806e++;
            return;
        }
        this.f804c[i2] = i;
        this.f805d[i2] = e;
    }

    /* renamed from: b */
    public int mo1017b() {
        if (this.f803b) {
            m1288d();
        }
        return this.f806e;
    }

    /* renamed from: e */
    public int mo1026e(int i) {
        if (this.f803b) {
            m1288d();
        }
        return this.f804c[i];
    }

    /* renamed from: f */
    public E mo1027f(int i) {
        if (this.f803b) {
            m1288d();
        }
        return this.f805d[i];
    }

    /* renamed from: c */
    public void mo1022c(int i, E e) {
        if (this.f803b) {
            m1288d();
        }
        this.f805d[i] = e;
    }

    /* renamed from: g */
    public int mo1028g(int i) {
        if (this.f803b) {
            m1288d();
        }
        return C0302e.m1210a(this.f804c, this.f806e, i);
    }

    /* renamed from: a */
    public int mo1012a(E e) {
        if (this.f803b) {
            m1288d();
        }
        for (int i = 0; i < this.f806e; i++) {
            if (this.f805d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo1020c() {
        int i = this.f806e;
        Object[] objArr = this.f805d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f806e = 0;
        this.f803b = false;
    }

    /* renamed from: d */
    public void mo1025d(int i, E e) {
        if (this.f806e == 0 || i > this.f804c[this.f806e - 1]) {
            if (this.f803b && this.f806e >= this.f804c.length) {
                m1288d();
            }
            int i2 = this.f806e;
            if (i2 >= this.f804c.length) {
                int a = C0302e.m1209a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f804c, 0, iArr, 0, this.f804c.length);
                System.arraycopy(this.f805d, 0, objArr, 0, this.f805d.length);
                this.f804c = iArr;
                this.f805d = objArr;
            }
            this.f804c[i2] = i;
            this.f805d[i2] = e;
            this.f806e = i2 + 1;
            return;
        }
        mo1019b(i, e);
    }

    public String toString() {
        if (mo1017b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f806e * 28);
        sb.append('{');
        for (int i = 0; i < this.f806e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo1026e(i));
            sb.append('=');
            Object f = mo1027f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
