package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p048d.C1246d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.bD */
/* compiled from: UserDictManager */
public class C1579bD {

    /* renamed from: a */
    public static final int f4979a = 0;

    /* renamed from: b */
    public static final int f4980b = 1;

    /* renamed from: c */
    public static final int f4981c = 2;

    /* renamed from: d */
    public static final int f4982d = 0;

    /* renamed from: e */
    public static final int f4983e = 1;

    /* renamed from: f */
    public static final int f4984f = 2;

    /* renamed from: g */
    public static final String f4985g = "DiagnoseReport";

    /* renamed from: h */
    public static final String f4986h = "CheckImageReport";

    /* renamed from: i */
    public static final String f4987i = ".usr";

    /* renamed from: j */
    private static final String f4988j = "UserDictManager";

    /* renamed from: k */
    private static final String[] f4989k = {"western.usr", "chinese_simplified.usr", "chinese_traditional.usr"};

    /* renamed from: l */
    private static final int[] f4990l = {0, 1, 3};

    /* renamed from: m */
    private static final String f4991m = "IMAGE_OPERATION_CHECK_IMAGE";

    /* renamed from: n */
    private static final String f4992n = "IMAGE_OPERATION_BACKUP";

    /* renamed from: o */
    private static final String f4993o = " ";

    /* renamed from: t */
    private static Map<String, Integer> f4994t;

    /* renamed from: u */
    private static Integer f4995u = null;

    /* renamed from: v */
    private static String f4996v = null;

    /* renamed from: p */
    private Context f4997p;

    /* renamed from: q */
    private boolean f4998q = false;

    /* renamed from: r */
    private boolean f4999r = false;

    /* renamed from: s */
    private CopyOnWriteArrayList<String> f5000s = new CopyOnWriteArrayList<>();

    static {
        m7095a();
    }

    public C1579bD(Context context) {
        this.f4997p = context;
    }

    /* renamed from: a */
    public static void m7095a() {
        f4994t = new HashMap();
        for (int i = 0; i < f4990l.length; i++) {
            f4994t.put(f4989k[i], Integer.valueOf(f4990l[i]));
        }
    }

