package com.facebook.ads.internal.p069a;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.facebook.ads.internal.a.b */
public class C3348b {
    /* renamed from: a */
    public static C3347a m14737a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        String queryParameter = uri.getQueryParameter("video_url");
        if ("store".equals(authority)) {
            if (queryParameter != null) {
                return null;
            }
            return new C3349c(context, uri);
        } else if ("open_link".equals(authority)) {
            return new C3350d(context, uri);
        } else {
            return null;
        }
    }
}
