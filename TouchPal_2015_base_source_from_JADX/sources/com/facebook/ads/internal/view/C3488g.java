package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.facebook.ads.internal.view.g */
public class C3488g extends TextView {

    /* renamed from: a */
    private float f15103a;

    /* renamed from: b */
    private float f15104b = 8.0f;

    public C3488g(Context context) {
        super(context);
        super.setSingleLine();
        super.setMaxLines(1);
        this.f15103a = getTextSize() / context.getResources().getDisplayMetrics().density;
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        for (float f = this.f15103a; f >= this.f15104b; f -= 0.5f) {
            super.setTextSize(f);
            measure(0, 0);
            if (getMeasuredWidth() <= i5) {
                break;
            }
        }
        if (getMeasuredWidth() > i5) {
            measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
    }

    public void setMinTextSize(float f) {
        if (f <= this.f15103a) {
            this.f15104b = f;
        }
    }

    public void setSingleLine(boolean z) {
    }

    public void setTextSize(float f) {
        this.f15103a = f;
        super.setTextSize(f);
    }
}
