package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1439ao;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.C2811cf;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.p066ui.settings.C3072bc;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.cootek.smartinput5.ui.settings.aV */
/* compiled from: KeyboardCustomizeMask */
public class C3007aV implements C3072bc.C3077d {

    /* renamed from: a */
    public static final int f13837a = 0;

    /* renamed from: b */
    public static final int f13838b = 1;

    /* renamed from: c */
    public static final int f13839c = 2;

    /* renamed from: d */
    public static final int f13840d = 3;

    /* renamed from: e */
    public static final int f13841e = 4;

    /* renamed from: f */
    public static final boolean f13842f = false;

    /* renamed from: g */
    public static final int f13843g = 0;

    /* renamed from: h */
    public static final int f13844h = 1;

    /* renamed from: i */
    public static final int f13845i = 2;

    /* renamed from: j */
    public static final int f13846j = 3;

    /* renamed from: k */
    public static final int f13847k = 4;

    /* renamed from: l */
    public static final int f13848l = 5;

    /* renamed from: m */
    public static final int f13849m = -1;

    /* renamed from: n */
    private static final int f13850n = 0;

    /* renamed from: o */
    private static final int f13851o = 1;

    /* renamed from: r */
    private static final int f13852r = 5;

    /* renamed from: s */
    private static final int f13853s = 0;

    /* renamed from: t */
    private static final int f13854t = 1;

    /* renamed from: u */
    private static final int f13855u = 2;

    /* renamed from: A */
    private int f13856A;

    /* renamed from: B */
    private PopupWindow f13857B;

    /* renamed from: C */
    private KeyboardMaskEdge f13858C;

    /* renamed from: D */
    private KeyboardMaskEdge f13859D;

    /* renamed from: E */
    private KeyboardMaskEdge f13860E;

    /* renamed from: F */
    private KeyboardMaskEdge f13861F;

    /* renamed from: G */
    private KeyboardMaskArrowPair f13862G;

    /* renamed from: H */
    private KeyboardMaskArrowPair f13863H;

    /* renamed from: I */
    private KeyboardMaskArrowPair f13864I;

    /* renamed from: J */
    private KeyboardMaskArrowPair f13865J;

    /* renamed from: K */
    private KeyboardMaskArrowPair f13866K;

    /* renamed from: L */
    private ViewGroup f13867L;

    /* renamed from: M */
    private RelativeLayout f13868M;

    /* renamed from: N */
    private RelativeLayout f13869N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public ImageView f13870O;

    /* renamed from: P */
    private C2826E f13871P;

    /* renamed from: Q */
    private int f13872Q = -1;

    /* renamed from: R */
    private int f13873R = -1;

    /* renamed from: S */
    private boolean f13874S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f13875T;

    /* renamed from: U */
    private boolean f13876U;

    /* renamed from: V */
    private boolean f13877V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public Handler f13878W = new Handler();

    /* renamed from: X */
    private ArrayList<C3008a> f13879X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public C3072bc f13880Y;

    /* renamed from: Z */
    private Context f13881Z;

    /* renamed from: p */
    private final double f13882p = 0.35d;

    /* renamed from: q */
    private final double f13883q = 0.2d;

    /* renamed from: v */
    private int f13884v = 2;

    /* renamed from: w */
    private int f13885w;

    /* renamed from: x */
    private int f13886x;

    /* renamed from: y */
    private int f13887y;

    /* renamed from: z */
    private int f13888z;

    /* renamed from: com.cootek.smartinput5.ui.settings.aV$a */
    /* compiled from: KeyboardCustomizeMask */
    public interface C3008a {
        /* renamed from: t */
        void mo8562t();

        /* renamed from: u */
        void mo8563u();
    }

    public C3007aV(Context context) {
        this.f13881Z = context;
        this.f13879X = new ArrayList<>();
        this.f13888z = this.f13881Z.getResources().getDisplayMetrics().widthPixels;
        this.f13856A = this.f13881Z.getResources().getDisplayMetrics().heightPixels;
        this.f13887y = (int) (((double) this.f13856A) * 0.5d);
        if (C1439ao.m6712a(this.f13881Z) < 7.0d) {
            this.f13886x = (int) (((double) this.f13856A) * 0.35d);
        } else {
            this.f13886x = (int) (((double) this.f13856A) * 0.2d);
        }
        this.f13874S = false;
        this.f13875T = false;
        this.f13876U = false;
        this.f13877V = false;
    }

