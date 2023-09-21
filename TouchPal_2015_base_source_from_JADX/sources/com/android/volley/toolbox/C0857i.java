package com.android.volley.toolbox;

import com.android.volley.C0819c;
import com.android.volley.C0830l;
import com.iflytek.speech.VoiceWakeuperAidl;
import java.util.Map;
import org.apache.http.impl.cookie.DateParseException;
import org.apache.http.impl.cookie.DateUtils;

/* renamed from: com.android.volley.toolbox.i */
/* compiled from: HttpHeaderParser */
public class C0857i {
    /* renamed from: a */
    public static C0819c.C0820a m4795a(C0830l lVar) {
        long j;
        long j2;
        long j3;
        boolean z = false;
        long j4 = 0;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = lVar.f2186c;
        String str = map.get("Date");
        if (str != null) {
            j = m4794a(str);
        } else {
            j = 0;
        }
        String str2 = map.get("Cache-Control");
        if (str2 != null) {
            String[] split = str2.split(",");
            long j5 = 0;
            for (String trim : split) {
                String trim2 = trim.trim();
                if (trim2.equals("no-cache") || trim2.equals("no-store")) {
                    return null;
                }
                if (trim2.startsWith("max-age=")) {
                    try {
                        j5 = Long.parseLong(trim2.substring(8));
                    } catch (Exception e) {
                    }
                } else if (trim2.equals("must-revalidate") || trim2.equals("proxy-revalidate")) {
                    j5 = 0;
                }
            }
            j2 = j5;
            z = true;
        } else {
            j2 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j3 = m4794a(str3);
        } else {
            j3 = 0;
        }
        String str4 = map.get("ETag");
        if (z) {
            j4 = (1000 * j2) + currentTimeMillis;
        } else if (j > 0 && j3 >= j) {
            j4 = (j3 - j) + currentTimeMillis;
        }
        C0819c.C0820a aVar = new C0819c.C0820a();
        aVar.f2151a = lVar.f2185b;
        aVar.f2152b = str4;
        aVar.f2155e = j4;
        aVar.f2154d = aVar.f2155e;
        aVar.f2153c = j;
        aVar.f2156f = map;
        return aVar;
    }

    /* renamed from: a */
    public static long m4794a(String str) {
        try {
            return DateUtils.parseDate(str).getTime();
        } catch (DateParseException e) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m4796a(Map<String, String> map) {
        String str = map.get("Content-Type");
        if (str != null) {
            String[] split = str.split(VoiceWakeuperAidl.PARAMS_SEPARATE);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=");
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return "ISO-8859-1";
    }
}
