package com.iflytek.cloud.util.p088a;

import com.cootek.smartinput5.func.C1351J;

/* renamed from: com.iflytek.cloud.util.a.e */
public class C4029e {

    /* renamed from: a */
    public static final String[] f16455a = {"134", "135", "136", "137", "138", "139", "147", "150", "151", "152", "157", "158", "159", "182", "187", "188"};

    /* renamed from: b */
    public static final String[] f16456b = {"130", "131", "132", "155", "156", "185", "186"};

    /* renamed from: c */
    public static final String[] f16457c = {"133", "153", "180", "189"};

    /* renamed from: a */
    public static String m17154a(String str) {
        if (str == null) {
            return str;
        }
        String replaceAll = str.replaceAll(" ", "").replaceAll(C1351J.f4161f, "");
        StringBuilder sb = new StringBuilder(replaceAll);
        return sb.length() > 5 ? (sb.substring(0, 3).equals("+86") || sb.substring(0, 3).equals("086")) ? sb.substring(3, sb.length()) : sb.substring(0, 2).equals("86") ? sb.substring(2, sb.length()) : (sb.substring(0, 5).equals("12530") || sb.substring(0, 5).equals("12520") || sb.substring(0, 5).equals("17951") || sb.substring(0, 5).equals("17911") || sb.subSequence(0, 5).equals("12593")) ? sb.substring(5, sb.length()) : replaceAll : replaceAll;
    }

    /* renamed from: a */
    public static String m17155a(String[] strArr, char c) {
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (String str : strArr) {
                if (str != null) {
                    sb.append(str);
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
