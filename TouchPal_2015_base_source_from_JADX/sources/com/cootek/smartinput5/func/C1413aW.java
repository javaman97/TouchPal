package com.cootek.smartinput5.func;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p047c.C1195U;
import com.cootek.smartinput5.p047c.C1199d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.func.aW */
/* compiled from: PluginManager */
public class C1413aW implements C1441aq, C1602bh.C1604b {

    /* renamed from: a */
    public static final String f4515a = "plugin";

    /* renamed from: b */
    private Context f4516b;

    /* renamed from: c */
    private final int f4517c;

    /* renamed from: d */
    private final String f4518d;

    /* renamed from: e */
    private ArrayList<C1414a> f4519e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C1810j> f4520f;

    /* renamed from: g */
    private C1195U f4521g;

    /* renamed from: com.cootek.smartinput5.func.aW$a */
    /* compiled from: PluginManager */
    public interface C1414a {
        /* renamed from: a */
        void mo6048a();
    }

    public C1413aW(Context context) {
        this.f4516b = context;
        this.f4517c = Build.VERSION.SDK_INT;
        this.f4518d = C1974m.m9063a(context, (int) R.string.SHORTCUT_PLUGIN_PACK_TARGET_VERSION);
        C1368X.m6320c().mo5841n().mo6254a((C1602bh.C1604b) this);
        m6632i();
        C1811k.m8322a().mo6817a((C1441aq) this);
    }

    /* renamed from: a */
    public void mo6038a(C1414a aVar) {
        this.f4519e.add(aVar);
    }

    /* renamed from: b */
    public void mo6040b(C1414a aVar) {
        this.f4519e.remove(aVar);
    }

    /* renamed from: c */
    public void mo6042c() {
        this.f4519e.clear();
    }

    /* renamed from: i */
    public void mo5948i(String str) {
        m6632i();
        Iterator<C1414a> it = this.f4519e.iterator();
        while (it.hasNext()) {
            it.next().mo6048a();
        }
    }

    /* renamed from: j */
    public void mo5951j(String str) {
        m6632i();
        Iterator<C1414a> it = this.f4519e.iterator();
        while (it.hasNext()) {
            it.next().mo6048a();
        }
    }

    /* renamed from: a */
    public void mo5928a() {
        m6632i();
        Iterator<C1414a> it = this.f4519e.iterator();
        while (it.hasNext()) {
            it.next().mo6048a();
        }
    }

    /* renamed from: a */
    public void mo5933a(boolean z) {
    }

    /* renamed from: b */
    public int mo5935b() {
        return 0;
    }

    /* renamed from: d */
    public void mo6043d() {
        m6632i();
    }

    /* renamed from: e */
    public Context mo6044e() {
        return this.f4516b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1411aV mo6037a(String str) {
        Iterator<C1810j> it = this.f4520f.iterator();
        while (it.hasNext()) {
            C1411aV aVVar = (C1411aV) it.next();
            if (aVVar.f4501D.equals(str)) {
                return aVVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo6039b(String str) {
        C1411aV a = mo6037a(str);
        if (a != null) {
            return a.f4503F;
        }
        return null;
    }

    /* renamed from: f */
    public void mo6045f() {
        String[] split;
        C1411aV aVVar;
        String stringSetting = Settings.getInstance().getStringSetting(79);
        if (!TextUtils.isEmpty(stringSetting) && (split = stringSetting.split("/")) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap = new HashMap();
            Iterator<C1810j> it = this.f4520f.iterator();
            while (it.hasNext()) {
                C1411aV aVVar2 = (C1411aV) it.next();
                if (aVVar2.f4505H == 1) {
                    arrayList.add(aVVar2);
                } else if (aVVar2.f4505H == 2) {
                    arrayList2.add(aVVar2);
                } else {
                    hashMap.put(aVVar2.f4501D, aVVar2);
                }
            }
            ArrayList<C1810j> arrayList4 = new ArrayList<>();
            arrayList4.addAll(arrayList);
            for (String split2 : split) {
                String[] split3 = split2.split(":");
                if (!(split3 == null || split3.length <= 1 || (aVVar = (C1411aV) hashMap.get(split3[0])) == null)) {
                    aVVar.f4507J = Boolean.parseBoolean(split3[1]);
                    arrayList3.add(aVVar);
                    hashMap.remove(split3[0]);
                }
            }
            Iterator<C1810j> it2 = this.f4520f.iterator();
            while (it2.hasNext()) {
                C1411aV aVVar3 = (C1411aV) it2.next();
                if (hashMap.containsKey(aVVar3.f4501D)) {
                    arrayList4.add(aVVar3);
                } else if (arrayList3.size() > 0) {
                    arrayList3.remove(0);
                    arrayList4.add((C1411aV) arrayList3.get(0));
                }
            }
            arrayList4.addAll(arrayList2);
            this.f4520f = arrayList4;
        }
    }

    /* renamed from: g */
    public ArrayList<C1810j> mo6046g() {
        return this.f4520f;
    }

    /* renamed from: i */
    private void m6632i() {
        this.f4520f = C1811k.m8322a().mo6813a(0, (String) null);
        int i = 0;
        while (i < this.f4520f.size()) {
            C1411aV aVVar = (C1411aV) this.f4520f.get(i);
            if (!this.f4518d.equals(aVVar.f5933b) && !aVVar.mo6810a().equals(this.f4516b.getPackageName())) {
                this.f4520f.remove(i);
            } else if (aVVar.f4506I > this.f4517c) {
                this.f4520f.remove(i);
            } else {
                i++;
            }
        }
        mo6045f();
    }

    /* renamed from: c */
    public C1443as mo6041c(String str) {
        Iterator<C1810j> it = this.f4520f.iterator();
        while (it.hasNext()) {
            C1810j next = it.next();
            if (next.mo6810a().equals(str)) {
                return next.f5932a;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m6631d(String str) {
        C1199d a = C1194T.m5771a(str);
        if (a != null) {
            return a.mo4459g();
        }
        return false;
    }

    /* renamed from: h */
    public C1195U mo6047h() {
        if (this.f4521g == null) {
            this.f4521g = new C1195U();
        }
        return this.f4521g;
    }
}
