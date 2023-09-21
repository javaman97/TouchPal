package com.cootek.smartinput5.func;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0990F;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.IPCManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1411aV;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2003a;
import com.cootek.smartinput5.net.C2361q;
import com.cootek.smartinput5.net.C2364s;
import com.cootek.smartinput5.net.DownloadReceiver;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.cootek.smartinput5.func.k */
/* compiled from: AttachedPackageManager */
public class C1811k {

    /* renamed from: A */
    private static final String f5935A = "com.cootek";

    /* renamed from: B */
    private static final String f5936B = "com.cootek.smartinputv5.plugin.";

    /* renamed from: C */
    private static final String f5937C = "com.cootek.smartinputv5.moreplugin";

    /* renamed from: D */
    private static final String f5938D = "com.cootek.smartdialer";

    /* renamed from: E */
    private static final String f5939E = "plugin";

    /* renamed from: F */
    private static final String f5940F = "plugin";

    /* renamed from: G */
    private static final String f5941G = "language";

    /* renamed from: H */
    private static final String f5942H = "action_main";

    /* renamed from: I */
    private static final String f5943I = "action_settings";

    /* renamed from: J */
    private static final String f5944J = "action_func";

    /* renamed from: K */
    private static final String f5945K = "category";

    /* renamed from: L */
    private static final String f5946L = "more_plugin";

    /* renamed from: M */
    private static final String f5947M = "emoji_plugin";

    /* renamed from: N */
    private static final String f5948N = "id";

    /* renamed from: O */
    private static final String f5949O = "versionCode";

    /* renamed from: P */
    private static final String f5950P = "type";

    /* renamed from: Q */
    private static final String f5951Q = "func_name";

    /* renamed from: R */
    private static final String f5952R = "short_name";

    /* renamed from: S */
    private static final String f5953S = "title";

    /* renamed from: T */
    private static final String f5954T = "summary";

    /* renamed from: U */
    private static final String f5955U = "author";

    /* renamed from: V */
    private static final String f5956V = "dynamicBackgroundStrategy";

    /* renamed from: W */
    private static final String f5957W = "timeInterval";

    /* renamed from: X */
    private static final String f5958X = "countInterval";

    /* renamed from: Y */
    private static final String f5959Y = "switchInTurn";

    /* renamed from: Z */
    private static final String f5960Z = "icon";

    /* renamed from: a */
    public static final int f5961a = -1;

    /* renamed from: aK */
    private static final String f5962aK = ".zip";

    /* renamed from: aa */
    private static final String f5963aa = "value";

    /* renamed from: ab */
    private static final String f5964ab = "package";

    /* renamed from: ac */
    private static final String f5965ac = "class";

    /* renamed from: ad */
    private static final String f5966ad = "intent_action";

    /* renamed from: ae */
    private static final String f5967ae = "version";

    /* renamed from: af */
    private static final String f5968af = "subversionCode";

    /* renamed from: ag */
    private static final String f5969ag = "position";

    /* renamed from: ah */
    private static final String f5970ah = "minSdk";

    /* renamed from: ai */
    private static final String f5971ai = "app_id";

    /* renamed from: aj */
    private static final String f5972aj = "download_url";

    /* renamed from: ak */
    private static final String f5973ak = "language_curve";

    /* renamed from: al */
    private static final String f5974al = "curve_buildin";

    /* renamed from: am */
    private static final String f5975am = "buildin_curve_type";

    /* renamed from: an */
    private static final String f5976an = "language_keyboard";

    /* renamed from: ao */
    private static final String f5977ao = "voice";

    /* renamed from: ap */
    private static final String f5978ap = "hide_keyboard";

    /* renamed from: aq */
    private static final String f5979aq = "support_version";

    /* renamed from: ar */
    private static final String f5980ar = "right_to_left";

    /* renamed from: as */
    private static final String f5981as = "url";

    /* renamed from: at */
    private static final String f5982at = "is_new";

    /* renamed from: au */
    private static final String f5983au = "is_new_cell";

    /* renamed from: b */
    public static final int f5984b = 0;

    /* renamed from: c */
    public static final int f5985c = 1;

    /* renamed from: d */
    public static final int f5986d = 2;

