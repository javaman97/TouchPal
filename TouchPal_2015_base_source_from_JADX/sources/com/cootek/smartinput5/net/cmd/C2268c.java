package com.cootek.smartinput5.net.cmd;

import android.text.TextUtils;
import com.appsflyer.MonitorMessages;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p045a.C1063f;
import java.util.UUID;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.c */
/* compiled from: CmdActivate */
public class C2268c extends C2259P {

    /* renamed from: D */
    public static long f9857D = 0;

    /* renamed from: T */
    private static int f9858T = 0;

    /* renamed from: V */
    private static long f9859V = 0;

    /* renamed from: W */
    private static String f9860W = null;

    /* renamed from: X */
    private static int f9861X = 0;

    /* renamed from: a */
    public static final String f9862a = "upgrade";

    /* renamed from: b */
    public static final String f9863b = "new";

    /* renamed from: c */
    public static final String f9864c = "effective";

    /* renamed from: A */
    public boolean f9865A;

    /* renamed from: B */
    public C2269a f9866B;

    /* renamed from: C */
    public int f9867C;

    /* renamed from: E */
    public int f9868E;

    /* renamed from: F */
    public String f9869F;

    /* renamed from: G */
    public long f9870G;

    /* renamed from: H */
    public int f9871H;

    /* renamed from: I */
    public int f9872I;

    /* renamed from: U */
    private int f9873U;

    /* renamed from: Y */
    private final String f9874Y;

    /* renamed from: d */
    public String f9875d;

    /* renamed from: e */
    public String f9876e;

    /* renamed from: f */
    public String f9877f;

    /* renamed from: g */
    public String f9878g;

    /* renamed from: h */
    public String f9879h;

    /* renamed from: i */
    public String f9880i;

    /* renamed from: j */
    public String f9881j;

    /* renamed from: k */
    public String f9882k;

    /* renamed from: l */
    public String f9883l;

    /* renamed from: m */
    public String f9884m;

    /* renamed from: n */
    public String f9885n;

    /* renamed from: o */
    public String f9886o;

    /* renamed from: p */
    public String f9887p;

    /* renamed from: q */
    public String f9888q;

    /* renamed from: r */
    public String f9889r;

    /* renamed from: s */
    public String f9890s;

    /* renamed from: t */
    public String f9891t;

    /* renamed from: u */
    public String f9892u;

    /* renamed from: v */
    public String f9893v;

    /* renamed from: w */
    public String f9894w;

    /* renamed from: x */
    public String f9895x;

    /* renamed from: y */
    public String f9896y;

    /* renamed from: z */
    public String f9897z;

    /* renamed from: com.cootek.smartinput5.net.cmd.c$a */
    /* compiled from: CmdActivate */
    public enum C2269a {
        CNT,
        CR,
        TJSH,
        OWS,
        JSH,
        AT,
        ACR,
        UA,
        TEST;
        

        /* renamed from: j */
        private String f9908j;

        /* renamed from: a */
        public String mo7840a() {
            return this.f9908j;
        }

        /* renamed from: a */
        public void mo7841a(String str) {
            this.f9908j = str;
        }
    }

    public C2268c() {
        this.f9865A = false;
        this.f9873U = 0;
        this.f9873U = m10361j();
        this.f9874Y = UUID.randomUUID().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.ACTIVATE.mo7825a(f9738J);
    }

    /* renamed from: h_ */
    public int mo7830h_() {
        synchronized (C2268c.class) {
            C2209a.m9958a(true);
            f9861X++;
            this.f9746O = super.mo7830h_();
            f9859V = this.f9870G;
            f9857D = mo7834s();
            if (Settings.isInitialized()) {
                Settings.getInstance().setIntSetting(Settings.LAST_ACTIVATE_CONSUME_TIME, (int) mo7834s(), false);
            }
            C2209a.m9958a(false);
        }
        return this.f9746O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("app_name", this.f9875d);
        jSONObject.put(C2225al.f9399j, this.f9876e);
        jSONObject.put("os_name", this.f9877f);
        jSONObject.put("os_version", this.f9878g);
        jSONObject.put("device_info", this.f9879h);
        jSONObject.put("activate_type", this.f9885n);
        jSONObject.put("sys_app", this.f9865A);
        if (!TextUtils.isEmpty(this.f9882k)) {
            jSONObject.put(Settings.UUID, this.f9882k);
        }
        if (!TextUtils.isEmpty(this.f9883l)) {
            jSONObject.put(Settings.ANDROID_ID, this.f9883l);
        }
        if (!TextUtils.isEmpty(this.f9884m)) {
            jSONObject.put("mac_address", this.f9884m);
        }
        if (!TextUtils.isEmpty(this.f9881j)) {
            jSONObject.put(Settings.IMEI, this.f9881j);
        }
        if (!TextUtils.isEmpty(this.f9880i)) {
            jSONObject.put(C2225al.f9398i, this.f9880i);
        }
        if (!TextUtils.isEmpty(this.f9886o)) {
            jSONObject.put("manufacture", this.f9886o);
        }
        if (!TextUtils.isEmpty(this.f9887p)) {
            jSONObject.put("api_level", this.f9887p);
        }
        if (!TextUtils.isEmpty(this.f9888q)) {
            jSONObject.put("resolution", this.f9888q);
        }
        if (!TextUtils.isEmpty(this.f9889r)) {
            jSONObject.put("dpi", this.f9889r);
        }
        if (!TextUtils.isEmpty(this.f9890s)) {
            jSONObject.put("physical_size", this.f9890s);
        }
        if (!TextUtils.isEmpty(this.f9891t)) {
            jSONObject.put(C2225al.f9400k, this.f9891t);
        }
        if (!TextUtils.isEmpty(this.f9892u)) {
            jSONObject.put("recommend_userid", this.f9892u);
        }
        if (!TextUtils.isEmpty(this.f9893v)) {
            jSONObject.put("recommend_channel", this.f9893v);
        }
        if (!TextUtils.isEmpty(this.f9894w)) {
            jSONObject.put(Settings.IDENTIFIER, this.f9894w);
        }
        if (!TextUtils.isEmpty(this.f9896y)) {
            jSONObject.put("referrer", this.f9896y);
        }
        if (!TextUtils.isEmpty(this.f9897z)) {
            jSONObject.put("release", this.f9897z);
        }
        m10360d(jSONObject);
        return null;
    }

