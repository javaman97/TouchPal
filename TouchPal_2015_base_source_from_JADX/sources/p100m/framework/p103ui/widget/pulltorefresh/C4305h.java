package p100m.framework.p103ui.widget.pulltorefresh;

import android.widget.AbsListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.h */
/* compiled from: PullToRefreshGridAdapter */
class C4305h implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ C4304g f17509a;

    /* renamed from: b */
    private int f17510b;

    /* renamed from: c */
    private int f17511c;

    C4305h(C4304g gVar) {
        this.f17509a = gVar;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        this.f17509a.f17507c = i == 2;
        if (i != 0) {
            return;
        }
        if (this.f17509a.f17508d != null) {
            this.f17509a.f17508d.mo16016a(this.f17510b, this.f17511c);
        } else if (this.f17509a.f17506b != null) {
            this.f17509a.f17506b.notifyDataSetChanged();
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f17510b = i;
        this.f17511c = i2;
        this.f17509a.onScroll(this.f17509a.f17505a, i, i2, i3);
    }
}
