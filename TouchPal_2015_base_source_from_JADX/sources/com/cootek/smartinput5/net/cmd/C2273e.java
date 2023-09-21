package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.e */
/* compiled from: CmdBKConfirm */
public class C2273e extends C2259P {

    /* renamed from: a */
    public static final String f9923a = "CmdBKConfirm";

    /* renamed from: b */
    public static final String f9924b = "id";

    /* renamed from: c */
    public static final String f9925c = "session_id";

    /* renamed from: d */
    public static final String f9926d = "status";

    /* renamed from: e */
    public static final String f9927e = "md5";

    /* renamed from: f */
    public static final String f9928f = "content_server_version";

    /* renamed from: g */
    private C2274a f9929g;

    /* renamed from: h */
    private C2275b f9930h;

    public C2273e(C2274a aVar) {
        this.f9929g = aVar;
    }

    /* renamed from: j */
    public C2275b mo7847j() {
        return this.f9930h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9929g != null) {
            this.f9929g.mo7850a(jSONObject);
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
        this.f9930h = C2275b.m10398a(jSONObject);
        if (this.f9929g != null && this.f9930h != null) {
            this.f9930h.f9935a = this.f9929g.f9931a;
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BK_CONFIRM.mo7825a(f9738J);
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

    /* renamed from: com.cootek.smartinput5.net.cmd.e$a */
    /* compiled from: CmdBKConfirm */
    public static class C2274a {

        /* renamed from: a */
        public String f9931a;

        /* renamed from: b */
        public String f9932b;

        /* renamed from: c */
        public String f9933c;

        /* renamed from: d */
        public String f9934d = "";

        /* renamed from: a */
        public JSONObject mo7849a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", this.f9932b);
            jSONObject.put("session_id", this.f9933c);
            jSONObject.put("md5", this.f9934d);
            return jSONObject;
        }

        /* renamed from: a */
        public void mo7850a(JSONObject jSONObject) throws JSONException {
            jSONObject.put("status", this.f9932b);
            jSONObject.put("session_id", this.f9933c);
            jSONObject.put("md5", this.f9934d);
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.e$b */
    /* compiled from: CmdBKConfirm */
    public static class C2275b {

        /* renamed from: a */
        public String f9935a;

        /* renamed from: b */
        public String f9936b;

        /* renamed from: a */
        public void mo7851a() {
            this.f9936b = null;
        }

        /* renamed from: a */
        public static C2275b m10398a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2275b bVar = new C2275b();
            bVar.f9936b = jSONObject.getString("content_server_version");
            return bVar;
        }
    }

    /* renamed from: k */
    public C2274a mo7848k() {
        return this.f9929g;
    }
}
