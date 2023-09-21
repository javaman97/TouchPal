package com.facebook.ads.internal.view;

import android.content.Context;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.internal.view.h */
public class C3489h extends RelativeLayout {

    /* renamed from: a */
    private int f15105a = 0;

    /* renamed from: b */
    private int f15106b = 0;

    public C3489h(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f15106b > 0 && getMeasuredWidth() > this.f15106b) {
            setMeasuredDimension(this.f15106b, getMeasuredHeight());
        } else if (getMeasuredWidth() < this.f15105a) {
            setMeasuredDimension(this.f15105a, getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void setMaxWidth(int i) {
        this.f15106b = i;
    }

    public void setMinWidth(int i) {
        this.f15105a = i;
    }
}
