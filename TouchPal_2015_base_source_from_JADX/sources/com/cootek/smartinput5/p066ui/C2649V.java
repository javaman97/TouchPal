package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p001v4.view.C0333F;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput.utilities.C0985B;
import com.cootek.smartinput.utilities.C0989E;
import com.cootek.smartinput5.engine.ClokeManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.V */
/* compiled from: ExplicitWidget */
public class C2649V implements ClokeManager.IClokeListener, ExplicitManager.IExplicitListener, C2826E.C2827a {

    /* renamed from: O */
    private static final int f11867O = 300;

    /* renamed from: a */
    public static final int f11868a = 0;

    /* renamed from: b */
    public static final int f11869b = 1;

    /* renamed from: c */
    public static final int f11870c = 2;

    /* renamed from: d */
    public static final int f11871d = 3;

    /* renamed from: f */
    private static final String f11872f = "ExplicitWidget";

    /* renamed from: A */
    private final LinearLayout.LayoutParams f11873A;

    /* renamed from: B */
    private int f11874B;

    /* renamed from: C */
    private int f11875C;

    /* renamed from: D */
    private int f11876D;

    /* renamed from: E */
    private int f11877E = 200;

    /* renamed from: F */
    private int f11878F;

    /* renamed from: G */
    private int f11879G = 0;

    /* renamed from: H */
    private int f11880H = 0;

    /* renamed from: I */
    private int f11881I;

    /* renamed from: J */
    private int f11882J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public int f11883K;

    /* renamed from: L */
    private long f11884L;

    /* renamed from: M */
    private boolean f11885M = true;

    /* renamed from: N */
    private int f11886N;

    /* renamed from: P */
    private Animation f11887P;

    /* renamed from: Q */
    private Animation f11888Q;

    /* renamed from: R */
    private Animation f11889R;

    /* renamed from: S */
    private AnimationDrawable f11890S;

    /* renamed from: T */
    private boolean f11891T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f11892U;

    /* renamed from: V */
    private Drawable f11893V = null;

    /* renamed from: W */
    private Drawable f11894W = null;

    /* renamed from: X */
    private Drawable f11895X = null;

    /* renamed from: Y */
    private Drawable f11896Y = null;

    /* renamed from: Z */
    private int f11897Z;

    /* renamed from: aa */
    private int f11898aa;

    /* renamed from: ab */
    private int f11899ab;

    /* renamed from: ac */
    private int f11900ac;

    /* renamed from: ad */
    private int f11901ad;

    /* renamed from: ae */
    private int f11902ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public Rect f11903af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public ArrayList<String> f11904ag;

    /* renamed from: ah */
    private Handler f11905ah = new Handler();

    /* renamed from: ai */
    private Runnable f11906ai = new C2651W(this);

    /* renamed from: aj */
    private Runnable f11907aj = new C2653Y(this);

    /* renamed from: ak */
    private Runnable f11908ak = new C2654Z(this);

    /* renamed from: al */
    private Runnable f11909al = new C2688aa(this);

    /* renamed from: am */
    private Runnable f11910am = new C2689ab(this);

    /* renamed from: an */
    private C2650a f11911an = new C2650a();

    /* renamed from: ao */
    private CharSequence f11912ao;

    /* renamed from: e */
    public boolean f11913e;

    /* renamed from: g */
    private PopupWindow f11914g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f11915h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public TextView f11916i;

    /* renamed from: j */
    private TextView f11917j;

    /* renamed from: k */
    private Integer f11918k;

    /* renamed from: l */
    private Drawable f11919l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ImageView f11920m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f11921n;

    /* renamed from: o */
    private FrameLayout f11922o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public LinearLayout f11923p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public LinearLayout f11924q;

    /* renamed from: r */
    private LinearLayout f11925r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View f11926s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2629P f11927t;

    /* renamed from: u */
    private C2826E f11928u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f11929v = true;

    /* renamed from: w */
    private boolean f11930w = true;

    /* renamed from: x */
    private String f11931x;

    /* renamed from: y */
    private String f11932y;

    /* renamed from: z */
    private String f11933z;

