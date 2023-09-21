package com.yahoo.mobile.client.share.search.util;

import android.net.Uri;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class UrlUtils {

    /* renamed from: a */
    public static final Pattern f17320a = Pattern.compile("(?i)((?:http|https|file):\\/\\/|(?:inline|data|about|javascript):)(.*)");

    /* renamed from: b */
    private static final String f17321b = UrlUtils.class.toString();

    private UrlUtils() {
    }

    public static Map<String, String> getParametersMap(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            if (str.contains(C2261Q.f9807m)) {
                str = str.substring(str.indexOf(63) + 1);
            }
            for (String split : str.split(C2261Q.f9808n)) {
                String[] split2 = split.split("=");
                String str2 = "";
                try {
                    if (split2.length > 0) {
                        String decode = URLDecoder.decode(split2[0], Utils.UTF8);
                        if (decode.length() > 0) {
                            if (split2.length > 1) {
                                str2 = URLDecoder.decode(split2[1], Utils.UTF8);
                            }
                            hashMap.put(decode, str2);
                        }
                    }
                } catch (UnsupportedEncodingException e) {
                    String str3 = f17321b;
                    e.getMessage();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m17742a(String str) {
        if (str == null) {
            return null;
        }
        try {
            str = URLDecoder.decode(str, Utils.UTF8);
        } catch (Exception e) {
        }
        try {
            return URLEncoder.encode(str, Utils.UTF8).replace("%3A%2F%2F", "://").replace("%2F", "/").replace("%3A", ":").replace("%3F", C2261Q.f9807m).replace("%3D", "=").replace("%26", C2261Q.f9808n);
        } catch (UnsupportedEncodingException e2) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m17744b(String str) {
        String str2;
        String substring;
        int indexOf;
        String str3 = str;
        while (str3 != null) {
            if (str3.startsWith("wrapper://app/web")) {
                Map<String, String> parametersMap = getParametersMap(str3.substring(17));
                if (parametersMap.containsKey("url")) {
                    str3 = parametersMap.get("url");
                }
            } else {
                if (str3 == null) {
                    str2 = null;
                } else {
                    int indexOf2 = str3.indexOf("://");
                    if (indexOf2 >= 0) {
                        str2 = str3.substring(indexOf2 + 3);
                    } else {
                        str2 = str3;
                    }
                }
                if (str2.startsWith("r.search.yahoo.com") && (indexOf = substring.indexOf("/RU=")) >= 0) {
                    int i = indexOf + 4;
                    int indexOf3 = (substring = str2.substring(18)).indexOf("/R", i);
                    if (indexOf3 >= 0) {
                        return substring.substring(i, indexOf3);
                    }
                    return substring.substring(i);
                }
            }
            return str3;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m17743a(Uri uri) {
        String host;
        if (uri == null || (host = uri.getHost()) == null || !host.startsWith("maps.google.com")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m17745c(String str) {
        if (str == null) {
            return "";
        }
        try {
            String host = new URI(str).getHost();
            if (host.startsWith("www.")) {
                return host.substring(4);
            }
            return host;
        } catch (Exception e) {
            String str2 = f17321b;
            e.getMessage();
            return "";
        }
    }
}
