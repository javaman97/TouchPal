package com.yahoo.mobile.client.share.search.p099ui.scroll;

/* renamed from: com.yahoo.mobile.client.share.search.ui.scroll.IScrollable */
public interface IScrollable {

    /* renamed from: com.yahoo.mobile.client.share.search.ui.scroll.IScrollable$OnScrollListener */
    public interface OnScrollListener {
        void onScroll(IScrollable iScrollable, int i, int i2);

        void onScrollBegin(IScrollable iScrollable, int i, int i2);

        void onScrollEnableChanged(IScrollable iScrollable, boolean z);

        void onScrollEnd(IScrollable iScrollable, int i, int i2, float f);
    }

    OnScrollListener getOnScrollListener();

    int getScrollY();

    boolean isScrollEnabled();

    void setOnScrollListener(OnScrollListener onScrollListener);
}
