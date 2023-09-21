package com.cootek.smartinput5.func;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.cootek.smartinput.p044a.C0967f;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1422ad;
import com.cootek.smartinput5.func.p052b.C1498a;
import com.cootek.smartinput5.func.p052b.C1511aM;
import com.cootek.smartinput5.func.p052b.C1519aT;
import com.cootek.smartinput5.func.p052b.C1521aV;
import com.cootek.smartinput5.func.p052b.C1522aW;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p052b.C1550c;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2183M;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p066ui.C2917du;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.cootek.smartinput5.func.aD */
/* compiled from: LanguageManager */
public class C1389aD implements C1441aq, C2183M.C2184a {

    /* renamed from: a */
    public static final String f4365a = "en_US";

    /* renamed from: b */
    public static final String f4366b = "zh_CN";

    /* renamed from: c */
    public static final String f4367c = "zh_HK";

    /* renamed from: d */
    public static final String f4368d = "zh_TW";

    /* renamed from: e */
    public static final int f4369e = 4;

    /* renamed from: f */
    public static final String f4370f = ".tpl";

    /* renamed from: g */
    public static final String f4371g = "runtime";

    /* renamed from: h */
    public static final String f4372h = "data.ver";

    /* renamed from: i */
    public static final String f4373i = "language_info";

    /* renamed from: j */
    public static final String f4374j = ".";

    /* renamed from: k */
    public static final int f4375k = 1;

    /* renamed from: n */
    public static boolean f4376n = true;

    /* renamed from: o */
    public static final int f4377o = 0;

    /* renamed from: p */
    public static final int f4378p = 1;

    /* renamed from: q */
    public static final int f4379q = 2;

    /* renamed from: r */
    private static final String f4380r = "LanguageManager";

    /* renamed from: t */
    private static final String f4381t = "tray_";

    /* renamed from: A */
    private ArrayList<String> f4382A;

    /* renamed from: B */
    private ArrayList<C1498a> f4383B;

    /* renamed from: C */
    private boolean f4384C = false;

    /* renamed from: D */
    private boolean f4385D;

    /* renamed from: E */
    private CopyOnWriteArrayList<String> f4386E;

    /* renamed from: F */
    private CopyOnWriteArrayList<String> f4387F;

    /* renamed from: G */
    private C1519aT f4388G;

    /* renamed from: H */
    private ArrayList<C1390a> f4389H = new ArrayList<>();

    /* renamed from: I */
    private Context f4390I;

    /* renamed from: l */
    public HashMap<String, String> f4391l;

    /* renamed from: m */
    public String f4392m;

    /* renamed from: s */
    private String[] f4393s;

    /* renamed from: u */
    private final String f4394u;

    /* renamed from: v */
    private C1498a[] f4395v;

    /* renamed from: w */
    private HashMap<String, Integer> f4396w = new HashMap<>();

    /* renamed from: x */
    private Hashtable<String, Integer> f4397x = new Hashtable<>();

    /* renamed from: y */
    private ArrayList<String> f4398y;

    /* renamed from: z */
    private ArrayList<String> f4399z;

    /* renamed from: com.cootek.smartinput5.func.aD$a */
    /* compiled from: LanguageManager */
    public interface C1390a {
        /* renamed from: f */
        void mo4249f();
    }

    /* renamed from: a */
    public void mo5929a(C1390a aVar) {
        this.f4389H.add(aVar);
    }

    /* renamed from: b */
    public void mo5937b(C1390a aVar) {
        this.f4389H.remove(aVar);
    }

    /* renamed from: c */
    public void mo5938c() {
        this.f4389H.clear();
    }

    public C1389aD(Context context) {
        this.f4390I = context;
        this.f4394u = m6462b((int) R.string.LANGUAGE_UNKNOWN_LANGUAGE_TARGET);
        this.f4385D = m6460ag();
        this.f4398y = new ArrayList<>();
        this.f4399z = new ArrayList<>();
        this.f4382A = new ArrayList<>();
        this.f4383B = new ArrayList<>();
        this.f4386E = new CopyOnWriteArrayList<>();
        this.f4387F = new CopyOnWriteArrayList<>();
        m6437Q();
        this.f4388G = new C1519aT();
        new C1392aE(this).start();
        m6455ab();
        mo5941e();
        m6434O();
        m6439S();
        m6454aa();
        C1811k.m8322a().mo6817a((C1441aq) this);
    }

    /* renamed from: d */
    public void mo5940d(String str) {
        if (!this.f4386E.contains(str)) {
            this.f4386E.add(str);
        }
    }

    /* renamed from: e */
    public boolean mo5942e(String str) {
        Iterator<String> it = this.f4399z.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo5943f(String str) {
        if (!mo5942e(str)) {
            this.f4399z.add(str);
        }
    }

    /* renamed from: g */
    public boolean mo5944g(String str) {
        Iterator<String> it = this.f4398y.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void mo5946h(String str) {
        if (!TextUtils.isEmpty(str) && !mo5944g(str)) {
            this.f4398y.add(str);
            C1368X.m6320c().mo5827M().mo5987a(0, this.f4398y);
        }
    }

    /* renamed from: b */
    private String m6462b(int i) {
        return C1974m.m9063a(this.f4390I, i);
    }

    /* renamed from: O */
    private void m6434O() {
        for (C1498a next : this.f4388G.mo6181b()) {
            if (!TextUtils.isEmpty(next.f4729h)) {
                this.f4398y.add(next.f4729h);
            }
        }
        m6435P();
        C1368X.m6320c().mo5827M().mo5987a(0, this.f4398y);
    }

    /* renamed from: P */
    private void m6435P() {
        Iterator<String> it = C1368X.m6320c().mo5827M().mo5999e(0).iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!mo5944g(next)) {
                this.f4398y.add(next);
            }
        }
    }

