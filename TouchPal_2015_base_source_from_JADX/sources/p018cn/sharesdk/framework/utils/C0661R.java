package p018cn.sharesdk.framework.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.net.cmd.C2261Q;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import p018cn.sharesdk.framework.p019a.C0613d;
import p018cn.sharesdk.framework.p019a.C0617h;

/* renamed from: cn.sharesdk.framework.utils.R */
public class C0661R {

    /* renamed from: a */
    private static float f1626a;

    /* renamed from: a */
    private static Bitmap m3782a(InputStream inputStream, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
    }

    public static long dateStrToLong(String str) {
        return new SimpleDateFormat("yyyy-MM-dd").parse(str, new ParsePosition(0)).getTime();
    }

    public static Bundle decodeUrl(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            for (String split : str.split(C2261Q.f9808n)) {
                String[] split2 = split.split("=");
                if (split2.length < 2 || split2[1] == null) {
                    bundle.putString(URLDecoder.decode(split2[0]), "");
                } else {
                    bundle.putString(URLDecoder.decode(split2[0]), URLDecoder.decode(split2[1]));
                }
            }
        }
        return bundle;
    }

    public static int dipToPx(Context context, int i) {
        if (f1626a <= 0.0f) {
            f1626a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((((float) i) * f1626a) + 0.5f);
    }

    public static String encodeUrl(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj == null) {
                obj = "";
            }
            if (z) {
                z = false;
            } else {
                sb.append(C2261Q.f9808n);
            }
            sb.append(C0662a.m3792d(str) + "=" + C0662a.m3792d(String.valueOf(obj)));
        }
        return sb.toString();
    }

    public static String encodeUrl(ArrayList<C0613d<String>> arrayList) {
        if (arrayList == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<C0613d<String>> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0613d next = it.next();
            if (i > 0) {
                sb.append('&');
            }
            String str = next.f1471a;
            String str2 = (String) next.f1472b;
            if (str != null) {
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(C0662a.m3792d(str) + "=" + C0662a.m3792d(str2));
                i++;
            }
        }
        return sb.toString();
    }

    public static Bitmap getBitmap(Context context, String str) {
        return getBitmap(C0617h.m3549a().mo2203a(context, str));
    }

    public static Bitmap getBitmap(File file, int i) {
        FileInputStream fileInputStream = new FileInputStream(file);
        Bitmap a = m3782a(fileInputStream, i);
        fileInputStream.close();
        return a;
    }

    public static Bitmap getBitmap(String str) {
        return getBitmap(str, 1);
    }

    public static Bitmap getBitmap(String str, int i) {
        return getBitmap(new File(str), i);
    }

    public static int getBitmapRes(Context context, String str) {
        int i;
        String packageName = context.getPackageName();
        try {
            i = getResId(Class.forName(packageName + ".R$drawable"), str);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            i = 0;
        }
        return i <= 0 ? context.getResources().getIdentifier(str.toLowerCase(), "drawable", packageName) : i;
    }

    public static String getCachePath(Context context, String str) {
        String str2 = context.getFilesDir().getAbsolutePath() + "/ShareSDK/cache/";
        C0663b bVar = new C0663b(context);
        if (bVar.mo2493v()) {
            str2 = bVar.mo2494w() + "/ShareSDK/" + bVar.mo2487p() + "/cache/";
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str + "/";
        }
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str2;
    }

    public static int getResId(Class<?> cls, String str) {
        int i;
        if (str != null) {
            try {
                Field field = cls.getField(str.toLowerCase());
                field.setAccessible(true);
                i = ((Integer) field.get((Object) null)).intValue();
            } catch (Throwable th) {
                C0666e.m3838b(th);
                i = 0;
            }
        } else {
            i = 0;
        }
        if (i <= 0) {
            System.err.println("resource " + cls.getName() + C1389aD.f4374j + str + " not found!");
        }
        return i;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getStringRes(Context context, String str) {
        int i;
        String packageName = context.getPackageName();
        try {
            i = getResId(Class.forName(packageName + ".R$string"), str);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            i = 0;
        }
        return i <= 0 ? context.getResources().getIdentifier(str.toLowerCase(), "string", packageName) : i;
    }

    public static Date longToDate(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance.getTime();
    }

    public static String longToTime(long j, int i) {
        String str = "yyyy-MM-dd kk:mm:ss";
        switch (i) {
            case 1:
                str = "yyyy";
                break;
            case 2:
                str = "yyyy-MM";
                break;
            case 5:
                str = "yyyy-MM-dd";
                break;
            case 10:
                str = "yyyy-MM-dd kk";
                break;
            case 12:
                str = "yyyy-MM-dd kk:mm";
                break;
        }
        return new SimpleDateFormat(str).format(Long.valueOf(j));
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long parseTwitterDate(java.lang.String r8) {
        /*
            r3 = 5
            r0 = 2
            r2 = 4
            r1 = 1
            r4 = 0
            java.lang.String r5 = " "
            java.lang.String[] r6 = r8.split(r5)     // Catch:{ Throwable -> 0x013a }
            r5 = 1
            r5 = r6[r5]     // Catch:{ Throwable -> 0x013a }
            java.lang.String r5 = r5.toUpperCase()     // Catch:{ Throwable -> 0x013a }
            java.lang.String r7 = "FEB"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x013a }
            if (r7 == 0) goto L_0x00b7
            r0 = r1
        L_0x001b:
            r2 = 2
            r2 = r6[r2]     // Catch:{ Throwable -> 0x0126 }
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ Throwable -> 0x0126 }
            r5 = r1
        L_0x0023:
            r1 = 4
            r1 = r6[r1]     // Catch:{ Throwable -> 0x013a }
            java.lang.String r2 = "+"
            boolean r1 = r1.startsWith(r2)     // Catch:{ Throwable -> 0x013a }
            if (r1 == 0) goto L_0x0039
            r1 = 4
            r2 = 4
            r2 = r6[r2]     // Catch:{ Throwable -> 0x013a }
            r3 = 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ Throwable -> 0x013a }
            r6[r1] = r2     // Catch:{ Throwable -> 0x013a }
        L_0x0039:
            r1 = 4
            r1 = r6[r1]     // Catch:{ Throwable -> 0x012d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x012d }
        L_0x0040:
            r3 = 1970(0x7b2, float:2.76E-42)
            r2 = 5
            r2 = r6[r2]     // Catch:{ Throwable -> 0x0134 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Throwable -> 0x0134 }
            r3 = r2
        L_0x004a:
            r2 = 3
            r2 = r6[r2]     // Catch:{ Throwable -> 0x013a }
            java.lang.String r6 = ":"
            java.lang.String[] r6 = r2.split(r6)     // Catch:{ Throwable -> 0x013a }
            r2 = 0
            r2 = r6[r2]     // Catch:{ Throwable -> 0x0142 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Throwable -> 0x0142 }
        L_0x005a:
            int r1 = r2 - r1
            int r7 = r1 + 8
            r1 = 1
            r1 = r6[r1]     // Catch:{ Throwable -> 0x0149 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x0149 }
        L_0x0065:
            r2 = 2
            r2 = r6[r2]     // Catch:{ Throwable -> 0x0150 }
            int r4 = java.lang.Integer.parseInt(r2)     // Catch:{ Throwable -> 0x0150 }
        L_0x006c:
            java.util.Calendar r2 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x013a }
            r6 = 1
            r2.set(r6, r3)     // Catch:{ Throwable -> 0x013a }
            r3 = 2
            r2.set(r3, r0)     // Catch:{ Throwable -> 0x013a }
            r0 = 5
            r2.set(r0, r5)     // Catch:{ Throwable -> 0x013a }
            r0 = 11
            r2.set(r0, r7)     // Catch:{ Throwable -> 0x013a }
            r0 = 12
            r2.set(r0, r1)     // Catch:{ Throwable -> 0x013a }
            r0 = 13
            r2.set(r0, r4)     // Catch:{ Throwable -> 0x013a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x013a }
            r0.<init>()     // Catch:{ Throwable -> 0x013a }
            java.lang.String r1 = "date: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Throwable -> 0x013a }
            java.lang.StringBuilder r0 = r0.append(r8)     // Catch:{ Throwable -> 0x013a }
            java.lang.String r1 = ", parsed date: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Throwable -> 0x013a }
            java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x013a }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Throwable -> 0x013a }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x013a }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x013a }
            p018cn.sharesdk.framework.utils.C0666e.m3837b(r0, r1)     // Catch:{ Throwable -> 0x013a }
            long r0 = r2.getTimeInMillis()     // Catch:{ Throwable -> 0x013a }
        L_0x00b6:
            return r0
        L_0x00b7:
            java.lang.String r7 = "MAR"
            boolean r7 = r5.startsWith(r7)     // Catch:{ Throwable -> 0x013a }
            if (r7 != 0) goto L_0x001b
            java.lang.String r0 = "APR"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x00ca
            r0 = 3
            goto L_0x001b
        L_0x00ca:
            java.lang.String r0 = "MAY"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x00d5
            r0 = r2
            goto L_0x001b
        L_0x00d5:
            java.lang.String r0 = "JUN"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x00e0
            r0 = r3
            goto L_0x001b
        L_0x00e0:
            java.lang.String r0 = "JUL"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x00eb
            r0 = 6
            goto L_0x001b
        L_0x00eb:
            java.lang.String r0 = "AUG"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x00f6
            r0 = 7
            goto L_0x001b
        L_0x00f6:
            java.lang.String r0 = "SEP"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x0102
            r0 = 8
            goto L_0x001b
        L_0x0102:
            java.lang.String r0 = "OCT"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x010e
            r0 = 9
            goto L_0x001b
        L_0x010e:
            java.lang.String r0 = "NOV"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x011a
            r0 = 10
            goto L_0x001b
        L_0x011a:
            java.lang.String r0 = "DEC"
            boolean r0 = r5.startsWith(r0)     // Catch:{ Throwable -> 0x013a }
            if (r0 == 0) goto L_0x0156
            r0 = 11
            goto L_0x001b
        L_0x0126:
            r2 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r2)     // Catch:{ Throwable -> 0x013a }
            r5 = r1
            goto L_0x0023
        L_0x012d:
            r1 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r1)     // Catch:{ Throwable -> 0x013a }
            r1 = r4
            goto L_0x0040
        L_0x0134:
            r2 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r2)     // Catch:{ Throwable -> 0x013a }
            goto L_0x004a
        L_0x013a:
            r0 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r0)
            r0 = 0
            goto L_0x00b6
        L_0x0142:
            r2 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r2)     // Catch:{ Throwable -> 0x013a }
            r2 = r4
            goto L_0x005a
        L_0x0149:
            r1 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r1)     // Catch:{ Throwable -> 0x013a }
            r1 = r4
            goto L_0x0065
        L_0x0150:
            r2 = move-exception
            p018cn.sharesdk.framework.utils.C0666e.m3838b(r2)     // Catch:{ Throwable -> 0x013a }
            goto L_0x006c
        L_0x0156:
            r0 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.framework.utils.C0661R.parseTwitterDate(java.lang.String):long");
    }

    public static Uri pathToContentUri(Context context, String str) {
        Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "_data=? ", new String[]{str}, (String) null);
        if (query != null && query.moveToFirst()) {
            return Uri.withAppendedPath(Uri.parse("content://media/external/images/media"), "" + query.getInt(query.getColumnIndex("_id")));
        } else if (!new File(str).exists()) {
            return null;
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_data", str);
            return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
    }

    public static int pxToDip(Context context, int i) {
        if (f1626a <= 0.0f) {
            f1626a = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((((float) i) / f1626a) + 0.5f);
    }

    public static long strToDate(String str) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str, new ParsePosition(0)).getTime();
    }

    public static String toWordText(String str, int i) {
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int length = charArray.length;
        int i2 = i * 2;
        for (int i3 = 0; i3 < length; i3++) {
            char c = charArray[i3];
            i2 -= c < 256 ? 1 : 2;
            if (i2 < 0) {
                return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static Bundle urlToBundle(String str) {
        int indexOf = str.indexOf("://");
        try {
            URL url = new URL(indexOf >= 0 ? "http://" + str.substring(indexOf + 1) : "http://" + str);
            Bundle decodeUrl = decodeUrl(url.getQuery());
            decodeUrl.putAll(decodeUrl(url.getRef()));
            return decodeUrl;
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return new Bundle();
        }
    }
}
