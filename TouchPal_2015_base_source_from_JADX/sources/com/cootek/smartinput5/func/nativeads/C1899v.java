package com.cootek.smartinput5.func.nativeads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.cootek.smartinput5.net.C2225al;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.cootek.smartinput5.func.nativeads.v */
/* compiled from: NativeAdsRequest */
public class C1899v {

    /* renamed from: S */
    private static final String f6354S = "locale";

    /* renamed from: T */
    private static final String f6355T = "country_code";

    /* renamed from: U */
    private static final String f6356U = "source";

    /* renamed from: V */
    private static final String f6357V = "android_id";

    /* renamed from: W */
    private static final String f6358W = "resolution";

    /* renamed from: X */
    private static final String f6359X = "orientation";

    /* renamed from: Y */
    private static final String f6360Y = "mnc";

    /* renamed from: Z */
    private static final String f6361Z = "mcc";

    /* renamed from: a */
    public static final String f6362a = "count";

    /* renamed from: aa */
    private static final String f6363aa = "network_type";

    /* renamed from: ab */
    private static final String f6364ab = "user_agent";

    /* renamed from: ac */
    private static final String f6365ac = "category";

    /* renamed from: ad */
    private static final String f6366ad = "imei";

    /* renamed from: ae */
    private static final String f6367ae = "mac_address";

    /* renamed from: af */
    private static final String f6368af = "slot_id";

    /* renamed from: ag */
    private static final String f6369ag = "payload";

    /* renamed from: ah */
    private static final String f6370ah = "request_id";

    /* renamed from: ai */
    private static final String f6371ai = "ip";

    /* renamed from: aj */
    private static final String f6372aj = "current_skin";

    /* renamed from: ak */
    private static final String f6373ak = "display_index";

    /* renamed from: al */
    private static final String f6374al = "default_ad_id";

    /* renamed from: am */
    private static final String f6375am = "query_type";

    /* renamed from: an */
    private static final String f6376an = "horizontal";

    /* renamed from: ao */
    private static final String f6377ao = "vertical";

    /* renamed from: b */
    public static final String f6378b = "image_size";

    /* renamed from: c */
    public static final String f6379c = "customized";

    /* renamed from: d */
    public static final String f6380d = "inmobi";

    /* renamed from: e */
    public static final String f6381e = "mobvista";

    /* renamed from: f */
    public static final String f6382f = "download";

    /* renamed from: g */
    public static final String f6383g = "openurl";

    /* renamed from: h */
    public static final String f6384h = "image";

    /* renamed from: i */
    public static final String f6385i = "video";

    /* renamed from: j */
    public static final String f6386j = "bluetooth";

    /* renamed from: k */
    public static final String f6387k = "dummy";

    /* renamed from: l */
    public static final String f6388l = "ethernet";

    /* renamed from: m */
    public static final String f6389m = "mobile";

    /* renamed from: n */
    public static final String f6390n = "mobile_dun";

    /* renamed from: o */
    public static final String f6391o = "mobile_hipri";

    /* renamed from: p */
    public static final String f6392p = "mobile_mms";

    /* renamed from: q */
    public static final String f6393q = "mobile_supl";

    /* renamed from: r */
    public static final String f6394r = "vpn";

    /* renamed from: s */
    public static final String f6395s = "wifi";

    /* renamed from: t */
    public static final String f6396t = "wimax";

    /* renamed from: u */
    public static final String f6397u = "default";

    /* renamed from: v */
    public static final String f6398v = "dynamic";

    /* renamed from: A */
    public String f6399A;

    /* renamed from: B */
    public String f6400B;

    /* renamed from: C */
    public String f6401C;

    /* renamed from: D */
    public String f6402D;

    /* renamed from: E */
    public String f6403E;

    /* renamed from: F */
    public String f6404F;

    /* renamed from: G */
    public String f6405G;

    /* renamed from: H */
    public String f6406H;

    /* renamed from: I */
    public String f6407I;

    /* renamed from: J */
    public String f6408J;

    /* renamed from: K */
    public String f6409K;

    /* renamed from: L */
    public String f6410L;

    /* renamed from: M */
    public String f6411M;

    /* renamed from: N */
    public String f6412N;

    /* renamed from: O */
    public String f6413O;

    /* renamed from: P */
    public String f6414P;

    /* renamed from: Q */
    public int f6415Q = -1;

    /* renamed from: R */
    public String f6416R;

    /* renamed from: w */
    public String f6417w;

    /* renamed from: x */
    public String f6418x;

    /* renamed from: y */
    public String f6419y;

    /* renamed from: z */
    public int f6420z;

