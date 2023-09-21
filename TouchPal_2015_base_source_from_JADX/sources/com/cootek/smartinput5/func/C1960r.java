package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p046b.C1132b;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.cootek.smartinput5.func.r */
/* compiled from: CellDictManager */
public class C1960r implements C1441aq, C2183M.C2184a {

    /* renamed from: A */
    public static final int f6657A = 23;

    /* renamed from: B */
    public static final int f6658B = 24;

    /* renamed from: C */
    public static final int f6659C = 25;

    /* renamed from: D */
    public static final int f6660D = 26;

    /* renamed from: E */
    public static final int f6661E = 27;

    /* renamed from: F */
    public static final int f6662F = 28;

    /* renamed from: G */
    public static final int f6663G = 29;

    /* renamed from: H */
    public static final int f6664H = 30;

    /* renamed from: I */
    public static final int f6665I = 10;

    /* renamed from: J */
    public static final String[] f6666J = {"shanghai_info.tpc", "beijing_info.tpc", "guangzhou_info.tpc", "shenzhen_info.tpc", "dalian_info.tpc", "chengdu_info.tpc", "chongqing_info.tpc", "nanjing_info.tpc", "changsha_info.tpc", "shenyang_info.tpc", "shanghai_dialect.tpc", "cantonese_words.tpc", "fuzhou_info.tpc", "haerbin_info.tpc", "hangzhou_info.tpc", "jinan_info.tpc", "jiuzhai_info.tpc", "ningbo_info.tpc", "qingdao_info.tpc", "suzhou_info.tpc", "tianjin_info.tpc", "wuhan_info.tpc", "wuxi_info.tpc", "car.tpc", "cosmetics.tpc", "stock_name.tpc", "en_computer.tpc", "en_finance.tpc", "en_legal.tpc", "en_medic.tpc"};

    /* renamed from: K */
    private static final String f6667K = "id";

    /* renamed from: L */
    private static final String f6668L = "name";

    /* renamed from: M */
    private static final String f6669M = "appId";

    /* renamed from: N */
    private static final String f6670N = "name_locale";

    /* renamed from: O */
    private static final String f6671O = "version";

    /* renamed from: P */
    private static final String f6672P = "compatible";

    /* renamed from: Q */
    private static final String f6673Q = "language";

    /* renamed from: R */
    private static final String f6674R = "from_server";

    /* renamed from: S */
    private static final String f6675S = " ";

    /* renamed from: T */
    private static final String[] f6676T = {C2065u.f8851g, C2065u.f8852h, C2065u.f8853i, C2065u.f8854j, C2065u.f8855k, C2065u.f8856l, C2065u.f8857m, C2065u.f8858n, C2065u.f8859o, C2065u.f8860p, C2065u.f8861q, C2065u.f8862r, C2065u.f8863s, C2065u.f8864t, C2065u.f8865u};

    /* renamed from: U */
    private static final String[] f6677U = new String[0];

    /* renamed from: a */
    public static final String f6678a = ".tpc";

    /* renamed from: b */
    public static final String f6679b = "cootek.smartinput.android.celldict.";

    /* renamed from: c */
    public static final String f6680c = ":";

    /* renamed from: d */
    public static final int f6681d = 0;

    /* renamed from: e */
    public static final int f6682e = 1;

    /* renamed from: f */
    public static final int f6683f = 2;

    /* renamed from: g */
    public static final int f6684g = 3;

    /* renamed from: h */
    public static final int f6685h = 4;

    /* renamed from: i */
    public static final int f6686i = 5;

    /* renamed from: j */
    public static final int f6687j = 6;

    /* renamed from: k */
    public static final int f6688k = 7;

    /* renamed from: l */
    public static final int f6689l = 8;

    /* renamed from: m */
    public static final int f6690m = 9;

    /* renamed from: n */
    public static final int f6691n = 10;

    /* renamed from: o */
    public static final int f6692o = 11;

    /* renamed from: p */
    public static final int f6693p = 12;

    /* renamed from: q */
    public static final int f6694q = 13;

    /* renamed from: r */
    public static final int f6695r = 14;

    /* renamed from: s */
    public static final int f6696s = 15;

