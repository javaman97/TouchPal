package android.support.p001v4.p002a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;

/* renamed from: android.support.v4.a.a */
/* compiled from: AccessibilityServiceInfoCompat */
public class C0025a {

    /* renamed from: a */
    public static final int f0a = 1;

    /* renamed from: b */
    public static final int f1b = 2;

    /* renamed from: c */
    public static final int f2c = 4;

    /* renamed from: d */
    public static final int f3d = 8;

    /* renamed from: e */
    public static final int f4e = 32;

    /* renamed from: f */
    public static final int f5f = -1;

    /* renamed from: g */
    public static final int f6g = 1;

    /* renamed from: h */
    public static final int f7h = 2;

    /* renamed from: i */
    public static final int f8i = 4;

    /* renamed from: j */
    public static final int f9j = 8;

    /* renamed from: k */
    public static final int f10k = 16;

    /* renamed from: l */
    public static final int f11l = 32;

    /* renamed from: m */
    private static final C0029d f12m;

    /* renamed from: android.support.v4.a.a$d */
    /* compiled from: AccessibilityServiceInfoCompat */
    interface C0029d {
        /* renamed from: a */
        boolean mo4a(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: b */
        String mo5b(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: c */
        String mo6c(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: d */
        ResolveInfo mo7d(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: e */
        String mo8e(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: f */
        int mo9f(AccessibilityServiceInfo accessibilityServiceInfo);
    }

    /* renamed from: android.support.v4.a.a$c */
    /* compiled from: AccessibilityServiceInfoCompat */
    static class C0028c implements C0029d {
        C0028c() {
        }

        /* renamed from: a */
        public boolean mo4a(AccessibilityServiceInfo accessibilityServiceInfo) {
            return false;
        }

        /* renamed from: b */
        public String mo5b(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: c */
        public String mo6c(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: d */
        public ResolveInfo mo7d(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: e */
        public String mo8e(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: f */
        public int mo9f(AccessibilityServiceInfo accessibilityServiceInfo) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.a.a$a */
    /* compiled from: AccessibilityServiceInfoCompat */
    static class C0026a extends C0028c {
        C0026a() {
        }

        /* renamed from: a */
        public boolean mo4a(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0030b.m31a(accessibilityServiceInfo);
        }

        /* renamed from: b */
        public String mo5b(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0030b.m32b(accessibilityServiceInfo);
        }

        /* renamed from: c */
        public String mo6c(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0030b.m33c(accessibilityServiceInfo);
        }

        /* renamed from: d */
        public ResolveInfo mo7d(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0030b.m34d(accessibilityServiceInfo);
        }

        /* renamed from: e */
        public String mo8e(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0030b.m35e(accessibilityServiceInfo);
        }

        /* renamed from: f */
        public int mo9f(AccessibilityServiceInfo accessibilityServiceInfo) {
            if (mo4a(accessibilityServiceInfo)) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.a.a$b */
    /* compiled from: AccessibilityServiceInfoCompat */
    static class C0027b extends C0026a {
        C0027b() {
        }

        /* renamed from: f */
        public int mo9f(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0031c.m36a(accessibilityServiceInfo);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            f12m = new C0027b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f12m = new C0026a();
        } else {
            f12m = new C0028c();
        }
    }

    private C0025a() {
    }

    /* renamed from: a */
    public static String m4a(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo6c(accessibilityServiceInfo);
    }

    /* renamed from: b */
    public static ResolveInfo m5b(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo7d(accessibilityServiceInfo);
    }

    /* renamed from: c */
    public static String m8c(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo8e(accessibilityServiceInfo);
    }

    /* renamed from: d */
    public static boolean m9d(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo4a(accessibilityServiceInfo);
    }

    /* renamed from: e */
    public static String m10e(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo5b(accessibilityServiceInfo);
    }

    /* renamed from: a */
    public static String m3a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            switch (numberOfTrailingZeros) {
                case 1:
                    sb.append("FEEDBACK_SPOKEN");
                    break;
                case 2:
                    sb.append("FEEDBACK_HAPTIC");
                    break;
                case 4:
                    sb.append("FEEDBACK_AUDIBLE");
                    break;
                case 8:
                    sb.append("FEEDBACK_VISUAL");
                    break;
                case 16:
                    sb.append("FEEDBACK_GENERIC");
                    break;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m6b(int i) {
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            case 4:
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            case 8:
                return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            case 16:
                return "FLAG_REPORT_VIEW_IDS";
            case 32:
                return "FLAG_REQUEST_FILTER_KEY_EVENTS";
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static int m11f(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f12m.mo9f(accessibilityServiceInfo);
    }

    /* renamed from: c */
    public static String m7c(int i) {
        switch (i) {
            case 1:
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            case 2:
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            case 4:
                return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            case 8:
                return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
            default:
                return "UNKNOWN";
        }
    }
}
