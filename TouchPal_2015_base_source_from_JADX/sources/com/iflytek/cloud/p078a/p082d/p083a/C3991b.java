package com.iflytek.cloud.p078a.p082d.p083a;

import android.text.TextUtils;
import com.iflytek.speech.VoiceWakeuperAidl;
import java.util.HashMap;

/* renamed from: com.iflytek.cloud.a.d.a.b */
public class C3991b {

    /* renamed from: a */
    public static HashMap<String, String> f16331a = new HashMap<>();

    /* renamed from: b */
    private static long f16332b = 0;

    /* renamed from: c */
    private static String f16333c = "=";

    /* renamed from: d */
    private static String f16334d = ",";

    /* renamed from: e */
    private static String f16335e = ":";

    /* renamed from: f */
    private static String f16336f = VoiceWakeuperAidl.PARAMS_SEPARATE;

    /* renamed from: g */
    private static String f16337g = "=========================================================\n";

    /* renamed from: h */
    private static boolean f16338h = false;

    /* renamed from: a */
    public static void m17034a(String str, String str2) {
        if (f16338h) {
            C3990a.m17033c("appendInfo:" + str + "," + str2);
            if (f16332b == 0) {
                f16331a.put(str, "" + System.currentTimeMillis());
                f16332b = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f16332b;
            String str3 = !TextUtils.isEmpty(str2) ? str2 + f16335e + currentTimeMillis : "" + currentTimeMillis;
            if (!f16331a.containsKey(str) || TextUtils.isEmpty(f16331a.get(str))) {
                f16331a.put(str, str3);
            } else {
                f16331a.put(str, f16331a.get(str) + f16336f + str3);
            }
        }
    }
}
