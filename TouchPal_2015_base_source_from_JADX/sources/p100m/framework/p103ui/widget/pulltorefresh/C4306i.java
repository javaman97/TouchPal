package p100m.framework.p103ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import p100m.framework.p103ui.widget.pulltorefresh.GroupListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.i */
/* compiled from: PullToRefreshGroupListAdapter */
public abstract class C4306i extends C4302e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ScrollableGroupListView f17512a = new ScrollableGroupListView(getContext());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GroupListView.C4296a f17513b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f17514c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4300c f17515d;

    /* renamed from: a */
    public abstract int mo16028a();

    /* renamed from: a */
    public abstract View mo16029a(int i, int i2, View view, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract View mo16030a(int i, View view, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract Object mo16031a(int i, int i2);

    /* renamed from: a */
    public abstract String mo16032a(int i);

    /* renamed from: b */
    public abstract int mo16034b(int i);

    public C4306i(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
        this.f17512a.setOnScrollListener(new C4307j(this));
        this.f17513b = new C4308k(this);
        this.f17512a.setAdapter(this.f17513b);
    }

    public C4312o getBodyView() {
        return this.f17512a;
    }

    public boolean isPullReady() {
        return this.f17512a.mo16004a();
    }

    /* renamed from: b */
    public GroupListView mo16035b() {
        return this.f17512a;
    }

    /* renamed from: c */
    public boolean mo16036c() {
        return this.f17514c;
    }

    /* renamed from: a */
    public void mo16033a(C4312o oVar, int i, int i2, int i3) {
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f17513b.mo15995b();
    }
}
