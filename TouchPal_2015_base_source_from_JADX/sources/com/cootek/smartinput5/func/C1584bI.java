package com.cootek.smartinput5.func;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Base64;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.share.C1985g;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2894d;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.emoji.keyboard.touchpal.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.cootek.smartinput5.func.bI */
/* compiled from: Utils */
public class C1584bI {

    /* renamed from: a */
    public static final int f5006a = 0;

    /* renamed from: b */
    public static final int f5007b = 1;

    /* renamed from: c */
    public static final int f5008c = 2;

    /* renamed from: d */
    public static final int f5009d = 0;

    /* renamed from: e */
    public static final int f5010e = 1;

    /* renamed from: f */
    private static final String f5011f = "Utils";

    /* renamed from: g */
    private static final String f5012g = ".jpeg";

    /* renamed from: h */
    private static final String f5013h = "com.android.vending";

    /* renamed from: i */
    private static final String f5014i = "com.google.android.gms";

    /* renamed from: j */
    private static final String f5015j = "com.google.android.gsf";

    /* renamed from: k */
    private static int f5016k = -1;

    /* renamed from: l */
    private static final int f5017l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static Context f5018m;

    /* renamed from: n */
    private static Handler f5019n = new C1591bP(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0053 A[Catch:{ IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC, Splitter:B:53:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008f A[Catch:{ IOException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0021=Splitter:B:10:0x0021, B:26:0x0049=Splitter:B:26:0x0049} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m7127a(java.lang.String[] r7) {
        /*
            r6 = -1
            r2 = 0
            java.lang.String r1 = ""
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            r0.<init>(r7)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0085 }
            r5.<init>()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0085 }
            java.lang.Process r4 = r0.start()     // Catch:{ IOException -> 0x00a9, Exception -> 0x00a2, all -> 0x0085 }
            java.io.InputStream r3 = r4.getErrorStream()     // Catch:{ IOException -> 0x00ae, Exception -> 0x00a6, all -> 0x009d }
        L_0x0016:
            int r0 = r3.read()     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            if (r0 == r6) goto L_0x0035
            r5.write(r0)     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            goto L_0x0016
        L_0x0020:
            r0 = move-exception
        L_0x0021:
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0029
            r3.close()     // Catch:{ IOException -> 0x007b }
        L_0x0029:
            if (r2 == 0) goto L_0x002e
            r2.close()     // Catch:{ IOException -> 0x007b }
        L_0x002e:
            if (r4 == 0) goto L_0x00b2
            r4.destroy()
            r0 = r1
        L_0x0034:
            return r0
        L_0x0035:
            r0 = 10
            r5.write(r0)     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
        L_0x003e:
            int r0 = r2.read()     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            if (r0 == r6) goto L_0x005d
            r5.write(r0)     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            goto L_0x003e
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            r0.printStackTrace()     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x0051
            r3.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ IOException -> 0x0080 }
        L_0x0056:
            if (r4 == 0) goto L_0x00b2
            r4.destroy()
            r0 = r1
            goto L_0x0034
        L_0x005d:
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0020, Exception -> 0x0048 }
            if (r3 == 0) goto L_0x006b
            r3.close()     // Catch:{ IOException -> 0x0076 }
        L_0x006b:
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0070:
            if (r4 == 0) goto L_0x0034
            r4.destroy()
            goto L_0x0034
        L_0x0076:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0070
        L_0x007b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002e
        L_0x0080:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0056
        L_0x0085:
            r0 = move-exception
            r3 = r2
            r4 = r2
        L_0x0088:
            if (r3 == 0) goto L_0x008d
            r3.close()     // Catch:{ IOException -> 0x0098 }
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0098 }
        L_0x0092:
            if (r4 == 0) goto L_0x0097
            r4.destroy()
        L_0x0097:
            throw r0
        L_0x0098:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x0092
        L_0x009d:
            r0 = move-exception
            r3 = r2
            goto L_0x0088
        L_0x00a0:
            r0 = move-exception
            goto L_0x0088
        L_0x00a2:
            r0 = move-exception
            r3 = r2
            r4 = r2
            goto L_0x0049
        L_0x00a6:
            r0 = move-exception
            r3 = r2
            goto L_0x0049
        L_0x00a9:
            r0 = move-exception
            r3 = r2
            r4 = r2
            goto L_0x0021
        L_0x00ae:
            r0 = move-exception
            r3 = r2
            goto L_0x0021
        L_0x00b2:
            r0 = r1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1584bI.m7127a(java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099 A[SYNTHETIC, Splitter:B:39:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ac A[SYNTHETIC, Splitter:B:48:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0094=Splitter:B:36:0x0094, B:16:0x006b=Splitter:B:16:0x006b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7137a(java.io.File r6) {
        /*
            r2 = 0
            if (r6 != 0) goto L_0x0004
        L_0x0003:
            return
        L_0x0004:
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0017
            r6.delete()
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r6.getAbsolutePath()
            r0.<init>(r1)
            r6 = r0
        L_0x0017:
            r6.createNewFile()     // Catch:{ IOException -> 0x00ba }
        L_0x001a:
            java.lang.ProcessBuilder r0 = new java.lang.ProcessBuilder
            r1 = 5
            java.lang.String[] r1 = new java.lang.String[r1]
            r3 = 0
            java.lang.String r4 = "logcat"
            r1[r3] = r4
            r3 = 1
            java.lang.String r4 = "-d"
            r1[r3] = r4
            r3 = 2
            java.lang.String r4 = "-v"
            r1[r3] = r4
            r3 = 3
            java.lang.String r4 = "time"
            r1[r3] = r4
            r3 = 4
            java.lang.String r4 = "*:D"
            r1[r3] = r4
            r0.<init>(r1)
            r3 = 0
            java.lang.Process r1 = r0.start()     // Catch:{ IOException -> 0x00c1, Exception -> 0x0092, all -> 0x00a8 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            java.io.InputStream r5 = r1.getInputStream()     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            r4.<init>(r5)     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            r0.<init>(r4)     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            r4.<init>(r6)     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
        L_0x0053:
            java.lang.String r5 = r0.readLine()     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            if (r5 == 0) goto L_0x0079
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            r4.write(r5)     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            java.lang.String r5 = "\n"
            byte[] r5 = r5.getBytes()     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            r4.write(r5)     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            goto L_0x0053
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r0.printStackTrace()     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x0073
            r3.close()     // Catch:{ IOException -> 0x008d }
        L_0x0073:
            if (r1 == 0) goto L_0x0003
            r1.destroy()
            goto L_0x0003
        L_0x0079:
            r4.flush()     // Catch:{ IOException -> 0x006a, Exception -> 0x00bf }
            if (r2 == 0) goto L_0x0081
            r3.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0081:
            if (r1 == 0) goto L_0x0003
            r1.destroy()
            goto L_0x0003
        L_0x0088:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0081
        L_0x008d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0073
        L_0x0092:
            r0 = move-exception
            r1 = r2
        L_0x0094:
            r0.printStackTrace()     // Catch:{ all -> 0x00bd }
            if (r2 == 0) goto L_0x009c
            r3.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x009c:
            if (r1 == 0) goto L_0x0003
            r1.destroy()
            goto L_0x0003
        L_0x00a3:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x009c
        L_0x00a8:
            r0 = move-exception
            r1 = r2
        L_0x00aa:
            if (r2 == 0) goto L_0x00af
            r3.close()     // Catch:{ IOException -> 0x00b5 }
        L_0x00af:
            if (r1 == 0) goto L_0x00b4
            r1.destroy()
        L_0x00b4:
            throw r0
        L_0x00b5:
            r2 = move-exception
            r2.printStackTrace()
            goto L_0x00af
        L_0x00ba:
            r0 = move-exception
            goto L_0x001a
        L_0x00bd:
            r0 = move-exception
            goto L_0x00aa
        L_0x00bf:
            r0 = move-exception
            goto L_0x0094
        L_0x00c1:
            r0 = move-exception
            r1 = r2
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1584bI.m7137a(java.io.File):void");
    }

    /* renamed from: a */
    public static void m7129a(Dialog dialog) {
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.token = Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken();
        attributes.type = C2261Q.f9802h;
        attributes.flags = 131072;
        try {
            dialog.show();
        } catch (Exception e) {
        }
    }

    /* renamed from: a */
    public static boolean m7140a(Context context) {
        try {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                    return false;
                }
                return true;
            } catch (SecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m7146b(Context context) {
        try {
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
            if (allNetworkInfo == null) {
                return false;
            }
            for (NetworkInfo state : allNetworkInfo) {
                if (state.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m7141a(Context context, Runnable runnable, boolean z) {
        if (m7146b(context)) {
            return false;
        }
        AlertDialog create = new C2894d.C2895a(context).setMessage(C1974m.m9063a(context, (int) R.string.vi_need_network)).setPositiveButton(C1974m.m9063a(context, (int) R.string.network_setting), new C1587bL(context)).setNegativeButton(C1974m.m9063a(context, 17039360), new C1586bK(runnable)).setOnCancelListener(new C1585bJ(runnable)).create();
        if (z) {
            m7129a((Dialog) create);
        } else {
            try {
                create.show();
            } catch (Exception e) {
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m7131a(Context context, Runnable runnable, Runnable runnable2, boolean z) {
        if (!m7141a(context, runnable2, z)) {
            if (m7157j(context)) {
                AlertDialog create = new C2894d.C2895a(context).setTitle(C1974m.m9063a(context, (int) R.string.connect_confirmation_title)).setMessage(C1974m.m9063a(context, (int) R.string.connect_confirmation_content)).setPositiveButton(C1974m.m9063a(context, (int) R.string.connect_confirmation_yes), new C1590bO(runnable)).setNegativeButton(C1974m.m9063a(context, (int) R.string.connect_confirmation_no), new C1589bN(runnable2)).setOnCancelListener(new C1588bM(runnable2)).create();
                if (z) {
                    m7129a((Dialog) create);
                    return;
                }
                try {
                    create.show();
                } catch (Exception e) {
                }
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: j */
    private static boolean m7157j(Context context) {
        boolean z = true;
        switch (C1132b.m5654a(context).mo4397a(C1135d.NETWORK_CONNECT_WARNING_LEVEL, Integer.valueOf(C1593bR.m7162a().f5075a ? 0 : 1)).intValue()) {
            case 1:
                if (m7140a(context)) {
                    z = false;
                }
                return z;
            case 2:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static void m7145b(Context context, Runnable runnable, boolean z) {
        m7131a(context, runnable, (Runnable) null, z);
    }

    /* renamed from: a */
    public static PackageInfo m7123a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m7147b(Context context, String str) {
        PackageInfo a = m7123a(context, str);
        if (a == null || (a.applicationInfo.flags & 1) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m7136a(TextView textView, String str, int i) {
        String str2 = (String) textView.getText();
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && str2.contains(str)) {
            int i2 = -1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                i2 = str2.indexOf(str, i2 + 1);
                if (i2 < 0) {
                    break;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            SpannableString spannableString = new SpannableString(str2);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) arrayList.get(i3)).intValue();
                spannableString.setSpan(new ForegroundColorSpan(i), intValue, str.length() + intValue, 33);
            }
            textView.setText(spannableString);
        }
    }

    /* renamed from: c */
    public static long m7148c(Context context, String str) {
        File d = m7150d(context, str);
        if (d == null || !d.exists()) {
            return 0;
        }
        try {
            return ((Long) C0997e.m5187b(d)).longValue();
        } catch (NullPointerException e) {
            return 0;
        } catch (ClassCastException e2) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m7132a(Context context, String str, long j) {
        File d = m7150d(context, str);
        if (d != null) {
            if (d.exists()) {
                d.delete();
            }
            try {
                d.createNewFile();
            } catch (IOException e) {
            }
            if (d.exists()) {
                C0997e.m5175a(d, (Object) Long.valueOf(j));
            }
        }
    }

    /* renamed from: d */
    private static File m7150d(Context context, String str) {
        return C1466av.m6849a(context, str);
    }

    /* renamed from: c */
    public static boolean m7149c(Context context) {
        List<InputMethodInfo> list;
        try {
            list = ((InputMethodManager) context.getApplicationContext().getSystemService("input_method")).getEnabledInputMethodList();
        } catch (Exception e) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPackageName().equalsIgnoreCase(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static String m7151d(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "default_input_method");
    }

    /* renamed from: e */
    public static String m7152e(Context context) {
        return context.getPackageName() + "/" + TouchPalIME.class.getName();
    }

    /* renamed from: f */
    public static boolean m7153f(Context context) {
        String d = m7151d(context);
        return d != null && d.equalsIgnoreCase(m7152e(context));
    }

    /* renamed from: a */
    public static Bitmap m7124a(Bitmap bitmap, int i, int i2) {
        if (i == 0 || i2 == 0 || bitmap == null) {
            return bitmap;
        }
        System.currentTimeMillis();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = (height * i) / i2;
        if (i3 > width) {
            height = (width * i2) / i;
            i3 = width;
        }
        int max = Math.max(1, i3);
        return Bitmap.createBitmap(bitmap, (width - max) / 2, 0, max, Math.max(1, height));
    }

    /* renamed from: a */
    public static Bitmap[] m7142a(Bitmap bitmap, int[] iArr) {
        int i;
        if (bitmap == null || iArr == null || iArr.length == 0) {
            return new Bitmap[]{bitmap};
        }
        System.currentTimeMillis();
        Bitmap[] bitmapArr = new Bitmap[iArr.length];
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i2++;
            i3 = iArr[i2] + i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (i5 == iArr.length - 1) {
                i = height - i4;
            } else {
                i = (iArr[i5] * height) / i3;
            }
            if (i > 0) {
                bitmapArr[i5] = Bitmap.createBitmap(bitmap, 0, i4, width, i);
            }
            i4 += i;
        }
        return bitmapArr;
    }

    /* renamed from: b */
    public static BitmapFactory.Options m7144b(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inPurgeable = true;
        if (file != null) {
            if (file.length() > 4000000) {
                options.inSampleSize = 4;
            } else if (file.length() > 200000) {
                options.inSampleSize = 2;
            }
            if (options.inSampleSize == 1 && C1439ao.m6714b() < 400000) {
                options.inSampleSize = 2;
            }
        }
        return options;
    }

    /* renamed from: a */
    public static void m7130a(Context context, Intent intent, int i) {
        try {
            intent.addFlags(Engine.EXCEPTION_ERROR);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            if (i == 0) {
                C2849W.m13205a().mo9476a(C1974m.m9063a(context, (int) R.string.web_browser_not_found));
            } else if (i == 1) {
                Uri data = intent.getData();
                Intent intent2 = new Intent();
                intent2.putExtra(WebPageLoader.f4242a, data.toString());
                intent2.addFlags(Engine.EXCEPTION_ERROR);
                intent2.setClass(context, WebPageLoader.class);
                context.startActivity(intent2);
            }
        }
    }

    /* renamed from: a */
    public static void m7128a(Activity activity, String str, String str2) {
        C1985g.m9133a(activity, str, str2, m7125a(activity));
    }

    /* renamed from: a */
    public static Uri m7125a(Activity activity) {
        Uri uri;
        if (activity == null) {
            return null;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.setDrawingCacheEnabled(true);
        decorView.buildDrawingCache();
        Bitmap drawingCache = decorView.getDrawingCache();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        try {
            drawingCache = Bitmap.createBitmap(drawingCache, 0, i, drawingCache.getWidth(), drawingCache.getHeight() - i);
        } catch (Exception e) {
        }
        decorView.destroyDrawingCache();
        File file = new File(C1358O.m6234a(C1358O.f4201l), C1358O.f4210u + String.valueOf(System.currentTimeMillis()) + f5012g);
        if (file.exists()) {
            file.delete();
        }
        if (C0997e.m5184a(drawingCache, file, Bitmap.CompressFormat.JPEG)) {
            try {
                uri = Uri.fromFile(file);
            } catch (Exception e2) {
                uri = null;
            }
        } else {
            uri = null;
        }
        return uri;
    }

    /* renamed from: a */
    public static void m7138a(String str, View view) {
        if (com.cootek.smartinput5.engine.Settings.isInitialized() && !com.cootek.smartinput5.engine.Settings.getInstance().getBoolSetting(com.cootek.smartinput5.engine.Settings.SCREENSHOT_TAKEN, 31, str, (Config) null)) {
            String a = m7126a(view);
            if (!TextUtils.isEmpty(a)) {
                C1246d.m6010a(f5018m).mo4597b(C1246d.f3907da + str, a, C1246d.f3783b);
                com.cootek.smartinput5.engine.Settings.getInstance().setBoolSetting(com.cootek.smartinput5.engine.Settings.SCREENSHOT_TAKEN, true, 31, str, (Config) null, false);
            }
        }
    }

    @TargetApi(8)
    /* renamed from: a */
    public static String m7126a(View view) {
        String str = null;
        if (view == null || Build.VERSION.SDK_INT < 8) {
            return null;
        }
        try {
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            view.getDrawingCache().compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
            str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            view.destroyDrawingCache();
            view.setDrawingCacheEnabled(false);
            return str;
        } catch (Exception e) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m7135a(Bitmap bitmap, int i, int i2, Context context) {
        Bitmap copy = BitmapFactory.decodeResource(context.getResources(), R.drawable.custom_skin_preview_icon).copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(context.getResources().getColor(R.color.custom_skin_preview_cover_color));
        if (copy != null) {
            int max = Math.max(i / 3, i2 / 3);
            canvas.drawBitmap(Bitmap.createScaledBitmap(copy, max, max, false), (float) ((i / 2) - (max / 2)), (float) ((i2 / 2) - (max / 2)), (Paint) null);
        }
    }

    /* renamed from: a */
    public static void m7133a(Context context, String str, boolean z) {
        m7134a(context, str, z, (String) null);
    }

    /* renamed from: a */
    public static void m7134a(Context context, String str, boolean z, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (z) {
            if (m7154g(context)) {
                intent.setPackage("com.android.vending");
            } else {
                return;
            }
        }
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setData(Uri.parse("market://details?id=" + str + "&referrer=" + str2));
        context.startActivity(intent);
    }

    /* renamed from: g */
    public static boolean m7154g(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.android.vending", 1) == null || !m7155h(context)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: h */
    public static boolean m7155h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 4);
            PackageInfo packageInfo2 = packageManager.getPackageInfo(f5015j, 4);
            if (packageInfo == null && packageInfo2 == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m7122a(int i, int i2, String str, TextView textView, int i3) {
        int c = C1368X.m6320c().mo5841n().mo6265c(i3);
        int c2 = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.language_layout_selector_min_text_size);
        TextPaint paint = textView.getPaint();
        paint.setTextSize((float) c);
        int ceil = (int) Math.ceil((double) paint.measureText(str));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        int ceil2 = (int) Math.ceil((double) (fontMetrics.descent - fontMetrics.ascent));
        while (true) {
            if ((ceil > i || ceil2 > i2) && c > c2) {
                c--;
                paint.setTextSize((float) c);
                ceil = (int) Math.ceil((double) paint.measureText(str));
                Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
                ceil2 = (int) Math.ceil((double) (fontMetrics2.descent - fontMetrics2.ascent));
            }
        }
        textView.setLines(i2 / ceil2);
        return c;
    }

    /* renamed from: a */
    public static boolean m7139a() {
        boolean z = true;
        if (f5016k == -1) {
            try {
                f5016k = ((Boolean) Class.forName("android.os.Build").getMethod("hasSmartBar", new Class[0]).invoke((Object) null, new Object[0])).booleanValue() ? 1 : 0;
            } catch (Exception e) {
            }
            if (Build.DEVICE.equals("mx2")) {
                f5016k = 1;
            } else if (Build.DEVICE.equals("mx") || Build.DEVICE.equals("m9")) {
                f5016k = 0;
            }
            if (f5016k == 1) {
                return true;
            }
            return false;
        }
        if (f5016k != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    public static void m7156i(Context context) {
        f5018m = context;
        f5019n.removeMessages(0);
        f5019n.sendEmptyMessageDelayed(0, 50);
    }
}
