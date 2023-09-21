package com.cootek.smartinput5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.emoji.keyboard.touchpal.R;

public class GuideMoveBackgroundView extends View {

    /* renamed from: a */
    private static final String f2799a = "GuideMoveBackgroundView";

    /* renamed from: b */
    private static final int f2800b = 1;

    /* renamed from: c */
    private static final int f2801c = 2;

    /* renamed from: d */
    private static final long f2802d = 300;

    /* renamed from: e */
    private static final long f2803e = 50;

    /* renamed from: f */
    private static final int f2804f = 400;

    /* renamed from: g */
    private static final int f2805g = 2;

    /* renamed from: h */
    private Context f2806h;

    /* renamed from: i */
    private Drawable f2807i;

    /* renamed from: j */
    private int f2808j;

    /* renamed from: k */
    private int f2809k;

    /* renamed from: l */
    private float f2810l;

    /* renamed from: m */
    private float f2811m;

    /* renamed from: n */
    private float f2812n;

    /* renamed from: o */
    private float f2813o;

    /* renamed from: p */
    private Handler f2814p = new C1035N(this);

    public GuideMoveBackgroundView(Context context) {
        super(context);
        this.f2806h = context;
        m5388e();
    }

    public GuideMoveBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2806h = context;
        m5388e();
    }

    public GuideMoveBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2806h = context;
        m5388e();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5387d() {
        if (this.f2812n < 0.0f || this.f2813o < 0.0f) {
            this.f2812n = 0.0f;
            this.f2813o = 0.0f;
        } else if (this.f2812n <= ((float) this.f2809k) && this.f2813o <= ((float) this.f2808j)) {
            this.f2812n += this.f2810l;
            this.f2813o += this.f2811m;
        }
        if (this.f2812n > ((float) this.f2809k) || this.f2813o > ((float) this.f2808j)) {
            if (this.f2812n > ((float) this.f2809k) && this.f2813o > ((float) this.f2808j)) {
                this.f2812n -= (float) this.f2809k;
                this.f2813o -= (float) this.f2808j;
            } else if (this.f2812n > ((float) this.f2809k)) {
                this.f2812n -= (float) this.f2809k;
            } else if (this.f2813o > ((float) this.f2808j)) {
                this.f2813o -= (float) this.f2808j;
            }
        }
        invalidate();
        mo4139b();
    }

    /* renamed from: e */
    private void m5388e() {
        if (m5389f()) {
            this.f2807i = this.f2806h.getResources().getDrawable(R.drawable.background_new_guide_drawable);
        } else {
            this.f2807i = this.f2806h.getResources().getDrawable(R.drawable.new_guide_background_icon);
        }
    }

    /* renamed from: a */
    public void mo4138a() {
        this.f2814p.removeCallbacksAndMessages((Object) null);
        this.f2814p.sendEmptyMessageDelayed(1, f2802d);
    }

    /* renamed from: b */
    public void mo4139b() {
        this.f2814p.removeCallbacksAndMessages((Object) null);
        this.f2814p.removeMessages(1);
        this.f2814p.sendEmptyMessageDelayed(1, f2803e);
    }

    /* renamed from: c */
    public void mo4140c() {
        this.f2814p.removeCallbacksAndMessages((Object) null);
        this.f2814p.removeMessages(1);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2809k = i3 - i;
        this.f2808j = i4 - i2;
        this.f2810l = (((float) this.f2809k) * 1.0f) / 400.0f;
        this.f2811m = (((float) this.f2808j) * 1.0f) / 400.0f;
        this.f2807i.setBounds(0, 0, this.f2809k, this.f2808j);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = -this.f2812n;
        float f2 = -this.f2813o;
        canvas.save();
        canvas.translate(f, f2);
        this.f2807i.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(((float) this.f2809k) + f, f2);
        this.f2807i.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f, ((float) this.f2808j) + f2);
        this.f2807i.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f + ((float) this.f2809k), f2 + ((float) this.f2808j));
        this.f2807i.draw(canvas);
        canvas.restore();
    }

    /* renamed from: f */
    private boolean m5389f() {
        return Build.VERSION.SDK_INT > 8;
    }
}
