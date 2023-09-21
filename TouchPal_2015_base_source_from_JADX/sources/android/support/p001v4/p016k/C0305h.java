package android.support.p001v4.p016k;

/* renamed from: android.support.v4.k.h */
/* compiled from: LongSparseArray */
public class C0305h<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f760a = new Object();

    /* renamed from: b */
    private boolean f761b;

    /* renamed from: c */
    private long[] f762c;

    /* renamed from: d */
    private Object[] f763d;

    /* renamed from: e */
    private int f764e;

    public C0305h() {
        this(10);
    }

    public C0305h(int i) {
        this.f761b = false;
        if (i == 0) {
            this.f762c = C0302e.f756b;
            this.f763d = C0302e.f757c;
        } else {
            int b = C0302e.m1213b(i);
            this.f762c = new long[b];
            this.f763d = new Object[b];
        }
        this.f764e = 0;
    }

    /* renamed from: a */
    public C0305h<E> clone() {
        try {
            C0305h<E> hVar = (C0305h) super.clone();
            try {
                hVar.f762c = (long[]) this.f762c.clone();
                hVar.f763d = (Object[]) this.f763d.clone();
                return hVar;
            } catch (CloneNotSupportedException e) {
                return hVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo896a(long j) {
        return mo897a(j, (Object) null);
    }

    /* renamed from: a */
    public E mo897a(long j, E e) {
        int a = C0302e.m1211a(this.f762c, this.f764e, j);
        return (a < 0 || this.f763d[a] == f760a) ? e : this.f763d[a];
    }

    /* renamed from: b */
    public void mo902b(long j) {
        int a = C0302e.m1211a(this.f762c, this.f764e, j);
        if (a >= 0 && this.f763d[a] != f760a) {
            this.f763d[a] = f760a;
            this.f761b = true;
        }
    }

    /* renamed from: c */
    public void mo906c(long j) {
        mo902b(j);
    }

    /* renamed from: a */
    public void mo898a(int i) {
        if (this.f763d[i] != f760a) {
            this.f763d[i] = f760a;
            this.f761b = true;
        }
    }

    /* renamed from: d */
    private void m1217d() {
        int i = this.f764e;
        long[] jArr = this.f762c;
        Object[] objArr = this.f763d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f760a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f761b = false;
        this.f764e = i2;
    }

    /* renamed from: b */
    public void mo903b(long j, E e) {
        int a = C0302e.m1211a(this.f762c, this.f764e, j);
        if (a >= 0) {
            this.f763d[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i >= this.f764e || this.f763d[i] != f760a) {
            if (this.f761b && this.f764e >= this.f762c.length) {
                m1217d();
                i = C0302e.m1211a(this.f762c, this.f764e, j) ^ -1;
            }
            if (this.f764e >= this.f762c.length) {
                int b = C0302e.m1213b(this.f764e + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f762c, 0, jArr, 0, this.f762c.length);
                System.arraycopy(this.f763d, 0, objArr, 0, this.f763d.length);
                this.f762c = jArr;
                this.f763d = objArr;
            }
            if (this.f764e - i != 0) {
                System.arraycopy(this.f762c, i, this.f762c, i + 1, this.f764e - i);
                System.arraycopy(this.f763d, i, this.f763d, i + 1, this.f764e - i);
            }
            this.f762c[i] = j;
            this.f763d[i] = e;
            this.f764e++;
            return;
        }
        this.f762c[i] = j;
        this.f763d[i] = e;
    }

    /* renamed from: b */
    public int mo900b() {
        if (this.f761b) {
            m1217d();
        }
        return this.f764e;
    }

    /* renamed from: b */
    public long mo901b(int i) {
        if (this.f761b) {
            m1217d();
        }
        return this.f762c[i];
    }

    /* renamed from: c */
    public E mo904c(int i) {
        if (this.f761b) {
            m1217d();
        }
        return this.f763d[i];
    }

    /* renamed from: a */
    public void mo899a(int i, E e) {
        if (this.f761b) {
            m1217d();
        }
        this.f763d[i] = e;
    }

    /* renamed from: d */
    public int mo909d(long j) {
        if (this.f761b) {
            m1217d();
        }
        return C0302e.m1211a(this.f762c, this.f764e, j);
    }

    /* renamed from: a */
    public int mo894a(E e) {
        if (this.f761b) {
            m1217d();
        }
        for (int i = 0; i < this.f764e; i++) {
            if (this.f763d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo905c() {
        int i = this.f764e;
        Object[] objArr = this.f763d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f764e = 0;
        this.f761b = false;
    }

    /* renamed from: c */
    public void mo907c(long j, E e) {
        if (this.f764e == 0 || j > this.f762c[this.f764e - 1]) {
            if (this.f761b && this.f764e >= this.f762c.length) {
                m1217d();
            }
            int i = this.f764e;
            if (i >= this.f762c.length) {
                int b = C0302e.m1213b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f762c, 0, jArr, 0, this.f762c.length);
                System.arraycopy(this.f763d, 0, objArr, 0, this.f763d.length);
                this.f762c = jArr;
                this.f763d = objArr;
            }
            this.f762c[i] = j;
            this.f763d[i] = e;
            this.f764e = i + 1;
            return;
        }
        mo903b(j, e);
    }

    public String toString() {
        if (mo900b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f764e * 28);
        sb.append('{');
        for (int i = 0; i < this.f764e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo901b(i));
            sb.append('=');
            Object c = mo904c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
