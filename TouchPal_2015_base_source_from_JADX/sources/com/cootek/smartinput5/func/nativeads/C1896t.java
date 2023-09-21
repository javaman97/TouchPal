package com.cootek.smartinput5.func.nativeads;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1617br;
import com.cootek.smartinput5.func.skin.C1997k;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2373x;
import com.cootek.smartinput5.net.cmd.C2294q;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.nativeads.t */
/* compiled from: NativeAdsManager */
public class C1896t {

    /* renamed from: a */
    public static boolean f6343a = true;

    /* renamed from: b */
    private static final String f6344b = "NativeAdsManager";

    /* renamed from: c */
    private static final String f6345c = "ads_icon_";

    /* renamed from: d */
    private static final String f6346d = "strategies";

    /* renamed from: e */
    private static C1896t f6347e = new C1896t();

    /* renamed from: f */
    private String f6348f = null;

    /* renamed from: g */
    private HashMap<String, C1902y> f6349g = new HashMap<>();

    /* renamed from: h */
    private HashMap<String, C1878c> f6350h = new HashMap<>();

    /* renamed from: i */
    private C2373x f6351i = null;

    /* renamed from: com.cootek.smartinput5.func.nativeads.t$a */
    /* compiled from: NativeAdsManager */
    public interface C1897a {
        /* renamed from: a */
        void mo7030a(C1900w wVar);

        /* renamed from: a */
        void mo7031a(String str);
    }

    private C1896t() {
    }

    /* renamed from: a */
    public static C1896t m8712a() {
        return f6347e;
    }

    /* renamed from: a */
    public void mo7035a(String str, String str2, C1897a aVar) {
        C2294q qVar = new C2294q();
        C1368X.m6313b();
        qVar.f10055a = str;
        if (str2 != null) {
            qVar.mo7897a(str2);
        }
        new C2373x(qVar).mo8060a((C2373x.C2376b) new C1898u(this, aVar));
    }

    /* renamed from: b */
    public void mo7037b() {
        if (f6343a) {
            this.f6348f = Settings.getInstance().getStringSetting(Settings.ADVERTISE_STRATEGY);
            m8713e();
        }
    }

    /* renamed from: c */
    public void mo7038c() {
        if (f6343a) {
            if (this.f6351i != null) {
                this.f6351i.mo8061b();
            }
            String stringSetting = Settings.getInstance().getStringSetting(Settings.ADVERTISE_STRATEGY);
            if (!TextUtils.isEmpty(stringSetting) && !stringSetting.equalsIgnoreCase(this.f6348f)) {
                this.f6348f = stringSetting;
                m8715g();
                m8713e();
            }
        }
    }

    /* renamed from: e */
    private void m8713e() {
        this.f6349g = new HashMap<>();
        this.f6350h = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONObject(this.f6348f).getJSONArray(f6346d);
            for (int i = 0; i < jSONArray.length(); i++) {
                C1902y yVar = new C1902y(jSONArray.getJSONObject(i));
                if (yVar != null && yVar.mo7049c()) {
                    this.f6349g.put(yVar.f6436b, yVar);
                    this.f6350h.put(yVar.f6436b, C1901x.m8735a(yVar));
                }
            }
        } catch (JSONException e) {
        }
    }

    /* renamed from: d */
    public void mo7040d() {
        if (f6343a && this.f6349g != null && this.f6349g.size() != 0 && this.f6350h != null && this.f6350h.size() != 0 && m8716h() && C1358O.m6239b() != null) {
            for (C1878c c : this.f6350h.values()) {
                c.mo7013c();
            }
        }
    }

    /* renamed from: a */
    public void mo7034a(String str) {
        if (m8714f() && this.f6350h.containsKey(str)) {
            this.f6350h.get(str).mo7010a();
        }
    }

    /* renamed from: b */
    public C1875a mo7036b(String str) {
        if (m8714f() && this.f6350h.containsKey(str)) {
            return this.f6350h.get(str).mo7012b();
        }
        return null;
    }

    /* renamed from: c */
    public void mo7039c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (C1878c a : this.f6350h.values()) {
                a.mo7011a(str);
            }
            C1997k.m9167a().mo7303b(str);
        }
    }

    /* renamed from: f */
    private boolean m8714f() {
        if (f6343a && !C1617br.m7367a().mo6335b() && C2188Q.m9853a().mo7686f()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m8715g() {
        String[] list;
        File a = C1358O.m6234a(C1358O.f4201l);
        if (a != null && (list = a.list()) != null) {
            for (String str : list) {
                if (str.startsWith("ads_icon_")) {
                    File file = new File(a, str);
                    if (file.isFile() && file.exists()) {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private boolean m8716h() {
        if (!C2188Q.m9853a().mo7686f()) {
            return false;
        }
        if (C2188Q.m9853a().mo7685e()) {
            return true;
        }
        if (C2188Q.m9855i()) {
            return false;
        }
        if (((TelephonyManager) C1368X.m6313b().getSystemService("phone")).getNetworkType() == 0) {
            return false;
        }
        return true;
    }
}
