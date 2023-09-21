package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1351J;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1584bI;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.smileypanel.SmileyScrollView;
import com.cootek.smartinput5.p045a.C1056a;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.CandidateBar;
import com.cootek.smartinput5.p066ui.FunctionBar;
import com.cootek.smartinput5.p066ui.HandWriteMaskView;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.ShadowView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.func.smileypanel.k */
/* compiled from: SmileyPanel */
public class C2061k implements SmileyScrollView.C2000a, HandWriteMaskView.C2620a {

    /* renamed from: a */
    public static int f8825a = 0;

    /* renamed from: b */
    public static int f8826b = 1;

    /* renamed from: c */
    public static int f8827c = 2;

    /* renamed from: d */
    private Context f8828d;

    /* renamed from: e */
    private SmileyScrollFrame f8829e;

    /* renamed from: f */
    private SmileyScrollView f8830f;

    /* renamed from: g */
    private boolean f8831g;

    /* renamed from: h */
    private boolean f8832h;

    /* renamed from: i */
    private boolean f8833i = true;

    /* renamed from: j */
    private int f8834j = 0;

    /* renamed from: k */
    private ShadowView f8835k;

    /* renamed from: l */
    private ShadowView f8836l;

    /* renamed from: m */
    private ShadowView f8837m;

    /* renamed from: n */
    private int f8838n;

    /* renamed from: o */
    private int f8839o = f8825a;

    /* renamed from: p */
    private boolean f8840p = false;

    /* renamed from: q */
    private ViewGroup f8841q;

    /* renamed from: r */
    private boolean f8842r = false;

    /* renamed from: s */
    private View f8843s = null;

    /* renamed from: t */
    private SoftKeyboardView f8844t = null;

    public C2061k(Context context) {
        this.f8828d = context;
    }

