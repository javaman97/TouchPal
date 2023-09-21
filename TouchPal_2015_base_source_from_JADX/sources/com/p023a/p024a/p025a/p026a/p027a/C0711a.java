package com.p023a.p024a.p025a.p026a.p027a;

import android.graphics.Bitmap;
import com.p023a.p024a.p025a.p026a.C0725b;
import com.p023a.p024a.p025a.p026a.p029b.C0726a;
import com.p023a.p024a.p032b.C0741a;
import com.p023a.p024a.p041c.C0811c;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.a.a.a.a.a.a */
/* compiled from: BaseDiscCache */
public abstract class C0711a implements C0725b {

    /* renamed from: a */
    public static final int f1721a = 32768;

    /* renamed from: b */
    public static final Bitmap.CompressFormat f1722b = Bitmap.CompressFormat.PNG;

    /* renamed from: c */
    public static final int f1723c = 100;

    /* renamed from: j */
    private static final String f1724j = " argument must be not null";

    /* renamed from: k */
    private static final String f1725k = ".tmp";

    /* renamed from: d */
    protected final File f1726d;

    /* renamed from: e */
    protected final File f1727e;

    /* renamed from: f */
    protected final C0726a f1728f;

    /* renamed from: g */
    protected int f1729g;

    /* renamed from: h */
    protected Bitmap.CompressFormat f1730h;

    /* renamed from: i */
    protected int f1731i;

    public C0711a(File file) {
        this(file, (File) null);
    }

    public C0711a(File file, File file2) {
        this(file, file2, C0741a.m4215b());
    }

    public C0711a(File file, File file2, C0726a aVar) {
        this.f1729g = 32768;
        this.f1730h = f1722b;
        this.f1731i = 100;
        if (file == null) {
            throw new IllegalArgumentException("cacheDir argument must be not null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("fileNameGenerator argument must be not null");
        } else {
            this.f1726d = file;
            this.f1727e = file2;
            this.f1728f = aVar;
        }
    }

    /* renamed from: a */
    public File mo2678a() {
        return this.f1726d;
    }

    /* renamed from: a */
    public File mo2679a(String str) {
        return mo2688c(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2681a(java.lang.String r7, java.io.InputStream r8, com.p023a.p024a.p041c.C0811c.C0812a r9) throws java.io.IOException {
        /*
            r6 = this;
            r2 = 0
            java.io.File r3 = r6.mo2688c(r7)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".tmp"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x004d }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x004d }
            r0.<init>(r4)     // Catch:{ all -> 0x004d }
            int r1 = r6.f1729g     // Catch:{ all -> 0x004d }
            r5.<init>(r0, r1)     // Catch:{ all -> 0x004d }
            int r0 = r6.f1729g     // Catch:{ all -> 0x0048 }
            boolean r1 = com.p023a.p024a.p041c.C0811c.m4618a(r8, r5, r9, r0)     // Catch:{ all -> 0x0048 }
            com.p023a.p024a.p041c.C0811c.m4614a((java.io.Closeable) r5)     // Catch:{ all -> 0x0061 }
            com.p023a.p024a.p041c.C0811c.m4614a((java.io.Closeable) r8)
            if (r1 == 0) goto L_0x0042
            boolean r0 = r4.renameTo(r3)
            if (r0 != 0) goto L_0x0042
            r1 = r2
        L_0x0042:
            if (r1 != 0) goto L_0x0047
            r4.delete()
        L_0x0047:
            return r1
        L_0x0048:
            r0 = move-exception
            com.p023a.p024a.p041c.C0811c.m4614a((java.io.Closeable) r5)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r1 = r2
        L_0x004f:
            com.p023a.p024a.p041c.C0811c.m4614a((java.io.Closeable) r8)
            if (r1 == 0) goto L_0x005b
            boolean r3 = r4.renameTo(r3)
            if (r3 != 0) goto L_0x005b
            r1 = r2
        L_0x005b:
            if (r1 != 0) goto L_0x0060
            r4.delete()
        L_0x0060:
            throw r0
        L_0x0061:
            r0 = move-exception
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p023a.p024a.p025a.p026a.p027a.C0711a.mo2681a(java.lang.String, java.io.InputStream, com.a.a.c.c$a):boolean");
    }

    /* renamed from: a */
    public boolean mo2680a(String str, Bitmap bitmap) throws IOException {
        File c = mo2688c(str);
        File file = new File(c.getAbsolutePath() + f1725k);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.f1729g);
        try {
            boolean compress = bitmap.compress(this.f1730h, this.f1731i, bufferedOutputStream);
            C0811c.m4614a((Closeable) bufferedOutputStream);
            if (compress && !file.renameTo(c)) {
                compress = false;
            }
            if (!compress) {
                file.delete();
            }
            bitmap.recycle();
            return compress;
        } catch (Throwable th) {
            C0811c.m4614a((Closeable) bufferedOutputStream);
            file.delete();
            throw th;
        }
    }

    /* renamed from: b */
    public boolean mo2683b(String str) {
        return mo2688c(str).delete();
    }

    /* renamed from: b */
    public void mo2682b() {
    }

    /* renamed from: c */
    public void mo2684c() {
        File[] listFiles = this.f1726d.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public File mo2688c(String str) {
        String a = this.f1728f.mo2731a(str);
        File file = this.f1726d;
        if (!this.f1726d.exists() && !this.f1726d.mkdirs() && this.f1727e != null && (this.f1727e.exists() || this.f1727e.mkdirs())) {
            file = this.f1727e;
        }
        return new File(file, a);
    }

    /* renamed from: a */
    public void mo2685a(int i) {
        this.f1729g = i;
    }

    /* renamed from: a */
    public void mo2686a(Bitmap.CompressFormat compressFormat) {
        this.f1730h = compressFormat;
    }

    /* renamed from: b */
    public void mo2687b(int i) {
        this.f1731i = i;
    }
}
