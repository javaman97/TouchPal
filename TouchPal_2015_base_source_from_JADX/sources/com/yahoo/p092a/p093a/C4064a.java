package com.yahoo.p092a.p093a;

import android.content.Context;
import com.cootek.smartinput5.func.p054d.C1712h;
import java.util.ArrayList;
import java.util.Date;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

/* renamed from: com.yahoo.a.a.a */
public class C4064a {

    /* renamed from: com.yahoo.a.a.a$a */
    public enum C4065a {
        ADVERTISERID,
        ANDROIDID,
        MACADDRESS,
        UUID
    }

    /* renamed from: com.yahoo.a.a.a$b */
    public interface C4066b {
        void onCompleted(ArrayList<Cookie> arrayList, String str, C4065a aVar);
    }

    /* renamed from: a */
    public static void m17298a(Context context, C4066b bVar) {
        if (context != null) {
            try {
                Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
                Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                C4070e.m17319a(context, new C4067b(context, bVar));
            } catch (Throwable th) {
                ArrayList arrayList = new ArrayList();
                String b = C4068c.m17307b(context);
                String a = C4068c.m17304a(context);
                if (!C4069d.m17315b(b)) {
                    arrayList.add(m17301b(C1712h.f5592n, a, new Date(2127585600000L)));
                    String c = m17302c();
                    if (!C4069d.m17315b(c)) {
                        arrayList.add(m17301b("AO", c, new Date(2127585600000L)));
                    }
                    if (bVar != null) {
                        bVar.onCompleted(arrayList, b, C4065a.ADVERTISERID);
                        return;
                    }
                    return;
                }
                String a2 = C4069d.m17312a(context);
                String d = C4069d.m17317d(C4069d.m17313a(a2));
                arrayList.add(m17301b(C1712h.f5592n, d, new Date(2127585600000L)));
                String c2 = m17302c();
                if (!C4069d.m17315b(c2)) {
                    arrayList.add(m17301b("AO", c2, new Date(2127585600000L)));
                }
                if (bVar != null) {
                    bVar.onCompleted(arrayList, a2, C4069d.m17311a());
                }
                if (C4069d.m17316c(d)) {
                    C4068c.m17306a("", d, context);
                }
            }
        } else if (bVar != null) {
            bVar.onCompleted((ArrayList<Cookie>) null, (String) null, (C4065a) null);
        }
    }

    /* renamed from: a */
    public static ArrayList<Cookie> m17296a(Context context) {
        if (context == null) {
            return null;
        }
        ArrayList<Cookie> arrayList = new ArrayList<>();
        arrayList.add(m17301b(C1712h.f5592n, C4068c.m17304a(context), new Date(2127585600000L)));
        String c = m17302c();
        if (C4069d.m17315b(c)) {
            return arrayList;
        }
        arrayList.add(m17301b("AO", c, new Date(2127585600000L)));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String m17302c() {
        try {
            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            if (m17299a()) {
                return "o=1&pm=1";
            }
            return "";
        } catch (Throwable th) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Cookie m17301b(String str, String str2, Date date) {
        BasicClientCookie basicClientCookie = new BasicClientCookie(str, str2);
        basicClientCookie.setDomain(".yahoo.com");
        basicClientCookie.setPath("/");
        basicClientCookie.setExpiryDate(date);
        return basicClientCookie;
    }

    /* renamed from: a */
    public static boolean m17299a() {
        try {
            Class.forName("com.google.android.gms.common.GooglePlayServicesUtil");
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return C4070e.m17320a();
        } catch (Throwable th) {
            return false;
        }
    }
}
