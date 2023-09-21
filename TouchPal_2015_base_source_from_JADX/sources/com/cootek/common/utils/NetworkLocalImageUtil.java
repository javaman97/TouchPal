package com.cootek.common.utils;

import com.p023a.p024a.p032b.p037d.C0781a;
import com.weibo.net.C4054q;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkLocalImageUtil {
    public static byte[] getImageFromNetwork(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(C0781a.f1973a);
        httpURLConnection.setRequestMethod(C4054q.f16510f);
        InputStream inputStream = httpURLConnection.getInputStream();
        if (httpURLConnection.getResponseCode() == 200) {
            return readStream(inputStream);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveFile(android.graphics.Bitmap r4, java.io.File r5) throws java.lang.Exception {
        /*
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0021, all -> 0x0031 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0021, all -> 0x0031 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x003a, all -> 0x0035 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x003e, all -> 0x0038 }
            r2 = 100
            boolean r0 = r4.compress(r0, r2, r1)     // Catch:{ Exception -> 0x003e, all -> 0x0038 }
            r1.flush()     // Catch:{ Exception -> 0x003e, all -> 0x0038 }
            if (r1 == 0) goto L_0x001b
            r1.close()
        L_0x001b:
            if (r3 == 0) goto L_0x0020
            r3.close()
        L_0x0020:
            return r0
        L_0x0021:
            r0 = move-exception
            r1 = r2
        L_0x0023:
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            r3 = r2
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()
        L_0x002b:
            if (r3 == 0) goto L_0x0030
            r3.close()
        L_0x0030:
            throw r0
        L_0x0031:
            r0 = move-exception
            r1 = r2
            r3 = r2
            goto L_0x0026
        L_0x0035:
            r0 = move-exception
            r1 = r2
            goto L_0x0026
        L_0x0038:
            r0 = move-exception
            goto L_0x0026
        L_0x003a:
            r0 = move-exception
            r1 = r2
            r2 = r3
            goto L_0x0023
        L_0x003e:
            r0 = move-exception
            r2 = r3
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.common.utils.NetworkLocalImageUtil.saveFile(android.graphics.Bitmap, java.io.File):boolean");
    }

    public static void clearResource(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (EOFException e) {
            } finally {
                byteArrayOutputStream.close();
                inputStream.close();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
