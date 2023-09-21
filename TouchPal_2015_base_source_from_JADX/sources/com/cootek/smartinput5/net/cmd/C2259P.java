package com.cootek.smartinput5.net.cmd;

import android.content.Context;
import android.text.TextUtils;
import com.cootek.smartinput5.engine.ClokeManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.iab.PurchaseChannelChooseActivity;
import com.cootek.smartinput5.net.C2188Q;
import com.cootek.smartinput5.net.C2209a;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.net.C2372w;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.weibo.net.C4054q;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.P */
/* compiled from: HttpCmdBase */
public class C2259P {

    /* renamed from: J */
    protected static int f9738J = 0;

    /* renamed from: K */
    protected static String f9739K = null;

    /* renamed from: L */
    protected static String f9740L = null;

    /* renamed from: M */
    protected static String f9741M = null;

    /* renamed from: N */
    protected static String f9742N = null;

    /* renamed from: a */
    private static String f9743a = null;

    /* renamed from: b */
    private static String f9744b = null;

    /* renamed from: e */
    private static final String f9745e = "error_code";

    /* renamed from: O */
    public int f9746O;

    /* renamed from: P */
    public String f9747P;

    /* renamed from: Q */
    public int f9748Q;

    /* renamed from: R */
    public boolean f9749R;

    /* renamed from: S */
    public int f9750S;

    /* renamed from: c */
    private C2260a f9751c;

    /* renamed from: d */
    private long f9752d = 0;

    /* renamed from: com.cootek.smartinput5.net.cmd.P$a */
    /* compiled from: HttpCmdBase */
    public interface C2260a {
        /* renamed from: a */
        boolean mo7763a(Context context);
    }

    protected C2259P() {
        Context b = C1368X.m6313b();
        if (b != null) {
            boolean booleanValue = C1132b.m5654a(b).mo4392a(C1135d.SERVER_SUPPORT_HTTPS, (Boolean) true).booleanValue();
            f9738J = C2225al.m10081o(b);
            f9741M = C2225al.m10068e(b, f9738J);
            f9739K = C2225al.m10064c(b, f9738J);
            if (booleanValue) {
                f9740L = C2225al.m10066d(b, f9738J);
                f9742N = C2225al.m10070f(b, f9738J);
            } else {
                f9740L = f9739K;
                f9742N = f9741M;
            }
            f9743a = C2225al.m10072g(b, 2);
            f9744b = C2225al.m10072g(b, f9738J);
        }
    }

