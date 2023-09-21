package com.facebook.ads.internal.p077h;

import java.util.Set;

/* renamed from: com.facebook.ads.internal.h.w */
public class C3457w {
    /* renamed from: a */
    public static String m15105a(Set<String> set, String str) {
        StringBuilder sb = new StringBuilder();
        for (String append : set) {
            sb.append(append);
            sb.append(str);
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
}
