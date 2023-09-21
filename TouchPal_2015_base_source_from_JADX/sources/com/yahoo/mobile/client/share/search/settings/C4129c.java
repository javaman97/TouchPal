package com.yahoo.mobile.client.share.search.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.text.TextUtils;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.yahoo.mobile.client.p094a.p095a.C4073a;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;
import com.yahoo.mobile.client.share.search.interfaces.IFactory;
import com.yahoo.mobile.client.share.search.location.ISearchLocationManager;
import com.yahoo.mobile.client.share.search.util.C4238d;

/* renamed from: com.yahoo.mobile.client.share.search.settings.c */
public class C4129c {

    /* renamed from: A */
    private static boolean f16765A = true;

    /* renamed from: B */
    private static SearchStatusData f16766B;

    /* renamed from: a */
    private static boolean f16767a;

    /* renamed from: b */
    private static boolean f16768b;

    /* renamed from: c */
    private static boolean f16769c;

    /* renamed from: d */
    private static ISearchLocationManager f16770d;

    /* renamed from: e */
    private static String f16771e = "i";

    /* renamed from: f */
    private static String f16772f;

    /* renamed from: g */
    private static String f16773g;

    /* renamed from: h */
    private static String f16774h;

    /* renamed from: i */
    private static String f16775i;

    /* renamed from: j */
    private static boolean f16776j;

    /* renamed from: k */
    private static boolean f16777k;

    /* renamed from: l */
    private static IFactory f16778l;

    /* renamed from: m */
    private static int f16779m;

    /* renamed from: n */
    private static int f16780n;

    /* renamed from: o */
    private static String f16781o;

    /* renamed from: p */
    private static boolean f16782p;

    /* renamed from: q */
    private static boolean f16783q;

    /* renamed from: r */
    private static boolean f16784r;

    /* renamed from: s */
    private static boolean f16785s;

    /* renamed from: t */
    private static String f16786t;

    /* renamed from: u */
    private static String f16787u;

    /* renamed from: v */
    private static boolean f16788v;

    /* renamed from: w */
    private static String f16789w = null;

    /* renamed from: x */
    private static String f16790x;

    /* renamed from: y */
    private static boolean f16791y;

    /* renamed from: z */
    private static boolean f16792z;

    /* renamed from: com.yahoo.mobile.client.share.search.settings.c$a */
    public static final class C4130a {

        /* renamed from: a */
        private static String f16793a = "SearchSettings.Builder";
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f16794b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f16795c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public boolean f16796d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f16797e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ISearchLocationManager f16798f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f16799g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f16800h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f16801i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f16802j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f16803k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f16804l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public IFactory f16805m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f16806n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f16807o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f16808p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public boolean f16809q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public String f16810r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f16811s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public String f16812t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public boolean f16813u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public boolean f16814v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public String f16815w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public String f16816x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public String f16817y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public boolean f16818z;

        public C4130a(String str) {
            this.f16794b = false;
            this.f16795c = true;
            this.f16796d = true;
            this.f16797e = false;
            this.f16798f = null;
            this.f16799g = null;
            this.f16800h = null;
            this.f16801i = null;
            this.f16802j = true;
            this.f16803k = null;
            this.f16804l = true;
            this.f16805m = null;
            this.f16806n = 7;
            this.f16807o = 1;
            this.f16808p = true;
            this.f16809q = true;
            this.f16810r = null;
            this.f16811s = true;
            this.f16813u = false;
            this.f16814v = true;
            this.f16815w = null;
            this.f16816x = null;
            this.f16817y = null;
            this.f16818z = true;
            this.f16805m = m17460a();
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Appid can not be null or empty");
            }
            this.f16815w = str;
            this.f16812t = "e0.5.1";
        }

        /* renamed from: a */
        private static IFactory m17460a() {
            try {
                return (IFactory) C4129c.class.getClassLoader().loadClass("com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.Factory").newInstance();
            } catch (ClassNotFoundException e) {
                String str = f16793a;
                e.getMessage();
                throw new RuntimeException("Factory class was not found");
            } catch (IllegalAccessException e2) {
                String str2 = f16793a;
                e2.getMessage();
                throw new RuntimeException("Factory class was not accesible");
            } catch (InstantiationException e3) {
                String str3 = f16793a;
                e3.getMessage();
                throw new RuntimeException("Factory class could not be instantiated");
            }
        }

