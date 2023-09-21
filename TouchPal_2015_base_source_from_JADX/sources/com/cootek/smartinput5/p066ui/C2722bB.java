package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.ExplicitInfo;
import com.cootek.smartinput5.engine.ExplicitManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.bB */
/* compiled from: PopupRevert */
public class C2722bB extends PopupWindow implements ExplicitManager.IExplicitListener, C2826E.C2827a {

    /* renamed from: a */
    private View f12154a;

    /* renamed from: b */
    private FrameLayout f12155b;

    /* renamed from: c */
    private int f12156c;

    /* renamed from: d */
    private C2826E f12157d = Engine.getInstance().getWidgetManager().mo9630ad();

    public C2722bB(Context context) {
        super(context);
        this.f12157d.mo9238a((C2826E.C2827a) this);
        setBackgroundDrawable((Drawable) null);
        this.f12154a = new View(context);
        this.f12154a.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.candidate_revert, C2726bF.POPUP_REVERT));
        m12499a();
        this.f12154a.setOnTouchListener(new C2723bC(this));
        this.f12155b = new FrameLayout(context);
        this.f12155b.addView(this.f12154a);
        setContentView(this.f12155b);
    }

    /* renamed from: a */
    private void m12499a() {
        int d = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        setWidth(d);
        setHeight(d);
        this.f12156c = d;
        this.f12154a.setMinimumHeight(d);
        this.f12154a.setMinimumHeight(d);
    }

    public void onTextUpdated(CharSequence charSequence, ExplicitInfo explicitInfo) {
        if (Engine.getInstance().getExplicitInfo().needRevert() || Engine.getInstance().getInlineInfo().needRevert()) {
            SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
            if (g != null && g.getWindowToken() != null && !isShowing()) {
                Engine.getInstance().getWidgetManager().mo9667x().mo9305a(true);
                try {
                    showAtLocation(g, 85, Engine.getInstance().getWidgetManager().mo9630ad().mo9255m(), C2835M.m13018a(g, Engine.getInstance().getWidgetManager().mo9651i().mo9716b()));
                } catch (RuntimeException e) {
                }
            }
        } else {
            dismiss();
        }
    }

    /* renamed from: c */
    public void mo8538c() {
        m12499a();
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        m12500b();
    }

    /* renamed from: b */
    private void m12500b() {
        if (isShowing()) {
            update(Engine.getInstance().getWidgetManager().mo9630ad().mo9255m(), C2835M.m13018a(Engine.getInstance().getWidgetManager().mo9648g(), Engine.getInstance().getWidgetManager().mo9651i().mo9716b()), -1, -1, true);
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
