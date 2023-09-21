package com.facebook.ads.internal.p077h;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.h.b */
public class C3431b {

    /* renamed from: a */
    private static SensorManager f14949a = null;

    /* renamed from: b */
    private static Sensor f14950b = null;

    /* renamed from: c */
    private static Sensor f14951c = null;

    /* renamed from: d */
    private static volatile float[] f14952d;

    /* renamed from: e */
    private static volatile float[] f14953e;

    /* renamed from: f */
    private static Map<String, Object> f14954f = new ConcurrentHashMap();

    /* renamed from: g */
    private static String[] f14955g = {"x", "y", "z"};

    /* renamed from: a */
    public static Map<String, Object> m15044a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f14954f);
        m15045a(hashMap);
        return hashMap;
    }

    /* renamed from: a */
    private static void m15045a(Map<String, Object> map) {
        float[] fArr = f14952d;
        float[] fArr2 = f14953e;
        if (fArr != null) {
            int min = Math.min(f14955g.length, fArr.length);
            for (int i = 0; i < min; i++) {
                map.put("accelerometer_" + f14955g[i], Float.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(f14955g.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                map.put("rotation_" + f14955g[i2], Float.valueOf(fArr2[i2]));
            }
        }
    }
}
