package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.android.volley.toolbox.d */
/* compiled from: ByteArrayPool */
public class C0848d {

    /* renamed from: a */
    protected static final Comparator<byte[]> f2253a = new C0849e();

    /* renamed from: b */
    private List<byte[]> f2254b = new LinkedList();

    /* renamed from: c */
    private List<byte[]> f2255c = new ArrayList(64);

    /* renamed from: d */
    private int f2256d = 0;

    /* renamed from: e */
    private final int f2257e;

    public C0848d(int i) {
        this.f2257e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new byte[r5];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] mo3116a(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = r0
        L_0x0003:
            java.util.List<byte[]> r0 = r4.f2255c     // Catch:{ all -> 0x002f }
            int r0 = r0.size()     // Catch:{ all -> 0x002f }
            if (r1 >= r0) goto L_0x002c
            java.util.List<byte[]> r0 = r4.f2255c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x002f }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x002f }
            int r2 = r0.length     // Catch:{ all -> 0x002f }
            if (r2 < r5) goto L_0x0028
            int r2 = r4.f2256d     // Catch:{ all -> 0x002f }
            int r3 = r0.length     // Catch:{ all -> 0x002f }
            int r2 = r2 - r3
            r4.f2256d = r2     // Catch:{ all -> 0x002f }
            java.util.List<byte[]> r2 = r4.f2255c     // Catch:{ all -> 0x002f }
            r2.remove(r1)     // Catch:{ all -> 0x002f }
            java.util.List<byte[]> r1 = r4.f2254b     // Catch:{ all -> 0x002f }
            r1.remove(r0)     // Catch:{ all -> 0x002f }
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0003
        L_0x002c:
            byte[] r0 = new byte[r5]     // Catch:{ all -> 0x002f }
            goto L_0x0026
        L_0x002f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C0848d.mo3116a(int):byte[]");
    }

    /* renamed from: a */
    public synchronized void mo3115a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f2257e) {
                this.f2254b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f2255c, bArr, f2253a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f2255c.add(binarySearch, bArr);
                this.f2256d += bArr.length;
                m4755a();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m4755a() {
        while (this.f2256d > this.f2257e) {
            byte[] remove = this.f2254b.remove(0);
            this.f2255c.remove(remove);
            this.f2256d -= remove.length;
        }
    }
}
