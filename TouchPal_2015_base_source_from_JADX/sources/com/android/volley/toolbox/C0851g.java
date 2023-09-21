package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.C0819c;
import com.android.volley.C0884y;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.g */
/* compiled from: DiskBasedCache */
public class C0851g implements C0819c {

    /* renamed from: e */
    private static final int f2260e = 5242880;

    /* renamed from: f */
    private static final float f2261f = 0.9f;

    /* renamed from: g */
    private static final int f2262g = 538183203;

    /* renamed from: a */
    private final Map<String, C0853a> f2263a;

    /* renamed from: b */
    private long f2264b;

    /* renamed from: c */
    private final File f2265c;

    /* renamed from: d */
    private final int f2266d;

    public C0851g(File file, int i) {
        this.f2263a = new LinkedHashMap(16, 0.75f, true);
        this.f2264b = 0;
        this.f2265c = file;
        this.f2266d = i;
    }

    public C0851g(File file) {
        this(file, f2260e);
    }

    /* renamed from: b */
    public synchronized void mo3032b() {
        synchronized (this) {
            File[] listFiles = this.f2265c.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            this.f2263a.clear();
            this.f2264b = 0;
            C0884y.m4878b("Cache cleared.", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066 A[SYNTHETIC, Splitter:B:33:0x0066] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.android.volley.C0819c.C0820a mo3028a(java.lang.String r9) {
        /*
            r8 = this;
            r1 = 0
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.android.volley.toolbox.g$a> r0 = r8.f2263a     // Catch:{ all -> 0x006a }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x006a }
            com.android.volley.toolbox.g$a r0 = (com.android.volley.toolbox.C0851g.C0853a) r0     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x000f
            r0 = r1
        L_0x000d:
            monitor-exit(r8)
            return r0
        L_0x000f:
            java.io.File r3 = r8.mo3119c((java.lang.String) r9)     // Catch:{ all -> 0x006a }
            com.android.volley.toolbox.g$b r2 = new com.android.volley.toolbox.g$b     // Catch:{ IOException -> 0x003d, all -> 0x0062 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0062 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x003d, all -> 0x0062 }
            r5 = 0
            r2.<init>(r4)     // Catch:{ IOException -> 0x003d, all -> 0x0062 }
            com.android.volley.toolbox.C0851g.C0853a.m4784a((java.io.InputStream) r2)     // Catch:{ IOException -> 0x0072 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0072 }
            int r6 = r2.f2274a     // Catch:{ IOException -> 0x0072 }
            long r6 = (long) r6     // Catch:{ IOException -> 0x0072 }
            long r4 = r4 - r6
            int r4 = (int) r4     // Catch:{ IOException -> 0x0072 }
            byte[] r4 = m4770a((java.io.InputStream) r2, (int) r4)     // Catch:{ IOException -> 0x0072 }
            com.android.volley.c$a r0 = r0.mo3120a((byte[]) r4)     // Catch:{ IOException -> 0x0072 }
            if (r2 == 0) goto L_0x000d
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x000d
        L_0x003a:
            r0 = move-exception
            r0 = r1
            goto L_0x000d
        L_0x003d:
            r0 = move-exception
            r2 = r1
        L_0x003f:
            java.lang.String r4 = "%s: %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0070 }
            r6 = 0
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0070 }
            r5[r6] = r3     // Catch:{ all -> 0x0070 }
            r3 = 1
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0070 }
            r5[r3] = r0     // Catch:{ all -> 0x0070 }
            com.android.volley.C0884y.m4878b(r4, r5)     // Catch:{ all -> 0x0070 }
            r8.mo3033b((java.lang.String) r9)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x005f }
        L_0x005d:
            r0 = r1
            goto L_0x000d
        L_0x005f:
            r0 = move-exception
            r0 = r1
            goto L_0x000d
        L_0x0062:
            r0 = move-exception
            r2 = r1
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x006d }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x006d:
            r0 = move-exception
            r0 = r1
            goto L_0x000d
        L_0x0070:
            r0 = move-exception
            goto L_0x0064
        L_0x0072:
            r0 = move-exception
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C0851g.mo3028a(java.lang.String):com.android.volley.c$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a A[SYNTHETIC, Splitter:B:28:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[SYNTHETIC, Splitter:B:31:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068 A[SYNTHETIC, Splitter:B:36:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0052 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo3029a() {
        /*
            r9 = this;
            r0 = 0
            monitor-enter(r9)
            java.io.File r1 = r9.f2265c     // Catch:{ all -> 0x006c }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x0025
            java.io.File r0 = r9.f2265c     // Catch:{ all -> 0x006c }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "Unable to create cache dir %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006c }
            r2 = 0
            java.io.File r3 = r9.f2265c     // Catch:{ all -> 0x006c }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x006c }
            r1[r2] = r3     // Catch:{ all -> 0x006c }
            com.android.volley.C0884y.m4880c(r0, r1)     // Catch:{ all -> 0x006c }
        L_0x0023:
            monitor-exit(r9)
            return
        L_0x0025:
            java.io.File r1 = r9.f2265c     // Catch:{ all -> 0x006c }
            java.io.File[] r3 = r1.listFiles()     // Catch:{ all -> 0x006c }
            if (r3 == 0) goto L_0x0023
            int r4 = r3.length     // Catch:{ all -> 0x006c }
            r2 = r0
        L_0x002f:
            if (r2 >= r4) goto L_0x0023
            r5 = r3[r2]     // Catch:{ all -> 0x006c }
            r1 = 0
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0056, all -> 0x0065 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0056, all -> 0x0065 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0056, all -> 0x0065 }
            r0.<init>(r6)     // Catch:{ IOException -> 0x0056, all -> 0x0065 }
            com.android.volley.toolbox.g$a r1 = com.android.volley.toolbox.C0851g.C0853a.m4784a((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0078 }
            long r6 = r5.length()     // Catch:{ IOException -> 0x0078 }
            r1.f2267a = r6     // Catch:{ IOException -> 0x0078 }
            java.lang.String r6 = r1.f2268b     // Catch:{ IOException -> 0x0078 }
            r9.m4768a((java.lang.String) r6, (com.android.volley.toolbox.C0851g.C0853a) r1)     // Catch:{ IOException -> 0x0078 }
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x006f }
        L_0x0052:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x002f
        L_0x0056:
            r0 = move-exception
            r0 = r1
        L_0x0058:
            if (r5 == 0) goto L_0x005d
            r5.delete()     // Catch:{ all -> 0x0073 }
        L_0x005d:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0052
        L_0x0063:
            r0 = move-exception
            goto L_0x0052
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            if (r1 == 0) goto L_0x006b
            r1.close()     // Catch:{ IOException -> 0x0071 }
        L_0x006b:
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x006f:
            r0 = move-exception
            goto L_0x0052
        L_0x0071:
            r1 = move-exception
            goto L_0x006b
        L_0x0073:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0066
        L_0x0078:
            r1 = move-exception
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C0851g.mo3029a():void");
    }

    /* renamed from: a */
    public synchronized void mo3031a(String str, boolean z) {
        C0819c.C0820a a = mo3028a(str);
        if (a != null) {
            a.f2155e = 0;
            if (z) {
                a.f2154d = 0;
            }
            mo3030a(str, a);
        }
    }

    /* renamed from: a */
    public synchronized void mo3030a(String str, C0819c.C0820a aVar) {
        m4764a(aVar.f2151a.length);
        File c = mo3119c(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c);
            C0853a aVar2 = new C0853a(str, aVar);
            if (!aVar2.mo3121a((OutputStream) fileOutputStream)) {
                fileOutputStream.close();
                C0884y.m4878b("Failed to write header for %s", c.getAbsolutePath());
                throw new IOException();
            }
            fileOutputStream.write(aVar.f2151a);
            fileOutputStream.close();
            m4768a(str, aVar2);
        } catch (IOException e) {
            if (!c.delete()) {
                C0884y.m4878b("Could not clean up file %s", c.getAbsolutePath());
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo3033b(String str) {
        boolean delete = mo3119c(str).delete();
        m4776e(str);
        if (!delete) {
            C0884y.m4878b("Could not delete cache entry for key=%s, filename=%s", str, m4773d(str));
        }
    }

    /* renamed from: d */
    private String m4773d(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: c */
    public File mo3119c(String str) {
        return new File(this.f2265c, m4773d(str));
    }

    /* renamed from: a */
    private void m4764a(int i) {
        int i2;
        if (this.f2264b + ((long) i) >= ((long) this.f2266d)) {
            if (C0884y.f2331b) {
                C0884y.m4876a("Pruning old cache entries.", new Object[0]);
            }
            long j = this.f2264b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<Map.Entry<String, C0853a>> it = this.f2263a.entrySet().iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = i3;
                    break;
                }
                C0853a aVar = (C0853a) it.next().getValue();
                if (mo3119c(aVar.f2268b).delete()) {
                    this.f2264b -= aVar.f2267a;
                } else {
                    C0884y.m4878b("Could not delete cache entry for key=%s, filename=%s", aVar.f2268b, m4773d(aVar.f2268b));
                }
                it.remove();
                i2 = i3 + 1;
                if (((float) (this.f2264b + ((long) i))) < ((float) this.f2266d) * f2261f) {
                    break;
                }
                i3 = i2;
            }
            if (C0884y.f2331b) {
                C0884y.m4876a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f2264b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: a */
    private void m4768a(String str, C0853a aVar) {
        if (!this.f2263a.containsKey(str)) {
            this.f2264b += aVar.f2267a;
        } else {
            this.f2264b = (aVar.f2267a - this.f2263a.get(str).f2267a) + this.f2264b;
        }
        this.f2263a.put(str, aVar);
    }

    /* renamed from: e */
    private void m4776e(String str) {
        C0853a aVar = this.f2263a.get(str);
        if (aVar != null) {
            this.f2264b -= aVar.f2267a;
            this.f2263a.remove(str);
        }
    }

    /* renamed from: a */
    private static byte[] m4770a(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Expected " + i + " bytes, read " + i2 + " bytes");
    }

    /* renamed from: com.android.volley.toolbox.g$a */
    /* compiled from: DiskBasedCache */
    static class C0853a {

        /* renamed from: a */
        public long f2267a;

        /* renamed from: b */
        public String f2268b;

        /* renamed from: c */
        public String f2269c;

        /* renamed from: d */
        public long f2270d;

        /* renamed from: e */
        public long f2271e;

        /* renamed from: f */
        public long f2272f;

        /* renamed from: g */
        public Map<String, String> f2273g;

        private C0853a() {
        }

        public C0853a(String str, C0819c.C0820a aVar) {
            this.f2268b = str;
            this.f2267a = (long) aVar.f2151a.length;
            this.f2269c = aVar.f2152b;
            this.f2270d = aVar.f2153c;
            this.f2271e = aVar.f2154d;
            this.f2272f = aVar.f2155e;
            this.f2273g = aVar.f2156f;
        }

        /* renamed from: a */
        public static C0853a m4784a(InputStream inputStream) throws IOException {
            C0853a aVar = new C0853a();
            if (C0851g.m4763a(inputStream) != C0851g.f2262g) {
                throw new IOException();
            }
            aVar.f2268b = C0851g.m4772c(inputStream);
            aVar.f2269c = C0851g.m4772c(inputStream);
            if (aVar.f2269c.equals("")) {
                aVar.f2269c = null;
            }
            aVar.f2270d = C0851g.m4771b(inputStream);
            aVar.f2271e = C0851g.m4771b(inputStream);
            aVar.f2272f = C0851g.m4771b(inputStream);
            aVar.f2273g = C0851g.m4774d(inputStream);
            return aVar;
        }

        /* renamed from: a */
        public C0819c.C0820a mo3120a(byte[] bArr) {
            C0819c.C0820a aVar = new C0819c.C0820a();
            aVar.f2151a = bArr;
            aVar.f2152b = this.f2269c;
            aVar.f2153c = this.f2270d;
            aVar.f2154d = this.f2271e;
            aVar.f2155e = this.f2272f;
            aVar.f2156f = this.f2273g;
            return aVar;
        }

        /* renamed from: a */
        public boolean mo3121a(OutputStream outputStream) {
            try {
                C0851g.m4765a(outputStream, (int) C0851g.f2262g);
                C0851g.m4767a(outputStream, this.f2268b);
                C0851g.m4767a(outputStream, this.f2269c == null ? "" : this.f2269c);
                C0851g.m4766a(outputStream, this.f2270d);
                C0851g.m4766a(outputStream, this.f2271e);
                C0851g.m4766a(outputStream, this.f2272f);
                C0851g.m4769a(this.f2273g, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C0884y.m4878b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.android.volley.toolbox.g$b */
    /* compiled from: DiskBasedCache */
    private static class C0854b extends FilterInputStream {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f2274a;

        private C0854b(InputStream inputStream) {
            super(inputStream);
            this.f2274a = 0;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f2274a++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f2274a += read;
            }
            return read;
        }
    }

    /* renamed from: e */
    private static int m4775e(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m4765a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static int m4763a(InputStream inputStream) throws IOException {
        return 0 | (m4775e(inputStream) << 0) | (m4775e(inputStream) << 8) | (m4775e(inputStream) << 16) | (m4775e(inputStream) << 24);
    }

    /* renamed from: a */
    static void m4766a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: b */
    static long m4771b(InputStream inputStream) throws IOException {
        return 0 | ((((long) m4775e(inputStream)) & 255) << 0) | ((((long) m4775e(inputStream)) & 255) << 8) | ((((long) m4775e(inputStream)) & 255) << 16) | ((((long) m4775e(inputStream)) & 255) << 24) | ((((long) m4775e(inputStream)) & 255) << 32) | ((((long) m4775e(inputStream)) & 255) << 40) | ((((long) m4775e(inputStream)) & 255) << 48) | ((((long) m4775e(inputStream)) & 255) << 56);
    }

    /* renamed from: a */
    static void m4767a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Utils.UTF8);
        m4766a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: c */
    static String m4772c(InputStream inputStream) throws IOException {
        return new String(m4770a(inputStream, (int) m4771b(inputStream)), Utils.UTF8);
    }

    /* renamed from: a */
    static void m4769a(Map<String, String> map, OutputStream outputStream) throws IOException {
        if (map != null) {
            m4765a(outputStream, map.size());
            for (Map.Entry next : map.entrySet()) {
                m4767a(outputStream, (String) next.getKey());
                m4767a(outputStream, (String) next.getValue());
            }
            return;
        }
        m4765a(outputStream, 0);
    }

    /* renamed from: d */
    static Map<String, String> m4774d(InputStream inputStream) throws IOException {
        int a = m4763a(inputStream);
        Map<String, String> emptyMap = a == 0 ? Collections.emptyMap() : new HashMap<>(a);
        for (int i = 0; i < a; i++) {
            emptyMap.put(m4772c(inputStream).intern(), m4772c(inputStream).intern());
        }
        return emptyMap;
    }
}
