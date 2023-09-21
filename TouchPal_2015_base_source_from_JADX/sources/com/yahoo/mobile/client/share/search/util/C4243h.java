package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.content.Intent;
import android.support.p001v4.content.C0213m;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.util.h */
public final class C4243h {
    /* renamed from: a */
    public static synchronized void m17777a(Context context, String str, HashMap hashMap) {
        synchronized (C4243h.class) {
            Intent intent = new Intent("LocalBroadcast");
            intent.putExtra("properties", hashMap);
            m17776a(context, str, intent);
        }
    }

    /* renamed from: a */
    private static synchronized void m17776a(Context context, String str, Intent intent) {
        synchronized (C4243h.class) {
            intent.putExtra("view_content", str);
            C0213m.m882a(context).mo696a(intent);
        }
    }
}
