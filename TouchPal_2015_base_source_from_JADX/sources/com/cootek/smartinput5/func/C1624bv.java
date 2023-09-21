package com.cootek.smartinput5.func;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.asset.C1460o;
import com.emoji.keyboard.touchpal.R;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.func.bv */
/* compiled from: TouchPalTypeface */
public class C1624bv {

    /* renamed from: a */
    private static final String f5213a = "TouchPalTypeface";

    /* renamed from: b */
    private static Typeface f5214b;

    /* renamed from: c */
    private static Typeface f5215c;

    /* renamed from: d */
    private static Hashtable<String, Typeface> f5216d = new Hashtable<>();

    /* renamed from: a */
    public static void m7421a(C1443as asVar, C1443as asVar2) {
        if (!Settings.getInstance().getBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT)) {
            f5214b = m7420a(asVar, asVar2, R.string.font_default, Typeface.DEFAULT);
            f5215c = m7420a(asVar, asVar2, R.string.font_bold, Typeface.DEFAULT_BOLD);
            return;
        }
        f5214b = Typeface.DEFAULT;
        f5215c = Typeface.DEFAULT_BOLD;
    }

    /* renamed from: a */
    public static Typeface m7418a() {
        if (f5214b == null) {
            if (!Settings.getInstance().getBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT)) {
                C1602bh n = C1368X.m6320c().mo5841n();
                f5214b = m7420a(n.mo6288n(), n.mo6290o(), R.string.font_default, Typeface.DEFAULT);
            } else {
                f5214b = Typeface.DEFAULT;
            }
        }
        return f5214b;
    }

    /* renamed from: b */
    public static Typeface m7422b() {
        if (f5215c == null) {
            if (!Settings.getInstance().getBoolSetting(Settings.USE_SYSTEM_DEFAULT_FONT)) {
                C1602bh n = C1368X.m6320c().mo5841n();
                f5215c = m7420a(n.mo6288n(), n.mo6290o(), R.string.font_bold, Typeface.DEFAULT_BOLD);
            } else {
                f5215c = Typeface.DEFAULT_BOLD;
            }
        }
        return f5215c;
    }

    /* renamed from: c */
    public static void m7423c() {
        f5214b = null;
        f5215c = null;
    }

    /* renamed from: d */
    public static Typeface m7424d() {
        C1602bh n = C1368X.m6320c().mo5841n();
        return m7420a(n.mo6288n(), n.mo6290o(), R.string.font_default, Typeface.DEFAULT);
    }

    /* renamed from: a */
    private static Typeface m7420a(C1443as asVar, C1443as asVar2, int i, Typeface typeface) {
        if (!C1368X.m6324d()) {
            return typeface;
        }
        Typeface a = m7419a((Context) asVar2, asVar, C1368X.m6320c().mo5841n().mo6269e(i));
        if (a != null) {
            return a;
        }
        Typeface a2 = m7419a((Context) asVar2, asVar2, asVar2.getResources().getString(i));
        if (a2 != null) {
            return a2;
        }
        return typeface;
    }

    /* renamed from: a */
    private static Typeface m7419a(Context context, C1443as asVar, String str) {
        if (asVar == null) {
            return null;
        }
        String str2 = asVar.getPackageName() + str;
        Typeface typeface = f5216d.get(str2);
        if (typeface != null || TextUtils.isEmpty(str)) {
            return typeface;
        }
        try {
            typeface = C1460o.m6799b().mo6104d(context, asVar, str);
            f5216d.put(str2, typeface);
            return typeface;
        } catch (Exception e) {
            C1017y.m5219b(f5213a, "Font not found");
            return typeface;
        }
    }
}
