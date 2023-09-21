package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.p068b.C2716a;
import com.cootek.smartinput5.p066ui.p068b.C2717b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.bj */
/* compiled from: LogoItem */
public class C2759bj extends C2716a {

    /* renamed from: a */
    private View f12314a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f12315b;

    /* renamed from: c */
    private ViewGroup f12316c;

    /* renamed from: d */
    private TextView f12317d;

    /* renamed from: e */
    private Drawable f12318e;

    /* renamed from: f */
    private Animation f12319f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12320g = true;

    public C2759bj(Context context) {
        super(context, C2717b.LOGO_FUNC_BAR.toString());
    }

    /* renamed from: a */
    public void mo9037a(boolean z) {
        if (this.f12315b != null) {
            mo8982g();
            if (z) {
                this.f12315b.setVisibility(0);
                m12599p();
                return;
            }
            this.f12315b.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo9038b(boolean z) {
        this.f12320g = z;
    }

    /* renamed from: f_ */
    public void mo7123f_() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7113a(Context context) {
        this.f12314a = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.logo_frame, (ViewGroup) null);
        this.f12315b = (ImageView) this.f12314a.findViewById(R.id.logo_img);
        this.f12316c = (ViewGroup) this.f12314a.findViewById(R.id.tag_frame);
        this.f12317d = (TextView) this.f12314a.findViewById(R.id.number_text);
        m12596m();
        return this.f12314a;
    }

    /* renamed from: b */
    public static boolean m12591b(Context context) {
        return C1132b.m5654a(context).mo4392a(C1135d.LOGO_CLICK_ENABLE, (Boolean) true).booleanValue();
    }

    /* renamed from: m */
    private void m12596m() {
        if (this.f12314a == null) {
            return;
        }
        if (!m12591b(mo8985j())) {
            this.f12314a.setEnabled(false);
        } else {
            this.f12314a.setOnTouchListener(new C2760bk(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m12597n() {
        Engine.getInstance().fireLuaCallOperation(Engine.LUA_CALL_COMMIT_INPUT);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    public void mo7164b() {
        if (C1132b.m5654a(mo8985j()).mo4392a(C1135d.PAOPAO_ANIMATION_CAN_SHOW, (Boolean) true).booleanValue() && this.f12315b != null && this.f12315b.getVisibility() == 0) {
            if (this.f12319f == null) {
                this.f12319f = m12598o();
            }
            this.f12315b.startAnimation(this.f12319f);
        }
    }

    /* renamed from: c */
    public void mo9039c() {
        if (this.f12315b != null) {
            this.f12315b.clearAnimation();
        }
    }

    /* renamed from: o */
    private Animation m12598o() {
        Animation loadAnimation = AnimationUtils.loadAnimation(mo8985j(), R.anim.paopao_alarm);
        loadAnimation.setAnimationListener(new C2761bl(this));
        return loadAnimation;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m12599p() {
        if (this.f12318e == null) {
            mo9040q_();
        } else {
            this.f12315b.setImageDrawable(this.f12318e);
        }
    }

    /* renamed from: a */
    private void m12586a(int i, int i2) {
        if (C1368X.m6324d()) {
            m12587a(C1368X.m6320c().mo5841n().mo6250a(i, C2726bF.FUNCTION_BAR_LOGO), i2);
        }
    }

    /* renamed from: a */
    private void m12587a(Drawable drawable, int i) {
        String str = null;
        if (i > 0) {
            str = String.valueOf(i);
        }
        m12588a(drawable, str);
    }

    /* renamed from: a */
    private void m12588a(Drawable drawable, String str) {
        if (this.f12316c != null) {
            this.f12316c.setBackgroundDrawable(drawable);
        }
        if (this.f12317d == null) {
            return;
        }
        if (str == null || !m12591b(mo8985j())) {
            this.f12317d.setVisibility(8);
            return;
        }
        mo8976a(this.f12317d, str);
        this.f12317d.setText(str);
        this.f12317d.setVisibility(0);
    }

    /* renamed from: q_ */
    public void mo9040q_() {
        this.f12318e = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.widget_func_logo_ctrl, C2726bF.FUNCTION_BAR_LOGO);
        this.f12315b.setImageDrawable(this.f12318e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7117a(Context context, View view) {
        m12586a((int) R.drawable.new_tag, 0);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo7122d(Context context, View view) {
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo7120b(Context context, View view) {
        m12588a((Drawable) null, (String) null);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public View mo7121c(Context context, View view) {
        m12588a((Drawable) null, "");
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7116a(Context context, int i, View view) {
        m12587a((Drawable) null, i);
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7118a(Context context, View view, boolean z) {
        return view;
    }
}
