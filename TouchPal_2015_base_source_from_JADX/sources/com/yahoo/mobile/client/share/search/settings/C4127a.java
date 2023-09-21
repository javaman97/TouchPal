package com.yahoo.mobile.client.share.search.settings;

import android.content.Context;
import com.yahoo.mobile.client.p094a.p095a.C4073a;

/* renamed from: com.yahoo.mobile.client.share.search.settings.a */
public final class C4127a {
    /* renamed from: a */
    public static String m17418a(Context context) {
        return context.getResources().getString(C4073a.C4086m.yssdk_locale_searchHostURL);
    }

    /* renamed from: b */
    public static boolean m17420b(Context context) {
        return context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isVideoSearchEnabled);
    }

    /* renamed from: c */
    public static boolean m17421c(Context context) {
        return context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isImageSearchEnabled);
    }

    /* renamed from: d */
    public static boolean m17422d(Context context) {
        return context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isImageGalleryEnabled);
    }

    /* renamed from: e */
    public static boolean m17423e(Context context) {
        return context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isWebSearchPoweredByGoogle);
    }

    /* renamed from: f */
    public static boolean m17424f(Context context) {
        return context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isImageSearchPoweredByFlickr);
    }

    /* renamed from: a */
    public static boolean m17419a(Context context, int i) {
        switch (i) {
            case 1:
                if (m17423e(context)) {
                    return false;
                }
                return true;
            case 2:
                if (!m17421c(context) || m17424f(context)) {
                    return false;
                }
                return true;
            case 4:
                return m17420b(context);
            default:
                return true;
        }
    }
}
