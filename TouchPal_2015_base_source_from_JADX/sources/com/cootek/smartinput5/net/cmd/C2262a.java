package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.C1579bD;
import com.cootek.smartinput5.p048d.C1246d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.a */
/* compiled from: CmdAS3BK */
public class C2262a extends C2259P {

    /* renamed from: a */
    public static final String f9821a = "CmdAS3BK";

    /* renamed from: b */
    public static final String f9822b = "x-amz-date";

    /* renamed from: c */
    public static final String f9823c = "Authorization";

    /* renamed from: d */
    public static final String f9824d = "ETag";

    /* renamed from: g */
    private static String f9825g = "s3.amazonaws.com";

    /* renamed from: h */
    private static String f9826h = ("http://" + f9825g);

    /* renamed from: e */
    private C2263a f9827e;

    /* renamed from: f */
    private C2264b f9828f;

    /* renamed from: com.cootek.smartinput5.net.cmd.a$a */
    /* compiled from: CmdAS3BK */
    public static class C2263a {

        /* renamed from: a */
        public String f9829a;

        /* renamed from: b */
        public String f9830b;

        /* renamed from: c */
        public String f9831c;

        /* renamed from: d */
        public String f9832d;

        /* renamed from: e */
        public String f9833e;

        /* renamed from: f */
        public long f9834f;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.a$b */
    /* compiled from: CmdAS3BK */
    public static class C2264b {

        /* renamed from: a */
        public String f9835a;

        /* renamed from: b */
        public String f9836b;

        /* renamed from: c */
        public String f9837c;

        /* renamed from: d */
        public String f9838d;
    }

    public C2262a(C2263a aVar) {
        this.f9827e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        if (this.f9827e == null) {
            return super.mo7764a(jSONObject);
        }
        Context b = C1368X.m6313b();
        if (b == null) {
            return null;
        }
        try {
            File file = new File(C1466av.m6848a(b), this.f9827e.f9832d + C1579bD.f4987i);
            if (file.length() == this.f9827e.f9834f) {
                return file;
            }
            return null;
        } catch (Exception e) {
            C1017y.m5213a(f9821a, e.toString());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        if (this.f9746O != 200) {
            return true;
        }
        String str = "";
        Header[] allHeaders = httpResponse.getAllHeaders();
        int length = allHeaders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Header header = allHeaders[i];
            if (header.getName().equalsIgnoreCase("ETag")) {
                String value = header.getValue();
                if (value != null) {
                    str = value.replaceAll("\"", "");
                }
            } else {
                i++;
            }
        }
        String str2 = this.f9827e.f9833e;
        if (TextUtils.isEmpty(str2) || (!TextUtils.isEmpty(str) && str.equals(str2))) {
            this.f9828f = new C2264b();
            if (this.f9827e != null) {
                this.f9828f.f9836b = C1246d.f3946r;
                this.f9828f.f9837c = this.f9827e.f9830b;
                this.f9828f.f9835a = this.f9827e.f9832d;
                this.f9828f.f9838d = str;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        HashMap hashMap = new HashMap();
        if (!(this.f9827e == null || this.f9827e.f9831c == null)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f9827e.f9831c);
                if (jSONObject.has("x-amz-date")) {
                    hashMap.put("x-amz-date", jSONObject.getString("x-amz-date"));
                }
                if (jSONObject.has("Authorization")) {
                    hashMap.put("Authorization", jSONObject.getString("Authorization"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        if (this.f9827e == null || this.f9827e.f9829a == null || !this.f9827e.f9829a.startsWith(f9826h)) {
            return "";
        }
        return this.f9827e.f9829a.substring(f9826h.length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return "PUT";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9826h;
    }

    /* renamed from: f */
    public C2264b mo7835f() {
        return this.f9828f;
    }

    /* renamed from: g */
    public C2263a mo7836g() {
        return this.f9827e;
    }
}
