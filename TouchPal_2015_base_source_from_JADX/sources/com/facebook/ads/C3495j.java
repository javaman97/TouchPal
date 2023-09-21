package com.facebook.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.appsflyer.MonitorMessages;
import com.facebook.ads.internal.p077h.C3439h;
import com.facebook.ads.internal.p077h.C3456v;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.j */
public class C3495j {

    /* renamed from: a */
    public static final String f15121a = C3495j.class.getSimpleName();

    /* renamed from: b */
    static volatile boolean f15122b = false;

    /* renamed from: c */
    private static final Collection<String> f15123c = new HashSet();

    /* renamed from: d */
    private static final Collection<String> f15124d = new HashSet();

    /* renamed from: e */
    private static String f15125e = null;

    /* renamed from: f */
    private static boolean f15126f = false;

    /* renamed from: g */
    private static String f15127g = null;

    static {
        f15124d.add(MonitorMessages.SDK_VERSION);
        f15124d.add("google_sdk");
        f15124d.add("vbox86p");
        f15124d.add("vbox86tp");
    }

    /* renamed from: a */
    public static void m15215a() {
        f15123c.clear();
    }

    /* renamed from: a */
    public static void m15216a(String str) {
        f15123c.add(str);
    }

    /* renamed from: a */
    public static void m15217a(Collection<String> collection) {
        f15123c.addAll(collection);
    }

    /* renamed from: a */
    public static void m15218a(boolean z) {
        f15126f = z;
    }

    /* renamed from: a */
    public static boolean m15219a(Context context) {
        if (f15124d.contains(Build.PRODUCT)) {
            return true;
        }
        if (f15127g == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("FBAdPrefs", 0);
            f15127g = sharedPreferences.getString("deviceIdHash", (String) null);
            if (C3456v.m15103a(f15127g)) {
                C3439h.C3441a a = C3439h.m15062a(context.getContentResolver());
                if (!C3456v.m15103a(a.f14979b)) {
                    f15127g = C3456v.m15104b(a.f14979b);
                } else if (!C3456v.m15103a(a.f14978a)) {
                    f15127g = C3456v.m15104b(a.f14978a);
                } else {
                    f15127g = C3456v.m15104b(UUID.randomUUID().toString());
                }
                sharedPreferences.edit().putString("deviceIdHash", f15127g).apply();
            }
        }
        if (f15123c.contains(f15127g)) {
            return true;
        }
        m15222c(f15127g);
        return false;
    }

    /* renamed from: b */
    public static String m15220b() {
        return f15125e;
    }

    /* renamed from: b */
    public static void m15221b(String str) {
        f15125e = str;
    }

    /* renamed from: c */
    private static void m15222c(String str) {
        if (!f15122b) {
            f15122b = true;
            Log.d(f15121a, "Test mode device hash: " + str);
            Log.d(f15121a, "When testing your app with Facebook's ad units you must specify the device hashed ID to ensure the delivery of test ads, add the following code before loading an ad: AdSettings.addTestDevice(\"" + str + "\");");
        }
    }

    /* renamed from: c */
    public static boolean m15223c() {
        return f15126f;
    }
}
