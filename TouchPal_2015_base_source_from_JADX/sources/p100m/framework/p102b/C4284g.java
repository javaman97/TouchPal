package p100m.framework.p102b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: m.framework.b.g */
/* compiled from: Utils */
public class C4284g {

    /* renamed from: a */
    private static float f17444a;

    /* renamed from: a */
    public static int m17938a(Context context, int i) {
        if (f17444a <= 0.0f) {
            f17444a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((((float) i) * f17444a) + 0.5f);
    }

    /* renamed from: a */
    public static boolean m17944a(String str) {
        return str == null || str.trim().length() <= 0 || "null".equals(str.trim().toLowerCase(Locale.getDefault()));
    }

    /* renamed from: b */
    public static Bitmap m17946b(String str) throws Throwable {
        return m17942a(str, 1);
    }

    /* renamed from: a */
    public static Bitmap m17940a(InputStream inputStream) {
        return m17941a(inputStream, 1);
    }

    /* renamed from: a */
    public static Bitmap m17942a(String str, int i) throws Throwable {
        return m17939a(new File(str), i);
    }

    /* renamed from: a */
    public static Bitmap m17939a(File file, int i) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(file);
        Bitmap a = m17941a((InputStream) fileInputStream, i);
        fileInputStream.close();
        return a;
    }

    /* renamed from: a */
    private static Bitmap m17941a(InputStream inputStream, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17947c(java.lang.String r4) {
        /*
            java.net.FileNameMap r0 = java.net.URLConnection.getFileNameMap()
            java.lang.String r0 = r0.getContentTypeFor(r4)
            if (r0 == 0) goto L_0x0010
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002a
        L_0x0010:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r4.toLowerCase(r1)
            java.lang.String r2 = "jpg"
            boolean r2 = r1.endsWith(r2)
            if (r2 != 0) goto L_0x0028
            java.lang.String r2 = "jepg"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x002b
        L_0x0028:
            java.lang.String r0 = "image/jpeg"
        L_0x002a:
            return r0
        L_0x002b:
            java.lang.String r2 = "png"
            boolean r2 = r1.endsWith(r2)
            if (r2 == 0) goto L_0x0036
            java.lang.String r0 = "image/png"
            goto L_0x002a
        L_0x0036:
            java.lang.String r2 = "gif"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = "image/gif"
            goto L_0x002a
        L_0x0041:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0059 }
            r2.<init>(r4)     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r1 = java.net.URLConnection.guessContentTypeFromStream(r2)     // Catch:{ Throwable -> 0x0059 }
            r2.close()     // Catch:{ Throwable -> 0x0062 }
            r0 = r1
        L_0x004e:
            if (r0 == 0) goto L_0x0056
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002a
        L_0x0056:
            java.lang.String r0 = "application/octet-stream"
            goto L_0x002a
        L_0x0059:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x005d:
            r0.printStackTrace()
            r0 = r1
            goto L_0x004e
        L_0x0062:
            r0 = move-exception
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: p100m.framework.p102b.C4284g.m17947c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m17943a(Context context, String str) {
        String str2 = String.valueOf(context.getFilesDir().getAbsolutePath()) + "/mFramework/cache/";
        C4279b bVar = new C4279b(context);
        if (bVar.mo15966u()) {
            str2 = String.valueOf(bVar.mo15967v()) + "/mFramework/" + bVar.mo15960o() + "/cache/";
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = String.valueOf(str2) + str + "/";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return str2;
    }

    /* renamed from: a */
    public static int m17937a(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m17945b(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }
}
