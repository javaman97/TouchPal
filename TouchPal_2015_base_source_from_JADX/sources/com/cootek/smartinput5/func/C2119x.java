package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.WarningManager;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.component.C1670e;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.func.x */
/* compiled from: CompatiableManager */
public class C2119x implements WarningManager.IWarningListener {

    /* renamed from: A */
    private static final int f8992A = 2;

    /* renamed from: B */
    private static final double f8993B = 0.9d;

    /* renamed from: C */
    private static final double f8994C = 1.1d;

    /* renamed from: a */
    public static final String f8995a = ".bak";

    /* renamed from: b */
    public static final String f8996b = "com.cootek.smartinputv5/lang_eng";

    /* renamed from: c */
    public static final int f8997c = 1;

    /* renamed from: d */
    public static final int f8998d = 2;

    /* renamed from: e */
    public static final int f8999e = 3;

    /* renamed from: f */
    public static final int f9000f = 4;

    /* renamed from: g */
    public static final SparseIntArray f9001g = new SparseIntArray();

    /* renamed from: h */
    public static final HashMap<Boolean, Integer> f9002h = new HashMap<>();

    /* renamed from: i */
    public static final SparseIntArray f9003i = new SparseIntArray();

    /* renamed from: j */
    public static String f9004j = "TouchPalOptions.xml";

    /* renamed from: k */
    private static final String f9005k = "compatiable";

    /* renamed from: l */
    private static final String f9006l = "com.cootek.smartinputv5";

    /* renamed from: m */
    private static final String f9007m = "eng_usr.img";

    /* renamed from: n */
    private static final String f9008n = "chs_usr.img";

    /* renamed from: o */
    private static final String f9009o = "cht_usr.img";

    /* renamed from: p */
    private static final String f9010p = "eng_TouchPal_USR.bak";

    /* renamed from: q */
    private static final String f9011q = "chs_TouchPal_USR.bak";

    /* renamed from: r */
    private static final String f9012r = "cht_TouchPal_USR.bak";

    /* renamed from: s */
    private static final String f9013s = "western.usr";

    /* renamed from: t */
    private static final String f9014t = "chinese_simplified.usr";

    /* renamed from: u */
    private static final String f9015u = "chinese_traditional.usr";

    /* renamed from: v */
    private static final int f9016v = 1;

    /* renamed from: w */
    private static final int f9017w = 2;

    /* renamed from: x */
    private static final int f9018x = 3;

    /* renamed from: y */
    private static final int f9019y = 0;

    /* renamed from: z */
    private static final int f9020z = 1;

    /* renamed from: D */
    private Context f9021D;

    /* renamed from: E */
    private Hashtable<String, String> f9022E;

    /* renamed from: F */
    private Hashtable<String, File> f9023F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Handler f9024G = new Handler();

    /* renamed from: H */
    private boolean f9025H = false;

    static {
        f9001g.put(1, 2);
        f9001g.put(2, 1);
        f9001g.put(3, 3);
        f9002h.put(false, 0);
        f9002h.put(true, 1);
    }

    public C2119x(Context context) {
        this.f9021D = context;
        this.f9025H = m9659a(context);
        m9664f();
        m9665g();
    }

