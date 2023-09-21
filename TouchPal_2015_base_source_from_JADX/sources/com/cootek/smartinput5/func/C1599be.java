package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1963b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1063f;
import com.cootek.smartinput5.p066ui.C2726bF;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.func.be */
/* compiled from: ResourcesUtils */
public class C1599be {

    /* renamed from: a */
    private static Resources f5089a = null;

    /* renamed from: b */
    private static String f5090b = null;

    /* renamed from: c */
    private static final char f5091c = '/';

    /* renamed from: d */
    private static final String f5092d = "fraction";

    /* renamed from: e */
    private static final String f5093e = "dimen";

    /* renamed from: f */
    private static final String f5094f = "px";

    /* renamed from: g */
    private static final String f5095g = "dip";

    /* renamed from: h */
    private static final String f5096h = "sp";

    /* renamed from: i */
    private static final String f5097i = "%p";

    /* renamed from: j */
    private static HashMap<String, HashMap<String, Integer>> f5098j = new HashMap<>();

    /* renamed from: k */
    private static HashMap<String, String> f5099k = new HashMap<>();

    /* renamed from: a */
    private static boolean m7213a() {
        if (f5089a != null) {
            return true;
        }
        if (C1368X.m6313b() == null) {
            return false;
        }
        f5089a = C1368X.m6313b().getResources();
        f5090b = C1368X.m6313b().getPackageName();
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        f5089a = null;
    }

    /* renamed from: d */
    private static int m7221d(Resources resources, String str, String str2) {
        Object obj;
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        String obj2 = resources.toString();
        String str3 = str + ":" + m7222d(str2);
        HashMap hashMap = f5098j.get(obj2);
        if (hashMap != null && (obj = hashMap.get(str3)) != null) {
            return ((Integer) obj).intValue();
        }
        int identifier = resources.getIdentifier(str + ":" + m7222d(str2), (String) null, (String) null);
        if (hashMap == null) {
            HashMap hashMap2 = new HashMap();
            f5098j.put(obj2, hashMap2);
            String str4 = f5099k.get(str);
            if (str4 != null && !str4.equals(obj2)) {
                f5098j.remove(str4);
            }
            f5099k.put(str, obj2);
            hashMap = hashMap2;
        }
        hashMap.put(str3, Integer.valueOf(identifier));
        return identifier;
    }

    /* renamed from: a */
    public static void m7212a(Resources resources) {
        if (resources != null) {
            f5098j.remove(resources.toString());
        }
    }

    /* renamed from: c */
    private static int m7219c(String str) {
        return m7221d(f5089a, f5090b, str);
    }

    /* renamed from: a */
    public static String m7210a(Resources resources, String str, String str2, String str3) {
        return (!m7213a() || TextUtils.isEmpty(str2)) ? str3 : m7209a(resources, str, str2);
    }

    /* renamed from: a */
    public static String m7209a(Resources resources, String str, String str2) {
        int d;
        if (!m7213a()) {
            return str2;
        }
        if (!TextUtils.equals(str, f5090b) && (d = m7221d(resources, str, str2)) > 0) {
            try {
                return resources.getString(d);
            } catch (Resources.NotFoundException e) {
            }
        }
        int c = m7219c(str2);
        if (c <= 0) {
            return str2;
        }
        if (C1368X.m6324d()) {
            return C1974m.m9063a(C1368X.m6313b(), c);
        }
        return f5089a.getString(c);
    }

    /* renamed from: b */
    public static int m7215b(Resources resources, String str, String str2) {
        if (!m7213a()) {
            return 0;
        }
        int d = m7221d(resources, str, str2);
        return d <= 0 ? m7219c(str2) : d;
    }

    /* renamed from: c */
    public static Drawable m7220c(Resources resources, String str, String str2) {
        return m7204a(resources, str, str2, (C2726bF) null);
    }

