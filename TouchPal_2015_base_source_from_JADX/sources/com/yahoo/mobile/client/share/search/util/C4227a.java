package com.yahoo.mobile.client.share.search.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.PhotoData;
import com.yahoo.mobile.client.share.search.settings.C4129c;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.yahoo.mobile.client.share.search.util.a */
public final class C4227a {
    /* renamed from: a */
    public static void m17749a(Activity activity, String str, String str2, String str3) {
        if (!C4245j.m17787b((Context) activity)) {
            C4228b.m17752a((Context) activity);
            return;
        }
        Intent intent = (activity == null || TextUtils.isEmpty(str)) ? null : C4129c.m17444i().getBrowser().getIntent(activity, str, str2);
        if (intent != null) {
            activity.startActivity(intent);
            if (str3 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("sch_url", str);
                hashMap.put("sch_cmpt", "browser");
                C4242g.m17773a(C4242g.m17771a(str3), "sch_open_component", hashMap);
            }
        }
    }

    /* renamed from: a */
    public static void m17748a(Activity activity) {
        activity.overridePendingTransition(C4073a.C4074a.yssdk_slide_in_from_right, C4073a.C4074a.yssdk_zoom_out);
    }

    /* renamed from: a */
    public static void m17750a(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* renamed from: a */
    public static Intent m17746a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return C4129c.m17444i().getWebPreviewer().getIntent(context, str, str2);
    }

    /* renamed from: a */
    public static Intent m17747a(Context context, String str, ArrayList<PhotoData> arrayList, int i, boolean z) {
        if (context == null) {
            return null;
        }
        return C4129c.m17444i().getImagePreviewer().getIntent(context, str, arrayList, i, z);
    }
}
