package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.ListView;

/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableListView */
public class ScrollableListView extends ListView implements C4312o {

    /* renamed from: a */
    private C4301d f17500a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f17501b;

    public ScrollableListView(Context context) {
        super(context);
        m18015a(context);
    }

    public ScrollableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18015a(context);
    }

    public ScrollableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18015a(context);
    }

    /* renamed from: a */
    private void m18015a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f17500a = new C4315r(this);
    }

    /* renamed from: a */
    public boolean mo16006a() {
        return this.f17501b;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f17500a != null) {
            this.f17500a.mo16017a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
