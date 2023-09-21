package com.iflytek.cloud.p084b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.cootek.nativejsapis.JavascriptHandler;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.Setting;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.Version;
import com.iflytek.cloud.p078a.p080b.C3976a;
import com.iflytek.cloud.p078a.p082d.C3989a;
import com.iflytek.cloud.p078a.p082d.C3992b;
import com.iflytek.cloud.p078a.p082d.C3995e;
import com.iflytek.cloud.p078a.p082d.C3998h;

/* renamed from: com.iflytek.cloud.b.c */
public class C4002c {

    /* renamed from: a */
    private static String f16352a = "xiaoyan";

    /* renamed from: a */
    public static String m17070a(Context context) {
        if (context == null) {
            return "null";
        }
        C4000a a = C3989a.m17026a(context);
        String str = a.mo14719d("os.imsi") + "|" + a.mo14719d("os.imei");
        if (str.length() < 10) {
            str = a.mo14719d("net.mac");
        }
        if (TextUtils.isEmpty(str) || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m17071a(Context context, C3976a aVar) throws SpeechError {
        if (context == null) {
            throw new SpeechError((int) ErrorCode.ERROR_INVALID_PARAM);
        }
        C4000a b = aVar.mo14674t().clone();
        m17073a(context, b);
        b.mo14710a(SpeechConstant.NET_TIMEOUT, "20000", false);
        b.mo14710a("auth", "1", false);
        b.mo14709a("msc.ver", Version.getVersion());
        C4000a a = C3989a.m17026a(context);
        b.mo14710a("mac", a.mo14719d("net.mac"), false);
        b.mo14710a("dvc", m17070a(context), false);
        b.mo14710a("msc.lat", "" + C3992b.m17035a(context).mo14701a("msc.lat"), false);
        b.mo14710a("msc.lng", "" + C3992b.m17035a(context).mo14701a("msc.lng"), false);
        b.mo14707a(a, "app.name");
        b.mo14707a(a, "app.path");
        b.mo14707a(a, "app.pkg");
        b.mo14707a(a, "app.ver.name");
        b.mo14707a(a, "app.ver.code");
        b.mo14707a(a, "os.system");
        b.mo14707a(a, "os.resolution");
        b.mo14707a(a, "os.density");
        b.mo14707a(a, "net.mac");
        b.mo14707a(a, "os.imei");
        b.mo14707a(a, "os.imsi");
        b.mo14707a(a, "os.version");
        b.mo14707a(a, "os.release");
        b.mo14707a(a, "os.incremental");
        b.mo14707a(a, "os.android_id");
        b.mo14707a(a, C3989a.f16325a[0][0]);
        b.mo14707a(a, C3989a.f16325a[1][0]);
        b.mo14707a(a, C3989a.f16325a[2][0]);
        b.mo14707a(a, C3989a.f16325a[3][0]);
        m17074a(b);
        b.mo14711a(C4001b.f16351a);
        return b.toString();
    }

    /* renamed from: a */
    public static String m17072a(Context context, String str, C3976a aVar) {
        C4000a b = aVar.mo14674t().clone();
        b.mo14716c(SpeechConstant.CLOUD_GRAMMAR);
        m17073a(context, b);
        b.mo14710a("language", "zh_cn", false);
        b.mo14710a(SpeechConstant.RESULT_TYPE, "json", false);
        b.mo14710a("rse", aVar.mo14670p(), false);
        b.mo14710a(SpeechConstant.TEXT_ENCODING, aVar.mo14669o(), false);
        b.mo14710a("ssm", "1", false);
        if (TextUtils.isEmpty(str)) {
            b.mo14710a(SpeechConstant.SUBJECT, "iat", false);
        } else {
            b.mo14710a(SpeechConstant.SUBJECT, SpeechConstant.ENG_ASR, false);
        }
        int q = aVar.mo14671q();
        b.mo14710a("auf=audio/L16;rate", Integer.toString(q), false);
        if (q == 16000) {
            b.mo14710a("aue", "speex-wb", false);
        } else {
            b.mo14710a("aue", "speex", false);
        }
        if (aVar.mo14653i()) {
            b.mo14710a(SpeechConstant.VAD_BOS, "5000", false);
            b.mo14710a(SpeechConstant.VAD_EOS, "1800", false);
        } else {
            b.mo14710a(SpeechConstant.VAD_BOS, "4000", false);
            b.mo14710a(SpeechConstant.VAD_EOS, "700", false);
        }
        b.mo14711a(C4001b.f16351a);
        return b.toString();
    }

    /* renamed from: a */
    public static void m17073a(Context context, C4000a aVar) {
        if (context == null) {
            aVar.mo14710a(SpeechConstant.WAP_PROXY, "none", false);
            return;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            aVar.mo14710a(SpeechConstant.WAP_PROXY, "none", false);
            return;
        }
        aVar.mo14710a(SpeechConstant.WAP_PROXY, C3998h.m17050a(activeNetworkInfo), false);
        aVar.mo14710a("net_subtype", C4000a.m17053e(C3998h.m17052b(activeNetworkInfo)), false);
    }

    /* renamed from: a */
    private static void m17074a(C4000a aVar) {
        if (aVar != null && Setting.f16235c != Setting.LOG_LEVEL.none) {
            String str = Setting.f16236d;
            if (TextUtils.isEmpty(str)) {
                str = "/sdcard/msc/msc.log";
            }
            int i = -1;
            if (Setting.f16235c == Setting.LOG_LEVEL.detail) {
                i = 31;
            } else if (Setting.f16235c == Setting.LOG_LEVEL.normal) {
                i = 15;
            } else if (Setting.f16235c == Setting.LOG_LEVEL.low) {
                i = 7;
            }
            C3995e.m17044a(str);
            aVar.mo14709a("log", str);
            aVar.mo14709a("lvl", "" + i);
            aVar.mo14710a("output", "1", false);
        }
    }

    /* renamed from: a */
    public static boolean m17075a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(JavascriptHandler.MESSAGE_TYPE_SMS) || str.contains("iat");
    }

    /* renamed from: b */
    public static String m17076b(Context context, C3976a aVar) {
        C4000a b = aVar.mo14674t().clone();
        m17073a(context, b);
        b.mo14710a("ssm", "1", false);
        b.mo14710a(SpeechConstant.RESULT_TYPE, "json", false);
        b.mo14710a("rse", aVar.mo14670p(), false);
        b.mo14710a(SpeechConstant.TEXT_ENCODING, aVar.mo14669o(), false);
        b.mo14711a(C4001b.f16351a);
        return b.toString();
    }
}
