package com.cootek.smartinput5.func.smileypanel.p057b.p058a;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.smileypanel.C2051e;
import com.cootek.smartinput5.func.smileypanel.p062e.C2053b;
import com.cootek.smartinput5.func.smileypanel.p062e.C2055d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.smileypanel.b.a.i */
/* compiled from: RecentRecord */
public class C2020i {

    /* renamed from: a */
    private static final int f7025a = 20;

    /* renamed from: b */
    private static final int f7026b = 40;

    /* renamed from: c */
    private static C2020i f7027c = new C2020i();

    /* renamed from: d */
    private static final String f7028d = "tag";

    /* renamed from: e */
    private static final String f7029e = "time";

    /* renamed from: f */
    private final C2055d[] f7030f = {C2053b.u1f51c, C2053b.u1f51b, C2053b.u1f519, C2053b.u1f51d, C2053b.u1f3e3, C2053b.u1f3e2, C2053b.u1f3e1, C2053b.u1f3e0, C2053b.u1f45f, C2053b.u1f45e, C2053b.u1f484, C2053b.u1f530, C2053b.u1f42d, C2053b.u1f431, C2053b.u1f429, C2053b.u1f436, C2053b.u1f603, C2053b.u1f602, C2053b.u1f601, C2053b.u1f60a};

    /* renamed from: g */
    private HashMap<String, Integer> f7031g = new HashMap<>();

    /* renamed from: h */
    private ArrayList<C2019h> f7032h = new ArrayList<>();

    private C2020i() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        int i = 0;
        String stringSetting = Settings.getInstance().getStringSetting(Settings.EMOJI_RECENT_RECODE);
        if (!TextUtils.isEmpty(stringSetting)) {
            try {
                jSONArray = new JSONArray(stringSetting);
            } catch (JSONException e) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                while (true) {
                    int i2 = i;
                    if (i2 >= jSONArray.length()) {
                        break;
                    }
                    try {
                        jSONObject = (JSONObject) jSONArray.get(i2);
                    } catch (JSONException e2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("tag");
                        if (this.f7031g.get(optString) == null) {
                            Long valueOf = Long.valueOf(jSONObject.optLong("time"));
                            C2019h hVar = new C2019h(optString);
                            hVar.mo7370a(valueOf.longValue());
                            this.f7031g.put(optString, Integer.valueOf(this.f7032h.size()));
                            this.f7032h.add(hVar);
                        }
                    }
                    i = i2 + 1;
                }
            }
        } else {
            String stringSetting2 = Settings.getInstance().getStringSetting(Settings.RECENTLY_USED_EMOJI);
            if (!TextUtils.isEmpty(stringSetting2)) {
                m9333a(stringSetting2);
                Settings.getInstance().setStringSetting(Settings.RECENTLY_USED_EMOJI, "", false);
            }
        }
        if (this.f7032h.size() == 0) {
            m9334c();
        }
        if (this.f7032h.size() < 20) {
            m9335d();
        }
    }

    /* renamed from: a */
    private void m9333a(String str) {
        String[] split = str.split("\\},\\{");
        if (split != null) {
            for (String split2 : split) {
                String[] split3 = split2.split(",");
                String str2 = null;
                if (split3 != null) {
                    for (String str3 : split3) {
                        if (str3.contains("\"")) {
                            str2 = str3.replace("\"", "").trim();
                        }
                    }
                }
                if (str2 != null && str2.startsWith(C1351J.f4162g)) {
                    C2019h hVar = new C2019h(str2);
                    hVar.mo7370a(System.currentTimeMillis());
                    this.f7031g.put(str2, Integer.valueOf(this.f7032h.size()));
                    this.f7032h.add(hVar);
                }
            }
            m9336e();
        }
    }

    /* renamed from: c */
    private void m9334c() {
        for (int i = 0; i < this.f7030f.length; i++) {
            C2019h hVar = new C2019h(this.f7030f[i].toString());
            hVar.mo7370a(System.currentTimeMillis());
            this.f7031g.put(this.f7030f[i].toString(), Integer.valueOf(this.f7032h.size()));
            this.f7032h.add(hVar);
        }
        m9336e();
    }

    /* renamed from: d */
    private void m9335d() {
        int size = this.f7032h.size();
        long f = this.f7032h.get(0).mo7375f();
        ArrayList<C2019h> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f7030f.length; i++) {
            C2019h hVar = new C2019h(this.f7030f[i].toString());
            String d = hVar.mo7373d();
            if (!TextUtils.isEmpty(d) && this.f7031g.get(d) == null) {
                hVar.mo7370a((f - ((long) size)) + ((long) i));
                this.f7031g.put(d, Integer.valueOf(this.f7032h.size()));
                arrayList.add(hVar);
            }
        }
        arrayList.addAll(this.f7032h);
        this.f7032h = arrayList;
        m9336e();
    }

    /* renamed from: a */
    public static C2020i m9332a() {
        return f7027c;
    }

    /* renamed from: b */
    public ArrayList<C2019h> mo7377b() {
        return this.f7032h;
    }

    /* renamed from: a */
    public void mo7376a(C2051e eVar) {
        if (eVar.mo7374e()) {
            String d = eVar.mo7373d();
            Integer num = this.f7031g.get(d);
            if (num == null) {
                C2019h hVar = new C2019h(d);
                hVar.mo7370a(System.currentTimeMillis());
                if (this.f7032h.size() > 40) {
                    long f = this.f7032h.get(0).mo7375f();
                    int i = 1;
                    int i2 = 0;
                    while (true) {
                        int i3 = i;
                        if (i3 < this.f7032h.size()) {
                            C2019h hVar2 = this.f7032h.get(i3);
                            if (hVar2.mo7375f() < f) {
                                f = hVar2.mo7375f();
                                i2 = i3;
                            }
                            i = i3 + 1;
                        } else {
                            this.f7032h.add(i2, hVar);
                            this.f7032h.remove(i2 + 1);
                            this.f7031g.put(d, Integer.valueOf(i2));
                            return;
                        }
                    }
                } else {
                    this.f7031g.put(d, Integer.valueOf(this.f7032h.size()));
                    this.f7032h.add(hVar);
                    m9336e();
                }
            } else {
                this.f7032h.get(num.intValue()).mo7370a(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: e */
    private void m9336e() {
        JSONArray jSONArray = new JSONArray();
        Iterator<C2019h> it = this.f7032h.iterator();
        while (it.hasNext()) {
            C2019h next = it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("tag", next.mo7373d());
                jSONObject.put("time", next.mo7375f());
            } catch (JSONException e) {
            }
            jSONArray.put(jSONObject);
        }
        Settings.getInstance().setStringSetting(Settings.EMOJI_RECENT_RECODE, jSONArray.toString(), false);
    }
}
