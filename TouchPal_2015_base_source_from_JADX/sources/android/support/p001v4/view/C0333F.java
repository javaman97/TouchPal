package android.support.p001v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p000a.C0011l;
import android.support.p001v4.view.p017a.C0418g;
import android.support.p001v4.view.p017a.C0429l;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.view.F */
/* compiled from: ViewCompat */
public class C0333F {

    /* renamed from: a */
    public static final int f817a = 0;

    /* renamed from: b */
    public static final int f818b = 1;

    /* renamed from: c */
    public static final int f819c = 2;

    /* renamed from: d */
    public static final int f820d = 0;

    /* renamed from: e */
    public static final int f821e = 1;

    /* renamed from: f */
    public static final int f822f = 2;

    /* renamed from: g */
    public static final int f823g = 4;

    /* renamed from: h */
    public static final int f824h = 0;

    /* renamed from: i */
    public static final int f825i = 1;

    /* renamed from: j */
    public static final int f826j = 2;

    /* renamed from: k */
    public static final int f827k = 0;

    /* renamed from: l */
    public static final int f828l = 1;

    /* renamed from: m */
    public static final int f829m = 2;

    /* renamed from: n */
    public static final int f830n = 0;

    /* renamed from: o */
    public static final int f831o = 1;

    /* renamed from: p */
    public static final int f832p = 2;

    /* renamed from: q */
    public static final int f833q = 3;

    /* renamed from: r */
    public static final int f834r = 16777215;

    /* renamed from: s */
    public static final int f835s = -16777216;

    /* renamed from: t */
    public static final int f836t = 16;

    /* renamed from: u */
    public static final int f837u = 16777216;

    /* renamed from: v */
    static final C0348o f838v;

    /* renamed from: w */
    private static final String f839w = "ViewCompat";

    /* renamed from: x */
    private static final long f840x = 10;