    /* renamed from: e */
    public static final int f5987e = 3;

    /* renamed from: f */
    public static final int f5988f = 4;

    /* renamed from: g */
    public static final int f5989g = 5;

    /* renamed from: h */
    public static final int f5990h = 6;

    /* renamed from: i */
    public static final int f5991i = 7;

    /* renamed from: j */
    public static final String f5992j = "com.cootek.smartinputv5.language.";

    /* renamed from: k */
    public static final String f5993k = "com.cootek.smartinputv5.language.v5.";

    /* renamed from: l */
    public static final String f5994l = "com.cootek.smartinputv5.skin.";

    /* renamed from: m */
    public static final String f5995m = "com.cootek.smartinputv5.celldict.";

    /* renamed from: n */
    public static final String f5996n = "com.cootek.smartinputv5.emoji.";

    /* renamed from: o */
    public static final String f5997o = "com.cootek.smartinputv5.";

    /* renamed from: p */
    public static final String f5998p = "com.cootek.smartinput5.func.AttachedPackageManager.EXTRA_INT_TYPE";

    /* renamed from: q */
    public static final String f5999q = "com.cootek.smartinput5.func.AttachedPackageManager.EXTRA_STRING_PKGNAME";

    /* renamed from: r */
    private static C1811k f6000r = null;

    /* renamed from: s */
    private static final String f6001s = "AttachedPackageManager";

    /* renamed from: t */
    private static final String f6002t = "com.cootek.smartinput.intent.action.PLUGIN";

    /* renamed from: u */
    private static final String f6003u = "com.cootek.smartinput.intent.category.DEFAULT";

    /* renamed from: v */
    private static final String f6004v = "com.cootek.smartinput.intent.category.SKIN";

    /* renamed from: w */
    private static final String f6005w = "com.cootek.smartinput.intent.category.LANGUAGE";

    /* renamed from: x */
    private static final String f6006x = "com.cootek.smartinput.intent.category.CELLDICT";

    /* renamed from: y */
    private static final String f6007y = "com.cootek.smartinput.intent.category.MORE_PLUGIN";

    /* renamed from: z */
    private static final String f6008z = "com.cootek.smartinput.intent.category.EMOJI_PLUGIN";

    /* renamed from: aA */
    private PackageManager f6009aA;

    /* renamed from: aB */
    private C1443as f6010aB;

    /* renamed from: aC */
    private final Intent f6011aC = new Intent(f6002t).addCategory(f6003u);

    /* renamed from: aD */
    private final Intent f6012aD = new Intent(f6002t).addCategory(f6004v);

    /* renamed from: aE */
    private final Intent f6013aE = new Intent(f6002t).addCategory(f6005w);

    /* renamed from: aF */
    private final Intent f6014aF = new Intent(f6002t).addCategory(f6006x);

    /* renamed from: aG */
    private final Intent f6015aG = new Intent(f6002t).addCategory(f6007y);

    /* renamed from: aH */
    private final Intent f6016aH = new Intent(f6002t).addCategory(f6008z);

    /* renamed from: aI */
    private final ArrayList<C1441aq> f6017aI = new ArrayList<>();

    /* renamed from: aJ */
    private final String f6018aJ;

    /* renamed from: av */
    private final Intent[] f6019av = {this.f6011aC, this.f6012aD, this.f6013aE, this.f6014aF, this.f6015aG, this.f6013aE, this.f6016aH};

    /* renamed from: aw */
    private final String[] f6020aw = {null, C1602bh.f5114c, C1389aD.f4370f, null, null, C1389aD.f4370f, C2003a.f6952a};

    /* renamed from: ax */
    private final String[][] f6021ax = {null, C1602bh.f5130s, null, null, null, null, null};

    /* renamed from: ay */
    private final String[] f6022ay = {null, "skin", "language", null, null, "language", "emoji_plugin"};

    /* renamed from: az */
    private final Context f6023az;

    /* renamed from: a */
    public static C1811k m8322a() {
        if (f6000r == null && C1368X.m6313b() != null) {
            f6000r = new C1811k(C1368X.m6313b());
        }
        return f6000r;
    }

