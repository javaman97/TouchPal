package p100m.framework.p103ui.widget.pulltorefresh;

import android.widget.AbsListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.j */
/* compiled from: PullToRefreshGroupListAdapter */
class C4307j implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C4306i f17516a;

    /* renamed from: b */
    private int f17517b;

    /* renamed from: c */
    private int f17518c;

    C4307j(C4306i iVar) {
        this.f17516a = iVar;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f17516a.f17514c = i == 2;
        if (i != 0) {
            return;
        }
        if (this.f17516a.f17515d != null) {
            this.f17516a.f17515d.mo16016a(this.f17517b, this.f17518c);
        } else if (this.f17516a.f17513b != null) {
            this.f17516a.f17513b.mo15995b();
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f17517b = i;
        this.f17518c = i2;
        this.f17516a.mo16033a((C4312o) this.f17516a.f17512a, i, i2, i3);
    }
}
