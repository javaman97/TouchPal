package p100m.framework.p103ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: m.framework.ui.widget.pulltorefresh.f */
/* compiled from: PullToRefreshBaseListAdapter */
public abstract class C4303f extends C4302e {
    public abstract int getCount();

    public abstract Object getItem(int i);

    public abstract long getItemId(int i);

    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public abstract boolean isFling();

    public abstract void onScroll(C4312o oVar, int i, int i2, int i3);

    public C4303f(PullToRefreshView pullToRefreshView) {
        super(pullToRefreshView);
    }
}
