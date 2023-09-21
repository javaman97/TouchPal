package com.cootek.smartinput5.func.share;

import android.content.Context;
import android.content.pm.PackageManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.func.share.e */
/* compiled from: ShareList */
public class C1983e {

    /* renamed from: a */
    public static final int f6770a = 2;

    /* renamed from: b */
    public static final int f6771b = 0;

    /* renamed from: c */
    public static final int f6772c = 1;

    /* renamed from: d */
    public static final int f6773d = 2;

    /* renamed from: e */
    public static final int f6774e = 3;

    /* renamed from: f */
    public static final int f6775f = 4;

    /* renamed from: g */
    public static final int f6776g = 5;

    /* renamed from: h */
    public static final int f6777h = 6;

    /* renamed from: i */
    static C1135d[] f6778i = {C1135d.SHARE_WITH_FACEBOOK, C1135d.SHARE_WITH_TWITTER, C1135d.SHARE_WITH_GOOGLE_PLUS, C1135d.SHARE_WITH_WEIXIN, C1135d.SHARE_WITH_WHATSAPP, C1135d.SHARE_WITH_LINE, C1135d.SHARE_WITH_WEIBO};

    /* renamed from: j */
    private static final int f6779j = 5;

    /* renamed from: k */
    private static final int f6780k = 7;

    /* renamed from: l */
    private static final String[] f6781l = {"com.facebook.katana", "com.twitter.android", "com.google.android.apps.plus", "com.tencent.mm", "com.whatsapp", "jp.naver.line.android", "com.sina.weibo"};

    /* renamed from: m */
    private static final int[] f6782m = {R.drawable.share_icon_facebook, R.drawable.share_icon_twitter, R.drawable.share_icon_google_plus, R.drawable.share_icon_wechat, R.drawable.share_icon_whatsapp, R.drawable.share_icon_line, R.drawable.share_icon_weibo};

    /* renamed from: n */
    private static final int[] f6783n = {R.string.share_label_facebook, R.string.share_label_twitter, R.string.share_label_google_plus};

    /* renamed from: o */
    private static ArrayList<C1984f> f6784o = new ArrayList<>();

    /* renamed from: a */
    public static ArrayList<C1984f> m9119a(Context context) {
        f6784o.clear();
        PackageManager packageManager = context.getPackageManager();
        C1602bh n = C1368X.m6320c().mo5841n();
        int i = 0;
        for (int i2 = 0; i2 < f6781l.length; i2++) {
            if (i2 >= 7 || m9120a(context, i2)) {
                C1984f a = m9118a(packageManager, i2);
                if (a != null) {
                    f6784o.add(a);
                    i++;
                } else if (i2 < 2) {
                    C1984f fVar = new C1984f(n.mo6249a(f6782m[i2]), C1974m.m9063a(context, f6783n[i2]), (String) null, f6781l[i2]);
                    fVar.mo7270a(true);
                    f6784o.add(fVar);
                    i++;
                }
                if (i == 5) {
                    return f6784o;
                }
            }
        }
        return f6784o;
    }

    /* renamed from: a */
    public static boolean m9120a(Context context, int i) {
        return C1132b.m5654a(context).mo4392a(f6778i[i], (Boolean) true).booleanValue();
    }

    /* renamed from: a */
    private static C1984f m9118a(PackageManager packageManager, int i) {
        C1602bh n = C1368X.m6320c().mo5841n();
        String str = f6781l[i];
        if (str == null || "".equals(str)) {
            return null;
        }
        try {
            return new C1984f(n.mo6249a(f6782m[i]), packageManager.getApplicationInfo(str, 8192).loadLabel(packageManager).toString(), str, f6781l[i]);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }
}
