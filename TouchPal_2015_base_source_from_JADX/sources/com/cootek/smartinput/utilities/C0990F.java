package com.cootek.smartinput.utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.cootek.smartinput.utilities.F */
/* compiled from: ZipCompressor */
public class C0990F {

    /* renamed from: e */
    private static Map<String, C0991G> f2577e = new HashMap();

    /* renamed from: a */
    List<String> f2578a = new ArrayList();

    /* renamed from: b */
    String f2579b;

    /* renamed from: c */
    String[] f2580c;

    /* renamed from: d */
    String[] f2581d;

    /* renamed from: a */
    public static void m5124a(File file, File file2) throws Exception {
        m5125a(file, file2, (String) null);
    }

    /* renamed from: a */
    public static void m5125a(File file, File file2, String str) throws Exception {
        if (file2 != null && file2.exists()) {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            C0991G g = new C0991G(str);
            if (str != null) {
                f2577e.put(str, g);
            }
            try {
                g.mo4053a(entries, zipFile, file2);
                if (str != null) {
                    f2577e.remove(str);
                }
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e) {
                    }
                }
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                if (str != null) {
                    f2577e.remove(str);
                }
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e3) {
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static void m5126a(String str) {
        C0991G remove;
        if (str != null && (remove = f2577e.remove(str)) != null && remove.mo4054a()) {
            remove.mo4055b();
        }
    }

    public C0990F(String str) {
        this.f2579b = str;
    }

    /* renamed from: a */
    public static void m5127a(String str, String str2, String[] strArr, String[] strArr2) {
        File file = new File(str);
        if (file.exists()) {
            C0990F f = new C0990F(str);
            f.mo4052a(strArr, strArr2);
            f.mo4050a(file);
            f.mo4051a(str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[SYNTHETIC, Splitter:B:16:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[SYNTHETIC, Splitter:B:19:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[SYNTHETIC, Splitter:B:25:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A[SYNTHETIC, Splitter:B:28:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4051a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r1]
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0096, all -> 0x008b }
            r2.<init>(r11)     // Catch:{ Exception -> 0x0096, all -> 0x008b }
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ Exception -> 0x0099, all -> 0x0091 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0099, all -> 0x0091 }
            java.util.List<java.lang.String> r0 = r9.f2578a     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
        L_0x0015:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            r1.putNextEntry(r5)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            r6.<init>()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.StringBuilder r6 = r6.append(r10)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.StringBuilder r0 = r6.append(r0)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
        L_0x0045:
            int r0 = r5.read(r3)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            if (r0 <= 0) goto L_0x005e
            r6 = 0
            r1.write(r3, r6, r0)     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            goto L_0x0045
        L_0x0050:
            r0 = move-exception
            r0 = r1
            r1 = r2
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch:{ IOException -> 0x0085 }
        L_0x005d:
            return
        L_0x005e:
            r5.close()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            goto L_0x0015
        L_0x0062:
            r0 = move-exception
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ IOException -> 0x0087 }
        L_0x0068:
            if (r2 == 0) goto L_0x006d
            r2.close()     // Catch:{ IOException -> 0x0089 }
        L_0x006d:
            throw r0
        L_0x006e:
            r1.closeEntry()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            r1.close()     // Catch:{ Exception -> 0x0050, all -> 0x0062 }
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ IOException -> 0x0081 }
        L_0x0079:
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x005d
        L_0x007f:
            r0 = move-exception
            goto L_0x005d
        L_0x0081:
            r0 = move-exception
            goto L_0x0079
        L_0x0083:
            r0 = move-exception
            goto L_0x0058
        L_0x0085:
            r0 = move-exception
            goto L_0x005d
        L_0x0087:
            r1 = move-exception
            goto L_0x0068
        L_0x0089:
            r1 = move-exception
            goto L_0x006d
        L_0x008b:
            r1 = move-exception
            r2 = r0
            r8 = r0
            r0 = r1
            r1 = r8
            goto L_0x0063
        L_0x0091:
            r1 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0063
        L_0x0096:
            r1 = move-exception
            r1 = r0
            goto L_0x0053
        L_0x0099:
            r1 = move-exception
            r1 = r2
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0990F.mo4051a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4050a(java.io.File r8) {
        /*
            r7 = this;
            r1 = 1
            r0 = 0
            boolean r2 = r8.isFile()
            if (r2 == 0) goto L_0x0032
            java.lang.String[] r2 = r7.f2581d
            if (r2 == 0) goto L_0x006f
            java.lang.String[] r3 = r7.f2581d
            int r4 = r3.length
            r2 = r0
        L_0x0010:
            if (r2 >= r4) goto L_0x006f
            r5 = r3[r2]
            java.lang.String r6 = r8.getName()
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0066
            r2 = r1
        L_0x001f:
            if (r2 != 0) goto L_0x0032
            java.util.List<java.lang.String> r2 = r7.f2578a
            java.io.File r3 = r8.getAbsoluteFile()
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r7.m5128b(r3)
            r2.add(r3)
        L_0x0032:
            boolean r2 = r8.isDirectory()
            if (r2 == 0) goto L_0x006c
            java.lang.String[] r2 = r7.f2580c
            if (r2 == 0) goto L_0x006d
            java.lang.String[] r3 = r7.f2580c
            int r4 = r3.length
            r2 = r0
        L_0x0040:
            if (r2 >= r4) goto L_0x006d
            r5 = r3[r2]
            java.lang.String r6 = r8.getName()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0069
        L_0x004e:
            if (r1 != 0) goto L_0x006c
            java.lang.String[] r1 = r8.list()
            if (r1 == 0) goto L_0x006c
            int r2 = r1.length
        L_0x0057:
            if (r0 >= r2) goto L_0x006c
            r3 = r1[r0]
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r3)
            r7.mo4050a((java.io.File) r4)
            int r0 = r0 + 1
            goto L_0x0057
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0069:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x006c:
            return
        L_0x006d:
            r1 = r0
            goto L_0x004e
        L_0x006f:
            r2 = r0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput.utilities.C0990F.mo4050a(java.io.File):void");
    }

    /* renamed from: b */
    private String m5128b(String str) {
        return str.substring(this.f2579b.length() + 1, str.length());
    }

    /* renamed from: a */
    public void mo4052a(String[] strArr, String[] strArr2) {
        this.f2580c = strArr;
        this.f2581d = strArr2;
    }
}
