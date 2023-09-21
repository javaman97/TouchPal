package com.cootek.smartinput.p044a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.p066ui.C2900dd;

/* renamed from: com.cootek.smartinput.a.q */
/* compiled from: Voice */
public class C0978q {

    /* renamed from: a */
    public static final String f2510a = "com.google.android.voiceservice";

    /* renamed from: b */
    public static final String f2511b = "com.google.android.voicesearch";

    /* renamed from: c */
    public static final String f2512c = "com.google.android.googlequicksearchbox";

    /* renamed from: d */
    private static String f2513d = "VoiceInput";

    /* renamed from: e */
    private static boolean f2514e = true;

    /* renamed from: f */
    private static final String[] f2515f = {f2510a, f2511b, f2512c};

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static boolean m5062a(Context context) {
        if (!m5061a()) {
            return false;
        }
        if (m5067c()) {
            return true;
        }
        if (!m5064b(context) || !SpeechRecognizer.isRecognitionAvailable(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m5061a() {
        if (Build.VERSION.SDK.equals("3")) {
            C1017y.m5213a(f2513d, "not supported. Low sdk version 3");
            return false;
        } else if (Build.VERSION.SDK_INT >= 8) {
            return true;
        } else {
            C1017y.m5213a(f2513d, "not supported. Low sdk version < 8");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m5064b(Context context) {
        return m5066c(context) != null;
    }

    /* renamed from: c */
    public static String m5066c(Context context) {
        for (String str : f2515f) {
            if (m5065b(context, str)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m5065b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        try {
            if (TextUtils.equals(str, f2510a)) {
                if (Build.VERSION.RELEASE.equals("1.5")) {
                    packageInfo = packageManager.getPackageInfo(f2510a, 0);
                }
            } else if (TextUtils.equals(str, f2511b)) {
                packageInfo = packageManager.getPackageInfo(f2511b, 0);
            } else if (TextUtils.equals(str, f2512c)) {
                packageInfo = packageManager.getPackageInfo(f2512c, 0);
                if (packageInfo.versionCode >= 300305150) {
                    f2514e = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m5063b() {
        return f2514e;
    }

    /* renamed from: a */
    public static void m5060a(Context context, String str) {
        boolean z;
        boolean equals = TextUtils.equals(m5066c(context), f2512c) & (!m5067c());
        String locale = context.getResources().getConfiguration().locale.toString();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(locale) || str.length() <= 1 || locale.length() <= 1) {
            z = true;
        } else {
            z = TextUtils.equals(str.substring(0, 2), locale.substring(0, 2));
            if (locale.startsWith("zh")) {
                if (str.startsWith("zh")) {
                    z = TextUtils.equals(str, locale);
                }
                if (str.startsWith("en")) {
                    z = true;
                }
            }
        }
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.VOICE_VERSION_DIALOG_SHOWED);
        boolean b = m5063b();
        if (!boolSetting && !z && equals && !b) {
            C2900dd.m13358a(context, C1368X.m6320c().mo5842o().mo5914D());
            Settings.getInstance().setBoolSetting(Settings.VOICE_VERSION_DIALOG_SHOWED, true);
        }
    }

    /* renamed from: c */
    public static boolean m5067c() {
        if (!C1593bR.m7162a().f5076b || !m5061a()) {
            return false;
        }
        return true;
    }
}
