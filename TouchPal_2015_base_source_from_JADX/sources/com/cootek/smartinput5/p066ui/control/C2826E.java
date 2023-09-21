package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1594bS;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.p066ui.TopScrollView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.control.E */
/* compiled from: KeyboardZoomController */
public class C2826E {

    /* renamed from: a */
    private static final int f12629a = 0;

    /* renamed from: b */
    private static final int f12630b = 1;

    /* renamed from: k */
    private static final int f12631k = -1;

    /* renamed from: c */
    private Context f12632c;

    /* renamed from: d */
    private int f12633d;

    /* renamed from: e */
    private int f12634e;

    /* renamed from: f */
    private int f12635f;

    /* renamed from: g */
    private int f12636g;

    /* renamed from: h */
    private C2822A f12637h;

    /* renamed from: i */
    private double f12638i = 1.0d;

    /* renamed from: j */
    private double f12639j = 1.0d;

    /* renamed from: l */
    private final boolean f12640l;

    /* renamed from: m */
    private int f12641m = 0;

    /* renamed from: n */
    private int f12642n = 0;

    /* renamed from: o */
    private int f12643o = 0;

    /* renamed from: p */
    private ArrayList<C2827a> f12644p;

    /* renamed from: q */
    private int f12645q;

    /* renamed from: com.cootek.smartinput5.ui.control.E$a */
    /* compiled from: KeyboardZoomController */
    public interface C2827a {
        /* renamed from: c */
        void mo8538c();

        /* renamed from: p_ */
        void mo8556p_();
    }

    public C2826E(Context context) {
        this.f12632c = context;
        this.f12640l = C1594bS.m7176a(this.f12632c);
        this.f12644p = new ArrayList<>();
        this.f12637h = new C2822A(this.f12632c);
        m12866I();
    }

