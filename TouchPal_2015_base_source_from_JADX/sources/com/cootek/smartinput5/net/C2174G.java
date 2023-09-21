package com.cootek.smartinput5.net;

import android.location.Address;
import android.os.Handler;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.C1960r;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p053c.C1632c;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2171E;
import com.cootek.smartinput5.net.C2366t;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.net.G */
/* compiled from: LBSManager */
public class C2174G {

    /* renamed from: A */
    public static final int f9169A = 22;

    /* renamed from: B */
    public static final int f9170B = 23;

    /* renamed from: C */
    public static final int f9171C = 23;

    /* renamed from: D */
    public static String[] f9172D = {"beijing", "shanghai", "guangzhou", "shenzhen", "dalian", "chengdu", "chongqing", "nanjing", "changsha", "shenyang", "fuzhou", "haerbin", "hangzhou", "jinan", "jiuzhai", "ningbo", "qingdao", "suzhou", "tianjin", "wuhan", "wuxi", "MO", "HK", "guangdong"};

    /* renamed from: E */
    public static int[] f9173E = {R.string.LOCALITY_BEIJING, R.string.LOCALITY_SHANGHAI, R.string.LOCALITY_GUANGZHOU, R.string.LOCALITY_SHENZHEN, R.string.LOCALITY_DALIAN, R.string.LOCALITY_CHENGDU, R.string.LOCALITY_CHONGQING, R.string.LOCALITY_NANJING, R.string.LOCALITY_CHANGSHA, R.string.LOCALITY_SHENYANG, R.string.LOCALITY_FUZHOU, R.string.LOCALITY_HAERBIN, R.string.LOCALITY_HANGZHOU, R.string.LOCALITY_JINAN, R.string.LOCALITY_JIUZHAI, R.string.LOCALITY_NINGBO, R.string.LOCALITY_QINGDAO, R.string.LOCALITY_SUZHOU, R.string.LOCALITY_TIANJIN, R.string.LOCALITY_WUHAN, R.string.LOCALITY_WUXI, R.string.LOCALITY_MACAO, R.string.LOCALITY_HONGKONG, R.string.LOCALITY_GUANGDONG};

    /* renamed from: F */
    public static int[][] f9174F = {new int[]{1}, new int[]{0, 10}, new int[]{2, 11}, new int[]{3, 11}, new int[]{4}, new int[]{5}, new int[]{6}, new int[]{7}, new int[]{8}, new int[]{9}, new int[]{12}, new int[]{13}, new int[]{14}, new int[]{15}, new int[]{16}, new int[]{17}, new int[]{18}, new int[]{19}, new int[]{20}, new int[]{21}, new int[]{22}, new int[]{11}, new int[]{11}, new int[]{11}};

    /* renamed from: G */
    public static int[] f9175G = {R.string.LBS_BEIJING, R.string.LBS_SHANGHAI, R.string.LBS_GUANGZHOU, R.string.LBS_SHENZHEN, R.string.LBS_DALIAN, R.string.LBS_CHENGDU, R.string.LBS_CHONGQING, R.string.LBS_NANJING, R.string.LBS_CHANGSHA, R.string.LBS_SHENYANG, R.string.LBS_FUZHOU, R.string.LBS_HAERBIN, R.string.LBS_HANGZHOU, R.string.LBS_JINAN, R.string.LBS_JIUZHAI, R.string.LBS_NINGBO, R.string.LBS_QINGDAO, R.string.LBS_SUZHOU, R.string.LBS_TIANJIN, R.string.LBS_WUHAN, R.string.LBS_WUXI, R.string.LBS_MACAO, R.string.LBS_HONGKONG, R.string.LBS_GUANGDONG};

    /* renamed from: H */
    private static C2174G f9176H = new C2174G();

    /* renamed from: I */
    private static final String f9177I = " ";

    /* renamed from: J */
    private static final String f9178J = "#";

    /* renamed from: O */
    private static final int f9179O = 5;

    /* renamed from: P */
    private static final long f9180P = 3600000;

    /* renamed from: a */
    public static String f9181a = "LBSManager";

    /* renamed from: e */
    public static final int f9182e = 0;

    /* renamed from: f */
    public static final int f9183f = 1;

    /* renamed from: g */
    public static final int f9184g = 2;

    /* renamed from: h */
    public static final int f9185h = 3;

    /* renamed from: i */
    public static final int f9186i = 4;

    /* renamed from: j */
    public static final int f9187j = 5;

    /* renamed from: k */
    public static final int f9188k = 6;

    /* renamed from: l */
    public static final int f9189l = 7;

    /* renamed from: m */
    public static final int f9190m = 8;

    /* renamed from: n */
    public static final int f9191n = 9;

    /* renamed from: o */
    public static final int f9192o = 10;

    /* renamed from: p */
    public static final int f9193p = 11;

    /* renamed from: q */
    public static final int f9194q = 12;

    /* renamed from: r */
    public static final int f9195r = 13;

    /* renamed from: s */
    public static final int f9196s = 14;

    /* renamed from: t */
    public static final int f9197t = 15;

