package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.GridView;

/* renamed from: m.framework.ui.widget.pulltorefresh.ScrollableGridView */
public class ScrollableGridView extends GridView implements C4312o {

    /* renamed from: a */
    private C4301d f17496a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f17497b;

    public ScrollableGridView(Context context) {
        super(context);
        m18009a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18009a(context);
    }

    public ScrollableGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18009a(context);
    }

    /* renamed from: a */
    private void m18009a(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.f17496a = new C4313p(this);
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        if (this.f17496a != null) {
            this.f17496a.mo16017a(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }

    /* renamed from: a */
    public boolean mo16002a() {
        return this.f17497b;
    }
}
