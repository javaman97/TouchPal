package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ClipboardListView */
public class ClipboardListView extends ListView {

    /* renamed from: a */
    private C2611a f11178a;

    /* renamed from: b */
    private int f11179b;

    /* renamed from: com.cootek.smartinput5.ui.ClipboardListView$a */
    public interface C2611a {
        /* renamed from: a */
        void mo8504a();

        /* renamed from: a */
        void mo8505a(int i, int i2);

        /* renamed from: b */
        void mo8506b();
    }

    /* renamed from: com.cootek.smartinput5.ui.ClipboardListView$b */
    public enum C2612b {
        RIGHT,
        LEFT
    }

    public ClipboardListView(Context context) {
        super(context);
    }

    public ClipboardListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRemoveListener(C2611a aVar) {
        this.f11178a = aVar;
    }

    /* renamed from: a */
    public void mo8501a() {
        int lastVisiblePosition = getLastVisiblePosition();
        int firstVisiblePosition = getFirstVisiblePosition();
        View childAt = getChildAt(firstVisiblePosition);
        View childAt2 = getChildAt(lastVisiblePosition);
        if (lastVisiblePosition == getCount() - 1 && childAt2 != null) {
            int height = childAt2.findViewById(R.id.clipboard_item_menu_layout).getHeight();
            if (childAt2.getBottom() - height < this.f11179b) {
                scrollBy(0, (childAt2.getBottom() - height) - this.f11179b);
            }
        } else if (firstVisiblePosition == getCount() - 1 && childAt != null && childAt.getBottom() < this.f11179b) {
            scrollBy(0, childAt.getBottom() - this.f11179b);
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11178a.mo8504a();
        this.f11178a.mo8506b();
    }
}
