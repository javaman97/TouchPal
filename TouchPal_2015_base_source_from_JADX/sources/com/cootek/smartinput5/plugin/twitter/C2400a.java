package com.cootek.smartinput5.plugin.twitter;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.cootek.smartinput5.plugin.twitter.a */
/* compiled from: AccessTokenPreference */
public class C2400a {

    /* renamed from: f */
    private static C2400a f10527f;

    /* renamed from: a */
    private final String f10528a = "twitter_access_token";

    /* renamed from: b */
    private final String f10529b = C2417r.f10583l;

    /* renamed from: c */
    private final String f10530c = "accessTokenSecret";

    /* renamed from: d */
    private SharedPreferences f10531d;

    /* renamed from: e */
    private boolean f10532e = false;

    /* renamed from: a */
    public static C2400a m10988a() {
        return f10527f;
    }

    /* renamed from: a */
    public static void m10989a(Context context) {
        if (f10527f == null) {
            synchronized (SharedPreferences.class) {
                if (f10527f == null) {
                    f10527f = new C2400a(context);
                    f10527f.f10532e = true;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m10990b() {
        if (f10527f == null) {
            return false;
        }
        return f10527f.f10532e;
    }

    private C2400a(Context context) {
        this.f10531d = context.getSharedPreferences("twitter_access_token", 3);
    }

    /* renamed from: c */
    public boolean mo8120c() {
        return this.f10531d.contains(C2417r.f10583l) && this.f10531d.contains("accessTokenSecret");
    }

    /* renamed from: d */
    public C2416q mo8121d() {
        C2416q qVar = new C2416q();
        String string = this.f10531d.getString(C2417r.f10583l, "");
        String string2 = this.f10531d.getString("accessTokenSecret", "");
        qVar.mo8151a(string);
        qVar.mo8156c(string2);
        return qVar;
    }

    /* renamed from: e */
    public void mo8122e() {
        SharedPreferences.Editor edit = this.f10531d.edit();
        edit.clear();
        edit.commit();
    }

    /* renamed from: a */
    public void mo8119a(String str, String str2) {
        SharedPreferences.Editor edit = this.f10531d.edit();
        edit.putString(C2417r.f10583l, str);
        edit.putString("accessTokenSecret", str2);
        edit.commit();
    }

    /* renamed from: a */
    public void mo8118a(C2416q qVar) {
        if (qVar != null) {
            mo8119a(qVar.mo8150a(), qVar.mo8155c());
        }
    }
}
