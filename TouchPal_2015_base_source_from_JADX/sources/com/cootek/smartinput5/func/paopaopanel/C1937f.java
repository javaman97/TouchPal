package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.SurfaceManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.nativeads.C1896t;
import com.cootek.smartinput5.func.nativeads.C1901x;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2759bj;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.p066ui.settings.C3007aV;
import com.cootek.smartinput5.presentations.C2515q;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.paopaopanel.f */
/* compiled from: PaoPaoDrawer */
public class C1937f extends PopupWindow implements C2515q.C2516a, FunctionBar.C2616a {

    /* renamed from: a */
    public static final String f6562a = "PaoPaoSettingDrawer";

    /* renamed from: b */
    public static boolean f6563b = false;

    /* renamed from: c */
    private static final float f6564c = 0.85f;

    /* renamed from: d */
    private static final float f6565d = 1.9f;

    /* renamed from: e */
    private static final double f6566e = 0.8d;

    /* renamed from: f */
    private static final int f6567f = 20;

    /* renamed from: g */
    private static final int f6568g = 25;

    /* renamed from: h */
    private static final int f6569h = 1000;

    /* renamed from: i */
    private Context f6570i;

    /* renamed from: j */
    private FrameLayout f6571j;

    /* renamed from: k */
    private FrameLayout f6572k;

    /* renamed from: l */
    private LinearLayout f6573l;

    /* renamed from: m */
    private View f6574m;

    /* renamed from: n */
    private boolean f6575n = false;

    /* renamed from: o */
    private C1947p f6576o;

    /* renamed from: p */
    private C1602bh f6577p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public View f6578q;

    /* renamed from: r */
    private Handler f6579r;

    /* renamed from: s */
    private float f6580s;

    /* renamed from: t */
    private float f6581t;

