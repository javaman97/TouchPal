package p018cn.sharesdk.sina.weibo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.ServerParameters;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.weibo.net.C4054q;
import java.io.File;
import java.net.URLConnection;
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
import p018cn.sharesdk.framework.p019a.C0616g;
import p018cn.sharesdk.framework.p019a.C0617h;
import p018cn.sharesdk.framework.utils.C0661R;
import p018cn.sharesdk.framework.utils.C0665d;
import p018cn.sharesdk.framework.utils.C0666e;

/* renamed from: cn.sharesdk.sina.weibo.e */
public class C0691e extends C0651f {

    /* renamed from: b */
    private static C0691e f1671b;

    /* renamed from: c */
    private String f1672c;

    /* renamed from: d */
    private String f1673d;

    /* renamed from: e */
    private String f1674e;

    /* renamed from: f */
    private String f1675f;

    /* renamed from: g */
    private String[] f1676g;

    private C0691e(Platform platform) {
        super(platform);
    }

    /* renamed from: a */
    public static synchronized C0691e m3893a(Platform platform) {
        C0691e eVar;
        synchronized (C0691e.class) {
            if (f1671b == null) {
                f1671b = new C0691e(platform);
            }
            eVar = f1671b;
        }
        return eVar;
    }

    /* renamed from: a */
    private HashMap<String, Object> m3894a(String str, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        arrayList.add(new C0613d("access_token", this.f1675f));
        arrayList.add(new C0613d("status", str));
        arrayList.add(new C0613d("long", String.valueOf(f)));
        arrayList.add(new C0613d("lat", String.valueOf(f2)));
        String b = C0617h.m3549a().mo2210b("https://api.weibo.com/2/statuses/update.json", arrayList, "/2/statuses/update.json", mo2390c());
        if (b != null) {
            return new C0665d().mo2496a(b);
        }
        return null;
    }

    /* renamed from: a */
    private HashMap<String, Object> m3895a(String str, String str2, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        arrayList.add(new C0613d("access_token", this.f1675f));
        arrayList.add(new C0613d("status", str));
        arrayList.add(new C0613d("long", String.valueOf(f)));
        arrayList.add(new C0613d("lat", String.valueOf(f2)));
        arrayList.add(new C0613d("url", str2));
        String b = C0617h.m3549a().mo2210b("https://api.weibo.com/2/statuses/upload_url_text.json", arrayList, "/2/statuses/upload_url_text.json", mo2390c());
        if (b != null) {
            return new C0665d().mo2496a(b);
        }
        return null;
    }

    /* renamed from: b */
    private HashMap<String, Object> m3897b(String str, String str2, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        arrayList.add(new C0613d("access_token", this.f1675f));
        arrayList.add(new C0613d("status", str2));
        arrayList.add(new C0613d("long", String.valueOf(f)));
        arrayList.add(new C0613d("lat", String.valueOf(f2)));
        String a = C0617h.m3549a().mo2204a("https://api.weibo.com/2/statuses/upload.json", (ArrayList<C0613d<String>>) arrayList, (C0613d<String>) new C0613d("pic", str), "/2/statuses/upload.json", mo2390c());
        if (a != null) {
            return new C0665d().mo2496a(a);
        }
        return null;
    }

