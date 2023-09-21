package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.iflytek.speech.VoiceWakeuperAidl;
import com.yahoo.mobile.client.share.search.util.UrlBuilderUtils;
import com.yahoo.p092a.p093a.C4064a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.cookie.Cookie;

/* renamed from: com.yahoo.mobile.client.share.search.util.d */
public final class C4238d {

    /* renamed from: a */
    public static String f17330a = null;

    /* renamed from: b */
    public static C4064a.C4065a f17331b = null;

    /* renamed from: c */
    public static boolean f17332c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Map<String, String> f17333d = new HashMap();

    /* renamed from: a */
    public static String m17760a(boolean z) {
        Map<String, String> a = m17761a();
        int size = a.size();
        if (z) {
            if (a.containsKey("Y")) {
                size--;
            }
            if (a.containsKey("T")) {
                size--;
            }
        }
        if (size <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(4096);
        int i = size;
        for (Map.Entry next : a.entrySet()) {
            if (!z || (!((String) next.getKey()).equals("Y") && !((String) next.getKey()).equals("T"))) {
                sb.append(((String) next.getValue()).split(VoiceWakeuperAidl.PARAMS_SEPARATE)[0]);
                int i2 = i - 1;
                if (i2 > 0) {
                    sb.append(';');
                }
                sb.append(' ');
                i = i2;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m17761a() {
        HashMap hashMap;
        synchronized (C4238d.class) {
            hashMap = new HashMap(f17333d);
        }
        return hashMap;
    }

    /* renamed from: b */
    public static synchronized String m17765b() {
        String str;
        synchronized (C4238d.class) {
            str = f17330a;
        }
        return str;
    }

    /* renamed from: c */
    public static synchronized String m17766c() {
        String name;
        synchronized (C4238d.class) {
            if (f17331b == null) {
                name = null;
            } else {
                name = f17331b.name();
            }
        }
        return name;
    }

    /* renamed from: d */
    public static synchronized String m17767d() {
        String str;
        synchronized (C4238d.class) {
            if (f17332c) {
                str = "1";
            } else {
                str = "0";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m17763a(final Context context) {
        if (!m17764a(C1712h.f5592n)) {
            C4064a.m17298a(context, new C4064a.C4066b() {
                public final synchronized void onCompleted(ArrayList<Cookie> arrayList, String str, C4064a.C4065a aVar) {
                    if (C4238d.f17333d == null) {
                        Map unused = C4238d.f17333d = new HashMap();
                    }
                    if (str != null) {
                        C4238d.f17330a = str;
                    }
                    if (aVar != null) {
                        C4238d.f17331b = aVar;
                    }
                    C4238d.f17332c = C4064a.m17299a();
                    CookieSyncManager.createInstance(context);
                    if (arrayList != null) {
                        Iterator<Cookie> it = arrayList.iterator();
                        while (it.hasNext()) {
                            Cookie next = it.next();
                            if (!TextUtils.isEmpty(next.getValue())) {
                                C4238d.f17333d.put(next.getName(), next.getName() + "=" + next.getValue());
                                CookieManager.getInstance().setCookie(".yahoo.com", next.getName() + "=" + next.getValue());
                            }
                        }
                        UrlBuilderUtils.m17741a((UrlBuilderUtils.Crumb) null);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m17764a(String str) {
        return f17333d != null && f17333d.containsKey(str) && !TextUtils.isEmpty(f17333d.get(str));
    }
}
