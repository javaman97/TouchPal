package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1422ad;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.skin.C1997k;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.C2626M;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.settings.SkinCustomizeActivity;
import com.cootek.smartinput5.p066ui.settings.SkinDownloadActivity;
import com.emoji.keyboard.touchpal.R;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.bh */
/* compiled from: SkinManager */
public class C1602bh implements C1441aq, C2183M.C2184a {

    /* renamed from: X */
    private static int f5108X = -1;

    /* renamed from: Y */
    private static HashMap<String, Integer> f5109Y = null;

    /* renamed from: a */
    public static final boolean f5110a = false;

    /* renamed from: ab */
    private static final int f5111ab = 60000;

    /* renamed from: ac */
    private static final int f5112ac = 0;

    /* renamed from: b */
    public static final String[] f5113b = {"com.cootek.smartinputv5.skin.jobsmemorial", "com.cootek.smartinputv5.skin.backtothefuture", "com.cootek.smartinputv5.skin.bluejean", "com.cootek.smartinputv5.skin.greystayle", "com.cootek.smartinputv5.skin.happynewyear", "com.cootek.smartinputv5.skin.ics", "com.cootek.smartinputv5.skin.olympicgames", "com.cootek.smartinputv5.skin.peachpink", "com.cootek.smartinputv5.skin.pearlwhite", "com.cootek.smartinputv5.skin.plainsimple", "com.cootek.smartinputv5.skin.retrokraft", "com.cootek.smartinputv5.skin.touchpalabc", "com.cootek.smartinputv5.skin.touchpalbigsize", "com.cootek.smartinputv5.skin.miui", "com.cootek.smartinputv5.skin.classic", "com.cootek.smartinputv5.skin.newics", "com.cootek.smartinputv5.skin.white", "com.cootek.smartinputv5.skin.classicblue", "com.cootek.smartinputv5.skin.greengrass", "com.cootek.smartinputv5.skin.olympicflag", "com.cootek.smartinputv5.skin.snake", "com.cootek.smartinputv5.skin.horse", "com.cootek.smartinputv5.skin.hellokitty", "com.cootek.smartinputv5.skin.jobsmemorial", "com.cootek.smartinputv5.skin.blessingyaan"};

    /* renamed from: c */
    public static final String f5114c = ".tps";

    /* renamed from: d */
    public static final String f5115d = "com.cootek.smartinputv5.skin.customise";

    /* renamed from: e */
    public static final String f5116e = "SkinPackT";

    /* renamed from: f */
    public static final String f5117f = "com.cootek.smartinputv5.skin.defaultwhite";

    /* renamed from: g */
    public static final String f5118g = "SkinPack0DefaultWhite";

    /* renamed from: h */
    public static final String f5119h = "com.cootek.smartinputv5.skin.droid";

    /* renamed from: i */
    public static final String f5120i = "com.cootek.smartinputv5.skin.theme_free_neonblue";

    /* renamed from: j */
    public static final String f5121j = "SkinPackAndroidL";

    /* renamed from: k */
    public static final String f5122k = "SkinPackNeonBlue";

    /* renamed from: l */
    public static final String f5123l = "SkinPackTianlong";

    /* renamed from: m */
    public static final String f5124m = "SkinPackLava";

    /* renamed from: n */
    public static final String[] f5125n = {f5117f, f5120i, f5119h};

    /* renamed from: o */
    public static final String[] f5126o = {f5118g, f5122k, f5121j};

    /* renamed from: p */
    public static final String[][] f5127p = {new String[]{"OEM 03D A15 000"}, new String[]{"OEM 11B A15 001", "OEM 11B A15 002", "OEM 11B A15 003"}};

    /* renamed from: q */
    public static final String[] f5128q = {"com.cootek.smartinputv5.skin.buildin_tianlong", "com.cootek.smartinputv5.skin.buildin.lava"};

    /* renamed from: r */
    public static final String[] f5129r = {f5123l, f5124m};

    /* renamed from: s */
    public static final String[] f5130s = {f5118g, f5122k, f5121j, f5116e, f5123l, f5124m};

    /* renamed from: t */
    public static final String f5131t = "custom_skin_";

    /* renamed from: u */
    public static final int f5132u = 4;

    /* renamed from: v */
    private static final String f5133v = "SkinManager";

    /* renamed from: w */
    private static final String f5134w = "customise_skin_bg";

    /* renamed from: x */
    private static final String f5135x = "customise_skin_temp_bg";

    /* renamed from: y */
    private static final String f5136y = "customise_skin_preview";

    /* renamed from: A */
    private boolean f5137A = false;

    /* renamed from: B */
    private C1345G f5138B;

    /* renamed from: C */
    private int f5139C;

    /* renamed from: D */
    private final C1443as f5140D;

    /* renamed from: E */
    private final Resources f5141E;

    /* renamed from: F */
    private C1443as f5142F;

    /* renamed from: G */
    private Resources f5143G;

    /* renamed from: H */
    private ArrayList<C1810j> f5144H;

    /* renamed from: I */
    private ArrayList<C1810j> f5145I;

    /* renamed from: J */
    private ArrayList<C1810j> f5146J;

    /* renamed from: K */
    private final String f5147K;

    /* renamed from: L */
    private C1598bd f5148L;

    /* renamed from: M */
    private CopyOnWriteArrayList<C1604b> f5149M = new CopyOnWriteArrayList<>();

    /* renamed from: N */
    private ArrayList<C1603a> f5150N = new ArrayList<>();

    /* renamed from: O */
    private boolean f5151O = false;

