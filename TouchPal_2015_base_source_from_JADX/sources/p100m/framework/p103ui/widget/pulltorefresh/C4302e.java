package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.view.View;

/* renamed from: m.framework.ui.widget.pulltorefresh.e */
/* compiled from: PullToRefreshAdatper */
public abstract class C4302e {
    private Context context;
    private PullToRefreshView parent;

    public abstract C4312o getBodyView();

    public abstract View getHeaderView();

    public abstract boolean isPullReady();

    public abstract void onPullDown(int i);

    public abstract void onRequest();

    public C4302e(PullToRefreshView pullToRefreshView) {
        this.context = pullToRefreshView.getContext();
        this.parent = pullToRefreshView;
    }

    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public PullToRefreshView getParent() {
        return this.parent;
    }

    public void notifyDataSetChanged() {
        this.parent.mo15996a();
    }

    public void onReversed() {
    }
}
