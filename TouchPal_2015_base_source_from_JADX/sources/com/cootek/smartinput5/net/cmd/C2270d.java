package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.d */
/* compiled from: CmdBKClear */
public class C2270d extends C2259P {

    /* renamed from: a */
    public static final String f9909a = "CmdBKClear";

    /* renamed from: b */
    public static final String f9910b = "id";

    /* renamed from: c */
    public static final String f9911c = "schema_version";

    /* renamed from: d */
    public static final String f9912d = "result";

    /* renamed from: e */
    public static final int f9913e = 0;

    /* renamed from: f */
    public static final int f9914f = 1;

    /* renamed from: g */
    public static final int f9915g = 2;

    /* renamed from: h */
    private C2271a f9916h;

    /* renamed from: i */
    private C2272b f9917i;

    public C2270d(C2271a aVar) {
        this.f9916h = aVar;
    }

    /* renamed from: j */
    public C2272b mo7842j() {
        return this.f9917i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9916h != null) {
            this.f9916h.mo7845a(jSONObject);
        }
        return super.mo7764a(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        if (this.f9746O == 200) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        this.f9917i = C2272b.m10384a(jSONObject);
        if (this.f9917i != null && this.f9916h != null) {
            this.f9917i.f9921b = this.f9916h.f9918a;
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BK_CLEAR.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9739K;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.d$a */
    /* compiled from: CmdBKClear */
    public static class C2271a {

        /* renamed from: a */
        public String f9918a;

        /* renamed from: b */
        public String f9919b;

        /* renamed from: a */
        public JSONObject mo7844a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f9918a);
            jSONObject.put("schema_version", this.f9919b);
            return jSONObject;
        }

        /* renamed from: a */
        public void mo7845a(JSONObject jSONObject) throws JSONException {
            jSONObject.put("id", this.f9918a);
            jSONObject.put("schema_version", this.f9919b);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.d$b */
    /* compiled from: CmdBKClear */
    public static class C2272b {

        /* renamed from: a */
        public int f9920a;

        /* renamed from: b */
        public String f9921b;

        /* renamed from: c */
        public String f9922c;

        /* renamed from: a */
        public void mo7846a() {
            this.f9920a = 0;
            this.f9921b = null;
            this.f9922c = null;
        }

        /* renamed from: a */
        public static C2272b m10384a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2272b bVar = new C2272b();
            bVar.f9921b = jSONObject.getString("id");
            bVar.f9922c = jSONObject.getString("schema_version");
            bVar.f9920a = jSONObject.getInt(C2270d.f9912d);
            return bVar;
        }
    }

    /* renamed from: k */
    public C2271a mo7843k() {
        return this.f9916h;
    }
}
