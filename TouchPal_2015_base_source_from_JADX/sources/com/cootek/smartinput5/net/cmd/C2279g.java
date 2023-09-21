package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.g */
/* compiled from: CmdBKRestore */
public class C2279g extends C2259P {

    /* renamed from: a */
    public static final String f9957a = "CmdBKRestore";

    /* renamed from: b */
    public static final String f9958b = "id";

    /* renamed from: c */
    public static final String f9959c = "schema_version";

    /* renamed from: d */
    public static final String f9960d = "url";

    /* renamed from: e */
    public static final String f9961e = "content_server_version";

    /* renamed from: f */
    public static final String f9962f = "headers";

    /* renamed from: g */
    public static final String f9963g = "md5";

    /* renamed from: h */
    private C2280a f9964h;

    /* renamed from: i */
    private C2281b f9965i;

    public C2279g(C2280a aVar) {
        this.f9964h = aVar;
    }

    /* renamed from: j */
    public C2281b mo7858j() {
        return this.f9965i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9964h != null) {
            this.f9964h.mo7861a(jSONObject);
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
        this.f9965i = C2281b.m10427a(jSONObject);
        if (this.f9965i != null && this.f9964h != null) {
            this.f9965i.f9968a = this.f9964h.f9966a;
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BK_RESTORE.mo7825a(f9738J);
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

    /* renamed from: com.cootek.smartinput5.net.cmd.g$a */
    /* compiled from: CmdBKRestore */
    public static class C2280a {

        /* renamed from: a */
        public String f9966a;

        /* renamed from: b */
        public String f9967b;

        /* renamed from: a */
        public JSONObject mo7860a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f9966a);
            jSONObject.put("schema_version", this.f9967b);
            return jSONObject;
        }

        /* renamed from: a */
        public void mo7861a(JSONObject jSONObject) throws JSONException {
            jSONObject.put("id", this.f9966a);
            jSONObject.put("schema_version", this.f9967b);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.g$b */
    /* compiled from: CmdBKRestore */
    public static class C2281b {

        /* renamed from: a */
        public String f9968a;

        /* renamed from: b */
        public String f9969b;

        /* renamed from: c */
        public String f9970c;

        /* renamed from: d */
        public String f9971d;

        /* renamed from: e */
        public String f9972e;

        /* renamed from: a */
        public void mo7862a() {
            this.f9968a = null;
            this.f9969b = null;
            this.f9971d = null;
            this.f9970c = null;
            this.f9972e = null;
        }

        /* renamed from: a */
        public static C2281b m10427a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2281b bVar = new C2281b();
            bVar.f9969b = jSONObject.getString("url");
            bVar.f9970c = jSONObject.getString("content_server_version");
            bVar.f9971d = jSONObject.getString("headers");
            bVar.f9972e = jSONObject.getString("md5");
            return bVar;
        }
    }

    /* renamed from: k */
    public C2280a mo7859k() {
        return this.f9964h;
    }
}
