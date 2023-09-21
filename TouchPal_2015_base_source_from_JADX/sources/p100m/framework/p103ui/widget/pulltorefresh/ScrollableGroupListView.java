package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;

/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableGroupListView */
public class ScrollableGroupListView extends GroupListView implements C4312o {

    /* renamed from: a */
    private C4301d f17498a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f17499b;

    public ScrollableGroupListView(Context context) {
        super(context);
        m18012a(context);
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18012a(context);
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18012a(context);
    }

    /* renamed from: a */
    private void m18012a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f17498a = new C4314q(this);
    }

    /* renamed from: a */
    public boolean mo16004a() {
        return this.f17499b;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f17498a != null) {
            this.f17498a.mo16017a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }
}
