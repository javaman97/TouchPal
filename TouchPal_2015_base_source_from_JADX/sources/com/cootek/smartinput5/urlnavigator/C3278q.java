package com.cootek.smartinput5.urlnavigator;

import android.content.Context;
import com.cootek.smartinput5.func.C1466av;
import com.cootek.smartinput5.func.asset.C1460o;

/* renamed from: com.cootek.smartinput5.urlnavigator.q */
/* compiled from: RecommendedUtil */
public class C3278q {

    /* renamed from: a */
    public static final String f14400a = "urlnavigator.html";

    /* renamed from: a */
    public static String m14543a(Context context) {
        return "file://" + m14544b(context);
    }

    /* renamed from: b */
    public static String m14544b(Context context) {
        return C1466av.m6849a(context, f14400a).getPath();
    }

    /* renamed from: c */
    public static String m14545c(Context context) {
        return C1460o.m6799b().mo6105d(context, f14400a);
    }
}