    /* renamed from: a */
    public static int m7201a(String str) {
        if (!m7213a()) {
            return 0;
        }
        return m7219c(str);
    }

    /* renamed from: a */
    public static Drawable m7204a(Resources resources, String str, String str2, C2726bF bFVar) {
        return m7205a(resources, str, str2, bFVar, false);
    }

    /* renamed from: a */
    public static Drawable m7205a(Resources resources, String str, String str2, C2726bF bFVar, boolean z) {
        if (!m7213a()) {
            return null;
        }
        int d = m7221d(resources, str, str2);
        int c = m7219c(str2);
        if (C1368X.m6324d() && c > 0) {
            return C1368X.m6320c().mo5841n().mo6251a(c, bFVar, z);
        }
        if (d <= 0) {
            return null;
        }
        try {
            return resources.getDrawable(d);
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m7214a(Resources resources, String str, String str2, boolean z) {
        if (!m7213a() || TextUtils.isEmpty(str2)) {
            return z;
        }
        if (str2.equalsIgnoreCase("true") || str2.equalsIgnoreCase("false")) {
            return Boolean.valueOf(str2).booleanValue();
        }
        int d = m7221d(resources, str, str2);
        if (d > 0) {
            return resources.getBoolean(d);
        }
        int c = m7219c(str2);
        if (c > 0) {
            return f5089a.getBoolean(c);
        }
        return Boolean.valueOf(str2).booleanValue();
    }

    /* renamed from: a */
    public static int m7198a(Resources resources, String str, String str2, int i) {
        if (!m7213a() || TextUtils.isEmpty(str2)) {
            return i;
        }
        try {
            return Integer.valueOf(str2).intValue();
        } catch (NumberFormatException e) {
            int d = m7221d(resources, str, str2);
            if (d > 0) {
                return resources.getInteger(d);
            }
            int c = m7219c(str2);
            if (c > 0) {
                return f5089a.getInteger(c);
            }
            return Integer.valueOf(str2).intValue();
        }
    }

    /* renamed from: a */
    public static int m7200a(Resources resources, String str, String str2, Hashtable<String, Integer> hashtable, int i) {
        if (!m7213a() || TextUtils.isEmpty(str2)) {
            return i;
        }
        Integer num = hashtable.get(str2);
        if (num != null) {
            return num.intValue();
        }
        return m7198a(resources, str, str2, i);
    }

    /* renamed from: b */
    public static int m7216b(Resources resources, String str, String str2, int i) {
        if (!m7213a() || TextUtils.isEmpty(str2)) {
            return i;
        }
        int e = m7223e(str2);
        if (e != -1) {
            return e;
        }
        int c = m7219c(str2);
        if (C1368X.m6324d() && c > 0) {
            return C1368X.m6320c().mo5841n().mo6265c(c);
        }
        int d = m7221d(resources, str, str2);
        if (d > 0) {
            return resources.getDimensionPixelSize(d);
        }
        if (c > 0) {
            return f5089a.getDimensionPixelSize(c);
        }
        return e;
    }

    /* renamed from: c */
    public static int m7218c(Resources resources, String str, String str2, int i) {
        if (!m7213a()) {
            return -1;
        }
        int a = m7202a(str2, i);
        if (a != -1) {
            return a;
        }
        int d = m7221d(resources, str, str2);
        if (d > 0) {
            return Math.round(resources.getFraction(d, i, i));
        }
        int c = m7219c(str2);
        return c > 0 ? Math.round(f5089a.getFraction(c, i, i)) : a;
    }

    /* renamed from: a */
    public static int m7199a(Resources resources, String str, String str2, int i, int i2) {
        if (!m7213a() || TextUtils.isEmpty(str2)) {
            return i2;
        }
        String d = m7222d(str2);
        int indexOf = d == null ? -1 : d.indexOf(47);
        if (indexOf > 0) {
            String substring = d.substring(0, indexOf);
            if (f5092d.equals(substring)) {
                return m7218c(resources, str, d, i);
            }
            if (f5093e.equals(substring)) {
                return m7216b(resources, str, d, i2);
            }
        }
        int e = m7223e(d);
        if (e != -1) {
            return e;
        }
        int a = m7202a(d, i);
        if (a != -1) {
            return a;
        }
        return i2;
    }

    /* renamed from: d */
    private static String m7222d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int i = 0;
        if (str.startsWith("@+")) {
            i = 2;
        } else if (str.startsWith(C1063f.f3053e)) {
            i = 1;
        }
        return str.substring(i);
    }

    /* renamed from: a */
    public static int m7202a(String str, int i) {
        if (m7213a() && str.endsWith(f5097i)) {
            return Math.round((Float.valueOf(str.substring(0, str.length() - 2)).floatValue() * ((float) i)) / 100.0f);
        }
        return -1;
    }

    /* renamed from: a */
    public static String m7207a(float f) {
        if (f <= 0.0f) {
            f = 0.0f;
        }
        return String.valueOf(f) + f5097i;
    }

    /* renamed from: b */
    public static int m7217b(String str) {
        if (TextUtils.isEmpty(str) || !str.endsWith(f5097i)) {
            return -1;
        }
        return Integer.valueOf(str.substring(0, str.length() - f5094f.length())).intValue();
    }

    /* renamed from: e */
    private static int m7223e(String str) {
        if (str.endsWith(f5095g)) {
            return Math.round(((float) Integer.valueOf(str.substring(0, str.length() - f5095g.length())).intValue()) * f5089a.getDisplayMetrics().density);
        } else if (str.endsWith(f5094f)) {
            return Integer.valueOf(str.substring(0, str.length() - f5094f.length())).intValue();
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    public static Paint.Align m7203a(String str, Paint.Align align) {
        if (TextUtils.isEmpty(str)) {
            return align;
        }
        if (Settings.KEYBOARD_MARGIN_LEFT.equals(str) || "top".equals(str)) {
            return Paint.Align.LEFT;
        }
        if ("center".equals(str)) {
            return Paint.Align.CENTER;
        }
        if (Settings.KEYBOARD_MARGIN_RIGHT.equals(str) || "bottom".equals(str)) {
            return Paint.Align.RIGHT;
        }
        return null;
    }

    /* renamed from: a */
    public static C1443as m7206a(Context context, String str, int i) {
        String str2;
        PackageManager packageManager = context.getPackageManager();
        File file = new File(str);
        Resources resources = context.getResources();
        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getPath(), 0);
        if (packageArchiveInfo != null) {
            str2 = packageArchiveInfo.packageName;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        return new C1407aR(packageArchiveInfo, str2, str, resources.getDisplayMetrics(), resources.getConfiguration(), i);
    }

    /* renamed from: a */
    public static int m7196a(Context context, C1443as asVar, int i) {
        if (context == null || asVar == null) {
            return -1;
        }
        return m7197a(context.getResources(), asVar.getResources(), i, asVar.getPackageName());
    }

    /* renamed from: a */
    public static int m7197a(Resources resources, Resources resources2, int i, String str) {
        if (resources == null || resources2 == null) {
            return -1;
        }
        String a = m7208a(resources, i);
        if (!TextUtils.isEmpty(a)) {
            return resources2.getIdentifier(a, (String) null, str);
        }
        return -1;
    }

    /* renamed from: a */
    private static String m7208a(Resources resources, int i) {
        String str = null;
        if (resources == null) {
            return null;
        }
        try {
            str = resources.getResourceName(i);
        } catch (Resources.NotFoundException e) {
        }
        if (str != null) {
            return str.substring(str.indexOf(":") + 1);
        }
        return str;
    }

    /* renamed from: a */
    public static void m7211a(Context context, Preference preference, AttributeSet attributeSet) {
        if (context != null && preference != null) {
            C1963b.m9042a(context, preference, attributeSet);
        }
    }
}
