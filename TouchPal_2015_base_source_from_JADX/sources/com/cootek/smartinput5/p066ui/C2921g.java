package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.ui.g */
/* compiled from: AnimTextPopupWindow */
public class C2921g extends PopupWindow {

    /* renamed from: a */
    public int f13219a;

    /* renamed from: b */
    private int f13220b;

    /* renamed from: c */
    private int f13221c;

    /* renamed from: d */
    private TextView f13222d = new TextView(this.f13223e);

    /* renamed from: e */
    private Context f13223e;

    public C2921g(Context context, int i, int i2) {
        super(context);
        this.f13223e = context;
        mo9680a(i2);
        setBackgroundDrawable((Drawable) null);
        setWidth(-2);
        setHeight(-2);
        setTouchable(false);
        setAnimationStyle(i);
        this.f13222d.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f13222d.setGravity(17);
        this.f13222d.setBackgroundColor(0);
        setContentView(this.f13222d);
    }

    /* renamed from: a */
    public void mo9680a(int i) {
        this.f13219a = i;
    }

    /* renamed from: a */
    public TextView mo9679a() {
        return this.f13222d;
    }

    /* renamed from: a */
    public void mo9681a(int i, int i2, View view) {
        this.f13220b = i;
        this.f13221c = i2;
        int l = Engine.getInstance().getWidgetManager().mo9630ad().mo9254l() + this.f13220b;
        int i3 = this.f13221c;
        if (Engine.getInstance().getIms().isFullscreenMode()) {
            SoftKeyboardView g = Engine.getInstance().getWidgetManager().mo9648g();
            if (g != null && g.getWindowToken() != null) {
                i3 = (Engine.getInstance().getWidgetManager().mo9637b().getHeight() - ((g.getHeight() + Engine.getInstance().getWidgetManager().mo9630ad().mo9256n()) + Engine.getInstance().getWidgetManager().mo9651i().mo9718d())) + i2;
            } else {
                return;
            }
        }
        try {
            showAtLocation(view, 51, l, i3);
        } catch (RuntimeException e) {
        }
    }

    /* renamed from: a */
    public boolean mo9682a(String str, int i, int i2) {
        return this.f13222d != null && TextUtils.equals(this.f13222d.getText(), str) && this.f13220b == i && this.f13221c == i2;
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
