package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.KeyboardMaskEdge */
public class KeyboardMaskEdge extends View {

    /* renamed from: a */
    private static final int f13500a = -1;

    /* renamed from: b */
    private final Drawable f13501b;

    /* renamed from: c */
    private final Drawable f13502c;

    /* renamed from: d */
    private Drawable f13503d;

    /* renamed from: e */
    private int f13504e;

    /* renamed from: f */
    private final int f13505f;

    /* renamed from: g */
    private final boolean f13506g;

    /* renamed from: h */
    private final int f13507h;

    public KeyboardMaskEdge(Context context, int i, boolean z, int i2) {
        super(context);
        this.f13504e = i;
        this.f13506g = z;
        if (this.f13506g) {
            this.f13501b = context.getResources().getDrawable(R.drawable.keyboard_customize_edge_vertical);
            this.f13502c = context.getResources().getDrawable(R.drawable.keyboard_customize_edge_vertical_limit);
        } else {
            this.f13501b = context.getResources().getDrawable(R.drawable.keyboard_customize_edge_horizontal);
            this.f13502c = context.getResources().getDrawable(R.drawable.keyboard_customize_edge_horizontal_limit);
        }
        this.f13505f = z ? this.f13501b.getIntrinsicHeight() : this.f13501b.getIntrinsicWidth();
        this.f13503d = this.f13501b;
        this.f13507h = i2;
    }

    private void setEdgeToLimit(boolean z) {
        if (z) {
            this.f13503d = this.f13502c;
        } else {
            this.f13503d = this.f13501b;
        }
    }

    /* renamed from: a */
    public void mo9880a(int i) {
        this.f13504e += i;
        invalidate();
    }

    /* renamed from: a */
    public void mo9881a(int i, boolean z) {
        setEdgeToLimit(z);
        if (i != -1) {
            this.f13504e = i;
        }
        invalidate();
    }

    public int getEdgeIntrinsicHeight() {
        if (this.f13501b == null) {
            return -1;
        }
        return this.f13501b.getIntrinsicHeight();
    }

    public int getEdgeIntrinsicWidth() {
        if (this.f13501b == null) {
            return -1;
        }
        return this.f13501b.getIntrinsicWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        int i4 = this.f13504e;
        if (this.f13506g) {
            i2 = this.f13505f * 2;
            i = 0;
        } else {
            i = this.f13505f * 2;
            i2 = 0;
        }
        int i5 = i4;
        int i6 = 0;
        while (i5 > 0) {
            this.f13503d.setBounds(i * i6, i2 * i6, (i * i6) + this.f13503d.getIntrinsicWidth(), (i2 * i6) + this.f13503d.getIntrinsicHeight());
            this.f13503d.draw(canvas);
            if (this.f13506g) {
                i3 = i2;
            } else {
                i3 = i;
            }
            i5 -= i3;
            i6++;
        }
    }
}
