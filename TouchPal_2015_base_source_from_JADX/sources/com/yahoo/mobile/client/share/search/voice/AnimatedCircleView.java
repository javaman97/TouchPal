package com.yahoo.mobile.client.share.search.voice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yahoo.mobile.client.p094a.p095a.C4073a;

public class AnimatedCircleView extends View {

    /* renamed from: a */
    private int f17365a;

    /* renamed from: b */
    private int f17366b;

    /* renamed from: c */
    private int f17367c;

    /* renamed from: d */
    private int f17368d;

    /* renamed from: e */
    private int f17369e;

    /* renamed from: f */
    private int f17370f;

    /* renamed from: g */
    private int f17371g;

    /* renamed from: h */
    private int f17372h;

    /* renamed from: i */
    private int f17373i;

    /* renamed from: j */
    private int f17374j;

    /* renamed from: k */
    private Paint f17375k;

    /* renamed from: l */
    private Paint f17376l;

    /* renamed from: m */
    private int f17377m;

    /* renamed from: n */
    private int f17378n;

    /* renamed from: o */
    private int f17379o;

    /* renamed from: p */
    private int f17380p;

    /* renamed from: q */
    private int f17381q;

    /* renamed from: r */
    private int f17382r;

    /* renamed from: s */
    private int f17383s;

    /* renamed from: t */
    private int f17384t;

    public AnimatedCircleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AnimatedCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17365a = -1;
        this.f17366b = -1;
        this.f17377m = 18;
        this.f17378n = 22;
        this.f17379o = 30;
        this.f17380p = 1;
        this.f17381q = 255;
        this.f17382r = 255;
        this.f17383s = getResources().getColor(C4073a.C4078e.voice_dialog_inner_circle_color);
        this.f17384t = getResources().getColor(C4073a.C4078e.voice_dialog_outer_circle_color);
        int i = this.f17377m;
        int i2 = this.f17378n;
        int i3 = this.f17379o;
        int i4 = this.f17380p;
        int i5 = this.f17381q;
        int i6 = this.f17382r;
        int i7 = this.f17383s;
        int i8 = this.f17384t;
        this.f17367c = (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
        this.f17368d = (int) TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
        this.f17369e = i3;
        this.f17370f = (int) TypedValue.applyDimension(1, (float) i4, getResources().getDisplayMetrics());
        this.f17371g = i5;
        this.f17372h = i6;
        this.f17373i = i7;
        this.f17374j = i8;
        this.f17375k = new Paint();
        this.f17375k.setAntiAlias(true);
        this.f17375k.setColor(this.f17373i);
        this.f17375k.setStrokeWidth((float) this.f17370f);
        this.f17375k.setStyle(Paint.Style.STROKE);
        this.f17375k.setAlpha(this.f17371g);
        this.f17376l = new Paint();
        this.f17376l.setAntiAlias(true);
        this.f17376l.setColor(this.f17374j);
        this.f17376l.setStrokeWidth((float) this.f17370f);
        this.f17376l.setAlpha(this.f17372h);
        this.f17376l.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final void mo15889a(int i) {
        this.f17369e = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17365a < 0 || this.f17366b < 0) {
            RelativeLayout relativeLayout = (RelativeLayout) getParent();
            int width = relativeLayout.getWidth();
            TextView textView = (TextView) relativeLayout.findViewById(C4073a.C4081h.microphone);
            int top = textView.getTop();
            int height = textView.getHeight();
            this.f17365a = width / 2;
            this.f17366b = (height / 2) + top;
        }
        canvas.drawCircle((float) this.f17365a, (float) this.f17366b, ((float) this.f17367c) + (0.8f * ((float) this.f17369e)), this.f17375k);
        canvas.drawCircle((float) this.f17365a, (float) this.f17366b, ((float) this.f17368d) + (1.2f * ((float) this.f17369e)), this.f17376l);
    }
}
