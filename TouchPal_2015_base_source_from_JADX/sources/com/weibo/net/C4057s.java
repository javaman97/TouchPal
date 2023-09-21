package com.weibo.net;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.baidu.pcs.BaiduPCSClient;
import com.cootek.presentation.service.config.PresentConfigXmlTag;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;

/* renamed from: com.weibo.net.s */
/* compiled from: Weibo */
public class C4057s {

    /* renamed from: a */
    public static String f16519a = "https://api.weibo.com/2/";

    /* renamed from: b */
    public static String f16520b = "http://api.t.sina.com.cn/oauth/request_token";

    /* renamed from: c */
    public static String f16521c = "http://api.t.sina.com.cn/oauth/authorize";

    /* renamed from: d */
    public static String f16522d = "http://api.t.sina.com.cn/oauth/access_token";

    /* renamed from: e */
    public static String f16523e = "http://api.t.sina.com.cn/oauth/authenticate";

    /* renamed from: f */
    public static String f16524f = "https://api.weibo.com/oauth2/access_token";

    /* renamed from: g */
    public static String f16525g = "https://api.weibo.com/oauth2/authorize";

    /* renamed from: h */
    public static final String f16526h = "access_token";

    /* renamed from: i */
    public static final String f16527i = "expires_in";

    /* renamed from: j */
    public static final String f16528j = "wbconnect://success";

    /* renamed from: k */
    public static final String f16529k = "wbconnect://cancel";

    /* renamed from: l */
    private static String f16530l = "";
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static String f16531m = "";

    /* renamed from: n */
    private static C4057s f16532n = null;

    /* renamed from: r */
    private static final int f16533r = 32973;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4053p f16534o = null;

    /* renamed from: p */
    private C4047j f16535p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C4060v f16536q;

    /* renamed from: s */
    private String f16537s;

    /* renamed from: t */
    private C4060v f16538t;

    private C4057s() {
        C4054q.m17233a("Accept-Encoding", "gzip");
        C4054q.m17230a((C4053p) this.f16535p);
        this.f16537s = f16528j;
    }

    /* renamed from: a */
    public static synchronized C4057s m17245a() {
        C4057s sVar;
        synchronized (C4057s.class) {
            if (f16532n == null) {
                f16532n = new C4057s();
            }
            sVar = f16532n;
        }
        return sVar;
    }

    /* renamed from: a */
    public void mo15019a(C4037a aVar) {
        this.f16534o = aVar;
    }

    /* renamed from: b */
    public C4053p mo15024b() {
        return this.f16534o;
    }

    /* renamed from: a */
    public void mo15021a(String str, String str2) {
        f16530l = str;
        f16531m = str2;
    }

    /* renamed from: c */
    public static String m17252c() {
        return f16530l;
    }

    /* renamed from: d */
    public static String m17253d() {
        return f16531m;
    }

    /* renamed from: a */
    public void mo15020a(C4047j jVar) {
        this.f16535p = jVar;
    }

    /* renamed from: e */
    public static String m17254e() {
        return f16519a;
    }

    /* renamed from: a */
    public static void m17249a(String str) {
        f16519a = str;
    }

    /* renamed from: b */
    public void mo15025b(String str) {
        this.f16535p.mo15004d(str);
    }

    /* renamed from: f */
    public String mo15027f() {
        return this.f16537s;
    }

    /* renamed from: c */
    public void mo15026c(String str) {
        this.f16537s = str;
    }

    /* renamed from: a */
    public String mo15016a(Context context, String str, C4062x xVar, String str2, C4053p pVar) throws C4061w {
        return C4054q.m17220a(context, str, str2, xVar, this.f16534o);
    }

    /* renamed from: a */
    public C4047j mo15015a(Context context, String str, String str2, String str3) throws C4061w {
        C4054q.m17229a((C4043f) new C4048k());
        C4062x xVar = new C4062x();
        xVar.mo15037a(C2409j.f10545c, str3);
        C4047j jVar = new C4047j(C4054q.m17220a(context, f16520b, C4054q.f16509e, xVar, (C4053p) null));
        this.f16535p = jVar;
        return jVar;
    }

    /* renamed from: a */
    public C4037a mo15013a(Context context, C4047j jVar) throws C4061w {
        C4054q.m17229a((C4043f) new C4038b());
        C4062x xVar = new C4062x();
        xVar.mo15037a(C2409j.f10557o, this.f16535p.mo15003d());
        xVar.mo15037a("source", f16530l);
        C4037a aVar = new C4037a(C4054q.m17220a(context, f16522d, C4054q.f16509e, xVar, (C4053p) this.f16535p));
        this.f16534o = aVar;
        return aVar;
    }