    /* renamed from: u */
    public static final int f9198u = 16;

    /* renamed from: v */
    public static final int f9199v = 17;

    /* renamed from: w */
    public static final int f9200w = 18;

    /* renamed from: x */
    public static final int f9201x = 19;

    /* renamed from: y */
    public static final int f9202y = 20;

    /* renamed from: z */
    public static final int f9203z = 21;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C2366t f9204K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C2171E f9205L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Handler f9206M = new Handler();

    /* renamed from: N */
    private int f9207N;

    /* renamed from: Q */
    private Runnable f9208Q = new C2176H(this);

    /* renamed from: R */
    private long f9209R = 14400000;

    /* renamed from: S */
    private long f9210S = 0;

    /* renamed from: T */
    private boolean f9211T = false;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C2175a f9212U = null;

    /* renamed from: b */
    C2171E.C2172a f9213b = new C2177I(this);

    /* renamed from: c */
    C2366t.C2369c f9214c = new C2178J(this);

    /* renamed from: d */
    C2366t.C2368b f9215d = new C2179K(this);

    /* renamed from: com.cootek.smartinput5.net.G$a */
    /* compiled from: LBSManager */
    public interface C2175a {
        /* renamed from: a */
        void mo7633a();

        /* renamed from: a */
        void mo7634a(Address address);
    }

    /* renamed from: a */
    static /* synthetic */ int m9760a(C2174G g) {
        int i = g.f9207N;
        g.f9207N = i + 1;
        return i;
    }

    private C2174G() {
        if (C1368X.m6324d()) {
            this.f9204K = new C2366t(C1368X.m6313b(), Locale.ENGLISH);
            this.f9205L = new C2171E();
        }
    }

    /* renamed from: a */
    public static C2174G m9763a() {
        return f9176H;
    }

