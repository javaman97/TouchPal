package com.yahoo.mobile.client.share.search.p099ui.scroll;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.yahoo.mobile.client.share.search.p099ui.scroll.IScrollable;
import java.util.ArrayList;

/* renamed from: com.yahoo.mobile.client.share.search.ui.scroll.a */
public final class C4215a implements AbsListView.OnScrollListener, IScrollable {

    /* renamed from: a */
    private IScrollable.OnScrollListener f17244a;

    /* renamed from: b */
    private boolean f17245b;

    /* renamed from: c */
    private ArrayList<Integer> f17246c;

    /* renamed from: d */
    private int f17247d;

    public C4215a(AbsListView absListView) {
        absListView.setOnScrollListener(this);
    }

    public final IScrollable.OnScrollListener getOnScrollListener() {
        return this.f17244a;
    }

    public final void setOnScrollListener(IScrollable.OnScrollListener onScrollListener) {
        this.f17244a = onScrollListener;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int intValue;
        View childAt;
        int height;
        if (i3 > 0 && this.f17245b) {
            if (this.f17246c == null) {
                this.f17246c = new ArrayList<>(i3);
            }
            while (this.f17246c.size() < i + i2) {
                int size = this.f17246c.size() - i;
                if (size < 0) {
                    childAt = ((ListAdapter) absListView.getAdapter()).getView(this.f17246c.size(), (View) null, absListView);
                    childAt.measure(0, 0);
                    height = childAt.getMeasuredHeight();
                } else {
                    childAt = absListView.getChildAt(size);
                    height = childAt.getHeight();
                }
                int paddingBottom = childAt.getPaddingBottom() + childAt.getPaddingTop() + height;
                if (this.f17246c.size() == 0) {
                    this.f17246c.add(Integer.valueOf(paddingBottom));
                } else {
                    this.f17246c.add(Integer.valueOf(this.f17246c.get(this.f17246c.size() - 1).intValue() + paddingBottom));
                }
            }
            View childAt2 = absListView.getChildAt(0);
            if (childAt2 == null) {
                intValue = 0;
            } else {
                intValue = ((i == 0 ? 0 : this.f17246c.get(i - 1).intValue()) - childAt2.getTop()) + childAt2.getPaddingTop() + absListView.getPaddingTop();
            }
            this.f17247d = intValue;
            if (this.f17244a != null) {
                this.f17244a.onScroll(this, 0, this.f17247d);
            }
        }
    }

    /* renamed from: a */
    public final void mo15803a() {
        this.f17246c = null;
        this.f17247d = 0;
    }

    /* renamed from: a */
    public final void mo15804a(AbsListView absListView, int i, int i2) {
        this.f17245b = true;
        onScroll(absListView, i, 0, i2);
        this.f17245b = false;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        switch (i) {
            case 0:
                this.f17245b = false;
                if (this.f17244a != null) {
                    this.f17244a.onScrollEnd(this, 0, this.f17247d, 0.0f);
                    return;
                }
                return;
            case 1:
                this.f17245b = true;
                if (this.f17244a != null) {
                    this.f17244a.onScrollBegin(this, 0, this.f17247d);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final boolean isScrollEnabled() {
        return true;
    }

    public final int getScrollY() {
        return this.f17247d;
    }
}
