package com.iflytek.cloud.resource;

import android.text.TextUtils;
import java.util.Locale;

public class Resource {
    public static final int TAG_ERROR_CODE = 0;
    public static final int TAG_ERROR_UNKNOWN = 1;
    public static final int TEXT_AGAIN = 9;
    public static final int TEXT_CANCEL = 4;
    public static final int TEXT_DETAIL = 3;
    public static final int TEXT_HELP_LINK = 1;
    public static final int TEXT_HELP_RECO = 13;
    public static final int TEXT_HELP_SMS = 12;
    public static final int TEXT_KNOW = 2;
    public static final int TEXT_MORE = 7;
    public static final int TEXT_PLAYBACK = 10;
    public static final int TEXT_POWER_LINK = 0;
    public static final int TEXT_RETRIEVE = 11;
    public static final int TEXT_RETRY = 8;
    public static final int TEXT_SET = 6;
    public static final int TEXT_STOP = 5;
    public static final int TITLE_AUDIO_PLAYING = 6;
    public static final int TITLE_AUDIO_REQUEST = 4;
    public static final int TITLE_CONNECTING = 1;
    public static final int TITLE_DATA_UPLOAD = 7;
    public static final int TITLE_ERROR = 5;
    public static final int TITLE_HELP = 0;
    public static final int TITLE_RECOGNIZE_WAITING = 3;
    public static final int TITLE_RECORDING = 2;

    /* renamed from: a */
    private static Locale f16392a = Locale.CHINA;

    private Resource() {
    }

    /* renamed from: a */
    private static boolean m17106a(String str) {
        return TextUtils.isEmpty(str) || Locale.CHINA.toString().equalsIgnoreCase(str) || Locale.CHINESE.toString().equalsIgnoreCase(str);
    }

    public static String getErrorDescription(int i) {
        String[] strArr = C4015a.f16395c;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16399c;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16403c;
        }
        return (i <= 0 || i >= strArr.length) ? getErrorTag(1) : strArr[i];
    }

    public static String getErrorTag(int i) {
        String[] strArr = C4015a.f16396d;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16400d;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16404d;
        }
        return (i < 0 || i >= strArr.length) ? "" : strArr[i];
    }

    public static String getLanguage() {
        return f16392a.toString();
    }

    public static String getText(int i) {
        String[] strArr = C4015a.f16393a;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16397a;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16401a;
        }
        return (i < 0 || i >= strArr.length) ? "" : strArr[i];
    }

    public static String getTitle(int i) {
        String[] strArr = C4015a.f16394b;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16398b;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16402b;
        }
        return (i < 0 || i >= strArr.length) ? "" : strArr[i];
    }

    public static boolean matchLanguage(String str) {
        String str2 = "";
        if (str != null) {
            str2 = str.trim();
        }
        if (f16392a.toString().equalsIgnoreCase(str2)) {
            return true;
        }
        return m17106a(str2) && m17106a(f16392a.toString());
    }

    public static void setErrorDescription(int i, String str) {
        String[] strArr = C4015a.f16395c;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16399c;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16403c;
        }
        if (i > 0 && i < strArr.length) {
            strArr[i] = str;
        }
    }

    public static void setText(int i, String str) {
        String[] strArr = C4015a.f16393a;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16397a;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16401a;
        }
        if (i >= 0 && i < strArr.length) {
            strArr[i] = str;
        }
    }

    public static void setTitle(int i, String str) {
        String[] strArr = C4015a.f16394b;
        if (f16392a.equals(Locale.US)) {
            strArr = C4016b.f16398b;
        } else if (f16392a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = C4017c.f16402b;
        }
        if (i >= 0 && i < strArr.length) {
            strArr[i] = str;
        }
    }

    public static void setUILanguage(Locale locale) {
        if (locale != null) {
            if (locale.equals(Locale.US) || locale.equals(Locale.CHINA) || locale.equals(Locale.TRADITIONAL_CHINESE)) {
                f16392a = locale;
            }
        }
    }
}