    /* renamed from: a */
    public JSONObject mo7041a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("locale", this.f6417w);
        jSONObject.put(f6355T, this.f6418x);
        if (this.f6419y != null) {
            jSONObject.put(f6356U, this.f6419y);
        }
        if (this.f6420z > 0) {
            jSONObject.put(f6362a, this.f6420z);
        }
        jSONObject.put("android_id", this.f6399A);
        if (this.f6400B != null) {
            jSONObject.put(f6358W, this.f6400B);
        }
        if (this.f6401C != null) {
            jSONObject.put(f6359X, this.f6401C);
        }
        if (this.f6402D != null) {
            jSONObject.put(f6360Y, this.f6402D);
        }
        if (this.f6403E != null) {
            jSONObject.put(f6361Z, this.f6403E);
        }
        if (this.f6404F != null) {
            jSONObject.put(f6363aa, this.f6404F);
        }
        if (this.f6405G != null) {
            jSONObject.put(f6378b, this.f6405G);
        }
        if (this.f6406H != null) {
            jSONObject.put(f6364ab, this.f6406H);
        }
        if (this.f6407I != null) {
            jSONObject.put(f6365ac, this.f6407I);
        }
        if (this.f6408J != null) {
            jSONObject.put("imei", this.f6408J);
        }
        if (this.f6409K != null) {
            jSONObject.put(f6367ae, this.f6409K);
        }
        if (this.f6410L != null) {
            jSONObject.put(f6368af, this.f6410L);
        }
        if (this.f6411M != null) {
            jSONObject.put("payload", this.f6411M);
        }
        jSONObject.put(f6370ah, this.f6412N);
        if (this.f6413O != null) {
            jSONObject.put(f6371ai, this.f6413O);
        }
        if (this.f6414P != null) {
            jSONObject.put(f6372aj, this.f6414P);
        }
        if (this.f6415Q >= 0) {
            jSONObject.put(f6373ak, this.f6415Q);
        }
        if (this.f6416R != null) {
            jSONObject.put(f6375am, this.f6416R);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo7042a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(f6362a)) {
                    this.f6420z = jSONObject.getInt(f6362a);
                }
                if (jSONObject.has(f6378b)) {
                    this.f6405G = jSONObject.getString(f6378b);
                }
                if (jSONObject.has(f6370ah)) {
                    this.f6412N = jSONObject.getString(f6370ah);
                }
            } catch (JSONException e) {
            }
        }
    }

    /* renamed from: a */
    public static C1899v m8729a(Context context, String str, int i, String str2) {
        NetworkInfo networkInfo;
        C1899v vVar = new C1899v();
        vVar.f6417w = C2225al.m10051a(context);
        vVar.f6418x = C2225al.m10061b(context);
        vVar.f6419y = str;
        vVar.f6420z = i;
        vVar.f6399A = Settings.Secure.getString(context.getContentResolver(), "android_id");
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            vVar.f6400B = defaultDisplay.getHeight() + "*" + defaultDisplay.getWidth();
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            vVar.f6401C = f6376an;
        } else if (context.getResources().getConfiguration().orientation == 1) {
            vVar.f6401C = f6377ao;
        }
        String f = C2225al.m10069f(context);
        if (!TextUtils.isEmpty(f) && f.length() >= 5) {
            vVar.f6403E = f.substring(0, 3);
            vVar.f6402D = f.substring(3, f.length());
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            switch (networkInfo.getType()) {
                case 0:
                    vVar.f6404F = f6389m;
                    break;
                case 1:
                    vVar.f6404F = f6395s;
                    break;
                case 2:
                    vVar.f6404F = f6392p;
                    break;
                case 3:
                    vVar.f6404F = f6393q;
                    break;
                case 4:
                    vVar.f6404F = f6390n;
                    break;
                case 5:
                    vVar.f6404F = f6391o;
                    break;
                case 6:
                    vVar.f6404F = f6396t;
                    break;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            vVar.f6408J = telephonyManager.getDeviceId();
        }
        vVar.f6409K = C2225al.m10077k(context);
        vVar.f6412N = str2;
        vVar.f6413O = C1132b.m5654a(context).mo4402a(C1135d.IP_ADDRESS, (String) null);
        vVar.f6414P = com.cootek.smartinput5.engine.Settings.getInstance().getStringSetting(80);
        return vVar;
    }

    /* renamed from: a */
    public static C1899v m8728a(Context context, String str, int i, int i2, String str2) {
        C1899v a = m8729a(context, str, i, str2);
        if (a != null) {
            a.f6415Q = i2;
        }
        return a;
    }
}
