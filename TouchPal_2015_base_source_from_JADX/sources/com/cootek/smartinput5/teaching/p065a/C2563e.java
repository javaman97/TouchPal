package com.cootek.smartinput5.teaching.p065a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p050f.C1319a;
import com.cootek.smartinput5.teaching.C2578al;
import com.cootek.smartinput5.teaching.TutorialActivity;

/* renamed from: com.cootek.smartinput5.teaching.a.e */
/* compiled from: TeachingManager */
public class C2563e {

    /* renamed from: a */
    public static final int f10992a = 0;

    /* renamed from: b */
    public static final int f10993b = 1;

    /* renamed from: c */
    public static final int f10994c = 2;

    /* renamed from: d */
    public static final int f10995d = 3;

    /* renamed from: e */
    public static final int f10996e = 4;

    /* renamed from: f */
    public static final int f10997f = 5;

    /* renamed from: g */
    public static final int f10998g = 6;

    /* renamed from: h */
    public static final String[] f10999h = {"TUTORIAL_DEL_SLIDE", "TUTORIAL_CHS_BIHUA", "TUTORIAL_HANDWRITE_MASK", "TUTORIAL_CURVE", "TUTORIAL_TIPS_FOR_TYPING", "TUTORIAL_GUIDE", "TUTORIAL_WELCOME"};

    /* renamed from: i */
    public static final int f11000i = 0;

    /* renamed from: j */
    public static final int f11001j = 1;

    /* renamed from: k */
    public static boolean f11002k = false;

    /* renamed from: l */
    public static boolean f11003l = false;

    /* renamed from: m */
    public static boolean f11004m = false;

    /* renamed from: t */
    private static boolean f11005t;

    /* renamed from: A */
    private boolean f11006A;

    /* renamed from: B */
    private boolean f11007B;

    /* renamed from: C */
    private boolean f11008C;

    /* renamed from: n */
    public int f11009n;

    /* renamed from: o */
    private final String f11010o = "hw_mask";

    /* renamed from: p */
    private Context f11011p;

    /* renamed from: q */
    private C1319a f11012q;

    /* renamed from: r */
    private Activity f11013r;

    /* renamed from: s */
    private String f11014s;

    /* renamed from: u */
    private C2578al f11015u;

    /* renamed from: v */
    private boolean f11016v;

    /* renamed from: w */
    private boolean f11017w;

    /* renamed from: x */
    private boolean f11018x;

    /* renamed from: y */
    private boolean f11019y;

    /* renamed from: z */
    private boolean f11020z;

    public C2563e(Context context) {
        this.f11011p = context;
        this.f11016v = false;
    }

    /* renamed from: a */
    public void mo8410a(int i, Activity activity, int i2) {
        this.f11013r = activity;
        this.f11009n = i2;
        mo8409a(i);
    }

    /* renamed from: a */
    public static boolean m11445a(Context context, int i) {
        boolean i2;
        switch (i) {
            case 2:
                i2 = m11451i();
                break;
            case 6:
                i2 = m11444a(context);
                break;
            default:
                i2 = true;
                break;
        }
        if (!i2 && f11002k) {
            f11002k = false;
        }
        return i2;
    }

