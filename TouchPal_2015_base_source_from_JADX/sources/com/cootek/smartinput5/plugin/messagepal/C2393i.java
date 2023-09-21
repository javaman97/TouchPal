package com.cootek.smartinput5.plugin.messagepal;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: com.cootek.smartinput5.plugin.messagepal.i */
/* compiled from: Utils */
public class C2393i {

    /* renamed from: a */
    private static final String[][] f10487a = {new String[]{"106575000410119236", "46000,46002,46007,46020"}, new String[]{"10655059313119236", "46001,46006"}, new String[]{"10659057180033119236", "46003,46005,46099"}};

    /* renamed from: a */
    public static String m10939a(Context context) {
        String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        Log.d("test", "####subscriberId: " + subscriberId);
        if (TextUtils.isEmpty(subscriberId)) {
            return null;
        }
        for (int i = 0; i < f10487a.length; i++) {
            String str = f10487a[i][0];
            String[] split = f10487a[i][1].split(",");
            for (String startsWith : split) {
                if (subscriberId.startsWith(startsWith)) {
                    return str;
                }
            }
        }
        return null;
    }
}
