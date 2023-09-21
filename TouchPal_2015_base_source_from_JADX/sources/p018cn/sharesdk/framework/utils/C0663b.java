package p018cn.sharesdk.framework.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.support.p001v4.p013h.C0262a;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.cootek.p042a.p043a.C0911j;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.nativeads.C1899v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: cn.sharesdk.framework.utils.b */
public class C0663b {

    /* renamed from: b */
    private static C0663b f1628b;

    /* renamed from: a */
    private Context f1629a;

    public C0663b(Context context) {
        this.f1629a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C0663b m3793a(Context context) {
        if (f1628b == null) {
            f1628b = new C0663b(context);
        }
        return f1628b;
    }

    /* renamed from: a */
    private boolean m3794a(PackageInfo packageInfo) {
        return ((packageInfo.applicationInfo.flags & 1) == 1) || ((packageInfo.applicationInfo.flags & 128) == 1);
    }

    /* renamed from: b */
    private Object m3795b(String str) {
        try {
            return this.f1629a.getSystemService(str);
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: c */
    private void m3796c(String str) {
        if (mo2493v()) {
            File file = new File(mo2494w(), "ShareSDK");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, ".dk");
            if (file2.exists()) {
                file2.delete();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file2));
            objectOutputStream.writeObject(str.toCharArray());
            objectOutputStream.flush();
            objectOutputStream.close();
        }
    }

    /* renamed from: x */
    private boolean m3797x() {
        TelephonyManager telephonyManager = (TelephonyManager) m3795b("phone");
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getNetworkType()) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return false;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return false;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                return true;
            case 15:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: y */
    private String m3798y() {
        if (!mo2493v()) {
            return null;
        }
        File file = new File(mo2494w(), "ShareSDK");
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, ".dk");
        if (!file2.exists()) {
            return null;
        }
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file2));
        Object readObject = objectInputStream.readObject();
        String valueOf = (readObject == null || !(readObject instanceof char[])) ? null : String.valueOf((char[]) readObject);
        objectInputStream.close();
        return valueOf;
    }

    /* renamed from: a */
    public String mo2469a() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) m3795b(C1899v.f6395s);
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        String macAddress = connectionInfo.getMacAddress();
        if (macAddress == null) {
            macAddress = null;
        }
        return macAddress;
    }

    /* renamed from: a */
    public String mo2470a(String str, String str2) {
        Throwable th;
        String str3;
        try {
            str3 = Base64.encodeToString(C0662a.m3785a(str2, str), 0);
            try {
                return str3.contains(C0911j.f2473c) ? str3.replace(C0911j.f2473c, "") : str3;
            } catch (Throwable th2) {
                th = th2;
                C0666e.m3838b(th);
                return str3;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str3 = null;
            th = th4;
            C0666e.m3838b(th);
            return str3;
        }
    }

    /* renamed from: a */
    public ArrayList<HashMap<String, String>> mo2471a(boolean z) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            PackageManager packageManager = this.f1629a.getPackageManager();
            for (PackageInfo next : packageManager.getInstalledPackages(0)) {
                if (z || !m3794a(next)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pkg", next.packageName);
                    hashMap.put("name", next.applicationInfo.loadLabel(packageManager).toString());
                    hashMap.put("version", next.versionName);
                    arrayList.add(hashMap);
                }
            }
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo2472a(String str) {
        return this.f1629a.getPackageManager().checkPermission(str, mo2487p()) == 0;
    }

    /* renamed from: b */
    public String mo2473b() {
        return Build.MODEL;
    }

    /* renamed from: c */
    public String mo2474c() {
        return Build.MANUFACTURER;
    }

    /* renamed from: d */
    public String mo2475d() {
        TelephonyManager telephonyManager = (TelephonyManager) m3795b("phone");
        if (telephonyManager == null) {
            return null;
        }
        String deviceId = telephonyManager.getDeviceId();
        String str = "";
        if (deviceId != null) {
            str = new String(deviceId).replace("0", "");
        }
        if ((deviceId == null || str.length() <= 0) && Build.VERSION.SDK_INT >= 9) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                deviceId = (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", C0262a.f648a});
            } catch (Throwable th) {
                C0666e.m3835a(th);
                deviceId = null;
            }
        }
        return deviceId;
    }

    /* renamed from: e */
    public String mo2476e() {
        return mo2470a(mo2473b() + "|" + mo2478g() + "|" + mo2474c() + "|" + mo2481j() + "|" + mo2480i(), mo2486o().substring(0, 16));
    }

    /* renamed from: f */
    public String mo2477f() {
        return mo2473b() + "|" + mo2478g() + "|" + mo2474c() + "|" + mo2481j() + "|" + mo2480i();
    }

    /* renamed from: g */
    public String mo2478g() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: h */
    public String mo2479h() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: i */
    public String mo2480i() {
        DisplayMetrics displayMetrics = this.f1629a.getResources().getDisplayMetrics();
        return this.f1629a.getResources().getConfiguration().orientation == 1 ? displayMetrics.widthPixels + "x" + displayMetrics.heightPixels : displayMetrics.heightPixels + "x" + displayMetrics.widthPixels;
    }

    /* renamed from: j */
    public String mo2481j() {
        TelephonyManager telephonyManager = (TelephonyManager) m3795b("phone");
        if (telephonyManager == null) {
            return "-1";
        }
        String simOperator = telephonyManager.getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            simOperator = "-1";
        }
        C0666e.m3839c("================= operator: " + simOperator, new Object[0]);
        return simOperator;
    }

    /* renamed from: k */
    public String mo2482k() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) m3795b("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return C1899v.f6395s;
        }
        if (type != 0) {
            return "none";
        }
        String defaultHost = Proxy.getDefaultHost();
        String str = "";
        if (defaultHost != null && defaultHost.length() > 0) {
            str = " wap";
        }
        return (m3797x() ? "3G" : "2G") + str;
    }

    /* renamed from: l */
    public String mo2483l() {
        String k = mo2482k();
        return TextUtils.isEmpty(k) ? "none" : (C1899v.f6395s.equals(k) || "none".equals(k)) ? k : C1358O.f4192c;
    }

    /* renamed from: m */
    public int mo2484m() {
        return 1;
    }

    /* renamed from: n */
    public JSONArray mo2485n() {
        JSONArray jSONArray = new JSONArray();
        ActivityManager activityManager = (ActivityManager) m3795b(C1411aV.f4484k);
        if (activityManager == null) {
            return jSONArray;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return jSONArray;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            jSONArray.put(runningAppProcessInfo.processName);
        }
        return jSONArray;
    }

    /* renamed from: o */
    public String mo2486o() {
        String str;
        String str2;
        try {
            str = m3798y();
        } catch (Throwable th) {
            C0666e.m3838b(th);
            str = null;
        }
        if (str2 == null) {
            try {
                str2 = C0662a.m3783a(C0662a.m3784a(mo2469a() + ":" + mo2475d() + ":" + mo2473b()));
            } catch (Throwable th2) {
                C0666e.m3835a(th2);
                str2 = null;
            }
            if (str2 != null) {
                try {
                    m3796c(str2);
                } catch (Throwable th3) {
                    C0666e.m3838b(th3);
                }
            }
        }
        return str2;
    }

    /* renamed from: p */
    public String mo2487p() {
        return this.f1629a.getPackageName();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r2.f1629a.getApplicationInfo().labelRes;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo2488q() {
        /*
            r2 = this;
            android.content.Context r0 = r2.f1629a
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            return r0
        L_0x000b:
            android.content.Context r1 = r2.f1629a
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.labelRes
            if (r1 <= 0) goto L_0x000a
            android.content.Context r0 = r2.f1629a
            java.lang.String r0 = r0.getString(r1)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: p018cn.sharesdk.framework.utils.C0663b.mo2488q():java.lang.String");
    }

    /* renamed from: r */
    public int mo2489r() {
        try {
            return this.f1629a.getPackageManager().getPackageInfo(this.f1629a.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            C0666e.m3835a(th);
            return 0;
        }
    }

    /* renamed from: s */
    public String mo2490s() {
        try {
            return this.f1629a.getPackageManager().getPackageInfo(this.f1629a.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            C0666e.m3835a(th);
            return "1.0";
        }
    }

    /* renamed from: t */
    public String mo2491t() {
        TelephonyManager telephonyManager = (TelephonyManager) m3795b("phone");
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }

    /* renamed from: u */
    public String mo2492u() {
        if (mo2472a("android.permission.GET_TASKS")) {
            try {
                ActivityManager activityManager = (ActivityManager) m3795b(C1411aV.f4484k);
                if (activityManager == null) {
                    return null;
                }
                return activityManager.getRunningTasks(1).get(0).topActivity.getPackageName();
            } catch (Throwable th) {
                C0666e.m3838b(th);
            }
        }
        return null;
    }

    /* renamed from: v */
    public boolean mo2493v() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: w */
    public String mo2494w() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
