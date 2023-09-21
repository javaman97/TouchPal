package com.cootek.smartinput5.net.cmd;

import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.h */
/* compiled from: CmdBKSyncList */
public class C2282h extends C2259P {

    /* renamed from: a */
    public static final String f9973a = "CmdBKSynList";

    /* renamed from: b */
    public static final String f9974b = "sync_list";

    /* renamed from: c */
    public static final String f9975c = "id";

    /* renamed from: d */
    public static final String f9976d = "schema_version";

    /* renamed from: e */
    public static final String f9977e = "content_base_version";

    /* renamed from: f */
    public static final String f9978f = "content_current_version";

    /* renamed from: g */
    public static final String f9979g = "payload";

    /* renamed from: h */
    public static final String f9980h = "sync_type";

    /* renamed from: i */
    public static final int f9981i = 0;

    /* renamed from: j */
    public static final int f9982j = 1;

    /* renamed from: k */
    public static final int f9983k = 2;

    /* renamed from: l */
    private ArrayList<C2283a> f9984l;

    /* renamed from: m */
    private ArrayList<C2284b> f9985m;

    public C2282h(ArrayList<C2283a> arrayList) {
        this.f9984l = arrayList;
    }

    /* renamed from: j */
    public ArrayList<C2284b> mo7863j() {
        return this.f9985m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9984l != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C2283a> it = this.f9984l.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().mo7864a());
            }
            jSONObject.put(f9974b, jSONArray);
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
        C2283a aVar;
        if (this.f9985m == null) {
            this.f9985m = new ArrayList<>();
        } else {
            this.f9985m.clear();
        }
        JSONArray jSONArray = (JSONArray) jSONObject.get(f9974b);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < jSONArray.length()) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i2);
                C2284b a = C2284b.m10439a(jSONObject2);
                if (this.f9984l != null) {
                    String string = jSONObject2.getString("id");
                    Iterator<C2283a> it = this.f9984l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            aVar = null;
                            break;
                        }
                        aVar = it.next();
                        if (string != null && string.equals(aVar.f9986a)) {
                            break;
                        }
                    }
                    if (aVar != null) {
                        a.f9993c = aVar.f9990e;
                    } else {
                        a.f9993c = "{}";
                    }
                }
                this.f9985m.add(a);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BK_SYNC_LIST.mo7825a(f9738J);
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

    /* renamed from: com.cootek.smartinput5.net.cmd.h$a */
    /* compiled from: CmdBKSyncList */
    public static class C2283a {

        /* renamed from: a */
        public String f9986a;

        /* renamed from: b */
        public String f9987b;

        /* renamed from: c */
        public long f9988c;

        /* renamed from: d */
        public long f9989d;

        /* renamed from: e */
        public String f9990e;

        /* renamed from: a */
        public JSONObject mo7864a() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f9986a);
            jSONObject.put("schema_version", this.f9987b);
            jSONObject.put(C2282h.f9977e, this.f9988c);
            jSONObject.put(C2282h.f9978f, this.f9989d);
            jSONObject.put("payload", this.f9990e);
            return jSONObject;
        }
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.h$b */
    /* compiled from: CmdBKSyncList */
    public static class C2284b {

        /* renamed from: a */
        public String f9991a;

        /* renamed from: b */
        public int f9992b;

        /* renamed from: c */
        public String f9993c;

        /* renamed from: a */
        public static C2284b m10439a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            C2284b bVar = new C2284b();
            bVar.f9991a = jSONObject.getString("id");
            bVar.f9992b = jSONObject.getInt(C2282h.f9980h);
            return bVar;
        }
    }
}
