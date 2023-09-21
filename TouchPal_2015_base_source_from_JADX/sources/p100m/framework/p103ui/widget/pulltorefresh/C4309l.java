package p100m.framework.p103ui.widget.pulltorefresh;

import android.widget.ListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.l */
/* compiled from: PullToRefreshListAdapter */
public abstract class C4309l extends C4303f {
    /* access modifiers changed from: private */
    public C4299b adapter;
    /* access modifiers changed from: private */
    public boolean fling;
    /* access modifiers changed from: private */
    public ScrollableListView listView = new ScrollableListView(getContext());
    /* access modifiers changed from: private */
    public C4300c osListener;

    public C4309l(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.listView.setOnScrollListener(new C4310m(this));
        this.adapter = new C4299b(this);
        this.listView.setAdapter(this.adapter);
    }

    public C4312o getBodyView() {
        return this.listView;
    }

    public boolean isPullReady() {
        return this.listView.mo16006a();
    }

    public ListView getListView() {
        return this.listView;
    }

    public boolean isFling() {
        return this.fling;
    }

    public void onScroll(C4312o oVar, int i, int i2, int i3) {
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.adapter.notifyDataSetChanged();
    }
}