    public C2649V(Context context) {
        this.f11915h = context;
        this.f11928u = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11928u.mo9238a((C2826E.C2827a) this);
        this.f11875C = this.f11928u.mo9262t() - Engine.getInstance().getWidgetManager().mo9596A().getWidth();
        this.f11874B = context.getResources().getDimensionPixelSize(R.dimen.bihua_composition_height);
        this.f11876D = context.getResources().getDimensionPixelSize(R.dimen.bihua_composition_size);
        this.f11931x = C1974m.m9063a(context, (int) R.string.stroke_filter_prefix);
        this.f11932y = C1974m.m9063a(context, (int) R.string.signal_code_prefix);
        this.f11881I = context.getResources().getDimensionPixelOffset(R.dimen.explicit_text_padding_left);
        this.f11882J = context.getResources().getDimensionPixelOffset(R.dimen.explicit_text_padding_top);
        this.f11883K = context.getResources().getDimensionPixelOffset(R.dimen.explicit_clouding_icon_touch_rect_expand);
        this.f11873A = new LinearLayout.LayoutParams(-2, -2);
        this.f11885M = Settings.getInstance().getIntSetting(Settings.CLOKE_ENABLE_MODE) != 2;
        this.f11878F = this.f11877E + 300;
        this.f11887P = AnimationUtils.loadAnimation(this.f11915h, R.anim.explicit_zoom_in);
        this.f11888Q = AnimationUtils.loadAnimation(this.f11915h, R.anim.explicit_zoom_out);
        this.f11889R = AnimationUtils.loadAnimation(this.f11915h, R.anim.explicit_fade_in);
        this.f11891T = false;
        this.f11926s = LayoutInflater.from(context).inflate(R.layout.explicit, (ViewGroup) null);
        this.f11926s.setPadding(0, 0, 0, 0);
        this.f11916i = (TextView) this.f11926s.findViewById(R.id.explicit_text);
        this.f11917j = (TextView) this.f11926s.findViewById(R.id.explicit_cloud_text);
        this.f11920m = (ImageView) this.f11926s.findViewById(R.id.explicit_clouding_icon);
        this.f11921n = (ImageView) this.f11926s.findViewById(R.id.explicit_more_cloud_icon);
        this.f11922o = (FrameLayout) this.f11926s.findViewById(R.id.explicit_more_cloud_layout);
        this.f11923p = (LinearLayout) this.f11926s.findViewById(R.id.explicit_text_line);
        this.f11924q = (LinearLayout) this.f11926s.findViewById(R.id.explicit_exp_text_line);
        this.f11925r = (LinearLayout) this.f11926s.findViewById(R.id.explicit_bg_layout);
        this.f11892U = -1;
        this.f11916i.setTypeface(Typeface.DEFAULT_BOLD);
        this.f11918k = null;
        this.f11919l = null;
        this.f11904ag = new ArrayList<>();
        this.f11886N = 0;
        this.f11914g = new PopupWindow(context);
        this.f11914g.setWidth(this.f11875C);
        this.f11914g.setHeight(this.f11874B);
        this.f11914g.setContentView(this.f11926s);
        this.f11914g.setTouchable(true);
        this.f11914g.setBackgroundDrawable((Drawable) null);
        this.f11903af = new Rect();
        this.f11921n.setOnClickListener(new C2690ac(this));
        this.f11923p.setOnClickListener(new C2691ad(this));
        this.f11920m.setOnClickListener(new C2692ae(this));
        if (this.f11885M) {
            this.f11920m.setClickable(false);
            this.f11920m.setBackgroundResource(R.anim.explicit_clouding);
            this.f11890S = (AnimationDrawable) this.f11920m.getBackground();
        } else {
            this.f11920m.setClickable(true);
            this.f11920m.setBackgroundDrawable(m12270v());
        }
        this.f11897Z = this.f11924q.getPaddingLeft();
        this.f11898aa = this.f11924q.getPaddingRight();
        this.f11899ab = this.f11916i.getPaddingLeft();
        this.f11900ac = this.f11916i.getPaddingRight();
        this.f11901ad = this.f11917j.getPaddingLeft();
        this.f11902ae = this.f11917j.getPaddingRight();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m12246h() {
        if (this.f11892U == 0) {
            Engine.getInstance().updateInputOp(C1712h.f5603y);
        } else if (this.f11892U == 1) {
            Engine.getInstance().updateInputOp(C1712h.f5604z);
        }
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        int i = -1;
        if (charSequence.length() == 0) {
            mo8873a();
            this.f11912ao = "";
            C0989E.m5117a().mo4049c(this.f11911an);
            this.f11916i.setText("");
            this.f11933z = "";
            return;
        }
        this.f11905ah.removeCallbacks(this.f11910am);
        int length = explicitInfo.length();
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (explicitInfo.getType(i3) == 3) {
                i = explicitInfo.getEnd(i3);
                if (i2 < 0) {
                    i2 = explicitInfo.getBegin(i3);
                }
            }
        }
        if (i2 >= 0) {
            this.f11933z = charSequence.subSequence(i2, i).toString();
        } else {
            this.f11933z = "";
        }
        this.f11912ao = charSequence;
        if (length > 0 && explicitInfo.getType(length - 1) == 7) {
            int begin = explicitInfo.getBegin(length - 1);
            this.f11912ao = charSequence.subSequence(0, begin).toString() + this.f11931x + charSequence.subSequence(begin, charSequence.length()).toString();
        } else if (length > 0 && explicitInfo.getType(0) == 6) {
            this.f11912ao = this.f11932y + charSequence.subSequence(1, charSequence.length()).toString();
        }
        m12258n();
    }

