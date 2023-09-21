package com.cootek.smartinput5.func;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.cootek.p042a.p043a.C0911j;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.cootek.smartinput5.func.ao */
/* compiled from: HardwareInfoProvider */
public class C1439ao {

    /* renamed from: a */
    public static final int f4630a = 7;

    /* renamed from: b */
    private static final String f4631b = "/system/bin/cat";

    /* renamed from: c */
    private static int f4632c;

    /* renamed from: d */
    private static int f4633d;

    /* renamed from: e */
    private static double f4634e = 0.0d;

    /* renamed from: a */
    public static int m6713a() {
        if (f4632c == 0) {
            String str = "";
            byte[] bArr = new byte[8];
            try {
                InputStream inputStream = new ProcessBuilder(new String[]{f4631b, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).start().getInputStream();
                while (inputStream.read(bArr) != -1) {
                    str = str + new String(bArr);
                }
                inputStream.close();
                f4632c = Integer.parseInt(str.replaceAll("[^\\d]+", ""));
            } catch (IOException | NumberFormatException e) {
            }
        }
        return f4632c;
    }

    /* renamed from: b */
    public static int m6714b() {
        String str;
        boolean z = true;
        if (f4633d == 0) {
            String str2 = "";
            byte[] bArr = new byte[8];
            try {
                InputStream inputStream = new ProcessBuilder(new String[]{f4631b, "/proc/meminfo"}).start().getInputStream();
                while (true) {
                    if (inputStream.read(bArr) == -1) {
                        z = false;
                        str = str2;
                        break;
                    }
                    String str3 = new String(bArr);
                    str2 = str2 + str3;
                    if (str3.contains(C0911j.f2473c) && str2.contains("MemTotal")) {
                        str = str2;
                        break;
                    }
                }
                inputStream.close();
                if (z) {
                    f4633d = Integer.parseInt(str.replaceAll("[^\\d]+", ""));
                }
            } catch (IOException | NumberFormatException e) {
            }
        }
        return f4633d;
    }

    /* renamed from: a */
    public static double m6712a(Context context) {
        DisplayMetrics displayMetrics;
        double d;
        double d2;
        if (f4634e == 0.0d) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (defaultDisplay != null) {
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
            } else {
                displayMetrics = context.getResources().getDisplayMetrics();
            }
            double d3 = (double) displayMetrics.widthPixels;
            double d4 = (double) displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT < 14 || Build.VERSION.SDK_INT >= 17) {
                d = d4;
                d2 = d3;
            } else {
                try {
                    d3 = (double) ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    d = (double) ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    d2 = d3;
                } catch (Exception e) {
                    double d5 = d4;
                    d2 = d3;
                    d = d5;
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
                    d2 = (double) point.x;
                    d = (double) point.y;
                } catch (Exception e2) {
                }
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            double d6 = d / ((double) displayMetrics2.densityDpi);
            double d7 = d2 / ((double) displayMetrics2.densityDpi);
            f4634e = Math.sqrt((d6 * d6) + (d7 * d7));
        }
        return f4634e;
    }
}
