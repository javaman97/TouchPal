package com.yahoo.mobile.client.share.search.util;

import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import javax.crypto.Mac;

/* renamed from: com.yahoo.mobile.client.share.search.util.k */
public final class C4246k {

    /* renamed from: a */
    private static Mac f17343a;

    /* renamed from: b */
    private static final char[] f17344b = "0123456789abcdef".toCharArray();

    static {
        try {
            f17343a = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
        }
    }

    /* renamed from: a */
    public static Pattern m17790a(String str) {
        return Pattern.compile("\\b" + Pattern.quote(str), 2);
    }

    /* renamed from: b */
    public static Pattern m17791b(String str) {
        return Pattern.compile("\\b" + Pattern.quote(str) + "\\b", 2);
    }
}