    /* renamed from: a */
    public String mo2613a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("client_id", this.f1672c));
        arrayList.add(new C0613d("client_secret", this.f1673d));
        arrayList.add(new C0613d("redirect_uri", this.f1674e));
        arrayList.add(new C0613d("grant_type", "authorization_code"));
        arrayList.add(new C0613d("code", str));
        String a = new C0616g().mo2199a("https://api.weibo.com/oauth2/access_token", arrayList, (C0613d<String>) null, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null);
        ShareSDK.logApiEvent("/oauth2/access_token", mo2390c());
        return a;
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2614a(int i, int i2, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        boolean z = true;
        try {
            Long.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new C0613d(ServerParameters.AF_USER_ID, str));
        } else {
            arrayList.add(new C0613d("screen_name", str));
        }
        arrayList.add(new C0613d(C1899v.f6362a, String.valueOf(i)));
        arrayList.add(new C0613d("page", String.valueOf(i2)));
        String a = C0617h.m3549a().mo2207a("https://api.weibo.com/2/statuses/user_timeline.json", arrayList, "/2/statuses/user_timeline.json", mo2390c());
        if (a != null) {
            return new C0665d().mo2496a(a);
        }
        return null;
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2615a(String str, String str2, String str3, float f, float f2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return !TextUtils.isEmpty(str3) ? m3897b(str3, str, f, f2) : !TextUtils.isEmpty(str2) ? m3895a(str, str2, f, f2) : m3894a(str, f, f2);
        }
        throw new Throwable("weibo content can not be null!");
    }

    /* renamed from: a */
    public HashMap<String, Object> mo2616a(String str, String str2, HashMap<String, Object> hashMap, HashMap<String, String> hashMap2) {
        C0613d dVar;
        String str3;
        if (str2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry next : hashMap.entrySet()) {
                arrayList.add(new C0613d((String) next.getKey(), String.valueOf(next.getValue())));
            }
        }
        arrayList.add(new C0613d("source", this.f1672c));
        if (this.f1675f != null) {
            arrayList.add(new C0613d("access_token", this.f1675f));
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
        try {
            if (C4054q.f16510f.equals(str2.toUpperCase())) {
                str3 = new C0616g().mo2200a(str, (ArrayList<C0613d<String>>) arrayList, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null);
            } else {
                if (C4054q.f16509e.equals(str2.toUpperCase())) {
                    str3 = new C0616g().mo2199a(str, arrayList, dVar, (ArrayList<C0613d<String>>) null, (ArrayList<C0613d<?>>) null);
                }
                str3 = null;
            }
        } catch (Throwable th) {
            C0666e.m3838b(th);
        }
        if (str3 == null || str3.length() <= 0) {
            return null;
        }
        return new C0665d().mo2496a(str3);
    }

    /* renamed from: a */
    public void mo2617a(AuthorizeListener authorizeListener, boolean z) {
        if (z) {
            mo2389b(authorizeListener);
        } else {
            mo2388a(new C0692f(this, authorizeListener));
        }
    }

    /* renamed from: a */
    public void mo2618a(String str) {
        this.f1674e = str;
    }

    /* renamed from: a */
    public void mo2619a(String str, String str2) {
        this.f1672c = str;
        this.f1673d = str2;
    }

    /* renamed from: a */
    public void mo2620a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
            File file = new File(C0617h.m3549a().mo2203a(this.f1589a.getContext(), str2));
            if (file.exists()) {
                str3 = file.getAbsolutePath();
            }
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (!TextUtils.isEmpty(str3)) {
            File file2 = new File(str3);
            if (file2.exists()) {
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file2));
                String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str3);
                if (contentTypeFor == null || contentTypeFor.length() <= 0) {
                    contentTypeFor = "image/*";
                }
                intent.setType(contentTypeFor);
            }
        } else {
            intent.setType("text/plain");
        }
        intent.setClassName("com.sina.weibo", "com.sina.weibo.EditActivity");
        intent.addFlags(Engine.EXCEPTION_ERROR);
        this.f1589a.getContext().startActivity(intent);
    }

    /* renamed from: a */
    public void mo2621a(String[] strArr) {
        this.f1676g = strArr;
    }

    /* renamed from: a */
    public boolean mo2622a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.sina.weibo");
        intent.setType("image/*");
        return this.f1589a.getContext().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: b */
    public HashMap<String, Object> mo2623b(int i, int i2, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        if (this.f1675f != null) {
            arrayList.add(new C0613d("access_token", this.f1675f));
        }
        boolean z = true;
        try {
            Long.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new C0613d(ServerParameters.AF_USER_ID, str));
        } else {
            arrayList.add(new C0613d("screen_name", str));
        }
        arrayList.add(new C0613d(C1899v.f6362a, String.valueOf(i)));
        arrayList.add(new C0613d("cursor", String.valueOf(i2 * i)));
        String a = C0617h.m3549a().mo2207a("https://api.weibo.com/2/friendships/friends.json", arrayList, "/2/friendships/friends.json", mo2390c());
        if (a != null) {
            return new C0665d().mo2496a(a);
        }
        return null;
    }

    /* renamed from: b */
    public void mo2624b(String str) {
        this.f1675f = str;
    }

    /* renamed from: c */
    public HashMap<String, Object> mo2625c(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        if (this.f1675f != null) {
            arrayList.add(new C0613d("access_token", this.f1675f));
        }
        boolean z = true;
        try {
            Long.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new C0613d(ServerParameters.AF_USER_ID, str));
        } else {
            arrayList.add(new C0613d("screen_name", str));
        }
        String a = C0617h.m3549a().mo2207a("https://api.weibo.com/2/users/show.json", arrayList, "/2/users/show.json", mo2390c());
        if (a != null) {
            return new C0665d().mo2496a(a);
        }
        return null;
    }

    /* renamed from: d */
    public HashMap<String, Object> mo2626d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("source", this.f1672c));
        arrayList.add(new C0613d("access_token", this.f1675f));
        boolean z = true;
        try {
            Long.parseLong(str);
        } catch (Throwable th) {
            z = false;
        }
        if (z) {
            arrayList.add(new C0613d(ServerParameters.AF_USER_ID, str));
        } else {
            arrayList.add(new C0613d("screen_name", str));
        }
        String b = C0617h.m3549a().mo2210b("https://api.weibo.com/2/friendships/create.json", arrayList, "/2/friendships/create.json", mo2390c());
        if (b != null) {
            return new C0665d().mo2496a(b);
        }
        return null;
    }

    public String getAuthorizeUrl() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0613d("client_id", this.f1672c));
        arrayList.add(new C0613d("response_type", "code"));
        arrayList.add(new C0613d("redirect_uri", this.f1674e));
        if (this.f1676g != null && this.f1676g.length > 0) {
            arrayList.add(new C0613d("scope", TextUtils.join(",", this.f1676g)));
        }
        arrayList.add(new C0613d(PresentConfigXmlTag.TOAST_ATTR_DISPLAY_TITLE, C1899v.f6389m));
        String str = "https://api.weibo.com/oauth2/authorize?" + C0661R.encodeUrl((ArrayList<C0613d<String>>) arrayList);
        ShareSDK.logApiEvent("/oauth2/authorize", mo2390c());
        return str;
    }

    public C0622b getAuthorizeWebviewClient(C0627g gVar) {
        return new C0688b(gVar);
    }

    public String getRedirectUri() {
        return this.f1674e;
    }

    public C0626f getSSOProcessor(C0625e eVar) {
        C0690d dVar = new C0690d(eVar);
        dVar.mo2262a(32973);
        dVar.mo2610a(this.f1672c, this.f1674e, new String[0]);
        return dVar;
    }
}