    /* renamed from: a */
    public C4037a mo15014a(Context context, String str, String str2, String str3, String str4) throws C4061w {
        C4054q.m17229a((C4043f) new C4063y());
        C4062x xVar = new C4062x();
        xVar.mo15037a("x_auth_username", str3);
        xVar.mo15037a("x_auth_password", str4);
        xVar.mo15037a(C2409j.f10546d, f16530l);
        C4037a aVar = new C4037a(C4054q.m17220a(context, f16522d, C4054q.f16509e, xVar, (C4053p) null));
        this.f16534o = aVar;
        return aVar;
    }

    /* renamed from: b */
    public C4044g mo15023b(Context context, String str, String str2, String str3, String str4) throws C4061w {
        C4054q.m17229a((C4043f) new C4045h());
        C4062x xVar = new C4062x();
        xVar.mo15037a(BaiduPCSClient.Key_UserName, str3);
        xVar.mo15037a("password", str4);
        xVar.mo15037a("client_id", str);
        xVar.mo15037a("client_secret", str2);
        xVar.mo15037a("grant_type", "password");
        C4044g gVar = new C4044g(C4054q.m17220a(context, f16524f, C4054q.f16509e, xVar, (C4053p) null));
        this.f16534o = gVar;
        return gVar;
    }

    /* renamed from: a */
    public boolean mo15022a(Activity activity, String str, String str2, String str3, String str4) throws C4061w {
        if (TextUtils.isEmpty(str)) {
            throw new C4061w("token can not be null!");
        } else if (!TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
            Intent intent = new Intent(activity, ShareActivity.class);
            intent.putExtra(ShareActivity.f16461c, str);
            intent.putExtra(ShareActivity.f16462d, str2);
            intent.putExtra(ShareActivity.f16459a, str3);
            intent.putExtra(ShareActivity.f16460b, str4);
            activity.startActivity(intent);
            return true;
        } else {
            throw new C4061w("weibo content can not be null!");
        }
    }

    /* renamed from: a */
    private boolean m17250a(Activity activity, String str, String[] strArr, int i) {
        return false;
    }

    /* renamed from: a */
    private void m17246a(Activity activity, String[] strArr) {
        C4062x xVar = new C4062x();
        if (strArr.length > 0) {
            xVar.mo15037a("scope", TextUtils.join(",", strArr));
        }
        CookieSyncManager.createInstance(activity);
        this.f16538t = new C4058t(this);
        mo15018a((Context) activity, xVar, this.f16538t);
    }

    /* renamed from: a */
    public void mo15017a(Activity activity, C4060v vVar) {
        m17247a(activity, new String[0], (int) f16533r, vVar);
    }

    /* renamed from: a */
    private void m17248a(Activity activity, String[] strArr, C4060v vVar) {
        m17247a(activity, strArr, (int) f16533r, vVar);
    }

    /* renamed from: a */
    private void m17247a(Activity activity, String[] strArr, int i, C4060v vVar) {
        C4054q.m17229a((C4043f) new C4045h());
        boolean z = false;
        this.f16536q = vVar;
        if (i >= 0) {
            z = m17250a(activity, f16530l, strArr, i);
        }
        if (!z) {
            m17246a(activity, strArr);
        }
    }

    /* renamed from: g */
    public C4060v mo15028g() {
        return this.f16538t;
    }

    /* renamed from: a */
    public void mo15018a(Context context, C4062x xVar, C4060v vVar) {
        xVar.mo15037a("client_id", f16530l);
        xVar.mo15037a("response_type", "token");
        xVar.mo15037a("redirect_uri", this.f16537s);
        xVar.mo15037a(PresentConfigXmlTag.TOAST_ATTR_DISPLAY_TITLE, C1899v.f6389m);
        if (mo15029h()) {
            xVar.mo15037a("access_token", this.f16534o.mo14995a());
        }
        String str = f16525g + C2261Q.f9807m + C4054q.m17240c(xVar);
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            C4054q.m17228a(context, "Error", "Application requires permission to access the Internet");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("URL_OAUTH2", str);
        intent.addFlags(Engine.EXCEPTION_ERROR);
        intent.setClass(context, WeiboDialog.class);
        context.startActivity(intent);
    }

    /* renamed from: h */
    public boolean mo15029h() {
        if (this.f16534o == null || TextUtils.isEmpty(this.f16534o.mo14995a())) {
            return false;
        }
        if (this.f16534o.mo15001c() == 0 || System.currentTimeMillis() < this.f16534o.mo15001c()) {
            return true;
        }
        return false;
    }
}
