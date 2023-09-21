package com.facebook.ads.internal.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.facebook.ads.internal.view.f */
public class C3487f extends TextView {

    /* renamed from: a */
    private int f15100a;

    /* renamed from: b */
    private float f15101b;

    /* renamed from: c */
    private float f15102c = 8.0f;

    public C3487f(Context context, int i) {
        super(context);
        setMaxLines(i);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.setMaxLines(this.f15100a + 1);
        super.setTextSize(this.f15101b);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 0));
        if (getMeasuredHeight() > i6) {
            float f = this.f15101b;
            while (f > this.f15102c) {
                f -= 0.5f;
                super.setTextSize(f);
                measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), 0);
                if (getMeasuredHeight() <= i6 && getLineCount() <= this.f15100a) {
                    break;
                }
            }
        }
        super.setMaxLines(this.f15100a);
        setMeasuredDimension(i5, i6);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setMaxLines(int i) {
        this.f15100a = i;
        super.setMaxLines(i);
    }

    public void setMinTextSize(float f) {
        this.f15102c = f;
    }

    public void setTextSize(float f) {
        this.f15101b = f;
        super.setTextSize(f);
    }
}
