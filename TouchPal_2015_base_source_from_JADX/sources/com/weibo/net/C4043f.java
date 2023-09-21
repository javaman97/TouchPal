package com.weibo.net;

import android.os.Bundle;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.plugin.twitter.C2409j;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Random;

/* renamed from: com.weibo.net.f */
/* compiled from: HttpHeaderFactory */
public abstract class C4043f {

    /* renamed from: a */
    public static final String f16490a = "HmacSHA1";

    /* renamed from: b */
    public static final String f16491b = "HMAC-SHA1";

    /* renamed from: c */
    public static final String f16492c = "1.0";

    /* renamed from: a */
    public abstract C4062x mo14980a(C4062x xVar);

    /* renamed from: a */
    public abstract String mo14981a(String str, C4053p pVar) throws C4061w;

    /* renamed from: a */
    public abstract void mo14982a(C4062x xVar, C4062x xVar2);

    /* renamed from: a */
    public String mo14987a(String str, String str2, C4062x xVar, String str3, String str4, C4053p pVar) throws C4061w {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C4062x a = m17184a(currentTimeMillis + ((long) new Random().nextInt()), currentTimeMillis, pVar);
        a.mo15037a(C2409j.f10548f, mo14981a(m17189a(str, m17185a(a, xVar, str2), str2, pVar), pVar));
        mo14982a(a, xVar);
        return "OAuth " + m17187a(a, ",", true);
    }

    /* renamed from: a */
    private String m17189a(String str, C4062x xVar, String str2, C4053p pVar) {
        StringBuffer append = new StringBuffer(str).append(C2261Q.f9808n).append(m17190b(m17188a(str2))).append(C2261Q.f9808n);
        append.append(m17190b(m17187a(xVar, C2261Q.f9808n, false)));
        return append.toString();
    }

    /* renamed from: a */
    private C4062x m17185a(C4062x xVar, C4062x xVar2, String str) throws C4061w {
        C4062x xVar3 = new C4062x();
        xVar3.mo15035a(xVar);
        xVar3.mo15037a("source", C4057s.m17252c());
        xVar3.mo15035a(xVar2);
        mo14988a(str, xVar3);
        return mo14980a(xVar3);
    }

    /* renamed from: a */
    private C4062x m17184a(long j, long j2, C4053p pVar) {
        C4062x xVar = new C4062x();
        xVar.mo15037a(C2409j.f10546d, C4057s.m17252c());
        xVar.mo15037a(C2409j.f10547e, String.valueOf(j));
        xVar.mo15037a(C2409j.f10549g, "HMAC-SHA1");
        xVar.mo15037a(C2409j.f10550h, String.valueOf(j2));
        xVar.mo15037a(C2409j.f10551i, "1.0");
        if (pVar != null) {
            xVar.mo15037a(C2409j.f10554l, pVar.mo14995a());
        } else {
            xVar.mo15037a("source", C4057s.m17252c());
        }
        return xVar;
    }

    /* renamed from: a */
    public void mo14988a(String str, C4062x xVar) throws C4061w {
        int indexOf = str.indexOf(C2261Q.f9807m);
        if (-1 != indexOf) {
            try {
                for (String split : str.substring(indexOf + 1).split(C2261Q.f9808n)) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        xVar.mo15037a(URLDecoder.decode(split2[0], Utils.UTF8), URLDecoder.decode(split2[1], Utils.UTF8));
                    } else {
                        xVar.mo15037a(URLDecoder.decode(split2[0], Utils.UTF8), "");
                    }
                }
            } catch (UnsupportedEncodingException e) {
                throw new C4061w((Exception) e);
            }
        }
    }

    /* renamed from: a */
    public static String m17187a(C4062x xVar, String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < xVar.mo15033a(); i++) {
            if (stringBuffer.length() != 0) {
                if (z) {
                    stringBuffer.append("\"");
                }
                stringBuffer.append(str);
            }
            stringBuffer.append(m17190b(xVar.mo15039b(i))).append("=");
            if (z) {
                stringBuffer.append("\"");
            }
            stringBuffer.append(m17190b(xVar.mo15041c(i)));
        }
        if (stringBuffer.length() != 0 && z) {
            stringBuffer.append("\"");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m17186a(Bundle bundle, String str, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : bundle.keySet()) {
            if (stringBuffer.length() != 0) {
                if (z) {
                    stringBuffer.append("\"");
                }
                stringBuffer.append(str);
            }
            stringBuffer.append(m17190b(str2)).append("=");
            if (z) {
                stringBuffer.append("\"");
            }
            stringBuffer.append(m17190b(bundle.getString(str2)));
        }
        if (stringBuffer.length() != 0 && z) {
            stringBuffer.append("\"");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m17188a(String str) {
        int indexOf = str.indexOf(C2261Q.f9807m);
        if (-1 != indexOf) {
            str = str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf("/", 8);
        String lowerCase = str.substring(0, indexOf2).toLowerCase();
        int indexOf3 = lowerCase.indexOf(":", 8);
        if (-1 != indexOf3) {
            if (lowerCase.startsWith("http://") && lowerCase.endsWith(":80")) {
                lowerCase = lowerCase.substring(0, indexOf3);
            } else if (lowerCase.startsWith("https://") && lowerCase.endsWith(":443")) {
                lowerCase = lowerCase.substring(0, indexOf3);
            }
        }
        return lowerCase + str.substring(indexOf2);
    }

    /* renamed from: b */
    public static String m17190b(String str) {
        String str2 = null;
        try {
            str2 = URLEncoder.encode(str, Utils.UTF8);
        } catch (UnsupportedEncodingException e) {
        }
        StringBuffer stringBuffer = new StringBuffer(str2.length());
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '*') {
                stringBuffer.append("%2A");
            } else if (charAt == '+') {
                stringBuffer.append("%20");
            } else if (charAt == '%' && i + 1 < str2.length() && str2.charAt(i + 1) == '7' && str2.charAt(i + 2) == 'E') {
                stringBuffer.append('~');
                i += 2;
            } else {
                stringBuffer.append(charAt);
            }
            i++;
        }
        return stringBuffer.toString();
    }
}
