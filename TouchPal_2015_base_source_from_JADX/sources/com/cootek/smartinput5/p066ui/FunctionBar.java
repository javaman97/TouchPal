package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.ToolbarToast;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1937f;
import com.cootek.smartinput5.func.yahoosearch.C2137q;
import com.cootek.smartinput5.p047c.C1199d;
import com.cootek.smartinput5.p066ui.C2934m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2854b;
import com.cootek.smartinput5.p066ui.control.ShortcutPluginScrollView;
import com.cootek.smartinput5.p066ui.settings.C3007aV;
import com.cootek.smartinput5.presentations.C2515q;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.cootek.smartinput5.ui.FunctionBar */
public class FunctionBar extends LinearLayout implements C2515q.C2516a, C2826E.C2827a, C2934m.C2935a, C3007aV.C3008a {

    /* renamed from: c */
    private static final String f11227c = "FunctionBar";

    /* renamed from: d */
    private static final int f11228d = 0;

    /* renamed from: e */
    private static final int f11229e = 1;

    /* renamed from: f */
    private static final int f11230f = 2;

    /* renamed from: g */
    private static final int f11231g = 500;

    /* renamed from: h */
    private static final int f11232h = 500;

    /* renamed from: i */
    private static final int f11233i = 300;

    /* renamed from: j */
    private static final int f11234j = 1000;

    /* renamed from: k */
    private static HashMap<String, Integer> f11235k = new HashMap<>();

    /* renamed from: A */
    private ArrayList<C1199d> f11236A;

    /* renamed from: B */
    private int f11237B;

    /* renamed from: C */
    private int f11238C;

    /* renamed from: D */
    private int f11239D = 1;

    /* renamed from: E */
    private boolean f11240E = false;

    /* renamed from: F */
    private boolean f11241F = true;

    /* renamed from: G */
    private C2699ak f11242G;

    /* renamed from: H */
    private int f11243H;

    /* renamed from: I */
    private int f11244I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C2767br f11245J;

    /* renamed from: K */
    private C2759bj f11246K;

    /* renamed from: L */
    private ViewGroup f11247L;

    /* renamed from: M */
    private Animation f11248M;

    /* renamed from: N */
    private boolean f11249N = false;

    /* renamed from: O */
    private boolean f11250O = false;

    /* renamed from: P */
    private C2854b f11251P;

    /* renamed from: Q */
    private String f11252Q;

    /* renamed from: R */
    private boolean f11253R = true;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f11254S = "";

    /* renamed from: a */
    public boolean f11255a = false;

    /* renamed from: b */
    public boolean f11256b;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View f11257l;

    /* renamed from: m */
    private View f11258m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f11259n;

    /* renamed from: o */
    private ImageView f11260o;

    /* renamed from: p */
    private ImageView f11261p;

    /* renamed from: q */
    private ImageView f11262q;

    /* renamed from: r */
    private View f11263r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View f11264s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public View f11265t;

    /* renamed from: u */
    private TextView f11266u;

    /* renamed from: v */
    private ImageView f11267v;

    /* renamed from: w */
    private LinearLayout f11268w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ShortcutPluginScrollView f11269x;

    /* renamed from: y */
    private C2826E f11270y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2616a f11271z;

    /* renamed from: com.cootek.smartinput5.ui.FunctionBar$a */
    public interface C2616a {
        /* renamed from: n */
        void mo7139n();
    }

    static {
        f11235k.put(C1549b.f4831b, Integer.valueOf(R.drawable.lng_btn_pinyin));
        f11235k.put(C1549b.f4835f, Integer.valueOf(R.drawable.lng_btn_handwrite));
        f11235k.put(C1549b.f4833d, Integer.valueOf(R.drawable.lng_btn_wubi));
        f11235k.put(C1549b.f4832c, Integer.valueOf(R.drawable.lng_btn_bihua));
        f11235k.put(C1549b.f4837h, Integer.valueOf(R.drawable.lng_btn_cangjie));
        f11235k.put(C1549b.f4834e, Integer.valueOf(R.drawable.lng_btn_zhuyin));
        f11235k.put(C1549b.f4813ai, Integer.valueOf(R.drawable.lng_btn_simplecangjie));
    }