    /* renamed from: i */
    private boolean m9425i() {
        if (!Engine.isInitialized() || Engine.getInstance().getWidgetManager().mo9648g() == null || Engine.getInstance().getWidgetManager().mo9648g().getKeyboard() == null || C1549b.f4835f.equals(Engine.getInstance().getCurrentLanguageId())) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m9426j() {
        this.f8833i = true;
        if (this.f8829e != null) {
            if (this.f8829e.getParent() != null) {
                ((ViewGroup) this.f8829e.getParent()).removeView(this.f8829e);
            }
            this.f8829e = null;
        }
        m9437u();
        this.f8834j = 0;
        this.f8843s = null;
        this.f8830f = null;
        this.f8841q = null;
        this.f8844t = null;
        if (this.f8835k != null) {
            this.f8835k.mo9379a();
            this.f8835k = null;
        }
        if (this.f8836l != null) {
            this.f8836l.mo9379a();
            this.f8836l = null;
        }
        if (this.f8837m != null) {
            this.f8837m.mo9379a();
            this.f8837m = null;
        }
        C1351J.m6188a().mo5648f();
    }

    /* renamed from: a */
    public void mo7420a(boolean z) {
        mo7421a(z, true);
    }

    /* renamed from: a */
    public void mo7421a(boolean z, boolean z2) {
        if (this.f8839o != f8825a) {
            if (!z2 || !this.f8831g) {
                m9431o();
                return;
            }
            mo7431f();
            if (z && this.f8829e != null) {
                this.f8829e.mo7328a(0, z);
            }
        }
    }

    /* renamed from: b */
    public void mo7426b(boolean z) {
        this.f8833i = z;
    }

    /* renamed from: a */
    public boolean mo7422a() {
        return this.f8831g;
    }

    /* renamed from: b */
    public void mo7424b() {
        this.f8831g = m9425i();
        if (this.f8831g) {
            this.f8839o = f8826b;
            m9424d(this.f8833i);
        } else {
            this.f8839o = f8827c;
        }
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_EMOJI_IN_APP_TIP)) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_EMOJI_IN_APP_TIP, false);
        }
        Settings.getInstance().setIntSetting(Settings.ANDROID_VERSION, Integer.parseInt(Build.VERSION.SDK));
        Settings.getInstance().setBoolSetting(Settings.HAS_EMOJI_FONT, C1351J.m6188a().mo5653m());
        m9432p();
    }

    /* renamed from: d */
    private void m9424d(boolean z) {
        this.f8829e = m9428l();
        if (this.f8829e != null) {
            m9422b((View) this.f8829e);
            if (this.f8830f != null) {
                this.f8830f.setBottomHeight(this.f8838n);
            }
            this.f8829e.bringToFront();
            if (z) {
                this.f8829e.mo7328a(this.f8829e.getScrollHeight(), true);
            } else {
                m9433q();
            }
            this.f8829e.setOnScrollFinishedListener(this);
            return;
        }
        this.f8831g = false;
    }

    /* renamed from: k */
    private View m9427k() {
        int i;
        FunctionBar functionBar;
        View view;
        RelativeLayout relativeLayout = new RelativeLayout(this.f8828d);
        if (((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            View t = Engine.getInstance().getWidgetManager().mo9663t();
            if (t instanceof CandidateBar) {
                functionBar = Engine.getInstance().getWidgetManager().mo9650h();
            } else {
                functionBar = t;
            }
            int[] iArr = new int[2];
            if (functionBar == null) {
                return relativeLayout;
            }
            functionBar.getLocationOnScreen(iArr);
            this.f8834j = iArr[1];
            if (!this.f8840p) {
                this.f8835k = new ShadowView(this.f8828d);
                this.f8835k.mo9380a(functionBar);
                view = this.f8835k;
            } else {
                if (functionBar.getParent() != null) {
                    this.f8841q = (ViewGroup) functionBar.getParent();
                    ((ViewGroup) functionBar.getParent()).removeView(functionBar);
                    ((TouchPalIME) Engine.getInstance().getIms()).setForceRefreshCandidates(true);
                }
                this.f8842r = true;
                Engine.getInstance().getWidgetManager().mo9651i().mo9713a(true);
                view = functionBar;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(functionBar.getWidth(), functionBar.getHeight());
            layoutParams.topMargin = 0;
            relativeLayout.addView(view, layoutParams);
            i = functionBar.getHeight();
        } else {
            i = 0;
        }
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        this.f8844t = g;
        View view2 = (View) g.getParent();
        if (!this.f8840p) {
            this.f8836l = new ShadowView(this.f8828d);
            this.f8836l.mo9380a(view2);
            view2 = this.f8836l;
        } else if (view2.getParent() != null) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(g.getWidth(), g.getHeight());
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = 0;
        relativeLayout.addView(view2, layoutParams2);
        C1602bh n = C1368X.m6320c().mo5841n();
        if ((n.mo6298t() || n.mo6246C().f11468f) && (Engine.getInstance().getWidgetManager().mo9630ad().mo9266x() == 0 || Engine.getInstance().getWidgetManager().mo9630ad().mo9259q())) {
            relativeLayout.setBackgroundDrawable(n.mo6299u());
        } else {
            relativeLayout.setBackgroundDrawable((Drawable) null);
        }
        return relativeLayout;
    }

    /* renamed from: l */
    private SmileyScrollFrame m9428l() {
        this.f8843s = m9427k();
        return m9421a(this.f8843s);
    }

    /* renamed from: m */
    private Drawable m9429m() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        C1602bh n = C1368X.m6320c().mo5841n();
        if (n.mo6298t() || n.mo6246C().f11468f) {
            if (Engine.getInstance().getIms().isFullscreenMode()) {
                return Engine.getInstance().getIms().getWindow().findViewById(16908318).getBackground();
            }
            if (ad.mo9266x() == 0 || ad.mo9259q()) {
                return Engine.getInstance().getWidgetManager().mo9637b().getBackground();
            }
            return m9430n();
        } else if (Engine.getInstance().getIms().isFullscreenMode()) {
            return Engine.getInstance().getWidgetManager().mo9637b().getBackground();
        } else {
            return m9430n();
        }
    }

    /* renamed from: n */
    private Drawable m9430n() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        View c = ad.mo9232G().mo9221c();
        if (this.f8837m != null) {
            this.f8837m.mo9379a();
            this.f8837m = null;
        }
        this.f8837m = new ShadowView(this.f8828d);
        int A = ad.mo9226A() - ad.mo9256n();
        this.f8837m.mo9381a(c, ad.mo9254l(), 0, ad.mo9227B() - ad.mo9255m(), A);
        return new BitmapDrawable(this.f8828d.getResources(), this.f8837m.getBitmap());
    }

    /* renamed from: a */
    private SmileyScrollFrame m9421a(View view) {
        view.setBackgroundDrawable(m9429m());
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        view.measure(0, 0);
        if (view.getMeasuredHeight() == 0) {
            return null;
        }
        SmileyScrollFrame smileyScrollFrame = (SmileyScrollFrame) ((LayoutInflater) this.f8828d.getSystemService("layout_inflater")).inflate(R.layout.smiley_scroll_frame, (ViewGroup) null);
        smileyScrollFrame.mo7326a();
        ((FrameLayout) smileyScrollFrame.findViewById(R.id.shadow)).addView(view, new FrameLayout.LayoutParams(-1, view.getMeasuredHeight()));
        ((LinearLayout) smileyScrollFrame.findViewById(R.id.shadow_layout)).setLayoutParams(new RelativeLayout.LayoutParams(-1, view.getMeasuredHeight()));
        this.f8830f = (SmileyScrollView) smileyScrollFrame.findViewById(R.id.scroll_view);
        this.f8830f.setTotolHeight(view.getMeasuredHeight());
        if (this.f8830f == null) {
            return smileyScrollFrame;
        }
        this.f8830f.setFuncbarPositionY(this.f8834j);
        return smileyScrollFrame;
    }

    /* renamed from: b */
    private void m9422b(View view) {
        int i = 0;
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager != null && widgetManager.mo9643e() != null && widgetManager.mo9643e().getParent() != null) {
            if (this.f8843s != null) {
                this.f8843s.measure(0, 0);
                i = this.f8843s.getMeasuredHeight();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
            FrameLayout frameLayout = null;
            if (!(widgetManager == null || widgetManager.mo9643e() == null)) {
                frameLayout = (FrameLayout) widgetManager.mo9643e().getParent();
            }
            if (frameLayout != null) {
                frameLayout.addView(view, layoutParams);
            }
        }
    }

    /* renamed from: c */
    public int mo7427c() {
        return this.f8839o;
    }

    /* renamed from: d */
    public boolean mo7429d() {
        return this.f8839o == f8825a;
    }

    /* renamed from: o */
    private void m9431o() {
        this.f8839o = f8825a;
        this.f8840p = false;
        if (Engine.isInitialized()) {
            if (this.f8842r) {
                Engine.getInstance().getIms().setCandidatesViewShown(true);
                Engine.getInstance().getWidgetManager().mo9651i().mo9713a(false);
                if (this.f8841q != null) {
                    FunctionBar h = Engine.getInstance().getWidgetManager().mo9650h();
                    if (!(h == null || h.getParent() == null)) {
                        ((ViewGroup) h.getParent()).removeView(h);
                    }
                    this.f8841q.addView(h);
                }
            }
            SmileyListView r = Engine.getInstance().getWidgetManager().mo9661r();
            if (r != null) {
                r.mo7313a();
            }
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_sur_change_from_smiley"), 0);
            Engine.getInstance().processEvent();
            if (Engine.getInstance().getWidgetManager().mo9650h() != null) {
                Engine.getInstance().getWidgetManager().mo9650h().setClickEnabled(true);
            }
        }
        m9426j();
    }

    /* renamed from: c */
    private void m9423c(View view) {
        C1584bI.m7138a(Settings.EMOJI_SCREENSHOT, view);
    }

    /* renamed from: p */
    private void m9432p() {
        if (Engine.getInstance().getWidgetManager().mo9650h() != null) {
            Engine.getInstance().getWidgetManager().mo9650h().setClickEnabled(false);
        }
        C1351J.m6188a().mo5643c();
        Settings.getInstance().setIntSetting(Settings.EMOJI_VERSION, C1351J.m6188a().mo5649g(), false);
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_sur_change_to_smiley"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: e */
    public boolean mo7430e() {
        return this.f8829e != null && this.f8839o == f8826b;
    }

    /* renamed from: a */
    public boolean mo7423a(MotionEvent motionEvent) {
        return this.f8829e.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public void mo7425b(MotionEvent motionEvent) {
        mo7423a(motionEvent);
    }

    /* renamed from: q */
    private void m9433q() {
        HandWriteMaskView e;
        if (Engine.isInitialized() && (e = Engine.getInstance().getWidgetManager().mo9644e(false)) != null && e.mo8623g()) {
            this.f8832h = true;
            e.mo8620a((HandWriteMaskView.C2620a) this);
        }
    }

    /* renamed from: r */
    private void m9434r() {
        HandWriteMaskView e;
        if (this.f8832h && Engine.isInitialized() && (e = Engine.getInstance().getWidgetManager().mo9644e(false)) != null && e.mo8623g()) {
            this.f8832h = false;
            e.mo8621b((HandWriteMaskView.C2620a) this);
        }
    }

    /* renamed from: s */
    private void m9435s() {
        if (Settings.getInstance().getBoolSetting(Settings.ADVANCED_VIBRATION)) {
            C1368X.m6320c().mo5852y().mo6379a(false);
        }
    }

    /* renamed from: t */
    private void m9436t() {
        if (this.f8829e != null) {
            this.f8829e.setVisibility(8);
        }
    }

    /* renamed from: f */
    public void mo7431f() {
        if (this.f8829e != null && this.f8839o != f8825a) {
            this.f8829e.setVisibility(0);
            this.f8839o = f8826b;
        }
    }

    /* renamed from: u */
    private void m9437u() {
        if (this.f8844t != null) {
            this.f8844t.mo8733b();
        }
    }

    /* renamed from: g */
    public void mo7343g() {
        this.f8839o = f8827c;
        this.f8838n = 0;
        m9436t();
        m9434r();
        m9435s();
        m9437u();
        C1056a.m5588a().mo4264a(C1056a.f2958S, this.f8828d);
    }

    /* renamed from: h */
    public void mo7344h() {
        m9436t();
        this.f8838n = 0;
        m9431o();
        m9434r();
        m9435s();
    }

    /* renamed from: c */
    public void mo7428c(boolean z) {
        this.f8840p = z;
    }

    /* renamed from: a */
    public void mo7419a(int i) {
        this.f8838n = i;
    }
}
