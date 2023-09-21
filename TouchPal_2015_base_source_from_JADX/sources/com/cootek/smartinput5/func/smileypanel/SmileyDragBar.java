package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.emoji.keyboard.touchpal.R;

public class SmileyDragBar extends RelativeLayout {

    /* renamed from: a */
    private Context f6856a;

    /* renamed from: b */
    private View f6857b;

    /* renamed from: c */
    private View f6858c;

    /* renamed from: d */
    private View f6859d;

    /* renamed from: e */
    private View f6860e;

    public SmileyDragBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9186a(context);
    }

    public SmileyDragBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9186a(context);
    }

    public SmileyDragBar(Context context) {
        super(context);
        m9186a(context);
    }

    /* renamed from: a */
    private void m9186a(Context context) {
        this.f6856a = context;
        addView(((LayoutInflater) this.f6856a.getSystemService("layout_inflater")).inflate(R.layout.smiley_drag_bar, (ViewGroup) null));
        this.f6857b = findViewById(R.id.drag_keyboard_mask);
        this.f6858c = findViewById(R.id.drag_bottom_area);
        this.f6859d = findViewById(R.id.drag_bottom_shadow);
        this.f6860e = findViewById(R.id.drag_knob);
    }

    public int getTotalHeight() {
        measure(0, 0);
        return getMeasuredHeight();
    }

    public int getMaskHeight() {
        if (this.f6857b == null) {
            return 0;
        }
        this.f6857b.measure(0, 0);
        return this.f6857b.getMeasuredHeight();
    }

    public int getBottomAreaHeight() {
        if (this.f6858c == null) {
            return 0;
        }
        this.f6858c.measure(0, 0);
        return this.f6858c.getMeasuredHeight();
    }

    public int getBottomShadowHeight() {
        if (this.f6859d == null) {
            return 0;
        }
        this.f6859d.measure(0, 0);
        return this.f6859d.getMeasuredHeight();
    }

    public int getKnobHeight() {
        if (this.f6860e == null) {
            return 0;
        }
        this.f6860e.measure(0, 0);
        return this.f6860e.getMeasuredHeight();
    }

    public void setShadowVisibility(int i) {
        if (this.f6859d != null) {
            this.f6859d.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo7306a(float f) {
        this.f6859d.getBackground().setAlpha((int) ((1.0f - f) * 255.0f));
        this.f6857b.getBackground().setAlpha((int) (f * 255.0f));
    }
}