    public C1937f(Context context) {
        super(context);
        setBackgroundDrawable(new ColorDrawable(0));
        setTouchable(true);
        setOutsideTouchable(true);
        setTouchInterceptor(new C1938g(this));
        setOnDismissListener(new C1939h(this));
        this.f6570i = context;
        m8882p();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m8881o() {
        FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
        if (h == null) {
            return;
        }
        if (h.f11255a || h.f11256b) {
            h.mo8564v();
        }
    }

    /* renamed from: p */
    private void m8882p() {
        this.f6577p = C1368X.m6320c().mo5841n();
    }

    public void update() {
        setWidth(-1);
        setHeight(m8886t().mo9226A());
        if (this.f6571j == null) {
            this.f6571j = new FrameLayout(this.f6570i);
            this.f6571j.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.f6571j.setBackgroundColor(0);
            this.f6571j.setOnTouchListener(new C1940i(this));
        }
        m8884r();
        if (this.f6571j != null) {
            this.f6571j.removeAllViews();
        }
        this.f6571j.addView(this.f6572k);
        setContentView(this.f6571j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8878a(View view, MotionEvent motionEvent) {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager == null) {
            return false;
        }
        View b = widgetManager.mo9651i().mo9716b();
        if (motionEvent.getAction() == 0) {
            this.f6581t = motionEvent.getX();
            this.f6580s = motionEvent.getY();
        }
        Rect logoRect = widgetManager.mo9650h().getLogoRect();
        if (this.f6580s <= ((float) b.getHeight())) {
            if (this.f6581t < ((float) (logoRect.right + m8886t().mo9254l())) || mo7134i() || !f6563b || this.f6581t > ((float) (m8886t().mo9254l() + m8886t().mo9262t()))) {
                mo7136k();
                return true;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.offsetLocation((float) (-m8886t().mo9254l()), 0.0f);
            boolean dispatchTouchEvent = b.dispatchTouchEvent(obtain);
            obtain.recycle();
            return dispatchTouchEvent;
        } else if (this.f6581t <= ((float) this.f6576o.mo7154e()) && this.f6580s <= ((float) (b.getHeight() + this.f6576o.mo7153d())) && this.f6581t >= ((float) m8886t().mo9254l())) {
            return false;
        } else {
            mo7136k();
            return true;
        }
    }

    /* renamed from: q */
    private Drawable m8883q() {
        return this.f6577p.mo6249a((int) R.drawable.bg_drawer_ctrl);
    }

    /* renamed from: r */
    private void m8884r() {
        if (this.f6572k == null) {
            this.f6572k = new FrameLayout(this.f6570i);
            this.f6572k.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
            this.f6572k.setOnClickListener(new C1941j(this));
        }
        this.f6572k.setBackgroundDrawable(m8883q());
        this.f6572k.removeAllViews();
        if (this.f6576o == null) {
            this.f6576o = new C1947p(this.f6570i);
        }
        this.f6578q = this.f6576o.mo7150a();
        this.f6572k.addView(this.f6578q);
        m8889w();
    }

    /* renamed from: s */
    private View m8885s() {
        int a = mo7125a();
        TextView textView = new TextView(this.f6570i);
        int c = this.f6577p.mo6265c((int) R.dimen.drawer_pin_btn_frame_padding_left);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 51;
        textView.setLayoutParams(layoutParams);
        textView.setPadding(c, 0, 0, 0);
        textView.setTextColor(a);
        textView.setTextSize(0, (float) (((double) this.f6577p.mo6265c((int) R.dimen.plugin_panel_title_textsize)) * this.f6576o.mo7151b()));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(C1974m.m9063a(this.f6570i, (int) R.string.drawer_pin_tip_text));
        if (mo7134i()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        return textView;
    }

    /* renamed from: a */
    public int mo7125a() {
        return this.f6577p.mo6248a((int) R.color.plugin_widget_text_color, C2787cK.PLUGIN_WIDGET_TEXT);
    }

    /* renamed from: b */
    public int mo7127b() {
        return (int) (((float) m8886t().mo9262t()) * f6564c);
    }

    /* renamed from: c */
    public int mo7128c() {
        return (int) (((float) m8886t().mo9226A()) * f6565d);
    }

    /* renamed from: t */
    private C2826E m8886t() {
        return Engine.getInstance().getWidgetManager().mo9630ad();
    }

    /* renamed from: u */
    private DisplayMetrics m8887u() {
        return this.f6570i.getResources().getDisplayMetrics();
    }

    /* renamed from: d */
    public void mo7129d() {
    }

    /* renamed from: e */
    public void mo7130e() {
        SoftKeyboardView g;
        if (C2759bj.m12591b(this.f6570i) && !isShowing()) {
            C1896t.m8712a().mo7034a(C1901x.f6423a.mo7045a());
            update();
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (widgetManager != null && (g = widgetManager.mo9648g()) != null) {
                try {
                    showAtLocation(g, 83, 0, C2835M.m13017a(g) - m8886t().mo9256n());
                    m8888v();
                    m8890x();
                    if (this.f6576o.mo7155f() < 1) {
                        mo7126a(true);
                    }
                    Engine.getInstance().setInputPaused(true);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: v */
    private void m8888v() {
        FunctionBar h;
        if (!Settings.getInstance().getBoolSetting(Settings.PIN_MODE_ENTERED) && (h = Engine.getInstance().getWidgetManager().mo9650h()) != null) {
            f6563b = true;
            h.mo8536a(true, C1974m.m9063a(this.f6570i, (int) R.string.drawer_pin_guide_text), true, true, this);
        }
    }

    /* renamed from: w */
    private void m8889w() {
        Rect logoRect;
        FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
        if (h != null && (logoRect = h.getLogoRect()) != null) {
            int A = ((m8886t().mo9226A() - h.getHeight()) - this.f6576o.mo7153d()) - ((int) (25.0f * m8887u().density));
            this.f6571j.setPadding(((logoRect.right / 2) - ((int) (20.0f * m8887u().density))) + m8886t().mo9254l(), 0, 0, A);
        }
    }

    /* renamed from: f */
    public boolean mo7131f() {
        if (this.f6570i.getResources().getConfiguration().orientation == 1 && !Settings.getInstance().getBoolSetting(Settings.DRAWER_PIN_GUIDE_SHOWED) && this.f6576o.mo7158i() && Settings.getInstance().getIntSetting(Settings.PAOPAO_DRAWER_SHOW_TIMES) <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m8890x() {
        if (this.f6576o.mo7156g() > 0) {
            m8891y().postDelayed(new C1942k(this), 800);
        }
    }

    /* renamed from: y */
    private Handler m8891y() {
        if (this.f6579r == null) {
            this.f6579r = new Handler();
        }
        return this.f6579r;
    }

    /* renamed from: z */
    private int m8892z() {
        int identifier = this.f6570i.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return this.f6570i.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: g */
    public void mo7132g() {
        if (isShowing()) {
            try {
                dismiss();
            } catch (Exception e) {
            }
            if (this.f6571j != null) {
                m8875A();
            }
        }
    }

    /* renamed from: A */
    private void m8875A() {
        mo7126a(false);
        m8876B();
    }

    /* renamed from: h */
    public void mo7133h() {
        mo7126a(false);
        this.f6571j = null;
    }

    /* renamed from: i */
    public boolean mo7134i() {
        return this.f6575n;
    }

    /* renamed from: a */
    public void mo7126a(boolean z) {
        if (this.f6575n != z) {
            this.f6575n = z;
            mo7135j();
        }
    }

    /* renamed from: j */
    public void mo7135j() {
        FunctionBar h;
        if (this.f6576o != null) {
            this.f6576o.mo7152c();
            f6563b = false;
            m8884r();
            if (!Settings.getInstance().getBoolSetting(Settings.PIN_MODE_ENTERED) && (h = Engine.getInstance().getWidgetManager().mo9650h()) != null) {
                h.mo8564v();
            }
        }
    }

    /* renamed from: k */
    public void mo7136k() {
        if (mo7134i()) {
            mo7126a(!mo7134i());
        } else if (this.f6573l == null || !this.f6573l.isShown()) {
            mo7132g();
        } else {
            this.f6573l.setVisibility(8);
            if (this.f6574m != null && this.f6574m.isShown()) {
                this.f6574m.setVisibility(8);
            }
        }
    }

    /* renamed from: B */
    private void m8876B() {
        C2917du widgetManager;
        if (Engine.isInitialized() && (widgetManager = Engine.getInstance().getWidgetManager()) != null && widgetManager.mo9637b() != null) {
            if (widgetManager.mo9650h() != null) {
                widgetManager.mo9650h().mo8548k();
            }
            SoftKeyboardView g = widgetManager.mo9648g();
            if (g != null) {
                for (int i = 0; i < Engine.getInstance().getSurfaceExtraElementsCount(); i++) {
                    String surfaceExtraElement = Engine.getInstance().getSurfaceExtraElement(i);
                    if (surfaceExtraElement.startsWith(SurfaceManager.HAND_WRITE_HALF)) {
                        if (!C1368X.m6320c().mo5848u().mo5599c()) {
                            Engine.getInstance().getHandWriteMaskManager().showDownloadInfo();
                        } else if (!widgetManager.mo9599D().mo8604d()) {
                            widgetManager.mo9599D().setInputView(g);
                            widgetManager.mo9599D().mo8603c();
                        }
                    } else if (surfaceExtraElement.startsWith(SurfaceManager.HAND_WRITE_VIEW) && C1368X.m6320c().mo5848u().mo5599c() && !widgetManager.mo9598C().mo8631d()) {
                        widgetManager.mo9598C().setInputView(g);
                        widgetManager.mo9598C().mo8630c();
                    }
                }
                if (Engine.getInstance().isHandwriteMaskVisible()) {
                    Engine.getInstance().getHandWriteMaskManager().updateHandWriteMask(true);
                }
                C3007aV af = Engine.getInstance().getWidgetManager().mo9632af();
                if (af != null && af.mo10101c()) {
                    af.mo10098a(false);
                    af.mo10102d();
                }
                if (Engine.getInstance().isInputPaused()) {
                    Engine.getInstance().setInputPaused(false);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo7137l() {
        mo7132g();
    }

    /* renamed from: m */
    public void mo7138m() {
        if (this.f6573l != null && this.f6573l.isShown()) {
            this.f6573l.setVisibility(8);
        }
        if (this.f6574m != null && this.f6574m.isShown()) {
            this.f6574m.setVisibility(8);
        }
    }

    /* renamed from: n */
    public void mo7139n() {
        f6563b = false;
        Settings.getInstance().setBoolSetting(Settings.PIN_MODE_ENTERED, true);
    }
}
