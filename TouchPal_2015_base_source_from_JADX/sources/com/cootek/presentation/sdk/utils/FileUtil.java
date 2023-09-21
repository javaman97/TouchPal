package com.cootek.presentation.sdk.utils;

import java.io.File;

public class FileUtil {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080 A[SYNTHETIC, Splitter:B:40:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0090 A[SYNTHETIC, Splitter:B:49:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e A[SYNTHETIC, Splitter:B:56:0x009e] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x007b=Splitter:B:37:0x007b, B:46:0x008b=Splitter:B:46:0x008b, B:23:0x004f=Splitter:B:23:0x004f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getMD5(java.io.File r7) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x00ad, FileNotFoundException -> 0x0079, IOException -> 0x0089, all -> 0x0099 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x00ad, FileNotFoundException -> 0x0079, IOException -> 0x0089, all -> 0x0099 }
            r2.<init>(r7)     // Catch:{ NoSuchAlgorithmException -> 0x00ad, FileNotFoundException -> 0x0079, IOException -> 0x0089, all -> 0x0099 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
        L_0x0011:
            int r5 = r2.read(r4)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            if (r5 > 0) goto L_0x0049
            byte[] r3 = r3.digest()     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            r4.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
        L_0x0020:
            int r5 = r3.length     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            if (r1 < r5) goto L_0x005d
            boolean r1 = com.cootek.presentation.service.PresentationSystem.DUMPINFO     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = "Presentation/FileUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.String r5 = "md5: "
            r3.<init>(r5)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.String r5 = r4.toString()     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            java.lang.String r3 = r3.toString()     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            android.util.Log.d(r1, r3)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
        L_0x003f:
            java.lang.String r0 = r4.toString()     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0048:
            return r0
        L_0x0049:
            r6 = 0
            r3.update(r4, r6, r5)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            goto L_0x0011
        L_0x004e:
            r1 = move-exception
        L_0x004f:
            r1.printStackTrace()     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0058 }
            goto L_0x0048
        L_0x0058:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0048
        L_0x005d:
            byte r5 = r3[r1]     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 + 256
            r6 = 16
            java.lang.String r5 = java.lang.Integer.toString(r5, r6)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            r6 = 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            r4.append(r5)     // Catch:{ NoSuchAlgorithmException -> 0x004e, FileNotFoundException -> 0x00ab, IOException -> 0x00a9 }
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0074:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0048
        L_0x0079:
            r1 = move-exception
            r2 = r0
        L_0x007b:
            r1.printStackTrace()     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0084 }
            goto L_0x0048
        L_0x0084:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0048
        L_0x0089:
            r1 = move-exception
            r2 = r0
        L_0x008b:
            r1.printStackTrace()     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x0048
        L_0x0094:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0048
        L_0x0099:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x009c:
            if (r2 == 0) goto L_0x00a1
            r2.close()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a1:
            throw r0
        L_0x00a2:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x00a1
        L_0x00a7:
            r0 = move-exception
            goto L_0x009c
        L_0x00a9:
            r1 = move-exception
            goto L_0x008b
        L_0x00ab:
            r1 = move-exception
            goto L_0x007b
        L_0x00ad:
            r1 = move-exception
            r2 = r0
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.presentation.sdk.utils.FileUtil.getMD5(java.io.File):java.lang.String");
    }

    public static void delete(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete(delete);
                    }
                }
                file.delete();
                return;
            }
            file.delete();
        }
    }
}