    public void updateWarning(int i, int i2) {
        if (i == 6) {
            String errorMsg = C1368X.m6320c().mo5835h().getErrorMsg();
            if (!TextUtils.isEmpty(errorMsg)) {
                C1670e eVar = new C1670e(this.f9021D);
                String[] split = errorMsg.split(" ");
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < split.length) {
                        if (this.f9023F.containsKey(split[i4])) {
                            File file = this.f9023F.get(split[i4]);
                            if (file != null) {
                                eVar.mo6524a(this.f9022E.get(split[i4]));
                                file.delete();
                            }
                            this.f9023F.remove(split[i4]);
                        }
                        i3 = i4 + 1;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7496a() {
        if (this.f9025H) {
            File a = C1466av.m6848a(this.f9021D);
            if (a != null) {
                try {
                    File[] listFiles = a.listFiles(new C2120y(this));
                    if (listFiles != null) {
                        for (File delete : listFiles) {
                            delete.delete();
                        }
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
            if (a != null && new File(a.getParentFile().getParent() + File.separator + C1466av.f4700i + File.separator + f9004j).exists()) {
                SharedPreferences sharedPreferences = this.f9021D.getSharedPreferences(Settings.SETTINGS_FILE_NAME, 3);
                C1592bQ.m7158a(sharedPreferences, this.f9021D);
                try {
                    if (!(sharedPreferences.getAll() == null || sharedPreferences.getAll().size() == 0)) {
                        sharedPreferences.edit().clear().commit();
                    }
                } catch (NullPointerException e2) {
                }
                C1592bQ.m7159b();
            }
        }
    }

    /* renamed from: b */
    public void mo7497b() {
        if (this.f9025H && this.f9023F.size() > 0) {
            this.f9024G.postDelayed(new C2158z(this), 50);
        }
    }

    /* renamed from: c */
    public void mo7498c() {
        if (this.f9025H) {
            C1368X.m6320c().mo5835h().fireImportUserDataOperation();
            C1368X.m6320c().mo5835h().processEvent();
        }
    }

    /* renamed from: f */
    private void m9664f() {
        this.f9022E = new Hashtable<>();
        this.f9022E.put(f9007m, f9013s);
        this.f9022E.put(f9008n, f9014t);
        this.f9022E.put(f9009o, f9015u);
        this.f9022E.put(f9010p, f9013s);
        this.f9022E.put(f9011q, f9014t);
        this.f9022E.put(f9012r, f9015u);
    }

    /* renamed from: d */
    public boolean mo7499d() {
        return this.f9023F.size() > 0;
    }

    /* renamed from: g */
    private void m9665g() {
        File[] listFiles;
        File[] listFiles2;
        this.f9023F = new Hashtable<>();
        if (this.f9025H) {
            C1335A a = new C1335A(this);
            File a2 = C1466av.m6848a(this.f9021D);
            if (!(a2 == null || (listFiles2 = a2.listFiles(a)) == null)) {
                for (File file : listFiles2) {
                    this.f9023F.put(file.getName(), file);
                }
            }
            File b = C1358O.m6239b();
            if (b != null && (listFiles = b.listFiles(a)) != null) {
                for (File file2 : listFiles) {
                    this.f9023F.put(file2.getName(), file2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m9661a(String str) {
        return this.f9022E.containsKey(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m9663b(String str) {
        return !C1460o.m6798a(str) && !m9661a(str);
    }

    /* renamed from: e */
    public boolean mo7500e() {
        return C1592bQ.f5037l;
    }

    /* renamed from: a */
    public static int m9657a(int i) {
        int i2 = 700;
        int i3 = C1368X.m6313b().getResources().getDisplayMetrics().heightPixels;
        if (i3 <= 1800) {
            if (i3 > 1200) {
                i2 = 400;
            } else if (i3 > 1000) {
                i2 = 416;
            } else if (i3 > 900) {
                i2 = Settings.RECOMMEND_VERSION_CODE;
            } else if (i3 > 700) {
                i2 = Settings.HAS_SHOWN_GUIDE_INTRO_VIEW;
            } else if (i3 > 450) {
                i2 = Settings.FIRST_INSTALL_TIME;
            } else if (i3 > 300) {
                i2 = Settings.CURVE_ENABLED_UI;
            } else {
                i2 = 0;
            }
        }
        switch (i) {
            case 0:
                return (int) (((double) i2) * f8993B);
            case 2:
                return (int) (((double) i2) * f8994C);
            default:
                return i2;
        }
    }

    /* renamed from: a */
    private boolean m9659a(Context context) {
        if ("com.cootek.smartinputv5".equals(context.getPackageName())) {
            return true;
        }
        return false;
    }
}
