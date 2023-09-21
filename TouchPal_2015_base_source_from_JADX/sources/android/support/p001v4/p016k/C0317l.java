package android.support.p001v4.p016k;

import java.util.Map;

/* renamed from: android.support.v4.k.l */
/* compiled from: SimpleArrayMap */
public class C0317l<K, V> {

    /* renamed from: a */
    private static final boolean f791a = false;

    /* renamed from: b */
    static Object[] f792b = null;

    /* renamed from: c */
    static int f793c = 0;

    /* renamed from: d */
    static Object[] f794d = null;

    /* renamed from: e */
    static int f795e = 0;

    /* renamed from: i */
    private static final String f796i = "ArrayMap";

    /* renamed from: j */
    private static final int f797j = 4;

    /* renamed from: k */
    private static final int f798k = 10;

    /* renamed from: f */
    int[] f799f;

    /* renamed from: g */
    Object[] f800g;

    /* renamed from: h */
    int f801h;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo994a(Object obj, int i) {
        int i2 = this.f801h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0302e.m1210a(this.f799f, i2, i);
        if (a < 0 || obj.equals(this.f800g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f799f[i3] == i) {
            if (obj.equals(this.f800g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f799f[i4] == i) {
            if (obj.equals(this.f800g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo992a() {
        int i = this.f801h;
        if (i == 0) {
            return -1;
        }
        int a = C0302e.m1210a(this.f799f, i, 0);
        if (a < 0 || this.f800g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f799f[i2] == 0) {
            if (this.f800g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f799f[i3] == 0) {
            if (this.f800g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: e */
    private void m1278e(int i) {
        if (i == 8) {
            synchronized (C0298a.class) {
                if (f794d != null) {
                    Object[] objArr = f794d;
                    this.f800g = objArr;
                    f794d = (Object[]) objArr[0];
                    this.f799f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f795e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0298a.class) {
                if (f792b != null) {
                    Object[] objArr2 = f792b;
                    this.f800g = objArr2;
                    f792b = (Object[]) objArr2[0];
                    this.f799f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f793c--;
                    return;
                }
            }
        }
        this.f799f = new int[i];
        this.f800g = new Object[(i << 1)];
    }

    /* renamed from: a */
    private static void m1277a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0298a.class) {
                if (f795e < 10) {
                    objArr[0] = f794d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f794d = objArr;
                    f795e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0298a.class) {
                if (f793c < 10) {
                    objArr[0] = f792b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f792b = objArr;
                    f793c++;
                }
            }
        }
    }

    public C0317l() {
        this.f799f = C0302e.f755a;
        this.f800g = C0302e.f757c;
        this.f801h = 0;
    }

    public C0317l(int i) {
        if (i == 0) {
            this.f799f = C0302e.f755a;
            this.f800g = C0302e.f757c;
        } else {
            m1278e(i);
        }
        this.f801h = 0;
    }

    public C0317l(C0317l lVar) {
        this();
        if (lVar != null) {
            mo997a(lVar);
        }
    }

    public void clear() {
        if (this.f801h != 0) {
            m1277a(this.f799f, this.f800g, this.f801h);
            this.f799f = C0302e.f755a;
            this.f800g = C0302e.f757c;
            this.f801h = 0;
        }
    }

    /* renamed from: a */
    public void mo996a(int i) {
        if (this.f799f.length < i) {
            int[] iArr = this.f799f;
            Object[] objArr = this.f800g;
            m1278e(i);
            if (this.f801h > 0) {
                System.arraycopy(iArr, 0, this.f799f, 0, this.f801h);
                System.arraycopy(objArr, 0, this.f800g, 0, this.f801h << 1);
            }
            m1277a(iArr, objArr, this.f801h);
        }
    }

    public boolean containsKey(Object obj) {
        return obj == null ? mo992a() >= 0 : mo994a(obj, obj.hashCode()) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo993a(Object obj) {
        int i = 1;
        int i2 = this.f801h * 2;
        Object[] objArr = this.f800g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return mo993a(obj) >= 0;
    }

    public V get(Object obj) {
        int a = obj == null ? mo992a() : mo994a(obj, obj.hashCode());
        if (a >= 0) {
            return this.f800g[(a << 1) + 1];
        }
        return null;
    }

    /* renamed from: b */
    public K mo998b(int i) {
        return this.f800g[i << 1];
    }

    /* renamed from: c */
    public V mo999c(int i) {
        return this.f800g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V mo995a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f800g[i2];
        this.f800g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f801h <= 0;
    }

    public V put(K k, V v) {
        int hashCode;
        int a;
        int i = 8;
        if (k == null) {
            a = mo992a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            a = mo994a((Object) k, hashCode);
        }
        if (a >= 0) {
            int i2 = (a << 1) + 1;
            V v2 = this.f800g[i2];
            this.f800g[i2] = v;
            return v2;
        }
        int i3 = a ^ -1;
        if (this.f801h >= this.f799f.length) {
            if (this.f801h >= 8) {
                i = this.f801h + (this.f801h >> 1);
            } else if (this.f801h < 4) {
                i = 4;
            }
            int[] iArr = this.f799f;
            Object[] objArr = this.f800g;
            m1278e(i);
            if (this.f799f.length > 0) {
                System.arraycopy(iArr, 0, this.f799f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f800g, 0, objArr.length);
            }
            m1277a(iArr, objArr, this.f801h);
        }
        if (i3 < this.f801h) {
            System.arraycopy(this.f799f, i3, this.f799f, i3 + 1, this.f801h - i3);
            System.arraycopy(this.f800g, i3 << 1, this.f800g, (i3 + 1) << 1, (this.f801h - i3) << 1);
        }
        this.f799f[i3] = hashCode;
        this.f800g[i3 << 1] = k;
        this.f800g[(i3 << 1) + 1] = v;
        this.f801h++;
        return null;
    }

    /* renamed from: a */
    public void mo997a(C0317l<? extends K, ? extends V> lVar) {
        int i = lVar.f801h;
        mo996a(this.f801h + i);
        if (this.f801h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(lVar.mo998b(i2), lVar.mo999c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(lVar.f799f, 0, this.f799f, 0, i);
            System.arraycopy(lVar.f800g, 0, this.f800g, 0, i << 1);
            this.f801h = i;
        }
    }

    public V remove(Object obj) {
        int a = obj == null ? mo992a() : mo994a(obj, obj.hashCode());
        if (a >= 0) {
            return mo1003d(a);
        }
        return null;
    }

    /* renamed from: d */
    public V mo1003d(int i) {
        int i2 = 8;
        V v = this.f800g[(i << 1) + 1];
        if (this.f801h <= 1) {
            m1277a(this.f799f, this.f800g, this.f801h);
            this.f799f = C0302e.f755a;
            this.f800g = C0302e.f757c;
            this.f801h = 0;
        } else if (this.f799f.length <= 8 || this.f801h >= this.f799f.length / 3) {
            this.f801h--;
            if (i < this.f801h) {
                System.arraycopy(this.f799f, i + 1, this.f799f, i, this.f801h - i);
                System.arraycopy(this.f800g, (i + 1) << 1, this.f800g, i << 1, (this.f801h - i) << 1);
            }
            this.f800g[this.f801h << 1] = null;
            this.f800g[(this.f801h << 1) + 1] = null;
        } else {
            if (this.f801h > 8) {
                i2 = this.f801h + (this.f801h >> 1);
            }
            int[] iArr = this.f799f;
            Object[] objArr = this.f800g;
            m1278e(i2);
            this.f801h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f799f, 0, i);
                System.arraycopy(objArr, 0, this.f800g, 0, i << 1);
            }
            if (i < this.f801h) {
                System.arraycopy(iArr, i + 1, this.f799f, i, this.f801h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f800g, i << 1, (this.f801h - i) << 1);
            }
        }
        return v;
    }

    public int size() {
        return this.f801h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f801h) {
            try {
                Object b = mo998b(i);
                Object c = mo999c(i);
                Object obj2 = map.get(b);
                if (c == null) {
                    if (obj2 != null || !map.containsKey(b)) {
                        return false;
                    }
                } else if (!c.equals(obj2)) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f799f;
        Object[] objArr = this.f800g;
        int i = this.f801h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f801h * 28);
        sb.append('{');
        for (int i = 0; i < this.f801h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo998b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo999c(i);
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
