package p018cn.sharesdk.twitter;

import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import com.cootek.smartinput5.plugin.twitter.C2417r;
import com.weibo.net.C4054q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p018cn.sharesdk.framework.C0651f;
import p018cn.sharesdk.framework.Platform;
import p018cn.sharesdk.framework.ShareSDK;
import p018cn.sharesdk.framework.authorize.AuthorizeListener;
import p018cn.sharesdk.framework.authorize.C0622b;
import p018cn.sharesdk.framework.authorize.C0627g;
import p018cn.sharesdk.framework.p019a.C0613d;
import p018cn.sharesdk.framework.p019a.C0616g;
import p018cn.sharesdk.framework.p019a.C0617h;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;
import p018cn.sharesdk.framework.utils.C0669f;

/* renamed from: cn.sharesdk.twitter.e */
public class C0697e extends C0651f {

    /* renamed from: b */
    private static C0697e f1688b;

    /* renamed from: c */
    private C0669f f1689c = new C0669f();

    /* renamed from: d */
    private C0617h f1690d = C0617h.m3549a();

    private C0697e(Platform platform) {
        super(platform);
    }

    /* renamed from: a */
    public static C0697e m3922a(Platform platform) {
        if (f1688b == null) {
            f1688b = new C0697e(platform);
        }
        return f1688b;
    }

    /* renamed from: a */
    public String mo2630a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0613d(C2409j.f10557o, str));
            return this.f1690d.mo2205a(C2417r.f10577f, (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) null, this.f1689c.mo2503a(this.f1689c.mo2501a(C2417r.f10577f, (ArrayList<C0613d<String>>) arrayList)), "/oauth/access_token", mo2390c());
        } catch (Throwable th) {
            C0666e.m3838b(th);
            return null;
        }
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2631a(int i, int i2, String str) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        try {
            j = Long.parseLong(str);
        } catch (Throwable th) {
            str = null;
        }
        arrayList.add(new C0613d("user_id", str == null ? this.f1589a.getDb().getUserId() : String.valueOf(j)));
        String a = this.f1690d.mo2208a("https://api.twitter.com/1.1/friends/list.json", (ArrayList<C0613d<String>>) arrayList, this.f1689c.mo2503a(this.f1689c.mo2506b("https://api.twitter.com/1.1/friends/list.json", arrayList)), (ArrayList<C0613d<?>>) null, "/1.1/friends/list.json", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2632a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        C0613d dVar;
        String str3;
        ArrayList<C0613d<String>> arrayList;
        if (str2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry next : hashMap.entrySet()) {
                arrayList2.add(new C0613d((String) next.getKey(), String.valueOf(next.getValue())));
            }
        }
        if (hashMap2 == null || hashMap2.size() <= 0) {
            dVar = null;
        } else {
            C0613d dVar2 = null;
            for (Map.Entry next2 : hashMap2.entrySet()) {
                dVar2 = new C0613d((String) next2.getKey(), next2.getValue());
            }
            dVar = dVar2;
        }
        if (C4054q.f16510f.equals(str2.toUpperCase())) {
            str3 = new C0616g().mo2200a(str, (ArrayList<C0613d<String>>) arrayList2, this.f1689c.mo2503a(this.f1689c.mo2506b(str, arrayList2)), (ArrayList<C0613d<?>>) null);
        } else if (C4054q.f16509e.equals(str2.toUpperCase())) {
            if (hashMap2 == null || hashMap2.size() <= 0) {
                arrayList = this.f1689c.mo2503a(this.f1689c.mo2501a(str, (ArrayList<C0613d<String>>) arrayList2));
            } else {
                arrayList = this.f1689c.mo2503a(this.f1689c.mo2501a(str, (ArrayList<C0613d<String>>) new ArrayList()));
                arrayList.remove(1);
            }
            str3 = new C0616g().mo2199a(str, arrayList2, dVar, arrayList, (ArrayList<C0613d<?>>) null);
        } else {
            str3 = null;
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(str3);
    }

    /* renamed from: a */
    public void mo2633a(AuthorizeListener authorizeListener) {
        mo2389b(authorizeListener);
    }

    /* renamed from: a */
    public void mo2634a(String str, String str2) {
        this.f1689c.mo2504a(str, str2);
    }

    /* renamed from: a */
    public void mo2635a(String str, String str2, String str3) {
        this.f1689c.mo2505a(str, str2, str3);
    }

    /* renamed from: b */
    public HashMap<String, Object> mo2636b(String str) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        try {
            j = Long.parseLong(str);
        } catch (Throwable th) {
            str = null;
        }
        arrayList.add(new C0613d("user_id", str == null ? this.f1589a.getDb().getUserId() : String.valueOf(j)));
        String a = this.f1690d.mo2208a("https://api.twitter.com/1.1/users/show.json", (ArrayList<C0613d<String>>) arrayList, this.f1689c.mo2503a(this.f1689c.mo2506b("https://api.twitter.com/1.1/users/show.json", arrayList)), (ArrayList<C0613d<?>>) null, "/1.1/users/show.json", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    /* renamed from: b */
    public HashMap<String, Object> mo2637b(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        ArrayList<C0613d<String>> a = this.f1689c.mo2503a(this.f1689c.mo2501a("https://api.twitter.com/1.1/statuses/update_with_media.json", (ArrayList<C0613d<String>>) arrayList));
        a.remove(1);
        arrayList.add(new C0613d("status", str));
        String a2 = this.f1690d.mo2205a("https://api.twitter.com/1.1/statuses/update_with_media.json", (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) new C0613d("media[]", str2), a, "/1.1/statuses/update_with_media.json", mo2390c());
        if (a2 == null || a2.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a2);
    }

    /* renamed from: c */
    public HashMap<String, Object> mo2638c(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("status", str));
        String a = this.f1690d.mo2205a("https://api.twitter.com/1.1/statuses/update.json", (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) null, this.f1689c.mo2503a(this.f1689c.mo2501a("https://api.twitter.com/1.1/statuses/update.json", (ArrayList<C0613d<String>>) arrayList)), "/1.1/statuses/update.json", mo2390c());
        if (a == null || a.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(a);
    }

    public String getAuthorizeUrl() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0613d(C2409j.f10545c, getRedirectUri()));
            mo2634a((String) null, (String) null);
            String a = this.f1690d.mo2205a(C2417r.f10575d, (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) null, this.f1689c.mo2503a(this.f1689c.mo2501a(C2417r.f10575d, (ArrayList<C0613d<String>>) arrayList)), "/oauth/request_token", mo2390c());
            if (a == null) {
                return null;
            }
            String[] split = a.split(C2261Q.f9808n);
            HashMap hashMap = new HashMap();
            for (String str : split) {
                if (str != null) {
                    String[] split2 = str.split("=");
                    if (split2.length >= 2) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
            if (hashMap.containsKey(C2409j.f10554l)) {
                String str2 = (String) hashMap.get(C2409j.f10554l);
                mo2634a(str2, (String) hashMap.get(C2409j.f10553k));
                ShareSDK.logApiEvent("/oauth/authorize", mo2390c());
                return "https://api.twitter.com/oauth/authorize?oauth_token=" + str2;
            }
            return null;
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
    }

    public C0622b getAuthorizeWebviewClient(C0627g gVar) {
        return new C0694b(gVar);
    }

    public String getRedirectUri() {
        return this.f1689c.mo2499a().f1646e;
    }
}