    /* renamed from: a */
    public void mo8873a() {
        m12252k();
        this.f11929v = true;
        try {
            this.f11914g.dismiss();
        } catch (Exception e) {
        }
        this.f11930w = true;
        this.f11923p.setLayoutParams(this.f11873A);
    }

    /* renamed from: b */
    public void mo8875b() {
        SoftKeyboardView g;
        if (this.f11930w) {
            Engine.getInstance().getWidgetManager().mo9667x().mo9306a(true, true);
            this.f11930w = false;
        }
        if (!this.f11914g.isShowing() && (g = Engine.getInstance().getWidgetManager().mo9648g()) != null) {
            this.f11929v = false;
            if (g.getWindowToken() == null) {
                g.post(new C2693af(this));
            } else {
                m12248i();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m12248i() {
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        if (g != null && g.getWindowToken() != null) {
            try {
                this.f11914g.showAtLocation(g, 83, this.f11928u.mo9254l(), C2835M.m13018a(g, Engine.getInstance().getWidgetManager().mo9651i().mo9716b()));
            } catch (RuntimeException e) {
            }
        }
    }

    /* renamed from: c */
    public void mo8538c() {
        this.f11875C = this.f11928u.mo9262t() - Engine.getInstance().getWidgetManager().mo9596A().getWidth();
        this.f11914g.setWidth(this.f11875C);
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        m12249j();
    }

    /* renamed from: e */
    public int mo8876e() {
        return this.f11874B;
    }

    /* renamed from: j */
    private void m12249j() {
        if (this.f11914g.isShowing()) {
            this.f11914g.update(this.f11928u.mo9254l(), C2835M.m13018a(Engine.getInstance().getWidgetManager().mo9648g(), Engine.getInstance().getWidgetManager().mo9651i().mo9716b()), -1, -1, true);
        }
    }

    /* renamed from: k */
    private void m12252k() {
        this.f11905ah.removeCallbacks(this.f11907aj);
        this.f11905ah.removeCallbacks(this.f11908ak);
        this.f11905ah.removeCallbacks(this.f11906ai);
        if (this.f11927t != null) {
            this.f11927t.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m12253l() {
        this.f11891T = true;
        this.f11916i.setTextSize(0, (float) ((int) (((float) this.f11876D) * 0.7f)));
        this.f11916i.startAnimation(this.f11888Q);
        this.f11923p.setBackgroundDrawable(m12271w());
        this.f11923p.setClickable(true);
        this.f11923p.setPressed(false);
        this.f11925r.setBackgroundDrawable(m12272x());
        this.f11916i.setTextColor(m12274z());
        this.f11917j.setVisibility(0);
        this.f11917j.setTextColor(m12274z());
        this.f11917j.setText(this.f11933z + this.f11904ag.get(0));
        this.f11917j.setBackgroundDrawable(m12223B());
        this.f11901ad = this.f11917j.getPaddingLeft();
        this.f11902ae = this.f11917j.getPaddingRight();
        this.f11921n.clearAnimation();
        if (this.f11904ag.size() > 1) {
            this.f11922o.setVisibility(0);
            this.f11921n.setBackgroundDrawable(m12225D());
        }
        m12234a(false);
        m12260o();
    }

    /* renamed from: m */
    private boolean m12256m() {
        if (!this.f11891T) {
            return false;
        }
        this.f11891T = false;
        this.f11916i.setTextSize(0, (float) this.f11876D);
        this.f11916i.startAnimation(this.f11887P);
        this.f11916i.setTextColor(-1);
        this.f11923p.setBackgroundResource(R.drawable.bg_explicit_text);
        this.f11923p.setClickable(false);
        this.f11925r.setBackgroundDrawable((Drawable) null);
        this.f11917j.setVisibility(8);
        this.f11922o.setVisibility(8);
        this.f11921n.clearAnimation();
        m12234a(false);
        m12260o();
        return true;
    }

    /* renamed from: n */
    private void m12258n() {
        if (C0989E.m5117a().mo4047a(2)) {
            this.f11911an.f11935f = this.f11912ao == null ? "" : this.f11912ao.toString();
            C0989E.m5117a().mo4048b((C0985B) this.f11911an);
            return;
        }
        this.f11916i.setText(this.f11912ao);
        mo8875b();
        m12238c(m12261p());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m12260o() {
        m12238c(m12261p());
    }

    /* renamed from: b */
    private LinearLayout.LayoutParams m12235b(int i) {
        int i2 = this.f11875C;
        if (this.f11922o != null && this.f11922o.isShown()) {
            int q = m12263q();
            i2 -= q;
            i -= q;
        }
        if (i >= i2) {
            if (this.f11923p.getWidth() != i2) {
                return new LinearLayout.LayoutParams(i2, -2);
            }
            return null;
        } else if (this.f11923p.getLayoutParams().width != -2) {
            return this.f11873A;
        } else {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m12238c(int i) {
        LinearLayout.LayoutParams b = m12235b(i);
        if (!(b == null || this.f11923p == null)) {
            this.f11923p.setLayoutParams(b);
        }
        m12240d(i);
    }

    /* renamed from: d */
    private void m12240d(int i) {
        if (this.f11914g != null && this.f11914g.isShowing()) {
            int width = this.f11914g.getWidth();
            if (i <= this.f11875C / 3) {
                if (width > this.f11875C / 3) {
                    m12230a(this.f11875C / 3, this.f11874B);
                }
            } else if (i <= this.f11875C / 2) {
                if (width <= this.f11875C / 3 || width > this.f11875C / 2) {
                    m12230a(this.f11875C / 2, this.f11874B);
                }
            } else if (i <= (this.f11875C * 2) / 3) {
                if (width <= this.f11875C / 2 || width > (this.f11875C * 2) / 3) {
                    m12230a((this.f11875C * 2) / 3, this.f11874B);
                }
            } else if (i <= this.f11875C) {
                m12230a(i, this.f11874B);
            } else if (width != this.f11875C) {
                m12230a(this.f11875C, this.f11874B);
            }
        }
    }

    /* renamed from: a */
    private void m12230a(int i, int i2) {
        this.f11905ah.removeCallbacks(this.f11910am);
        try {
            this.f11914g.update(i, i2);
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: p */
    private int m12261p() {
        return m12228a(this.f11912ao);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m12228a(CharSequence charSequence) {
        this.f11923p.setPadding(this.f11881I, this.f11882J, this.f11881I, this.f11882J);
        int a = C2829G.m12928a((Paint) this.f11916i.getPaint(), charSequence) + this.f11897Z + this.f11898aa + this.f11899ab + this.f11900ac + (this.f11881I * 2);
        if (this.f11920m != null && this.f11920m.getVisibility() == 0) {
            a += m12265r();
        }
        if (!this.f11891T) {
            return a;
        }
        int a2 = this.f11901ad + this.f11902ae + (this.f11881I * 2) + C2829G.m12928a((Paint) this.f11917j.getPaint(), this.f11917j.getText());
        if (a2 > a) {
            a = a2;
        }
        return (this.f11922o == null || !this.f11922o.isShown()) ? a : a + m12263q();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12234a(boolean z) {
        if (!z || this.f11916i.getWidth() <= 0) {
            if (this.f11920m.getVisibility() == 0) {
                this.f11905ah.post(this.f11909al);
            }
            this.f11920m.clearAnimation();
            if (this.f11916i.getWidth() >= this.f11875C - m12265r()) {
                this.f11916i.setLayoutParams(this.f11873A);
                return;
            }
            return;
        }
        if (this.f11916i.getWidth() > this.f11875C - m12265r()) {
            this.f11916i.setLayoutParams(new LinearLayout.LayoutParams(this.f11875C - m12265r(), -2));
        }
        this.f11920m.startAnimation(this.f11889R);
        this.f11920m.setVisibility(0);
        this.f11926s.post(new C2652X(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public int m12263q() {
        if (this.f11879G == 0) {
            this.f11921n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), 0);
            this.f11879G = this.f11921n.getMeasuredWidth();
        }
        return this.f11879G;
    }

    /* renamed from: r */
    private int m12265r() {
        if (this.f11880H == 0) {
            this.f11920m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), 0);
            this.f11880H = this.f11920m.getMeasuredWidth();
        }
        return this.f11880H;
    }

    /* renamed from: s */
    private void m12267s() {
        if (!m12256m()) {
            m12234a(false);
        }
    }

    /* renamed from: t */
    private int m12268t() {
        if (this.f11892U == 1) {
            return 1;
        }
        return this.f11892U == 0 ? 4 : 0;
    }

    /* renamed from: a */
    public void mo8874a(int i) {
        this.f11886N = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClokeUpdated(boolean r7, com.cootek.smartinput5.engine.ClokeManager.IClokeProvider r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.m12269u()
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.net.n r0 = r0.mo5828N()
            r0.mo7991h()
            android.os.Handler r0 = r6.f11905ah
            java.lang.Runnable r1 = r6.f11906ai
            r0.removeCallbacks(r1)
            if (r7 == 0) goto L_0x0060
            r0 = 0
            java.util.ArrayList<java.lang.String> r1 = r6.f11904ag
            r1.clear()
            int r1 = r8.getProviderType()
            if (r1 != 0) goto L_0x0049
            r2 = 2
            r6.f11886N = r2
        L_0x002a:
            int r2 = r6.f11892U
            if (r2 == r1) goto L_0x0033
            r6.f11892U = r1
            r6.m12226E()
        L_0x0033:
            com.cootek.smartinput5.engine.CandidateItem r1 = r8.get(r0)
            if (r1 == 0) goto L_0x0050
            int r2 = r6.m12268t()
            if (r0 >= r2) goto L_0x0050
            java.util.ArrayList<java.lang.String> r2 = r6.f11904ag
            java.lang.String r1 = r1.word
            r2.add(r0, r1)
            int r0 = r0 + 1
            goto L_0x0033
        L_0x0049:
            r2 = 1
            if (r1 != r2) goto L_0x002a
            r2 = 3
            r6.f11886N = r2
            goto L_0x002a
        L_0x0050:
            if (r0 <= 0) goto L_0x005c
            android.os.Handler r1 = r6.f11905ah
            java.lang.Runnable r2 = r6.f11906ai
            int r3 = r6.f11878F
            long r4 = (long) r3
            r1.postDelayed(r2, r4)
        L_0x005c:
            r6.m12242e((int) r0)
            goto L_0x0006
        L_0x0060:
            r6.m12256m()
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.C2649V.onClokeUpdated(boolean, com.cootek.smartinput5.engine.ClokeManager$IClokeProvider, boolean):void");
    }

    /* renamed from: u */
    private boolean m12269u() {
        return this.f11886N == 0;
    }

    /* renamed from: e */
    private void m12242e(int i) {
        if (i <= 0) {
        }
    }

    public void onClokeSearchStart(boolean z) {
        m12252k();
        this.f11886N = 1;
        this.f11884L = System.currentTimeMillis();
        if (z) {
            try {
                if (!this.f11885M) {
                    this.f11885M = true;
                    this.f11920m.setClickable(false);
                    this.f11920m.setBackgroundResource(R.anim.explicit_clouding);
                    this.f11890S = (AnimationDrawable) this.f11920m.getBackground();
                }
                this.f11890S.start();
            } catch (Resources.NotFoundException e) {
            }
        } else if (this.f11885M) {
            this.f11885M = false;
            this.f11920m.setClickable(true);
            this.f11890S.stop();
            this.f11920m.setBackgroundDrawable(m12270v());
        }
        if (!this.f11920m.isShown()) {
            this.f11905ah.postDelayed(this.f11907aj, (long) this.f11877E);
        }
    }

    public void onClokeSearchEnd() {
        this.f11886N = 0;
        int currentTimeMillis = (int) (((long) this.f11877E) - (System.currentTimeMillis() - this.f11884L));
        if (currentTimeMillis <= -300) {
            this.f11878F = 0;
        } else {
            this.f11878F = currentTimeMillis + 300;
        }
        this.f11905ah.removeCallbacks(this.f11908ak);
        this.f11905ah.postDelayed(this.f11908ak, (long) this.f11878F);
    }

    public void onClokeStateRefresh() {
        m12252k();
        this.f11886N = 0;
        if (!m12256m()) {
            m12234a(false);
        }
    }

    /* renamed from: v */
    private Drawable m12270v() {
        if (this.f11896Y == null) {
            this.f11896Y = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.explicit_cloud_manual_icon);
        }
        return this.f11896Y;
    }

    /* renamed from: w */
    private Drawable m12271w() {
        if (this.f11893V == null) {
            this.f11893V = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_explicit_cloud_text_ctrl);
        }
        return this.f11893V;
    }

    /* renamed from: x */
    private Drawable m12272x() {
        if (this.f11894W == null) {
            m12273y();
        }
        return this.f11894W;
    }

    /* renamed from: y */
    private void m12273y() {
        C1602bh n = C1368X.m6320c().mo5841n();
        if (this.f11892U == 0) {
            this.f11894W = n.mo6249a((int) R.drawable.bg_explicit_cloud);
        } else if (this.f11892U == 1) {
            this.f11894W = n.mo6249a((int) R.drawable.bg_explicit_local_cloud);
        }
    }

    /* renamed from: z */
    private int m12274z() {
        if (this.f11918k == null) {
            m12222A();
        }
        return this.f11918k.intValue();
    }

    /* renamed from: A */
    private void m12222A() {
        this.f11918k = Integer.valueOf(this.f11892U == 1 ? -1 : C0333F.f835s);
    }

    /* renamed from: B */
    private Drawable m12223B() {
        if (this.f11919l == null) {
            m12224C();
        }
        return this.f11919l;
    }

    /* renamed from: C */
    private void m12224C() {
        this.f11919l = C1368X.m6320c().mo5841n().mo6249a(this.f11892U == 1 ? R.drawable.explicit_local_cloud_text_icon : R.drawable.explicit_cloud_text_icon);
    }

    /* renamed from: D */
    private Drawable m12225D() {
        if (this.f11895X == null) {
            this.f11895X = C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.explicit_cloud_more);
        }
        return this.f11895X;
    }

    /* renamed from: com.cootek.smartinput5.ui.V$a */
    /* compiled from: ExplicitWidget */
    public class C2650a extends C0985B {

        /* renamed from: e */
        int f11934e;

        /* renamed from: f */
        String f11935f = "";

        /* renamed from: g */
        String f11936g = "";

        public C2650a() {
            this.f2552b = 2;
        }

        /* renamed from: f */
        public void mo4035f() {
            this.f11934e = 0;
        }

        /* renamed from: c */
        public void mo4032c() {
            this.f11935f = "";
            super.mo4032c();
        }

        public void run() {
            synchronized (this) {
                this.f11936g = this.f11935f;
                this.f11934e = C2649V.this.m12228a((CharSequence) this.f11936g);
            }
        }

        /* renamed from: g */
        public void mo4036g() {
            if (!C2649V.this.f11913e && !mo4033d() && this.f11934e > 0 && this.f11936g.length() <= this.f11935f.length()) {
                synchronized (this) {
                    C2649V.this.f11916i.setText(this.f11936g);
                    C2649V.this.mo8875b();
                    C2649V.this.m12238c(this.f11934e);
                }
            }
        }
    }

    /* renamed from: f */
    public int mo8877f() {
        return this.f11892U;
    }

    /* renamed from: g */
    public int mo8878g() {
        return this.f11886N;
    }

    /* renamed from: E */
    private void m12226E() {
        m12222A();
        m12273y();
        m12224C();
    }
}
