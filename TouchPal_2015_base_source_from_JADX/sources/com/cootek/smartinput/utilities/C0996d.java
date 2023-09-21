package com.cootek.smartinput.utilities;

/* renamed from: com.cootek.smartinput.utilities.d */
/* compiled from: FileCopyProcessor */
class C0996d {

    /* renamed from: a */
    private static final int f2620a = 4096;

    /* renamed from: b */
    private boolean f2621b = false;

    /* renamed from: c */
    private boolean f2622c = false;

    C0996d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r6.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r4.f2621b = false;
        r4.f2622c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4082a(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x0005
            if (r6 != 0) goto L_0x0006
        L_0x0005:
            return
        L_0x0006:
            r0 = 1
            r4.f2621b = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x001c }
        L_0x000d:
            int r1 = r5.read(r0)     // Catch:{ IOException -> 0x001c }
            if (r1 <= 0) goto L_0x0024
            boolean r2 = r4.f2622c     // Catch:{ IOException -> 0x001c }
            if (r2 != 0) goto L_0x0024
            r2 = 0
            r6.write(r0, r2, r1)     // Catch:{ IOException -> 0x001c }
            goto L_0x000d
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r4.f2621b = r3
            r4.f2622c = r3
            throw r0
        L_0x0024:
            r6.flush()     // Catch:{ IOException -> 0x001c }
            r4.f2621b = r3
            r4.f2622c = r3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0996d.mo4082a(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: a */
    public boolean mo4083a() {
        return this.f2621b;
    }

    /* renamed from: b */
    public void mo4084b() {
        this.f2622c = true;
    }
}
