package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.Scroller;

/* renamed from: com.cootek.smartinput5.ui.control.ShortcutPluginScrollView */
public class ShortcutPluginScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private View f12818a;

    /* renamed from: b */
    private View f12819b;

    /* renamed from: c */
    private Scroller f12820c;

    public ShortcutPluginScrollView(Context context) {
        super(context, (AttributeSet) null);
        m13049a(context);
    }

    public ShortcutPluginScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13049a(context);
    }

    public ShortcutPluginScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13049a(context);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public void computeScroll() {
        if (this.f12820c.computeScrollOffset()) {
            scrollTo(this.f12820c.getCurrX(), this.f12820c.getCurrY());
            postInvalidate();
            return;
        }
        super.computeScroll();
    }

    /* renamed from: a */
    private void m13049a(Context context) {
        this.f12820c = new Scroller(context, new LinearInterpolator());
    }

    /* renamed from: a */
    public void mo9386a(int i, int i2, int i3) {
        this.f12820c.startScroll(i, getScrollY(), i2, 0, i3);
        super.scrollTo(i + i2, getScrollY());
    }
}
