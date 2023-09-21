package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.cootek.smartinput.utilities.C0997e;
import com.cootek.smartinput5.func.C1348H;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p046b.C1132b;
import com.emoji.keyboard.touchpal.R;
import com.weibo.net.C4054q;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.D */
/* compiled from: CmdQueryNewVersion */
public class C2243D extends C2259P {

    /* renamed from: a */
    public static final String f9509a = "CmdQueryNewVersion";

    /* renamed from: b */
    public static final String f9510b = "0000";

    /* renamed from: k */
    private static final String f9511k = "/%s/%s.ver";

    /* renamed from: l */
    private static final String f9512l = "/%s/%s/%s/%s.ver";

    /* renamed from: m */
    private static final String f9513m = "/%s/%s__%s__%s.ver";

    /* renamed from: o */
    private static final String f9514o = "version";

    /* renamed from: p */
    private static final String f9515p = "url";

    /* renamed from: q */
    private static final String f9516q = "md5";

    /* renamed from: c */
    public String f9517c;

    /* renamed from: d */
    public String f9518d;

    /* renamed from: e */
    public boolean f9519e;

    /* renamed from: f */
    public boolean f9520f = false;

    /* renamed from: g */
    public String f9521g;

    /* renamed from: h */
    public String f9522h;

    /* renamed from: i */
    public String f9523i;

    /* renamed from: j */
    public int f9524j;

    /* renamed from: n */
    private String f9525n;

    /* renamed from: r */
    private String f9526r = null;

    /* renamed from: s */
    private String f9527s = null;

    /* renamed from: t */
    private HashMap<String, String> f9528t = new HashMap<>();

    public C2243D() {
        m10190o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        String format;
        if (!TextUtils.isEmpty(this.f9526r)) {
            return this.f9526r;
        }
        if (TextUtils.isEmpty(this.f9518d)) {
            this.f9518d = f9510b;
        }
        if (!this.f9519e) {
            Context b = C1368X.m6313b();
            if (C1132b.m5654a(b).mo4410d()) {
                format = String.format(f9513m, new Object[]{this.f9517c, this.f9518d, Uri.encode(C1132b.m5654a(b).mo4414h()), C1974m.m9063a(C1368X.m6313b(), (int) R.string.optpage_version_summary)});
            } else {
                format = String.format(f9511k, new Object[]{this.f9517c, this.f9518d});
            }
        } else {
            Context b2 = C1368X.m6313b();
            String R = C1368X.m6320c().mo5832R();
            int c = C1368X.m6319c(b2);
            if (this.f9518d.indexOf(46) != -1) {
                this.f9518d = this.f9518d.replace(C1389aD.f4374j, "");
            }
            if (this.f9518d.length() < 4) {
                StringBuilder sb = new StringBuilder(this.f9518d);
                for (int i = 0; i < 4 - this.f9518d.length(); i++) {
                    sb.append('0');
                }
                this.f9518d = sb.toString();
            }
            format = String.format(f9512l, new Object[]{R, Integer.valueOf(c), this.f9517c, this.f9518d});
        }
        this.f9526r = C2258O.QUERY_NEW_VERSION.mo7825a(f9738J) + format;
        return this.f9526r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        if (TextUtils.isEmpty(this.f9527s)) {
            this.f9527s = C2225al.m10055a(C1368X.m6313b(), (String) null, 56);
        }
        return this.f9527s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        if (this.f9746O == 304) {
            return true;
        }
        Header[] headers = httpResponse.getHeaders("ETag");
        if (headers == null || headers.length != 1) {
            return false;
        }
        String value = headers[0].getValue();
        if (value.equals(m10188m())) {
            return true;
        }
        this.f9525n = value;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(f9514o)) {
            this.f9521g = jSONObject.getString(f9514o);
        }
        if (jSONObject.has("url")) {
            this.f9522h = jSONObject.getString("url");
        }
        if (jSONObject.has("md5")) {
            this.f9523i = jSONObject.getString("md5");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16510f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9741M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        String m = m10188m();
        if (m == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(C2261Q.f9793an, m);
        return hashMap;
    }

    /* renamed from: m */
    private String m10188m() {
        if (!this.f9520f) {
            return null;
        }
        return this.f9528t.get(m10189n());
    }

    /* renamed from: j */
    public void mo7785j() {
        if (this.f9520f) {
            this.f9528t.put(m10189n(), this.f9525n);
            m10191p();
        }
    }

    /* renamed from: n */
    private String m10189n() {
        return mo7770e() + mo7768c() + mo7772k_();
    }

    /* renamed from: o */
    private void m10190o() {
        this.f9528t.clear();
        Object b = C0997e.m5187b(C1466av.m6849a(C1368X.m6313b(), C1466av.f4702k));
        if (b != null) {
            this.f9528t = (HashMap) b;
        }
    }

    /* renamed from: p */
    private void m10191p() {
        C0997e.m5175a(C1466av.m6849a(C1368X.m6313b(), C1466av.f4702k), (Object) new HashMap(this.f9528t));
    }

    /* renamed from: a */
    public static String m10187a(String str) {
        Context b = C1368X.m6313b();
        if (str == null) {
            return str;
        }
        String host = Uri.parse(str).getHost();
        if (!C2225al.m10080n(b).equals(host)) {
            return str;
        }
        String b2 = C1348H.m6160a().mo5594b(b);
        if (!TextUtils.isEmpty(b2)) {
            return str.replace(host, b2);
        }
        return str;
    }
}
