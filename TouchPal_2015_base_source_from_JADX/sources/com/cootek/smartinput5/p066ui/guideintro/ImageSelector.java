package com.cootek.smartinput5.p066ui.guideintro;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.guideintro.ImageSelector */
public class ImageSelector extends LinearLayout {

    /* renamed from: a */
    private Context f13224a;

    /* renamed from: b */
    private int f13225b;

    /* renamed from: c */
    private int f13226c;

    /* renamed from: d */
    private ImageView f13227d;

    /* renamed from: e */
    private ImageView f13228e;

    /* renamed from: f */
    private View f13229f;

    /* renamed from: g */
    private int f13230g;

    public ImageSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13224a = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.ImageSelector);
            this.f13225b = obtainStyledAttributes.getResourceId(0, 0);
            this.f13226c = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
        m13498b();
    }

    /* renamed from: b */
    private void m13498b() {
        View view = null;
        try {
            view = LayoutInflater.from(this.f13224a).inflate(R.layout.image_selector, (ViewGroup) null);
        } catch (Exception e) {
        }
        if (view != null) {
            addView(view);
            this.f13227d = (ImageView) findViewById(R.id.image_view);
            this.f13228e = (ImageView) findViewById(R.id.select_icon);
            this.f13229f = findViewById(R.id.outline_layout);
            this.f13227d.setImageResource(this.f13225b);
            this.f13228e.setImageResource(this.f13226c);
            this.f13228e.setVisibility(isSelected() ? 0 : 8);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f13225b = 0;
        if (this.f13227d != null) {
            this.f13227d.setImageBitmap(bitmap);
        }
    }

    public Drawable getDrawable() {
        if (this.f13227d != null) {
            return this.f13227d.getDrawable();
        }
        return null;
    }

    public void setSelected(boolean z) {
        int i = 0;
        super.setSelected(z);
        if (this.f13228e != null) {
            this.f13228e.setVisibility(z ? 0 : 8);
        }
        if (z) {
            i = this.f13224a.getResources().getColor(R.color.guide_intro_select_bg_color);
        }
        setBackgroundColor(i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = 0;
        if (this.f13229f != null) {
            i3 = 0 + this.f13229f.getPaddingTop() + this.f13229f.getPaddingBottom();
        }
        this.f13230g = m13497a(measuredHeight - (i3 + (getPaddingBottom() + getPaddingTop())));
    }

    /* renamed from: a */
    public void mo9684a() {
        if (this.f13230g > 0) {
            getLayoutParams().width = this.f13230g;
        }
    }

    /* renamed from: a */
    private int m13497a(int i) {
        Drawable drawable;
        int i2 = 0;
        if (i <= 0 || (drawable = this.f13227d.getDrawable()) == null) {
            return 0;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return 0;
        }
        int i3 = (intrinsicWidth * i) / intrinsicHeight;
        if (this.f13229f != null) {
            i2 = 0 + this.f13229f.getPaddingLeft() + this.f13229f.getPaddingRight();
        }
        return i3 - (i2 + (getPaddingLeft() + getPaddingRight()));
    }
}
