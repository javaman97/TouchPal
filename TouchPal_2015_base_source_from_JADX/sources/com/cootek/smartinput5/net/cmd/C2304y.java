package com.cootek.smartinput5.net.cmd;

import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.net.C2225al;
import com.weibo.net.C4054q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.net.cmd.y */
/* compiled from: CmdQueryBubbleNews */
public class C2304y extends C2259P {

    /* renamed from: A */
    private static final String f10132A = "title";

    /* renamed from: B */
    private static final String f10133B = "content";

    /* renamed from: C */
    private static final String f10134C = "url";

    /* renamed from: D */
    private static final String f10135D = "promotion";

    /* renamed from: E */
    private static final String f10136E = "update";

    /* renamed from: F */
    private static final String f10137F = "action";

    /* renamed from: a */
    public static final String f10138a = "international";

    /* renamed from: b */
    public static final String f10139b = "mainland";

    /* renamed from: f */
    public static final int f10140f = 0;

    /* renamed from: g */
    public static final int f10141g = 1;

    /* renamed from: h */
    public static final int f10142h = 2;

    /* renamed from: i */
    public static final int f10143i = 3;

    /* renamed from: j */
    public static final int f10144j = 4;

    /* renamed from: r */
    private static final String f10145r = "id";

    /* renamed from: s */
    private static final String f10146s = "locale";

    /* renamed from: t */
    private static final String f10147t = "product";

    /* renamed from: u */
    private static final String f10148u = "text";

    /* renamed from: v */
    private static final String f10149v = "web";

    /* renamed from: w */
    private static final String f10150w = "skip";

    /* renamed from: x */
    private static final String f10151x = "promotion";

    /* renamed from: y */
    private static final String f10152y = "intent";

    /* renamed from: z */
    private static final String f10153z = "type";

    /* renamed from: c */
    public int f10154c;

    /* renamed from: d */
    public String f10155d;

    /* renamed from: e */
    public String f10156e;

    /* renamed from: k */
    public int f10157k;

    /* renamed from: l */
    public String f10158l;

    /* renamed from: m */
    public String f10159m;

    /* renamed from: n */
    public String f10160n;

    /* renamed from: o */
    public String f10161o;

    /* renamed from: p */
    public String f10162p;

    /* renamed from: q */
    public String f10163q;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo7768c() {
        return C2258O.BUBBLE_QUERY.mo7825a(f9738J);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k_ */
    public String mo7772k_() {
        return C2225al.m10055a(C1368X.m6313b(), C2261Q.f9807m + "id" + "=" + this.f10154c + C2261Q.f9808n + "locale" + "=" + this.f10155d + C2261Q.f9808n + f10147t + "=" + this.f10156e, (int) Settings.UPDATE_LIVE_WORDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7766b(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            if ("text".equals(string)) {
                this.f10157k = 0;
            } else if ("web".equals(string)) {
                this.f10157k = 1;
            } else if ("promotion".equals(string)) {
                this.f10157k = 2;
            } else if ("intent".equals(string)) {
                this.f10157k = 3;
            } else if (f10150w.equals(string)) {
                this.f10157k = 4;
            } else {
                this.f10157k = 0;
            }
        }
        if (jSONObject.has("title")) {
            this.f10158l = jSONObject.getString("title");
        }
        if (jSONObject.has("content")) {
            this.f10159m = jSONObject.getString("content");
        }
        if (jSONObject.has("url")) {
            this.f10160n = jSONObject.getString("url");
        }
        if (jSONObject.has("promotion")) {
            this.f10161o = jSONObject.getString("promotion");
        }
        if (jSONObject.has(f10136E)) {
            this.f10162p = jSONObject.getString(f10136E);
        }
        if (jSONObject.has("action")) {
            this.f10163q = jSONObject.getString("action");
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
}