    /* renamed from: t */
    public static final int f6697t = 16;

    /* renamed from: u */
    public static final int f6698u = 17;

    /* renamed from: v */
    public static final int f6699v = 18;

    /* renamed from: w */
    public static final int f6700w = 19;

    /* renamed from: x */
    public static final int f6701x = 20;

    /* renamed from: y */
    public static final int f6702y = 21;

    /* renamed from: z */
    public static final int f6703z = 22;

    /* renamed from: V */
    private Context f6704V;

    /* renamed from: W */
    private String f6705W;

    /* renamed from: X */
    private ArrayList<C1961a> f6706X = new ArrayList<>();

    /* renamed from: Y */
    private ArrayList<C2065u> f6707Y;

    /* renamed from: Z */
    private ArrayList<C1810j> f6708Z = null;

    /* renamed from: aa */
    private C2065u[] f6709aa;

    /* renamed from: ab */
    private C2065u[] f6710ab;

    /* renamed from: ac */
    private C2065u[] f6711ac;

    /* renamed from: ad */
    private Map<String, C2065u> f6712ad = new HashMap();

    /* renamed from: ae */
    private Map<String, C2065u> f6713ae;

    /* renamed from: af */
    private Map<String, HashSet<String>> f6714af;

    /* renamed from: ag */
    private Comparator<C2065u> f6715ag;

    /* renamed from: com.cootek.smartinput5.func.r$a */
    /* compiled from: CellDictManager */
    public interface C1961a {
        /* renamed from: r_ */
        void mo7213r_();
    }

    /* renamed from: d */
    public C2065u mo7198d(String str) {
        if (str == null) {
            return null;
        }
        if (this.f6713ae == null) {
            mo7199d();
        }
        return this.f6713ae.get(str);
    }

    /* renamed from: a */
    public String mo7193a(int i) {
        if (i < 0 || i >= 30) {
            return null;
        }
        return mo7204h(f6666J[i]);
    }

    /* renamed from: e */
    public static String m8999e(String str) {
        if (str == null) {
            return null;
        }
        return "cootek.smartinput.android.celldict." + str;
    }

