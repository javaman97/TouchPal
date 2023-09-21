package com.cootek.smartinput5.p066ui.guideintro;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.action.ActionDownloadLanguagePack;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2197U;
import com.cootek.smartinput5.net.C2361q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.guideintro.a */
/* compiled from: InputStyleConst */
public class C2922a {

    /* renamed from: a */
    public static final String f13254a = "more";

    /* renamed from: b */
    public static final String[] f13255b = {f13258e, f13259f, "chinese_handwrite", f13260g, "chinese_stroke", f13263j, f13264k, f13265l, f13266m, f13267n, f13268o, f13269p, "chinese_simplecangjie"};

    /* renamed from: c */
    private static final String f13256c = "InputStyleConst";

    /* renamed from: d */
    private static final String f13257d = ";";

    /* renamed from: e */
    private static final String f13258e = "chinese_pinyin;1";

    /* renamed from: f */
    private static final String f13259f = "chinese_pinyin;2";

    /* renamed from: g */
    private static final String f13260g = "chinese_pinyin;3";

    /* renamed from: h */
    private static final String f13261h = "chinese_handwrite";

    /* renamed from: i */
    private static final String f13262i = "chinese_stroke";

    /* renamed from: j */
    private static final String f13263j = "chinese_wubi;2";

    /* renamed from: k */
    private static final String f13264k = "chinese_wubi;3";

    /* renamed from: l */
    private static final String f13265l = "chinese_zhuyin;2";

    /* renamed from: m */
    private static final String f13266m = "chinese_zhuyin;1";

    /* renamed from: n */
    private static final String f13267n = "chinese_zhuyin;3";

    /* renamed from: o */
    private static final String f13268o = "chinese_cangjie;2";

    /* renamed from: p */
    private static final String f13269p = "chinese_cangjie;3";

    /* renamed from: q */
    private static final String f13270q = "chinese_simplecangjie";

    /* renamed from: a */
    public static int m13526a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (f13254a.equals(str)) {
            return R.drawable.input_style_img_more;
        }
        if ("chinese_handwrite".equals(m13533e(str))) {
            return R.drawable.input_style_img_handwrite;
        }
        switch (m13534f(str)) {
            case 1:
                return R.drawable.input_style_img_phonepad;
            case 2:
                return R.drawable.input_style_img_full;
            case 3:
                return R.drawable.input_style_img_tplus;
            default:
                return R.drawable.input_style_img_more;
        }
    }

    /* renamed from: a */
    public static String m13528a(Context context, String str) {
        C1550c a;
        if (!C1368X.m6324d() || context == null) {
            return null;
        }
        if (f13254a.equals(str)) {
            return C1974m.m9063a(context, (int) R.string.more);
        }
        String e = m13533e(str);
        int f = m13534f(str);
        if (TextUtils.isEmpty(e) || C1368X.m6320c().mo5842o() == null || (a = C1550c.m6998a(e)) == null) {
            return null;
        }
        String a2 = a.mo6191a(context);
        if (f == -1) {
            return a2;
        }
        String a3 = C1933b.m8861a(f, context);
        if (!TextUtils.isEmpty(a3)) {
            return a2 + C1351J.f4161f + a3;
        }
        return a2;
    }

    /* renamed from: b */
    public static boolean m13530b(String str) {
        C1498a l;
        String e = m13533e(str);
        if (TextUtils.isEmpty(e) || !C1368X.m6324d() || !C1368X.m6320c().mo5842o().mo5960o(e) || (l = C1368X.m6320c().mo5842o().mo5954l(e)) == null || !l.mo6156f()) {
            return false;
        }
        if ("chinese_handwrite".equals(e)) {
            return C1368X.m6320c().mo5848u().mo5599c();
        }
        return true;
    }

    /* renamed from: c */
    public static void m13531c(String str) {
        if (!f13254a.equals(str) && C1368X.m6324d()) {
            String e = m13533e(str);
            if (!TextUtils.isEmpty(e) && C1368X.m6320c().mo5842o().mo5952k(e)) {
                Settings.getInstance().setLanguageEnabled(e, true);
                Engine.switchToLanguage(e);
                int f = m13534f(str);
                if (f != -1) {
                    Settings.getInstance().setIntSetting(3, f, 1, C1368X.m6320c().mo5835h().getLanguageCategory(e, 1), (Config) null, false);
                }
            }
        }
    }

    /* renamed from: d */
    public static boolean m13532d(String str) {
        if (!C1368X.m6324d()) {
            return false;
        }
        String e = m13533e(str);
        if (!TextUtils.equals(e, Settings.getInstance().getStringSetting(10))) {
            return false;
        }
        int intSetting = Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(e, 1), (Config) null);
        int f = m13534f(str);
        if (f == -1 || f == intSetting) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m13527a() {
        int f;
        if (!C1368X.m6324d()) {
            return null;
        }
        String stringSetting = Settings.getInstance().getStringSetting(10);
        int intSetting = Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(stringSetting, 1), (Config) null);
        for (String str : f13255b) {
            if (TextUtils.equals(m13533e(str), stringSetting) && ((f = m13534f(str)) == -1 || f == intSetting)) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m13533e(String str) {
        if (TextUtils.isEmpty(str) || f13254a.equals(str)) {
            return null;
        }
        try {
            String[] split = str.split(";");
            if (split != null) {
                return split[0];
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: f */
    public static int m13534f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            String[] split = str.split(";");
            if (split == null || split.length != 2) {
                return -1;
            }
            try {
                return Integer.parseInt(split[1]);
            } catch (NumberFormatException e) {
                return -1;
            }
        } catch (Exception e2) {
            return -1;
        }
    }

    /* renamed from: a */
    public static void m13529a(Context context, String str, C2197U u) {
        C1498a l;
        boolean z = false;
        boolean z2 = true;
        if (context != null && str != null && C1368X.m6324d() && !f13254a.equals(str)) {
            String e = m13533e(str);
            if (!TextUtils.isEmpty(e)) {
                if (C1368X.m6320c().mo5842o().mo5960o(e) && (l = C1368X.m6320c().mo5842o().mo5954l(e)) != null && l.mo6156f()) {
                    if ("chinese_handwrite".equals(e)) {
                        z2 = false;
                        z = true;
                    } else {
                        z2 = false;
                    }
                }
                C2361q.m10797b().mo7997a(u);
                if (z2) {
                    new ActionDownloadLanguagePack(e).run();
                } else if (z) {
                    C2361q.m10797b().mo8024j(C1368X.m6320c().mo5848u().mo5597b(), C1974m.m9063a(context, (int) R.string.paopao_handwrite_data_title), (String) null);
                } else if (u != null) {
                    u.mo7663e();
                }
                C2361q.m10797b().mo7997a((C2197U) null);
            } else if (u != null) {
                u.mo7663e();
            }
        } else if (u != null) {
            u.mo7663e();
        }
    }
}
