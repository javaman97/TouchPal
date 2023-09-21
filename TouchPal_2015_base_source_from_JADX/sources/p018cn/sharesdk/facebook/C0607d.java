package p018cn.sharesdk.facebook;

import android.os.Bundle;
import com.appsflyer.MonitorMessages;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p018cn.sharesdk.framework.C0651f;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.authorize.C0622b;
import p018cn.sharesdk.framework.authorize.C0625e;
import p018cn.sharesdk.framework.authorize.C0626f;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.p019a.C0613d;
import p018cn.sharesdk.framework.p019a.C0617h;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0665d;

/* renamed from: cn.sharesdk.facebook.d */
public class C0607d extends C0651f {

    /* renamed from: b */
    private static final String[] f1450b = {"user_about_me", "user_birthday", "user_photos", "publish_stream", "read_stream", "manage_notifications"};

    /* renamed from: c */
    private static C0607d f1451c;

    /* renamed from: d */
    private String f1452d;

    /* renamed from: e */
    private String f1453e;

    /* renamed from: f */
    private long f1454f;

    /* renamed from: g */
    private String f1455g;

    /* renamed from: h */
    private C0617h f1456h = C0617h.m3549a();

    /* renamed from: i */
    private String[] f1457i;

    private C0607d(Platform platform) {
        super(platform);
    }

    /* renamed from: a */
    public static C0607d m3501a(Platform platform) {
        if (f1451c == null) {
            f1451c = new C0607d(platform);
        }
        return f1451c;
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2055a(int i, int i2, String str) {
        if (str == null) {
            str = "me";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        arrayList.add(new C0613d("limit", String.valueOf(i)));
        arrayList.add(new C0613d("offset", String.valueOf(i2 * i)));
        arrayList.add(new C0613d("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,username,age_range,third_party_id,installed,timezone,updated_time,verified,bio,birthday,cover,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture,quotes,relationship_status,religion,security_settings,significant_other,video_upload_limits,website,work"));
        String a = this.f1456h.mo2207a("https://graph.facebook.com/" + str + "/friends", arrayList, "friends", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2056a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        C0613d dVar;
        if (str2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry next : hashMap.entrySet()) {
                arrayList.add(new C0613d((String) next.getKey(), String.valueOf(next.getValue())));
            }
        }
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        if (hashMap2 == null || hashMap2.size() <= 0) {
            dVar = null;
        } else {
            C0613d dVar2 = null;
            for (Map.Entry next2 : hashMap2.entrySet()) {
                dVar2 = new C0613d((String) next2.getKey(), next2.getValue());
            }
            dVar = dVar2;
        }
        String a = C4054q.f16510f.equals(str2.toUpperCase()) ? this.f1456h.mo2200a(str, (ArrayList<C0613d<String>>) arrayList, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null) : C4054q.f16509e.equals(str2.toUpperCase()) ? this.f1456h.mo2199a(str, arrayList, dVar, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null) : null;
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    /* renamed from: a */
    public void mo2057a(AuthorizeListener authorizeListener, boolean z) {
        if (z) {
            mo2389b(authorizeListener);
        } else {
            mo2388a(new C0608e(this, authorizeListener));
        }
    }

    /* renamed from: a */
    public void mo2058a(String str) {
        this.f1455g = str;
    }

    /* renamed from: a */
    public void mo2059a(String str, String str2) {
        this.f1453e = str;
        if (str2 != null && !str2.equals("0")) {
            this.f1454f = System.currentTimeMillis() + ((long) (Integer.parseInt(str2) * 1000));
        }
    }

    /* renamed from: a */
    public void mo2060a(String[] strArr) {
        this.f1457i = strArr;
    }

    /* renamed from: a */
    public boolean mo2061a() {
        return this.f1453e != null && (this.f1454f == 0 || System.currentTimeMillis() < this.f1454f);
    }

    /* renamed from: b */
    public HashMap<String, Object> mo2062b(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        arrayList.add(new C0613d(MonitorMessages.MESSAGE, str));
        String b = this.f1456h.mo2210b("https://graph.facebook.com/me/feed", arrayList, "/me/feed", mo2390c());
        if (b != null && b.length() > 0) {
            HashMap<String, Object> a = new C0665d().mo2496a(b);
            if (a.containsKey("id")) {
                return mo2064c(String.valueOf(a.get("id")));
            }
        }
        return null;
    }

    /* renamed from: b */
    public HashMap<String, Object> mo2063b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        arrayList.add(new C0613d(MonitorMessages.MESSAGE, str));
        String a = this.f1456h.mo2204a("https://graph.facebook.com/me/photos", (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) new C0613d("source", str2), "/me/photos", mo2390c());
        if (a != null && a.length() > 0) {
            HashMap<String, Object> a2 = new C0665d().mo2496a(a);
            if (a2.containsKey("id")) {
                return mo2064c(String.valueOf(a2.get("id")));
            }
        }
        return null;
    }

    /* renamed from: c */
    public HashMap<String, Object> mo2064c(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR)) {
            String[] split = str.split(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR);
            str = split[split.length - 1];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        String a = this.f1456h.mo2207a("https://graph.facebook.com/" + str, arrayList, "get_status_info", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    /* renamed from: d */
    public HashMap<String, Object> mo2065d(String str) {
        String str2 = "/me";
        if (str != null) {
            str2 = "/" + str;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("access_token", this.f1453e));
        arrayList.add(new C0613d("format", "json"));
        arrayList.add(new C0613d("fields", "id,name,first_name,middle_name,last_name,gender,locale,languages,link,username,age_range,third_party_id,installed,timezone,updated_time,verified,bio,birthday,cover,currency,devices,education,email,hometown,interested_in,location,political,payment_pricepoints,favorite_athletes,favorite_teams,picture,quotes,relationship_status,religion,security_settings,significant_other,video_upload_limits,website,work"));
        String a = this.f1456h.mo2207a("https://graph.facebook.com" + str2, arrayList, "get_user_info", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    public String getAuthorizeUrl() {
        Bundle bundle = new Bundle();
        bundle.putString(PresentConfigXmlTag.TOAST_ATTR_DISPLAY_TITLE, "touch");
        bundle.putString("redirect_uri", "fbconnect://success");
        bundle.putString("type", "user_agent");
        String[] strArr = this.f1457i == null ? f1450b : this.f1457i;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(str);
            i++;
        }
        bundle.putString("scope", sb.toString());
        bundle.putString("client_id", this.f1455g);
        this.f1452d = "https://m.facebook.com/dialog/oauth" + C2261Q.f9807m + C0661R.encodeUrl(bundle);
        ShareSDK.logApiEvent("/dialog/oauth", mo2390c());
        return this.f1452d;
    }

    public C0622b getAuthorizeWebviewClient(C0627g gVar) {
        return new C0606c(gVar);
    }

    public String getRedirectUri() {
        return "fbconnect://success";
    }

    public C0626f getSSOProcessor(C0625e eVar) {
        C0605b bVar = new C0605b(eVar);
        bVar.mo2262a(32525);
        bVar.mo2052a(this.f1455g, this.f1457i == null ? f1450b : this.f1457i);
        return bVar;
    }
}
