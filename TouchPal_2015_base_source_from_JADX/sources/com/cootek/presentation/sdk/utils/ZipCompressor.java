package com.cootek.presentation.sdk.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ZipCompressor {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0077, code lost:
        r2 = r5;
        r3 = r6;
        r4 = r7;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0034 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076 A[ExcHandler: ZipException (e java.util.zip.ZipException), PHI: r5 
      PHI: (r5v14 int) = (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v13 int), (r5v17 int), (r5v17 int), (r5v17 int), (r5v17 int) binds: [B:18:0x0034, B:19:?, B:29:0x004a, B:44:0x0088, B:45:?, B:79:0x00d3, B:80:?, B:77:0x00d0, B:78:?, B:74:0x00cb, B:75:?, B:68:0x00be, B:69:?, B:65:0x00b9, B:66:?, B:57:0x00ab, B:58:?, B:54:0x00a6, B:55:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:18:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0080 A[SYNTHETIC, Splitter:B:41:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b9 A[SYNTHETIC, Splitter:B:65:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00be A[SYNTHETIC, Splitter:B:68:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cb A[SYNTHETIC, Splitter:B:74:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d0 A[SYNTHETIC, Splitter:B:77:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00da A[SYNTHETIC, Splitter:B:85:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00ef A[SYNTHETIC, Splitter:B:95:0x00ef] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean extract(java.io.File r12, java.io.File r13, java.io.File r14) {
        /*
            r1 = 0
            r3 = 0
            if (r13 != 0) goto L_0x0006
            r0 = r1
        L_0x0005:
            return r0
        L_0x0006:
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r13.isFile()
            if (r0 == 0) goto L_0x0015
            com.cootek.presentation.sdk.utils.FileUtil.delete(r13)
        L_0x0015:
            boolean r0 = r13.exists()
            if (r0 != 0) goto L_0x001e
            r13.mkdir()
        L_0x001e:
            java.util.zip.ZipFile r8 = new java.util.zip.ZipFile     // Catch:{ ZipException -> 0x012a, IOException -> 0x011b, all -> 0x00eb }
            r8.<init>(r12)     // Catch:{ ZipException -> 0x012a, IOException -> 0x011b, all -> 0x00eb }
            java.util.Enumeration r9 = r8.entries()     // Catch:{ ZipException -> 0x0130, IOException -> 0x0121 }
            int r0 = r8.size()     // Catch:{ ZipException -> 0x0130, IOException -> 0x0121 }
            java.io.File[] r7 = new java.io.File[r0]     // Catch:{ ZipException -> 0x0130, IOException -> 0x0121 }
            int r0 = r8.size()     // Catch:{ ZipException -> 0x0136, IOException -> 0x0126 }
            java.io.File[] r6 = new java.io.File[r0]     // Catch:{ ZipException -> 0x0136, IOException -> 0x0126 }
            r5 = r1
        L_0x0034:
            boolean r0 = r9.hasMoreElements()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            if (r0 != 0) goto L_0x004a
            r0 = 1
            if (r8 == 0) goto L_0x0040
            r8.close()     // Catch:{ IOException -> 0x0113 }
        L_0x0040:
            if (r0 == 0) goto L_0x0005
            if (r7 == 0) goto L_0x0005
        L_0x0044:
            if (r1 < r5) goto L_0x00f3
            com.cootek.presentation.sdk.utils.FileUtil.delete(r13)
            goto L_0x0005
        L_0x004a:
            java.lang.Object r0 = r9.nextElement()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            java.lang.String r2 = r0.getName()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            java.io.File r4 = new java.io.File     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            r4.<init>(r13, r2)     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            boolean r10 = r4.exists()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            if (r10 == 0) goto L_0x0062
            r4.delete()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
        L_0x0062:
            java.io.File r10 = new java.io.File     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            r10.<init>(r13, r2)     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            java.io.File r11 = new java.io.File     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            r11.<init>(r14, r2)     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            boolean r2 = r0.isDirectory()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            if (r2 == 0) goto L_0x0088
            r10.mkdir()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            goto L_0x0034
        L_0x0076:
            r0 = move-exception
            r2 = r5
            r3 = r6
            r4 = r7
            r5 = r8
        L_0x007b:
            r0.printStackTrace()     // Catch:{ all -> 0x0118 }
            if (r5 == 0) goto L_0x014b
            r5.close()     // Catch:{ IOException -> 0x00e0 }
            r5 = r2
            r6 = r3
            r7 = r4
            r0 = r1
            goto L_0x0040
        L_0x0088:
            java.io.File r2 = r10.getParentFile()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            createFolder(r2)     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            r10.createNewFile()     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00c6 }
            r4.<init>(r10)     // Catch:{ IOException -> 0x00b1, all -> 0x00c6 }
            java.io.InputStream r2 = r8.getInputStream(r0)     // Catch:{ IOException -> 0x0141, all -> 0x013c }
            copyFile(r2, r4)     // Catch:{ IOException -> 0x0145 }
            r7[r5] = r10     // Catch:{ IOException -> 0x0145 }
            r6[r5] = r11     // Catch:{ IOException -> 0x0145 }
            int r5 = r5 + 1
            if (r4 == 0) goto L_0x00a9
            r4.close()     // Catch:{ IOException -> 0x010f, ZipException -> 0x0076 }
        L_0x00a9:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ IOException -> 0x00af, ZipException -> 0x0076 }
            goto L_0x0034
        L_0x00af:
            r0 = move-exception
            goto L_0x0034
        L_0x00b1:
            r0 = move-exception
            r2 = r3
            r4 = r3
        L_0x00b4:
            r0.printStackTrace()     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x00bc
            r4.close()     // Catch:{ IOException -> 0x0109, ZipException -> 0x0076 }
        L_0x00bc:
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ IOException -> 0x00c3, ZipException -> 0x0076 }
            goto L_0x0034
        L_0x00c3:
            r0 = move-exception
            goto L_0x0034
        L_0x00c6:
            r0 = move-exception
            r2 = r3
            r4 = r3
        L_0x00c9:
            if (r4 == 0) goto L_0x00ce
            r4.close()     // Catch:{ IOException -> 0x010b, ZipException -> 0x0076 }
        L_0x00ce:
            if (r2 == 0) goto L_0x00d3
            r2.close()     // Catch:{ IOException -> 0x010d, ZipException -> 0x0076 }
        L_0x00d3:
            throw r0     // Catch:{ ZipException -> 0x0076, IOException -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
        L_0x00d5:
            r0.printStackTrace()     // Catch:{ all -> 0x0116 }
            if (r8 == 0) goto L_0x0148
            r8.close()     // Catch:{ IOException -> 0x00e7 }
            r0 = r1
            goto L_0x0040
        L_0x00e0:
            r0 = move-exception
            r5 = r2
            r6 = r3
            r7 = r4
            r0 = r1
            goto L_0x0040
        L_0x00e7:
            r0 = move-exception
            r0 = r1
            goto L_0x0040
        L_0x00eb:
            r0 = move-exception
            r8 = r3
        L_0x00ed:
            if (r8 == 0) goto L_0x00f2
            r8.close()     // Catch:{ IOException -> 0x0111 }
        L_0x00f2:
            throw r0
        L_0x00f3:
            r2 = r6[r1]
            java.io.File r2 = r2.getParentFile()
            createFolder(r2)
            r2 = r7[r1]
            r3 = r6[r1]
            boolean r2 = r2.renameTo(r3)
            r0 = r0 & r2
            int r1 = r1 + 1
            goto L_0x0044
        L_0x0109:
            r0 = move-exception
            goto L_0x00bc
        L_0x010b:
            r3 = move-exception
            goto L_0x00ce
        L_0x010d:
            r2 = move-exception
            goto L_0x00d3
        L_0x010f:
            r0 = move-exception
            goto L_0x00a9
        L_0x0111:
            r1 = move-exception
            goto L_0x00f2
        L_0x0113:
            r2 = move-exception
            goto L_0x0040
        L_0x0116:
            r0 = move-exception
            goto L_0x00ed
        L_0x0118:
            r0 = move-exception
            r8 = r5
            goto L_0x00ed
        L_0x011b:
            r0 = move-exception
            r5 = r1
            r6 = r3
            r7 = r3
            r8 = r3
            goto L_0x00d5
        L_0x0121:
            r0 = move-exception
            r5 = r1
            r6 = r3
            r7 = r3
            goto L_0x00d5
        L_0x0126:
            r0 = move-exception
            r5 = r1
            r6 = r3
            goto L_0x00d5
        L_0x012a:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r5 = r3
            goto L_0x007b
        L_0x0130:
            r0 = move-exception
            r2 = r1
            r4 = r3
            r5 = r8
            goto L_0x007b
        L_0x0136:
            r0 = move-exception
            r2 = r1
            r4 = r7
            r5 = r8
            goto L_0x007b
        L_0x013c:
            r0 = move-exception
            r2 = r3
            goto L_0x00c9
        L_0x013f:
            r0 = move-exception
            goto L_0x00c9
        L_0x0141:
            r0 = move-exception
            r2 = r3
            goto L_0x00b4
        L_0x0145:
            r0 = move-exception
            goto L_0x00b4
        L_0x0148:
            r0 = r1
            goto L_0x0040
        L_0x014b:
            r5 = r2
            r6 = r3
            r7 = r4
            r0 = r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.sdk.utils.ZipCompressor.extract(java.io.File, java.io.File, java.io.File):boolean");
    }

    private static void createFolder(File file) {
        if (!file.exists()) {
            createFolder(file.getParentFile());
        }
        file.mkdir();
    }

    public static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
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
}
