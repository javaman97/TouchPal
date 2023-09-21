package com.facebook.ads.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.internal.g */
public class C3415g extends View {

    /* renamed from: a */
    private Paint f14904a;

    /* renamed from: b */
    private Paint f14905b;

    /* renamed from: c */
    private Paint f14906c;

    /* renamed from: d */
    private int f14907d;

    /* renamed from: e */
    private boolean f14908e;

    public C3415g(Context context) {
        this(context, 60, true);
    }

    public C3415g(Context context, int i, boolean z) {
        super(context);
        this.f14907d = i;
        this.f14908e = z;
        if (z) {
            this.f14904a = new Paint();
            this.f14904a.setColor(-3355444);
            this.f14904a.setStyle(Paint.Style.STROKE);
            this.f14904a.setStrokeWidth(3.0f);
            this.f14904a.setAntiAlias(true);
            this.f14905b = new Paint();
            this.f14905b.setColor(-1287371708);
            this.f14905b.setStyle(Paint.Style.FILL);
            this.f14905b.setAntiAlias(true);
            this.f14906c = new Paint();
            this.f14906c.setColor(-1);
            this.f14906c.setStyle(Paint.Style.STROKE);
            this.f14906c.setStrokeWidth(6.0f);
            this.f14906c.setAntiAlias(true);
        }
        m15009a();
    }

    /* renamed from: a */
    private void m15009a() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((float) this.f14907d) * displayMetrics.density), (int) (displayMetrics.density * ((float) this.f14907d)));
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f14908e) {
            if (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT < 17) {
                setLayerType(1, (Paint) null);
            }
            int min = Math.min(canvas.getWidth(), canvas.getHeight());
            int i = min / 2;
            int i2 = min / 2;
            int i3 = (i * 2) / 3;
            canvas.drawCircle((float) i, (float) i2, (float) i3, this.f14904a);
            canvas.drawCircle((float) i, (float) i2, (float) (i3 - 2), this.f14905b);
            int i4 = min / 3;
            int i5 = min / 3;
            canvas.drawLine((float) i4, (float) i5, (float) (i4 * 2), (float) (i5 * 2), this.f14906c);
            canvas.drawLine((float) (i4 * 2), (float) i5, (float) i4, (float) (i5 * 2), this.f14906c);
        }
        super.onDraw(canvas);
    }
}