    /* renamed from: d */
    private void m10360d(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        if (this.f9866B != null) {
            String aVar = this.f9866B.toString();
            if (!TextUtils.isEmpty(this.f9866B.mo7840a())) {
                aVar = aVar + "(" + this.f9866B.mo7840a() + ")";
            }
            jSONObject2.put("point", aVar);
        }
        if (!TextUtils.isEmpty(this.f9869F)) {
            jSONObject2.put("pname", this.f9869F);
        }
        if (!TextUtils.isEmpty(this.f9895x)) {
            jSONObject2.put("token", this.f9895x);
        }
        jSONObject2.put(MonitorMessages.PROCESS_ID, this.f9871H);
        jSONObject2.put("tid", this.f9872I);
        jSONObject2.put("build_id", this.f9873U);
        jSONObject2.put("send_time", System.currentTimeMillis());
        jSONObject2.put("success_time", this.f9868E);
        jSONObject2.put("consume_time", this.f9867C);
        jSONObject2.put(C1063f.f3049a, this.f9870G);
        jSONObject2.put("last_timestamp", f9859V);
        jSONObject2.put("consume_time_inter", f9857D);
        jSONObject2.put(Settings.UUID, this.f9874Y);
        if (!TextUtils.isEmpty(f9860W)) {
            jSONObject2.put("last_response", f9860W);
            f9860W = null;
        }
        jSONObject.put("investigate", jSONObject2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return f9740L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public boolean mo7831i_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7813c(JSONObject jSONObject) {
        super.mo7813c(jSONObject);
        if (this.f9746O == 200 && this.f9748Q == 0) {
            Settings.getInstance().setIntSetting(200, C2225al.m10050a(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        m10359b(httpResponse);
        return super.mo7765a(httpResponse);
    }

    /* renamed from: a */
    public static void m10358a(String str) {
        f9860W = "error:" + str;
    }

    /* renamed from: b */
    private void m10359b(HttpResponse httpResponse) {
        if (f9861X > 4) {
            f9861X = 0;
            StringBuilder sb = new StringBuilder();
            if (httpResponse != null) {
                StatusLine statusLine = httpResponse.getStatusLine();
                if (statusLine == null) {
                    sb.append("sl:null");
                } else if (statusLine.getStatusCode() == 200) {
                    HeaderIterator headerIterator = httpResponse.headerIterator();
                    if (headerIterator != null) {
                        sb.append("headers=>");
                        while (headerIterator.hasNext()) {
                            Header nextHeader = headerIterator.nextHeader();
                            if (nextHeader != null) {
                                if ("Set-Cookie".equals(nextHeader.getName())) {
                                    sb.append("Set-Cookie:" + nextHeader.getValue());
                                } else if ("Content-Length".equals(nextHeader.getName())) {
                                    sb.append(nextHeader.getName() + ":" + nextHeader.getValue());
                                } else {
                                    sb.append(nextHeader.getName() + ",");
                                }
                            }
                        }
                    } else {
                        sb.append("headerIterator:null");
                    }
                } else {
                    sb.append("ret:" + statusLine.getStatusCode());
                }
            } else {
                sb.append("null");
            }
            f9860W = sb.toString();
        }
    }

    /* renamed from: j */
    private static int m10361j() {
        int i = f9858T;
        f9858T = i + 1;
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j_ */
    public boolean mo7832j_() {
        return true;
    }
}
