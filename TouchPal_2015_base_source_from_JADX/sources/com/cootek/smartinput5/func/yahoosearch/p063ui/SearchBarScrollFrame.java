package com.cootek.smartinput5.func.yahoosearch.p063ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Scroller;

/* renamed from: com.cootek.smartinput5.func.yahoosearch.ui.SearchBarScrollFrame */
public class SearchBarScrollFrame extends FrameLayout {

    /* renamed from: a */
    private Scroller f9116a;

    public SearchBarScrollFrame(Context context) {
        super(context);
        m9716a(context);
    }

    public SearchBarScrollFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9716a(context);
    }

    public SearchBarScrollFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9716a(context);
    }

    /* renamed from: a */
    private void m9716a(Context context) {
        this.f9116a = new Scroller(context);
    }

    /* renamed from: a */
    public void mo7559a(int i, int i2) {
        mo7560b(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public void mo7560b(int i, int i2) {
        this.f9116a.startScroll(getScrollX(), getScrollY(), i, i2);
        invalidate();
    }

    public void computeScroll() {
        if (this.f9116a.computeScrollOffset()) {
            scrollTo(this.f9116a.getCurrX(), this.f9116a.getCurrY());
            postInvalidate();
        }
        super.computeScroll();
    }
}