    /* renamed from: a */
    public void mo9238a(C2827a aVar) {
        if (this.f12640l && !this.f12644p.contains(aVar)) {
            this.f12644p.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo9242b(C2827a aVar) {
        if (this.f12644p.contains(aVar)) {
            this.f12644p.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo9233a() {
        this.f12644p.clear();
    }

    /* renamed from: b */
    public void mo9240b() {
        m12877c(0);
    }

    /* renamed from: c */
    private void m12877c(int i) {
        Iterator it = new ArrayList(this.f12644p).iterator();
        while (it.hasNext()) {
            C2827a aVar = (C2827a) it.next();
            if (i == 0) {
                aVar.mo8538c();
            } else if (i == 1) {
                aVar.mo8556p_();
            }
        }
    }

    /* renamed from: a */
    public void mo9236a(int i, int i2, int i3, int i4) {
        if (this.f12636g > 0 && i != -1) {
            i = (int) (((float) i) * 0.8333333f);
        }
        this.f12632c.getResources().getDisplayMetrics();
        if (i != -1) {
            if (!TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f)) {
                Settings.getInstance().setIntSetting(Settings.KEYBOARD_HEIGHT_NORMAL, i);
            } else if (2 != C1933b.m8860a()) {
                Settings.getInstance().setIntSetting(255, i);
            }
        }
        if (i4 != -1 && !mo9259q()) {
            m12874a("bottom", i4);
        }
        if (i2 != -1 && i3 != -1 && !mo9259q()) {
            m12874a(Settings.KEYBOARD_MARGIN_LEFT, i2);
            m12874a(Settings.KEYBOARD_MARGIN_RIGHT, i3);
            m12866I();
            m12869L();
        }
    }

    /* renamed from: c */
    public void mo9244c() {
        m12867J();
        if (m12865H()) {
            Settings.getInstance().setBoolSetting(399, true, false);
            Settings.getInstance().setBoolSetting(Settings.AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE, false, false);
            m12874a(Settings.KEYBOARD_MARGIN_LEFT, mo9228C());
            m12874a(Settings.KEYBOARD_MARGIN_RIGHT, mo9229D());
            m12874a("bottom", mo9230E());
            Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, true, false);
            m12866I();
        }
    }

    /* renamed from: a */
    private void m12874a(String str, int i) {
        Settings.getInstance().setIntSetting(Settings.KEYBOARD_MARGIN, i, 18, str, (Config) null, false);
    }

    /* renamed from: H */
    private boolean m12865H() {
        if (!Settings.getInstance().getBoolSetting(Settings.AUTO_ADJUST_SPECIAL_KEYBOARD_SIZE) || mo9230E() + mo9228C() + mo9229D() <= 0) {
            return false;
        }
        if (m12870a("bottom") + m12870a(Settings.KEYBOARD_MARGIN_LEFT) + m12870a(Settings.KEYBOARD_MARGIN_RIGHT) <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo9246d() {
        m12866I();
        m12869L();
    }

    /* renamed from: I */
    private void m12866I() {
        int i = this.f12632c.getResources().getDisplayMetrics().widthPixels;
        this.f12633d = 0;
        this.f12634e = 0;
        if (!Settings.getInstance().getBoolSetting(Settings.ONE_HANDED_LAYOUT) || mo9259q()) {
            this.f12635f = 0;
        } else {
            this.f12633d = m12870a(Settings.KEYBOARD_MARGIN_LEFT);
            this.f12634e = m12870a(Settings.KEYBOARD_MARGIN_RIGHT);
            this.f12635f = m12870a("bottom");
        }
        this.f12638i = ((double) ((i - this.f12633d) - this.f12634e)) / ((double) i);
    }

    /* renamed from: a */
    private int m12870a(String str) {
        return Settings.getInstance().getIntSetting(Settings.KEYBOARD_MARGIN, 18, str, (Config) null);
    }

    /* renamed from: J */
    private void m12867J() {
        int[] a = C2875t.m13306a(this.f12632c);
        this.f12641m = a[0];
        this.f12642n = a[2];
        this.f12643o = a[3];
    }

    /* renamed from: e */
    public void mo9247e() {
        if (Settings.isInitialized()) {
            m12874a(Settings.KEYBOARD_MARGIN_LEFT, 0);
            m12874a(Settings.KEYBOARD_MARGIN_RIGHT, 0);
            m12874a("bottom", 0);
        }
    }

    /* renamed from: a */
    public void mo9239a(boolean z) {
        int i;
        int i2 = 0;
        int i3 = this.f12633d + this.f12634e;
        if (z) {
            i = i3 - 0;
        } else {
            i2 = i3 - 0;
            i = 0;
        }
        mo9236a(-1, i2, i, -1);
        mo9235a(1);
    }

    /* renamed from: f */
    public void mo9248f() {
        boolean z = true;
        if (mo9266x() == 0 || mo9266x() == 1) {
            z = false;
        }
        mo9243b(z);
        mo9235a(0);
    }

    /* renamed from: a */
    public void mo9235a(int i) {
        Engine.getInstance().getWidgetManager().mo9629ac();
        Engine.getInstance().getWidgetManager().mo9620Z();
        Engine.getInstance().getWidgetManager().mo9608N();
        Engine.getInstance().getWidgetManager().mo9651i().mo9723i();
        Engine.getInstance().updateResult(17, -1);
        View t = Engine.getInstance().getWidgetManager().mo9663t();
        if (t instanceof TopScrollView) {
            ((TopScrollView) t).mo8828n();
        }
        m12877c(i);
    }

    /* renamed from: a */
    private void m12873a(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7 = 0;
        ViewGroup b = Engine.getInstance().getWidgetManager().mo9637b();
        int i8 = this.f12632c.getResources().getDisplayMetrics().widthPixels;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b.getLayoutParams();
        if (i3 != -1) {
            marginLayoutParams.leftMargin = i3;
        }
        if (i4 != -1) {
            marginLayoutParams.rightMargin = i4;
        }
        if (i5 != -1) {
            marginLayoutParams.bottomMargin = i5;
        }
        if (z) {
            marginLayoutParams.width = -1;
        } else if (i != -1) {
            marginLayoutParams.width = i;
        } else {
            if (marginLayoutParams.leftMargin > 0) {
                i6 = marginLayoutParams.leftMargin;
            } else {
                i6 = 0;
            }
            if (marginLayoutParams.rightMargin > 0) {
                i7 = marginLayoutParams.rightMargin;
            }
            marginLayoutParams.width = (i8 - i6) - i7;
        }
        if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 80;
        } else if (marginLayoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) marginLayoutParams).gravity = 80;
        }
        b.setLayoutParams(marginLayoutParams);
        b.invalidate();
        b.bringToFront();
    }

    /* renamed from: g */
    public void mo9249g() {
        this.f12637h.mo9219b();
    }

    /* renamed from: a */
    public void mo9237a(Drawable drawable) {
        this.f12637h.mo9217a(drawable);
    }

    /* renamed from: h */
    public double mo9250h() {
        return this.f12638i;
    }

    /* renamed from: i */
    public double mo9251i() {
        return 1.0d;
    }

    /* renamed from: j */
    public double mo9252j() {
        return Math.min(mo9250h(), mo9253k());
    }

    /* renamed from: a */
    public void mo9234a(double d) {
        this.f12639j = d;
    }

    /* renamed from: k */
    public double mo9253k() {
        if (TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f)) {
            return 1.0d;
        }
        return this.f12639j;
    }

