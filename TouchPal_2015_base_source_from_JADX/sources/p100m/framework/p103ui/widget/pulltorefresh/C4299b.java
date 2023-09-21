package p100m.framework.p103ui.widget.pulltorefresh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: m.framework.ui.widget.pulltorefresh.b */
/* compiled from: ListInnerAdapter */
public class C4299b extends BaseAdapter {

    /* renamed from: a */
    private C4303f f17504a;

    public C4299b(C4303f fVar) {
        this.f17504a = fVar;
    }

    public int getCount() {
        return this.f17504a.getCount();
    }

    public Object getItem(int i) {
        return this.f17504a.getItem(i);
    }

    public long getItemId(int i) {
        return this.f17504a.getItemId(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.f17504a.getView(i, view, viewGroup);
    }
}
