package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.iflytek.cloud.a.d.e */
public class C3995e {

    /* renamed from: a */
    private static String f16345a = "";

    /* renamed from: a */
    public static String m17043a(Context context) {
        if (!TextUtils.isEmpty(f16345a)) {
            return f16345a;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        String str = absolutePath + "msclib/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        f16345a = str;
        return f16345a;
    }

    /* renamed from: a */
    public static void m17044a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!str.endsWith("/")) {
                file = file.getParentFile();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[SYNTHETIC, Splitter:B:12:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f A[SYNTHETIC, Splitter:B:27:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m17045a(java.util.concurrent.ConcurrentLinkedQueue<byte[]> r4, java.lang.String r5) {
        /*
            r2 = 0
            m17044a((java.lang.String) r5)     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            r1.<init>(r5)     // Catch:{ Exception -> 0x004a, all -> 0x003b }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ Exception -> 0x001d }
        L_0x000d:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x001d }
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x001d }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x001d }
            r1.write(r0)     // Catch:{ Exception -> 0x001d }
            goto L_0x000d
        L_0x001d:
            r0 = move-exception
        L_0x001e:
            r0.printStackTrace()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0026
            r1.close()     // Catch:{ Exception -> 0x0036 }
        L_0x0026:
            return
        L_0x0027:
            r1.close()     // Catch:{ Exception -> 0x001d }
            r0 = 0
            if (r2 == 0) goto L_0x0026
            r0.close()     // Catch:{ Exception -> 0x0031 }
            goto L_0x0026
        L_0x0031:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0026
        L_0x0036:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0026
        L_0x003b:
            r0 = move-exception
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0042:
            throw r0
        L_0x0043:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0042
        L_0x0048:
            r0 = move-exception
            goto L_0x003d
        L_0x004a:
            r0 = move-exception
            r1 = r2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.p078a.p082d.C3995e.m17045a(java.util.concurrent.ConcurrentLinkedQueue, java.lang.String):void");
    }
}
