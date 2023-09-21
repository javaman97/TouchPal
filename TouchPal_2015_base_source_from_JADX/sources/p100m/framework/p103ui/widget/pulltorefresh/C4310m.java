package p100m.framework.p103ui.widget.pulltorefresh;

import android.widget.AbsListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.m */
/* compiled from: PullToRefreshListAdapter */
class C4310m implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C4309l f17520a;

    /* renamed from: b */
    private int f17521b;

    /* renamed from: c */
    private int f17522c;

    C4310m(C4309l lVar) {
        this.f17520a = lVar;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f17520a.fling = i == 2;
        if (i != 0) {
            return;
        }
        if (this.f17520a.osListener != null) {
            this.f17520a.osListener.mo16016a(this.f17521b, this.f17522c);
        } else if (this.f17520a.adapter != null) {
            this.f17520a.adapter.notifyDataSetChanged();
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f17521b = i;
        this.f17522c = i2;
        this.f17520a.onScroll(this.f17520a.listView, i, i2, i3);
    }
}
