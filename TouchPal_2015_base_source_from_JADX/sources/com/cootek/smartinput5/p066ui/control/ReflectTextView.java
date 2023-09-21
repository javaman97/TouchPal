package com.cootek.smartinput5.p066ui.control;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.cootek.smartinput5.func.resource.p055ui.TTextView;
import com.emoji.keyboard.touchpal.C3305b;

/* renamed from: com.cootek.smartinput5.ui.control.ReflectTextView */
public class ReflectTextView extends TTextView {

    /* renamed from: a */
    private static final String f12809a = "ReflectTextView";

    /* renamed from: b */
    private Context f12810b;

    /* renamed from: c */
    private Matrix f12811c;

    /* renamed from: d */
    private Paint f12812d;

    /* renamed from: e */
    private float f12813e = 0.4f;

    /* renamed from: f */
    private int f12814f = -1342177281;

    public ReflectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13040a(context, attributeSet);
    }

    public ReflectTextView(Context context) {
        super(context);
        m13040a(context, (AttributeSet) null);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m13040a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 11) {
            setLayerType(1, (Paint) null);
        }
        this.f12810b = context;
        setDrawingCacheEnabled(true);
        this.f12811c = new Matrix();
        this.f12811c.preScale(1.0f, -1.0f);
        this.f12812d = new Paint();
        this.f12812d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = this.f12810b.obtainStyledAttributes(attributeSet, C3305b.C3322q.ReflectTextView);
            this.f12813e = obtainStyledAttributes.getFloat(0, 0.4f);
            this.f12814f = obtainStyledAttributes.getColor(1, 184549375);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Bitmap drawingCache;
        super.onDraw(canvas);
        CharSequence text = getText();
        if (!TextUtils.isEmpty(text)) {
            String charSequence = text.toString();
            if (!TextUtils.isEmpty(charSequence) && (drawingCache = getDrawingCache()) != null) {
                int width = drawingCache.getWidth();
                int height = drawingCache.getHeight();
                Rect rect = new Rect();
                TextPaint paint = getPaint();
                paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                paint.getFontMetricsInt(fontMetricsInt);
                int i = -2;
                if (C2829G.m12929a(charSequence.charAt(0))) {
                    i = -fontMetricsInt.descent;
                } else if (rect.height() > Math.abs(fontMetricsInt.ascent)) {
                    i = (-fontMetricsInt.descent) * 2;
                }
                canvas.save();
                canvas.scale(1.0f, -1.0f, ((float) width) / 2.0f, (float) getBaseline());
                canvas.translate(0.0f, (float) i);
                canvas.drawBitmap(drawingCache, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                int baseline = getBaseline() - (i / 2);
                int color = paint.getColor();
                this.f12812d.setShader(new LinearGradient(0.0f, (float) baseline, 0.0f, (float) height, new int[]{Color.argb(Color.alpha(this.f12814f), Color.red(color), Color.green(color), Color.blue(color)), 0}, new float[]{0.0f, this.f12813e}, Shader.TileMode.CLAMP));
                canvas.drawRect(0.0f, (float) baseline, (float) width, (float) height, this.f12812d);
            }
        }
    }
}
