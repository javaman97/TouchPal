package com.yahoo.mobile.client.share.search.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.util.Map;

/* renamed from: com.yahoo.mobile.client.share.search.util.g */
public final class C4242g {

    /* renamed from: a */
    public static final String f17339a = null;

    /* renamed from: a */
    public static void m17773a(long j, String str, Map<String, Object> map) {
        map.put("spaceid", Long.valueOf(j));
        map.put("sdk_ver", C4129c.m17427a());
        if (C4238d.m17764a(C1712h.f5592n)) {
            map.put("sdk_user", C4238d.m17761a().get(C1712h.f5592n));
        }
        C4129c.m17444i().getInstrument().logEvent(str, j, true, map);
    }

    /* renamed from: a */
    public static long m17771a(String str) {
        if (str.equals("sch_web_screen")) {
            return 980778527;
        }
        if (str.equals("sch_imageviewer_screen")) {
            return 980778379;
        }
        if (str.equals("sch_images_screen")) {
            return 980778377;
        }
        if (str.equals("sch_video_screen")) {
            return 980778378;
        }
        if (str.equals("sch_search_screen")) {
            return 980778382;
        }
        if (str.equals("sch_settings_screen")) {
            return 980778485;
        }
        if (str.equals("sch_shr_search_screen")) {
            return 959513160;
        }
        if (str.equals("sch_shr_web_screen")) {
            return 959513156;
        }
        if (str.equals("sch_shr_image_screen")) {
            return 959513157;
        }
        if (str.equals("sch_shr_video_screen")) {
            return 959513158;
        }
        if (str.equals("sch_shr_imageviewer_screen")) {
            return 959513159;
        }
        if (str.equals("sch_brwint_web_screen")) {
            return 959513355;
        }
        if (str.equals("sch_brwint_images_screen")) {
            return 959513356;
        }
        if (str.equals("sch_brwint_video_screen")) {
            return 959513357;
        }
        return -1;
    }

    /* renamed from: a */
    public static void m17774a(Context context) {
        if (Build.VERSION.SDK_INT < 14) {
            C4129c.m17444i().getInstrument().activityOnResume(context);
        }
    }

    /* renamed from: b */
    public static void m17775b(Context context) {
        if (Build.VERSION.SDK_INT < 14) {
            C4129c.m17444i().getInstrument().activityOnPause(context);
        }
    }

    /* renamed from: a */
    public static String m17772a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.equalsIgnoreCase(context.getResources().getString(C4073a.C4086m.yssdk_web_search))) {
            return "sch_web_screen";
        }
        if (str.equalsIgnoreCase(context.getResources().getString(C4073a.C4086m.yssdk_image_search))) {
            return "sch_images_screen";
        }
        if (str.equalsIgnoreCase(context.getResources().getString(C4073a.C4086m.yssdk_video_search))) {
            return "sch_video_screen";
        }
        return "";
    }
}
