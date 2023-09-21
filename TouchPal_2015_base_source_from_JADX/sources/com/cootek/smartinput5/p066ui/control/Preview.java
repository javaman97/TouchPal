package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.Preview */
public class Preview extends TextView {

    /* renamed from: a */
    public static final int f12792a = 1;

    /* renamed from: b */
    private Drawable f12793b;

    /* renamed from: c */
    private String f12794c;

    /* renamed from: d */
    private Paint f12795d;

    /* renamed from: e */
    private int f12796e;

    /* renamed from: f */
    private boolean f12797f;

    /* renamed from: g */
    private int f12798g;

    /* renamed from: h */
    private int f12799h;

    /* renamed from: i */
    private int f12800i;

    /* renamed from: j */
    private boolean f12801j;

    /* renamed from: k */
    private int f12802k = -1;

    /* renamed from: l */
    private int f12803l;

    /* renamed from: m */
    private int f12804m;

    public Preview(Context context) {
        super(context);
        m13032b();
    }

    public Preview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13032b();
    }

    public void setFlag(int i) {
        this.f12798g = i;
    }

    public int getFlag() {
        return this.f12798g;
    }

    public void setKeyType(int i) {
        this.f12802k = i;
    }

    public int getKeyType() {
        return this.f12802k;
    }

    /* renamed from: a */
    public void mo9361a() {
        int a;
        C1602bh n = C1368X.m6320c().mo5841n();
        C2787cK cKVar = C2787cK.KEY_TEXT;
        switch (this.f12802k) {
            case 0:
                a = n.mo6248a((int) R.color.key_main_popup_text_color, cKVar);
                break;
            case 1:
            case 2:
                a = n.mo6248a((int) R.color.key_func_popup_text_color, cKVar);
                break;
            default:
                a = n.mo6248a((int) R.color.popup_preview_text_color, cKVar);
                break;
        }
        setTextColor(a);
        this.f12795d.setColor(a);
        this.f12802k = -1;
    }

    public void setIconWithMainTitle(boolean z) {
        this.f12797f = z;
    }

    /* renamed from: b */
    private void m13032b() {
        this.f12798g = 0;
        C1602bh n = C1368X.m6320c().mo5841n();
        this.f12799h = n.mo6265c((int) R.dimen.preview_textsize);
        this.f12800i = n.mo6265c((int) R.dimen.preview_textsize_large);
        setTextSize(0, (float) this.f12799h);
        this.f12801j = false;
        setGravity(17);
        setBackgroundDrawable((Drawable) null);
        setTypeface(C1624bv.m7418a());
        this.f12794c = C1974m.m9063a(getContext(), (int) R.string.extend_key_flag);
        this.f12795d = new Paint();
        this.f12795d.setAntiAlias(true);
        this.f12795d.setTextAlign(Paint.Align.RIGHT);
        this.f12795d.setTextSize((float) n.mo6265c((int) R.dimen.preview_extendkey_flag_textsize));
        this.f12795d.setTypeface(C1624bv.m7418a());
        this.f12796e = n.mo6265c((int) R.dimen.extend_key_offset_y);
    }

    public void setTextSizeLarge(boolean z) {
        if (z && !this.f12801j) {
            setTextSize(0, (float) this.f12800i);
            this.f12801j = true;
        } else if (!z && this.f12801j) {
            setTextSize(0, (float) this.f12799h);
            this.f12801j = false;
        }
    }

    public void setForeDrawable(Drawable drawable) {
        this.f12793b = drawable;
        this.f12803l = 0;
        this.f12804m = 0;
    }

    /* renamed from: a */
    public void mo9362a(Drawable drawable, int i, int i2) {
        this.f12793b = drawable;
        this.f12804m = i;
        this.f12803l = i2;
    }

    public Drawable getForeDrawable() {
        return this.f12793b;
    }

    public void setForeDrawableState(int[] iArr) {
        if (this.f12793b != null) {
            this.f12793b.setState(iArr);
        }
    }

    private int getForeDrawableHeight() {
        if (this.f12803l <= 0) {
            return this.f12793b.getIntrinsicHeight();
        }
        return this.f12803l;
    }

    private int getForeDrawableWidth() {
        if (this.f12804m <= 0) {
            return this.f12793b.getIntrinsicWidth();
        }
        return this.f12804m;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f12793b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int foreDrawableWidth = getForeDrawableWidth();
            if (measuredWidth >= foreDrawableWidth) {
                foreDrawableWidth = measuredWidth;
            }
            int foreDrawableHeight = getForeDrawableHeight();
            if (measuredHeight >= foreDrawableHeight) {
                foreDrawableHeight = measuredHeight;
            }
            setMeasuredDimension(foreDrawableWidth, foreDrawableHeight);
        }
    }

    public void onDraw(Canvas canvas) {
        int width;
        int height;
        int i;
        int i2;
        if ((this.f12798g & 1) != 0) {
            canvas.drawText(this.f12794c, (float) (getWidth() - this.f12796e), (float) (getHeight() - this.f12796e), this.f12795d);
        }
        if (this.f12793b != null) {
            if (!this.f12797f) {
                width = getForeDrawableWidth();
                height = getForeDrawableHeight();
                i2 = getPaddingLeft() + ((getWidth() - width) / 2);
                i = ((getHeight() - height) / 2) + getPaddingTop();
            } else {
                width = getWidth();
                height = getHeight();
                i = 0;
                i2 = 0;
            }
            canvas.translate((float) i2, (float) i);
            this.f12793b.setBounds(0, 0, width, height);
            this.f12793b.draw(canvas);
            canvas.translate((float) (-i2), (float) (-i));
        }
        this.f12797f = false;
        super.onDraw(canvas);
    }
}