    /* renamed from: f */
    public String mo7201f(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("\\.")) != null) {
            return split[split.length - 1];
        }
        return null;
    }

    /* renamed from: g */
    public String mo7202g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str + f6678a;
    }

    /* renamed from: h */
    public String mo7204h(String str) {
        int lastIndexOf;
        if (str == null || (lastIndexOf = str.lastIndexOf(C1389aD.f4374j)) <= -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: q */
    private C2065u m9003q(String str) {
        return null;
    }

    public C1960r(Context context) {
        this.f6704V = context;
        this.f6705W = C1974m.m9063a(context, (int) R.string.CELLDICT_PACK_TARGET_VERSION);
        C1811k.m8322a().mo6817a((C1441aq) this);
    }

    /* renamed from: r */
    private void m9004r(String str) {
        C2065u uVar;
        C2065u uVar2 = null;
        if (this.f6708Z != null) {
            Iterator<C1810j> it = this.f6708Z.iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (next.f5932a == null || !TextUtils.equals(str, next.f5932a.getPackageName())) {
                    uVar = uVar2;
                } else {
                    uVar = (C2065u) next;
                }
                uVar2 = uVar;
            }
        }
        if (uVar2 != null) {
            mo7195a(uVar2, true);
        }
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        mo7197c();
        m9004r(str);
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        mo7197c();
    }

    /* renamed from: a */
    public void mo5928a() {
        mo7197c();
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return 3;
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        if (file != null) {
            C2361q.m10797b().mo8006b(file);
            C2065u a = mo7192a(file);
            if (a != null) {
                File a2 = C1358O.m6234a(C1358O.f4192c);
                if (a2 != null && !a.f8867B) {
                    C0997e.m5173a(file, new File(a2 + File.separator + a.mo7437d()));
                }
                mo7195a(a, true);
                m8995a(3, a);
                mo7197c();
            }
        }
    }

    /* renamed from: a */
    public void mo7194a(C1961a aVar) {
        this.f6706X.add(aVar);
    }

    /* renamed from: b */
    public void mo7196b(C1961a aVar) {
        this.f6706X.remove(aVar);
    }

    /* renamed from: c */
    public void mo7197c() {
        mo7200e();
        Iterator<C1961a> it = this.f6706X.iterator();
        while (it.hasNext()) {
            it.next().mo7213r_();
        }
        m9000k();
    }

    /* renamed from: s */
    private boolean m9005s(String str) {
        if (str == null) {
            return false;
        }
        return C1132b.m5654a(this.f6704V).mo4395a(str, Boolean.valueOf(this.f6704V.getResources().getBoolean(R.bool.cell_list_enabled_default))).booleanValue();
    }

    /* renamed from: d */
    public void mo7199d() {
        File[] fileArr;
        boolean z;
        boolean z2;
        File[] listFiles;
        this.f6715ag = new C1978s(this);
        C2064t tVar = new C2064t(this);
        ArrayList arrayList = new ArrayList();
        File a = C1466av.m6848a(this.f6704V);
        if (a != null) {
            fileArr = a.listFiles(tVar);
        } else {
            fileArr = null;
        }
        File a2 = C1358O.m6234a(C1358O.f4192c);
        if (!(a2 == null || (listFiles = a2.listFiles(tVar)) == null)) {
            for (File add : listFiles) {
                arrayList.add(add);
            }
        }
        if (fileArr != null) {
            for (File file : fileArr) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((File) it.next()).getName().equals(file.getName())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    arrayList.add(file);
                }
            }
        }
        this.f6707Y = new ArrayList<>();
        this.f6713ae = new HashMap();
        this.f6712ad = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2065u a3 = mo7192a((File) it2.next());
            boolean b = C1368X.m6320c().mo5840m().mo6066b();
            if (a3 != null) {
                z = C1368X.m6320c().mo5840m().mo6063a(a3.f8870v);
            } else {
                z = true;
            }
            if ((!b || z) && a3 != null) {
                if (m9005s(a3.f8870v) || a3.f8867B) {
                    this.f6707Y.add(a3);
                    if (a3.f8866A) {
                        arrayList2.add(a3);
                    } else {
                        arrayList3.add(a3);
                    }
                    this.f6713ae.put(a3.f8870v, a3);
                }
            }
        }
        this.f6708Z = C1811k.m8322a().mo6813a(3, (String) null);
        ArrayList arrayList4 = new ArrayList();
        Iterator<C1810j> it3 = this.f6708Z.iterator();
        while (it3.hasNext()) {
            C1810j next = it3.next();
            C2065u uVar = (C2065u) next;
            if (m9005s(uVar.f8870v) || uVar.f8867B) {
                if (!this.f6713ae.containsKey(m9002m(uVar.f8870v))) {
                    this.f6713ae.put(uVar.f8870v, uVar);
                    if (uVar.f8869D) {
                        arrayList2.add(uVar);
                    }
                }
            } else {
                arrayList4.add(next);
            }
        }
        this.f6708Z.removeAll(arrayList4);
        this.f6709aa = (C2065u[]) this.f6708Z.toArray(new C2065u[this.f6708Z.size()]);
        for (String str : f6677U) {
            if (!m9006t(str)) {
                C2065u q = m9003q(str);
                this.f6707Y.add(q);
                arrayList2.add(q);
                this.f6713ae.put(str, q);
            }
        }
        this.f6710ab = (C2065u[]) arrayList2.toArray(new C2065u[arrayList2.size()]);
        this.f6711ac = (C2065u[]) arrayList3.toArray(new C2065u[arrayList3.size()]);
        Arrays.sort(this.f6710ab, this.f6715ag);
        Arrays.sort(this.f6711ac, this.f6715ag);
        m9001l();
    }

    /* renamed from: e */
    public void mo7200e() {
        if (this.f6707Y != null) {
            this.f6707Y.clear();
            this.f6707Y = null;
        }
        if (this.f6713ae != null) {
            this.f6713ae.clear();
            this.f6713ae = null;
        }
        if (this.f6714af != null) {
            this.f6714af.clear();
            this.f6714af = null;
        }
        if (this.f6708Z != null) {
            this.f6708Z.clear();
            this.f6708Z = null;
        }
        this.f6710ab = null;
        this.f6711ac = null;
        this.f6709aa = null;
    }

    /* renamed from: g */
    public C2065u[] mo7203g() {
        if (this.f6710ab == null) {
            mo7199d();
        }
        return this.f6710ab;
    }

    /* renamed from: h */
    public C2065u[] mo7205h() {
        if (this.f6711ac == null) {
            mo7199d();
        }
        return this.f6711ac;
    }

    /* renamed from: i */
    public C2065u[] mo7206i() {
        if (this.f6709aa == null) {
            mo7199d();
        }
        return this.f6709aa;
    }

    /* renamed from: a */
    private void m8996a(String str, String str2) {
        if (this.f6714af.containsKey(str)) {
            this.f6714af.get(str).add(str2);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(str2);
        this.f6714af.put(str, hashSet);
    }

    /* renamed from: b */
    private void m8997b(String str, String str2) {
        if (this.f6714af.containsKey(str)) {
            HashSet hashSet = this.f6714af.get(str);
            hashSet.remove(str2);
            if (hashSet.isEmpty()) {
                this.f6714af.remove(str);
            }
        }
    }

    /* renamed from: a */
    public void mo7195a(C2065u uVar, boolean z) {
        if (uVar != null) {
            String str = uVar.f8872x;
            boolean z2 = uVar.f8867B;
            if (this.f6714af == null) {
                mo7199d();
            }
            String d = uVar.mo7437d();
            File a = C1358O.m6234a(C1358O.f4192c);
            if (z) {
                if (a != null && !z2) {
                    File file = new File(a, d);
                    if (file.exists()) {
                        C0997e.m5173a(file, C1466av.m6849a(this.f6704V, d));
                    }
                }
                m8996a(str, uVar.f8870v);
            } else {
                if (a != null && !z2) {
                    File file2 = new File(a, d);
                    File a2 = C1466av.m6849a(this.f6704V, d);
                    if (!file2.exists()) {
                        C0997e.m5173a(a2, file2);
                    }
                    a2.delete();
                }
                m8997b(str, uVar.f8870v);
            }
            m9000k();
        }
    }

    /* renamed from: k */
    public boolean mo7208k(String str) {
        if (this.f6714af == null) {
            mo7199d();
        }
        for (Map.Entry<String, HashSet<String>> value : this.f6714af.entrySet()) {
            if (((HashSet) value.getValue()).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo7209l(String str) {
        if (str == null) {
            return false;
        }
        if (this.f6707Y == null) {
            mo7199d();
        }
        for (C2065u uVar : this.f6710ab) {
            if (str.equalsIgnoreCase(m9002m(uVar.f8870v))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static String m9002m(String str) {
        if (str == null || !str.contains(":")) {
            return str;
        }
        return str.substring(str.indexOf(":") + 1);
    }

    /* renamed from: t */
    private boolean m9006t(String str) {
        if (str == null) {
            return false;
        }
        if (this.f6707Y == null) {
            mo7199d();
        }
        Iterator<C2065u> it = this.f6707Y.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next().f8870v)) {
                return true;
            }
        }
        for (C2065u uVar : this.f6709aa) {
            if (str.equalsIgnoreCase(uVar.f8870v)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m9000k() {
        if (this.f6714af == null) {
            mo7199d();
        }
        mo7207j();
        for (Map.Entry next : this.f6714af.entrySet()) {
            StringBuilder sb = new StringBuilder();
            String str = (String) next.getKey();
            Iterator it = ((HashSet) next.getValue()).iterator();
            while (it.hasNext()) {
                sb.append(mo7202g((String) it.next()));
                sb.append(" ");
            }
            m8998c(str, sb.toString().trim());
        }
    }

    /* renamed from: l */
    private void m9001l() {
        boolean z;
        this.f6714af = new HashMap();
        this.f6714af.clear();
        for (String str : f6677U) {
            m8996a(this.f6713ae.get(str).f8872x, str);
        }
        boolean boolSetting = Settings.getInstance().getBoolSetting(Settings.UPDATE_LIVE_WORDS);
        for (String str2 : f6676T) {
            for (String str3 : m9007u(str2).split(" ")) {
                if (!TextUtils.isEmpty(str3)) {
                    String h = mo7204h(str3);
                    if (this.f6712ad == null || this.f6712ad.get(h) == null || !this.f6712ad.get(h).f8867B) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (boolSetting || !z) {
                        m8996a(str2, h);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m8998c(String str, String str2) {
        Settings.getInstance().setStringSetting(16, str2, 3, str, (Config) null, true);
    }

    /* renamed from: u */
    private String m9007u(String str) {
        return Settings.getInstance().getStringSetting(16, 3, str, (Config) null);
    }

    /* renamed from: j */
    public void mo7207j() {
        for (String c : f6676T) {
            m8998c(c, "");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0147, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004e A[SYNTHETIC, Splitter:B:33:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0129 A[SYNTHETIC, Splitter:B:67:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0138 A[SYNTHETIC, Splitter:B:74:0x0138] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0146 A[ExcHandler: JSONException (r0v11 'e' org.json.JSONException A[CUSTOM_DECLARE]), Splitter:B:4:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.cootek.smartinput5.func.C2065u mo7192a(java.io.File r12) {
        /*
            r11 = this;
            r5 = 4
            r0 = 0
            r8 = 0
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014c, JSONException -> 0x0120, all -> 0x0134 }
            r9.<init>(r12)     // Catch:{ IOException -> 0x014c, JSONException -> 0x0120, all -> 0x0134 }
            r1 = 4
            byte[] r3 = new byte[r1]     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r9.read(r3)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r1 = r0
            r2 = r0
        L_0x0010:
            if (r0 >= r5) goto L_0x001d
            byte r4 = r3[r0]     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r1
            r2 = r2 | r4
            int r1 = r1 + 8
            int r0 = r0 + 1
            goto L_0x0010
        L_0x001d:
            long r0 = (long) r2     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            long r4 = r12.length()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            if (r9 == 0) goto L_0x002b
            r9.close()     // Catch:{ IOException -> 0x002d }
        L_0x002b:
            r0 = r8
        L_0x002c:
            return r0
        L_0x002d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x002b
        L_0x0032:
            if (r2 > 0) goto L_0x005c
            if (r9 == 0) goto L_0x0039
            r9.close()     // Catch:{ IOException -> 0x0040, JSONException -> 0x0146 }
        L_0x0039:
            if (r9 == 0) goto L_0x003e
            r9.close()     // Catch:{ IOException -> 0x0057 }
        L_0x003e:
            r0 = r8
            goto L_0x002c
        L_0x0040:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            goto L_0x0039
        L_0x0045:
            r0 = move-exception
            r1 = r0
            r0 = r8
            r8 = r9
        L_0x0049:
            r1.printStackTrace()     // Catch:{ all -> 0x0143 }
            if (r8 == 0) goto L_0x002c
            r8.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x002c
        L_0x0052:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002c
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x003e
        L_0x005c:
            byte[] r0 = new byte[r2]     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r9.read(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r2 = "utf-8"
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r0 = "id"
            java.lang.String r1 = r5.getString(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r0 = "name"
            java.lang.String r2 = r5.getString(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r0 = "version"
            java.lang.String r4 = r5.getString(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r0 = "compatible"
            java.lang.String r6 = r5.getString(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r3 = com.cootek.smartinput5.func.C2065u.f8851g     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r0 = "false"
            java.lang.String r7 = "language"
            boolean r7 = r5.has(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r3 = "language"
            java.lang.String r3 = r5.getString(r3)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
        L_0x0097:
            java.lang.String r7 = "from_server"
            boolean r7 = r5.has(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            if (r7 == 0) goto L_0x0155
            java.lang.String r0 = "from_server"
            java.lang.String r0 = r5.getString(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r10 = r0
        L_0x00a6:
            java.lang.String r0 = r12.getName()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r5.<init>()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = r5.append(r1)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r7 = ".tpc"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            boolean r0 = r0.equals(r5)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            if (r0 != 0) goto L_0x00ec
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r5.<init>()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r7 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.StringBuilder r5 = r5.append(r1)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r7 = ".tpc"
            java.lang.StringBuilder r5 = r5.append(r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r12.renameTo(r0)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
        L_0x00ec:
            com.cootek.smartinput5.func.u r0 = new com.cootek.smartinput5.func.u     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r5 = r11.f6705W     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            boolean r6 = r6.equalsIgnoreCase(r5)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r5 = "true"
            boolean r7 = r10.equalsIgnoreCase(r5)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0045, JSONException -> 0x0146 }
            java.lang.String r2 = "true"
            boolean r2 = r10.equalsIgnoreCase(r2)     // Catch:{ IOException -> 0x0151, JSONException -> 0x014a }
            if (r2 == 0) goto L_0x0113
            java.util.Map<java.lang.String, com.cootek.smartinput5.func.u> r2 = r11.f6712ad     // Catch:{ IOException -> 0x0151, JSONException -> 0x014a }
            boolean r2 = r2.containsKey(r1)     // Catch:{ IOException -> 0x0151, JSONException -> 0x014a }
            if (r2 != 0) goto L_0x0113
            java.util.Map<java.lang.String, com.cootek.smartinput5.func.u> r2 = r11.f6712ad     // Catch:{ IOException -> 0x0151, JSONException -> 0x014a }
            r2.put(r1, r0)     // Catch:{ IOException -> 0x0151, JSONException -> 0x014a }
        L_0x0113:
            if (r9 == 0) goto L_0x002c
            r9.close()     // Catch:{ IOException -> 0x011a }
            goto L_0x002c
        L_0x011a:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002c
        L_0x0120:
            r0 = move-exception
            r1 = r0
            r9 = r8
            r0 = r8
        L_0x0124:
            r1.printStackTrace()     // Catch:{ all -> 0x0141 }
            if (r9 == 0) goto L_0x002c
            r9.close()     // Catch:{ IOException -> 0x012e }
            goto L_0x002c
        L_0x012e:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x002c
        L_0x0134:
            r0 = move-exception
            r9 = r8
        L_0x0136:
            if (r9 == 0) goto L_0x013b
            r9.close()     // Catch:{ IOException -> 0x013c }
        L_0x013b:
            throw r0
        L_0x013c:
            r1 = move-exception
            r1.printStackTrace()
            goto L_0x013b
        L_0x0141:
            r0 = move-exception
            goto L_0x0136
        L_0x0143:
            r0 = move-exception
            r9 = r8
            goto L_0x0136
        L_0x0146:
            r0 = move-exception
            r1 = r0
            r0 = r8
            goto L_0x0124
        L_0x014a:
            r1 = move-exception
            goto L_0x0124
        L_0x014c:
            r0 = move-exception
            r1 = r0
            r0 = r8
            goto L_0x0049
        L_0x0151:
            r1 = move-exception
            r8 = r9
            goto L_0x0049
        L_0x0155:
            r10 = r0
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1960r.mo7192a(java.io.File):com.cootek.smartinput5.func.u");
    }

    /* renamed from: n */
    public C1443as mo7210n(String str) {
        if (this.f6708Z == null) {
            mo7199d();
        }
        if (this.f6708Z != null) {
            Iterator<C1810j> it = this.f6708Z.iterator();
            while (it.hasNext()) {
                C1810j next = it.next();
                if (next.mo6810a().equals(str)) {
                    return next.f5932a;
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo7211o(String str) {
        if (str == null) {
            return false;
        }
        for (String equalsIgnoreCase : f6677U) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
    }

    /* renamed from: f */
    public void mo5577f() {
    }

    /* renamed from: c */
    public void mo5573c(String str) {
    }

    /* renamed from: a */
    private void m8995a(int i, C2065u uVar) {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 10);
        bundle.putInt(C1811k.f5998p, i);
        bundle.putString(C1811k.f5999q, uVar.f8870v);
        obtain.setData(bundle);
        C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
    }

    /* renamed from: p */
    public String mo7212p(String str) {
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        if (split != null) {
            boolean b = C1368X.m6320c().mo5840m().mo6066b();
            for (String str2 : split) {
                boolean a = C1368X.m6320c().mo5840m().mo6063a(mo7204h(str2));
                if (!b || a) {
                    sb.append(str2);
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}
