package p100m.framework.p102b;

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
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.nativeads.C1899v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: m.framework.b.b */
/* compiled from: DeviceHelper */
public class C4279b {

    /* renamed from: b */
    private static C4279b f17440b;

    /* renamed from: a */
    private Context f17441a;

    public C4279b(Context context) {
        this.f17441a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4279b m17876a(Context context) {
        if (f17440b == null) {
            f17440b = new C4279b(context);
        }
        return f17440b;
    }

    /* renamed from: a */
    public boolean mo15946a() {
        return false;
    }

    /* renamed from: b */
    public String mo15947b() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) this.f17441a.getSystemService(C1899v.f6395s);
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return null;
        }
        String macAddress = connectionInfo.getMacAddress();
        if (macAddress == null) {
            macAddress = null;
        }
        return macAddress;
    }

    /* renamed from: c */
    public String mo15948c() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public String mo15949d() {
        return Build.MANUFACTURER;
    }

    /* renamed from: e */
    public String mo15950e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f17441a.getSystemService("phone");
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
                th.printStackTrace();
                deviceId = null;
            }
        }
        return deviceId;
    }

    /* renamed from: f */
    public String mo15951f() {
        return mo15944a(String.valueOf(mo15948c()) + "|" + mo15952g() + "|" + mo15949d() + "|" + mo15954i() + "|" + mo15953h(), mo15959n().substring(0, 16));
    }

    /* renamed from: a */
    public String mo15944a(String str, String str2) {
        Throwable th;
        String str3;
        try {
            str3 = Base64.encodeToString(C4278a.m17869a(str2, str), 0);
            try {
                if (str3.contains(C0911j.f2473c)) {
                    return str3.replace(C0911j.f2473c, "");
                }
                return str3;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return str3;
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            str3 = null;
            th = th4;
            th.printStackTrace();
            return str3;
        }
    }

    /* renamed from: g */
    public String mo15952g() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    /* renamed from: h */
    public String mo15953h() {
        DisplayMetrics displayMetrics = this.f17441a.getResources().getDisplayMetrics();
        if (this.f17441a.getResources().getConfiguration().orientation == 1) {
            return String.valueOf(displayMetrics.widthPixels) + "x" + displayMetrics.heightPixels;
        }
        return String.valueOf(displayMetrics.heightPixels) + "x" + displayMetrics.widthPixels;
    }

    /* renamed from: i */
    public String mo15954i() {
        String simOperator = ((TelephonyManager) this.f17441a.getSystemService("phone")).getSimOperator();
        if (TextUtils.isEmpty(simOperator)) {
            return "-1";
        }
        return simOperator;
    }

    /* renamed from: j */
    public String mo15955j() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f17441a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (1 == type) {
            return C1899v.f6395s;
        }
        if (type != 0) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        String str = "";
        if (defaultHost != null && defaultHost.length() > 0) {
            str = " wap";
        }
        return String.valueOf(m17878w() ? "3G" : "2G") + str;
    }

    /* renamed from: k */
    public int mo15956k() {
        return 1;
    }

    /* renamed from: w */
    private boolean m17878w() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f17441a.getSystemService("phone");
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

    /* renamed from: l */
    public JSONArray mo15957l() {
        JSONArray jSONArray = new JSONArray();
        ActivityManager activityManager = (ActivityManager) this.f17441a.getSystemService(C1411aV.f4484k);
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

    /* renamed from: m */
    public String mo15958m() throws JSONException {
        JSONArray l = mo15957l();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < l.length(); i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(String.valueOf(l.get(i)));
        }
        return sb.toString();
    }

    /* renamed from: n */
    public String mo15959n() {
        try {
            String b = mo15947b();
            String e = mo15950e();
            return C4278a.m17867a(C4278a.m17868a(String.valueOf(b) + ":" + e + ":" + mo15948c()));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: o */
    public String mo15960o() {
        return this.f17441a.getPackageName();
    }

    /* renamed from: p */
    public String mo15961p() {
        int i;
        String str = this.f17441a.getApplicationInfo().name;
        if (str == null && (i = this.f17441a.getApplicationInfo().labelRes) > 0) {
            return this.f17441a.getString(i);
        }
        return str;
    }

    /* renamed from: q */
    public int mo15962q() {
        try {
            return this.f17441a.getPackageManager().getPackageInfo(this.f17441a.getPackageName(), 0).versionCode;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* renamed from: r */
    public String mo15963r() {
        try {
            return this.f17441a.getPackageManager().getPackageInfo(this.f17441a.getPackageName(), 0).versionName;
        } catch (Throwable th) {
            th.printStackTrace();
            return "1.0";
        }
    }

    /* renamed from: a */
    public ArrayList<HashMap<String, String>> mo15945a(boolean z) {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        try {
            PackageManager packageManager = this.f17441a.getPackageManager();
            for (PackageInfo next : packageManager.getInstalledPackages(0)) {
                if (z || !m17877a(next)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pkg", next.packageName);
                    hashMap.put("name", next.applicationInfo.loadLabel(packageManager).toString());
                    hashMap.put("version", next.versionName);
                    arrayList.add(hashMap);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m17877a(PackageInfo packageInfo) {
        boolean z;
        boolean z2;
        if ((packageInfo.applicationInfo.flags & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((packageInfo.applicationInfo.flags & 128) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public String mo15964s() {
        return ((TelephonyManager) this.f17441a.getSystemService("phone")).getNetworkOperator();
    }

    /* renamed from: t */
    public String mo15965t() {
        try {
            return ((ActivityManager) this.f17441a.getSystemService(C1411aV.f4484k)).getRunningTasks(1).get(0).topActivity.getPackageName();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: u */
    public boolean mo15966u() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: v */
    public String mo15967v() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }
}
