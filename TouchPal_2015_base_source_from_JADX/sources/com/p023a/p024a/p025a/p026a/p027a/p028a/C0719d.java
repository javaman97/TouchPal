package com.p023a.p024a.p025a.p026a.p027a.p028a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p026a.p027a.p028a.C0712a;
import com.p023a.p024a.p025a.p026a.p029b.C0726a;
import com.p023a.p024a.p041c.C0811c;
import com.p023a.p024a.p041c.C0813d;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.a.a.a.a.d */
/* compiled from: LruDiscCache */
public class C0719d implements C0725b {

    /* renamed from: a */
    public static final int f1779a = 32768;

    /* renamed from: b */
    public static final Bitmap.CompressFormat f1780b = Bitmap.CompressFormat.PNG;

    /* renamed from: c */
    public static final int f1781c = 100;

    /* renamed from: i */
    private static final String f1782i = " argument must be not null";

    /* renamed from: j */
    private static final String f1783j = " argument must be positive number";

    /* renamed from: d */
    protected C0712a f1784d;

    /* renamed from: e */
    protected final C0726a f1785e;

    /* renamed from: f */
    protected int f1786f;

    /* renamed from: g */
    protected Bitmap.CompressFormat f1787g;

    /* renamed from: h */
    protected int f1788h;

    /* renamed from: k */
    private File f1789k;

    public C0719d(File file, C0726a aVar, long j) throws IOException {
        this(file, (File) null, aVar, j, 0);
    }

    public C0719d(File file, File file2, C0726a aVar, long j, int i) throws IOException {
        long j2;
        int i2;
        this.f1786f = 32768;
        this.f1787g = f1780b;
        this.f1788h = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (j < 0) {
            throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
        } else if (i < 0) {
            throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
        } else if (aVar == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        } else {
            if (j == 0) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            if (i == 0) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = i;
            }
            this.f1789k = file2;
            this.f1785e = aVar;
            m4095a(file, file2, j2, i2);
        }
    }

    /* renamed from: a */
    private void m4095a(File file, File file2, long j, int i) throws IOException {
        try {
            this.f1784d = C0712a.m4029a(file, 1, 1, j, i);
        } catch (IOException e) {
            C0813d.m4623a((Throwable) e);
            if (file2 != null) {
                m4095a(file2, (File) null, j, i);
            }
            if (this.f1784d == null) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public File mo2678a() {
        return this.f1784d.mo2690a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File mo2679a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            com.a.a.a.a.a.a.a r1 = r3.f1784d     // Catch:{ IOException -> 0x0019, all -> 0x0024 }
            java.lang.String r2 = r3.m4096c(r4)     // Catch:{ IOException -> 0x0019, all -> 0x0024 }
            com.a.a.a.a.a.a.a$c r2 = r1.mo2689a((java.lang.String) r2)     // Catch:{ IOException -> 0x0019, all -> 0x0024 }
            if (r2 != 0) goto L_0x0013
        L_0x000d:
            if (r2 == 0) goto L_0x0012
            r2.close()
        L_0x0012:
            return r0
        L_0x0013:
            r1 = 0
            java.io.File r0 = r2.mo2717a(r1)     // Catch:{ IOException -> 0x002f }
            goto L_0x000d
        L_0x0019:
            r1 = move-exception
            r2 = r0
        L_0x001b:
            com.p023a.p024a.p041c.C0813d.m4623a((java.lang.Throwable) r1)     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0012
            r2.close()
            goto L_0x0012
        L_0x0024:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x0027:
            if (r2 == 0) goto L_0x002c
            r2.close()
        L_0x002c:
            throw r0
        L_0x002d:
            r0 = move-exception
            goto L_0x0027
        L_0x002f:
            r1 = move-exception
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p023a.p024a.p025a.p026a.p027a.p028a.C0719d.mo2679a(java.lang.String):java.io.File");
    }

    /* renamed from: a */
    public boolean mo2681a(String str, InputStream inputStream, C0811c.C0812a aVar) throws IOException {
        boolean z = false;
        C0712a.C0713a b = this.f1784d.mo2693b(m4096c(str));
        if (b != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b.mo2707c(0), this.f1786f);
            try {
                z = C0811c.m4618a(inputStream, bufferedOutputStream, aVar, this.f1786f);
                C0811c.m4614a((Closeable) bufferedOutputStream);
                if (z) {
                    b.mo2703a();
                } else {
                    b.mo2706b();
                }
            } catch (Throwable th) {
                C0811c.m4614a((Closeable) bufferedOutputStream);
                b.mo2706b();
                throw th;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo2680a(String str, Bitmap bitmap) throws IOException {
        boolean z = false;
        C0712a.C0713a b = this.f1784d.mo2693b(m4096c(str));
        if (b != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(b.mo2707c(0), this.f1786f);
            try {
                z = bitmap.compress(this.f1787g, this.f1788h, bufferedOutputStream);
                if (z) {
                    b.mo2703a();
                } else {
                    b.mo2706b();
                }
            } finally {
                C0811c.m4614a((Closeable) bufferedOutputStream);
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo2683b(String str) {
        try {
            return this.f1784d.mo2695c(m4096c(str));
        } catch (IOException e) {
            C0813d.m4623a((Throwable) e);
            return false;
        }
    }

    /* renamed from: b */
    public void mo2682b() {
        try {
            this.f1784d.close();
        } catch (IOException e) {
            C0813d.m4623a((Throwable) e);
        }
        this.f1784d = null;
    }

    /* renamed from: c */
    public void mo2684c() {
        try {
            this.f1784d.mo2701h();
        } catch (IOException e) {
            C0813d.m4623a((Throwable) e);
        }
        try {
            m4095a(this.f1784d.mo2690a(), this.f1789k, this.f1784d.mo2692b(), this.f1784d.mo2694c());
        } catch (IOException e2) {
            C0813d.m4623a((Throwable) e2);
        }
    }

    /* renamed from: c */
    private String m4096c(String str) {
        return this.f1785e.mo2731a(str);
    }

    /* renamed from: a */
    public void mo2725a(int i) {
        this.f1786f = i;
    }

    /* renamed from: a */
    public void mo2726a(Bitmap.CompressFormat compressFormat) {
        this.f1787g = compressFormat;
    }

    /* renamed from: b */
    public void mo2727b(int i) {
        this.f1788h = i;
    }
}
