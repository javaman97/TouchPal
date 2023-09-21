package com.cootek.smartinput5.net;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.Toast;
import com.cootek.common.utils.ExternalStorage;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.Storage;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.func.asset.C1460o;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.net.cmd.C2243D;
import com.cootek.smartinput5.net.cmd.C2258O;
import com.cootek.smartinput5.net.cmd.C2261Q;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.cootek.smartinput5.net.al */
/* compiled from: Utils */
public class C2225al {

    /* renamed from: a */
    public static final int f9390a = 255;

    /* renamed from: b */
    public static final int f9391b = 1;

    /* renamed from: c */
    public static final int f9392c = 2;

    /* renamed from: d */
    public static final int f9393d = 4;

    /* renamed from: e */
    public static final int f9394e = 8;

    /* renamed from: f */
    public static final int f9395f = 16;

    /* renamed from: g */
    public static final int f9396g = 32;

    /* renamed from: h */
    public static final String f9397h = "app_id";

    /* renamed from: i */
    public static final String f9398i = "channel_code";

    /* renamed from: j */
    public static final String f9399j = "app_version";

    /* renamed from: k */
    public static final String f9400k = "locale";

    /* renamed from: l */
    public static final String f9401l = "mnc_network";

    /* renamed from: m */
    public static final String f9402m = "mnc_sim";

    /* renamed from: n */
    public static final String f9403n = "dictionary_id";

    /* renamed from: o */
    public static final String f9404o = "460";

    /* renamed from: p */
    public static final String f9405p = Locale.CHINA.toString().replace(Storage.STORAGE_PACKAGE_FILENAME_SEPERATOR, C1351J.f4161f);

    /* renamed from: q */
    private static final String f9406q = "NetworkUtils";

    /* renamed from: r */
    private static final String f9407r = "network_error.html";