    /* renamed from: h */
    private static boolean m11450h() {
        if (!C1549b.f4831b.equals(Engine.getInstance().getCurrentLanguageId()) || Engine.getInstance().getSurfaceType() != 1) {
            return false;
        }
        int surfaceSubType = Engine.getInstance().getSurfaceSubType();
        if (surfaceSubType == 1 || surfaceSubType == 2 || surfaceSubType == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m11451i() {
        if ((Settings.getInstance().getIntSetting(Settings.LANGUAGE_USED_TIMES, 17, C1549b.f4831b, (Config) null) < 6 || Settings.getInstance().getBoolSetting(Settings.PINYIN_HANDWRITE_MIX_PROMPTED) || !m11450h()) && !f11003l && !f11004m) {
            return false;
        }
        f11004m = false;
        return true;
    }

    /* renamed from: a */
    private static boolean m11444a(Context context) {
        if (!C1132b.m5654a(context).mo4392a(C1135d.WELCOME_DIALOG_SHOW, (Boolean) true).booleanValue() || !C1593bR.m7162a().f5075a || !Settings.getInstance().getBoolSetting(Settings.FIRST_TUTORIAL_WELCOME) || Settings.getInstance().getBoolSetting(Settings.FIRST_SIZE_ADJUSTMENT) || Engine.getInstance().getEditor().isSpecialMode() || f11005t) {
            return false;
        }
        if (!f11002k) {
            return true;
        }
        C1368X.m6320c().mo5849v().mo6416a(C1368X.m6320c().mo5849v().mo6414a().mo6404a(5));
        Settings.getInstance().setBoolSetting(Settings.FIRST_TUTORIAL_WELCOME, false);
        return false;
    }

    /* renamed from: a */
    public void mo8409a(int i) {
        if (!m11447c(i)) {
            mo8408a();
            return;
        }
        this.f11008C = true;
        if (i == 6) {
            m11453k();
        } else if (i == 5) {
            C1368X.m6320c().mo5849v().mo6424d(C1368X.m6320c().mo5849v().mo6414a().mo6404a(5).f5285b);
            m11452j();
        } else {
            m11454l();
        }
    }

    /* renamed from: j */
    private void m11452j() {
        Intent intent = new Intent();
        intent.setClass(this.f11011p, TutorialActivity.class);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f11011p.startActivity(intent);
    }

    /* renamed from: k */
    private void m11453k() {
        this.f11015u = new C2578al(this.f11011p);
        this.f11015u.mo8437a();
        Settings.getInstance().setBoolSetting(Settings.FIRST_TUTORIAL_WELCOME, false);
    }

    /* renamed from: c */
    private boolean m11447c(int i) {
        this.f11014s = null;
        String d = m11448d(i);
        if (TextUtils.isEmpty(d)) {
            d = Settings.getInstance().getStringSetting(10);
        } else if (!C1368X.m6320c().mo5842o().mo5960o(d)) {
            return false;
        } else {
            if (!Settings.getInstance().isLanguageEnabled(d)) {
                Settings.getInstance().setLanguageEnabled(d, true);
                this.f11014s = d;
            }
            m11443a(d);
        }
        int e = m11449e(i);
        if (e != -1) {
            m11442a(e, d);
        }
        if (this.f11016v || mo8413b(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private String m11448d(int i) {
        switch (i) {
            case 1:
            case 2:
                return C1549b.f4831b;
            case 3:
            case 4:
                return C1549b.f4791a;
            default:
                return null;
        }
    }

    /* renamed from: e */
    private int m11449e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 2;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private void m11442a(int i, String str) {
        Settings.getInstance().setIntSetting(3, i, 1, C1368X.m6320c().mo5835h().getLanguageCategory(str, 1), (Config) null, true);
    }

    /* renamed from: a */
    public void mo8408a() {
        this.f11016v = false;
        if (this.f11013r != null) {
            this.f11013r.finish();
        }
        this.f11013r = null;
        mo8412b();
        mo8416e();
    }

    /* renamed from: b */
    public void mo8412b() {
        if (this.f11012q != null) {
            this.f11008C = false;
            this.f11012q.mo5545c();
        }
        if (this.f11015u != null) {
            this.f11008C = false;
            this.f11015u.mo8438b();
        }
    }

    /* renamed from: c */
    public void mo8414c() {
        if (!TextUtils.isEmpty(this.f11014s)) {
            Settings.getInstance().setLanguageEnabled(this.f11014s, false);
        }
    }

    /* renamed from: a */
    private void m11443a(String str) {
        if (!Engine.isInitialized() || !TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), str)) {
            Settings.getInstance().setStringSetting(10, C1368X.m6320c().mo5842o().mo5954l(str).f4727f);
        }
    }

    /* renamed from: a */
    public void mo8411a(boolean z) {
        f11005t = z;
    }

    /* renamed from: d */
    public boolean mo8415d() {
        return f11005t;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8413b(int r7) {
        /*
            r6 = this;
            r5 = 212(0xd4, float:2.97E-43)
            r4 = 144(0x90, float:2.02E-43)
            r2 = 8
            r3 = 0
            r1 = 1
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r5)
            if (r0 == 0) goto L_0x001b
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r0.setBoolSetting(r5, r3)
            r6.f11017w = r1
        L_0x001b:
            switch(r7) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0074;
                case 3: goto L_0x0035;
                case 4: goto L_0x0022;
                default: goto L_0x001e;
            }
        L_0x001e:
            r0 = r1
        L_0x001f:
            r6.f11016v = r1
            return r0
        L_0x0022:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r1)
            if (r0 == 0) goto L_0x0035
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r0.setBoolSetting(r1, r3)
            r6.f11006A = r1
        L_0x0035:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r4)
            if (r0 != 0) goto L_0x0048
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r0.setBoolSetting(r4, r1)
            r6.f11018x = r1
        L_0x0048:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r2 = 53
            boolean r0 = r0.getBoolSetting(r2)
            if (r0 == 0) goto L_0x0087
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r0.setWaveEnableSetting(r3)
            r6.f11007B = r1
            r0 = r1
            goto L_0x001f
        L_0x005f:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r2)
            if (r0 != 0) goto L_0x0087
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r0.setBoolSetting(r2, r1)
            r6.f11019y = r1
            r0 = r1
            goto L_0x001f
        L_0x0074:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r2 = 48
            boolean r0 = r0.getBoolSetting(r2)
            if (r0 != 0) goto L_0x0087
            boolean r0 = r6.m11446b((boolean) r1)
            r6.f11020z = r1
            goto L_0x001f
        L_0x0087:
            r0 = r1
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.teaching.p065a.C2563e.mo8413b(int):boolean");
    }

    /* renamed from: l */
    private void m11454l() {
        if (Engine.isInitialized() && Engine.getInstance().isHandwriteMaskVisible()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_hw_mask"), 0);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: b */
    private boolean m11446b(boolean z) {
        Settings.getInstance().setBoolSetting(48, z);
        String stringSetting = Settings.getInstance().getStringSetting(79);
        StringBuilder sb = new StringBuilder();
        String[] split = stringSetting.split("/");
        if (split == null) {
            return false;
        }
        boolean z2 = false;
        for (int i = 0; i < split.length; i++) {
            if (i != 0) {
                sb.append("/");
            }
            if (split[i].contains("hw_mask")) {
                z2 = true;
                sb.append("hw_mask:" + z);
            } else {
                sb.append(split[i]);
            }
        }
        Settings.getInstance().setStringSetting(79, sb.toString());
        C1368X.m6320c().mo5837j().mo6045f();
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager().mo9650h() == null) {
            return false;
        }
        Engine.getInstance().getWidgetManager().mo9650h().mo8555p();
        Engine.getInstance().getWidgetManager().mo9650h().mo8557q();
        return z2;
    }

    /* renamed from: e */
    public void mo8416e() {
        if (this.f11017w) {
            this.f11017w = false;
            Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, true);
        }
        if (this.f11018x) {
            this.f11018x = false;
            Settings.getInstance().setBoolSetting(Settings.CURVE_ENABLED_UI, false);
        }
        if (this.f11006A) {
            this.f11006A = false;
            Settings.getInstance().setBoolSetting(1, true);
        }
        if (this.f11019y) {
            this.f11019y = false;
            Settings.getInstance().setBoolSetting(8, false);
        }
        if (this.f11020z) {
            this.f11020z = false;
            m11446b(false);
        }
        if (this.f11007B) {
            this.f11007B = false;
            Settings.getInstance().setWaveEnableSetting(true);
        }
    }

    /* renamed from: f */
    public void mo8417f() {
        this.f11009n = 0;
    }

    /* renamed from: g */
    public boolean mo8418g() {
        return this.f11008C;
    }
}
