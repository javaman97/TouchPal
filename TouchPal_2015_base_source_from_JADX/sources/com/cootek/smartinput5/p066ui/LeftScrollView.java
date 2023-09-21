package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.control.C2878v;
import com.emoji.keyboard.touchpal.C3305b;

/* renamed from: com.cootek.smartinput5.ui.LeftScrollView */
public class LeftScrollView extends ScrollView {

    /* renamed from: a */
    protected int f11456a;

    /* renamed from: b */
    protected int f11457b;

    /* renamed from: c */
    private Context f11458c;

    /* renamed from: d */
    private AttributeSet f11459d;

    public LeftScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11458c = context;
        this.f11459d = attributeSet;
        mo8527b();
        setVerticalScrollBarEnabled(false);
        setVerticalFadingEdgeEnabled(true);
    }

    /* renamed from: b */
    private void mo8527b() {
        int i = this.f11458c.getResources().getDisplayMetrics().widthPixels;
        int o = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9193o();
        TypedArray obtainStyledAttributes = this.f11458c.obtainStyledAttributes(this.f11459d, C3305b.C3322q.SoftKeyboard);
        this.f11456a = C2878v.m13321a(obtainStyledAttributes, 5, i, 0);
        this.f11457b = C2878v.m13321a(obtainStyledAttributes, 6, o, 0);
        setMinimumHeight(this.f11457b);
        setMinimumWidth(this.f11456a);
        obtainStyledAttributes.recycle();
    }

    public int getDisplayHeight() {
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9251i() * ((double) this.f11457b));
    }

    public int getDisplayWidth() {
        return (int) (Engine.getInstance().getWidgetManager().mo9630ad().mo9250h() * ((double) this.f11456a));
    }

    /* renamed from: a */
    public void mo8526a() {
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }
}
