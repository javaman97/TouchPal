package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.p047c.C1194T;
import com.cootek.smartinput5.p066ui.C2726bF;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.h */
/* compiled from: CommaPopup */
public class C2863h {

    /* renamed from: a */
    private Context f13045a;

    /* renamed from: b */
    private PopupWindow f13046b;

    /* renamed from: c */
    private C1602bh f13047c = C1368X.m6320c().mo5841n();

    /* renamed from: d */
    private FrameLayout f13048d;

    /* renamed from: e */
    private LinearLayout f13049e;

    /* renamed from: f */
    private C2806cb f13050f;

    /* renamed from: g */
    private Handler f13051g = new Handler();

    /* renamed from: h */
    private LinearLayout f13052h;

    public C2863h(Context context) {
        this.f13045a = context;
        m13255d();
    }

    /* renamed from: d */
    private void m13255d() {
        this.f13048d = (FrameLayout) ((LayoutInflater) this.f13045a.getSystemService("layout_inflater")).inflate(R.layout.comma_popup, (ViewGroup) null);
        if (this.f13048d != null) {
            this.f13046b = new PopupWindow(this.f13048d, -1, mo9513b().mo9226A());
            this.f13046b.setBackgroundDrawable(new ColorDrawable(0));
            this.f13046b.setTouchable(true);
            this.f13046b.setOutsideTouchable(true);
            this.f13046b.setTouchInterceptor(new C2864i(this));
            this.f13048d.setOnClickListener(new C2865j(this));
        }
    }

    /* renamed from: a */
    public void mo9512a(C2806cb cbVar) {
        this.f13050f = cbVar;
        m13257f();
        m13256e();
    }

    /* renamed from: e */
    private void m13256e() {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        widgetManager.mo9667x().mo9305a(true);
        SoftKeyboardView g = widgetManager.mo9648g();
        try {
            this.f13046b.showAtLocation(g, 83, 0, C2835M.m13017a(g) - mo9513b().mo9256n());
        } catch (Exception e) {
        }
    }

    /* renamed from: f */
    private void m13257f() {
        this.f13049e = (LinearLayout) this.f13048d.findViewById(R.id.comma_popup_content_panel);
        this.f13049e.setBackgroundDrawable(this.f13047c.mo6249a((int) R.drawable.bg_popup_preview_ctrl));
        this.f13052h = (LinearLayout) this.f13048d.findViewById(R.id.prediction_popup_panel);
        this.f13052h.setOnClickListener(new C2866k(this));
        ((Button) this.f13048d.findViewById(R.id.prediction_button)).setOnClickListener(new C2867l(this));
        m13259h();
        m13261j();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m13258g() {
        C1194T.m5771a(C2717b.PLUGIN_PREDICTION.toString()).mo4453a(this.f13045a);
        m13252a((Button) this.f13048d.findViewById(R.id.prediction_button));
        this.f13051g.postDelayed(new C2868m(this), 300);
    }

    /* renamed from: h */
    private void m13259h() {
        int t;
        if (this.f13050f != null) {
            if (m13260i()) {
                t = mo9513b().mo9262t() / 10;
            } else {
                t = mo9513b().mo9262t() / 36;
            }
            this.f13048d.setPadding(t + mo9513b().mo9254l(), 0, 0, mo9513b().mo9256n() + this.f13050f.height);
        }
    }

    /* renamed from: i */
    private boolean m13260i() {
        return this.f13045a.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: j */
    private void m13261j() {
        ((TextView) this.f13048d.findViewById(R.id.prediction_popup_text)).setTextColor(this.f13047c.mo6248a((int) R.color.popup_extend_key_default_color, C2787cK.POPUP_TEXT));
        m13252a((Button) this.f13048d.findViewById(R.id.prediction_button));
    }

    /* renamed from: a */
    private void m13252a(Button button) {
        Drawable a;
        if (Settings.getInstance().getBoolSetting(1)) {
            a = this.f13047c.mo6250a((int) R.drawable.prediction_popup_switch_on, C2726bF.COMMA_POPUP_ICON_HIGHLIGHT);
        } else {
            a = this.f13047c.mo6250a((int) R.drawable.prediction_popup_switch_off, C2726bF.COMMA_POPUP_ICON_NORMAL);
            a.setAlpha(128);
        }
        button.setBackgroundDrawable(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m13262k() {
        mo9511a();
    }

    /* renamed from: a */
    public void mo9511a() {
        if (this.f13046b != null && this.f13046b.isShowing()) {
            this.f13046b.dismiss();
        }
    }

    /* renamed from: b */
    public C2826E mo9513b() {
        return Engine.getInstance().getWidgetManager().mo9630ad();
    }

    /* renamed from: c */
    public boolean mo9514c() {
        if (this.f13046b == null || !this.f13046b.isShowing()) {
            return false;
        }
        return true;
    }
}
