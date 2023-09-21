package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.func.C1358O;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.component.C1684q;
import com.weibo.net.C4054q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.b */
/* compiled from: CmdAS3Restore */
public class C2265b extends C2259P {

    /* renamed from: a */
    public static final String f9839a = "CmdAS3Restore";

    /* renamed from: b */
    public static final String f9840b = "x-amz-date";

    /* renamed from: c */
    public static final String f9841c = "Authorization";

    /* renamed from: d */
    public static final String f9842d = "ETag";

    /* renamed from: h */
    private static String f9843h = "s3.amazonaws.com";

    /* renamed from: i */
    private static String f9844i = ("http://" + f9843h);

    /* renamed from: e */
    public String f9845e;

    /* renamed from: f */
    private C2266a f9846f;

    /* renamed from: g */
    private C2267b f9847g;

    /* renamed from: j */
    private String f9848j = null;

    /* renamed from: com.cootek.smartinput5.net.cmd.b$a */
    /* compiled from: CmdAS3Restore */
    public static class C2266a {

        /* renamed from: a */
        public String f9849a;

        /* renamed from: b */
        public String f9850b;

        /* renamed from: c */
        public String f9851c;

        /* renamed from: d */
        public String f9852d;

        /* renamed from: e */
        public String f9853e;
    }

    /* renamed from: com.cootek.smartinput5.net.cmd.b$b */
    /* compiled from: CmdAS3Restore */
    public static class C2267b {

        /* renamed from: a */
        public String f9854a;

        /* renamed from: b */
        public String f9855b;

        /* renamed from: c */
        public String f9856c;
    }

    public C2265b(C2266a aVar) {
        this.f9846f = aVar;
    }

    /* renamed from: f */
    public C2267b mo7837f() {
        return this.f9847g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        return super.mo7764a(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        super.mo7765a(httpResponse);
        if (this.f9746O != 200) {
            return true;
        }
        for (Header header : httpResponse.getAllHeaders()) {
            if (header.getName().equalsIgnoreCase("ETag")) {
                String value = header.getValue();
                if (value == null) {
                    return false;
                }
                this.f9848j = value;
                this.f9848j = this.f9848j.replaceAll("\"", "");
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        HttpEntity httpEntity;
        if (jSONObject != null && (httpEntity = (HttpEntity) jSONObject.get("entity")) != null) {
            boolean a = m10345a(httpEntity);
            if (!a) {
            }
            if (a && this.f9846f != null) {
                this.f9847g = new C2267b();
                this.f9847g.f9854a = this.f9846f.f9849a;
                this.f9847g.f9855b = this.f9846f.f9850b;
                this.f9847g.f9856c = this.f9846f.f9851c;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        HashMap hashMap = new HashMap();
        if (!(this.f9846f == null || this.f9846f.f9852d == null)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f9846f.f9852d);
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
        if (this.f9846f == null || this.f9846f.f9850b == null || !this.f9846f.f9850b.startsWith(f9844i)) {
            return "";
        }
        return this.f9846f.f9850b.substring(f9844i.length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9844i;
    }

    /* renamed from: a */
    private boolean m10345a(HttpEntity httpEntity) {
        File file;
        Context b = C1368X.m6313b();
        if (b == null) {
            C1017y.m5213a(f9839a, "ctx is null");
            return false;
        }
        try {
            File a = C1466av.m6848a(b);
            String str = this.f9845e + C1684q.f5492a;
            File a2 = C1358O.m6234a(C1358O.f4202m);
            if (a2 != null) {
                file = new File(a2, str);
            } else {
                file = new File(a, str);
            }
            InputStream content = httpEntity.getContent();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            String b2 = C0997e.m5188b(file.getAbsolutePath());
            if (b2 == null || !b2.equals(this.f9848j)) {
                return false;
            }
            if (TextUtils.isEmpty(this.f9846f.f9853e) || b2.equals(this.f9846f.f9853e)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C1017y.m5213a(f9839a, e.toString());
            return false;
        }
    }

    /* renamed from: g */
    public void mo7838g() {
        File file;
        Context b = C1368X.m6313b();
        if (b == null) {
            C1017y.m5213a(f9839a, "deleteTempFile: ctx is null");
            return;
        }
        try {
            File a = C1466av.m6848a(b);
            String str = this.f9845e + C1684q.f5492a;
            File a2 = C1358O.m6234a(C1358O.f4202m);
            if (a2 != null) {
                file = new File(a2, str);
            } else {
                file = new File(a, str);
            }
            if (file != null && file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            C1017y.m5213a(f9839a, e.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo7829h() {
        return true;
    }

    /* renamed from: i */
    public C2266a mo7839i() {
        return this.f9846f;
    }
}
