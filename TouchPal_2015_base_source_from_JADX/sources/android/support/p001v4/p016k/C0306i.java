package android.support.p001v4.p016k;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: android.support.v4.k.i */
/* compiled from: LruCache */
public class C0306i<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f765a;

    /* renamed from: b */
    private int f766b;

    /* renamed from: c */
    private int f767c;

    /* renamed from: d */
    private int f768d;

    /* renamed from: e */
    private int f769e;

    /* renamed from: f */
    private int f770f;

    /* renamed from: g */
    private int f771g;

    /* renamed from: h */
    private int f772h;

    public C0306i(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f767c = i;
        this.f765a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = mo920c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f769e++;
        r0 = r4.f765a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r4.f765a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        mo915a(false, r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.f766b += m1233c(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        mo914a(r4.f767c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo911a(K r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000a
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        L_0x000a:
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f765a     // Catch:{ all -> 0x002a }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x001b
            int r1 = r4.f771g     // Catch:{ all -> 0x002a }
            int r1 = r1 + 1
            r4.f771g = r1     // Catch:{ all -> 0x002a }
            monitor-exit(r4)     // Catch:{ all -> 0x002a }
        L_0x001a:
            return r0
        L_0x001b:
            int r0 = r4.f772h     // Catch:{ all -> 0x002a }
            int r0 = r0 + 1
            r4.f772h = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r4)     // Catch:{ all -> 0x002a }
            java.lang.Object r1 = r4.mo920c(r5)
            if (r1 != 0) goto L_0x002d
            r0 = 0
            goto L_0x001a
        L_0x002a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002d:
            monitor-enter(r4)
            int r0 = r4.f769e     // Catch:{ all -> 0x0053 }
            int r0 = r0 + 1
            r4.f769e = r0     // Catch:{ all -> 0x0053 }
            java.util.LinkedHashMap<K, V> r0 = r4.f765a     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.put(r5, r1)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0049
            java.util.LinkedHashMap<K, V> r2 = r4.f765a     // Catch:{ all -> 0x0053 }
            r2.put(r5, r0)     // Catch:{ all -> 0x0053 }
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0056
            r2 = 0
            r4.mo915a(r2, r5, r1, r0)
            goto L_0x001a
        L_0x0049:
            int r2 = r4.f766b     // Catch:{ all -> 0x0053 }
            int r3 = r4.m1233c(r5, r1)     // Catch:{ all -> 0x0053 }
            int r2 = r2 + r3
            r4.f766b = r2     // Catch:{ all -> 0x0053 }
            goto L_0x0041
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            int r0 = r4.f767c
            r4.mo914a((int) r0)
            r0 = r1
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.p016k.C0306i.mo911a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public final V mo912a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f768d++;
            this.f766b += m1233c(k, v);
            put = this.f765a.put(k, v);
            if (put != null) {
                this.f766b -= m1233c(k, put);
            }
        }
        if (put != null) {
            mo915a(false, k, put, v);
        }
        mo914a(this.f767c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo914a(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f766b     // Catch:{ all -> 0x0032 }
            if (r0 < 0) goto L_0x0011
            java.util.LinkedHashMap<K, V> r0 = r4.f765a     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0035
            int r0 = r4.f766b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0035
        L_0x0011:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.Class r2 = r4.getClass()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            int r0 = r4.f766b     // Catch:{ all -> 0x0032 }
            if (r0 <= r5) goto L_0x0041
            java.util.LinkedHashMap<K, V> r0 = r4.f765a     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0043
        L_0x0041:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x0043:
            java.util.LinkedHashMap<K, V> r0 = r4.f765a     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0032 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0032 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0032 }
            java.util.LinkedHashMap<K, V> r2 = r4.f765a     // Catch:{ all -> 0x0032 }
            r2.remove(r1)     // Catch:{ all -> 0x0032 }
            int r2 = r4.f766b     // Catch:{ all -> 0x0032 }
            int r3 = r4.m1233c(r1, r0)     // Catch:{ all -> 0x0032 }
            int r2 = r2 - r3
            r4.f766b = r2     // Catch:{ all -> 0x0032 }
            int r2 = r4.f770f     // Catch:{ all -> 0x0032 }
            int r2 = r2 + 1
            r4.f770f = r2     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            r2 = 1
            r3 = 0
            r4.mo915a(r2, r1, r0, r3)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.p016k.C0306i.mo914a(int):void");
    }

    /* renamed from: b */
    public final V mo918b(K k) {
        V remove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            remove = this.f765a.remove(k);
            if (remove != null) {
                this.f766b -= m1233c(k, remove);
            }
        }
        if (remove != null) {
            mo915a(false, k, remove, (V) null);
        }
        return remove;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo915a(boolean z, K k, V v, V v2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public V mo920c(K k) {
        return null;
    }

    /* renamed from: c */
    private int m1233c(K k, V v) {
        int b = mo917b(k, v);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo917b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final void mo913a() {
        mo914a(-1);
    }

    /* renamed from: b */
    public final synchronized int mo916b() {
        return this.f766b;
    }

    /* renamed from: c */
    public final synchronized int mo919c() {
        return this.f767c;
    }

    /* renamed from: d */
    public final synchronized int mo921d() {
        return this.f771g;
    }

    /* renamed from: e */
    public final synchronized int mo922e() {
        return this.f772h;
    }

    /* renamed from: f */
    public final synchronized int mo923f() {
        return this.f769e;
    }

    /* renamed from: g */
    public final synchronized int mo924g() {
        return this.f768d;
    }

    /* renamed from: h */
    public final synchronized int mo925h() {
        return this.f770f;
    }

    /* renamed from: i */
    public final synchronized Map<K, V> mo926i() {
        return new LinkedHashMap(this.f765a);
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f771g + this.f772h;
            if (i2 != 0) {
                i = (this.f771g * 100) / i2;
            }
            format = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f767c), Integer.valueOf(this.f771g), Integer.valueOf(this.f772h), Integer.valueOf(i)});
        }
        return format;
    }
}