    /* renamed from: a */
    public static String m10051a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        return (locale.getLanguage() + C1351J.f4161f + locale.getCountry()).toLowerCase();
    }

    /* renamed from: b */
    public static String m10061b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: c */
    public static String m10063c(Context context) {
        int integer = context.getResources().getInteger(R.integer.ime_version_code);
        if (integer != 0) {
            return Integer.toString(integer);
        }
        return C2243D.f9510b;
    }

    /* renamed from: d */
    public static String m10065d(Context context) {
        return C1974m.m9063a(context, C1593bR.m7162a().mo6232a(0));
    }

    /* renamed from: e */
    public static String m10067e(Context context) {
        return C1132b.m5654a(context).mo4414h();
    }

    /* renamed from: f */
    public static String m10069f(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperator();
        } else {
            str = "";
        }
        return C1132b.m5654a(context).mo4402a(C1135d.MNC_NETWORK, str);
    }

    /* renamed from: g */
    public static String m10071g(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || telephonyManager.getSimState() != 5) {
            str = "";
        } else {
            str = telephonyManager.getSimOperator();
        }
        return C1132b.m5654a(context).mo4402a(C1135d.MNC_SIM, str);
    }

    /* renamed from: h */
    public static String m10073h(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkCountryIso();
        } else {
            str = "";
        }
        return C1132b.m5654a(context).mo4402a(C1135d.ISO_COUNTRY_CODE, str);
    }

    /* renamed from: i */
    public static int m10075i(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getPhoneType();
        }
        return 0;
    }

    /* renamed from: a */
    public static String m10055a(Context context, String str, int i) {
        boolean isEmpty = TextUtils.isEmpty(str);
        StringBuilder sb = new StringBuilder();
        if (!isEmpty) {
            sb.append(str);
        }
        if ((i & 1) != 0) {
            m10057a(sb, f9397h, m10065d(context));
        }
        if ((i & 2) != 0) {
            m10057a(sb, f9399j, m10063c(context));
        }
        if ((i & 4) != 0) {
            m10057a(sb, f9398i, m10067e(context));
        }
        if ((i & 8) != 0) {
            m10057a(sb, f9400k, m10051a(context));
        }
        if ((i & 16) != 0) {
            m10057a(sb, f9401l, m10069f(context));
        }
        if ((i & 32) != 0) {
            m10057a(sb, f9402m, m10071g(context));
        }
        if (isEmpty && sb.length() > 0) {
            sb.replace(0, 1, C2261Q.f9807m);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m10057a(StringBuilder sb, String str, String str2) {
        String encode;
        if (sb != null && !TextUtils.isEmpty(str2) && (encode = Uri.encode(str2)) != null) {
            sb.append(C2261Q.f9808n);
            sb.append(str);
            sb.append("=");
            sb.append(encode);
        }
    }

    /* renamed from: a */
    public static int m10050a() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* renamed from: j */
    public static String m10076j(Context context) {
        return C2377y.m10894a(context).mo8067a();
    }

    /* renamed from: k */
    public static String m10077k(Context context) {
        return C2377y.m10894a(context).mo8070d();
    }

    /* renamed from: l */
    public static String m10078l(Context context) {
        return C2377y.m10894a(context).mo8071e();
    }

    /* renamed from: b */
    public static String m10060b() {
        String str;
        String str2 = "";
        try {
            for (T inetAddresses : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator<T> it = Collections.list(inetAddresses.getInetAddresses()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = str2;
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        str = inetAddress.getHostAddress();
                        break;
                    }
                }
                str2 = str;
            }
        } catch (Exception e) {
        }
        return str2;
    }

    /* renamed from: m */
    public static String m10079m(Context context) {
        return C1974m.m9063a(context, (int) R.string.optpage_version_summary);
    }

    /* renamed from: a */
    public static void m10056a(Context context, String str, String str2) {
        CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    /* renamed from: a */
    public static String m10052a(Context context, int i) {
        String a;
        if (context == null) {
            return "";
        }
        if (m10058a(i)) {
            a = context.getString(R.string.ime_server_url_usa_http);
        } else {
            a = C1974m.m9063a(context, C1593bR.m7162a().mo6232a(9));
        }
        return C1132b.m5654a(context).mo4402a(C1135d.IME_SERVER, a);
    }

    /* renamed from: b */
    public static String m10062b(Context context, int i) {
        String a;
        if (context == null) {
            return "";
        }
        if (m10058a(i)) {
            a = context.getString(R.string.ime_server_url_usa_http);
        } else {
            a = C1974m.m9063a(context, C1593bR.m7162a().mo6232a(19));
        }
        return C1132b.m5654a(context).mo4402a(C1135d.COOTEK_SERVER_HTTP, a);
    }

    /* renamed from: c */
    public static String m10064c(Context context, int i) {
        String b = m10062b(context, i);
        if (!TextUtils.isEmpty(b)) {
            return "http://" + b;
        }
        return "";
    }

    /* renamed from: d */
    public static String m10066d(Context context, int i) {
        String b = m10062b(context, i);
        if (!TextUtils.isEmpty(b)) {
            return "https://" + b;
        }
        return "";
    }

    /* renamed from: e */
    public static String m10068e(Context context, int i) {
        String a = m10052a(context, i);
        if (!TextUtils.isEmpty(a)) {
            return "http://" + a;
        }
        return "";
    }

    /* renamed from: f */
    public static String m10070f(Context context, int i) {
        String a = m10052a(context, i);
        if (!TextUtils.isEmpty(a)) {
            return "https://" + a;
        }
        return "";
    }

    /* renamed from: g */
    public static String m10072g(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (m10058a(i)) {
            return C1974m.m9063a(context, (int) R.string.cloud_input_server_url_usa);
        }
        return C1974m.m9063a(context, (int) R.string.cloud_input_server_url);
    }

    /* renamed from: n */
    public static String m10080n(Context context) {
        if (context == null) {
            return "";
        }
        return C1132b.m5654a(context).mo4402a(C1135d.IME_DEFAULT_CDN_SERVER, context.getString(C1593bR.m7162a().mo6232a(22)));
    }

    /* renamed from: h */
    public static String m10074h(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (m10058a(i)) {
            return C1974m.m9063a(context, (int) R.string.ime_server_static_url_usa_http);
        }
        if (C1593bR.m7162a().f5075a) {
            return C1974m.m9063a(context, (int) R.string.ime_server_static_url_china_http);
        }
        return "";
    }

    /* renamed from: a */
    public static String m10054a(Context context, String str) {
        String host = Uri.parse(str).getHost();
        String h = m10074h(context, m10081o(context));
        if (!TextUtils.isEmpty(h)) {
            return str.replace(host, h);
        }
        return str;
    }

    /* renamed from: o */
    public static int m10081o(Context context) {
        int intSetting = Settings.getInstance().getIntSetting(360);
        if (intSetting == 0) {
            intSetting = m10084r(context);
        }
        if (intSetting == 0) {
            intSetting = m10085s(context);
        }
        if (intSetting == 0) {
            intSetting = 1;
        }
        return C1132b.m5654a(context).mo4397a(C1135d.SERVER_REGION, Integer.valueOf(intSetting)).intValue();
    }

    /* renamed from: r */
    private static int m10084r(Context context) {
        String f = m10069f(context);
        if (TextUtils.isEmpty(f)) {
            return 0;
        }
        if (f.startsWith(f9404o)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: s */
    private static int m10085s(Context context) {
        String a = m10051a(context);
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        if (f9405p.equalsIgnoreCase(a)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m10059a(String str) {
        return ExternalStorage.getDirectory(str) != null;
    }

    /* renamed from: p */
    public static void m10082p(Context context) {
        Toast.makeText(context, C1974m.m9063a(context, (int) R.string.sdcard_not_ready_message), 1).show();
    }

    /* renamed from: a */
    public static String m10053a(Context context, C2258O o) {
        int o2 = m10081o(context);
        String b = m10062b(context, o2);
        return "http://" + b + o.mo7826b(o2);
    }

    /* renamed from: a */
    public static boolean m10058a(int i) {
        if (i == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static String m10083q(Context context) {
        return C1460o.m6799b().mo6105d(context, f9407r);
    }
}
