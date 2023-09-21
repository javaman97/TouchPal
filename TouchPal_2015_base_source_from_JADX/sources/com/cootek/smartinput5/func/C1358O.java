package com.cootek.smartinput5.func;

import android.os.Environment;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import java.io.File;

/* renamed from: com.cootek.smartinput5.func.O */
/* compiled from: ExternalStorage */
public class C1358O {

    /* renamed from: A */
    public static final String f4184A = "identify_info";

    /* renamed from: B */
    private static final String f4185B = "TouchPalv5";

    /* renamed from: C */
    private static final String f4186C = "TouchPal2015";

    /* renamed from: D */
    private static boolean f4187D = false;

    /* renamed from: E */
    private static boolean f4188E = false;

    /* renamed from: F */
    private static String f4189F = f4186C;

    /* renamed from: a */
    public static final String f4190a = ".autobak";

    /* renamed from: b */
    public static final String f4191b = "Backup";

    /* renamed from: c */
    public static final String f4192c = "cell";

    /* renamed from: d */
    public static final String f4193d = "superdict";

    /* renamed from: e */
    public static final String f4194e = "curve";

    /* renamed from: f */
    public static final String f4195f = "handwrite_checked";

    /* renamed from: g */
    public static final String f4196g = "language";

    /* renamed from: h */
    public static final String f4197h = "present_apk";

    /* renamed from: i */
    public static final String f4198i = "skin";

    /* renamed from: j */
    public static final String f4199j = "bigram";

    /* renamed from: k */
    public static final String f4200k = ".webview";

    /* renamed from: l */
    public static final String f4201l = ".temp";

    /* renamed from: m */
    public static final String f4202m = ".sync";

    /* renamed from: n */
    public static final String f4203n = ".log";

    /* renamed from: o */
    public static final String f4204o = ".uninstall2015";

    /* renamed from: p */
    public static final String f4205p = ".info";

    /* renamed from: q */
    public static final String f4206q = "emoji";

    /* renamed from: r */
    public static final String f4207r = "emoji_plugin";

    /* renamed from: s */
    public static final String f4208s = "purchase_info";

    /* renamed from: t */
    public static final String f4209t = ".smart_search";

    /* renamed from: u */
    public static final String f4210u = "screen_shot_";

    /* renamed from: v */
    public static final String f4211v = "survey_info_head";

    /* renamed from: w */
    public static final String f4212w = "survey_info_tail";

    /* renamed from: x */
    public static final String f4213x = "settings";

    /* renamed from: y */
    public static final String f4214y = "states";

    /* renamed from: z */
    public static final String f4215z = "token";

    static {
        m6240c();
        m6236a();
    }

    /* renamed from: a */
    public static void m6236a() {
        if (m6241d() && !f4187D && !f4185B.equalsIgnoreCase(f4186C)) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            File file = new File(externalStorageDirectory, f4185B);
            File file2 = new File(externalStorageDirectory, f4186C);
            if (file.exists() && file.isDirectory()) {
                if (!file2.exists() || !file2.isDirectory()) {
                    if (file2.exists() && !file2.isDirectory()) {
                        file2.delete();
                    }
                    if (file.renameTo(file2)) {
                        f4189F = f4186C;
                        new C1359P(file2, file).start();
                        return;
                    }
                    f4189F = f4185B;
                }
            }
        }
    }

    /* renamed from: a */
    public static File m6234a(String str) {
        return m6235a(str, true);
    }

    /* renamed from: a */
    public static File m6235a(String str, boolean z) {
        if (str == null || !m6241d() || f4187D) {
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory(), f4189F);
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            if (!z) {
                return null;
            }
            m6237a(file);
            File file2 = new File(file.getAbsolutePath() + System.currentTimeMillis());
            file2.mkdir();
            if (!file2.renameTo(file)) {
                file2.delete();
                return null;
            }
        }
        C0997e.m5191c(file);
        File file3 = new File(file, str);
        if (!file3.isDirectory()) {
            if (!z) {
                return null;
            }
            file3.delete();
        }
        if (!file3.exists()) {
            if (!z) {
                return null;
            }
            File file4 = new File(file, str + System.currentTimeMillis());
            file4.mkdir();
            if (!file4.renameTo(file3)) {
                file4.delete();
                return null;
            }
        }
        return file3;
    }

    /* renamed from: a */
    private static void m6237a(File file) {
        File parentFile;
        File[] listFiles;
        if (file != null) {
            String name = file.getName();
            if (!TextUtils.isEmpty(name) && (parentFile = file.getParentFile()) != null && (listFiles = parentFile.listFiles(new C1360Q(name))) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    /* renamed from: b */
    public static File m6239b() {
        if (!m6241d() || f4187D) {
            return null;
        }
        return Environment.getExternalStorageDirectory();
    }

    /* renamed from: a */
    public static void m6238a(boolean z) {
        f4187D = z;
    }

    /* renamed from: c */
    public static void m6240c() {
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException e) {
        }
        f4188E = "mounted".equals(str);
    }

    /* renamed from: d */
    private static boolean m6241d() {
        return f4188E;
    }
}
