package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.SquareColorItem */
public class SquareColorItem extends LinearLayout {

    /* renamed from: a */
    private static int f13726a = 1;

    /* renamed from: b */
    private Context f13727b;

    public SquareColorItem(Context context) {
        super(context);
        this.f13727b = context;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setBackgroundColor(int i) {
        if (i != -1) {
            super.setBackgroundColor(i);
            return;
        }
        View view = new View(this.f13727b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.leftMargin = f13726a;
        layoutParams.rightMargin = f13726a;
        layoutParams.bottomMargin = f13726a;
        layoutParams.topMargin = f13726a;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(i);
        setBackgroundColor(this.f13727b.getResources().getColor(R.color.custom_skin_color_block_edge));
        addView(view);
    }
}