    /* renamed from: P */
    private C1605c f5152P;

    /* renamed from: Q */
    private Set<String> f5153Q;

    /* renamed from: R */
    private ArrayList<String> f5154R;

    /* renamed from: S */
    private C2626M f5155S;

    /* renamed from: T */
    private Drawable f5156T = new ColorDrawable(0);

    /* renamed from: U */
    private ArrayList<String> f5157U;

    /* renamed from: V */
    private String f5158V;

    /* renamed from: W */
    private String f5159W;

    /* renamed from: Z */
    private HashSet<Drawable> f5160Z;

    /* renamed from: aa */
    private boolean f5161aa = true;

    /* renamed from: ad */
    private Handler f5162ad = new C1606bi(this, Looper.getMainLooper());

    /* renamed from: z */
    private BitmapDrawable f5163z;

    /* renamed from: com.cootek.smartinput5.func.bh$a */
    /* compiled from: SkinManager */
    public interface C1603a {
        /* renamed from: a */
        void mo6303a();
    }

    /* renamed from: com.cootek.smartinput5.func.bh$b */
    /* compiled from: SkinManager */
    public interface C1604b {
        /* renamed from: d */
        void mo6043d();
    }

    /* renamed from: com.cootek.smartinput5.func.bh$c */
    /* compiled from: SkinManager */
    public static class C1605c {

        /* renamed from: a */
        public boolean f5164a = false;

        /* renamed from: b */
        public int f5165b;

        /* renamed from: c */
        public int f5166c;

        /* renamed from: d */
        public int f5167d;

        /* renamed from: e */
        public int f5168e;
    }

