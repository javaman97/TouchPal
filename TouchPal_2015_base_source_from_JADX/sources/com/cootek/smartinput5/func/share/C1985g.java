package com.cootek.smartinput5.func.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.func.share.g */
/* compiled from: ShareUtils */
public class C1985g {
    /* renamed from: a */
    public static void m9132a(Context context, String str, String str2) {
        m9134a(context, (String) null, str, str2, (Uri) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m9133a(Context context, String str, String str2, Uri uri) {
        m9134a(context, (String) null, str, str2, uri, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m9131a(Context context, String str, Uri uri) {
        m9134a(context, (String) null, (String) null, str, uri, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m9130a(Context context, String str) {
        m9134a(context, (String) null, (String) null, str, (Uri) null, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m9134a(Context context, String str, String str2, String str3, Uri uri, String str4, String str5) {
        Intent intent = new Intent();
        intent.setFlags(Engine.EXCEPTION_ERROR);
        intent.putExtra(ShareDialogActivity.f6743a, str);
        intent.putExtra(ShareDialogActivity.f6744b, str2);
        intent.putExtra(ShareDialogActivity.f6745c, str3);
        intent.putExtra(ShareDialogActivity.f6746d, uri);
        intent.putExtra(ShareDialogActivity.f6747e, str4);
        intent.putExtra(ShareDialogActivity.f6748f, str5);
        intent.setClass(context, ShareDialogActivity.class);
        context.startActivity(intent);
    }

    /* renamed from: a */
    protected static void m9129a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e) {
        }
    }
}
