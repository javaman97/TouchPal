package com.cootek.smartinput5.p046b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1361R;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p045a.C1060e;
import com.emoji.keyboard.touchpal.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* renamed from: com.cootek.smartinput5.b.b */
/* compiled from: ConfigurationManager */
public class C1132b {

    /* renamed from: a */
    public static final String f3169a = "Config";

    /* renamed from: b */
    public static final String f3170b = "com.cootek.smartinput";

    /* renamed from: c */
    public static final String f3171c = "file:///android_data/";

    /* renamed from: d */
    public static final boolean f3172d = true;

    /* renamed from: e */
    public static final String f3173e = "Configurations";

    /* renamed from: f */
    public static final String f3174f = "Option";

    /* renamed from: g */
    public static final String f3175g = "key";

    /* renamed from: h */
    public static final String f3176h = "value";

    /* renamed from: i */
    public static final String f3177i = "type";

    /* renamed from: j */
    public static final String f3178j = "visible";

    /* renamed from: k */
    public static final String f3179k = "boolean";

    /* renamed from: l */
    public static final String f3180l = "integer";

    /* renamed from: m */
    public static final String f3181m = "string";

    /* renamed from: n */
    private static final C1135d[] f3182n = new C1135d[0];

    /* renamed from: o */
    private static C1132b f3183o;

    /* renamed from: p */
    private Context f3184p;

    /* renamed from: q */
    private final boolean f3185q;

    /* renamed from: r */
    private final boolean f3186r;

    /* renamed from: s */
    private boolean f3187s;

    /* renamed from: t */
    private HashMap<String, C1131a> f3188t;

    /* renamed from: u */
    private C1361R f3189u;

    private C1132b(Context context) {
        this.f3184p = context;
        this.f3185q = context.getResources().getBoolean(R.bool.late_config_item_overwrite_early);
        this.f3186r = context.getResources().getBoolean(R.bool.is_oem_version);
        m5666j();
        mo4409c();
    }

    /* renamed from: a */
    public static synchronized C1132b m5654a(Context context) {
        C1132b bVar;
        synchronized (C1132b.class) {
            if (f3183o == null) {
                f3183o = new C1132b(context);
            }
            bVar = f3183o;
        }
        return bVar;
    }

    /* renamed from: a */
    public static boolean m5662a() {
        return f3183o != null;
    }

    /* renamed from: b */
    public boolean mo4408b() {
        return true;
    }

    /* renamed from: c */
    public void mo4409c() {
    }

    /* renamed from: c */
    private C1131a m5664c(String str) {
        C1131a aVar = this.f3188t.get(str);
        return aVar == null ? C1131a.f3161a : aVar;
    }

    /* renamed from: a */
    public Boolean mo4392a(C1135d dVar, Boolean bool) {
        return (Boolean) mo4401a(dVar.toString(), (Object) bool);
    }

    /* renamed from: a */
    public Boolean mo4394a(C1135d dVar, String[] strArr, Boolean bool) {
        return (Boolean) m5656a(dVar.toString(), strArr, (Object) bool);
    }

    /* renamed from: a */
    public Boolean mo4393a(C1135d dVar, String str, Boolean bool) {
        return mo4394a(dVar, new String[]{str}, bool);
    }

    /* renamed from: a */
    public Integer mo4397a(C1135d dVar, Integer num) {
        return (Integer) mo4401a(dVar.toString(), (Object) num);
    }

    /* renamed from: a */
    public Integer mo4399a(C1135d dVar, String[] strArr, Integer num) {
        return (Integer) m5656a(dVar.toString(), strArr, (Object) num);
    }

    /* renamed from: a */
    public Integer mo4398a(C1135d dVar, String str, Integer num) {
        return mo4399a(dVar, new String[]{str}, num);
    }

    /* renamed from: a */
    public String mo4402a(C1135d dVar, String str) {
        return (String) mo4401a(dVar.toString(), (Object) str);
    }

    /* renamed from: a */
    public String mo4404a(C1135d dVar, String[] strArr, String str) {
        return (String) m5656a(dVar.toString(), strArr, (Object) str);
    }

    /* renamed from: a */
    public String mo4403a(C1135d dVar, String str, String str2) {
        return mo4404a(dVar, new String[]{str}, str2);
    }

    /* renamed from: a */
    public Object mo4400a(String str) {
        return mo4401a(str, (Object) null);
    }

