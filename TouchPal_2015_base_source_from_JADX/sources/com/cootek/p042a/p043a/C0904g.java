package com.cootek.p042a.p043a;

import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.cootek.p042a.p043a.C0902f;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1439ao;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.C2934m;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.a.a.g */
/* compiled from: PerfDataManager */
public class C0904g {

    /* renamed from: d */
    private static C0904g f2432d = new C0904g();

    /* renamed from: a */
    private boolean f2433a = true;

    /* renamed from: b */
    private C0900d[] f2434b = new C0900d[C0902f.C0903a.values().length];

    /* renamed from: c */
    private String f2435c;

    static {
        C0902f.m4914a();
    }

    /* renamed from: a */
    public static C0904g m4916a() {
        return f2432d;
    }

    C0904g() {
    }

    /* renamed from: a */
    public void mo3407a(boolean z) {
        this.f2433a = z;
    }

    /* renamed from: b */
    public boolean mo3410b() {
        return this.f2433a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3406a(C0902f.C0903a aVar) {
        if (aVar != null) {
            this.f2434b[aVar.ordinal()] = new C0900d(aVar.mo3403a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0900d mo3408b(C0902f.C0903a aVar) {
        if (aVar == null || !mo3410b()) {
            return null;
        }
        return this.f2434b[aVar.ordinal()];
    }

    /* renamed from: a */
    public synchronized void mo3404a(C0898b bVar) {
        for (C0902f.C0903a b : C0902f.C0903a.values()) {
            C0900d b2 = mo3408b(b);
            if (b2 != null) {
                b2.mo3396d().mo3421a(bVar);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo3409b(C0898b bVar) {
        for (C0902f.C0903a b : C0902f.C0903a.values()) {
            C0900d b2 = mo3408b(b);
            if (b2 != null) {
                b2.mo3396d().mo3424b(bVar);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo3405a(C0898b bVar, long j) {
        for (C0902f.C0903a b : C0902f.C0903a.values()) {
            C0900d b2 = mo3408b(b);
            if (b2 != null) {
                b2.mo3396d().mo3422a(bVar, j);
            }
        }
    }

    /* renamed from: c */
    public synchronized void mo3412c(C0902f.C0903a aVar) {
        if (Engine.isInitialized()) {
            String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
            if (!TextUtils.isEmpty(this.f2435c) && !TextUtils.isEmpty(currentLanguageId) && !this.f2435c.equalsIgnoreCase(currentLanguageId)) {
                mo3416e(aVar);
            }
            this.f2435c = currentLanguageId;
        }
        C0900d b = mo3408b(aVar);
        if (b != null) {
            b.mo3396d().mo3430e();
        }
    }

    /* renamed from: d */
    public synchronized void mo3414d(C0902f.C0903a aVar) {
        C0900d b = mo3408b(aVar);
        if (b != null) {
            b.mo3396d().mo3431f();
        }
    }

    /* renamed from: c */
    public synchronized void mo3411c() {
        for (C0902f.C0903a d : C0902f.C0903a.values()) {
            mo3414d(d);
        }
    }

    /* renamed from: e */
    public synchronized void mo3416e(C0902f.C0903a aVar) {
        C0900d b = mo3408b(aVar);
        if (b != null) {
            b.mo3396d().mo3420a();
        }
    }

    /* renamed from: d */
    public synchronized void mo3413d() {
        for (C0902f.C0903a e : C0902f.C0903a.values()) {
            mo3416e(e);
        }
    }

    /* renamed from: e */
    public void mo3415e() {
        for (String str : mo3417f().split(C0911j.f2473c)) {
            if (TextUtils.isEmpty(str)) {
                str = C1351J.f4161f;
            }
            Log.i(C0911j.f2472b, str);
        }
    }

    /* renamed from: f */
    public String mo3417f() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0911j.f2473c);
        sb.append(C0911j.f2473c);
        try {
            sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis())));
            sb.append(C0911j.f2473c);
        } catch (Exception e) {
        }
        sb.append(C0911j.f2473c);
        for (C0898b bVar : C0898b.values()) {
            sb.append(String.format("%2d: %-15s\t", new Object[]{Integer.valueOf(bVar.ordinal()), bVar.name()}));
            if (bVar.ordinal() % 5 == 4) {
                sb.append(C0911j.f2473c);
            }
        }
        sb.append(C0911j.f2473c);
        sb.append(String.format("total count=[%d]", new Object[]{Integer.valueOf(C0898b.values().length)}));
        sb.append(C0911j.f2473c);
        for (C0902f.C0903a b : C0902f.C0903a.values()) {
            C0900d b2 = mo3408b(b);
            if (b2 != null) {
                sb.append(b2.mo3397e());
            }
        }
        sb.append(C0911j.f2473c);
        sb.append(mo3418g());
        return sb.toString();
    }

    /* renamed from: g */
    public String mo3418g() {
        JSONObject g;
        if (!mo3410b()) {
            return "";
        }
        for (C0902f.C0903a b : C0902f.C0903a.values()) {
            C0900d b2 = mo3408b(b);
            if (b2 != null) {
                b2.mo3396d().mo3431f();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("total_pss", C1368X.m6320c().mo5824J().mo6011d());
            jSONObject.put("perf_info", mo3419h());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("data", jSONObject2);
            for (C0902f.C0903a b3 : C0902f.C0903a.values()) {
                C0900d b4 = mo3408b(b3);
                if (!(b4 == null || (g = b4.mo3399g()) == null)) {
                    jSONObject2.put(b4.mo3396d().f2437b.f2448a, g);
                }
            }
        } catch (JSONException e) {
        }
        return jSONObject.toString();
    }

    /* renamed from: h */
    public JSONObject mo3419h() {
        JSONObject jSONObject = new JSONObject();
        try {
            DisplayMetrics displayMetrics = C1368X.m6313b().getResources().getDisplayMetrics();
            if (Settings.getInstance().getConfig().getOrientation() == 2) {
                jSONObject.put("w", displayMetrics.heightPixels);
                jSONObject.put("h", displayMetrics.widthPixels);
            } else {
                jSONObject.put("w", displayMetrics.widthPixels);
                jSONObject.put("h", displayMetrics.heightPixels);
            }
            jSONObject.put("m", Build.MODEL);
            if (Engine.isInitialized()) {
                C2917du widgetManager = Engine.getInstance().getWidgetManager();
                if (widgetManager != null) {
                    C2934m i = widgetManager.mo9651i();
                    if (i != null) {
                        jSONObject.put("ch", i.mo9718d());
                    }
                    C2811cf f = widgetManager.mo9646f();
                    if (f != null) {
                        jSONObject.put("kw", f.mo9192n());
                        jSONObject.put("kh", f.mo9134g());
                    }
                }
                jSONObject.put("lang", this.f2435c);
                jSONObject.put("subtype", Settings.getInstance().getIntSetting(3, 1, C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4831b, 1), (Config) null));
                jSONObject.put("last", Settings.getInstance().getIntSetting(200));
                jSONObject.put("mode", Settings.getInstance().getIntSetting(Settings.CURRENT_PERFORMANCE_MODE));
                jSONObject.put("cpu", C1439ao.m6713a());
                jSONObject.put("mem", C1439ao.m6714b());
            }
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
