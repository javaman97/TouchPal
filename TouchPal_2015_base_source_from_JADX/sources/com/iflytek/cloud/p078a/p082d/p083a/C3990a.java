package com.iflytek.cloud.p078a.p082d.p083a;

import android.util.Log;
import com.iflytek.cloud.Setting;

/* renamed from: com.iflytek.cloud.a.d.a.a */
public class C3990a {

    /* renamed from: a */
    private static String f16329a = "MscSpeechLog";

    /* renamed from: b */
    private static boolean f16330b = false;

    /* renamed from: a */
    public static void m17030a(String str) {
        if (Setting.f16233a) {
            Log.d(f16329a, str);
        }
    }

    /* renamed from: a */
    public static void m17031a(String str, String str2) {
        if (Setting.f16233a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m17032b(String str) {
        if (Setting.f16233a) {
            Log.e(f16329a, str);
        }
    }

    /* renamed from: c */
    public static void m17033c(String str) {
        if (Setting.f16233a && f16330b) {
            Log.d(f16329a, str);
        }
    }
}
