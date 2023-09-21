package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.f */
/* compiled from: CmdBKInfo */
public class C2276f extends C2259P {

    /* renamed from: a */
    public static final String f9937a = "CmdBKInfo";

    /* renamed from: b */
    public static final String f9938b = "id";

    /* renamed from: c */
    public static final String f9939c = "schema_version";

    /* renamed from: d */
    public static final String f9940d = "content_type";

    /* renamed from: e */
    public static final String f9941e = "md5";

    /* renamed from: f */
    public static final String f9942f = "payload";

    /* renamed from: g */
    public static final String f9943g = "url";

    /* renamed from: h */
    public static final String f9944h = "session_id";

    /* renamed from: i */
    public static final String f9945i = "headers";

    /* renamed from: j */
    private C2277a f9946j;

    /* renamed from: k */
    private C2278b f9947k;

    public C2276f(C2277a aVar) {
        this.f9946j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* renamed from: j */
    public C2278b mo7852j() {
        return this.f9947k;
    }

    /* renamed from: k */
    public void mo7853k() {
        this.f9947k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9946j != null) {
            this.f9946j.mo7856a(jSONObject);
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
        this.f9947k = C2278b.m10413a(jSONObject);
        if (this.f9947k != null && this.f9946j != null) {
            this.f9947k.f9953a = this.f9946j.f9948a;
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BK_INFO.mo7825a(f9738J);
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

    /* renamed from: com.cootek.smartinput5.net.cmd.f$a */
    /* compiled from: CmdBKInfo */
    public static class C2277a {

        /* renamed from: a */
        public String f9948a;

        /* renamed from: b */
        public String f9949b;

        /* renamed from: c */
        public String f9950c;

        /* renamed from: d */
        public String f9951d;

        /* renamed from: e */
        public String f9952e;

        /* renamed from: a */
        public JSONObject mo7855a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f9948a);
            jSONObject.put("schema_version", this.f9949b);
            jSONObject.put(C2276f.f9940d, this.f9950c);
            jSONObject.put("md5", this.f9951d);
            jSONObject.put("payload", this.f9952e);
            return jSONObject;
        }

        /* renamed from: a */
        public void mo7856a(JSONObject jSONObject) throws JSONException {
            jSONObject.put("id", this.f9948a);
            jSONObject.put("schema_version", this.f9949b);
            jSONObject.put(C2276f.f9940d, this.f9950c);
            jSONObject.put("md5", this.f9951d);
            jSONObject.put("payload", this.f9952e);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.f$b */
    /* compiled from: CmdBKInfo */
    public static class C2278b {

        /* renamed from: a */
        public String f9953a;

        /* renamed from: b */
        public String f9954b;

        /* renamed from: c */
        public String f9955c;

        /* renamed from: d */
        public String f9956d;

        /* renamed from: a */
        public void mo7857a() {
            this.f9954b = null;
            this.f9955c = null;
            this.f9956d = null;
        }

        /* renamed from: a */
        public static C2278b m10413a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2278b bVar = new C2278b();
            bVar.f9954b = jSONObject.getString("url");
            bVar.f9955c = jSONObject.getString("session_id");
            bVar.f9956d = jSONObject.getString("headers");
            return bVar;
        }
    }

    /* renamed from: l_ */
    public C2277a mo7854l_() {
        return this.f9946j;
    }
}
