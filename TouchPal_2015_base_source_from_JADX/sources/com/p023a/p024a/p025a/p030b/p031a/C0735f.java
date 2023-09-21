package com.p023a.p024a.p025a.p030b.p031a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p030b.C0739c;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.a.a.a.b.a.f */
/* compiled from: LruMemoryCache */
public class C0735f implements C0739c {

    /* renamed from: a */
    private final LinkedHashMap<String, Bitmap> f1815a;

    /* renamed from: b */
    private final int f1816b;

    /* renamed from: c */
    private int f1817c;

    public C0735f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1816b = i;
        this.f1815a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Bitmap mo2739b(String str) {
        Bitmap bitmap;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            bitmap = this.f1815a.get(str);
        }
        return bitmap;
    }

    /* renamed from: a */
    public final boolean mo2736a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1817c += m4175b(str, bitmap);
            Bitmap bitmap2 = (Bitmap) this.f1815a.put(str, bitmap);
            if (bitmap2 != null) {
                this.f1817c -= m4175b(str, bitmap2);
            }
        }
        m4174a(this.f1816b);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4174a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f1817c     // Catch:{ all -> 0x0032 }
            if (r0 < 0) goto L_0x0011
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f1815a     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0035
            int r0 = r3.f1817c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0035
        L_0x0011:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.lang.Class r2 = r3.getClass()     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0032 }
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0032 }
            r0.<init>(r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            int r0 = r3.f1817c     // Catch:{ all -> 0x0032 }
            if (r0 <= r4) goto L_0x0041
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f1815a     // Catch:{ all -> 0x0032 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0043
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
        L_0x0042:
            return
        L_0x0043:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f1815a     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0032 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0032 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x0057
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0042
        L_0x0057:
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0032 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0032 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f1815a     // Catch:{ all -> 0x0032 }
            r2.remove(r1)     // Catch:{ all -> 0x0032 }
            int r2 = r3.f1817c     // Catch:{ all -> 0x0032 }
            int r0 = r3.m4175b(r1, r0)     // Catch:{ all -> 0x0032 }
            int r0 = r2 - r0
            r3.f1817c = r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p023a.p024a.p025a.p030b.p031a.C0735f.m4174a(int):void");
    }

    /* renamed from: b */
    public final Bitmap mo2733a(String str) {
        Bitmap bitmap;
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            bitmap = (Bitmap) this.f1815a.remove(str);
            if (bitmap != null) {
                this.f1817c -= m4175b(str, bitmap);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    public Collection<String> mo2735a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f1815a.keySet());
        }
        return hashSet;
    }

    /* renamed from: b */
    public void mo2740b() {
        m4174a(-1);
    }

    /* renamed from: b */
    private int m4175b(String str, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", new Object[]{Integer.valueOf(this.f1816b)});
    }
}
