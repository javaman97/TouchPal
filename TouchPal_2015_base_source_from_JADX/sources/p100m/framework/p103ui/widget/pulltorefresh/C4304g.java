package p100m.framework.p103ui.widget.pulltorefresh;

import android.widget.GridView;

/* renamed from: m.framework.ui.widget.pulltorefresh.g */
/* compiled from: PullToRefreshGridAdapter */
public abstract class C4304g extends C4303f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScrollableGridView f17505a = new ScrollableGridView(getContext());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4299b f17506b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f17507c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4300c f17508d;

    public C4304g(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.f17505a.setOnScrollListener(new C4305h(this));
        this.f17506b = new C4299b(this);
        this.f17505a.setAdapter(this.f17506b);
    }

    public C4312o getBodyView() {
        return this.f17505a;
    }

    public boolean isPullReady() {
        return this.f17505a.mo16002a();
    }

    /* renamed from: a */
    public GridView mo16025a() {
        return this.f17505a;
    }

    public boolean isFling() {
        return this.f17507c;
    }

    public void onScroll(C4312o oVar, int i, int i2, int i3) {
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f17506b.notifyDataSetChanged();
    }
}