    /* renamed from: a */
    public static int m7094a(String str) {
        if (f4994t.containsKey(str)) {
            return f4994t.get(str).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public void mo6213b(String str) {
        this.f4999r = true;
        m7104g(str);
    }

    /* renamed from: b */
    public void mo6212b() {
        if (f4995u != null && (f4995u.intValue() == 0 || f4995u.intValue() == 1)) {
            mo6215e();
            if (this.f4999r) {
                if (f4995u.intValue() == 1) {
                    Iterator<String> it = this.f5000s.iterator();
                    while (it.hasNext()) {
                        C1466av.m6853c(this.f4997p, it.next());
                    }
                }
                if (f4995u.intValue() == 0 || Settings.getInstance().getBoolSetting(Settings.USER_DICT_CHECK_STRICT_MODE)) {
                    Iterator<String> it2 = this.f5000s.iterator();
                    while (it2.hasNext()) {
                        mo6214d(it2.next());
                    }
                }
                if (f4995u.intValue() == 0) {
                    m7098a(f4991m, C1246d.f3804bU);
                }
            }
            if (f4995u.intValue() == 0) {
                C1466av.m6853c(this.f4997p, C1466av.f4703l);
            }
            this.f4998q = true;
        } else if (this.f4998q) {
            Settings.getInstance().setIntSetting(Settings.AUTO_BACKUP_DICTIONARY_TIME, (((int) (System.currentTimeMillis() + ((long) TimeZone.getDefault().getRawOffset()))) / 1000) / 60);
            this.f4998q = false;
        }
        f4995u = null;
        m7109n();
    }

    /* renamed from: a */
    public static void m7096a(Integer num) {
        f4995u = num;
    }

    /* renamed from: c */
    public static Integer m7099c() {
        return f4995u;
    }

    /* renamed from: c */
    public static void m7100c(String str) {
        f4996v = str;
    }

    /* renamed from: d */
    public static String m7101d() {
        return f4996v;
    }

    /* renamed from: a */
    public void mo6210a(int i) {
        mo6215e();
        ArrayList<String> f = mo6216f();
        if (this.f4999r) {
            if (Settings.getInstance().getBoolSetting(Settings.USER_DICT_CHECK_STRICT_MODE)) {
                Iterator<String> it = this.f5000s.iterator();
                while (it.hasNext()) {
                    mo6214d(it.next());
                }
            }
            if (i == 0) {
                m7098a(f4992n, C1246d.f3806bW);
            }
        }
        Iterator<String> it2 = f.iterator();
        while (it2.hasNext()) {
            m7102e(it2.next());
        }
        m7109n();
    }

    /* renamed from: e */
    private void m7102e(String str) {
        C0997e.m5173a(new File(m7108m(), str), new File(m7107l(), str));
    }

    /* renamed from: d */
    public void mo6214d(String str) {
        m7103f(str);
        if (Settings.getInstance().getBoolSetting(Settings.USER_DICT_CHECK_STRICT_MODE)) {
            mo6211a(str, 3, m7094a(str));
            if (this.f4999r) {
                new File(m7108m(), str).delete();
            }
        }
        m7109n();
    }

    /* renamed from: f */
    private void m7103f(String str) {
        File file = new File(m7107l(), str);
        File file2 = new File(m7108m(), str);
        if (file.exists()) {
            C0997e.m5173a(file, file2);
            file.delete();
            return;
        }
        file2.delete();
    }

    /* renamed from: l */
    private File m7107l() {
        return C1358O.m6234a(C1358O.f4190a);
    }

    /* renamed from: m */
    private File m7108m() {
        return C1466av.m6848a(this.f4997p);
    }

    /* renamed from: e */
    public boolean mo6215e() {
        C1466av.m6852b(this.f4997p, C1466av.f4713v);
        boolean a = mo6211a((String) null, -1, -1);
        C1466av.m6853c(this.f4997p, C1466av.f4713v);
        Settings.getInstance().setBoolSetting(Settings.LAST_CHECK_IMAGE_RESULT, a);
        Settings.getInstance().writeBack();
        return a;
    }

    /* renamed from: a */
    public boolean mo6211a(String str, int i, int i2) {
        m7109n();
        System.currentTimeMillis();
        C1368X.m6320c().mo5835h().fireCheckImageOperation(str, i, i2);
        C1368X.m6320c().mo5835h().processEvent();
        return !this.f4999r;
    }

    /* renamed from: g */
    private void m7104g(String str) {
        String[] split;
        if (str != null && (split = str.split(" ")) != null) {
            for (String add : split) {
                this.f5000s.add(add);
            }
        }
    }

    /* renamed from: f */
    public ArrayList<String> mo6216f() {
        boolean z;
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : f4989k) {
            if (!Settings.getInstance().getBoolSetting(Settings.USER_DICT_CHECK_STRICT_MODE)) {
                arrayList.add(str);
            } else {
                boolean z2 = true;
                Iterator<String> it = this.f5000s.iterator();
                while (true) {
                    z = z2;
                    if (!it.hasNext()) {
                        break;
                    } else if (TextUtils.equals(it.next(), str)) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                }
                if (z) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public ArrayList<String> mo6217g() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it = this.f5000s.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: h */
    public boolean mo6218h() {
        return this.f4999r;
    }

    /* renamed from: n */
    private void m7109n() {
        this.f4999r = false;
        this.f5000s.clear();
    }

    /* renamed from: a */
    private void m7098a(String str, String str2) {
        if (C1246d.f3806bW.equals(str2) && !Settings.getInstance().getBoolSetting(Settings.DICT_ERROR_ON_DAILY_BACKUP_OCCURRED)) {
            Settings.getInstance().setBoolSetting(Settings.DICT_ERROR_ON_DAILY_BACKUP_OCCURRED, true, false);
            C1246d.m6010a(this.f4997p).mo4591a(C1246d.f3798bO + str2, C1246d.f3709F, C1246d.f3836c);
        }
        C1246d.m6010a(this.f4997p).mo4591a(C1246d.f3798bO + str2, C1246d.f3707D, C1246d.f3836c);
    }

    /* renamed from: i */
    public static boolean m7105i() {
        return Settings.getInstance().getBoolSetting(Settings.USER_DICT_REPORT_ENABLE);
    }

    /* renamed from: j */
    public static void m7106j() {
        if (C1368X.m6324d()) {
            Context b = C1368X.m6313b();
            Intent intent = new Intent();
            intent.putExtra(UserDictReportActivity.f4237a, f4996v);
            intent.setClass(b, UserDictReportActivity.class);
            intent.setFlags(276824064);
            b.startActivity(intent);
            C1246d.m6010a(b).mo4591a("DICT_RECOVERY/USER_DICT_REPORT", "SHOW", C1246d.f3836c);
            Settings.getInstance().setBoolSetting(Settings.USER_DICT_REPORT_ENABLE, false);
        }
    }

    /* renamed from: k */
    public void mo6219k() {
        File l = m7107l();
        if (l != null && l.exists()) {
            for (String a : f4989k) {
                m7097a(a, l);
            }
        }
    }

    /* renamed from: a */
    private void m7097a(String str, File file) {
        File file2 = new File(file, str);
        if (file2.exists()) {
            C0997e.m5173a(file2, new File(m7108m(), str));
            Settings.getInstance().setBoolSetting(Settings.NEED_CHECK_IMPORTED_DATA, true);
        }
    }
}
