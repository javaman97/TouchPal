package com.yahoo.mobile.client.share.search.settings;

import com.yahoo.mobile.client.share.search.location.ISearchLocationManager;

/* renamed from: com.yahoo.mobile.client.share.search.settings.b */
public final class C4128b {

    /* renamed from: a */
    private static volatile ISearchLocationManager f16764a = null;

    /* renamed from: a */
    public static void m17426a(ISearchLocationManager iSearchLocationManager) {
        f16764a = iSearchLocationManager;
    }

    /* renamed from: a */
    public static ISearchLocationManager m17425a() {
        return f16764a;
    }
}
