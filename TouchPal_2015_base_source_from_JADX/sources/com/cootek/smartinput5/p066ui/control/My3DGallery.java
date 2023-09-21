package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Transformation;
import android.widget.Gallery;

/* renamed from: com.cootek.smartinput5.ui.control.My3DGallery */
public class My3DGallery extends Gallery {

    /* renamed from: e */
    private static final int f12782e = 1000;

    /* renamed from: a */
    private Camera f12783a = new Camera();

    /* renamed from: b */
    private int f12784b = 45;

    /* renamed from: c */
    private int f12785c = -100;

    /* renamed from: d */
    private int f12786d;

    /* renamed from: f */
    private final int f12787f;

    /* renamed from: g */
    private long f12788g;

    public My3DGallery(Context context) {
        super(context);
        setStaticTransformationsEnabled(true);
        this.f12787f = (int) (1000.0f * getContext().getResources().getDisplayMetrics().density);
    }

    public My3DGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setStaticTransformationsEnabled(true);
        this.f12787f = (int) (1000.0f * getContext().getResources().getDisplayMetrics().density);
    }

    public My3DGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setStaticTransformationsEnabled(true);
        this.f12787f = (int) (1000.0f * getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: a */
    private boolean m13031a(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return motionEvent2.getX() > motionEvent.getX();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (Math.abs(SystemClock.uptimeMillis() - this.f12788g) > 200) {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f12788g = SystemClock.uptimeMillis();
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > ((float) this.f12787f)) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, 89.333336f, 265.33334f, 0), MotionEvent.obtain(motionEvent2.getDownTime(), motionEvent2.getEventTime(), 1, 400.0f, 238.00003f, 0), m13031a(motionEvent, motionEvent2) ? 300.0f : -300.0f, 0.0f);
    }

    public int getMaxRotationAngle() {
        return this.f12784b;
    }

    public void setMaxRotationAngle(int i) {
        this.f12784b = i;
    }

    public int getMaxZoom() {
        return this.f12785c;
    }

    public void setMaxZoom(int i) {
        this.f12785c = i;
    }

    private int getCenterOfCoverflow() {
        return (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 2) + getPaddingLeft();
    }

    /* renamed from: a */
    private static int m13029a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* access modifiers changed from: protected */
    public boolean getChildStaticTransformation(View view, Transformation transformation) {
        int a = m13029a(view);
        int width = view.getWidth();
        transformation.clear();
        transformation.setTransformationType(Transformation.TYPE_MATRIX);
        if (a == this.f12786d) {
            m13030a(view, transformation, 0);
            return true;
        }
        int i = (int) ((((float) (this.f12786d - a)) / ((float) width)) * ((float) this.f12784b));
        if (Math.abs(i) > this.f12784b) {
            i = i < 0 ? -this.f12784b : this.f12784b;
        }
        m13030a(view, transformation, i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f12786d = getCenterOfCoverflow();
        super.onSizeChanged(i, i2, i3, i4);
    }

    /* renamed from: a */
    private void m13030a(View view, Transformation transformation, int i) {
        this.f12783a.save();
        Gallery.LayoutParams layoutParams = (Gallery.LayoutParams) view.getLayoutParams();
        Matrix matrix = transformation.getMatrix();
        int i2 = layoutParams.height;
        int i3 = layoutParams.width;
        int abs = Math.abs(i);
        this.f12783a.translate(0.0f, 0.0f, 100.0f);
        if (abs < this.f12784b) {
            this.f12783a.translate(0.0f, 0.0f, (float) (((double) this.f12785c) + (((double) abs) * 1.5d)));
        }
        this.f12783a.rotateY((float) i);
        this.f12783a.getMatrix(matrix);
        matrix.preTranslate((float) (-(i3 / 2)), (float) (-(i2 / 2)));
        matrix.postTranslate((float) (i3 / 2), (float) (i2 / 2));
        this.f12783a.restore();
    }
}
