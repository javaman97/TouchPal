package com.cootek.smartinput5.net;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1358O;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.y */
/* compiled from: IdentifyInfo */
public class C2377y {

    /* renamed from: a */
    private static final String f10448a = "IdentifyInfo";

    /* renamed from: b */
    private static C2377y f10449b;

    /* renamed from: a */
    public static synchronized C2377y m10894a(Context context) {
        C2377y yVar;
        synchronized (C2377y.class) {
            if (f10449b == null) {
                f10449b = new C2377y(context);
            }
            yVar = f10449b;
        }
        return yVar;
    }

    public C2377y(Context context) {
        C2379a.m10904c(context);
    }

    /* renamed from: a */
    public String mo8067a() {
        return m10895a(C2379a.f10450a);
    }

    /* renamed from: b */
    public String mo8068b() {
        return m10895a(C2379a.f10451b);
    }

    /* renamed from: c */
    public String mo8069c() {
        return m10895a(C2379a.f10452c);
    }

    /* renamed from: d */
    public String mo8070d() {
        return m10895a(C2379a.f10453d);
    }

    /* renamed from: e */
    public String mo8071e() {
        return m10895a(C2379a.f10454e);
    }

    /* renamed from: a */
    private String m10895a(C2379a aVar) {
        if (aVar == null) {
            return "";
        }
        return aVar.mo8076d();
    }

    /* renamed from: com.cootek.smartinput5.net.y$a */
    /* compiled from: IdentifyInfo */
    public enum C2379a {
        f10450a;
        

        /* renamed from: f */
        private String f10456f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract String mo7613a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract String mo7614a(Context context);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo7615b() {
            if (!Settings.isInitialized()) {
                return null;
            }
            return Settings.getInstance().getStringSetting(m10905e(), 32, mo7613a(), (Config) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo8073a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return jSONObject.optString(mo7613a());
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7616c() {
            if (Settings.isInitialized()) {
                Settings.getInstance().setStringSetting(m10905e(), this.f10456f, 32, mo7613a(), (Config) null, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo8075b(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    jSONObject.put(mo7613a(), this.f10456f);
                } catch (JSONException e) {
                }
            }
        }

        /* renamed from: e */
        private int m10905e() {
            return Settings.MOBIL_IDENTIFY_INFORMATION;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo8074a(Context context, JSONObject jSONObject) {
            String b = mo7615b();
            String a = mo8073a(jSONObject);
            if (TextUtils.isEmpty(b) && TextUtils.isEmpty(a)) {
                try {
                    this.f10456f = mo7614a(context);
                } catch (Exception e) {
                    this.f10456f = "";
                }
                mo7616c();
                mo8075b(jSONObject);
            } else if (!TextUtils.isEmpty(b)) {
                this.f10456f = b;
                if (!b.equals(a)) {
                    mo8075b(jSONObject);
                }
            } else {
                this.f10456f = a;
                mo7616c();
            }
        }

        /* renamed from: d */
        public final String mo8076d() {
            return this.f10456f;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m10904c(Context context) {
            File file;
            JSONObject jSONObject;
            String str;
            File a = C1358O.m6235a(C1358O.f4205p, true);
            if (a == null || !a.isDirectory()) {
                file = null;
            } else {
                file = new File(a, C1358O.f4184A);
            }
            if (file == null || (str = (String) C0997e.m5187b(file)) == null) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    jSONObject = null;
                }
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            for (C2379a a2 : values()) {
                a2.mo8074a(context, jSONObject);
            }
            m10902a(file, jSONObject);
        }

        /* renamed from: a */
        private static void m10902a(File file, JSONObject jSONObject) {
            if (Settings.isInitialized()) {
                Settings.getInstance().writeBack();
            }
            C0997e.m5175a(file, (Object) jSONObject.toString());
        }
    }

    /* renamed from: f */
    public void mo8072f() {
        f10449b = null;
    }
}
