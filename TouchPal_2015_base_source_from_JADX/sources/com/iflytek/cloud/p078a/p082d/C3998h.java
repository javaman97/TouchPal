package com.iflytek.cloud.p078a.p082d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.cootek.smartinput5.func.nativeads.C1899v;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.p078a.p082d.p083a.C3990a;
import com.iflytek.speech.VoiceWakeuperAidl;

/* renamed from: com.iflytek.cloud.a.d.h */
public class C3998h {
    /* renamed from: a */
    public static String m17050a(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "none";
        }
        try {
            if (networkInfo.getType() == 1) {
                return C1899v.f6395s;
            }
            String lowerCase = networkInfo.getExtraInfo().toLowerCase();
            return TextUtils.isEmpty(lowerCase) ? "none" : (lowerCase.startsWith("3gwap") || lowerCase.startsWith("uniwap")) ? "uniwap" : lowerCase.startsWith("cmwap") ? "cmwap" : lowerCase.startsWith("ctwap") ? "ctwap" : lowerCase.startsWith("ctnet") ? "ctnet" : lowerCase;
        } catch (Exception e) {
            C3990a.m17030a(e.toString());
            return "none";
        }
    }

    /* renamed from: a */
    public static void m17051a(Context context) throws SpeechError {
        if (context != null) {
            NetworkInfo[] allNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getAllNetworkInfo();
            if (allNetworkInfo != null && allNetworkInfo.length > 0) {
                int length = allNetworkInfo.length;
                int i = 0;
                while (i < length) {
                    NetworkInfo networkInfo = allNetworkInfo[i];
                    if (networkInfo != null && !networkInfo.isConnectedOrConnecting()) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            throw new SpeechError(20001);
        }
    }

    /* renamed from: b */
    public static String m17052b(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return "none";
        }
        try {
            if (networkInfo.getType() == 1) {
                return "none";
            }
            return ("" + networkInfo.getSubtypeName()) + VoiceWakeuperAidl.PARAMS_SEPARATE + networkInfo.getSubtype();
        } catch (Exception e) {
            C3990a.m17030a(e.toString());
            return "none";
        }
    }
}
