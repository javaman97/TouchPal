package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.FilterScroll */
public class FilterScroll extends LeftScrollView implements FilterManager.IFilterListener {

    /* renamed from: c */
    private C2805ca f11217c = new C2805ca("filters");

    /* renamed from: d */
    private SoftKeyboardView f11218d;

    /* renamed from: e */
    private LinearLayout f11219e;

    /* renamed from: f */
    private FrameLayout.LayoutParams f11220f;

    /* renamed from: g */
    private boolean f11221g;

    public FilterScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_emo_scroll_ctrl, C2726bF.EMO_KB_BG));
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.key_padding_inner_bottom);
        setPadding(0, dimensionPixelOffset, 0, dimensionPixelOffset);
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager != null && !widgetManager.mo9600E().mo8623g()) {
            widgetManager.mo9639b(z);
        }
        if (this.f11217c != null) {
            this.f11217c.onFilterUpdated(z, iFilterProvider, z2);
            if (z2) {
                scrollTo(0, 0);
            }
            int max = Math.max(this.f11217c.mo9135h(), getDisplayHeight());
            if (max != this.f11220f.height) {
                this.f11218d.setMinimumHeight(max);
                this.f11220f.height = max;
                this.f11219e.setLayoutParams(this.f11220f);
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    public void mo8526a() {
        if (this.f11217c == null) {
            this.f11217c = new C2805ca("filters");
        }
        this.f11218d = (SoftKeyboardView) findViewById(R.id.filter_scroll);
        this.f11218d.setKeyboard(this.f11217c);
        this.f11218d.setMinimumWidth(this.f11218d.getKeyboard().mo9194p());
        this.f11219e = (LinearLayout) findViewById(R.id.scroll_container);
        this.f11220f = (FrameLayout.LayoutParams) this.f11219e.getLayoutParams();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f11221g) {
            this.f11221g = false;
        } else if (i4 <= this.f11217c.mo9136i() || i2 <= this.f11217c.mo9136i()) {
            if (i4 <= 0 && i2 <= 0 && this.f11217c.mo9019d()) {
                this.f11221g = true;
                scrollTo(getScrollX(), this.f11217c.mo9136i());
            }
        } else if (this.f11217c.mo9018c()) {
            this.f11221g = true;
            scrollTo(getScrollX(), 0);
        }
    }

    /* renamed from: b */
    public void mo8527b() {
        this.f11217c = null;
    }
}
