package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.m */
public class C3788m {

    /* renamed from: bV */
    private static final Uri f15887bV = Uri.parse("http://plus.google.com/");

    /* renamed from: bW */
    private static final Uri f15888bW = f15887bV.buildUpon().appendPath("circles").appendPath("find").build();

    /* renamed from: i */
    public static Intent m16626i(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: j */
    private static Uri m16627j(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }

    /* renamed from: k */
    public static Intent m16628k(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(m16627j(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: l */
    public static Intent m16629l(String str) {
        Uri parse = Uri.parse("bazaar://search?q=pname:" + str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.setFlags(524288);
        return intent;
    }
}
