package p018cn.sharesdk.framework;

import android.content.Context;
import java.util.HashMap;

/* renamed from: cn.sharesdk.framework.ShareSDK */
public class ShareSDK {

    /* renamed from: a */
    private static C0658m f1465a;

    /* renamed from: a */
    static String m3518a(int i, String str) {
        m3523c();
        return f1465a.mo2441a(i, str);
    }

    /* renamed from: a */
    static String m3519a(String str, String str2) {
        m3523c();
        return f1465a.mo2442a(str, str2);
    }

    /* renamed from: a */
    static boolean m3520a() {
        m3523c();
        return f1465a.mo2460d();
    }

    /* renamed from: a */
    static boolean m3521a(HashMap<String, Object> hashMap) {
        m3523c();
        return f1465a.mo2451a(hashMap);
    }

    /* renamed from: b */
    static boolean m3522b() {
        m3523c();
        return f1465a.mo2462e();
    }

    /* renamed from: c */
    private static void m3523c() {
        if (f1465a == null) {
            throw new NullPointerException("Please call ShareSDK.initSDK(Context) before any action.");
        }
    }

    public static Platform getPlatform(Context context, String str) {
        m3523c();
        return f1465a.mo2440a(str);
    }

    public static synchronized Platform[] getPlatformList(Context context) {
        Platform[] b;
        synchronized (ShareSDK.class) {
            m3523c();
            b = f1465a.mo2455b();
        }
        return b;
    }

    public static int getSDKVersionCode() {
        m3523c();
        return f1465a.mo2464g();
    }

    public static String getSDKVersionName() {
        m3523c();
        return f1465a.mo2463f();
    }

    public static <T extends Service> T getService(Class<T> cls) {
        m3523c();
        return f1465a.mo2461e(cls);
    }

    public static void initSDK(Context context) {
        initSDK(context, (String) null, true);
    }

    public static void initSDK(Context context, String str) {
        initSDK(context, str, true);
    }

    public static void initSDK(Context context, String str, boolean z) {
        if (f1465a == null) {
            f1465a = new C0658m(context);
            f1465a.mo2449a(str, z);
        }
    }

    public static void initSDK(Context context, boolean z) {
        initSDK(context, (String) null, z);
    }

    public static boolean isRemoveCookieOnAuthorize() {
        m3523c();
        return f1465a.mo2458c();
    }

    public static void logApiEvent(String str, int i) {
        m3523c();
        f1465a.mo2447a(str, i);
    }

    public static void logDemoEvent(int i, Platform platform) {
        m3523c();
        f1465a.mo2445a(i, platform);
    }

    public static String platformIdToName(int i) {
        m3523c();
        return f1465a.mo2456c(i);
    }

    public static int platformNameToId(String str) {
        m3523c();
        return f1465a.mo2452b(str);
    }

    public static void registerPlatform(Class<? extends CustomPlatform> cls) {
        m3523c();
        f1465a.mo2446a(cls);
    }

    public static void registerService(Class<? extends Service> cls) {
        m3523c();
        f1465a.mo2457c(cls);
    }

    public static void removeCookieOnAuthorize(boolean z) {
        m3523c();
        f1465a.mo2450a(z);
    }

    public static void setConnTimeout(int i) {
        m3523c();
        f1465a.mo2444a(i);
    }

    public static void setPlatformDevInfo(String str, HashMap<String, Object> hashMap) {
        m3523c();
        f1465a.mo2448a(str, hashMap);
    }

    public static void setReadTimeout(int i) {
        m3523c();
        f1465a.mo2453b(i);
    }

    public static void stopSDK(Context context) {
        if (f1465a != null) {
            f1465a.mo2443a();
        }
        f1465a = null;
    }

    public static void unregisterPlatform(Class<? extends CustomPlatform> cls) {
        m3523c();
        f1465a.mo2454b(cls);
    }

    public static void unregisterService(Class<? extends Service> cls) {
        m3523c();
        f1465a.mo2459d(cls);
    }
}