    public C1602bh(Context context, C1598bd bdVar) {
        this.f5140D = new C1465au(context);
        this.f5141E = context.getResources();
        this.f5148L = bdVar;
        this.f5147K = C1974m.m9063a(context, (int) R.string.SKIN_PACK_EXPECTED_VERSION);
        this.f5153Q = new HashSet();
        this.f5154R = new ArrayList<>();
        this.f5157U = new ArrayList<>();
        m7228G();
        C1811k.m8322a().mo6817a((C1441aq) this);
        int intSetting = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER);
        String str = f5131t + intSetting;
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET);
        int intSetting2 = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_ALPHA);
        if (intSetting > 0) {
            stringSetting = Settings.getInstance().getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET, 28, str, (Config) null);
            intSetting2 = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_ALPHA, 28, str, (Config) null);
        }
        this.f5138B = C1345G.m6154a(stringSetting);
        this.f5139C = intSetting2;
    }

    /* renamed from: d */
    public static boolean m7249d(String str) {
        if (!TextUtils.equals(str, C1368X.m6313b().getPackageName()) && !TextUtils.equals(str, f5115d) && m7250e(str) <= -1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m7250e(String str) {
        if (f5109Y == null) {
            f5109Y = new HashMap<>();
            for (int i = 0; i < f5125n.length; i++) {
                f5109Y.put(f5125n[i].toLowerCase(), Integer.valueOf(i));
            }
        }
        if (f5109Y.containsKey(str.toLowerCase())) {
            return f5109Y.get(str.toLowerCase()).intValue();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo6271f(String str) {
        if (!this.f5154R.contains(str)) {
            this.f5154R.add(str);
            C1368X.m6320c().mo5827M().mo5988a(0, this.f5154R, true);
        }
    }

    /* renamed from: g */
    public boolean mo6275g(String str) {
        return this.f5154R.contains(str);
    }

    /* renamed from: a */
    public void mo6254a(C1604b bVar) {
        this.f5149M.add(bVar);
    }

    /* renamed from: b */
    public void mo6263b(C1604b bVar) {
        this.f5149M.remove(bVar);
    }

    /* renamed from: c */
    public void mo6266c() {
        this.f5149M.clear();
    }

    /* renamed from: a */
    public void mo6253a(C1603a aVar) {
        this.f5150N.add(aVar);
    }

    /* renamed from: b */
    public void mo6262b(C1603a aVar) {
        this.f5150N.remove(aVar);
    }

    /* renamed from: E */
    private void m7226E() {
        Iterator<C1603a> it = this.f5150N.iterator();
        while (it.hasNext()) {
            it.next().mo6303a();
        }
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        mo6277h();
        m7226E();
        C1997k.m9167a().mo7300a(str);
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        mo6277h();
        m7257s(str);
        m7226E();
        m7258t(str);
    }

    /* renamed from: a */
    public void mo5928a() {
        mo6277h();
        m7226E();
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return 1;
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        PackageInfo packageArchiveInfo;
        File a;
        if (!(file == null || (a = C1358O.m6234a("skin")) == null || TextUtils.equals(file.getParent(), a.getAbsolutePath()))) {
            File file2 = new File(a, file.getName());
            C0997e.m5173a(file, file2);
            if (file2 != null && file2.exists()) {
                file.delete();
            }
        }
        if (C1368X.m6324d() && (packageArchiveInfo = C1368X.m6313b().getPackageManager().getPackageArchiveInfo(file.getPath(), 0)) != null) {
            C1811k.m8322a().mo6818a(packageArchiveInfo.packageName);
        }
        this.f5157U.remove(str);
        if (mo6296r() && str != null && str.equals(this.f5158V)) {
            Settings.getInstance().setStringSetting(80, this.f5159W);
            mo6258a(this.f5159W, false, true);
            this.f5158V = null;
            this.f5159W = null;
            Settings.getInstance().setBoolSetting(Settings.DEFUALT_SKIN_UPDATED, true);
        }
        C1368X.m6320c().mo5839l().notifyOtherProcesses(Message.obtain((Handler) null, 8));
    }

    /* renamed from: d */
    public ArrayList<C1810j> mo6268d() {
        int i;
        int i2 = 0;
        if (this.f5144H == null) {
            m7233L();
            this.f5144H = C1811k.m8322a().mo6813a(1, this.f5147K);
            this.f5145I = new ArrayList<>();
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            int N = m7235N();
            for (String put : f5128q) {
                hashMap.put(put, false);
            }
            boolean z = false;
            int i3 = 0;
            while (i3 < this.f5144H.size()) {
                C1601bg bgVar = (C1601bg) this.f5144H.get(i3);
                String a = bgVar.mo6810a();
                if (!this.f5151O && !this.f5154R.contains(a)) {
                    this.f5154R.add(a);
                }
                if (this.f5147K.equals(bgVar.f5933b)) {
                    if (f5115d.equalsIgnoreCase(a)) {
                        z = true;
                    } else if (hashMap.get(a) != null) {
                        hashMap.put(a, true);
                        if (N < 0 || !a.equalsIgnoreCase(f5128q[N])) {
                            this.f5144H.remove(i3);
                        }
                    }
                    hashSet.add(a);
                    bgVar.f5102f = false;
                    i = i3 + 1;
                } else {
                    bgVar.f5102f = true;
                    if (f5115d.equalsIgnoreCase(a)) {
                        this.f5144H.remove(i3);
                        i = i3;
                    } else {
                        this.f5145I.add(this.f5144H.remove(i3));
                        i = i3;
                    }
                }
                i3 = i;
            }
            if (!z) {
                m7262x(f5116e);
            }
            for (int i4 = 0; i4 < f5125n.length; i4++) {
                if (!hashSet.contains(f5125n[i4])) {
                    m7262x(f5126o[i4]);
                }
            }
            if (N > -1 && !((Boolean) hashMap.get(f5128q[N])).booleanValue()) {
                m7262x(f5129r[N]);
            }
            m7227F();
        }
        if (!this.f5151O) {
            Iterator<String> it = C1368X.m6320c().mo5827M().mo5999e(1).iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f5154R.contains(next)) {
                    this.f5154R.add(next);
                }
            }
            C1368X.m6320c().mo5827M().mo5987a(1, this.f5154R);
            this.f5151O = true;
        }
        if (C1368X.m6320c().mo5840m().mo6066b() && this.f5144H != null) {
            while (i2 < this.f5144H.size()) {
                if (!C1368X.m6320c().mo5840m().mo6064a(((C1601bg) this.f5144H.get(i2)).mo6810a(), C1422ad.C1426c.TYPE_SKIN, 2)) {
                    this.f5144H.remove(i2);
                } else {
                    i2++;
                }
            }
        }
        return this.f5144H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7227F() {
        /*
            r7 = this;
            r2 = 0
            java.util.ArrayList<com.cootek.smartinput5.func.j> r0 = r7.f5145I
            if (r0 == 0) goto L_0x00a8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f5146J = r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<com.cootek.smartinput5.func.j> r0 = r7.f5145I
            java.util.Iterator r4 = r0.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r4.next()
            com.cootek.smartinput5.func.j r0 = (com.cootek.smartinput5.func.C1810j) r0
            java.util.ArrayList<com.cootek.smartinput5.func.j> r1 = r7.f5144H
            if (r1 == 0) goto L_0x00a9
            java.util.ArrayList<com.cootek.smartinput5.func.j> r1 = r7.f5144H
            java.util.Iterator r5 = r1.iterator()
        L_0x002d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00a9
            java.lang.Object r1 = r5.next()
            com.cootek.smartinput5.func.j r1 = (com.cootek.smartinput5.func.C1810j) r1
            java.lang.String r6 = r0.mo6810a()
            if (r6 == 0) goto L_0x002d
            java.lang.String r6 = r0.mo6810a()
            java.lang.String r1 = r1.mo6810a()
            boolean r1 = r6.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x002d
            r1 = 1
        L_0x004e:
            if (r1 == 0) goto L_0x0054
            r3.add(r0)
            goto L_0x0017
        L_0x0054:
            r1 = r2
        L_0x0055:
            java.lang.String[] r5 = f5113b
            int r5 = r5.length
            if (r1 >= r5) goto L_0x0017
            java.lang.String[] r5 = f5113b
            r5 = r5[r1]
            java.lang.String r6 = r0.mo6810a()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0071
            java.util.ArrayList<com.cootek.smartinput5.func.j> r1 = r7.f5146J
            r1.add(r0)
            r3.add(r0)
            goto L_0x0017
        L_0x0071:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0074:
            java.util.Iterator r1 = r3.iterator()
        L_0x0078:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            java.lang.Object r0 = r1.next()
            com.cootek.smartinput5.func.j r0 = (com.cootek.smartinput5.func.C1810j) r0
            java.util.ArrayList<com.cootek.smartinput5.func.j> r2 = r7.f5145I
            r2.remove(r0)
            goto L_0x0078
        L_0x008a:
            java.util.Iterator r1 = r3.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r0 = r1.next()
            com.cootek.smartinput5.func.j r0 = (com.cootek.smartinput5.func.C1810j) r0
            com.cootek.smartinput5.func.as r2 = r0.f5932a
            boolean r2 = r2.mo6023b()
            if (r2 != 0) goto L_0x008e
            com.cootek.smartinput5.func.as r0 = r0.f5932a
            r0.mo6025d()
            goto L_0x008e
        L_0x00a8:
            return
        L_0x00a9:
            r1 = r2
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1602bh.m7227F():void");
    }

    /* renamed from: e */
    public ArrayList<C1810j> mo6270e() {
        return this.f5145I;
    }

    /* renamed from: g */
    public ArrayList<C1810j> mo6273g() {
        return this.f5146J;
    }

    /* renamed from: h */
    public void mo6277h() {
        if (this.f5144H != null) {
            this.f5144H.clear();
            this.f5144H = null;
        }
        if (this.f5145I != null) {
            this.f5145I.clear();
            this.f5145I = null;
        }
        if (this.f5146J != null) {
            this.f5146J.clear();
            this.f5146J = null;
        }
    }

    /* renamed from: a */
    public boolean mo6257a(String str, boolean z) {
        return mo6258a(str, z, false);
    }

    /* renamed from: a */
    public boolean mo6258a(String str, boolean z, boolean z2) {
        return mo6259a(str, z, z2, false);
    }

    /* renamed from: a */
    public boolean mo6259a(String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C1443as asVar = this.f5142F;
        if (this.f5142F != null && this.f5142F.getPackageName().equals(str)) {
            if (mo6298t()) {
                mo6244A();
            }
            if (!z3) {
                return true;
            }
        }
        if (asVar != null) {
            C1599be.m7212a(asVar.getResources());
        }
        if (mo6246C().f11468f && f5115d.equalsIgnoreCase(str)) {
            this.f5163z = null;
            this.f5137A = false;
        }
        int intSetting = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER);
        String str2 = f5131t + intSetting;
        String stringSetting = Settings.getInstance().getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET);
        int intSetting2 = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_ALPHA);
        if (intSetting > 0) {
            stringSetting = Settings.getInstance().getStringSetting(Settings.CUSTOM_SKIN_COLOR_SET, 28, str2, (Config) null);
            intSetting2 = Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_ALPHA, 28, str2, (Config) null);
        }
        this.f5138B = C1345G.m6154a(stringSetting);
        this.f5139C = intSetting2;
        C1601bg l = mo6284l(str);
        if (l == null) {
            m7242a(this.f5140D);
            if (this.f5140D.getPackageName().equals(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            m7242a(l.f5932a);
            z4 = true;
        }
        m7229H();
        if (z2) {
            m7256r(str);
        }
        m7247c(z4);
        return z4;
    }

    /* renamed from: c */
    private void m7247c(boolean z) {
        if (z) {
            C2626M d = m7248d(true);
            if (d.f11468f) {
                d.mo8666c();
            }
        }
    }

    /* renamed from: r */
    private void m7256r(String str) {
        Message obtain = Message.obtain((Handler) null, 3);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.SETTING_TYPE, 2);
        bundle.putInt(IPCManager.SETTING_KEY, 80);
        bundle.putString(IPCManager.SETTING_VALUE, str);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: h */
    public boolean mo6278h(String str) {
        return mo6258a(str, false, true);
    }

    /* renamed from: k */
    public boolean mo6283k(String str) {
        return mo6258a(str, false, false);
    }

    /* renamed from: G */
    private void m7228G() {
        String stringSetting = Settings.getInstance().getStringSetting(80);
        if (this.f5142F != null && this.f5142F.getPackageName().equals(stringSetting)) {
            return;
        }
        if (stringSetting.equals(this.f5140D.getPackageName())) {
            m7242a(this.f5140D);
            return;
        }
        C1601bg l = mo6284l(stringSetting);
        if (l == null) {
            m7242a(this.f5140D);
        } else {
            m7242a(l.f5932a);
        }
    }

    /* renamed from: i */
    public void mo6279i() {
        boolean k = mo6282k();
        mo6264b(k);
        C2806cb.updateAttrId(k);
        mo6285l();
    }

    /* renamed from: s */
    private void m7257s(String str) {
        if (str.equals(this.f5142F.getPackageName())) {
            mo6278h(this.f5140D.getPackageName());
            Settings.getInstance().setStringSetting(80, this.f5140D.getPackageName());
            if (Engine.isInitialized()) {
                Engine.getInstance().getIms().requestHideSelf(0);
            }
        }
    }

    /* renamed from: H */
    private void m7229H() {
        this.f5152P = null;
        C2726bF.m12512d();
        C2787cK.m12705c();
        mo6280j();
        if (!mo6298t() || !mo6246C().f11468f) {
            mo6244A();
        }
        Iterator<C1604b> it = this.f5149M.iterator();
        while (it.hasNext()) {
            it.next().mo6043d();
        }
    }

    /* renamed from: j */
    public void mo6280j() {
        C1624bv.m7421a(this.f5142F, this.f5140D);
    }

    /* renamed from: l */
    public C1601bg mo6284l(String str) {
        C1601bg bgVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.f5144H = mo6268d();
        if (this.f5144H != null) {
            Iterator<C1810j> it = this.f5144H.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1810j next = it.next();
                if (next.mo6810a().equals(str) && this.f5147K.equals(next.f5933b)) {
                    bgVar = (C1601bg) next;
                    break;
                }
            }
        }
        int e = m7250e(str);
        if (bgVar != null) {
            return bgVar;
        }
        if (str.equals(f5115d)) {
            m7260v(f5116e);
        } else if (e > -1) {
            m7260v(f5126o[e]);
        }
        Iterator<C1810j> it2 = C1811k.m8322a().mo6813a(1, this.f5147K).iterator();
        while (it2.hasNext()) {
            C1810j next2 = it2.next();
            if (next2.mo6810a().equals(str) && this.f5147K.equals(next2.f5933b)) {
                return (C1601bg) next2;
            }
        }
        return bgVar;
    }

    /* renamed from: a */
    private void m7242a(C1443as asVar) {
        if (this.f5142F != null) {
            C1368X.m6320c().mo5838k().mo6239a(this.f5142F);
        }
        C1443as b = m7245b(asVar);
        if (b == null) {
            this.f5142F = this.f5140D;
            this.f5143G = this.f5141E;
            return;
        }
        this.f5142F = b;
        this.f5143G = b.getResources();
    }

    /* renamed from: b */
    private C1443as m7245b(C1443as asVar) {
        Context context = (Context) this.f5140D;
        File a = C1466av.m6849a(context, "skin");
        if (a == null) {
            return null;
        }
        if (!a.exists()) {
            a.mkdir();
        }
        File[] listFiles = a.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        if (asVar == null || asVar.getPackageName().equals(context.getPackageName())) {
            return asVar;
        }
        try {
            String[] c = C1460o.m6799b().mo6102c(context, asVar, "");
            if (c == null) {
                return asVar;
            }
            String absolutePath = a.getAbsolutePath();
            for (String str : c) {
                InputStream a2 = C1460o.m6799b().mo6098a(context, asVar, str);
                File file = new File(absolutePath + File.separator + str);
                try {
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    C0997e.m5178a(a2, (OutputStream) fileOutputStream);
                    a2.close();
                    fileOutputStream.close();
                } catch (IOException e) {
                }
            }
            return asVar;
        } catch (IOException e2) {
            return asVar;
        }
    }

    /* renamed from: k */
    public boolean mo6282k() {
        if (this.f5142F == null) {
            return true;
        }
        return this.f5140D.getPackageName().equals(this.f5142F.getPackageName());
    }

    /* renamed from: I */
    private Drawable m7230I() {
        return mo6249a((int) R.drawable.dynamic_candidate_bar);
    }

    /* renamed from: k */
    private boolean m7252k(int i) {
        if (!mo6246C().f11468f || (i != R.drawable.bg_keyboard_ctrl && i != R.drawable.candidate_bar && i != R.drawable.function_bar)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private Drawable m7253l(int i) {
        if (i == R.drawable.candidate_bar || i == R.drawable.function_bar) {
            return m7230I();
        }
        if (i == R.drawable.bg_keyboard_ctrl) {
            return this.f5156T;
        }
        return this.f5156T;
    }

    /* renamed from: a */
    public Drawable mo6249a(int i) {
        return mo6251a(i, (C2726bF) null, false);
    }

    /* renamed from: a */
    public Drawable mo6250a(int i, C2726bF bFVar) {
        return mo6251a(i, bFVar, false);
    }

    /* renamed from: a */
    public Drawable mo6251a(int i, C2726bF bFVar, boolean z) {
        Drawable drawable = null;
        if (i == 0) {
            return null;
        }
        if (m7252k(i)) {
            return m7253l(i);
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        boolean z2 = !this.f5161aa && a <= 0;
        if (a > 0) {
            try {
                drawable = this.f5143G.getDrawable(a);
            } catch (Resources.NotFoundException e) {
                e.printStackTrace();
                drawable = m7254m(i);
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
            } catch (NullPointerException e3) {
            } catch (Exception e4) {
                drawable = m7254m(i);
            }
        } else {
            drawable = m7254m(i);
        }
        if (bFVar != null) {
            drawable = mo6252a(drawable, bFVar);
        }
        if (drawable == null) {
            drawable = new BitmapDrawable();
        }
        if (z && z2) {
            m7246b(drawable);
        }
        return drawable;
    }

    /* renamed from: b */
    private void m7246b(Drawable drawable) {
        if (this.f5160Z == null) {
            this.f5160Z = new HashSet<>();
        }
        this.f5160Z.add(drawable);
    }

    /* renamed from: l */
    public void mo6285l() {
        if (this.f5160Z != null) {
            this.f5160Z.clear();
        }
    }

    /* renamed from: a */
    public boolean mo6256a(Drawable drawable) {
        if (drawable == null || this.f5160Z == null) {
            return false;
        }
        return this.f5160Z.contains(drawable);
    }

    /* renamed from: b */
    public void mo6264b(boolean z) {
        this.f5161aa = z;
    }

    /* renamed from: m */
    private Drawable m7254m(int i) {
        if (this.f5141E == null) {
            return null;
        }
        try {
            return this.f5141E.getDrawable(i);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public Drawable mo6252a(Drawable drawable, C2726bF bFVar) {
        Drawable a = bFVar.mo8999a().mo8995a(drawable);
        if (bFVar.mo9000b() && mo6298t() && this.f5139C >= 0 && a != null) {
            a.setAlpha(this.f5139C);
        }
        return a;
    }

    /* renamed from: b */
    public int mo6260b(int i) {
        return mo6248a(i, (C2787cK) null);
    }

    /* renamed from: a */
    public int mo6248a(int i, C2787cK cKVar) {
        if (i == 0) {
            return 0;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        if (a <= 0) {
            return this.f5141E.getColor(i);
        }
        if (cKVar != null) {
            try {
                if (mo6298t() && cKVar.mo9114b() > 0) {
                    return this.f5141E.getColor(cKVar.mo9114b());
                }
            } catch (Resources.NotFoundException e) {
                return this.f5141E.getColor(i);
            }
        }
        return this.f5143G.getColor(a);
    }

    /* renamed from: c */
    public int mo6265c(int i) {
        if (i == 0) {
            return 0;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        if (a <= 0) {
            return m7255n(i);
        }
        try {
            return this.f5143G.getDimensionPixelSize(a);
        } catch (Resources.NotFoundException e) {
            return m7255n(i);
        }
    }

    /* renamed from: n */
    private int m7255n(int i) {
        try {
            return this.f5141E.getDimensionPixelSize(i);
        } catch (Resources.NotFoundException e) {
            return 0;
        }
    }

    /* renamed from: d */
    public int mo6267d(int i) {
        if (i == 0) {
            return 0;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        if (a <= 0) {
            return this.f5141E.getDimensionPixelOffset(i);
        }
        try {
            return this.f5143G.getDimensionPixelOffset(a);
        } catch (Resources.NotFoundException e) {
            return this.f5141E.getDimensionPixelOffset(i);
        }
    }

    /* renamed from: e */
    public String mo6269e(int i) {
        if (i == 0) {
            return null;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        return a > 0 ? this.f5143G.getString(a) : this.f5141E.getString(i);
    }

    /* renamed from: f */
    public String[] mo6272f(int i) {
        if (i == 0) {
            return null;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        if (a > 0) {
            try {
                return this.f5143G.getStringArray(a);
            } catch (Resources.NotFoundException e) {
            }
        }
        return this.f5141E.getStringArray(i);
    }

    /* renamed from: g */
    public boolean mo6274g(int i) {
        if (i == 0) {
            return false;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        return a > 0 ? this.f5143G.getBoolean(a) : this.f5141E.getBoolean(i);
    }

    /* renamed from: h */
    public int mo6276h(int i) {
        if (i == 0) {
            return 0;
        }
        int a = this.f5148L.mo6236a(this.f5142F, i);
        return a > 0 ? a : i;
    }

    /* renamed from: m */
    public C1605c mo6287m() {
        if (this.f5152P == null) {
            this.f5152P = new C1605c();
            this.f5152P.f5164a = mo6274g((int) R.bool.text_shadow);
            if (this.f5152P.f5164a) {
                this.f5152P.f5166c = mo6265c((int) R.dimen.text_shadow_radius);
                this.f5152P.f5167d = mo6265c((int) R.dimen.text_shadow_dx);
                this.f5152P.f5168e = mo6265c((int) R.dimen.text_shadow_dy);
                this.f5152P.f5165b = mo6260b((int) R.color.text_shadow_color);
            }
        }
        return this.f5152P;
    }

    /* renamed from: m */
    public C1443as mo6286m(String str) {
        if (this.f5144H != null) {
            Iterator<C1810j> it = this.f5144H.iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (next.mo6810a().equals(str)) {
                    return next.f5932a;
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public C1443as mo6288n() {
        return this.f5142F == null ? this.f5140D : this.f5142F;
    }

    /* renamed from: o */
    public C1443as mo6290o() {
        return this.f5140D;
    }

    /* renamed from: n */
    public void mo6289n(String str) {
        this.f5162ad.removeMessages(0, str);
        this.f5153Q.add(str);
        Message obtainMessage = this.f5162ad.obtainMessage(0);
        obtainMessage.obj = str;
        this.f5162ad.sendMessageDelayed(obtainMessage, Utils.MINUTE_MILLIS);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m7258t(String str) {
        this.f5153Q.remove(str);
    }

    /* renamed from: J */
    private boolean m7231J() {
        return this.f5153Q.size() > 0;
    }

    /* renamed from: p */
    public void mo6292p() {
        boolean z = false;
        if (m7231J() && !mo6282k() && mo6284l(mo6288n().getPackageName()) == null) {
            z = true;
        }
        if (!z && ((mo6298t() || f5115d.equals(Settings.getInstance().getStringSetting(80))) && !mo6300v())) {
            z = true;
        }
        if (C1368X.m6320c().mo5840m().mo6066b()) {
            if (!C1368X.m6320c().mo5840m().mo6064a(mo6288n().getPackageName(), C1422ad.C1426c.TYPE_SKIN, 2)) {
                z = true;
            }
        }
        if (z) {
            String packageName = this.f5140D.getPackageName();
            Settings.getInstance().setStringSetting(80, packageName);
            mo6283k(packageName);
        }
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: K */
    private void m7232K() {
        Message obtain = Message.obtain((Handler) null, 18);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(IPCManager.UPGRADING_SKIN_LIST, this.f5157U);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: b */
    public void mo5571b(String str) {
        if (m7259u(str)) {
            this.f5157U.remove(str);
            this.f5158V = null;
            m7232K();
        }
    }

    /* renamed from: f */
    public void mo5577f() {
        this.f5157U.clear();
        this.f5158V = null;
        m7232K();
    }

    /* renamed from: c */
    public void mo5573c(String str) {
        if (!m7259u(str)) {
            this.f5157U.add(str);
            m7232K();
        }
    }

    /* renamed from: o */
    public void mo6291o(String str) {
        if (!m7259u(str)) {
            this.f5157U.add(str);
            m7232K();
        }
    }

    /* renamed from: a */
    public void mo6255a(String str, String str2) {
        if (!mo6296r()) {
            this.f5158V = str;
            this.f5159W = str2;
        }
    }

    /* renamed from: q */
    public String mo6294q() {
        return this.f5159W;
    }

    /* renamed from: u */
    private boolean m7259u(String str) {
        Iterator<String> it = this.f5157U.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo6293p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals(this.f5158V);
    }

    /* renamed from: r */
    public boolean mo6296r() {
        return this.f5158V != null;
    }

    /* renamed from: s */
    public ArrayList<String> mo6297s() {
        return this.f5157U;
    }

    /* renamed from: a */
    public static void m7241a(Context context, String str, String str2) {
        Settings.getInstance().writeBack();
        if (C1132b.m5654a(context).mo4392a(C1135d.ONLINE_SHOP, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            C1368X.m6320c().mo5825K().launchShop(1, str2);
            return;
        }
        Intent intent = new Intent(context, SkinDownloadActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra(SkinDownloadActivity.f13711e, str);
        }
        intent.addFlags(Engine.EXCEPTION_ERROR);
        context.startActivity(intent);
    }

    /* renamed from: L */
    private void m7233L() {
        for (String v : f5130s) {
            m7260v(v);
        }
    }

    /* renamed from: v */
    private void m7260v(String str) {
        if (m7264y(str) && !m7261w(str)) {
            m7240a((Context) this.f5140D, str);
        }
    }

    /* renamed from: w */
    private static boolean m7261w(String str) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = C1358O.m6234a("skin")) != null && new File(a, str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m7262x(String str) {
        m7240a((Context) this.f5140D, str);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.FileOutputStream] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0043 A[SYNTHETIC, Splitter:B:26:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[SYNTHETIC, Splitter:B:32:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0052 A[SYNTHETIC, Splitter:B:35:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m7240a(android.content.Context r5, java.lang.String r6) {
        /*
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x000f
            if (r5 == 0) goto L_0x000f
            boolean r0 = m7264y(r6)
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            return
        L_0x0010:
            java.lang.String r0 = "skin"
            java.io.File r0 = com.cootek.smartinput5.func.C1358O.m6234a((java.lang.String) r0)
            if (r0 == 0) goto L_0x000f
            com.cootek.smartinput5.func.asset.o r2 = com.cootek.smartinput5.func.asset.C1460o.m6799b()     // Catch:{ Exception -> 0x003a, all -> 0x0049 }
            java.io.InputStream r2 = r2.mo6099a((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x003a, all -> 0x0049 }
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r3.<init>(r0, r6)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0065, all -> 0x005e }
            com.cootek.smartinput.utilities.C0997e.m5178a((java.io.InputStream) r2, (java.io.OutputStream) r0)     // Catch:{ Exception -> 0x0069, all -> 0x0060 }
            if (r2 == 0) goto L_0x0032
            r2.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0032:
            if (r0 == 0) goto L_0x000f
            r0.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x000f
        L_0x0038:
            r0 = move-exception
            goto L_0x000f
        L_0x003a:
            r0 = move-exception
            r0 = r1
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0041:
            if (r0 == 0) goto L_0x000f
            r0.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x000f
        L_0x0047:
            r0 = move-exception
            goto L_0x000f
        L_0x0049:
            r0 = move-exception
            r2 = r1
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ IOException -> 0x005a }
        L_0x0050:
            if (r1 == 0) goto L_0x0055
            r1.close()     // Catch:{ IOException -> 0x005c }
        L_0x0055:
            throw r0
        L_0x0056:
            r1 = move-exception
            goto L_0x0032
        L_0x0058:
            r1 = move-exception
            goto L_0x0041
        L_0x005a:
            r2 = move-exception
            goto L_0x0050
        L_0x005c:
            r1 = move-exception
            goto L_0x0055
        L_0x005e:
            r0 = move-exception
            goto L_0x004b
        L_0x0060:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x004b
        L_0x0065:
            r0 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x003c
        L_0x0069:
            r1 = move-exception
            r1 = r2
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1602bh.m7240a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: y */
    private static boolean m7264y(String str) {
        for (int i = 0; i < f5129r.length; i++) {
            if (str.equals(f5129r[i]) && i != m7235N()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public boolean mo6298t() {
        return f5115d.equalsIgnoreCase(mo6288n().getPackageName());
    }

    /* renamed from: u */
    public BitmapDrawable mo6299u() {
        return this.f5163z;
    }

    /* renamed from: v */
    public boolean mo6300v() {
        if (this.f5163z == null && mo6302x() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public BitmapDrawable mo6301w() {
        if (mo6246C().f11468f) {
            this.f5163z = (BitmapDrawable) this.f5155S.mo8669f();
        }
        return mo6302x();
    }

    /* renamed from: x */
    public BitmapDrawable mo6302x() {
        int i;
        boolean z;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i2 = this.f5141E.getDisplayMetrics().widthPixels;
        if (this.f5163z == null || !this.f5137A) {
            i = -1;
            z = true;
        } else {
            i = m7234M();
            if (i == 0) {
                mo6244A();
                z = true;
            } else {
                Bitmap bitmap3 = this.f5163z.getBitmap();
                if (((double) Math.abs((((float) bitmap3.getWidth()) / ((float) bitmap3.getHeight())) - (((float) i2) / ((float) i)))) > 0.05d) {
                    mo6244A();
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (z) {
            System.currentTimeMillis();
            this.f5137A = false;
            if (this.f5163z != null) {
                bitmap = this.f5163z.getBitmap();
            } else {
                String y = m7263y();
                if (y != null) {
                    try {
                        bitmap = BitmapFactory.decodeFile(y, C1584bI.m7144b(new File(y)));
                    } catch (OutOfMemoryError e) {
                        return null;
                    }
                } else {
                    bitmap = null;
                }
            }
            if (bitmap2 == null) {
                return null;
            }
            if (Engine.isInitialized()) {
                if (i == -1) {
                    i = m7234M();
                }
                if (i > 0) {
                    bitmap2 = C1584bI.m7124a(bitmap2, i2, i);
                    if (bitmap2.getHeight() > i) {
                        try {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap2, i2, i, false);
                        } catch (OutOfMemoryError e2) {
                            return null;
                        }
                    }
                    this.f5137A = true;
                }
            }
            if (bitmap2 != null) {
                this.f5163z = new BitmapDrawable(this.f5140D.getResources(), bitmap2);
            }
        }
        return this.f5163z;
    }

    /* renamed from: y */
    public static String m7263y() {
        return m7251i(Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER));
    }

    /* renamed from: i */
    public static String m7251i(int i) {
        File a = C1358O.m6234a("skin");
        if (a == null) {
            return null;
        }
        String str = a.getAbsolutePath() + File.separator + f5134w;
        if (i <= 0 || i >= 4) {
            return str;
        }
        return str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i;
    }

    /* renamed from: z */
    public static String m7265z() {
        File a = C1358O.m6234a("skin");
        if (a != null) {
            return a.getAbsolutePath() + File.separator + f5135x;
        }
        return null;
    }

    /* renamed from: a */
    public static String m7239a(Context context) {
        return m7238a(Settings.getInstance().getIntSetting(Settings.CUSTOM_SKIN_SET_NUMBER), context);
    }

    /* renamed from: a */
    public static String m7238a(int i, Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = cacheDir.getAbsolutePath() + File.separator + f5136y;
        if (i <= 0 || i >= 4) {
            return str;
        }
        return str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR + i;
    }

    /* renamed from: A */
    public void mo6244A() {
        this.f5163z = null;
        if (mo6246C().f11468f) {
            this.f5163z = (BitmapDrawable) this.f5155S.mo8669f();
        }
        this.f5137A = false;
    }

    /* renamed from: M */
    private int m7234M() {
        int i = 0;
        if (!Engine.isInitialized()) {
            return 0;
        }
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        if (Engine.getInstance().isHardKeyMode()) {
            i = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        } else if (Engine.getInstance().getWidgetManager().mo9648g() != null) {
            int g = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9134g();
            i = ((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown() ? Engine.getInstance().getWidgetManager().mo9651i().mo9718d() + g : g;
        }
        return i + ad.mo9256n();
    }

    /* renamed from: b */
    public void mo6261b(int i, Context context) {
        String i2 = m7251i(i);
        String a = m7238a(i, context);
        if (!TextUtils.isEmpty(i2)) {
            File file = new File(i2);
            if (file.exists()) {
                file.delete();
            }
        }
        if (!TextUtils.isEmpty(a)) {
            File file2 = new File(a);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    /* renamed from: b */
    public static Intent m7244b(Context context) {
        int i = 0;
        while (true) {
            if (i >= 4) {
                i = 0;
                break;
            } else if (!new File(m7251i(i)).exists()) {
                break;
            } else {
                i++;
            }
        }
        return m7237a(context, i, true);
    }

    /* renamed from: a */
    public static Intent m7236a(Context context, int i) {
        return m7237a(context, i, false);
    }

    /* renamed from: a */
    public static Intent m7237a(Context context, int i, boolean z) {
        Intent intent = new Intent(context, SkinCustomizeActivity.class);
        intent.putExtra(SkinCustomizeActivity.f13657a, i);
        intent.putExtra(SkinCustomizeActivity.f13658b, m7251i(i));
        intent.putExtra(SkinCustomizeActivity.f13659c, m7265z());
        intent.putExtra(SkinCustomizeActivity.f13660d, m7238a(i, context));
        intent.putExtra(SkinCustomizeActivity.f13661e, 5);
        intent.putExtra(SkinCustomizeActivity.f13662f, 4);
        intent.putExtra(SkinCustomizeActivity.f13663g, 600);
        intent.putExtra(SkinCustomizeActivity.f13664h, 600);
        intent.putExtra(SkinCustomizeActivity.f13665i, z);
        return intent;
    }

    /* renamed from: q */
    public void mo6295q(String str) {
        this.f5138B = C1345G.m6154a(str);
    }

    /* renamed from: B */
    public C1345G mo6245B() {
        return this.f5138B;
    }

    /* renamed from: j */
    public void mo6281j(int i) {
        this.f5139C = i;
    }

    /* renamed from: d */
    private C2626M m7248d(boolean z) {
        if (this.f5155S == null || z) {
            this.f5155S = new C2626M();
        }
        return this.f5155S;
    }

    /* renamed from: C */
    public C2626M mo6246C() {
        return m7248d(false);
    }

    /* renamed from: D */
    public boolean mo6247D() {
        int N = m7235N();
        if (N <= -1) {
            return false;
        }
        mo6258a(f5128q[N], false, true);
        Settings.getInstance().setStringSetting(80, f5128q[N]);
        return true;
    }

    /* renamed from: N */
    private static int m7235N() {
        if (f5108X < 0) {
            String stringSetting = Settings.getInstance().getStringSetting(Settings.RECOMMEND_CHANNEL_CODE);
            for (int i = 0; i < f5127p.length; i++) {
                for (String equals : f5127p[i]) {
                    if (TextUtils.equals(stringSetting, equals)) {
                        f5108X = i;
                        return f5108X;
                    }
                }
            }
        }
        return f5108X;
    }
}
