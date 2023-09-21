package com.google.android.gms.internal;

import android.text.TextUtils;
import com.cootek.smartinput5.engine.Settings;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.aq */
public final class C3606aq {

    /* renamed from: cN */
    private static final Pattern f15475cN = Pattern.compile("\\\\.");

    /* renamed from: cO */
    private static final Pattern f15476cO = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    /* renamed from: r */
    public static String m15695r(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f15476cO.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            switch (matcher.group().charAt(0)) {
                case 8:
                    matcher.appendReplacement(stringBuffer, "\\\\b");
                    break;
                case 9:
                    matcher.appendReplacement(stringBuffer, "\\\\t");
                    break;
                case 10:
                    matcher.appendReplacement(stringBuffer, "\\\\n");
                    break;
                case 12:
                    matcher.appendReplacement(stringBuffer, "\\\\f");
                    break;
                case 13:
                    matcher.appendReplacement(stringBuffer, "\\\\r");
                    break;
                case Settings.STATISTIC_ENABLED:
                    matcher.appendReplacement(stringBuffer, "\\\\\\\"");
                    break;
                case Settings.AUTO_SAVE_USERWORD:
                    matcher.appendReplacement(stringBuffer, "\\\\/");
                    break;
                case Settings.PRODUCT_ACTIVATION_CODE:
                    matcher.appendReplacement(stringBuffer, "\\\\\\\\");
                    break;
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