    @C0011l(mo1a = {0, 1, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$a */
    /* compiled from: ViewCompat */
    private @interface C0334a {
    }

    @C0011l(mo1a = {0, 1, 2, 4})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$g */
    /* compiled from: ViewCompat */
    private @interface C0340g {
    }

    @C0011l(mo1a = {0, 1, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$k */
    /* compiled from: ViewCompat */
    private @interface C0344k {
    }

    @C0011l(mo1a = {0, 1, 2, 3})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$l */
    /* compiled from: ViewCompat */
    private @interface C0345l {
    }

    @C0011l(mo1a = {0, 1, 1})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$m */
    /* compiled from: ViewCompat */
    private @interface C0346m {
    }

    @C0011l(mo1a = {0, 1})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.F$n */
    /* compiled from: ViewCompat */
    private @interface C0347n {
    }

    /* renamed from: android.support.v4.view.F$o */
    /* compiled from: ViewCompat */
    interface C0348o {
        /* renamed from: A */
        float mo1046A(View view);

        /* renamed from: B */
        float mo1047B(View view);

        /* renamed from: C */
        int mo1048C(View view);

        /* renamed from: D */
        int mo1049D(View view);

        /* renamed from: E */
        C0393Z mo1050E(View view);

        /* renamed from: F */
        float mo1051F(View view);

        /* renamed from: G */
        float mo1052G(View view);

        /* renamed from: a */
        int mo1053a(int i, int i2, int i3);

        /* renamed from: a */
        int mo1054a(View view);

        /* renamed from: a */
        void mo1056a(View view, float f);

        /* renamed from: a */
        void mo1057a(View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo1058a(View view, int i, Paint paint);

        /* renamed from: a */
        void mo1059a(View view, Paint paint);

        /* renamed from: a */
        void mo1060a(View view, C0418g gVar);

        /* renamed from: a */
        void mo1061a(View view, C0399a aVar);

        /* renamed from: a */
        void mo1062a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        void mo1063a(View view, Runnable runnable);

        /* renamed from: a */
        void mo1064a(View view, Runnable runnable, long j);

        /* renamed from: a */
        void mo1065a(View view, boolean z);

        /* renamed from: a */
        boolean mo1066a(View view, int i);

        /* renamed from: a */
        boolean mo1067a(View view, int i, Bundle bundle);

        /* renamed from: b */
        void mo1068b(View view, float f);

        /* renamed from: b */
        void mo1069b(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        void mo1070b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        boolean mo1071b(View view);

        /* renamed from: b */
        boolean mo1072b(View view, int i);

        /* renamed from: c */
        void mo1073c(View view);

        /* renamed from: c */
        void mo1074c(View view, float f);

        /* renamed from: c */
        void mo1075c(View view, int i);

        /* renamed from: d */
        int mo1076d(View view);

        /* renamed from: d */
        void mo1077d(View view, float f);

        /* renamed from: d */
        void mo1078d(View view, int i);

        /* renamed from: e */
        C0429l mo1079e(View view);

        /* renamed from: e */
        void mo1080e(View view, float f);

        /* renamed from: e */
        void mo1081e(View view, int i);

        /* renamed from: f */
        float mo1082f(View view);

        /* renamed from: f */
        void mo1083f(View view, float f);

        /* renamed from: f */
        void mo1084f(View view, int i);

        /* renamed from: g */
        int mo1085g(View view);

        /* renamed from: g */
        void mo1086g(View view, float f);

        /* renamed from: g */
        void mo1087g(View view, int i);

        /* renamed from: h */
        int mo1088h(View view);

        /* renamed from: h */
        void mo1089h(View view, float f);

        /* renamed from: i */
        int mo1090i(View view);

        /* renamed from: i */
        void mo1091i(View view, float f);

        /* renamed from: j */
        ViewParent mo1092j(View view);

        /* renamed from: j */
        void mo1093j(View view, float f);

        /* renamed from: k */
        void mo1094k(View view, float f);

        /* renamed from: k */
        boolean mo1095k(View view);

        /* renamed from: l */
        int mo1096l(View view);

        /* renamed from: l */
        void mo1097l(View view, float f);

        /* renamed from: m */
        int mo1098m(View view);

        /* renamed from: n */
        int mo1099n(View view);

        /* renamed from: o */
        int mo1100o(View view);

        /* renamed from: p */
        int mo1101p(View view);

        /* renamed from: q */
        int mo1102q(View view);

        /* renamed from: r */
        void mo1103r(View view);

        /* renamed from: s */
        void mo1104s(View view);

        /* renamed from: t */
        float mo1105t(View view);

        /* renamed from: u */
        float mo1106u(View view);

        /* renamed from: v */
        float mo1107v(View view);

        /* renamed from: w */
        float mo1108w(View view);

        /* renamed from: x */
        float mo1109x(View view);

        /* renamed from: y */
        float mo1110y(View view);

        /* renamed from: z */
        float mo1111z(View view);
    }

    /* renamed from: android.support.v4.view.F$b */
    /* compiled from: ViewCompat */
    static class C0335b implements C0348o {

        /* renamed from: a */
        WeakHashMap<View, C0393Z> f841a = null;

        /* renamed from: b */
        private Method f842b;

        /* renamed from: c */
        private Method f843c;

        /* renamed from: d */
        private boolean f844d;

        C0335b() {
        }

        /* renamed from: a */
        public boolean mo1066a(View view, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1072b(View view, int i) {
            return false;
        }

        /* renamed from: a */
        public int mo1054a(View view) {
            return 2;
        }

        /* renamed from: c */
        public void mo1075c(View view, int i) {
        }

        /* renamed from: a */
        public void mo1061a(View view, C0399a aVar) {
        }

        /* renamed from: a */
        public void mo1062a(View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: b */
        public void mo1070b(View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: a */
        public void mo1060a(View view, C0418g gVar) {
        }

        /* renamed from: b */
        public boolean mo1071b(View view) {
            return false;
        }

        /* renamed from: a */
        public void mo1065a(View view, boolean z) {
        }

        /* renamed from: c */
        public void mo1073c(View view) {
            view.invalidate();
        }

        /* renamed from: a */
        public void mo1057a(View view, int i, int i2, int i3, int i4) {
            view.invalidate(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1063a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo1055a());
        }

        /* renamed from: a */
        public void mo1064a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo1055a() + j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo1055a() {
            return C0333F.f840x;
        }

        /* renamed from: d */
        public int mo1076d(View view) {
            return 0;
        }

        /* renamed from: d */
        public void mo1078d(View view, int i) {
        }

        /* renamed from: a */
        public boolean mo1067a(View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: e */
        public C0429l mo1079e(View view) {
            return null;
        }

        /* renamed from: f */
        public float mo1082f(View view) {
            return 1.0f;
        }

        /* renamed from: a */
        public void mo1058a(View view, int i, Paint paint) {
        }

        /* renamed from: g */
        public int mo1085g(View view) {
            return 0;
        }

        /* renamed from: h */
        public int mo1088h(View view) {
            return 0;
        }

        /* renamed from: e */
        public void mo1081e(View view, int i) {
        }

        /* renamed from: a */
        public void mo1059a(View view, Paint paint) {
        }

        /* renamed from: i */
        public int mo1090i(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo1084f(View view, int i) {
        }

        /* renamed from: j */
        public ViewParent mo1092j(View view) {
            return view.getParent();
        }

        /* renamed from: k */
        public boolean mo1095k(View view) {
            Drawable background = view.getBackground();
            if (background == null || background.getOpacity() != -1) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public int mo1053a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        /* renamed from: l */
        public int mo1096l(View view) {
            return view.getMeasuredWidth();
        }

        /* renamed from: m */
        public int mo1098m(View view) {
            return view.getMeasuredHeight();
        }

        /* renamed from: n */
        public int mo1099n(View view) {
            return 0;
        }

        /* renamed from: o */
        public int mo1100o(View view) {
            return 0;
        }

        /* renamed from: g */
        public void mo1087g(View view, int i) {
        }

        /* renamed from: p */
        public int mo1101p(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: q */
        public int mo1102q(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: b */
        public void mo1069b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: r */
        public void mo1103r(View view) {
            if (!this.f844d) {
                m1398b();
            }
            if (this.f842b != null) {
                try {
                    this.f842b.invoke(view, new Object[0]);
                } catch (Exception e) {
                    Log.d(C0333F.f839w, "Error calling dispatchStartTemporaryDetach", e);
                }
            } else {
                view.onStartTemporaryDetach();
            }
        }

        /* renamed from: s */
        public void mo1104s(View view) {
            if (!this.f844d) {
                m1398b();
            }
            if (this.f843c != null) {
                try {
                    this.f843c.invoke(view, new Object[0]);
                } catch (Exception e) {
                    Log.d(C0333F.f839w, "Error calling dispatchFinishTemporaryDetach", e);
                }
            } else {
                view.onFinishTemporaryDetach();
            }
        }

        /* renamed from: b */
        private void m1398b() {
            try {
                this.f842b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
                this.f843c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
            } catch (NoSuchMethodException e) {
                Log.e(C0333F.f839w, "Couldn't find method", e);
            }
            this.f844d = true;
        }

        /* renamed from: t */
        public float mo1105t(View view) {
            return 0.0f;
        }

        /* renamed from: u */
        public float mo1106u(View view) {
            return 0.0f;
        }

        /* renamed from: v */
        public float mo1107v(View view) {
            return 0.0f;
        }

        /* renamed from: w */
        public float mo1108w(View view) {
            return 0.0f;
        }

        /* renamed from: x */
        public float mo1109x(View view) {
            return 0.0f;
        }

        /* renamed from: y */
        public float mo1110y(View view) {
            return 0.0f;
        }

        /* renamed from: z */
        public float mo1111z(View view) {
            return 0.0f;
        }

        /* renamed from: A */
        public float mo1046A(View view) {
            return 0.0f;
        }

        /* renamed from: B */
        public float mo1047B(View view) {
            return 0.0f;
        }

        /* renamed from: C */
        public int mo1048C(View view) {
            return 0;
        }

        /* renamed from: D */
        public int mo1049D(View view) {
            return 0;
        }

        /* renamed from: E */
        public C0393Z mo1050E(View view) {
            return new C0393Z(view);
        }

        /* renamed from: a */
        public void mo1056a(View view, float f) {
        }

        /* renamed from: b */
        public void mo1068b(View view, float f) {
        }

        /* renamed from: c */
        public void mo1074c(View view, float f) {
        }

        /* renamed from: d */
        public void mo1077d(View view, float f) {
        }

        /* renamed from: e */
        public void mo1080e(View view, float f) {
        }

        /* renamed from: f */
        public void mo1083f(View view, float f) {
        }

        /* renamed from: g */
        public void mo1086g(View view, float f) {
        }

        /* renamed from: h */
        public void mo1089h(View view, float f) {
        }

        /* renamed from: i */
        public void mo1091i(View view, float f) {
        }

        /* renamed from: j */
        public void mo1093j(View view, float f) {
        }

        /* renamed from: k */
        public void mo1094k(View view, float f) {
        }

        /* renamed from: l */
        public void mo1097l(View view, float f) {
        }

        /* renamed from: F */
        public float mo1051F(View view) {
            return 0.0f;
        }

        /* renamed from: G */
        public float mo1052G(View view) {
            return 0.0f;
        }
    }

    /* renamed from: android.support.v4.view.F$c */
    /* compiled from: ViewCompat */
    static class C0336c extends C0335b {
        C0336c() {
        }

        /* renamed from: k */
        public boolean mo1095k(View view) {
            return C0349G.m1596a(view);
        }
    }

    /* renamed from: android.support.v4.view.F$d */
    /* compiled from: ViewCompat */
    static class C0337d extends C0336c {
        C0337d() {
        }

        /* renamed from: a */
        public int mo1054a(View view) {
            return C0350H.m1597a(view);
        }

        /* renamed from: c */
        public void mo1075c(View view, int i) {
            C0350H.m1598a(view, i);
        }
    }

    /* renamed from: android.support.v4.view.F$e */
    /* compiled from: ViewCompat */
    static class C0338e extends C0337d {
        C0338e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo1055a() {
            return C0351I.m1601a();
        }

        /* renamed from: f */
        public float mo1082f(View view) {
            return C0351I.m1599a(view);
        }

        /* renamed from: a */
        public void mo1058a(View view, int i, Paint paint) {
            C0351I.m1603a(view, i, paint);
        }

        /* renamed from: g */
        public int mo1085g(View view) {
            return C0351I.m1604b(view);
        }

        /* renamed from: a */
        public void mo1059a(View view, Paint paint) {
            mo1058a(view, mo1085g(view), paint);
            view.invalidate();
        }

        /* renamed from: a */
        public int mo1053a(int i, int i2, int i3) {
            return C0351I.m1600a(i, i2, i3);
        }

        /* renamed from: l */
        public int mo1096l(View view) {
            return C0351I.m1606c(view);
        }

        /* renamed from: m */
        public int mo1098m(View view) {
            return C0351I.m1608d(view);
        }

        /* renamed from: n */
        public int mo1099n(View view) {
            return C0351I.m1610e(view);
        }

        /* renamed from: t */
        public float mo1105t(View view) {
            return C0351I.m1612f(view);
        }

        /* renamed from: u */
        public float mo1106u(View view) {
            return C0351I.m1614g(view);
        }

        /* renamed from: b */
        public void mo1068b(View view, float f) {
            C0351I.m1602a(view, f);
        }

        /* renamed from: c */
        public void mo1074c(View view, float f) {
            C0351I.m1605b(view, f);
        }

        /* renamed from: d */
        public void mo1077d(View view, float f) {
            C0351I.m1607c(view, f);
        }

        /* renamed from: i */
        public void mo1091i(View view, float f) {
            C0351I.m1609d(view, f);
        }

        /* renamed from: j */
        public void mo1093j(View view, float f) {
            C0351I.m1611e(view, f);
        }

        /* renamed from: a */
        public void mo1056a(View view, float f) {
            C0351I.m1613f(view, f);
        }

        /* renamed from: e */
        public void mo1080e(View view, float f) {
            C0351I.m1615g(view, f);
        }

        /* renamed from: f */
        public void mo1083f(View view, float f) {
            C0351I.m1617h(view, f);
        }

        /* renamed from: g */
        public void mo1086g(View view, float f) {
            C0351I.m1619i(view, f);
        }

        /* renamed from: h */
        public void mo1089h(View view, float f) {
            C0351I.m1621j(view, f);
        }

        /* renamed from: k */
        public void mo1094k(View view, float f) {
            C0351I.m1623k(view, f);
        }

        /* renamed from: l */
        public void mo1097l(View view, float f) {
            C0351I.m1625l(view, f);
        }

        /* renamed from: v */
        public float mo1107v(View view) {
            return C0351I.m1616h(view);
        }

        /* renamed from: w */
        public float mo1108w(View view) {
            return C0351I.m1618i(view);
        }

        /* renamed from: x */
        public float mo1109x(View view) {
            return C0351I.m1620j(view);
        }

        /* renamed from: y */
        public float mo1110y(View view) {
            return C0351I.m1622k(view);
        }

        /* renamed from: z */
        public float mo1111z(View view) {
            return C0351I.m1624l(view);
        }

        /* renamed from: A */
        public float mo1046A(View view) {
            return C0351I.m1626m(view);
        }

        /* renamed from: B */
        public float mo1047B(View view) {
            return C0351I.m1627n(view);
        }

        /* renamed from: F */
        public float mo1051F(View view) {
            return C0351I.m1628o(view);
        }

        /* renamed from: G */
        public float mo1052G(View view) {
            return C0351I.m1629p(view);
        }
    }

    /* renamed from: android.support.v4.view.F$f */
    /* compiled from: ViewCompat */
    static class C0339f extends C0338e {
        C0339f() {
        }

        /* renamed from: a */
        public boolean mo1066a(View view, int i) {
            return C0352J.m1632a(view, i);
        }

        /* renamed from: b */
        public boolean mo1072b(View view, int i) {
            return C0352J.m1635b(view, i);
        }

        /* renamed from: a */
        public void mo1062a(View view, AccessibilityEvent accessibilityEvent) {
            C0352J.m1630a(view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo1070b(View view, AccessibilityEvent accessibilityEvent) {
            C0352J.m1633b(view, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo1060a(View view, C0418g gVar) {
            C0352J.m1634b(view, gVar.mo1327a());
        }

        /* renamed from: a */
        public void mo1061a(View view, C0399a aVar) {
            C0352J.m1631a(view, aVar.mo1297a());
        }

        /* renamed from: E */
        public C0393Z mo1050E(View view) {
            if (this.f841a == null) {
                this.f841a = new WeakHashMap();
            }
            C0393Z z = (C0393Z) this.f841a.get(view);
            if (z != null) {
                return z;
            }
            C0393Z z2 = new C0393Z(view);
            this.f841a.put(view, z2);
            return z2;
        }
    }

    /* renamed from: android.support.v4.view.F$h */
    /* compiled from: ViewCompat */
    static class C0341h extends C0339f {
        C0341h() {
        }

        /* renamed from: b */
        public boolean mo1071b(View view) {
            return C0353K.m1641a(view);
        }

        /* renamed from: a */
        public void mo1065a(View view, boolean z) {
            C0353K.m1640a(view, z);
        }

        /* renamed from: c */
        public void mo1073c(View view) {
            C0353K.m1643b(view);
        }

        /* renamed from: a */
        public void mo1057a(View view, int i, int i2, int i3, int i4) {
            C0353K.m1637a(view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1063a(View view, Runnable runnable) {
            C0353K.m1638a(view, runnable);
        }

        /* renamed from: a */
        public void mo1064a(View view, Runnable runnable, long j) {
            C0353K.m1639a(view, runnable, j);
        }

        /* renamed from: d */
        public int mo1076d(View view) {
            return C0353K.m1644c(view);
        }

        /* renamed from: d */
        public void mo1078d(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            C0353K.m1636a(view, i);
        }

        /* renamed from: a */
        public boolean mo1067a(View view, int i, Bundle bundle) {
            return C0353K.m1642a(view, i, bundle);
        }

        /* renamed from: e */
        public C0429l mo1079e(View view) {
            Object d = C0353K.m1645d(view);
            if (d != null) {
                return new C0429l(d);
            }
            return null;
        }

        /* renamed from: j */
        public ViewParent mo1092j(View view) {
            return C0353K.m1646e(view);
        }

        /* renamed from: C */
        public int mo1048C(View view) {
            return C0353K.m1647f(view);
        }

        /* renamed from: D */
        public int mo1049D(View view) {
            return C0353K.m1648g(view);
        }
    }

    /* renamed from: android.support.v4.view.F$i */
    /* compiled from: ViewCompat */
    static class C0342i extends C0341h {
        C0342i() {
        }

        /* renamed from: h */
        public int mo1088h(View view) {
            return C0354L.m1649a(view);
        }

        /* renamed from: e */
        public void mo1081e(View view, int i) {
            C0354L.m1650a(view, i);
        }

        /* renamed from: a */
        public void mo1059a(View view, Paint paint) {
            C0354L.m1652a(view, paint);
        }

        /* renamed from: i */
        public int mo1090i(View view) {
            return C0354L.m1653b(view);
        }

        /* renamed from: f */
        public void mo1084f(View view, int i) {
            C0354L.m1654b(view, i);
        }

        /* renamed from: p */
        public int mo1101p(View view) {
            return C0354L.m1655c(view);
        }

        /* renamed from: q */
        public int mo1102q(View view) {
            return C0354L.m1656d(view);
        }

        /* renamed from: b */
        public void mo1069b(View view, int i, int i2, int i3, int i4) {
            C0354L.m1651a(view, i, i2, i3, i4);
        }
    }

    /* renamed from: android.support.v4.view.F$j */
    /* compiled from: ViewCompat */
    static class C0343j extends C0342i {
        C0343j() {
        }

        /* renamed from: o */
        public int mo1100o(View view) {
            return C0355M.m1657a(view);
        }

        /* renamed from: g */
        public void mo1087g(View view, int i) {
            C0355M.m1658a(view, i);
        }

        /* renamed from: d */
        public void mo1078d(View view, int i) {
            C0353K.m1636a(view, i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            f838v = new C0343j();
        } else if (i >= 17) {
            f838v = new C0342i();
        } else if (i >= 16) {
            f838v = new C0341h();
        } else if (i >= 14) {
            f838v = new C0339f();
        } else if (i >= 11) {
            f838v = new C0338e();
        } else if (i >= 9) {
            f838v = new C0337d();
        } else {
            f838v = new C0335b();
        }
    }

    /* renamed from: a */
    public static boolean m1345a(View view, int i) {
        return f838v.mo1066a(view, i);
    }

    /* renamed from: b */
    public static boolean m1351b(View view, int i) {
        return f838v.mo1072b(view, i);
    }

    /* renamed from: a */
    public static int m1334a(View view) {
        return f838v.mo1054a(view);
    }

    /* renamed from: c */
    public static void m1354c(View view, int i) {
        f838v.mo1075c(view, i);
    }

    /* renamed from: a */
    public static void m1341a(View view, AccessibilityEvent accessibilityEvent) {
        f838v.mo1062a(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m1349b(View view, AccessibilityEvent accessibilityEvent) {
        f838v.mo1070b(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m1339a(View view, C0418g gVar) {
        f838v.mo1060a(view, gVar);
    }

    /* renamed from: a */
    public static void m1340a(View view, C0399a aVar) {
        f838v.mo1061a(view, aVar);
    }

    /* renamed from: b */
    public static boolean m1350b(View view) {
        return f838v.mo1071b(view);
    }

    /* renamed from: a */
    public static void m1344a(View view, boolean z) {
        f838v.mo1065a(view, z);
    }

    /* renamed from: c */
    public static void m1352c(View view) {
        f838v.mo1073c(view);
    }

    /* renamed from: a */
    public static void m1336a(View view, int i, int i2, int i3, int i4) {
        f838v.mo1057a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m1342a(View view, Runnable runnable) {
        f838v.mo1063a(view, runnable);
    }

    /* renamed from: a */
    public static void m1343a(View view, Runnable runnable, long j) {
        f838v.mo1064a(view, runnable, j);
    }

    /* renamed from: d */
    public static int m1355d(View view) {
        return f838v.mo1076d(view);
    }

    /* renamed from: d */
    public static void m1357d(View view, int i) {
        f838v.mo1078d(view, i);
    }

    /* renamed from: a */
    public static boolean m1346a(View view, int i, Bundle bundle) {
        return f838v.mo1067a(view, i, bundle);
    }

    /* renamed from: e */
    public static C0429l m1358e(View view) {
        return f838v.mo1079e(view);
    }

    /* renamed from: f */
    public static float m1361f(View view) {
        return f838v.mo1082f(view);
    }

    /* renamed from: a */
    public static void m1337a(View view, int i, Paint paint) {
        f838v.mo1058a(view, i, paint);
    }

    /* renamed from: g */
    public static int m1364g(View view) {
        return f838v.mo1085g(view);
    }

    /* renamed from: h */
    public static int m1367h(View view) {
        return f838v.mo1088h(view);
    }

    /* renamed from: e */
    public static void m1360e(View view, int i) {
        f838v.mo1081e(view, i);
    }

    /* renamed from: a */
    public static void m1338a(View view, Paint paint) {
        f838v.mo1059a(view, paint);
    }

    /* renamed from: i */
    public static int m1369i(View view) {
        return f838v.mo1090i(view);
    }

    /* renamed from: f */
    public static void m1363f(View view, int i) {
        f838v.mo1084f(view, i);
    }

    /* renamed from: j */
    public static ViewParent m1371j(View view) {
        return f838v.mo1092j(view);
    }

    /* renamed from: k */
    public static boolean m1373k(View view) {
        return f838v.mo1095k(view);
    }

    /* renamed from: a */
    public static int m1333a(int i, int i2, int i3) {
        return f838v.mo1053a(i, i2, i3);
    }

    /* renamed from: l */
    public static int m1374l(View view) {
        return f838v.mo1096l(view);
    }

    /* renamed from: m */
    public static int m1375m(View view) {
        return f838v.mo1098m(view);
    }

    /* renamed from: n */
    public static int m1376n(View view) {
        return f838v.mo1099n(view);
    }

    /* renamed from: o */
    public static int m1377o(View view) {
        return f838v.mo1100o(view);
    }

    /* renamed from: g */
    public static void m1366g(View view, int i) {
        f838v.mo1087g(view, i);
    }

    /* renamed from: p */
    public static int m1378p(View view) {
        return f838v.mo1101p(view);
    }

    /* renamed from: q */
    public static int m1379q(View view) {
        return f838v.mo1102q(view);
    }

    /* renamed from: b */
    public static void m1348b(View view, int i, int i2, int i3, int i4) {
        f838v.mo1069b(view, i, i2, i3, i4);
    }

    /* renamed from: r */
    public static void m1380r(View view) {
        f838v.mo1103r(view);
    }

    /* renamed from: s */
    public static void m1381s(View view) {
        f838v.mo1104s(view);
    }

    /* renamed from: t */
    public static float m1382t(View view) {
        return f838v.mo1105t(view);
    }

    /* renamed from: u */
    public static float m1383u(View view) {
        return f838v.mo1106u(view);
    }

    /* renamed from: v */
    public static int m1384v(View view) {
        return f838v.mo1048C(view);
    }

    /* renamed from: w */
    public static int m1385w(View view) {
        return f838v.mo1049D(view);
    }

    /* renamed from: x */
    public static C0393Z m1386x(View view) {
        return f838v.mo1050E(view);
    }

    /* renamed from: a */
    public static void m1335a(View view, float f) {
        f838v.mo1068b(view, f);
    }

    /* renamed from: b */
    public static void m1347b(View view, float f) {
        f838v.mo1074c(view, f);
    }

    /* renamed from: c */
    public static void m1353c(View view, float f) {
        f838v.mo1077d(view, f);
    }

    /* renamed from: d */
    public static void m1356d(View view, float f) {
        f838v.mo1091i(view, f);
    }

    /* renamed from: e */
    public static void m1359e(View view, float f) {
        f838v.mo1093j(view, f);
    }

    /* renamed from: f */
    public static void m1362f(View view, float f) {
        f838v.mo1056a(view, f);
    }

    /* renamed from: g */
    public static void m1365g(View view, float f) {
        f838v.mo1080e(view, f);
    }

    /* renamed from: h */
    public static void m1368h(View view, float f) {
        f838v.mo1083f(view, f);
    }

    /* renamed from: i */
    public static void m1370i(View view, float f) {
        f838v.mo1086g(view, f);
    }

    /* renamed from: j */
    public static void m1372j(View view, float f) {
        f838v.mo1089h(view, f);
    }

    /* renamed from: y */
    public float mo1044y(View view) {
        return f838v.mo1051F(view);
    }

    /* renamed from: k */
    public void mo1042k(View view, float f) {
        f838v.mo1094k(view, f);
    }

    /* renamed from: z */
    public float mo1045z(View view) {
        return f838v.mo1052G(view);
    }

    /* renamed from: l */
    public void mo1043l(View view, float f) {
        f838v.mo1094k(view, f);
    }

    /* renamed from: A */
    public float mo1035A(View view) {
        return f838v.mo1109x(view);
    }

    /* renamed from: B */
    public float mo1036B(View view) {
        return f838v.mo1110y(view);
    }

    /* renamed from: C */
    public float mo1037C(View view) {
        return f838v.mo1111z(view);
    }

    /* renamed from: D */
    public float mo1038D(View view) {
        return f838v.mo1046A(view);
    }

    /* renamed from: E */
    public float mo1039E(View view) {
        return f838v.mo1047B(view);
    }

    /* renamed from: F */
    public float mo1040F(View view) {
        return f838v.mo1107v(view);
    }

    /* renamed from: G */
    public float mo1041G(View view) {
        return f838v.mo1108w(view);
    }
}
