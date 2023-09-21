package android.support.p001v4.p016k;

/* renamed from: android.support.v4.k.d */
/* compiled from: CircularArray */
public class C0301d<E> {

    /* renamed from: a */
    private E[] f751a;

    /* renamed from: b */
    private int f752b;

    /* renamed from: c */
    private int f753c;

    /* renamed from: d */
    private int f754d;

    /* renamed from: g */
    private void m1199g() {
        int length = this.f751a.length;
        int i = length - this.f752b;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Too big");
        }
        E[] eArr = new Object[i2];
        System.arraycopy(this.f751a, this.f752b, eArr, 0, i);
        System.arraycopy(this.f751a, 0, eArr, i, this.f752b);
        this.f751a = (Object[]) eArr;
        this.f752b = 0;
        this.f753c = length;
        this.f754d = i2 - 1;
    }

    public C0301d() {
        this(8);
    }

    public C0301d(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        i = Integer.bitCount(i) != 1 ? 1 << (Integer.highestOneBit(i) + 1) : i;
        this.f754d = i - 1;
        this.f751a = (Object[]) new Object[i];
    }

    /* renamed from: a */
    public final void mo884a(E e) {
        this.f752b = (this.f752b - 1) & this.f754d;
        this.f751a[this.f752b] = e;
        if (this.f752b == this.f753c) {
            m1199g();
        }
    }

    /* renamed from: b */
    public final void mo886b(E e) {
        this.f751a[this.f753c] = e;
        this.f753c = (this.f753c + 1) & this.f754d;
        if (this.f753c == this.f752b) {
            m1199g();
        }
    }

    /* renamed from: a */
    public final E mo882a() {
        if (this.f752b == this.f753c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.f751a[this.f752b];
        this.f751a[this.f752b] = null;
        this.f752b = (this.f752b + 1) & this.f754d;
        return e;
    }

    /* renamed from: b */
    public final E mo885b() {
        if (this.f752b == this.f753c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = (this.f753c - 1) & this.f754d;
        E e = this.f751a[i];
        this.f751a[i] = null;
        this.f753c = i;
        return e;
    }

    /* renamed from: c */
    public final E mo887c() {
        if (this.f752b != this.f753c) {
            return this.f751a[this.f752b];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public final E mo888d() {
        if (this.f752b != this.f753c) {
            return this.f751a[(this.f753c - 1) & this.f754d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final E mo883a(int i) {
        if (i < 0 || i >= mo889e()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f751a[(this.f752b + i) & this.f754d];
    }

    /* renamed from: e */
    public final int mo889e() {
        return (this.f753c - this.f752b) & this.f754d;
    }

    /* renamed from: f */
    public final boolean mo890f() {
        return this.f752b == this.f753c;
    }
}
