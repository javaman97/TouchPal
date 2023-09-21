package com.cootek.usage;

import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.cootek.usage.f */
final class C3291f {

    /* renamed from: a */
    private static final int f14458a = 4096;

    C3291f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067 A[SYNTHETIC, Splitter:B:37:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c A[Catch:{ IOException -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0085 A[SYNTHETIC, Splitter:B:50:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[Catch:{ IOException -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0062=Splitter:B:34:0x0062, B:22:0x0049=Splitter:B:22:0x0049} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14584a(java.lang.String[] r7) {
        /*
            r6 = -1
            r2 = 0
            java.lang.String r1 = ""
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            r0.<init>(r7)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0080 }
            r5.<init>()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0080 }
            java.lang.Process r4 = r0.start()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0080 }
            java.io.InputStream r3 = r4.getErrorStream()     // Catch:{ IOException -> 0x00ad, Exception -> 0x00a6, all -> 0x009d }
        L_0x0016:
            int r0 = r3.read()     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            if (r0 != r6) goto L_0x0044
            r0 = 10
            r5.write(r0)     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
        L_0x0025:
            int r0 = r2.read()     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            if (r0 != r6) goto L_0x005d
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            if (r3 == 0) goto L_0x0039
            r3.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x003e:
            if (r4 == 0) goto L_0x0043
            r4.destroy()
        L_0x0043:
            return r0
        L_0x0044:
            r5.write(r0)     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            goto L_0x0016
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0051
            r3.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0056:
            if (r4 == 0) goto L_0x00b0
            r4.destroy()
            r0 = r1
            goto L_0x0043
        L_0x005d:
            r5.write(r0)     // Catch:{ IOException -> 0x0048, Exception -> 0x0061 }
            goto L_0x0025
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x006a
            r3.close()     // Catch:{ IOException -> 0x007b }
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x006f:
            if (r4 == 0) goto L_0x00b0
            r4.destroy()
            r0 = r1
            goto L_0x0043
        L_0x0076:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0056
        L_0x007b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x006f
        L_0x0080:
            r0 = move-exception
            r3 = r2
            r4 = r2
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r3.close()     // Catch:{ IOException -> 0x0093 }
        L_0x0088:
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ IOException -> 0x0093 }
        L_0x008d:
            if (r4 == 0) goto L_0x0092
            r4.destroy()
        L_0x0092:
            throw r0
        L_0x0093:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x008d
        L_0x0098:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x003e
        L_0x009d:
            r0 = move-exception
            r3 = r2
            goto L_0x0083
        L_0x00a0:
            r0 = move-exception
            goto L_0x0083
        L_0x00a2:
            r0 = move-exception
            r3 = r2
            r4 = r2
            goto L_0x0062
        L_0x00a6:
            r0 = move-exception
            r3 = r2
            goto L_0x0062
        L_0x00a9:
            r0 = move-exception
            r3 = r2
            r4 = r2
            goto L_0x0049
        L_0x00ad:
            r0 = move-exception
            r3 = r2
            goto L_0x0049
        L_0x00b0:
            r0 = r1
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3291f.m14584a(java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    private static void m14585a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                m14585a(a);
            }
        }
        file.delete();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[SYNTHETIC, Splitter:B:23:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0035 A[SYNTHETIC, Splitter:B:26:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004a A[SYNTHETIC, Splitter:B:37:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x004f A[SYNTHETIC, Splitter:B:40:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0061 A[SYNTHETIC, Splitter:B:49:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0066 A[SYNTHETIC, Splitter:B:52:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m14586a(java.io.File r4, java.io.File r5) {
        /*
            r2 = 0
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0023
            boolean r0 = r5.exists()
            if (r0 != 0) goto L_0x0010
            r5.createNewFile()     // Catch:{ IOException -> 0x0024 }
        L_0x0010:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0043, all -> 0x005d }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0043, all -> 0x005d }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0087 }
            r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x0087 }
            m14587a((java.io.InputStream) r3, (java.io.OutputStream) r1)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x0089, all -> 0x0080 }
            r3.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0020:
            r1.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0023:
            return
        L_0x0024:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0010
        L_0x0029:
            r0 = move-exception
            r1 = r2
        L_0x002b:
            r0.printStackTrace()     // Catch:{ all -> 0x0083 }
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x003e }
        L_0x0033:
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0023
        L_0x0039:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0023
        L_0x003e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0033
        L_0x0043:
            r0 = move-exception
            r3 = r2
        L_0x0045:
            r0.printStackTrace()     // Catch:{ all -> 0x007e }
            if (r3 == 0) goto L_0x004d
            r3.close()     // Catch:{ IOException -> 0x0058 }
        L_0x004d:
            if (r2 == 0) goto L_0x0023
            r2.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0023
        L_0x0053:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0023
        L_0x0058:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x004d
        L_0x005d:
            r0 = move-exception
            r3 = r2
        L_0x005f:
            if (r3 == 0) goto L_0x0064
            r3.close()     // Catch:{ IOException -> 0x006a }
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x006f }
        L_0x0069:
            throw r0
        L_0x006a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0064
        L_0x006f:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0069
        L_0x0074:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0020
        L_0x0079:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0023
        L_0x007e:
            r0 = move-exception
            goto L_0x005f
        L_0x0080:
            r0 = move-exception
            r2 = r1
            goto L_0x005f
        L_0x0083:
            r0 = move-exception
            r3 = r2
            r2 = r1
            goto L_0x005f
        L_0x0087:
            r0 = move-exception
            goto L_0x0045
        L_0x0089:
            r0 = move-exception
            r2 = r1
            goto L_0x0045
        L_0x008c:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x002b
        L_0x0090:
            r0 = move-exception
            r2 = r3
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.usage.C3291f.m14586a(java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    private static void m14587a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    private static void m14588a(String str, String str2) {
        m14584a(new String[]{"chmod", str, str2});
    }

    /* renamed from: a */
    private static boolean m14589a(AssetManager assetManager, String str, String str2) {
        try {
            InputStream open = assetManager.open(str);
            FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(str2) + File.separator + str);
            m14587a(open, (OutputStream) fileOutputStream);
            fileOutputStream.close();
            open.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m14590b(AssetManager assetManager, String str, String str2) {
        String str3;
        try {
            String[] list = assetManager.list(str);
            if (list.length == 0) {
                return false;
            }
            File file = new File(String.valueOf(str2) + File.separator + str);
            if (!file.exists()) {
                file.mkdirs();
            }
            int length = list.length;
            int i = 0;
            while (i < length) {
                String str4 = String.valueOf(str) + File.separator + list[i];
                try {
                    assetManager.open(str4).close();
                    if (!m14589a(assetManager, str4, str2)) {
                        return false;
                    }
                    i++;
                } catch (Exception e) {
                    if (!m14590b(assetManager, str3, str2)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
