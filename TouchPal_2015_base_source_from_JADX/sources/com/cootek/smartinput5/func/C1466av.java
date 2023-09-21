package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput.utilities.C0997e;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.cootek.smartinput5.func.av */
/* compiled from: InternalStorage */
public class C1466av {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final Pattern f4691A = Pattern.compile("v[0-9]{4}");

    /* renamed from: a */
    public static final String f4692a = "language";

    /* renamed from: b */
    public static final String f4693b = "skin";

    /* renamed from: c */
    public static final String f4694c = "emoji";

    /* renamed from: d */
    public static final String f4695d = "webpages";

    /* renamed from: e */
    public static final String f4696e = "common";

    /* renamed from: f */
    public static final String f4697f = "shop";

    /* renamed from: g */
    public static final String f4698g = ".rebuild";

    /* renamed from: h */
    public static final String f4699h = "assets_dir";

    /* renamed from: i */
    public static final String f4700i = "shared_prefs";

    /* renamed from: j */
    public static final String f4701j = "local_webview_param";

    /* renamed from: k */
    public static final String f4702k = "etag_of_update_version_ver";

    /* renamed from: l */
    public static final String f4703l = "language.ckr";

    /* renamed from: m */
    public static final String f4704m = "emoji_packs_timestamp";

    /* renamed from: n */
    public static final String f4705n = "speed.dat";

    /* renamed from: o */
    public static final String f4706o = "typing_efficiency.data";

    /* renamed from: p */
    public static final String f4707p = "emoji_plugin_packs_timestamp";

    /* renamed from: q */
    public static final String f4708q = "noah_local_config.xml";

    /* renamed from: r */
    public static final String f4709r = "crash_flag.ckr";

    /* renamed from: s */
    public static final String f4710s = "java_crash_flag.ckr";

    /* renamed from: t */
    public static final String f4711t = "crash_flag_on_shown.ckr";

    /* renamed from: u */
    public static final String f4712u = "java_crash_flag_on_shown.ckr";

    /* renamed from: v */
    public static final String f4713v = "check_image.ckr";

    /* renamed from: w */
    public static final String f4714w = "native_local_storage";

    /* renamed from: x */
    public static final String f4715x = "diagnose.log";

    /* renamed from: y */
    public static final String f4716y = "asset.cert";

    /* renamed from: z */
    private static final String f4717z = "v5701";

    /* renamed from: a */
    public static File m6848a(Context context) {
        boolean z;
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File[] listFiles = filesDir.listFiles(new C1467aw());
        File file = new File(filesDir.getAbsolutePath() + File.separator + f4717z);
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (listFiles[i].equals(file)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                Arrays.sort(listFiles);
                boolean z2 = false;
                for (int length2 = listFiles.length - 1; length2 >= 0; length2--) {
                    if (!z2 && listFiles[length2].getName().compareTo(f4717z) < 0) {
                        C0997e.m5189b(listFiles[length2], file);
                        z2 = true;
                    }
                }
            }
        }
        try {
            if (!file.exists()) {
                file.mkdir();
                m6851a(filesDir, file);
            }
            return file;
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static File m6849a(Context context, String str) {
        File a;
        if (context == null || (a = m6848a(context)) == null) {
            return null;
        }
        return new File(a.getAbsolutePath() + File.separator + str);
    }

    /* renamed from: a */
    private static void m6851a(File file, File file2) {
        try {
            File[] listFiles = file.listFiles(new C1468ax());
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    String str = file2.getAbsolutePath() + File.separator + file3.getName();
                    if (file3.isFile()) {
                        C0997e.m5173a(file3, new File(str));
                    } else if (file3.isDirectory()) {
                        C0997e.m5182a(file3.getAbsolutePath(), str);
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m6852b(Context context, String str) {
        C0997e.m5194f(m6849a(context, str));
    }

    /* renamed from: c */
    public static void m6853c(Context context, String str) {
        C0997e.m5195g(m6849a(context, str));
    }

    /* renamed from: d */
    public static boolean m6854d(Context context, String str) {
        return C0997e.m5193e(m6849a(context, str));
    }
}