    public FunctionBar(Context context) {
        super(context);
        setup(context);
    }

    public FunctionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup(context);
    }

    private void setup(Context context) {
        setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.function_bar, C2726bF.FUNCTION_BAR_BG));
        this.f11270y = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11270y.mo9238a((C2826E.C2827a) this);
        Engine.getInstance().getWidgetManager().mo9632af().mo10097a((C3007aV.C3008a) this);
        this.f11243H = getPaddingTop();
        this.f11244I = getPaddingBottom();
        this.f11245J = new C2767br(context);
        this.f11246K = new C2759bj(context);
        this.f11251P = new C2854b();
        this.f11248M = AnimationUtils.loadAnimation(context, R.anim.smiley_shake);
        this.f11248M.setAnimationListener(new C2700al(this));
    }

    /* renamed from: e */
    public void mo8540e() {
        if (C2515q.m11248a()) {
            C2515q.m11251b().mo8313a((C2515q.C2516a) this);
        }
        m11647C();
        m11670x();
        m11671y();
        m11672z();
    }

    /* renamed from: x */
    private void m11670x() {
        View f;
        C1602bh n = C1368X.m6320c().mo5841n();
        if (Engine.isInitialized()) {
            int n2 = Engine.getInstance().getWidgetManager().mo9651i().mo9728n();
            int m = Engine.getInstance().getWidgetManager().mo9651i().mo9727m();
            Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
            setPadding(0, this.f11243H, 0, this.f11244I);
            int i = (this.f11238C * 2) + this.f11237B;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.shortcut_plugin_frame);
            if (frameLayout != null) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            this.f11264s = (LinearLayout) findViewById(R.id.shortcut_plugin_bar);
            if (this.f11264s != null) {
                this.f11264s.setBackgroundDrawable(n.mo6250a((int) R.drawable.shortcut_bar_bg, C2726bF.FUNCTION_BAR_BG));
                this.f11264s.setPadding(0, 0, 0, 0);
                this.f11264s.getLayoutParams().height = (Engine.getInstance().getWidgetManager().mo9651i().mo9718d() - getPaddingTop()) - getPaddingBottom();
            }
            this.f11247L = (ViewGroup) findViewById(R.id.logo_frame);
            if (!(this.f11247L == null || this.f11246K == null || (f = this.f11246K.mo8981f()) == null)) {
                ViewParent parent = f.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(f);
                }
                f.setPadding(m, n2, this.f11238C - n.mo6265c((int) R.dimen.guidepoint_num_width), n2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.width = this.f11237B + this.f11238C + m;
                f.setLayoutParams(layoutParams);
                this.f11247L.addView(f);
                this.f11246K.mo8890d();
            }
            if (this.f11247L != null) {
                this.f11247L.setBackgroundDrawable(n.mo6250a((int) R.drawable.func_divider_line, C2726bF.FUNCTION_BAR_DIVIDER_LINE));
                this.f11247L.getLayoutParams().width = this.f11237B + this.f11238C + m;
                this.f11247L.setPadding(0, 0, 0, 0);
            }
            this.f11257l = findViewById(R.id.close_frame);
            if (this.f11257l != null) {
                this.f11257l.setBackgroundDrawable(n.mo6250a((int) R.drawable.func_divider_line_left, C2726bF.FUNCTION_BAR_DIVIDER_LINE));
                this.f11257l.getLayoutParams().width = this.f11237B + this.f11238C + m;
                this.f11257l.setPadding(this.f11238C, n2, m, n2);
                this.f11257l.setOnClickListener(new C2704ap(this));
            }
            this.f11259n = (ImageView) findViewById(R.id.show_emoji);
            if (this.f11259n != null) {
                this.f11259n.getLayoutParams().width = this.f11237B;
                this.f11259n.setImageDrawable(n.mo6250a((int) R.drawable.widget_func_smiley_ctrl, C2726bF.FUNCTION_BAR_SMILEY));
            }
            this.f11258m = findViewById(R.id.search_frame);
            if (this.f11258m != null) {
                this.f11258m.setBackgroundDrawable(n.mo6250a((int) R.drawable.func_divider_line_left, C2726bF.FUNCTION_BAR_DIVIDER_LINE));
                this.f11258m.getLayoutParams().width = this.f11237B + (this.f11238C * 2);
                this.f11258m.setPadding(0, 0, 0, 0);
                this.f11258m.setOnClickListener(new C2705aq(this));
                this.f11260o = (ImageView) findViewById(R.id.start_search);
                if (this.f11260o != null) {
                    this.f11260o.getLayoutParams().width = this.f11237B + (this.f11238C * 2);
                    this.f11260o.setBackgroundDrawable(n.mo6249a((int) R.drawable.bg_shortcut_item));
                    this.f11260o.setPadding(this.f11238C, n2, this.f11238C, n2);
                    this.f11260o.setImageDrawable(n.mo6250a((int) R.drawable.widget_func_search, C2726bF.PLUGIN_BAR));
                }
            }
            mo8547j();
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f11263r = findViewById(R.id.extral_btn_frame);
            if (this.f11263r != null) {
                this.f11263r.getLayoutParams().width = i;
                Drawable a = n.mo6250a((int) R.drawable.func_divider_line_left, C2726bF.FUNCTION_BAR_DIVIDER_LINE);
                this.f11263r.setBackgroundDrawable(a);
                a.getPadding(rect);
                this.f11263r.setPadding(0, 0, 0, 0);
                this.f11263r.setOnClickListener(new C2706ar(this));
            }
            int i2 = rect.left;
            int i3 = rect.right;
            int i4 = (((i - i2) - i3) - this.f11237B) / 2;
            int i5 = i2 + i4;
            int i6 = i3 + i4;
            this.f11262q = (ImageView) findViewById(R.id.language_btn_bg);
            if (this.f11262q != null) {
                this.f11262q.getLayoutParams().width = i;
                Drawable a2 = n.mo6249a((int) R.drawable.bg_shortcut_item);
                a2.getPadding(rect2);
                this.f11262q.setImageDrawable(a2);
                int i7 = rect.left - rect2.left;
                int i8 = rect.right - rect2.right;
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i8 < 0) {
                    i8 = 0;
                }
                this.f11262q.setPadding(i7, 0, i8, 0);
            }
            this.f11261p = (ImageView) findViewById(R.id.language_btn);
            if (this.f11261p != null) {
                this.f11261p.getLayoutParams().width = i;
                this.f11261p.setPadding(i5, n2, i6, n2);
            }
            mo8546i();
        }
    }

    /* renamed from: y */
    private void m11671y() {
        C1602bh n = C1368X.m6320c().mo5841n();
        this.f11265t = findViewById(R.id.tool_bar_presentation_layout);
        this.f11266u = (TextView) this.f11265t.findViewById(R.id.presentation_text);
        this.f11266u.setTextColor(n.mo6260b((int) R.color.candidate_normal));
        this.f11267v = (ImageView) this.f11265t.findViewById(R.id.presentation_close);
        this.f11267v.setImageDrawable(n.mo6249a((int) R.drawable.key_fun_backspace_clear));
        int paddingLeft = this.f11267v.getPaddingLeft();
        int paddingTop = this.f11267v.getPaddingTop();
        int paddingBottom = this.f11267v.getPaddingBottom();
        this.f11267v.setPadding(paddingLeft, paddingTop, Engine.getInstance().getWidgetManager().mo9651i().mo9728n(), paddingBottom);
    }

    /* renamed from: z */
    private void m11672z() {
        this.f11268w = (LinearLayout) findViewById(R.id.plugin_bar);
        this.f11269x = (ShortcutPluginScrollView) findViewById(R.id.function_scroll);
        mo8557q();
        mo8558r();
        getResources().getInteger(R.integer.shortcut_plugin_page_item_count);
    }

    /* renamed from: c */
    public void mo8538c() {
        this.f11239D = 2;
        mo8540e();
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        mo8542g();
        bringToFront();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m11645A() {
        if (this.f11241F) {
            if (this.f11242G == null) {
                this.f11242G = new C2699ak(getContext());
            }
            this.f11240E = !this.f11240E;
            if (this.f11240E) {
                mo8541f();
            } else {
                mo8542g();
            }
        }
    }

    /* renamed from: d */
    private void m11661d(boolean z) {
        if (this.f11261p == null || this.f11262q == null) {
            this.f11240E = false;
            return;
        }
        this.f11261p.setSelected(z);
        this.f11262q.setSelected(z);
        if (this.f11242G != null) {
            if (!z && this.f11242G.mo8957c()) {
                this.f11242G.mo8956b();
            } else if (z && !this.f11242G.mo8957c()) {
                this.f11242G.mo8954a();
            }
        }
        this.f11240E = z;
        mo8558r();
    }

    /* renamed from: f */
    public void mo8541f() {
        m11661d(true);
    }

    /* renamed from: g */
    public void mo8542g() {
        m11661d(false);
    }

    /* renamed from: h */
    public boolean mo8545h() {
        return this.f11240E;
    }

    public Rect getHandwriteRect() {
        Rect rect = new Rect();
        if (this.f11268w == null) {
            return rect;
        }
        if (this.f11245J != null) {
            int b = this.f11245J.mo9069b("hw_mask");
            Rect b2 = this.f11245J.mo9070b(b);
            this.f11269x.measure(0, 0);
            int width = (b - 2) * b2.width();
            if (width < 0) {
                width = 0;
            }
            this.f11269x.scrollTo(width, getScrollY());
            int left = ((((FrameLayout) findViewById(R.id.shortcut_plugin_frame)).getLeft() + this.f11269x.getLeft()) - width) + b2.left;
            int top = this.f11269x.getTop() + getPaddingTop();
            rect.left = left;
            rect.top = top;
            rect.right = left + b2.width();
            rect.bottom = b2.height() + top;
        }
        return rect;
    }

    public Rect getLogoRect() {
        Rect rect = new Rect();
        rect.set(this.f11247L.getLeft(), this.f11247L.getTop(), this.f11247L.getRight(), this.f11247L.getBottom());
        return rect;
    }

    /* renamed from: B */
    private void m11646B() {
        if (Engine.isInitialized()) {
            String currentLanguageId = Engine.getInstance().getCurrentLanguageId();
            if (f11235k.containsKey(currentLanguageId)) {
                Drawable a = C1368X.m6320c().mo5841n().mo6250a(f11235k.get(currentLanguageId).intValue(), C2726bF.PLUGIN_BAR);
                if (this.f11261p != null) {
                    this.f11261p.setImageDrawable(a);
                }
            }
        }
    }

    /* renamed from: C */
    private void m11647C() {
        this.f11237B = Engine.getInstance().getWidgetManager().mo9651i().mo9725k();
        this.f11238C = Engine.getInstance().getWidgetManager().mo9651i().mo9726l();
    }

    /* renamed from: i */
    public void mo8546i() {
        mo8535a(true);
    }

    /* renamed from: a */
    public void mo8535a(boolean z) {
        if (!C1389aD.m6470y(Engine.getInstance().getCurrentLanguageId()) || !z) {
            this.f11263r.setVisibility(8);
            return;
        }
        this.f11263r.setVisibility(0);
        m11646B();
    }

    /* renamed from: j */
    public void mo8547j() {
        mo8537b(true);
    }

    /* renamed from: b */
    public void mo8537b(boolean z) {
        if (this.f11258m != null) {
            if (!z || !C2137q.m9701d()) {
                this.f11258m.setVisibility(8);
            } else {
                this.f11258m.setVisibility(0);
            }
        }
    }

    /* renamed from: k */
    public void mo8548k() {
        mo8539c(true);
    }

    /* renamed from: c */
    public void mo8539c(boolean z) {
        if (this.f11246K != null && m11648D()) {
            this.f11246K.mo9037a(z);
        }
    }

    /* renamed from: D */
    private boolean m11648D() {
        if (Engine.isInitialized()) {
            return Engine.getInstance().getWidgetManager().mo9635ai();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager() == null) {
            try {
                super.onMeasure(i, i2);
            } catch (Exception e) {
            }
        } else {
            try {
                super.onMeasure(this.f11270y.mo9262t() | 1073741824, Engine.getInstance().getWidgetManager().mo9651i().mo9718d() | 1073741824);
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: l */
    public void mo8549l() {
        mo8542g();
        if (C2515q.m11248a()) {
            C2515q.m11251b().mo8315b((C2515q.C2516a) this);
        }
    }

    /* renamed from: m */
    public void mo8550m() {
        if (this.f11246K != null) {
            this.f11246K.mo7164b();
        }
    }

    /* renamed from: n */
    public void mo8551n() {
        if (this.f11246K != null) {
            this.f11246K.mo9039c();
        }
    }

    /* renamed from: o */
    public void mo8552o() {
        m11649E();
    }

    /* renamed from: E */
    private void m11649E() {
        this.f11239D = 2;
        mo8557q();
    }

    /* renamed from: p */
    public void mo8555p() {
        this.f11239D = 1;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            mo8564v();
        }
        super.onWindowVisibilityChanged(i);
    }

    /* renamed from: q */
    public void mo8557q() {
        m11663e(true);
        this.f11245J.mo9076i();
    }

    /* renamed from: e */
    private void m11663e(boolean z) {
        if (this.f11268w != null && this.f11264s != null && Engine.isInitialized() && Settings.isInitialized() && C1368X.m6324d()) {
            if (!Settings.getInstance().getBoolSetting(78)) {
                this.f11264s.setVisibility(4);
                this.f11239D = 1;
            } else {
                this.f11264s.setVisibility(0);
            }
            ToolbarToast toolbarToast = null;
            if (z && !C2564f.m11470c() && !C1368X.m6320c().mo5850w().mo8415d() && C2515q.m11248a()) {
                toolbarToast = C2515q.m11251b().mo8318d();
            }
            C1937f W = Engine.getInstance().getWidgetManager().mo9617W();
            if (this.f11255a && !W.mo7134i()) {
                this.f11265t.setVisibility(0);
                this.f11264s.setVisibility(8);
                this.f11266u.setVisibility(0);
                if (this.f11249N) {
                    this.f11257l.setVisibility(8);
                    m11665f(false);
                } else {
                    this.f11257l.setVisibility(0);
                    m11665f(true);
                }
                if (this.f11250O) {
                    this.f11267v.setVisibility(0);
                    this.f11267v.setOnClickListener(new C2707as(this));
                } else {
                    this.f11267v.setVisibility(8);
                }
                if (this.f11256b) {
                    this.f11251P.mo9498l(this.f11264s, 500, 0);
                    this.f11251P.mo9497k(this.f11265t, 500, 0);
                } else {
                    this.f11264s.setVisibility(8);
                    this.f11265t.setVisibility(0);
                }
            } else if (!PresentationManager.isToastExists(this.f11254S) && toolbarToast != null && !W.mo7134i()) {
                String id = toolbarToast.getId();
                this.f11254S = id;
                this.f11265t.setVisibility(0);
                this.f11264s.setVisibility(8);
                this.f11266u.setText(toolbarToast.getDisplay());
                this.f11252Q = this.f11266u.getText().toString();
                this.f11266u.setOnClickListener(new C2708at(this, id));
                if (toolbarToast.canShowClose()) {
                    this.f11267v.setVisibility(0);
                    this.f11267v.setOnClickListener(new C2709au(this, id));
                } else {
                    this.f11267v.setVisibility(8);
                }
                PresentationManager.shown(id);
            } else if (!PresentationManager.isToastExists(this.f11254S) || W.mo7134i()) {
                if (this.f11256b) {
                    this.f11251P.mo9498l(this.f11265t, 300, 0);
                    this.f11251P.mo9497k(this.f11264s, 300, 0);
                    this.f11256b = false;
                } else {
                    this.f11265t.setVisibility(8);
                    this.f11264s.setVisibility(0);
                    this.f11265t.clearAnimation();
                    this.f11264s.clearAnimation();
                }
                this.f11257l.setVisibility(0);
                m11665f(true);
            } else {
                if (!TextUtils.isEmpty(this.f11252Q)) {
                    this.f11266u.setText(this.f11252Q);
                    this.f11266u.setOnClickListener(new C2710av(this));
                    if (this.f11267v.getVisibility() == 0) {
                        this.f11267v.setOnClickListener(new C2711aw(this));
                    }
                }
                this.f11265t.setVisibility(0);
                this.f11264s.setVisibility(8);
                m11665f(true);
            }
            if (this.f11239D != 0) {
                ArrayList<C1199d> a = C1368X.m6320c().mo5837j().mo6047h().mo4466a();
                if (this.f11239D != 1 || !a.equals(this.f11236A)) {
                    this.f11239D = 0;
                    this.f11236A = a;
                    this.f11268w.removeAllViews();
                    this.f11245J.mo9067a(this.f11236A);
                    m11647C();
                    View a2 = this.f11245J.mo9063a(getContext(), this.f11237B + (this.f11238C * 2));
                    if (this.f11245J.mo9073f()) {
                        m11650F();
                    }
                    this.f11268w.addView(a2, new LinearLayout.LayoutParams(-2, -1));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m11665f(boolean z) {
        mo8535a(z);
        mo8537b(z);
        if (z && this.f11257l != null) {
            this.f11257l.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo8536a(boolean z, String str, boolean z2, boolean z3, C2616a aVar) {
        this.f11255a = true;
        this.f11249N = z;
        if (!TextUtils.isEmpty(str)) {
            this.f11266u.setText(str);
        }
        this.f11250O = z2;
        this.f11256b = z3;
        this.f11271z = aVar;
        if (this.f11256b) {
            setClickableOnAnim(false);
        }
        mo8557q();
    }

    /* renamed from: F */
    private void m11650F() {
        this.f11269x.post(new C2702an(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11652a(int i) {
        this.f11269x.postDelayed(new C2703ao(this, i), 1000);
    }

    /* renamed from: a */
    public void mo8534a(String str) {
        if (this.f11254S.equals(str)) {
            mo8555p();
            m11663e(false);
            this.f11254S = "";
        } else if (this.f11245J != null) {
            this.f11245J.mo9066a(str);
        }
    }

    /* renamed from: r */
    public void mo8558r() {
        if (this.f11245J != null) {
            this.f11245J.mo9064a();
        }
    }

    /* renamed from: s */
    public void mo8559s() {
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
    }

    public void setClickEnabled(boolean z) {
        this.f11241F = z;
        if (this.f11245J != null) {
            this.f11245J.mo9068a(z);
        }
        if (this.f11246K != null) {
            this.f11246K.mo9038b(z);
        }
    }

    /* renamed from: d */
    public void mo7129d() {
        if (this.f11246K != null) {
            this.f11246K.mo8982g();
        }
        if (this.f11245J != null) {
            this.f11245J.mo9072e();
        }
        m11649E();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11653a(int i, int i2, int i3) {
        if (this.f11269x != null) {
            this.f11269x.mo9386a(i, i2, i3);
        }
    }

    /* renamed from: a */
    public void mo8533a(Canvas canvas) {
        setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.function_bar, C2726bF.FUNCTION_BAR_BG));
        m11670x();
        this.f11246K.mo9040q_();
        this.f11245J.mo9067a(this.f11236A);
        super.draw(canvas);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m11651G() {
        if (this.f11259n != null && this.f11248M != null && !Settings.getInstance().getBoolSetting(Settings.EMOJI_SHAKE_SHOWN)) {
            this.f11259n.startAnimation(this.f11248M);
        }
    }

    /* renamed from: t */
    public void mo8562t() {
        mo8558r();
    }

    /* renamed from: u */
    public void mo8563u() {
        mo8558r();
    }

    /* renamed from: v */
    public void mo8564v() {
        this.f11271z = null;
        this.f11255a = false;
        this.f11249N = false;
        this.f11250O = false;
        mo8557q();
    }

    /* renamed from: w */
    public boolean mo8565w() {
        return this.f11253R;
    }

    public void setClickableOnAnim(boolean z) {
        this.f11253R = z;
    }
}