    /* renamed from: l */
    public int mo9254l() {
        return this.f12633d;
    }

    /* renamed from: m */
    public int mo9255m() {
        return this.f12634e;
    }

    /* renamed from: n */
    public int mo9256n() {
        return this.f12635f;
    }

    /* renamed from: o */
    public void mo9257o() {
        m12873a(-1, -1, this.f12633d, this.f12634e, this.f12635f, true);
    }

    /* renamed from: p */
    public int mo9258p() {
        return this.f12636g;
    }

    /* renamed from: b */
    public void mo9241b(int i) {
        this.f12636g = i;
    }

    /* renamed from: q */
    public boolean mo9259q() {
        return TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f) || Engine.getInstance().isHardKeyMode() || Engine.getInstance().getIms().getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: r */
    public boolean mo9260r() {
        return this.f12633d > 0 || this.f12634e > 0;
    }

    /* renamed from: s */
    public int mo9261s() {
        int i;
        if (((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            i = Engine.getInstance().getWidgetManager().mo9651i().mo9718d() + 0;
        } else {
            i = 0;
        }
        if (Engine.getInstance().getWidgetManager().mo9646f() != null) {
            return i + Engine.getInstance().getWidgetManager().mo9646f().mo9134g();
        }
        return i;
    }

    /* renamed from: b */
    public void mo9243b(boolean z) {
        if (!mo9259q()) {
            m12869L();
        }
    }

    /* renamed from: t */
    public int mo9262t() {
        return (this.f12632c.getResources().getDisplayMetrics().widthPixels - this.f12633d) - this.f12634e;
    }

    /* renamed from: u */
    public boolean mo9263u() {
        return this.f12640l;
    }

    /* renamed from: d */
    private void m12878d(int i) {
        this.f12645q = i;
    }

    /* renamed from: K */
    private int m12868K() {
        if (this.f12633d > 0 || this.f12634e > 0) {
            if (this.f12633d == 0) {
                return 2;
            }
            if (this.f12634e == 0) {
                return 3;
            }
            return 4;
        } else if (this.f12635f == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: v */
    public boolean mo9264v() {
        return this.f12633d >= mo9231F();
    }

    /* renamed from: w */
    public boolean mo9265w() {
        return this.f12634e >= mo9231F();
    }

    /* renamed from: x */
    public int mo9266x() {
        return this.f12645q;
    }

    /* renamed from: L */
    private void m12869L() {
        m12878d(m12868K());
    }

    /* renamed from: y */
    public void mo9267y() {
    }

    /* renamed from: z */
    public void mo9268z() {
        this.f12637h.mo9215a();
    }

    /* renamed from: c */
    public void mo9245c(boolean z) {
        this.f12637h.mo9218a(z);
    }

    /* renamed from: A */
    public int mo9226A() {
        return mo9261s() + mo9256n();
    }

    /* renamed from: B */
    public int mo9227B() {
        return this.f12632c.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: C */
    public int mo9228C() {
        return this.f12641m;
    }

    /* renamed from: D */
    public int mo9229D() {
        return this.f12642n;
    }

    /* renamed from: E */
    public int mo9230E() {
        return this.f12643o;
    }

    /* renamed from: a */
    public static int m12872a(int[] iArr, boolean z, int i) {
        int b;
        if (iArr == null || iArr.length <= 1 || !m12875a(iArr, z)) {
            return i;
        }
        if (z) {
            b = m12871a(iArr, i);
        } else {
            b = m12876b(iArr, i);
        }
        return b;
    }

    /* renamed from: a */
    private static boolean m12875a(int[] iArr, boolean z) {
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            if (iArr[i] - iArr[i + 1] > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int m12871a(int[] iArr, int i) {
        if (i <= iArr[0]) {
            return iArr[0];
        }
        if (i >= iArr[iArr.length - 1]) {
            return i;
        }
        int length = iArr.length - 1;
        for (int i2 = 0; i2 < length; i2++) {
            if (i >= iArr[i2] && i < iArr[i2 + 1]) {
                return iArr[i2];
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m12876b(int[] iArr, int i) {
        if (i <= iArr[0]) {
            return i;
        }
        if (i >= iArr[iArr.length - 1]) {
            return iArr[iArr.length - 1];
        }
        int length = iArr.length - 1;
        for (int i2 = 0; i2 < length; i2++) {
            if (i > iArr[i2] && i <= iArr[i2 + 1]) {
                return iArr[i2 + 1];
            }
        }
        return i;
    }

    /* renamed from: F */
    public int mo9231F() {
        return mo9227B() / 10;
    }

    /* renamed from: G */
    public C2822A mo9232G() {
        return this.f12637h;
    }
}
