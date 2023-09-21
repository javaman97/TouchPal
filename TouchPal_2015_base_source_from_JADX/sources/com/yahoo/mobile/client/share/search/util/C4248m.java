package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.os.Build;

/* renamed from: com.yahoo.mobile.client.share.search.util.m */
public class C4248m {

    /* renamed from: a */
    public static final String f17346a = C4248m.class.getSimpleName();

    /* renamed from: b */
    public static final boolean f17347b = (Build.VERSION.SDK_INT >= 9);

    /* renamed from: c */
    public static final boolean f17348c;

    /* renamed from: d */
    public static final boolean f17349d;

    /* renamed from: e */
    public static final boolean f17350e;

    /* renamed from: f */
    public static final boolean f17351f;

    /* renamed from: g */
    public static final boolean f17352g;

    /* renamed from: h */
    public static final boolean f17353h;

    /* renamed from: i */
    public static final boolean f17354i;

    /* renamed from: j */
    public static final boolean f17355j;

    /* renamed from: k */
    public static final boolean f17356k;

    /* renamed from: l */
    public static final boolean f17357l;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT >= 10) {
            z = true;
        } else {
            z = false;
        }
        f17348c = z;
        if (Build.VERSION.SDK_INT >= 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        f17349d = z2;
        if (Build.VERSION.SDK_INT >= 11) {
            z3 = true;
        } else {
            z3 = false;
        }
        f17350e = z3;
        if (Build.VERSION.SDK_INT >= 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        f17351f = z4;
        if (Build.VERSION.SDK_INT >= 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        f17352g = z5;
        if (Build.VERSION.SDK_INT >= 14) {
            z6 = true;
        } else {
            z6 = false;
        }
        f17353h = z6;
        if (Build.VERSION.SDK_INT >= 15) {
            z7 = true;
        } else {
            z7 = false;
        }
        f17354i = z7;
        if (Build.VERSION.SDK_INT >= 16) {
            z8 = true;
        } else {
            z8 = false;
        }
        f17355j = z8;
        if (Build.VERSION.SDK_INT >= 17) {
            z9 = true;
        } else {
            z9 = false;
        }
        f17356k = z9;
        if (Build.VERSION.SDK_INT < 19) {
            z10 = false;
        }
        f17357l = z10;
    }

    /* renamed from: a */
    public static int m17794a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
