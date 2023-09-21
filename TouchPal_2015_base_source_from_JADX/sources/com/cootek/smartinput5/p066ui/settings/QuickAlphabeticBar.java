package com.cootek.smartinput5.p066ui.settings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.settings.QuickAlphabeticBar */
public class QuickAlphabeticBar extends ImageButton {

    /* renamed from: a */
    private static final String[] f13599a = {"#", C1712h.f5591m, C1712h.f5592n, C1712h.f5593o, C1712h.f5594p, C1712h.f5595q, C1712h.f5596r, C1712h.f5597s, C1712h.f5598t, C1712h.f5599u, C1712h.f5600v, C1712h.f5601w, C1712h.f5602x, C1712h.f5603y, C1712h.f5604z, C1712h.f5575A, "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "*"};

    /* renamed from: b */
    private float f13600b;

    /* renamed from: c */
    private float f13601c;

    /* renamed from: d */
    private float f13602d;

    /* renamed from: e */
    private float f13603e;

    /* renamed from: f */
    private float f13604f;

    /* renamed from: g */
    private Paint f13605g;

    /* renamed from: h */
    private Context f13606h;

    /* renamed from: i */
    private TextView f13607i;

    /* renamed from: j */
    private C3134cc f13608j;

    /* renamed from: k */
    private ListView f13609k;

    public QuickAlphabeticBar(Context context) {
        super(context);
        m13952a(context);
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13952a(context);
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13952a(context);
    }

    /* renamed from: a */
    private void m13952a(Context context) {
        this.f13606h = context;
        setBackgroundColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.usr_word_quick_bar_bg_color));
        this.f13605g = new Paint(64);
        this.f13605g.setTextAlign(Paint.Align.CENTER);
        this.f13605g.setTypeface(Typeface.SANS_SERIF);
        this.f13605g.setAntiAlias(true);
        this.f13605g.setColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.usr_word_quick_bar_text_color));
    }

    public void setQuickHintView(TextView textView) {
        this.f13607i = textView;
    }

    public void setSeparatorAdapter(C3134cc ccVar) {
        this.f13608j = ccVar;
    }

    /* renamed from: a */
    public void mo9949a(ListView listView) {
        this.f13609k = listView;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f13604f = ((float) i4) - ((float) i2);
        this.f13602d = this.f13604f / ((float) f13599a.length);
        this.f13603e = (float) (i3 - i);
        this.f13600b = this.f13603e / 2.0f;
        this.f13601c = this.f13602d / 2.0f;
        this.f13605g.setTextSize((float) (((double) this.f13602d) * 0.8d));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < f13599a.length; i++) {
            canvas.drawText(f13599a[i], this.f13600b, this.f13601c + (((float) i) * this.f13602d), this.f13605g);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int height = getHeight();
        int top = getTop();
        float y = motionEvent.getY();
        if (this.f13608j != null && this.f13608j.mo10266d() > 0) {
            int d = ((int) (y - ((float) top))) / (height / this.f13608j.mo10266d());
            if (d < 0) {
                d = 0;
            } else if (d >= this.f13608j.mo10266d()) {
                d = this.f13608j.mo10266d() - 1;
            }
            int b = this.f13608j.mo10260b(d);
            if (this.f13609k != null) {
                this.f13609k.setSelectionFromTop(b, 0);
            }
            if (action == 0 || action == 2) {
                if (this.f13607i != null) {
                    this.f13607i.setText(this.f13608j.mo10254a(d));
                    this.f13607i.bringToFront();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13607i.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    }
                    this.f13607i.measure(0, 0);
                    int measuredHeight = (int) ((y - ((float) top)) - ((float) this.f13607i.getMeasuredHeight()));
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    } else if (((float) measuredHeight) > this.f13604f) {
                        measuredHeight = (int) this.f13604f;
                    }
                    layoutParams.setMargins(0, measuredHeight, ((int) this.f13603e) * 2, 0);
                    this.f13607i.setLayoutParams(layoutParams);
                    this.f13607i.setVisibility(0);
                }
            } else if (this.f13607i != null) {
                this.f13607i.setVisibility(8);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