    /* renamed from: a */
    private boolean m10313a(Context context) {
        if (this.f9751c == null) {
            return true;
        }
        if (!this.f9751c.mo7763a(context) || !C2209a.m9961b(context)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo7827a(C2260a aVar) {
        this.f9751c = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: org.json.JSONObject} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: org.json.JSONObject} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7830h_() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            android.content.Context r0 = com.cootek.smartinput5.func.C1368X.m6313b()
            boolean r0 = r8.m10313a((android.content.Context) r0)
            if (r0 != 0) goto L_0x0011
            r8.f9748Q = r1
            r0 = 200(0xc8, float:2.8E-43)
        L_0x0010:
            return r0
        L_0x0011:
            r8.f9746O = r1
            java.lang.String r0 = "POST"
            java.lang.String r1 = r8.mo7769d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "PUT"
            java.lang.String r1 = r8.mo7769d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d8
        L_0x002b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005a }
            r0.<init>()     // Catch:{ JSONException -> 0x005a }
            r1 = 0
            r8.f9749R = r1     // Catch:{ JSONException -> 0x005a }
            java.lang.Object r1 = r8.mo7764a((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x005a }
            boolean r3 = r8.f9749R     // Catch:{ JSONException -> 0x005a }
            if (r3 == 0) goto L_0x003e
            int r0 = r8.f9746O     // Catch:{ JSONException -> 0x005a }
            goto L_0x0010
        L_0x003e:
            if (r1 != 0) goto L_0x00d5
        L_0x0040:
            if (r2 != 0) goto L_0x00d3
            long r4 = java.lang.System.currentTimeMillis()
            r8.f9752d = r4
            org.apache.http.HttpResponse r0 = r8.m10311a((java.lang.Object) r0)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r8.f9752d
            long r4 = r4 - r6
            r8.f9752d = r4
        L_0x0055:
            if (r0 != 0) goto L_0x005e
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x005a:
            r0 = move-exception
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x005e:
            org.apache.http.StatusLine r1 = r0.getStatusLine()
            if (r1 == 0) goto L_0x0078
            org.apache.http.StatusLine r1 = r0.getStatusLine()
            int r1 = r1.getStatusCode()
            r8.f9746O = r1
            org.apache.http.StatusLine r1 = r0.getStatusLine()
            java.lang.String r1 = r1.getReasonPhrase()
            r8.f9747P = r1
        L_0x0078:
            boolean r1 = r8.mo7765a((org.apache.http.HttpResponse) r0)
            if (r1 != 0) goto L_0x00b6
            org.apache.http.HttpEntity r0 = r0.getEntity()
            if (r0 == 0) goto L_0x00d1
            boolean r1 = r8.mo7829h()
            if (r1 == 0) goto L_0x00a0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009b }
            r1.<init>()     // Catch:{ JSONException -> 0x009b }
            java.lang.String r2 = "entity"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x009b }
            r8.mo7766b((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x009b }
        L_0x0097:
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x009b:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0097
        L_0x00a0:
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = org.apache.http.util.EntityUtils.toString(r0, r1)     // Catch:{ IOException -> 0x00ba }
            r1 = r0
        L_0x00a7:
            if (r1 == 0) goto L_0x00cf
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c2 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x00c2 }
        L_0x00ae:
            if (r0 == 0) goto L_0x00b6
            r8.mo7813c(r0)     // Catch:{ JSONException -> 0x00ca }
            r8.mo7766b((org.json.JSONObject) r0)     // Catch:{ JSONException -> 0x00ca }
        L_0x00b6:
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x00ba:
            r0 = move-exception
            r0.printStackTrace()
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x00c2:
            r0 = move-exception
            r0.printStackTrace()
            int r0 = r8.f9746O
            goto L_0x0010
        L_0x00ca:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00b6
        L_0x00cf:
            r0 = r2
            goto L_0x00ae
        L_0x00d1:
            r1 = r2
            goto L_0x00a7
        L_0x00d3:
            r0 = r2
            goto L_0x0055
        L_0x00d5:
            r0 = r1
            goto L_0x0040
        L_0x00d8:
            r0 = r2
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.net.cmd.C2259P.mo7830h_():int");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i_ */
    public boolean mo7831i_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j_ */
    public boolean mo7832j_() {
        return false;
    }

    /* renamed from: a */
    private final HttpResponse m10311a(Object obj) {
        try {
            return (HttpResponse) C2372w.m10879a().mo8057a(mo7769d(), obj, mo7770e(), mo7768c(), mo7772k_(), mo7774a(), mo7832j_());
        } catch (SSLPeerUnverifiedException e) {
            if (mo7831i_()) {
                return m10314b(obj);
            }
            return null;
        }
    }

    /* renamed from: b */
    private final HttpResponse m10314b(Object obj) {
        String e = mo7770e();
        if (e == null) {
            return null;
        }
        try {
            return (HttpResponse) C2372w.m10879a().mo8057a(mo7769d(), obj, e.replace("https://", "http://"), mo7768c(), mo7772k_(), mo7774a(), mo7832j_());
        } catch (SSLPeerUnverifiedException e2) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7813c(JSONObject jSONObject) {
        this.f9748Q = 0;
        if (jSONObject != null && jSONObject.has("error_code")) {
            try {
                this.f9748Q = jSONObject.getInt("error_code");
            } catch (JSONException e) {
            }
        }
        mo7867a(this.f9748Q);
    }

    /* renamed from: a */
    private void mo7867a(int i) {
        switch (i) {
            case 1001:
                C2188Q.m9853a().mo7680a("");
                return;
            default:
                return;
        }
    }

    /* renamed from: r */
    public void mo7833r() {
        C2372w.m10879a().mo8058b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo7769d() {
        return C4054q.f16509e;
    }

    /* renamed from: b */
    public boolean mo7767b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo7770e() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo7764a(JSONObject jSONObject) throws JSONException {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo7774a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo7765a(HttpResponse httpResponse) {
        Header[] headers;
        if (httpResponse != null && this.f9746O == 200 && (headers = httpResponse.getHeaders("Set-Cookie")) != null) {
            int length = headers.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                HeaderElement[] elements = headers[i].getElements();
                if (elements != null) {
                    int length2 = elements.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        HeaderElement headerElement = elements[i2];
                        if (headerElement.getName().equals(PurchaseChannelChooseActivity.AUTH_TOKEN)) {
                            String value = headerElement.getValue();
                            if (!TextUtils.isEmpty(value)) {
                                Settings.getInstance().setIntSetting(200, C2225al.m10050a(), false);
                                if (Settings.getInstance().getIntSetting(360) == 0) {
                                    Settings.getInstance().setIntSetting(360, f9738J, false);
                                }
                                C2188Q.m9853a().mo7680a(value);
                            }
                        } else {
                            i2++;
                        }
                    }
                    continue;
                }
                i++;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo7829h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo7828h(String str) {
        if (ClokeManager.CLOUD_LANG_CATEGORY_PINYIN.equals(str)) {
            return f9744b;
        }
        return f9743a;
    }

    /* renamed from: s */
    public long mo7834s() {
        return this.f9752d;
    }

    /* renamed from: l */
    public String mo7780l() {
        return getClass().getSimpleName();
    }
}
