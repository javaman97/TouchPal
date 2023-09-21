package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.cootek.smartinput5.ui.FittedTextView */
public class FittedTextView extends TextView {

    /* renamed from: a */
    private static float f11222a = 10.0f;

    /* renamed from: b */
    private static float f11223b = 35.0f;

    /* renamed from: c */
    private Paint f11224c;

    /* renamed from: d */
    private float f11225d;

    /* renamed from: e */
    private float f11226e;

    public FittedTextView(Context context) {
        super(context);
        m11643a();
    }

    public FittedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11643a();
    }

    public FittedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11643a();
    }

    /* renamed from: a */
    private void m11643a() {
        this.f11224c = new Paint();
        this.f11224c.set(getPaint());
        this.f11226e = getTextSize();
        if (this.f11226e <= f11222a) {
            this.f11226e = f11223b;
        }
        this.f11225d = f11222a;
    }

    /* renamed from: a */
    private void m11644a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f11226e;
            this.f11224c.setTextSize(f);
            while (true) {
                if (f <= this.f11225d || this.f11224c.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                if (f <= this.f11225d) {
                    f = this.f11225d;
                    break;
                }
                this.f11224c.setTextSize(f);
            }
            setTextSize(0, f);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m11644a(charSequence.toString(), getWidth());
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m11644a(getText().toString(), i);
        }
    }
}