    /* renamed from: Q */
    private void m6437Q() {
        C1550c[] e = C1550c.m7002e(this.f4390I);
        this.f4395v = new C1498a[e.length];
        int length = this.f4395v.length;
        for (int i = 0; i < length; i++) {
            C1550c cVar = e[i];
            this.f4395v[i] = new C1498a(this.f4390I, cVar);
            this.f4396w.put(cVar.mo6190a(), Integer.valueOf(i));
        }
    }

    /* renamed from: J */
    private int m6428J(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6146b();
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo5952k(String str) {
        return C1550c.m7000a(this.f4390I, this.f4390I.getResources().getBoolean(R.bool.language_enabled_default), str);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m6438R() {
        String packageName = this.f4390I.getPackageName();
        for (C1550c cVar : C1550c.values()) {
            int identifier = this.f4390I.getResources().getIdentifier(f4381t + cVar.mo6190a(), "drawable", packageName);
            if (identifier != 0) {
                try {
                    this.f4397x.put(cVar.mo6190a(), Integer.valueOf(identifier));
                } catch (NullPointerException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5930a(C1498a aVar) {
        this.f4391l.remove(aVar.f4727f);
    }

    /* renamed from: b */
    private void m6464b(String str, String str2) {
        if (!TextUtils.isEmpty(str2) || !this.f4391l.containsKey(str)) {
            this.f4391l.put(str, str2);
        }
    }

    /* renamed from: K */
    private String m6429K(String str) {
        return this.f4391l.get(str);
    }

    /* renamed from: S */
    private void m6439S() {
        for (C1498a c : this.f4388G.mo6181b()) {
            m6467c(c);
        }
        mo5968s();
    }

    /* renamed from: c */
    private void m6467c(C1498a aVar) {
        if (aVar.f4740s != null && !aVar.f4740s.mo6023b()) {
            m6464b(aVar.f4727f, aVar.f4738q);
        }
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        mo5941e();
        C1498a m = mo5956m(str);
        if (m != null) {
            m6467c(m);
            mo5968s();
            if (!this.f4382A.contains(m.mo6154d())) {
                Settings.getInstance().setStringSetting(Settings.LANGUAGE_JUST_INSTALLED, str);
            }
            Storage.deleteExpiredFiles(this.f4390I, m.f4729h, m.mo6159i(), true);
            if (Engine.isInitialized()) {
                Engine.getInstance().getIms().requestHideSelf(0);
                Settings.getInstance().setBoolSetting(Settings.CONTACT_IMPORTED, false);
                C1368X.m6320c().mo5817C().mo6560b();
            }
            if (C1593bR.m7162a().f5075a && C1405aP.m6594a().mo6014a(C1549b.f4791a, m.f4727f)) {
                String w = mo5975w(C1549b.f4791a);
                if (!this.f4388G.mo6181b().contains(mo5954l(w)) || w.equals("")) {
                    mo5931a(C1549b.f4791a, m.f4727f);
                }
            }
            if (C1549b.f4831b.equals(m.f4727f) || C1549b.f4832c.equals(m.f4727f)) {
                Settings.getInstance().setLanguageEnabled(C1549b.f4831b, true);
                Settings.getInstance().setLanguageEnabled(C1549b.f4832c, true);
            } else {
                Settings.getInstance().setLanguageEnabled(m.f4727f, true);
            }
            C1368X.m6320c().mo5820F().mo7497b();
            C1393aF aFVar = new C1393aF(this, m.f4727f);
            if (!Engine.isInitialized() || !Engine.getInstance().getIms().isInputViewShown()) {
                aFVar.run();
            } else {
                Engine.getInstance().getSurfaceManager().recordRunnable(aFVar);
            }
            m6440T();
        }
    }

    /* renamed from: L */
    private void m6430L(String str) {
        String str2;
        Iterator<String> it = this.f4386E.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            str2 = it.next();
            if (TextUtils.equals(str2, str)) {
                break;
            }
        }
        if (str2 != null) {
            this.f4386E.remove(str2);
            this.f4387F.add(str2);
        }
    }

    /* renamed from: a */
    private void m6450a(String str, boolean z) {
        m6430L(str);
        C1498a m = mo5956m(str);
        if (m != null) {
            Storage.deleteExpiredFiles(this.f4390I, m.f4729h, m.mo6159i(), true);
            mo5930a(m);
            mo5968s();
        }
        m6431M(str);
        mo5941e();
        if (mo5945g().length == 0) {
            Iterator<C1498a> it = this.f4388G.mo6181b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1498a next = it.next();
                if (!next.mo6155e()) {
                    next.mo6151a(true);
                    break;
                }
            }
        }
        C1368X.m6320c().mo5835h().releasePinyinCache();
        m6466b(z);
        if (Engine.isInitialized()) {
            Engine.getInstance().getIms().requestHideSelf(0);
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (!(widgetManager == null || m == null || !m6470y(m.f4727f))) {
                widgetManager.mo9608N();
            }
        }
        m6441U();
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        m6450a(str, true);
    }

    /* renamed from: a */
    public void mo5928a() {
        m6437Q();
        mo5941e();
        m6440T();
    }

    /* renamed from: T */
    private void m6440T() {
        m6466b(true);
    }

    /* renamed from: b */
    private void m6466b(boolean z) {
        C1337C A;
        if (z) {
            Iterator<C1390a> it = this.f4389H.iterator();
            while (it.hasNext()) {
                it.next().mo4249f();
            }
        }
        if (C1368X.m6324d() && (A = C1368X.m6320c().mo5815A()) != null) {
            A.mo5569b();
        }
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return 2;
    }

    /* renamed from: a */
    public void mo5566a(String str, File file) {
        this.f4399z.remove(str);
        PackageInfo packageArchiveInfo = this.f4390I.getPackageManager().getPackageArchiveInfo(file.getPath(), 0);
        if (packageArchiveInfo != null) {
            C1811k.m8322a().mo6818a(packageArchiveInfo.packageName);
        }
        this.f4382A.remove(str);
        ArrayList arrayList = new ArrayList();
        Iterator<C1498a> it = this.f4383B.iterator();
        while (it.hasNext()) {
            C1498a next = it.next();
            if (next.mo6154d().equals(str)) {
                arrayList.add(next);
            }
        }
        this.f4383B.removeAll(arrayList);
        if (this.f4382A.size() == 0) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE, false);
        }
    }

    /* renamed from: U */
    private void m6441U() {
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5835h().fireSettingsChangedOperation(14);
            C1368X.m6320c().mo5835h().processEvent();
        }
    }

    /* renamed from: M */
    private void m6431M(String str) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = C1466av.m6848a(this.f4390I)) != null) {
            ArrayList arrayList = new ArrayList();
            for (C1498a next : this.f4388G.mo6181b()) {
                if (next.mo6157g() && str.equals(next.mo6160j())) {
                    arrayList.add(next.f4727f);
                }
            }
            try {
                for (File delete : a.listFiles(new C1394aG(this, arrayList))) {
                    delete.delete();
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public int mo5939d() {
        return this.f4388G.mo6184c();
    }

    /* renamed from: l */
    public C1498a mo5954l(String str) {
        return this.f4388G.mo6176a(str);
    }

    /* renamed from: a */
    public C1498a mo5927a(int i) {
        return this.f4388G.mo6175a(i);
    }

    /* renamed from: m */
    public C1498a mo5956m(String str) {
        for (C1498a next : this.f4388G.mo6181b()) {
            if (next.f4739r.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m6451a(ArrayList<C1810j> arrayList) {
        Iterator<C1810j> it = arrayList.iterator();
        while (it.hasNext()) {
            C1388aC aCVar = (C1388aC) it.next();
            if (mo5952k(aCVar.f4355d)) {
                C1498a aVar = new C1498a(this.f4390I, aCVar.f4355d, aCVar.f4357f, aCVar.f4356e, "", aCVar.f4359h, aCVar.f4360i, aCVar.f4361j, aCVar.f4358g, aCVar.f4362k, aCVar.f4363l, m6428J(aCVar.f4355d));
                aVar.mo6150a(aCVar.f4364m);
                C1550c a = C1550c.m6998a(aVar.f4727f);
                if (a != null) {
                    aVar.f4728g = a.mo6191a(this.f4390I);
                    aVar.f4729h = a.mo6192b(this.f4390I);
                }
                aVar.f4739r = aCVar.mo6810a();
                aVar.f4740s = aCVar.f5932a;
                aVar.f4738q = aCVar.f5933b;
                if (aVar.mo6155e()) {
                    aVar.f4737p = m6433O(aVar.f4727f).equals(aCVar.f5933b);
                } else {
                    aVar.f4737p = true;
                }
                if (aVar.f4740s != null) {
                    aVar.f4740s.mo6021a(aVar.f4737p);
                }
                if (f4376n) {
                    Storage.deleteExpiredFiles(this.f4390I, aVar.f4729h, aVar.mo6159i(), false);
                }
                C1498a a2 = this.f4388G.mo6176a(aCVar.f4355d);
                if (a2 == null) {
                    m6449a(aCVar.f4355d, aVar);
                } else if (!a2.f4737p || (aVar.f4737p && !aVar.mo6155e())) {
                    this.f4388G.mo6182b(aCVar.f4355d, a2);
                    m6449a(aCVar.f4355d, aVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m6449a(String str, C1498a aVar) {
        boolean z = false;
        if (!C1368X.m6320c().mo5840m().mo6066b() || C1368X.m6320c().mo5840m().mo6064a(str, C1422ad.C1426c.TYPE_LANGUAGE, 0)) {
            z = true;
        }
        if (z) {
            this.f4388G.mo6179a(aVar.f4727f, aVar);
        }
    }

    /* renamed from: e */
    public void mo5941e() {
        ArrayList<C1810j> a = C1811k.m8322a().mo6813a(2, (String) null);
        ArrayList<C1810j> a2 = C1811k.m8322a().mo6813a(5, (String) null);
        this.f4388G.mo6177a();
        m6451a(a);
        m6451a(a2);
        m6443W();
        this.f4388G.mo6180a(this.f4396w);
        this.f4388G.mo6178a(this.f4390I, this.f4395v);
        m6442V();
        m6459af();
        f4376n = false;
        a.clear();
        a2.clear();
    }

    /* renamed from: V */
    private void m6442V() {
        StringBuffer stringBuffer = new StringBuffer();
        for (C1498a next : this.f4388G.mo6181b()) {
            if (next.mo6157g()) {
                stringBuffer.append(next.f4727f);
                stringBuffer.append(f4374j);
            }
        }
        C1060e.m5598b().mo4274a(C1060e.f3013d, (Object) stringBuffer.toString());
    }

    /* renamed from: W */
    private void m6443W() {
        boolean z;
        if (!C1593bR.m7162a().f5078d) {
            boolean z2 = true;
            C1498a[] aVarArr = this.f4395v;
            int length = aVarArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                C1498a aVar = aVarArr[i2];
                String K = m6429K(aVar.f4727f);
                if (!TextUtils.isEmpty(K)) {
                    C1498a aVar2 = new C1498a(this.f4390I, aVar.f4727f, aVar.f4728g, aVar.f4729h, "", false, false, aVar.f4731j, aVar.f4732k, aVar.f4733l, aVar.f4735n, m6428J(aVar.f4727f));
                    aVar2.f4737p = TextUtils.equals(K, aVar.f4738q);
                    aVar2.f4740s = C1811k.m8322a().mo6824c((String) null);
                    aVar2.f4739r = aVar2.f4740s.getPackageName();
                    boolean z3 = true;
                    if (this.f4388G.mo6176a(aVar2.f4727f) == null && (C1549b.f4835f.equals(aVar2.f4727f) || !m6470y(aVar2.f4727f))) {
                        C1017y.m5228d(f4380r, "queryExternalLanguages: " + aVar2.f4727f);
                        this.f4388G.mo6179a(aVar2.f4727f, aVar2);
                        if (!C1549b.f4835f.equals(aVar2.f4727f)) {
                            z3 = false;
                            z = false;
                            Settings.getInstance().setBoolSetting(Settings.DICTIONARY_COMPLETE, z3, 18, aVar2.f4727f, (Config) null, false);
                            z2 = z;
                        } else {
                            aVar2.f4737p = true;
                        }
                    }
                    z = z2;
                    Settings.getInstance().setBoolSetting(Settings.DICTIONARY_COMPLETE, z3, 18, aVar2.f4727f, (Config) null, false);
                    z2 = z;
                }
                i = i2 + 1;
            }
            if (z2) {
                Engine.setPreciseMode(false);
            }
        }
    }

    /* renamed from: n */
    public boolean mo5958n(String str) {
        return this.f4388G.mo6183b(str);
    }

    /* renamed from: g */
    public String[] mo5945g() {
        ArrayList arrayList = new ArrayList();
        for (C1498a next : this.f4388G.mo6181b()) {
            if (next.mo6158h() && next.mo6156f()) {
                arrayList.add(next.f4727f);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: X */
    private boolean m6444X() {
        return this.f4386E.size() != 0;
    }

    /* renamed from: Y */
    private ArrayList<C1810j> m6445Y() {
        ArrayList<C1810j> a = C1811k.m8322a().mo6813a(2, (String) null);
        ArrayList<C1810j> a2 = C1811k.m8322a().mo6813a(5, (String) null);
        ArrayList<C1810j> arrayList = new ArrayList<>();
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    /* renamed from: Z */
    private void m6446Z() {
        boolean z;
        if (m6444X()) {
            ArrayList<C1810j> Y = m6445Y();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) this.f4386E.clone()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Iterator<C1810j> it2 = Y.iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    if (TextUtils.equals(it2.next().f5932a.getPackageName(), str)) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    z2 = z;
                }
                if (!z2) {
                    arrayList.add(str);
                } else {
                    Iterator<String> it3 = this.f4386E.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        if (next.equals(str)) {
                            this.f4386E.remove(next);
                        }
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                m6450a((String) it4.next(), false);
            }
        }
    }

    /* renamed from: h */
    public String[] mo5947h() {
        String[] strArr = new String[this.f4388G.mo6184c()];
        int i = 0;
        Iterator<C1498a> it = this.f4388G.mo6181b().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return strArr;
            }
            C1498a next = it.next();
            if (next.mo6157g()) {
                strArr[i2] = next.f4727f;
                i = i2 + 1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: i */
    public String[] mo5949i() {
        int enabledLanguageCount = C1368X.m6320c().mo5835h().getEnabledLanguageCount();
        if (enabledLanguageCount == 0) {
            return null;
        }
        String[] strArr = new String[enabledLanguageCount];
        int i = 0;
        Iterator<C1498a> it = this.f4388G.mo6181b().iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return strArr;
            }
            C1498a next = it.next();
            if (m6432N(next.f4727f)) {
                strArr[i2] = next.f4727f;
                i = i2 + 1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: j */
    public HashSet<String> mo5950j() {
        HashSet<String> hashSet = new HashSet<>();
        for (String languageCategory : mo5947h()) {
            String languageCategory2 = C1368X.m6320c().mo5835h().getLanguageCategory(languageCategory, 10);
            if (!TextUtils.isEmpty(languageCategory2)) {
                hashSet.add(languageCategory2);
            }
        }
        return hashSet;
    }

    /* renamed from: o */
    public boolean mo5960o(String str) {
        C1498a a = this.f4388G.mo6176a(str);
        if (a != null) {
            return a.mo6157g();
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo5962p(String str) {
        C1498a a = this.f4388G.mo6176a(str);
        if (a != null) {
            return a.mo6156f();
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5934a(String[] strArr) {
        for (String o : strArr) {
            if (mo5960o(o)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N */
    private boolean m6432N(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int enabledLanguageCount = C1368X.m6320c().mo5835h().getEnabledLanguageCount();
        for (int i = 0; i < enabledLanguageCount; i++) {
            if (str.equals(C1368X.m6320c().mo5835h().getEnabledLanguageId(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public C1498a[] mo5953k() {
        return this.f4395v;
    }

    /* renamed from: O */
    private String m6433O(String str) {
        String str2 = null;
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            str2 = a.mo6194d(this.f4390I);
        }
        return str2 != null ? str2 : this.f4394u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo5964q(String str) {
        return C1519aT.m6944a(str, this.f4396w);
    }

    /* renamed from: r */
    public Context mo5966r(String str) {
        C1498a a = this.f4388G.mo6176a(str);
        if (a == null) {
            return null;
        }
        return a.mo6161k();
    }

    /* renamed from: s */
    public String mo5967s(String str) {
        C1498a a = this.f4388G.mo6176a(str);
        if (a == null) {
            return null;
        }
        return a.mo6160j();
    }

    /* renamed from: t */
    public C1443as mo5969t(String str) {
        C1498a c = this.f4388G.mo6185c(str);
        if (c == null) {
            return null;
        }
        return c.f4740s;
    }

    /* renamed from: u */
    public int mo5971u(String str) {
        if (this.f4397x.containsKey(str)) {
            return this.f4397x.get(str).intValue();
        }
        return -1;
    }

    /* renamed from: v */
    public ArrayList<Integer> mo5973v(String str) {
        if (!Engine.isInitialized()) {
            return null;
        }
        int[] iArr = {2, 1, 3, 4, 5, 6};
        ArrayList<Integer> arrayList = new ArrayList<>();
        int languageSupportLayout = Engine.getInstance().getLanguageSupportLayout(str);
        for (int i = 0; i < iArr.length; i++) {
            if (((1 << iArr[i]) & languageSupportLayout) != 0) {
                arrayList.add(Integer.valueOf(iArr[i]));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo5931a(String str, String str2) {
        Settings.getInstance().setStringSetting(49, str2, 2, str, (Config) null, true);
    }

    /* renamed from: w */
    public String mo5975w(String str) {
        return Settings.getInstance().getStringSetting(49, 2, str, (Config) null);
    }

    /* renamed from: l */
    public boolean mo5955l() {
        return this.f4384C;
    }

    /* renamed from: x */
    public void mo5978x(String str) {
        this.f4384C = m6470y(str);
    }

    /* renamed from: m */
    public boolean mo5957m() {
        String[] g = mo5945g();
        if (g == null) {
            return false;
        }
        for (String y : g) {
            if (m6470y(y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m6470y(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a == null || a.mo6148d() != C1521aV.chs) {
            return false;
        }
        return true;
    }

    /* renamed from: aa */
    private void m6454aa() {
        int i = 0;
        this.f4393s = new String[4];
        String[] strArr = C1593bR.m7162a().f5075a ? new String[]{C1549b.f4791a} : new String[]{C1549b.f4831b, C1549b.f4832c, C1549b.f4835f, C1549b.f4791a};
        while (i < strArr.length && i < 4) {
            this.f4393s[i] = strArr[i];
            i++;
        }
    }

    /* renamed from: z */
    public void mo5980z(String str) {
        int i = 0;
        while (i < this.f4393s.length && this.f4393s[i] != null && !TextUtils.equals(str, this.f4393s[i])) {
            i++;
        }
        if (i == this.f4393s.length) {
            i--;
        }
        while (i > 0) {
            this.f4393s[i] = this.f4393s[i - 1];
            i--;
        }
        this.f4393s[0] = str;
    }

    /* renamed from: A */
    public C1498a mo5910A(String str) {
        for (C1498a next : this.f4388G.mo6181b()) {
            if (next.f4729h.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: n */
    public String[] mo5959n() {
        int i;
        boolean z;
        String[] i2 = mo5949i();
        String[] strArr = new String[3];
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        int length = this.f4393s.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                i = i4;
                break;
            }
            String str = this.f4393s[i3];
            if (str != null && !str.equals(currentLanguageId) && (m6432N(str) || (mo5960o(str) && mo5954l(str) != null && !mo5954l(str).mo6156f()))) {
                int i5 = i4 + 1;
                strArr[i4] = str;
                if (i5 >= strArr.length) {
                    i = i5;
                    break;
                }
                i4 = i5;
            }
            i3++;
        }
        int i6 = 3 - i;
        if (i6 > 0) {
            int i7 = 0;
            for (String str2 : i2) {
                if (!TextUtils.equals(str2, currentLanguageId)) {
                    z = true;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i) {
                            break;
                        } else if (TextUtils.equals(str2, strArr[i8])) {
                            z = false;
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    z = false;
                }
                if (z) {
                    strArr[i + i7] = str2;
                    i7++;
                    if (i7 >= i6) {
                        break;
                    }
                }
            }
        }
        this.f4393s[0] = currentLanguageId;
        for (int i9 = 0; i9 < 3; i9++) {
            this.f4393s[i9 + 1] = strArr[i9];
        }
        return strArr;
    }

    /* renamed from: o */
    public String[] mo5961o() {
        String[] i = mo5949i();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i.length; i2++) {
            if (m6470y(i[i2])) {
                arrayList.add(i[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: p */
    public String[] mo5963p() {
        return new String[]{C1549b.f4791a};
    }

    /* renamed from: q */
    public C1498a[] mo5965q() {
        if (this.f4383B == null) {
            return null;
        }
        return (C1498a[]) this.f4383B.toArray(new C1498a[this.f4383B.size()]);
    }

    /* renamed from: a */
    public static boolean m6452a(Context context, C1498a aVar) {
        HashSet<String> b = m6463b(context, aVar);
        if (b != null) {
            Iterator<String> it = b.iterator();
            while (it.hasNext()) {
                if (m6422B(it.next()) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static HashSet<String> m6463b(Context context, C1498a aVar) {
        if (aVar == null) {
            return null;
        }
        return C1522aW.m6959a(context).mo6189a(aVar);
    }

    /* renamed from: B */
    public static PackageInfo m6422B(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C1368X.m6313b().getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: r */
    public static boolean m6468r() {
        return !Settings.getInstance().getBoolSetting(Settings.DICTIONARY_COMPLETE, 18, Engine.getInstance().getCurrentLanguageId(), (Config) null);
    }

    /* renamed from: C */
    public static boolean m6423C(String str) {
        return !Settings.getInstance().getBoolSetting(Settings.DICTIONARY_COMPLETE, 18, str, (Config) null);
    }

    /* renamed from: ab */
    private void m6455ab() {
        Object b = C0997e.m5187b(C1466av.m6849a(this.f4390I, f4373i));
        if (b != null) {
            this.f4391l = (HashMap) b;
        } else {
            this.f4391l = new HashMap<>();
        }
    }

    /* renamed from: s */
    public void mo5968s() {
        C0997e.m5175a(C1466av.m6849a(this.f4390I, f4373i), (Object) new HashMap(this.f4391l));
    }

    /* renamed from: a */
    public void mo5932a(ArrayList<C1498a> arrayList, boolean z) {
        Iterator<C1498a> it = arrayList.iterator();
        while (it.hasNext()) {
            C1498a next = it.next();
            C1443as t = mo5969t(next.mo6160j());
            if (t != null && (t instanceof C1407aR)) {
                ((C1407aR) t).mo6022a(false, false);
                mo5930a(next);
            }
            if (z) {
                C2361q.m10797b().mo8009c(next.mo6154d(), next.mo6153c(), next.mo6159i());
            }
        }
        mo5928a();
        mo5968s();
    }

    /* renamed from: t */
    public void mo5970t() {
        C1498a l;
        String stringSetting = Settings.getInstance().getStringSetting(10);
        String stringSetting2 = Settings.getInstance().getStringSetting(11);
        ArrayList<C1498a> arrayList = new ArrayList<>();
        if (C1368X.m6320c().mo5820F().mo7500e()) {
            boolean equalsIgnoreCase = C1549b.f4791a.equalsIgnoreCase(stringSetting);
            boolean z = mo5954l(stringSetting) != null && mo5954l(stringSetting).mo6156f();
            if (!equalsIgnoreCase && !z && this.f4396w.containsKey(stringSetting)) {
                C1498a aVar = this.f4395v[this.f4396w.get(stringSetting).intValue()];
                if (!aVar.mo6157g() || !aVar.mo6156f()) {
                    arrayList.add(aVar);
                }
            }
            if (!TextUtils.isEmpty(stringSetting2)) {
                boolean equalsIgnoreCase2 = C1549b.f4791a.equalsIgnoreCase(stringSetting2);
                boolean z2 = mo5954l(stringSetting2) != null && mo5954l(stringSetting2).mo6156f();
                if (!equalsIgnoreCase2 && !z2 && this.f4396w.containsKey(stringSetting2)) {
                    C1498a aVar2 = this.f4395v[this.f4396w.get(stringSetting2).intValue()];
                    if (!aVar2.mo6157g() || !aVar2.mo6156f()) {
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            C1498a l2 = mo5954l(stringSetting);
            if (l2 != null && !l2.mo6156f()) {
                arrayList.add(l2);
            }
            if (!TextUtils.isEmpty(stringSetting2) && (l = mo5954l(stringSetting2)) != null && !l.mo6156f()) {
                arrayList.add(l);
            }
        }
        if (arrayList.size() <= 0) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_INSTALL_INCOMPATIBLE_LANGUAGE, false);
            return;
        }
        this.f4383B = arrayList;
        if (C2188Q.m9853a().mo7689j() && !mo5972u()) {
            Iterator<C1498a> it = arrayList.iterator();
            while (it.hasNext()) {
                C1498a next = it.next();
                if (!this.f4382A.contains(next.mo6154d()) && !mo5942e(next.mo6154d())) {
                    this.f4382A.add(next.mo6154d());
                    C2361q.m10797b().mo8016e(next.mo6154d(), next.mo6153c(), next.mo6159i());
                    C1056a.m5588a().mo4264a(C1056a.f2959T, this.f4390I);
                }
            }
            mo5928a();
            mo5968s();
        }
    }

    /* renamed from: u */
    public boolean mo5972u() {
        if (this.f4382A != null && this.f4382A.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean mo5915D(String str) {
        if (this.f4382A == null) {
            return false;
        }
        return this.f4382A.contains(str);
    }

    /* renamed from: v */
    public void mo5974v() {
        int intValue;
        if (C2188Q.m9853a().mo7686f()) {
            if (C2188Q.m9853a().mo7685e() || !C2188Q.m9855i()) {
                String a = C1974m.m9063a(this.f4390I, (int) R.string.CURRENT_LANGUAGE);
                if (!TextUtils.isEmpty(a) && !C1549b.f4791a.equals(a)) {
                    C1498a l = mo5954l(a);
                    if ((l == null || !l.mo6157g()) && this.f4396w.containsKey(a) && (intValue = this.f4396w.get(a).intValue()) >= 0 && intValue < this.f4395v.length) {
                        C1498a aVar = this.f4395v[intValue];
                        if (!mo5915D(aVar.mo6154d()) && !aVar.mo6157g()) {
                            C2361q.m10797b().mo8013d(aVar.mo6154d(), aVar.mo6153c(), aVar.mo6159i());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public void mo5976w() {
        int intValue;
        String a = C1974m.m9063a(this.f4390I, (int) R.string.CURRENT_LANGUAGE);
        if ((mo5954l(a) == null || !mo5954l(a).mo6157g()) && this.f4396w.containsKey(a) && (intValue = this.f4396w.get(a).intValue()) >= 0 && intValue < this.f4395v.length && mo5942e(this.f4395v[intValue].mo6154d())) {
            C2361q.m10797b().mo8007c().mo7717r();
        }
    }

    /* renamed from: x */
    public void mo5977x() {
        m6446Z();
        if (m6456ac()) {
            mo5941e();
            m6441U();
        }
    }

    /* renamed from: ac */
    private boolean m6456ac() {
        boolean z;
        boolean ag = m6460ag();
        if (ag) {
            z = m6457ad();
        } else {
            z = this.f4385D;
        }
        this.f4385D = ag;
        return z;
    }

    /* renamed from: ad */
    private boolean m6457ad() {
        File a = C1358O.m6235a("language", false);
        if (a == null || !a.exists() || m6458ae() == a.lastModified()) {
            return false;
        }
        return true;
    }

    /* renamed from: ae */
    private long m6458ae() {
        return Settings.getInstance().getLongSetting(Settings.RECORD_TIMESTAMP, 19, Settings.RECORDED_TIMESTAMP_TAG.external_language_time_stamp.toString(), (Config) null);
    }

    /* renamed from: a */
    private void m6447a(long j) {
        Settings.getInstance().setLongSetting(Settings.RECORD_TIMESTAMP, j, 19, Settings.RECORDED_TIMESTAMP_TAG.external_language_time_stamp.toString(), (Config) null, false);
    }

    /* renamed from: af */
    private void m6459af() {
        File a = C1358O.m6235a("language", true);
        if (a != null && a.exists()) {
            m6447a(a.lastModified());
        }
    }

    /* renamed from: ag */
    private boolean m6460ag() {
        return C1358O.m6235a("language", false) != null;
    }

    /* renamed from: E */
    public static boolean m6424E(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6171f();
        }
        return false;
    }

    /* renamed from: y */
    public static ArrayList<C1550c> m6469y() {
        return C1511aM.support_wave.mo6167a();
    }

    /* renamed from: F */
    public static boolean m6425F(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6172g();
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m6426G(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6164h();
        }
        return false;
    }

    /* renamed from: H */
    public static boolean m6427H(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6145i();
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5568a(String str) {
        return false;
    }

    /* renamed from: b */
    public void mo5571b(String str) {
        this.f4399z.remove(str);
        m6440T();
        this.f4382A.remove(str);
    }

    /* renamed from: f */
    public void mo5577f() {
        this.f4399z.clear();
        m6440T();
        this.f4382A.clear();
    }

    /* renamed from: c */
    public void mo5573c(String str) {
        mo5943f(str);
        m6440T();
    }

    /* renamed from: z */
    public void mo5979z() {
        List<C1498a> b = this.f4388G.mo6181b();
        if (b != null) {
            ArrayList arrayList = new ArrayList(b);
            String stringSetting = Settings.getInstance().getStringSetting(10);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C1498a aVar = (C1498a) it.next();
                if (aVar != null && !aVar.f4727f.equals(stringSetting) && (aVar.f4740s instanceof C1407aR)) {
                    ((C1407aR) aVar.f4740s).mo6027f();
                }
            }
        }
    }

    /* renamed from: I */
    public boolean mo5921I(String str) {
        if (str == null || (!str.equals(C1549b.f4834e) && !str.equals(C1549b.f4837h) && !str.equals(C1549b.f4813ai))) {
            return false;
        }
        return true;
    }

    /* renamed from: com.cootek.smartinput5.func.aD$b */
    /* compiled from: LanguageManager */
    public static class C1391b {

        /* renamed from: a */
        public String f4400a;

        /* renamed from: b */
        public String f4401b;

        /* renamed from: c */
        public String f4402c;

        public C1391b(String str, String str2, String str3) {
            this.f4400a = str;
            this.f4401b = str2;
            this.f4402c = str3;
        }
    }

    /* renamed from: A */
    public ArrayList<C1391b> mo5911A() {
        C1498a l;
        String[] g = mo5945g();
        if (g == null) {
            return null;
        }
        int length = g.length;
        ArrayList<C1391b> arrayList = new ArrayList<>();
        if (mo5957m()) {
            m6465b(arrayList);
        }
        for (int i = 0; i < length; i++) {
            if (!(g[i] == null || (l = mo5954l(g[i])) == null || !m6436P(l.f4727f))) {
                String str = l.f4732k;
                String b = mo5936b(l);
                if (str == null) {
                    str = mo5912B();
                    b = mo5913C();
                }
                C1391b bVar = new C1391b(str, b, l.f4727f);
                if (!m6453a(str, arrayList)) {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList, new C1395aH(this));
        return arrayList;
    }

    /* renamed from: P */
    private boolean m6436P(String str) {
        C1550c a = C1550c.m6998a(str);
        if (a != null) {
            return a.mo6144e();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m6453a(String str, ArrayList<C1391b> arrayList) {
        Iterator<C1391b> it = arrayList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().f4400a, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m6465b(ArrayList<C1391b> arrayList) {
        if (mo5957m() && arrayList != null) {
            String[] b = C1974m.m9070b(this.f4390I, R.array.voice_chinese_candidate_titles);
            String[] b2 = C1974m.m9070b(this.f4390I, R.array.voice_chinese_ids);
            for (int i = 0; i < b2.length; i++) {
                C1391b bVar = new C1391b(b2[i], b[i], (String) null);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
            }
        }
    }

    /* renamed from: B */
    public String mo5912B() {
        if (C1593bR.m7162a().f5075a) {
            return f4365a;
        }
        return f4366b;
    }

    /* renamed from: C */
    public String mo5913C() {
        if (C1593bR.m7162a().f5075a) {
            return m6462b((int) R.string.LANGUAGE_ENGLISH);
        }
        return m6462b((int) R.string.voice_mandarin);
    }

    /* renamed from: D */
    public String mo5914D() {
        boolean z;
        String str;
        String C = mo5913C();
        if (!Settings.isInitialized()) {
            return C;
        }
        ArrayList<C1391b> A = mo5911A();
        String stringSetting = Settings.getInstance().getStringSetting(Settings.VOICE_INPUT_LANGUAGE);
        Iterator<C1391b> it = A.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().f4400a, stringSetting)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Settings.getInstance().setStringSetting(Settings.VOICE_INPUT_LANGUAGE, "");
            stringSetting = null;
        }
        if (TextUtils.isEmpty(stringSetting)) {
            String stringSetting2 = Settings.getInstance().getStringSetting(10);
            C1498a l = C1368X.m6320c().mo5842o().mo5954l(stringSetting2);
            if (l == null || !m6436P(stringSetting2)) {
                str = C;
            } else {
                str = mo5936b(l);
            }
            return str;
        } else if (A == null) {
            return C;
        } else {
            Iterator<C1391b> it2 = A.iterator();
            while (it2.hasNext()) {
                C1391b next = it2.next();
                if (TextUtils.equals(next.f4400a, stringSetting)) {
                    return next.f4401b;
                }
            }
            return C;
        }
    }

    /* renamed from: b */
    public String mo5936b(C1498a aVar) {
        String c = aVar.mo6153c();
        Resources resources = this.f4390I.getResources();
        String str = aVar.f4727f;
        if (str == null || resources == null) {
            return c;
        }
        if (str.equals(C1549b.f4831b) || str.equals(C1549b.f4832c) || str.equals(C1549b.f4833d) || str.equals(C1549b.f4835f)) {
            return m6462b((int) R.string.voice_mandarin);
        }
        if (str.equals(C1549b.f4837h) || str.equals(C1549b.f4813ai)) {
            return m6462b((int) R.string.voice_cantonese);
        }
        if (str.equals(C1549b.f4834e)) {
            return m6462b((int) R.string.voice_tw);
        }
        return c;
    }

    /* renamed from: E */
    public C0967f mo5916E() {
        return C0967f.m5016b(C0967f.MANDARIN.toString());
    }

    /* renamed from: F */
    public C0967f mo5917F() {
        String H = mo5919H();
        if (TextUtils.isEmpty(H)) {
            return mo5916E();
        }
        return C0967f.m5016b(H);
    }

    /* renamed from: G */
    public String mo5918G() {
        return mo5917F().mo3990a(this.f4390I);
    }

    /* renamed from: H */
    public String mo5919H() {
        return Settings.getInstance().getStringSetting(Settings.IFLY_VOICE_CHOSEN_LANGUAGE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (m6470y(r0) != false) goto L_0x001e;
     */
    /* renamed from: ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m6461ah() {
        /*
            r4 = this;
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            r1 = 339(0x153, float:4.75E-43)
            java.lang.String r1 = r0.getStringSetting(r1)
            boolean r0 = com.cootek.smartinput5.engine.Engine.isInitialized()
            if (r0 == 0) goto L_0x0066
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r0 = r0.getCurrentLanguageId()
            boolean r2 = m6470y(r0)
            if (r2 == 0) goto L_0x0066
        L_0x001e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0037
            com.cootek.smartinput5.func.b.a r1 = r4.mo5954l(r0)
            if (r1 == 0) goto L_0x0037
            boolean r2 = r1.mo6158h()
            if (r2 == 0) goto L_0x0037
            boolean r1 = r1.mo6156f()
            if (r1 == 0) goto L_0x0037
        L_0x0036:
            return r0
        L_0x0037:
            com.cootek.smartinput5.func.b.aM r0 = com.cootek.smartinput5.func.p052b.C1511aM.is_chs
            java.util.ArrayList r0 = r0.mo6167a()
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r1.next()
            com.cootek.smartinput5.func.b.c r0 = (com.cootek.smartinput5.func.p052b.C1550c) r0
            java.lang.String r0 = r0.mo6190a()
            com.cootek.smartinput5.func.b.a r2 = r4.mo5954l(r0)
            if (r2 == 0) goto L_0x0041
            boolean r3 = r2.mo6158h()
            if (r3 == 0) goto L_0x0041
            boolean r2 = r2.mo6156f()
            if (r2 == 0) goto L_0x0041
            goto L_0x0036
        L_0x0064:
            r0 = 0
            goto L_0x0036
        L_0x0066:
            r0 = r1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.func.C1389aD.m6461ah():java.lang.String");
    }

    /* renamed from: I */
    public String mo5920I() {
        String stringSetting = Settings.getInstance().getStringSetting(10);
        if (!m6470y(stringSetting) && !TextUtils.isEmpty(stringSetting)) {
            return stringSetting;
        }
        if (Settings.getInstance().isLanguageEnabled(C1549b.f4791a)) {
            return C1549b.f4791a;
        }
        String[] g = mo5945g();
        for (int i = 0; i < g.length; i++) {
            if (!m6470y(g[i])) {
                return g[i];
            }
        }
        Settings.getInstance().setLanguageEnabled(C1549b.f4791a, true);
        return C1549b.f4791a;
    }

    /* renamed from: J */
    public String[] mo5922J() {
        ArrayList arrayList = new ArrayList();
        for (C1498a next : this.f4388G.mo6181b()) {
            if (next.mo6158h() && next.mo6156f()) {
                if (!m6470y(next.f4727f) || next.f4727f.equals(m6461ah())) {
                    arrayList.add(next.f4727f);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: K */
    public void mo5923K() {
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        String[] J = mo5922J();
        if (J.length > 1) {
            for (int i = 0; i < J.length; i++) {
                if (currentLanguageId.equals(J[i])) {
                    int i2 = i - 1;
                    if (i2 < 0) {
                        i2 = J.length - 1;
                    }
                    Engine.switchToLanguage(J[i2]);
                    return;
                }
            }
        }
    }

    /* renamed from: L */
    public void mo5924L() {
        String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
        String[] J = mo5922J();
        if (J.length > 1) {
            for (int i = 0; i < J.length; i++) {
                if (currentLanguageId.equals(J[i])) {
                    Engine.switchToLanguage(J[(i + 1) % J.length]);
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    public boolean mo5925M() {
        C1550c a;
        boolean z;
        boolean z2;
        String a2 = C1974m.m9063a(C1368X.m6313b(), (int) R.string.CURRENT_LANGUAGE);
        if (TextUtils.isEmpty(a2) || mo5960o(a2) || (a = C1550c.m6998a(a2)) == null || mo5942e(a.mo6192b(C1368X.m6313b()))) {
            return false;
        }
        C1498a l = mo5954l(a2);
        if (l != null) {
            z = !l.mo6156f();
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (mo5965q() != null) {
            z2 = false;
            for (C1498a aVar : mo5965q()) {
                if (TextUtils.equals(a2, aVar.f4727f)) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public int mo5926N() {
        if (Settings.getInstance().getBoolSetting(Settings.FIRST_SWITCH_LANGUAGE)) {
            String stringSetting = Settings.getInstance().getStringSetting(Settings.CURRENT_LANG_BEFORE_UPDATE);
            String stringSetting2 = Settings.getInstance().getStringSetting(Settings.PREUSED_LANG_BEFORE_UPDATE);
            if (m6470y(stringSetting) || m6470y(stringSetting2)) {
                return 1;
            }
            if (this.f4388G.mo6186d()) {
                return 2;
            }
        }
        return 0;
    }
}