    /* renamed from: a */
    public void mo10097a(C3008a aVar) {
        if (!this.f13879X.contains(aVar)) {
            this.f13879X.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo10100b(C3008a aVar) {
        if (this.f13879X.contains(aVar)) {
            this.f13879X.remove(aVar);
        }
    }

    /* renamed from: a */
    public void mo10092a() {
        this.f13879X.clear();
    }

    /* renamed from: k */
    private void m14220k() {
        m14211b(0);
    }

    /* renamed from: l */
    private void m14221l() {
        m14211b(1);
    }

    /* renamed from: b */
    private void m14211b(int i) {
        Iterator it = new ArrayList(this.f13879X).iterator();
        while (it.hasNext()) {
            C3008a aVar = (C3008a) it.next();
            if (i == 0) {
                aVar.mo8562t();
            } else if (i == 1) {
                aVar.mo8563u();
            }
        }
    }

    /* renamed from: m */
    private int m14222m() {
        Rect rect = new Rect();
        Engine.getInstance().getWidgetManager().mo9648g().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    /* renamed from: n */
    private int m14223n() {
        int identifier = this.f13881Z.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f13881Z.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    private void m14212b(int i, int i2) {
        this.f13857B = new PopupWindow(this.f13881Z);
        if (i == -1) {
            this.f13857B.setWidth(this.f13888z);
        } else {
            this.f13857B.setWidth(i);
        }
        if (i2 == -1) {
            this.f13857B.setHeight(m14222m() - m14223n());
        } else {
            this.f13857B.setHeight(i2);
        }
        this.f13857B.setBackgroundDrawable((Drawable) null);
        this.f13871P = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f13867L = (ViewGroup) ((LayoutInflater) this.f13881Z.getSystemService("layout_inflater")).inflate(R.layout.keyboard_customize_mask, (ViewGroup) null);
        this.f13857B.setContentView(this.f13867L);
        this.f13880Y = new C3072bc(this.f13881Z, this.f13857B.getWidth(), this.f13857B.getHeight(), this);
        m14201C();
        this.f13868M = (RelativeLayout) this.f13867L.findViewById(R.id.keyboard_mask_wrapper);
        this.f13869N = (RelativeLayout) this.f13867L.findViewById(R.id.keyboard_mask);
        this.f13869N.setBackgroundColor(1996488704);
        if (Engine.getInstance().getWidgetManager().mo9646f() != null) {
            m14224o();
            m14228s();
            this.f13885w = (int) (((double) this.f13856A) * 0.65d);
            m14227r();
            m14225p();
            m14230u();
            m14231v();
        }
    }

    /* renamed from: o */
    private void m14224o() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Engine.getInstance().getWidgetManager().mo9646f().mo9192n(), Engine.getInstance().getWidgetManager().mo9646f().mo9134g() + Engine.getInstance().getWidgetManager().mo9651i().mo9718d());
        layoutParams.leftMargin = this.f13871P.mo9254l();
        layoutParams.rightMargin = this.f13871P.mo9255m();
        layoutParams.bottomMargin = this.f13871P.mo9256n();
        layoutParams.addRule(12);
        this.f13869N.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private int m14215c(int i, int i2) {
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int i3 = this.f13884v;
        if (abs >= 5 && abs2 >= 5) {
            return 2;
        }
        if (i3 != 2 && abs <= 5 && abs2 <= 5) {
            return i3;
        }
        if (abs < abs2) {
            return 1;
        }
        if (abs > abs2) {
            return 0;
        }
        return 2;
    }

    /* renamed from: p */
    private void m14225p() {
        if (!m14205G()) {
            this.f13870O = (ImageView) this.f13867L.findViewById(R.id.keyboard_customize_knob);
            this.f13870O.setImageResource(R.drawable.keyboard_customize_raise_down_bg);
            this.f13870O.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            m14226q();
            this.f13870O.setOnTouchListener(new C3009aW(this));
        }
    }

    /* renamed from: q */
    private void m14226q() {
        if (!m14205G() && this.f13870O != null) {
            int x = m14233x() / 3;
            int w = m14232w() / 3;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13870O.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(x, w);
                layoutParams.addRule(13);
            } else {
                layoutParams.width = x;
                layoutParams.height = w;
            }
            this.f13870O.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: r */
    private void m14227r() {
        C2811cf f = Engine.getInstance().getWidgetManager().mo9646f();
        int n = this.f13871P.mo9256n() + Engine.getInstance().getWidgetManager().mo9651i().mo9718d() + f.mo9134g();
        this.f13858C = new KeyboardMaskEdge(this.f13881Z, f.mo9192n(), false, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f13858C.getEdgeIntrinsicHeight());
        layoutParams.addRule(10);
        this.f13869N.addView(this.f13858C, layoutParams);
        if (!m14205G()) {
            this.f13860E = new KeyboardMaskEdge(this.f13881Z, n, true, 2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f13860E.getEdgeIntrinsicWidth(), -1);
            layoutParams2.addRule(9);
            this.f13869N.addView(this.f13860E, layoutParams2);
            this.f13861F = new KeyboardMaskEdge(this.f13881Z, n, true, 3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f13861F.getEdgeIntrinsicWidth(), -1);
            layoutParams3.addRule(11);
            this.f13869N.addView(this.f13861F, layoutParams3);
            this.f13859D = new KeyboardMaskEdge(this.f13881Z, f.mo9192n(), false, 1);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, this.f13859D.getEdgeIntrinsicHeight());
            layoutParams4.addRule(12);
            this.f13869N.addView(this.f13859D, layoutParams4);
        }
    }

    /* renamed from: a */
    public void mo10094a(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f13858C != null) {
            KeyboardMaskEdge keyboardMaskEdge = this.f13858C;
            if (i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            keyboardMaskEdge.mo9881a(i, z);
            if (!m14205G()) {
                KeyboardMaskEdge keyboardMaskEdge2 = this.f13860E;
                if (2 == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                keyboardMaskEdge2.mo9881a(i2, z2);
                KeyboardMaskEdge keyboardMaskEdge3 = this.f13861F;
                if (3 == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                keyboardMaskEdge3.mo9881a(i2, z3);
                KeyboardMaskEdge keyboardMaskEdge4 = this.f13859D;
                if (1 != i3) {
                    z4 = false;
                }
                keyboardMaskEdge4.mo9881a(i, z4);
            }
        }
    }

    /* renamed from: s */
    private void m14228s() {
        if (!m14205G()) {
            this.f13863H = new HorizontalArrowPair(this.f13881Z, true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f13863H.getArrowPairWidth(), this.f13863H.getArrowPairHeight());
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            this.f13868M.addView(this.f13863H, layoutParams);
            this.f13864I = new HorizontalArrowPair(this.f13881Z, false);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f13864I.getArrowPairWidth(), this.f13864I.getArrowPairHeight());
            layoutParams2.addRule(12);
            layoutParams2.addRule(11);
            this.f13868M.addView(this.f13864I, layoutParams2);
            this.f13866K = new VerticalArrowPair(this.f13881Z);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f13866K.getArrowPairWidth(), this.f13866K.getArrowPairHeight());
            layoutParams3.addRule(12);
            layoutParams3.addRule(9);
            this.f13868M.addView(this.f13866K, layoutParams3);
        }
        this.f13865J = new VerticalArrowPair(this.f13881Z);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(this.f13865J.getArrowPairWidth(), this.f13865J.getArrowPairHeight());
        layoutParams4.addRule(12);
        layoutParams4.addRule(9);
        this.f13868M.addView(this.f13865J, layoutParams4);
        this.f13862G = null;
    }

    /* renamed from: b */
    public void mo10099b() {
        m14226q();
        m14229t();
    }

    /* renamed from: t */
    private void m14229t() {
        m14231v();
        m14230u();
    }

    /* renamed from: u */
    private void m14230u() {
        if (this.f13880Y != null) {
            int d = this.f13880Y.mo10193d();
            int e = this.f13880Y.mo10194e();
            int b = this.f13880Y.mo10190b();
            int c = this.f13880Y.mo10192c();
            int i = e - d;
            int a = this.f13880Y.mo10188a() - e;
            if (!m14205G()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13863H.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f13864I.getLayoutParams();
                layoutParams.leftMargin = b - (this.f13863H.getArrowPairWidth() / 2);
                layoutParams2.rightMargin = (m14204F() - c) - (this.f13864I.getArrowPairWidth() / 2);
                int arrowPairHeight = ((i / 2) + a) - (this.f13863H.getArrowPairHeight() / 2);
                layoutParams.bottomMargin = arrowPairHeight;
                layoutParams2.bottomMargin = arrowPairHeight;
                this.f13863H.setLayoutParams(layoutParams);
                this.f13864I.setLayoutParams(layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f13866K.getLayoutParams();
                layoutParams3.leftMargin = (((c - b) / 2) + b) - (this.f13865J.getArrowPairWidth() / 2);
                layoutParams3.bottomMargin = a - (this.f13866K.getArrowPairHeight() / 2);
                this.f13866K.setLayoutParams(layoutParams3);
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f13865J.getLayoutParams();
            layoutParams4.bottomMargin = (a + i) - (this.f13865J.getArrowPairHeight() / 2);
            layoutParams4.leftMargin = (((c - b) / 2) + b) - (this.f13865J.getArrowPairWidth() / 2);
            this.f13865J.setLayoutParams(layoutParams4);
        }
    }

    /* renamed from: v */
    private void m14231v() {
        m14207a(m14203E(), m14202D());
    }

    /* renamed from: a */
    private void m14207a(boolean z, boolean z2) {
        if (!m14205G()) {
            if (this.f13863H != null) {
                this.f13863H.setVisibility(0);
            }
            if (this.f13864I != null) {
                this.f13864I.setVisibility(0);
            }
        }
    }

    /* renamed from: w */
    private int m14232w() {
        return ((RelativeLayout.LayoutParams) this.f13869N.getLayoutParams()).height;
    }

    /* renamed from: x */
    private int m14233x() {
        return ((RelativeLayout.LayoutParams) this.f13869N.getLayoutParams()).width;
    }

    /* renamed from: a */
    public void mo10098a(boolean z) {
        this.f13877V = z;
    }

    /* renamed from: c */
    public boolean mo10101c() {
        return this.f13877V;
    }

    /* renamed from: d */
    public void mo10102d() {
        mo10093a(-1, -1);
    }

    /* renamed from: a */
    public void mo10093a(int i, int i2) {
        if (!this.f13874S) {
            if (Engine.getInstance().getIms().getWindow().getWindow().getDecorView().getWindowToken() == null) {
                this.f13878W.postDelayed(new C3010aX(this, i, i2), 0);
            } else {
                m14218d(i, i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14218d(int i, int i2) {
        this.f13874S = true;
        Engine.getInstance().setInputPaused(true);
        m14234y();
        m14212b(i, i2);
        try {
            this.f13857B.showAtLocation(Engine.getInstance().getIms().getWindow().getWindow().getDecorView(), 83, 0, C2835M.m13017a(Engine.getInstance().getWidgetManager().mo9648g()) - this.f13871P.mo9256n());
        } catch (RuntimeException e) {
        }
        m14220k();
        this.f13871P.mo9245c(false);
    }

    /* renamed from: y */
    private void m14234y() {
        if (Engine.getInstance().isHandwriteMaskVisible()) {
            Engine.getInstance().getHandWriteMaskManager().updateHandWriteMask(false);
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_hw_mask"), 0);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: e */
    public void mo10103e() {
        m14214b(true);
    }

    /* renamed from: b */
    private void m14214b(boolean z) {
        if (Engine.isInitialized()) {
            Engine.getInstance().setInputPaused(false);
        }
        if (this.f13874S) {
            if (!(this.f13857B == null || this.f13868M == null)) {
                this.f13868M.clearAnimation();
                if (!z || this.f13875T) {
                    m14199A();
                } else {
                    m14235z();
                }
            }
            m14221l();
            this.f13871P.mo9245c(true);
        }
    }

    /* renamed from: f */
    public void mo10104f() {
        m14214b(false);
        mo10092a();
    }

    /* renamed from: z */
    private void m14235z() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setAnimationListener(new C3011aY(this));
        this.f13868M.startAnimation(alphaAnimation);
        this.f13876U = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m14199A() {
        this.f13874S = false;
        this.f13875T = false;
        this.f13876U = false;
        if (this.f13857B != null) {
            try {
                this.f13857B.dismiss();
            } catch (Exception e) {
            }
        }
        if (this.f13868M != null) {
            this.f13868M.setEnabled(true);
        }
        m14200B();
    }

    /* renamed from: B */
    private void m14200B() {
        this.f13858C = null;
        this.f13859D = null;
        this.f13860E = null;
        this.f13861F = null;
        this.f13862G = null;
        this.f13863H = null;
        this.f13864I = null;
        this.f13865J = null;
        this.f13866K = null;
        this.f13870O = null;
        this.f13869N = null;
        this.f13868M = null;
        this.f13867L = null;
        this.f13857B = null;
    }

    /* renamed from: g */
    public boolean mo10105g() {
        return this.f13874S;
    }

    /* renamed from: h */
    public boolean mo10106h() {
        return !this.f13874S || this.f13876U;
    }

    /* renamed from: C */
    private void m14201C() {
        this.f13867L.setOnTouchListener(new C3070ba(this));
    }

    /* renamed from: i */
    public int mo10107i() {
        return this.f13885w;
    }

    /* renamed from: j */
    public int mo10108j() {
        if (Engine.getInstance().getIms().getResources().getConfiguration().orientation == 2) {
            return this.f13887y;
        }
        return this.f13886x;
    }

    /* renamed from: D */
    private boolean m14202D() {
        return this.f13880Y.mo10192c() == m14204F();
    }

    /* renamed from: E */
    private boolean m14203E() {
        return this.f13880Y.mo10190b() == 0;
    }

    /* renamed from: F */
    private int m14204F() {
        return this.f13888z;
    }

    /* renamed from: G */
    private boolean m14205G() {
        boolean z;
        if (Engine.getInstance().getIms().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f);
        if (z || equals) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public KeyboardMaskArrowPair mo10091a(int i) {
        if (i == 0) {
            return this.f13863H;
        }
        if (i == 1) {
            return this.f13864I;
        }
        if (i == 2) {
            return this.f13865J;
        }
        if (i == 3) {
            return this.f13866K;
        }
        return null;
    }

    /* renamed from: b */
    private void m14213b(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.f13869N != null) {
            int i7 = i6 - i4;
            int i8 = i5 - i3;
            int i9 = i - i5;
            int i10 = i2 - i6;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13869N.getLayoutParams();
            if (i8 >= 0) {
                layoutParams.width = i8;
            }
            if (i7 >= 0) {
                layoutParams.height = i7;
            }
            if (i3 >= 0) {
                layoutParams.leftMargin = i3;
            }
            if (i9 >= 0) {
                layoutParams.rightMargin = i9;
            }
            if (i10 >= 0) {
                layoutParams.bottomMargin = i10;
            }
            layoutParams.addRule(12);
            layoutParams.addRule(9);
            this.f13869N.setLayoutParams(layoutParams);
            mo10099b();
        }
    }

    /* renamed from: a */
    public void mo10096a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.f13857B != null) {
            m14213b(i, i2, i3, i4, i5, i6);
            mo10094a(i5 - i3, i6 - i4, i7);
            mo10099b();
        }
    }

    /* renamed from: a */
    public void mo10095a(int i, int i2, int i3, int i4, int i5, int i6) {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        C2826E ad = widgetManager.mo9630ad();
        Settings.getInstance().setBoolSetting(Settings.ONE_HANDED_LAYOUT, true);
        mo10094a(i5 - i3, i6 - i4, 4);
        ad.mo9236a((i6 - i4) - widgetManager.mo9651i().mo9718d(), i3, i - i5, i2 - i6);
        ad.mo9248f();
    }
}