    /* renamed from: b */
    public static void m8334b() {
        if (f6000r != null) {
            f6000r.mo6825c();
        }
        f6000r = null;
    }

    private C1811k(Context context) {
        this.f6023az = context;
        this.f6009aA = context.getPackageManager();
        this.f6010aB = new C1465au(context);
        this.f6018aJ = C1974m.m9063a(context, (int) R.string.SKIN_PACK_EXPECTED_VERSION);
    }

    /* renamed from: a */
    public void mo6818a(String str) {
        File[] fileArr;
        File a = C1466av.m6848a(this.f6023az);
        if (a != null) {
            fileArr = a.listFiles(new C1812l(this, str));
        } else {
            fileArr = null;
        }
        boolean z = fileArr != null && fileArr.length > 0;
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5816B().mo6051b(str, z);
        }
        if (str.startsWith(f5935A)) {
            m8346f(str);
            m8347g(str);
            int h = m8348h(str);
            Iterator it = new ArrayList(this.f6017aI).iterator();
            while (it.hasNext()) {
                C1441aq aqVar = (C1441aq) it.next();
                if (aqVar != null && (aqVar.mo5935b() == h || aqVar.mo5935b() == -1)) {
                    aqVar.mo5948i(str);
                }
            }
            if (h == 1 && Settings.getInstance().getLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, 30, str, (Config) null) == 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Settings.getInstance().setLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, currentTimeMillis, 30, str, (Config) null, false);
                Message obtain = Message.obtain((Handler) null, 3);
                Bundle bundle = new Bundle();
                bundle.putInt(IPCManager.SETTING_TYPE, 2);
                bundle.putInt(IPCManager.SETTING_KEY, Settings.SKIN_FIRST_INSTALLED_TIME);
                bundle.putLong(IPCManager.SETTING_VALUE, currentTimeMillis);
                bundle.putInt(IPCManager.SETTING_CATEGORY_TYPE, 30);
                bundle.putString(IPCManager.SETTING_CATEGORY_VALUE, str);
                obtain.setData(bundle);
                C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
            }
            m8338c(h, str);
        }
    }

    /* renamed from: a */
    public void mo6819a(String str, boolean z) {
        if (str.startsWith(f5935A)) {
            m8347g(str);
            m8336b(str, z);
            int h = m8348h(str);
            Iterator it = new ArrayList(this.f6017aI).iterator();
            while (it.hasNext()) {
                C1441aq aqVar = (C1441aq) it.next();
                if (aqVar != null && (aqVar.mo5935b() == h || aqVar.mo5935b() == -1)) {
                    aqVar.mo5951j(str);
                }
            }
            if (h == 1) {
                Settings.getInstance().setLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, 0, 30, str, (Config) null, false);
            }
            m8338c(h, str);
        }
    }

    /* renamed from: a */
    public void mo6815a(int i) {
        Iterator it = new ArrayList(this.f6017aI).iterator();
        while (it.hasNext()) {
            C1441aq aqVar = (C1441aq) it.next();
            if (aqVar != null && (aqVar.mo5935b() == i || aqVar.mo5935b() == -1)) {
                aqVar.mo5928a();
            }
        }
        m8338c(i, (String) null);
    }

    /* renamed from: a */
    public void mo6816a(int i, boolean z) {
        Iterator it = new ArrayList(this.f6017aI).iterator();
        while (it.hasNext()) {
            C1441aq aqVar = (C1441aq) it.next();
            if (aqVar != null && (aqVar.mo5935b() == i || aqVar.mo5935b() == -1)) {
                aqVar.mo5933a(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo6823b(String str) {
        try {
            this.f6009aA.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo6817a(C1441aq aqVar) {
        if (!this.f6017aI.contains(aqVar)) {
            this.f6017aI.add(aqVar);
        }
    }

    /* renamed from: b */
    public void mo6822b(C1441aq aqVar) {
        this.f6017aI.remove(aqVar);
    }

    /* renamed from: c */
    public void mo6825c() {
        this.f6017aI.clear();
    }

    /* renamed from: a */
    public ArrayList<C1810j> mo6813a(int i, String str) {
        return mo6814a(i, str, false);
    }

    /* renamed from: a */
    public ArrayList<C1810j> mo6814a(int i, String str, boolean z) {
        ArrayList<C1810j> arrayList = new ArrayList<>();
        ArrayList<C1810j> b = m8333b(i, z);
        ArrayList<C1810j> b2 = m8332b(i);
        if (z) {
            arrayList.addAll(b2);
            arrayList.addAll(b);
        } else {
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            m8327a(b, (ArrayList<C1810j>) arrayList2, (HashMap<String, Integer>) hashMap, str);
            m8327a(b2, (ArrayList<C1810j>) arrayList2, (HashMap<String, Integer>) hashMap, str);
            arrayList.addAll(arrayList2);
            hashMap.clear();
        }
        ArrayList<C1810j> c = m8337c(i);
        if (c != null) {
            arrayList.addAll(c);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m8327a(ArrayList<C1810j> arrayList, ArrayList<C1810j> arrayList2, HashMap<String, Integer> hashMap, String str) {
        Iterator<C1810j> it = arrayList.iterator();
        while (it.hasNext()) {
            C1810j next = it.next();
            String c = next.mo5909c();
            Integer num = hashMap.get(c);
            if (num == null) {
                hashMap.put(c, Integer.valueOf(arrayList2.size()));
                arrayList2.add(next);
            } else if (TextUtils.equals(next.f5933b, str)) {
                arrayList2.remove(num.intValue());
                arrayList2.add(num.intValue(), next);
            }
        }
    }

    /* renamed from: b */
    private ArrayList<C1810j> m8332b(int i) {
        File d;
        File[] listFiles;
        ArrayList<C1810j> arrayList = new ArrayList<>();
        String str = this.f6020aw[i];
        String[] strArr = this.f6021ax[i];
        if (!((TextUtils.isEmpty(str) && strArr == null) || (d = m8340d(i)) == null || (listFiles = d.listFiles(new C1842m(this, str, strArr))) == null)) {
            Arrays.sort(listFiles);
            for (File file : listFiles) {
                ArrayList<C1810j> a = m8323a(i, m8321a(file.getAbsolutePath(), i));
                if (!a.isEmpty()) {
                    arrayList.addAll(a);
                } else {
                    file.delete();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private ArrayList<C1810j> m8333b(int i, boolean z) {
        List<ResolveInfo> list;
        String str;
        C1465au auVar;
        ArrayList<C1810j> arrayList = new ArrayList<>();
        if (C1358O.m6239b() != null && i == 2) {
            return arrayList;
        }
        try {
            list = this.f6009aA.queryIntentActivities(this.f6019av[i], 32);
        } catch (Exception e) {
            list = null;
        }
        if (list != null) {
            File b = C1358O.m6239b();
            if (b != null) {
                str = b.getAbsolutePath();
            } else {
                str = null;
            }
            for (ResolveInfo next : list) {
                try {
                    if (!C1602bh.f5115d.equalsIgnoreCase(next.activityInfo.packageName)) {
                        try {
                            auVar = new C1465au(this.f6023az.createPackageContext(next.activityInfo.packageName, 2));
                        } catch (NullPointerException e2) {
                            auVar = null;
                        }
                        ArrayList<C1810j> a = m8323a(i, (C1443as) auVar);
                        Iterator<C1810j> it = a.iterator();
                        while (it.hasNext()) {
                            boolean a2 = m8328a(i, it.next(), str);
                            if (z || !a2) {
                                arrayList.addAll(a);
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m8328a(int i, C1810j jVar, String str) {
        boolean z;
        File d = m8340d(i);
        if (d == null) {
            return false;
        }
        if (str != null) {
            z = d.getAbsolutePath().startsWith(str);
        } else {
            z = true;
        }
        if (!z || d == null || !d.exists()) {
            return false;
        }
        ArrayList<String> a = m8324a(jVar);
        if (a.size() <= 0) {
            return false;
        }
        if (!m8329a(d, a)) {
            return true;
        }
        InputStream b = m8331b(jVar);
        if (b == null) {
            return false;
        }
        boolean a2 = m8330a(b, d, jVar.mo6810a());
        try {
            b.close();
            return a2;
        } catch (IOException e) {
            return a2;
        }
    }

    /* renamed from: a */
    private ArrayList<String> m8324a(C1810j jVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        InputStream b = m8331b(jVar);
        if (b != null) {
            ZipInputStream zipInputStream = new ZipInputStream(b);
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break;
                    }
                    arrayList.add(nextEntry.getName());
                } catch (IOException e) {
                }
            }
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                } catch (IOException e2) {
                }
            }
            try {
                b.close();
            } catch (IOException e3) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m8330a(InputStream inputStream, File file, String str) {
        File file2 = new File(file, str);
        try {
            C0997e.m5178a(inputStream, (OutputStream) new FileOutputStream(file2));
            C0990F.m5124a(file2, file);
            file2.delete();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private InputStream m8331b(C1810j jVar) {
        try {
            return jVar.f5932a.getAssets().open(jVar.mo6810a() + ".zip");
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: a */
    private boolean m8329a(File file, ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!new File(file, it.next()).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private ArrayList<C1810j> m8337c(int i) {
        if (i == 1 || i == 3) {
            return null;
        }
        return m8323a(i, (C1443as) new C1465au(this.f6023az));
    }

    /* renamed from: d */
    private File m8340d(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
                return C1358O.m6234a(this.f6022ay[i]);
            case 2:
                File a = C1466av.m6848a(this.f6023az);
                if (a != null) {
                    return new File(a.getAbsolutePath() + File.separator + "language");
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public ArrayList<C1810j> mo6821b(int i, String str) {
        ArrayList<C1810j> arrayList = new ArrayList<>();
        if (str.startsWith(f5935A)) {
            try {
                arrayList.addAll(m8323a(i, (C1443as) new C1465au(this.f6023az.createPackageContext(str, 2))));
            } catch (PackageManager.NameNotFoundException e) {
            }
        } else {
            arrayList.addAll(m8323a(i, m8321a(str, i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C1443as m8321a(String str, int i) {
        return C1599be.m7206a(this.f6023az, str, i);
    }

    /* renamed from: a */
    private ArrayList<C1810j> m8323a(int i, C1443as asVar) {
        ArrayList<C1810j> arrayList = new ArrayList<>();
        if (asVar != null) {
            switch (i) {
                case 0:
                    m8339c(asVar, arrayList);
                    break;
                case 1:
                    m8341d(asVar, arrayList);
                    break;
                case 2:
                case 5:
                    m8344e(asVar, arrayList);
                    break;
                case 3:
                    m8345f(asVar, arrayList);
                    break;
                case 4:
                    m8335b(asVar, arrayList);
                    break;
                case 6:
                    m8325a(asVar, arrayList);
                    break;
                default:
                    C1017y.m5219b(f6001s, "parse plugin failed");
                    break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private XmlResourceParser m8320a(Resources resources, String str) {
        try {
            return resources.getXml(resources.getIdentifier(C1413aW.f4515a, "xml", str));
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    private boolean m8342d(String str) {
        if (C1593bR.m7162a().f5075a) {
            if (str.equals("mainland")) {
                return false;
            }
        } else if (!str.equals("international")) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m8325a(C1443as asVar, ArrayList<C1810j> arrayList) {
        Resources resources = asVar.getResources();
        String packageName = asVar.getPackageName();
        XmlResourceParser a = m8320a(resources, packageName);
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() == 2 && a.getName().equals("emoji_plugin")) {
                        C2003a.C2005b bVar = new C2003a.C2005b();
                        String attributeValue = a.getAttributeValue((String) null, "id");
                        String a2 = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5967ae));
                        int a3 = C1599be.m7198a(resources, packageName, a.getAttributeValue((String) null, f5949O), 0);
                        bVar.f6967d = attributeValue;
                        bVar.f5932a = asVar;
                        bVar.f5933b = a2;
                        bVar.f6968e = a3;
                        arrayList.add(bVar);
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m8335b(C1443as asVar, ArrayList<C1810j> arrayList) {
        XmlResourceParser a = m8320a(asVar.getResources(), asVar.getPackageName());
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() != 2 || a.getName().equals(f5946L)) {
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    private void m8339c(C1443as asVar, ArrayList<C1810j> arrayList) {
        Resources resources = asVar.getResources();
        String packageName = asVar.getPackageName();
        XmlResourceParser a = m8320a(resources, packageName);
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() == 2 && a.getName().equals(C1413aW.f4515a)) {
                        String attributeValue = a.getAttributeValue((String) null, "id");
                        String attributeValue2 = a.getAttributeValue((String) null, f5979aq);
                        if (TextUtils.isEmpty(attributeValue2)) {
                            attributeValue2 = "mainland";
                        }
                        if (C1132b.m5654a(this.f6023az).mo4395a(attributeValue, Boolean.valueOf(m8342d(attributeValue2))).booleanValue()) {
                            C1411aV aVVar = new C1411aV();
                            arrayList.add(aVVar);
                            aVVar.f5932a = asVar;
                            if (TextUtils.isEmpty(attributeValue)) {
                                aVVar.f4501D = aVVar.mo6810a();
                            } else {
                                aVVar.f4501D = attributeValue;
                            }
                            aVVar.f4513P = attributeValue2;
                            aVVar.f4503F = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "title"));
                            aVVar.f4504G = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "summary"));
                            aVVar.f4510M = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "app_id"));
                            aVVar.f5933b = a.getAttributeValue((String) null, f5967ae);
                            aVVar.f4500C = C1599be.m7204a(resources, packageName, a.getAttributeValue((String) null, f5960Z), C2726bF.PLUGIN_BAR);
                            aVVar.f4512O = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5978ap), false);
                            aVVar.f4506I = C1599be.m7198a(resources, packageName, a.getAttributeValue((String) null, f5970ah), 0);
                            aVVar.f4505H = 0;
                            String attributeValue3 = a.getAttributeValue((String) null, f5969ag);
                            if (!TextUtils.isEmpty(attributeValue3)) {
                                if (attributeValue3.equalsIgnoreCase("top")) {
                                    aVVar.f4505H = 1;
                                } else if (attributeValue3.equalsIgnoreCase("bottom")) {
                                    aVVar.f4505H = 2;
                                } else {
                                    aVVar.f4505H = Integer.parseInt(attributeValue3);
                                }
                            }
                            while (true) {
                                if (a.next() == 3 && (a.getName().equals(C1413aW.f4515a) || a.getName().equals("language") || a.getName().equals(f5946L))) {
                                    break;
                                } else if (a.getEventType() == 2) {
                                    if (a.getName().equals(f5942H)) {
                                        aVVar.f4508K[0] = mo6820b(a, resources, packageName, a.getName());
                                        if (aVVar.f4508K[0] != null) {
                                            aVVar.f4510M = aVVar.f4508K[0].getStringExtra("app_id");
                                            aVVar.f4511N = aVVar.f4508K[0].getStringExtra(f5972aj);
                                        }
                                    } else if (a.getName().equals(f5943I)) {
                                        aVVar.f4508K[1] = mo6820b(a, resources, packageName, a.getName());
                                    } else if (a.getName().equals(f5944J)) {
                                        aVVar.f4514Q = mo6812a(a, resources, packageName, a.getName());
                                    }
                                }
                            }
                        }
                    }
                } catch (Resources.NotFoundException e) {
                    e.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (ClassNotFoundException e4) {
                    e4.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (InstantiationException e5) {
                    e5.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (IllegalAccessException e6) {
                    e6.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
        }
    }

    /* renamed from: d */
    private void m8341d(C1443as asVar, ArrayList<C1810j> arrayList) {
        Resources resources = asVar.getResources();
        String packageName = asVar.getPackageName();
        XmlResourceParser a = m8320a(resources, packageName);
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() == 2 && a.getName().equals(C1413aW.f4515a)) {
                        String a2 = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5967ae));
                        C1601bg bgVar = new C1601bg();
                        bgVar.f5932a = asVar;
                        bgVar.f5933b = a2;
                        bgVar.f5100d = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "title"));
                        bgVar.f5101e = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5955U));
                        bgVar.f5103g = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5956V));
                        bgVar.f5104h = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5957W));
                        bgVar.f5105i = C1599be.m7198a(resources, packageName, a.getAttributeValue((String) null, f5958X), 0);
                        bgVar.f5106j = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5959Y), true);
                        bgVar.f5107k = Settings.getInstance().getLongSetting(Settings.SKIN_FIRST_INSTALLED_TIME, 30, asVar.getPackageName(), (Config) null);
                        if (C1602bh.f5115d.equalsIgnoreCase(packageName)) {
                            arrayList.add(0, bgVar);
                        } else {
                            arrayList.add(bgVar);
                        }
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
        }
    }

    /* renamed from: e */
    private void m8344e(C1443as asVar, ArrayList<C1810j> arrayList) {
        Resources resources = asVar.getResources();
        String packageName = asVar.getPackageName();
        XmlResourceParser a = m8320a(resources, packageName);
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() == 2 && a.getName().equals("language")) {
                        C1388aC aCVar = new C1388aC();
                        arrayList.add(aCVar);
                        m8326a((C1810j) aCVar, resources, packageName, a);
                        aCVar.f5932a = asVar;
                        aCVar.f4355d = a.getAttributeValue((String) null, "id");
                        aCVar.f4356e = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "app_id"));
                        aCVar.f4357f = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5952R));
                        aCVar.f4358g = a.getAttributeValue((String) null, f5977ao);
                        aCVar.f4359h = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5973ak), false);
                        aCVar.f4360i = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5974al), false);
                        aCVar.f4364m = C1599be.m7198a(resources, packageName, a.getAttributeValue((String) null, f5975am), 0);
                        aCVar.f4361j = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5976an), false);
                        aCVar.f4362k = C1599be.m7198a(resources, packageName, a.getAttributeValue((String) null, f5949O), 0);
                        aCVar.f4363l = C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5980ar), false);
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
        }
    }

    /* renamed from: a */
    private void m8326a(C1810j jVar, Resources resources, String str, XmlResourceParser xmlResourceParser) {
        jVar.f5933b = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5967ae));
        jVar.f5934c = C1599be.m7198a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5968af), 0);
    }

    /* renamed from: f */
    private void m8345f(C1443as asVar, ArrayList<C1810j> arrayList) {
        Resources resources = asVar.getResources();
        String packageName = asVar.getPackageName();
        XmlResourceParser a = m8320a(resources, packageName);
        if (a != null) {
            while (a.next() != 1) {
                try {
                    if (a.getEventType() == 2 && a.getName().equals(C1413aW.f4515a)) {
                        String a2 = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "id"));
                        if (C1599be.m7214a(resources, packageName, a.getAttributeValue((String) null, f5983au), false)) {
                            String str = asVar.getPackageName() + ":" + a2;
                            if (str != null) {
                                C2065u uVar = new C2065u(str, C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "name")), C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, "language")), C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5967ae)), (File) null, true, false);
                                uVar.f8869D = true;
                                uVar.f5932a = asVar;
                                arrayList.add(uVar);
                            }
                        } else {
                            String substring = a2.substring(0, a2.length() - 5);
                            if (substring != null) {
                                C2065u uVar2 = new C2065u();
                                arrayList.add(uVar2);
                                uVar2.f5932a = asVar;
                                uVar2.f8870v = substring;
                                uVar2.f8873y = C1599be.m7209a(resources, packageName, a.getAttributeValue((String) null, f5967ae));
                            }
                        }
                    }
                } catch (XmlPullParserException e) {
                    e.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1411aV.C1412a mo6812a(XmlResourceParser xmlResourceParser, Resources resources, String str, String str2) throws XmlPullParserException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (C1411aV.C1412a) Class.forName(C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5951Q))).newInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Intent mo6820b(XmlResourceParser xmlResourceParser, Resources resources, String str, String str2) throws XmlPullParserException, IOException {
        Intent intent;
        String a = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, "type"));
        if (a.equals(C1411aV.f4483j)) {
            intent = new Intent(C1411aV.f4475U);
            intent.putExtra(C1411aV.f4483j, m8343e(C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, "value"))));
        } else if (a.equals(C1411aV.f4485l)) {
            intent = new Intent(C1411aV.f4476V);
            intent.putExtra(C1411aV.f4485l, C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, "value")));
        } else if (a.equals(C1411aV.f4484k)) {
            String a2 = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5964ab));
            String a3 = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5965ac));
            if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                String a4 = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5966ad));
                if (!TextUtils.isEmpty(a4)) {
                    intent = new Intent(a4);
                    intent.putExtra("app_id", C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, "app_id")));
                    intent.putExtra(f5972aj, C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, f5972aj)));
                } else {
                    intent = null;
                }
            } else {
                intent = m8319a(a2, a3);
            }
            while (true) {
                if (xmlResourceParser.next() == 3 && xmlResourceParser.getName().equals(str2)) {
                    break;
                } else if (xmlResourceParser.getEventType() == 2 && xmlResourceParser.getName().equals(f5945K)) {
                    String a5 = C1599be.m7209a(resources, str, xmlResourceParser.getAttributeValue((String) null, "value"));
                    if (!TextUtils.isEmpty(a5) && intent != null) {
                        intent.addCategory(a5);
                    }
                }
            }
        } else {
            intent = null;
        }
        if (intent != null) {
            intent.addFlags(Engine.EXCEPTION_ERROR);
        }
        return intent;
    }

    /* renamed from: a */
    private Intent m8319a(String str, String str2) {
        Context context;
        try {
            context = this.f6023az.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            context = null;
        }
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, str2));
        return intent;
    }

    /* renamed from: e */
    private int m8343e(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("0x")) {
            return Integer.parseInt(lowerCase.replace("0x", ""), 16);
        }
        return Integer.parseInt(lowerCase);
    }

    /* renamed from: f */
    private void m8346f(String str) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = C1466av.m6848a(this.f6023az)) != null) {
            try {
                for (File file : a.listFiles(new C1874n(this))) {
                    String name = file.getName();
                    PackageInfo packageArchiveInfo = this.f6009aA.getPackageArchiveInfo(file.getPath(), 0);
                    if (packageArchiveInfo != null && str.equals(packageArchiveInfo.packageName)) {
                        C2361q.m10797b().mo8006b(file);
                        file.delete();
                        String substring = name.substring(0, name.length() - ".apk".length());
                        Intent intent = new Intent(this.f6023az, DownloadReceiver.class);
                        intent.setAction(C2364s.C2365a.f10414a[1]);
                        intent.putExtra("TYPE", 2);
                        intent.putExtra("STATUS", 3);
                        intent.putExtra("APPID", substring);
                        this.f6023az.sendBroadcast(intent);
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: g */
    private void m8347g(String str) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = C1466av.m6848a(this.f6023az)) != null) {
            try {
                File[] listFiles = a.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        String name = file.getName();
                        if (file.isDirectory() && name.equals(str)) {
                            C0997e.m5172a(file);
                        } else if (name.startsWith(str + Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR)) {
                            file.delete();
                        }
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: h */
    private int m8348h(String str) {
        if (str.startsWith(f5992j)) {
            return 2;
        }
        if (str.startsWith(f5994l)) {
            return 1;
        }
        if (str.startsWith(f5936B)) {
            return 0;
        }
        if (str.startsWith(f5995m)) {
            return 3;
        }
        if (str.startsWith(f5996n)) {
            return 6;
        }
        return -1;
    }

    /* renamed from: c */
    public C1443as mo6824c(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f6010aB;
        }
        C1443as t = C1368X.m6320c().mo5842o().mo5969t(str);
        if (t == null) {
            t = C1368X.m6320c().mo5841n().mo6286m(str);
        }
        if (t == null) {
            t = C1368X.m6320c().mo5837j().mo6041c(str);
        }
        if (t == null) {
            return C1368X.m6320c().mo5845r().mo7210n(str);
        }
        return t;
    }

    /* renamed from: b */
    private void m8336b(String str, boolean z) {
    }

    /* renamed from: c */
    private void m8338c(int i, String str) {
        Message obtain = Message.obtain((Handler) null, 4);
        Bundle bundle = new Bundle();
        bundle.putInt(IPCManager.EXTRA_ACTION_TYPE, 10);
        bundle.putInt(f5998p, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(f5999q, str);
        }
        obtain.setData(bundle);
        if (C1368X.m6324d()) {
            C1368X.m6320c().mo5839l().notifyOtherProcesses(obtain);
        }
    }
}
