package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Environment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.iflytek.speech.VoiceWakeuperAidl;
import com.yahoo.mobile.client.share.search.commands.SearchHistoryCommand;
import com.yahoo.mobile.client.share.search.data.SearchQuery;
import com.yahoo.mobile.client.share.search.interfaces.ICancelable;
import com.yahoo.mobile.client.share.search.p099ui.view.Utils;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.util.j */
public final class C4245j {

    /* renamed from: a */
    private static byte[] f17342a = {10, 1, 2, 3, 4, 11, 12, 13};

    /* renamed from: a */
    public static boolean m17784a(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.READ_CONTACTS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m17787b(Context context) {
        if (context != null) {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m17789c(Context context) {
        if (!"mounted".equals(Environment.getExternalStorageState()) || context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m17781a(Map<String, String> map) {
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

    /* renamed from: a */
    public static String m17782a(byte[] bArr, String str) {
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            try {
                return new String(bArr, Utils.UTF8);
            } catch (UnsupportedEncodingException e2) {
                return "";
            }
        }
    }

    /* renamed from: a */
    public static String m17780a(InputStream inputStream, String str, ICancelable iCancelable) throws IOException {
        if (inputStream == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    inputStream.close();
                    return sb.toString();
                } else if (iCancelable.isCanceled()) {
                    bufferedReader.close();
                    return "";
                } else {
                    sb.append(cArr, 0, read);
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* renamed from: a */
    public static boolean m17785a(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: a */
    public static Spannable m17779a(String str, String str2) {
        SpannableString spannableString = new SpannableString(str2);
        int indexOf = str2.toLowerCase().indexOf(str.toLowerCase());
        StyleSpan styleSpan = new StyleSpan(1);
        if (indexOf >= 0) {
            spannableString.setSpan(styleSpan, 0, indexOf, 33);
            int length = indexOf + str.length();
            if (length >= 0 && length < spannableString.length()) {
                spannableString.setSpan(new StyleSpan(1), length, str2.length(), 33);
            }
        } else {
            spannableString.setSpan(styleSpan, 0, str2.length(), 33);
        }
        return spannableString;
    }

    /* renamed from: a */
    public static void m17783a(Context context, SearchQuery searchQuery, String str, String str2) {
        if (C4129c.m17440e() && context != null && !m17785a(str)) {
            new StringBuilder("tracking Histoyr url = ").append(str).append(" title=").append(str2);
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("title", str2);
            new SearchQuery(new SearchQuery.Builder(searchQuery).setAdditionalParameters(hashMap));
            new SearchHistoryCommand(context, searchQuery, SearchHistoryCommand.SearchHistoryActionEnum.ADD_C).executeCommand();
        }
    }

    /* renamed from: b */
    public static boolean m17788b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        if (!str.equals(str2)) {
            return m17786b(str).equals(m17786b(str2));
        }
        return true;
    }

    /* renamed from: b */
    private static String m17786b(String str) {
        if (str != null && str.startsWith("+")) {
            return str.substring(1);
        }
        return str;
    }
}
