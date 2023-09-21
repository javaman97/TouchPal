package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.p066ui.settings.MarqueeTextView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ds */
/* compiled from: WaveTipsPopup */
public class C2915ds {

    /* renamed from: a */
    private static final String f13146a = "WaveTipsPopup";

    /* renamed from: c */
    private static final int f13147c = 0;

    /* renamed from: d */
    private static final int f13148d = 1;

    /* renamed from: e */
    private static final int f13149e = 2;

    /* renamed from: f */
    private static final int f13150f = 3;

    /* renamed from: b */
    private Context f13151b;

    /* renamed from: g */
    private int f13152g = 0;

    /* renamed from: h */
    private PopupWindow f13153h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MarqueeTextView f13154i;

    /* renamed from: j */
    private int f13155j;

    /* renamed from: k */
    private int f13156k;

    public C2915ds(Context context) {
        this.f13151b = context;
        this.f13155j = (int) (((double) Engine.getInstance().getWidgetManager().mo9651i().mo9718d()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9251i());
        this.f13156k = Engine.getInstance().getWidgetManager().mo9648g().getHeight() + Engine.getInstance().getWidgetManager().mo9630ad().mo9256n();
        this.f13153h = new PopupWindow(context);
        this.f13153h.setBackgroundDrawable(new ColorDrawable(0));
        this.f13153h.setTouchable(true);
        this.f13153h.setWidth(-1);
        this.f13153h.setHeight(-2);
        this.f13153h.setAnimationStyle(R.style.SlideSentencePopupAnimation);
        this.f13153h.setOnDismissListener(new C2916dt(this));
        this.f13154i = new MarqueeTextView(context);
        m13383h();
        this.f13154i.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f13155j));
        this.f13154i.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f13154i.setSingleLine(true);
        this.f13154i.setTextSize(0, (float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.candidate_textsize));
        this.f13154i.setTypeface(C1624bv.m7418a());
        this.f13154i.setTextColor(Color.parseColor("#097cc2"));
        this.f13154i.setGravity(17);
        this.f13154i.setPadding(10, 5, 10, 5);
        this.f13153h.setHeight(this.f13155j);
        this.f13153h.setContentView(this.f13154i);
    }

    /* renamed from: h */
    private void m13383h() {
        this.f13154i.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_slidesentence_popup));
    }

    /* renamed from: i */
    private void m13384i() {
        this.f13154i.setBackgroundColor(Color.parseColor("#d8000000"));
    }

    /* renamed from: a */
    public boolean mo9588a() {
        return this.f13153h.isShowing();
    }

    /* renamed from: j */
    private void m13385j() {
        if (this.f13153h.isShowing()) {
            this.f13153h.update();
            return;
        }
        SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
        if (g != null && g.getWindowToken() != null) {
            this.f13156k = g.getHeight() + C2835M.m13017a(g);
            try {
                this.f13153h.showAtLocation(g, 81, 0, this.f13156k);
            } catch (RuntimeException e) {
            }
        }
    }

    /* renamed from: b */
    public void mo9589b() {
        this.f13152g = 0;
        try {
            this.f13153h.dismiss();
        } catch (Exception e) {
        }
    }

    /* renamed from: c */
    public void mo9590c() {
        if (this.f13152g == 3) {
            mo9589b();
        }
    }

    /* renamed from: b */
    private void m13382b(String str) {
        if (this.f13152g == 3) {
            m13384i();
        } else {
            m13383h();
        }
        this.f13154i.setText(str);
        m13385j();
    }

    /* renamed from: a */
    public void mo9587a(String str) {
        this.f13152g = 1;
        m13382b(String.format(C1974m.m9063a(this.f13151b, (int) R.string.wave_tips_slide_down_popup), new Object[]{str}));
    }

    /* renamed from: d */
    public void mo9591d() {
        if (this.f13152g != 2) {
            this.f13152g = 2;
            m13382b(C1974m.m9063a(this.f13151b, (int) R.string.wave_tips_continue_slide));
        }
    }

    /* renamed from: e */
    public void mo9592e() {
        if (this.f13152g == 0) {
            this.f13152g = 3;
            m13382b("");
        }
    }

    /* renamed from: f */
    public boolean mo9593f() {
        return this.f13153h.isShowing() && this.f13152g == 1;
    }

    /* renamed from: g */
    public boolean mo9594g() {
        return this.f13153h.isShowing() && this.f13152g == 2;
    }
}
