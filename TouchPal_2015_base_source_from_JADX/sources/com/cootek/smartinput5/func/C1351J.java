package com.cootek.smartinput5.func;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.ClipboardBackend;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2225al;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.J */
/* compiled from: EmojiManager */
public class C1351J {

    /* renamed from: a */
    public static final int f4156a = 1;

    /* renamed from: b */
    public static final int f4157b = 2;

    /* renamed from: c */
    public static final int f4158c = 0;

    /* renamed from: d */
    public static final int f4159d = 1;

    /* renamed from: e */
    public static final String f4160e = "recent";

    /* renamed from: f */
    public static final String f4161f = "-";

    /* renamed from: g */
    public static final String f4162g = "u";

    /* renamed from: h */
    public static final String f4163h = "emojiInApp";

    /* renamed from: i */
    public static final String f4164i = "com.cootek.smartinputv5.emoji.zero.touchpal.emojikeyboard";

    /* renamed from: j */
    private static final String f4165j = "emoticon";

    /* renamed from: k */
    private static final String f4166k = "_full";

    /* renamed from: l */
    private static C1351J f4167l;

    /* renamed from: m */
    private int f4168m;

    /* renamed from: n */
    private boolean f4169n;

    private C1351J() {
    }

    /* renamed from: a */
    public static C1351J m6188a() {
        if (f4167l == null) {
            f4167l = new C1351J();
        }
        return f4167l;
    }

    /* renamed from: b */
    public int mo5641b() {
        return this.f4168m;
    }

    /* renamed from: a */
    public static boolean m6190a(int i) {
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: c */
    public void mo5643c() {
        if (Engine.isInitialized()) {
            m6199p();
            String str = null;
            if (Engine.getInstance().getEditor() != null) {
                str = Engine.getInstance().getEditor().getEditorPackageName();
            }
            if (str != null) {
                C1353K a = C1353K.m6220a(str);
                if (a == null) {
                    a = m6198o();
                }
                if (a != null) {
                    this.f4168m = a.mo5752b();
                    m6192b(a.mo5753c());
                }
            }
            Settings.getInstance().setIntSetting(Settings.CURRENT_EMOJI_INPUT_TYPE, mo5641b(), false);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: o */
    private static C1353K m6198o() {
        String str;
        String str2;
        C1353K k = null;
        if (0 == 0 && (str2 = Build.BRAND) != null) {
            k = C1353K.m6220a(str2.toLowerCase());
        }
        if (k != null || (str = Build.MODEL) == null) {
            return k;
        }
        return C1353K.m6220a(str.toLowerCase());
    }

    /* renamed from: p */
    private void m6199p() {
        this.f4168m = 1;
        m6192b(Settings.getInstance().getBoolSetting(Settings.DISPLAY_EMOJI_BY_SYSTEM));
    }

    /* renamed from: a */
    public String mo5639a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(f4161f)) == null) {
            return null;
        }
        return new String(m6191a(split));
    }

    /* renamed from: a */
    private char[] m6191a(String[] strArr) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        for (String e : strArr) {
            for (char valueOf : m6195e(e)) {
                arrayList.add(Character.valueOf(valueOf));
            }
        }
        char[] cArr = new char[arrayList.size()];
        while (true) {
            int i2 = i;
            if (i2 >= cArr.length) {
                return cArr;
            }
            cArr[i2] = ((Character) arrayList.get(i2)).charValue();
            i = i2 + 1;
        }
    }

    /* renamed from: e */
    private char[] m6195e(String str) {
        int parseInt = Integer.parseInt(str, 16);
        if (parseInt > 65535) {
            return m6194c(parseInt);
        }
        return m6193b(parseInt);
    }

    /* renamed from: b */
    private char[] m6193b(int i) {
        return new char[]{(char) i};
    }

    /* renamed from: c */
    private char[] m6194c(int i) {
        int i2 = i - 65536;
        return new char[]{(char) ((i2 >> 10) | 55296), (char) ((i2 & 1023) | 56320)};
    }

    /* renamed from: d */
    public void mo5646d() {
        C2003a.m9262c().mo7350e();
    }

    /* renamed from: e */
    public boolean mo5647e() {
        return C2003a.m9262c().mo7352g();
    }

    /* renamed from: f */
    public void mo5648f() {
        C2003a.m9262c().mo7353h();
    }

    /* renamed from: a */
    public void mo5640a(boolean z) {
        C2003a.m9262c().mo7347b(z);
    }

    /* renamed from: b */
    public Object mo5642b(String str) {
        if (C2003a.m9262c().mo7355j()) {
            return C2003a.m9262c().mo7348d(str);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo5644c(String str) {
        return C2003a.m9262c().mo7351e(str);
    }

    /* renamed from: g */
    public int mo5649g() {
        return 1;
    }

    /* renamed from: d */
    public String mo5645d(String str) {
        if ("emoticon".equals(str)) {
            return str + f4166k;
        }
        return str;
    }

    /* renamed from: h */
    public static boolean m6196h() {
        return C2225al.m10059a(C1358O.f4207r);
    }

    /* renamed from: a */
    public static void m6189a(Context context) {
        C2225al.m10082p(context);
    }

    /* renamed from: i */
    public boolean mo5650i() {
        return this.f4169n;
    }

    /* renamed from: b */
    private void m6192b(boolean z) {
        if (C2003a.m9262c().mo7355j()) {
            this.f4169n = z;
        } else {
            this.f4169n = true;
        }
    }

    /* renamed from: j */
    public boolean mo5651j() {
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_CATEGORY, 22, m6188a().mo5645d(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB)), (Config) null);
        if (mo5649g() != 1 || !stringSetting.equals(f4160e)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m6197k() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        C1353K o = m6198o();
        if (o != null) {
            return m6190a(o.mo5752b());
        }
        return true;
    }

    /* renamed from: l */
    public void mo5652l() {
        if (Engine.isInitialized() && ClipboardBackend.getInstance() != null && ClipboardBackend.getInstance().needModifyClipboard()) {
            ClipboardBackend.getInstance().onItemCommitted();
        }
    }

    /* renamed from: m */
    public boolean mo5653m() {
        if (Build.VERSION.SDK_INT >= 17) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo5654n() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return false;
    }
}