    /* renamed from: a */
    public void mo7625a(boolean z) {
        this.f9211T = z;
        this.f9207N = 0;
        if (this.f9211T || System.currentTimeMillis() - this.f9210S >= this.f9209R) {
            mo7628c();
            this.f9206M.post(this.f9208Q);
            this.f9210S = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public void mo7626b() {
        if (!C1368X.m6324d() || C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.LBS_DETECT, (Boolean) true).booleanValue()) {
            mo7625a(false);
        }
    }

    /* renamed from: c */
    public void mo7628c() {
        this.f9206M.removeCallbacks(this.f9208Q);
    }

    /* renamed from: d */
    public boolean mo7629d() {
        if (!m9767c(C1549b.f4831b)) {
            return false;
        }
        this.f9204K.mo8041b(this.f9214c);
        this.f9204K.mo8034a(this.f9214c);
        if (!C1593bR.m7162a().f5077c && this.f9204K.mo8036a() && this.f9204K.mo8044e()) {
            this.f9204K.mo8039b();
            return true;
        } else if (C2188Q.m9853a().mo7686f()) {
            this.f9205L.mo7620a(this.f9213b);
            return false;
        } else if (C1593bR.m7162a().f5077c) {
            return false;
        } else {
            this.f9204K.mo8043d();
            return false;
        }
    }

    /* renamed from: c */
    private boolean m9767c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C1389aD o = C1368X.m6320c().mo5842o();
        if (!o.mo5958n(str)) {
            return false;
        }
        if (!o.mo5954l(str).mo6155e()) {
            return true;
        }
        if (!o.mo5958n(str) || !o.mo5954l(str).mo6157g()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo7624a(C2175a aVar) {
        this.f9212U = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Address m9761a(Address address) {
        if (address == null || !C1368X.m6324d()) {
            return null;
        }
        String locality = address.getLocality();
        String countryCode = address.getCountryCode();
        if (TextUtils.isEmpty(countryCode)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (countryCode.equalsIgnoreCase("MO") || countryCode.equalsIgnoreCase("HK")) {
            arrayList.add(11);
            locality = countryCode;
        } else if (!countryCode.equalsIgnoreCase("CN") || TextUtils.isEmpty(locality)) {
            locality = "";
        } else {
            if (locality.equalsIgnoreCase(f9172D[1]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[1]))) {
                arrayList.add(0);
                arrayList.add(10);
            } else if (locality.equalsIgnoreCase(f9172D[0]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[0]))) {
                arrayList.add(1);
            } else if (locality.equalsIgnoreCase(f9172D[2]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[2]))) {
                arrayList.add(2);
            } else if (locality.equalsIgnoreCase(f9172D[3]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[3]))) {
                arrayList.add(3);
            } else if (locality.equalsIgnoreCase(f9172D[4]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[4]))) {
                arrayList.add(4);
            } else if (locality.equalsIgnoreCase(f9172D[5]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[5]))) {
                arrayList.add(5);
            } else if (locality.equalsIgnoreCase(f9172D[6]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[6]))) {
                arrayList.add(6);
            } else if (locality.equalsIgnoreCase(f9172D[7]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[7]))) {
                arrayList.add(7);
            } else if (locality.equalsIgnoreCase(f9172D[8]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[8]))) {
                arrayList.add(8);
            } else if (locality.equalsIgnoreCase(f9172D[9]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[9]))) {
                arrayList.add(9);
            } else if (locality.equalsIgnoreCase(f9172D[10]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[10]))) {
                arrayList.add(12);
            } else if (locality.equalsIgnoreCase(f9172D[11]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[11]))) {
                arrayList.add(13);
            } else if (locality.equalsIgnoreCase(f9172D[12]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[12]))) {
                arrayList.add(14);
            } else if (locality.equalsIgnoreCase(f9172D[13]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[13]))) {
                arrayList.add(15);
            } else if (locality.equalsIgnoreCase(f9172D[14]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[14]))) {
                arrayList.add(16);
            } else if (locality.equalsIgnoreCase(f9172D[15]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[15]))) {
                arrayList.add(17);
            } else if (locality.equalsIgnoreCase(f9172D[16]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[16]))) {
                arrayList.add(18);
            } else if (locality.equalsIgnoreCase(f9172D[17]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[17]))) {
                arrayList.add(19);
            } else if (locality.equalsIgnoreCase(f9172D[18]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[18]))) {
                arrayList.add(20);
            } else if (locality.equalsIgnoreCase(f9172D[19]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[19]))) {
                arrayList.add(21);
            } else if (locality.equalsIgnoreCase(f9172D[20]) || locality.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[20]))) {
                arrayList.add(22);
            }
            if (arrayList.isEmpty()) {
                locality = "";
            }
            if ((address.getAdminArea() != null && address.getAdminArea().equalsIgnoreCase(f9172D[23])) || address.getAdminArea().equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[23]))) {
                arrayList.add(11);
                if (arrayList.isEmpty()) {
                    locality = address.getAdminArea();
                }
            }
        }
        if (this.f9211T || arrayList.isEmpty() || m9764a(locality, mo7630e())) {
            return address;
        }
        boolean b = mo7627b(locality);
        C1632c v = C1368X.m6320c().mo5849v();
        if (!b || !v.mo6425d()) {
            return address;
        }
        v.mo6416a(v.mo6414a().mo6410f());
        return address;
    }

    /* renamed from: d */
    private boolean m9769d(String str) {
        if (!C1368X.m6324d()) {
            return false;
        }
        C1960r r = C1368X.m6320c().mo5845r();
        if (r.mo7209l(str) || r.mo7198d(str) == null || m9772f(str)) {
            return false;
        }
        return m9773g(str);
    }

    /* renamed from: e */
    public String mo7630e() {
        String[] split;
        String stringSetting = Settings.getInstance().getStringSetting(97);
        if (TextUtils.isEmpty(stringSetting) || (split = stringSetting.split(f9178J)) == null || split.length == 0) {
            return "";
        }
        return split[0];
    }

    /* renamed from: f */
    public ArrayList<String> mo7631f() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int a : f9175G) {
            arrayList.add(C1974m.m9063a(C1368X.m6313b(), a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public int mo7623a(String str) {
        int e = m9770e(str);
        if (e == -1) {
            return -1;
        }
        return f9175G[e];
    }

    /* renamed from: e */
    private int m9770e(String str) {
        int i = 0;
        while (i <= 23) {
            if (str.equalsIgnoreCase(f9172D[i]) || str.equalsIgnoreCase(C1974m.m9063a(C1368X.m6313b(), f9173E[i]))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m9764a(String str, String str2) {
        int e = m9770e(str);
        int e2 = m9770e(str2);
        if (e == -1 || e2 == -1 || e != e2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo7627b(String str) {
        boolean z = false;
        Settings.getInstance().setStringSetting(97, str + f9178J);
        C1368X.m6320c().mo5845r().mo7199d();
        int e = m9770e(str);
        if (e != -1) {
            int[] iArr = f9174F[e];
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                i++;
                z = m9769d(C1368X.m6320c().mo5845r().mo7193a(iArr[i]));
            }
        }
        return z;
    }

    /* renamed from: g */
    public String[] mo7632g() {
        String str;
        String stringSetting = Settings.getInstance().getStringSetting(97);
        if (TextUtils.isEmpty(stringSetting)) {
            return null;
        }
        String[] split = stringSetting.split(f9178J);
        if (split == null || split.length != 2) {
            str = "";
        } else {
            str = split[1];
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(" ");
    }

    /* renamed from: f */
    private boolean m9772f(String str) {
        String[] g;
        if (TextUtils.isEmpty(str) || (g = mo7632g()) == null) {
            return false;
        }
        for (String equals : g) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m9773g(String str) {
        if (!Settings.isInitialized() || TextUtils.isEmpty(str)) {
            return false;
        }
        String stringSetting = Settings.getInstance().getStringSetting(97);
        if (TextUtils.isEmpty(stringSetting)) {
            stringSetting = "";
        }
        String[] split = stringSetting.split(f9178J);
        if (split == null || split.length != 2) {
            Settings.getInstance().setStringSetting(97, stringSetting + str);
        } else {
            Settings.getInstance().setStringSetting(97, stringSetting + " " + str);
        }
        return true;
    }
}
