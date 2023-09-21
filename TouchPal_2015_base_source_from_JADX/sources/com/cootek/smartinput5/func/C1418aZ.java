package com.cootek.smartinput5.func;

import android.content.Context;
import com.cootek.smartinput5.func.asset.C1451h;

/* renamed from: com.cootek.smartinput5.func.aZ */
/* compiled from: ReferrerHandler */
public enum C1418aZ {
    SKIN,
    RESOURCE_EXTRACT,
    DEFAULT;
    

    /* renamed from: d */
    private static final String f4543d = "ReferrerHandler";

    /* renamed from: e */
    private static final String f4544e = "http://www.just-anchor.com?";

    /* renamed from: f */
    private static final String f4545f = "tpp";

    /* renamed from: g */
    private static final String f4546g = "&p_exists=y";

    /* renamed from: h */
    private static final String f4547h = "&p_exists=n";

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6052a(Context context, String str);

    /* renamed from: b */
    public void mo6053b(Context context, String str) {
        try {
            if (!C1368X.m6324d()) {
                C1368X.m6291a(context, false);
            }
            mo6052a(context, str);
        } catch (C1451h e) {
        }
    }

    /* renamed from: c */
    public static void m6658c(Context context, String str) {
        for (C1418aZ b : values()) {
            b.mo6053b(context, str);
        }
    }
}
