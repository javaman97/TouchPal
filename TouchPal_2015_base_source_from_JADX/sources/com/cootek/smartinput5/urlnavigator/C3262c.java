package com.cootek.smartinput5.urlnavigator;

import android.text.TextUtils;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.cootek.smartinput5.urlnavigator.c */
/* compiled from: FavoritesItem */
public class C3262c {

    /* renamed from: a */
    public static final String f14352a = "http://";

    /* renamed from: b */
    public static final String f14353b = "https://";

    /* renamed from: c */
    public String f14354c;

    /* renamed from: d */
    public String f14355d;

    /* renamed from: a */
    public static boolean m14491a(String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* renamed from: b */
    public static String m14492b(String str) {
        if (TextUtils.isEmpty(str) || m14491a(str)) {
            return str;
        }
        String replaceFirst = str.replaceFirst("^(((.*?:)?/+)|(.*?:+/?))", "http://");
        return !m14491a(replaceFirst) ? "http://" + replaceFirst : replaceFirst;
    }

    /* renamed from: a */
    public boolean mo10439a() {
        return !TextUtils.isEmpty(this.f14354c) && !TextUtils.isEmpty(this.f14355d);
    }

    /* renamed from: a */
    public boolean mo10440a(C3265f fVar) {
        File b = mo10441b(fVar);
        return b != null && b.exists() && b.length() > 0;
    }

    /* renamed from: b */
    public String mo10442b() {
        try {
            return new URL(this.f14354c).getHost() + ".ico";
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public File mo10441b(C3265f fVar) {
        String b = mo10442b();
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return new File(fVar.mo10453c(), b);
    }
}