    /* renamed from: a */
    public Object mo4401a(String str, Object obj) {
        return m5656a(str, (String[]) null, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = m5664c(r2).mo4387a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m5656a(java.lang.String r2, java.lang.String[] r3, java.lang.Object r4) {
        /*
            r1 = this;
            boolean r0 = r1.mo4408b()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return r4
        L_0x0007:
            com.cootek.smartinput5.b.a r0 = r1.m5664c((java.lang.String) r2)
            java.lang.Object r0 = r0.mo4387a((java.lang.String[]) r3)
            if (r0 == 0) goto L_0x0006
            r4 = r0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p046b.C1132b.m5656a(java.lang.String, java.lang.String[], java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public Boolean mo4406b(String str) {
        return mo4395a(str, (Boolean) true);
    }

    /* renamed from: a */
    public Boolean mo4395a(String str, Boolean bool) {
        return mo4396a(str, (String[]) null, bool);
    }

    /* renamed from: a */
    public Boolean mo4396a(String str, String[] strArr, Boolean bool) {
        Boolean b;
        if (mo4408b() && (b = m5664c(str).mo4389b(strArr)) != null) {
            return b;
        }
        return bool;
    }

    /* renamed from: a */
    public void mo4405a(PreferenceGroup preferenceGroup) {
        boolean z;
        int i;
        if (preferenceGroup != null) {
            int i2 = 0;
            while (i2 < preferenceGroup.getPreferenceCount()) {
                Preference preference = preferenceGroup.getPreference(i2);
                if (TextUtils.isEmpty(preferenceGroup.getKey()) || mo4395a(preference.getKey(), (Boolean) true).booleanValue()) {
                    z = false;
                } else {
                    z = preferenceGroup.removePreference(preference);
                }
                if (!z && (preference instanceof PreferenceGroup)) {
                    mo4405a((PreferenceGroup) preference);
                }
                if (!z) {
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                i2 = i;
            }
        }
    }

    /* renamed from: a */
    public File mo4391a(int i) {
        for (String file : C1974m.m9070b(this.f3184p, i)) {
            File file2 = new File(file);
            if (file2.exists()) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo4410d() {
        return this.f3186r;
    }

    /* renamed from: j */
    private void m5666j() {
        this.f3187s = !this.f3186r && !mo4411e();
        this.f3188t = new HashMap<>();
        m5668l();
    }

    /* renamed from: e */
    public boolean mo4411e() {
        List<InputMethodInfo> list;
        try {
            list = ((InputMethodManager) this.f3184p.getSystemService("input_method")).getInputMethodList();
        } catch (Exception e) {
            list = null;
        }
        if (list == null) {
            return false;
        }
        for (InputMethodInfo packageName : list) {
            String packageName2 = packageName.getPackageName();
            if (!TextUtils.isEmpty(packageName2) && C1584bI.m7147b(this.f3184p, packageName2) && packageName2.indexOf(f3170b) >= 0) {
                C1060e.m5598b().mo4275a(C1060e.f3018i, true, false);
                try {
                    C1060e.m5598b().mo4275a(C1060e.f3019j, Integer.valueOf(this.f3184p.getPackageManager().getPackageInfo(packageName2, 0).versionCode), false);
                } catch (PackageManager.NameNotFoundException e2) {
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m5667k() {
        return this.f3187s;
    }

    /* renamed from: l */
    private void m5668l() {
        if (this.f3184p.getResources().getBoolean(R.bool.config_enabled)) {
            Context context = this.f3184p;
            m5660a(C1974m.m9070b(context, R.array.config_file_path), this.f3185q);
            mo4413g();
            m5660a(C1974m.m9070b(context, R.array.config_file_name_buildin), this.f3185q);
            if (m5667k()) {
                m5660a(C1974m.m9070b(context, R.array.config_file_name_buildin_online_only), this.f3185q);
            }
            m5660a(C1974m.m9070b(context, R.array.config_file_name_buildin_reserved), true);
            m5661a(C1974m.m9070b(context, R.array.config_file_name_buildin_oem_only_const), true, true);
            if (mo4410d()) {
                mo4407b(context);
            }
            m5665c(context);
        }
    }

    /* renamed from: f */
    public C1361R mo4412f() {
        return this.f3189u;
    }

    /* renamed from: c */
    private void m5665c(Context context) {
        int i;
        this.f3189u = C1361R.m6244a(context, ((Integer) mo4401a(Settings.getKeyById(Settings.CURRENT_PERFORMANCE_MODE), (Object) 0)).intValue(), new C1134c(this));
        if (this.f3189u == null) {
            this.f3189u = C1361R.FULL;
        }
        switch (this.f3189u) {
            case COMPACT:
                i = R.array.config_file_compact;
                break;
            case ECONOMIC:
                i = R.array.config_file_economic;
                break;
            default:
                i = -1;
                break;
        }
        if (i != -1) {
            m5660a(C1974m.m9070b(context, i), true);
        }
    }

    /* renamed from: b */
    public void mo4407b(Context context) {
        m5660a(C1974m.m9070b(context, R.array.config_file_name_buildin_oem_only_const), false);
    }

    /* renamed from: a */
    private void m5660a(String[] strArr, boolean z) {
        m5661a(strArr, z, false);
    }

    /* renamed from: a */
    private void m5661a(String[] strArr, boolean z, boolean z2) {
        for (String str : strArr) {
            if (str.startsWith("/")) {
                m5658a(new File(str), z, z2);
            } else if (str.startsWith(f3171c)) {
                m5658a(C1466av.m6849a(this.f3184p, str.replace(f3171c, "")), z, z2);
            } else {
                try {
                    m5659a(C1460o.m6799b().mo6099a(this.f3184p, str), z, z2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private void m5658a(File file, boolean z, boolean z2) {
        if (file != null && file.exists()) {
            try {
                m5659a((InputStream) new FileInputStream(file), z, z2);
            } catch (FileNotFoundException e) {
            }
        }
    }

    /* renamed from: a */
    private void m5659a(InputStream inputStream, boolean z, boolean z2) {
        C1131a b;
        try {
            DocumentBuilder newDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            if (inputStream != null) {
                NodeList childNodes = newDocumentBuilder.parse(inputStream).getDocumentElement().getChildNodes();
                if (childNodes != null) {
                    for (int i = 0; i < childNodes.getLength(); i++) {
                        Node item = childNodes.item(i);
                        if (f3174f.equalsIgnoreCase(item.getNodeName()) && (b = m5663b(item)) != null && ((z || !this.f3188t.containsKey(b.mo4388a())) && (!z2 || !TextUtils.equals(b.mo4388a(), C1135d.IME_CHANNEL_CODE.toString())))) {
                            this.f3188t.put(b.mo4388a(), b);
                        }
                    }
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } else if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        } catch (ParserConfigurationException e3) {
            e3.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        } catch (SAXException e5) {
            e5.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    private HashMap<String, C1131a> m5657a(Node node) {
        if (node.hasChildNodes()) {
            HashMap<String, C1131a> hashMap = new HashMap<>();
            NodeList childNodes = node.getChildNodes();
            if (childNodes != null) {
                for (int i = 0; i < childNodes.getLength(); i++) {
                    if (f3174f.equalsIgnoreCase(childNodes.item(i).getNodeName())) {
                        C1131a b = m5663b(childNodes.item(i));
                        hashMap.put(b.mo4388a(), b);
                    }
                }
                return hashMap;
            }
        }
        return null;
    }

    /* renamed from: b */
    private C1131a m5663b(Node node) {
        String str = null;
        NamedNodeMap attributes = node.getAttributes();
        Node namedItem = attributes.getNamedItem(f3175g);
        if (namedItem == null) {
            return null;
        }
        Node namedItem2 = attributes.getNamedItem("value");
        Node namedItem3 = attributes.getNamedItem(f3178j);
        Node namedItem4 = attributes.getNamedItem("type");
        String nodeValue = namedItem.getNodeValue();
        String nodeValue2 = namedItem4 == null ? null : namedItem4.getNodeValue();
        Boolean valueOf = namedItem3 == null ? null : Boolean.valueOf(Boolean.parseBoolean(namedItem3.getNodeValue()));
        if (namedItem2 != null) {
            str = namedItem2.getNodeValue();
        }
        return new C1131a(nodeValue, m5655a(nodeValue2, str), valueOf, m5657a(node));
    }

    /* renamed from: a */
    private Object m5655a(String str, String str2) {
        if (f3179k.equalsIgnoreCase(str)) {
            return Boolean.valueOf(Boolean.parseBoolean(str2));
        }
        if (!"integer".equalsIgnoreCase(str)) {
            return str2;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str2));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public void mo4413g() {
        for (C1135d dVar : f3182n) {
            this.f3188t.remove(dVar.toString());
        }
    }

    /* renamed from: h */
    public String mo4414h() {
        return (String) mo4401a(C1135d.IME_CHANNEL_CODE.toString(), (Object) C1974m.m9063a(this.f3184p, (int) R.string.ime_channel_code));
    }

    /* renamed from: i */
    public String mo4415i() {
        if (Settings.isInitialized()) {
            return Settings.getInstance().getStringSetting(Settings.RECOMMEND_CHANNEL_CODE);
        }
        return null;
    }
}
