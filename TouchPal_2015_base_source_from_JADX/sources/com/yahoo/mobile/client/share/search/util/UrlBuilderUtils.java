package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import com.yahoo.mobile.client.share.search.settings.C4127a;
import com.yahoo.mobile.client.share.search.settings.ServerSettings;

public final class UrlBuilderUtils {

    /* renamed from: a */
    private static Crumb f17317a;

    public static class Crumb {

        /* renamed from: a */
        public String f17318a;

        /* renamed from: b */
        public String f17319b;
    }

    /* renamed from: a */
    public static String m17740a(Context context) {
        String historyUrlTemplate = ServerSettings.m17417a().getHistoryUrlTemplate();
        String a = C4127a.m17418a(context);
        if (a.equals("")) {
            a = "en-US";
        }
        return String.format(historyUrlTemplate, new Object[]{a});
    }

    /* renamed from: a */
    public static Crumb m17739a() {
        return f17317a;
    }

    /* renamed from: a */
    public static void m17741a(Crumb crumb) {
        f17317a = crumb;
    }
}
