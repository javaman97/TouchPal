package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.support.p001v4.p013h.C0262a;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.cloud.p084b.C4000a;
import java.lang.reflect.Field;

/* renamed from: com.iflytek.cloud.a.d.a */
public class C3989a {

    /* renamed from: a */
    public static String[][] f16325a = {new String[]{"os.manufact", Build.MANUFACTURER}, new String[]{"os.model", Build.MODEL}, new String[]{"os.product", Build.PRODUCT}, new String[]{"os.display", Build.DISPLAY}, new String[]{"os.host", Build.HOST}, new String[]{"os.id", Build.ID}, new String[]{"os.device", Build.DEVICE}, new String[]{"os.board", Build.BOARD}, new String[]{"os.brand", Build.BRAND}, new String[]{"os.user", Build.USER}, new String[]{"os.type", Build.TYPE}};

    /* renamed from: b */
    private static String[][] f16326b = {new String[]{"os.cpu", "CPU_ABI"}, new String[]{"os.cpu2", "CPU_ABI2"}, new String[]{"os.serial", "SERIAL"}, new String[]{"os.hardware", "HARDWARE"}, new String[]{"os.bootloader", "BOOTLOADER"}, new String[]{"os.radio", "RADIO"}};

    /* renamed from: c */
    private static C4000a f16327c = new C4000a();

    /* renamed from: d */
    private static boolean f16328d = false;

    /* renamed from: a */
    public static synchronized C4000a m17026a(Context context) {
        C4000a aVar;
        synchronized (C3989a.class) {
            if (f16328d) {
                aVar = f16327c;
            } else {
                m17029b(context);
                aVar = f16327c;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static String m17027a(String str) {
        try {
            Field field = Build.class.getField(str);
            return field != null ? field.get(new Build()).toString() : C0262a.f648a;
        } catch (Exception e) {
            return C0262a.f648a;
        }
    }

    /* renamed from: a */
    public static void m17028a(C4000a aVar, Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            aVar.mo14709a("app.ver.name", packageInfo.versionName);
            aVar.mo14709a("app.ver.code", "" + packageInfo.versionCode);
            aVar.mo14709a("app.pkg", applicationInfo.packageName);
            aVar.mo14709a("app.path", applicationInfo.dataDir);
            aVar.mo14709a("app.name", applicationInfo.loadLabel(context.getPackageManager()).toString());
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    private static void m17029b(Context context) {
        try {
            f16327c.mo14706a();
            f16327c.mo14709a("os.system", "Android");
            m17028a(f16327c, context);
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f16327c.mo14709a("os.resolution", displayMetrics.widthPixels + "*" + displayMetrics.heightPixels);
            f16327c.mo14709a("os.density", "" + displayMetrics.density);
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            f16327c.mo14709a("os.imei", telephonyManager.getDeviceId());
            f16327c.mo14709a("os.imsi", telephonyManager.getSubscriberId());
            String string = Settings.Secure.getString(context.getContentResolver(), com.cootek.smartinput5.engine.Settings.ANDROID_ID);
            if (!TextUtils.isEmpty(string)) {
                f16327c.mo14709a("os.android_id", string);
            }
            f16327c.mo14709a("net.mac", ((WifiManager) context.getSystemService(C1899v.f6395s)).getConnectionInfo().getMacAddress());
            f16327c.mo14709a("os.version", Build.VERSION.SDK);
            f16327c.mo14709a("os.release", Build.VERSION.RELEASE);
            f16327c.mo14709a("os.incremental", Build.VERSION.INCREMENTAL);
            for (int i = 0; i < f16325a.length; i++) {
                f16327c.mo14709a(f16325a[i][0], f16325a[i][1]);
            }
            for (int i2 = 0; i2 < f16326b.length; i2++) {
                f16327c.mo14709a(f16326b[i2][0], m17027a(f16326b[i2][1]));
            }
            f16327c.mo14720d();
            f16328d = true;
        } catch (Exception e) {
            C3990a.m17030a("Failed to get prop Info");
            f16328d = false;
        }
    }
}