        /* renamed from: a */
        public final C4130a mo15409a(boolean z) {
            this.f16802j = z;
            return this;
        }

        /* renamed from: b */
        public final C4130a mo15411b(boolean z) {
            this.f16795c = z;
            return this;
        }

        /* renamed from: c */
        public final C4130a mo15412c(boolean z) {
            this.f16797e = z;
            return this;
        }

        /* renamed from: a */
        public final C4130a mo15408a(String str) {
            this.f16799g = str;
            return this;
        }

        /* renamed from: b */
        public final C4130a mo15410b(String str) {
            this.f16810r = str;
            return this;
        }

        /* renamed from: d */
        public final C4130a mo15413d(boolean z) {
            this.f16811s = z;
            return this;
        }

        /* renamed from: a */
        public final C4130a mo15407a(ISearchLocationManager iSearchLocationManager) {
            this.f16798f = iSearchLocationManager;
            return this;
        }

        /* renamed from: e */
        public final C4130a mo15414e(boolean z) {
            this.f16818z = z;
            return this;
        }

        /* renamed from: f */
        public final C4130a mo15415f(boolean z) {
            this.f16814v = z;
            return this;
        }
    }

    /* renamed from: a */
    public static void m17429a(C4130a aVar) {
        if (f16791y) {
            throw new IllegalStateException("initializeSearchSettings() has already been called.");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalThreadStateException("initializeSearchSettings() can only be called from main thread.");
        } else {
            f16790x = aVar.f16812t;
            f16791y = true;
            f16776j = aVar.f16802j;
            f16771e = aVar.f16799g;
            f16767a = aVar.f16794b;
            f16768b = aVar.f16795c;
            f16765A = aVar.f16796d;
            f16769c = aVar.f16797e;
            ISearchLocationManager h = aVar.f16798f;
            f16770d = h;
            C4128b.m17426a(h);
            f16773g = aVar.f16801i;
            f16772f = aVar.f16800h;
            f16775i = aVar.f16803k;
            f16777k = aVar.f16804l;
            f16779m = aVar.f16806n;
            f16780n = aVar.f16807o;
            f16781o = aVar.f16810r;
            f16782p = aVar.f16811s;
            if ((f16779m & f16780n) == 0) {
                throw new IllegalArgumentException("Initial tab is not one of the enabled tabs");
            }
            f16778l = aVar.f16805m;
            f16783q = aVar.f16808p;
            f16784r = aVar.f16809q;
            f16789w = aVar.f16815w;
            f16786t = aVar.f16816x;
            f16787u = aVar.f16817y;
            f16788v = aVar.f16814v;
            f16792z = aVar.f16818z;
            f16766B = null;
            f16774h = null;
            f16785s = aVar.f16813u;
        }
    }

    /* renamed from: a */
    public static String m17427a() {
        m17435b();
        return f16790x;
    }

    /* renamed from: b */
    public static void m17435b() {
        if (!f16791y) {
            throw new IllegalStateException("Search SDK not initialized. Please call SearchSettings.initializeSearchSettings() first.");
        }
    }

    /* renamed from: c */
    public static boolean m17437c() {
        return f16791y;
    }

    /* renamed from: d */
    public static boolean m17439d() {
        m17435b();
        return f16776j;
    }

    /* renamed from: e */
    public static boolean m17440e() {
        m17435b();
        return f16768b && f16767a && C4238d.m17761a().containsKey(C1712h.f5592n);
    }

    /* renamed from: f */
    public static boolean m17441f() {
        m17435b();
        return f16768b;
    }

    /* renamed from: a */
    public static boolean m17433a(Context context) {
        m17435b();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.checkPermission("android.permission.RECORD_AUDIO", context.getPackageName()) != 0 || !packageManager.hasSystemFeature("android.hardware.microphone") || !context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isVoiceSearchEnabled)) {
            return false;
        }
        return f16769c;
    }

    /* renamed from: g */
    public static boolean m17442g() {
        m17435b();
        return f16777k;
    }

    /* renamed from: h */
    public static boolean m17443h() {
        m17435b();
        return f16788v;
    }

    /* renamed from: i */
    public static IFactory m17444i() {
        m17435b();
        return f16778l;
    }

    /* renamed from: b */
    public static String m17434b(Context context) {
        m17435b();
        if (f16771e != null) {
            String str = f16771e;
            if (str != null && (str.equals("p") || str.equals("i") || str.equals("r")) && ((!str.equals("p") || context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isSafeSearchOffOptionAvailable)) && (!str.equals("i") || context.getResources().getBoolean(C4073a.C4077d.yssdk_locale_isSafeSearchModerateOptionAvailable)))) {
                return f16771e;
            }
        }
        return context.getResources().getString(C4073a.C4086m.yssdk_locale_defaultSafeSearchSetting);
    }

    /* renamed from: a */
    public static void m17430a(String str) {
        m17435b();
        if (str == null || str.equals("p") || str.equals("i") || str.equals("r")) {
            f16771e = str;
        }
    }

    /* renamed from: a */
    public static void m17432a(boolean z) {
        m17435b();
        f16768b = z;
    }

    /* renamed from: j */
    public static String m17445j() {
        m17435b();
        return f16781o;
    }

    /* renamed from: k */
    public static boolean m17446k() {
        m17435b();
        return f16782p;
    }

    /* renamed from: l */
    public static boolean m17447l() {
        m17435b();
        return f16783q;
    }

    /* renamed from: m */
    public static boolean m17448m() {
        m17435b();
        return f16765A;
    }

    /* renamed from: n */
    public static boolean m17449n() {
        m17435b();
        return f16784r;
    }

    /* renamed from: o */
    public static boolean m17450o() {
        m17435b();
        if (!f16768b || ServerSettings.m17417a().getTrendingSearchUrlTemplate() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static String m17451p() {
        m17435b();
        return f16789w;
    }

    /* renamed from: q */
    public static String m17452q() {
        m17435b();
        return f16787u;
    }

    /* renamed from: r */
    public static String m17453r() {
        m17435b();
        return f16786t;
    }

    /* renamed from: a */
    public static void m17431a(String str, String str2) {
        m17435b();
        f16786t = str;
        f16787u = str2;
    }

    /* renamed from: s */
    public static boolean m17454s() {
        m17435b();
        return f16792z;
    }

    /* renamed from: t */
    public static boolean m17455t() {
        m17435b();
        return ServerSettings.m17417a().getSearchStatusUrlTemplate() != null;
    }

    /* renamed from: u */
    public static SearchStatusData m17456u() {
        m17435b();
        return f16766B;
    }

    /* renamed from: a */
    public static void m17428a(SearchStatusData searchStatusData) {
        m17435b();
        f16766B = searchStatusData;
    }

    /* renamed from: v */
    public static String m17457v() {
        m17435b();
        return f16773g;
    }

    /* renamed from: c */
    public static String m17436c(Context context) {
        m17435b();
        if (context != null && f16774h == null) {
            f16774h = context.getPackageName();
        }
        return f16774h;
    }

    /* renamed from: d */
    public static String m17438d(Context context) {
        m17435b();
        if (f16772f == null) {
            try {
                f16772f = context.getPackageManager().getPackageInfo(m17436c(context), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                f16772f = "0.0.0";
            }
        }
        return f16772f;
    }

    /* renamed from: w */
    public static String m17458w() {
        m17435b();
        if (f16778l.getPartnerManager() != null) {
            String partnerTsrcKey = f16778l.getPartnerManager().getPartnerTsrcKey();
            if (!TextUtils.isEmpty(partnerTsrcKey)) {
                return partnerTsrcKey;
            }
        }
        return f16775i;
    }

    /* renamed from: x */
    public static boolean m17459x() {
        m17435b();
        return f16785s;
    }
}
