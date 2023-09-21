package com.cootek.smartinput5.plugin.weibo;

import android.content.Context;
import android.content.SharedPreferences;
import com.cootek.smartinput5.plugin.twitter.C2417r;
import com.weibo.net.C4037a;
import com.weibo.net.C4053p;
import com.weibo.net.C4057s;

/* renamed from: com.cootek.smartinput5.plugin.weibo.a */
/* compiled from: AccessTokenPreference */
public class C2477a {

    /* renamed from: a */
    private static String f10751a = C2417r.f10583l;

    /* renamed from: b */
    private static String f10752b = "tokenSecret";

    /* renamed from: c */
    private static String f10753c = C4057s.f16527i;

    /* renamed from: d */
    private static C2477a f10754d = null;

    /* renamed from: e */
    private SharedPreferences f10755e = null;

    private C2477a(Context context) {
        this.f10755e = context.getApplicationContext().getSharedPreferences("weibo_token", 3);
    }

    /* renamed from: a */
    public static C2477a m11174a(Context context) {
        if (f10754d == null) {
            synchronized (C2477a.class) {
                if (f10754d == null) {
                    f10754d = new C2477a(context);
                }
            }
        }
        return f10754d;
    }

    /* renamed from: a */
    public static C2477a m11173a() {
        return f10754d;
    }

    /* renamed from: b */
    public boolean mo8268b() {
        return this.f10755e.contains(f10751a) && this.f10755e.contains(f10752b);
    }

    /* renamed from: c */
    public void mo8269c() {
        SharedPreferences.Editor edit = this.f10755e.edit();
        edit.clear();
        edit.commit();
    }

    /* renamed from: a */
    private void m11175a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.f10755e.edit();
        edit.putString(f10751a, str);
        edit.putString(f10752b, str2);
        edit.putLong(f10753c, j);
        edit.commit();
    }

    /* renamed from: d */
    public C4037a mo8270d() {
        return new C4037a(this.f10755e.getString(f10751a, ""), this.f10755e.getString(f10752b, ""));
    }

    /* renamed from: a */
    public void mo8267a(C4053p pVar) {
        m11175a(pVar.mo14995a(), pVar.mo15005e(), pVar.mo15001c());
    }
}
