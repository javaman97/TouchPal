package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.graphics.Typeface;
import com.yahoo.mobile.client.p094a.p095a.C4073a;

/* renamed from: com.yahoo.mobile.client.share.search.util.l */
public final class C4247l {

    /* renamed from: a */
    private static Typeface f17345a = null;

    /* renamed from: a */
    public static Typeface m17792a(Context context) {
        if (f17345a == null || f17345a == Typeface.DEFAULT) {
            f17345a = m17793a(context, C4073a.C4085l.yssdk_yahoo_search_sdk_font, "tmpicon.raw");
        }
        return f17345a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d A[SYNTHETIC, Splitter:B:11:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[SYNTHETIC, Splitter:B:22:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m17793a(android.content.Context r7, int r8, java.lang.String r9) {
        /*
            android.content.res.Resources r0 = r7.getResources()
            java.io.InputStream r2 = r0.openRawResource(r8)
            java.io.File r0 = r7.getCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Output path: "
            r0.<init>(r1)
            r0.append(r3)
            r0 = 0
            int r1 = r2.available()     // Catch:{ IOException -> 0x0076, all -> 0x0066 }
            byte[] r4 = new byte[r1]     // Catch:{ IOException -> 0x0076, all -> 0x0066 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0076, all -> 0x0066 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0076, all -> 0x0066 }
        L_0x003d:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x0048 }
            if (r0 <= 0) goto L_0x0051
            r5 = 0
            r1.write(r4, r5, r0)     // Catch:{ IOException -> 0x0048 }
            goto L_0x003d
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0050:
            return r0
        L_0x0051:
            r1.flush()     // Catch:{ IOException -> 0x0048 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r3)     // Catch:{ IOException -> 0x0048 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0048 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0048 }
            r2.delete()     // Catch:{ IOException -> 0x0048 }
            r1.close()     // Catch:{ IOException -> 0x0064 }
            goto L_0x0050
        L_0x0064:
            r1 = move-exception
            goto L_0x0050
        L_0x0066:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x0072 }
        L_0x006f:
            throw r0
        L_0x0070:
            r1 = move-exception
            goto L_0x0050
        L_0x0072:
            r1 = move-exception
            goto L_0x006f
        L_0x0074:
            r0 = move-exception
            goto L_0x006a
        L_0x0076:
            r1 = move-exception
            r1 = r0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yahoo.mobile.client.share.search.util.C4247l.m17793a(android.content.Context, int, java.lang.String):android.graphics.Typeface");
    }
}
