package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.emoji.keyboard.touchpal.C3305b;

/* renamed from: com.cootek.smartinput5.ui.TButton */
public class TButton extends TextView {

    /* renamed from: a */
    public static final View.OnClickListener f11647a = new C2783cG();

    /* renamed from: b */
    public static final View.OnLongClickListener f11648b = new C2784cH();

    /* renamed from: c */
    private Drawable f11649c;

    /* renamed from: d */
    private Drawable f11650d;

    /* renamed from: e */
    private boolean f11651e = false;

    /* renamed from: f */
    private String f11652f;

    /* renamed from: g */
    private Drawable f11653g;

    /* renamed from: h */
    private String f11654h;

    /* renamed from: i */
    private int f11655i;

    /* renamed from: j */
    private String f11656j;

    /* renamed from: k */
    private boolean f11657k = false;

    /* renamed from: l */
    private boolean f11658l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f11659m = false;

    /* renamed from: n */
    private C2826E f11660n;

    /* renamed from: o */
    private Runnable f11661o = new C2785cI(this);

    public TButton(Context context) {
        super(context);
        m11990b();
    }

    public TButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.TButton);
        this.f11651e = obtainStyledAttributes.getBoolean(1, false);
        this.f11654h = obtainStyledAttributes.getString(0);
        setHapticFeedbackEnabled(false);
        if (!TextUtils.isEmpty(this.f11654h)) {
            this.f11655i = Engine.getInstance().getKeyId(this.f11654h);
            if (this.f11655i >= 0) {
                setOnClickListener(f11647a);
            }
        }
        obtainStyledAttributes.recycle();
        m11990b();
    }

    /* renamed from: b */
    private void m11990b() {
        setSoundEffectsEnabled(false);
        setText(Spannable.Factory.getInstance().newSpannable(""));
        this.f11660n = Engine.getInstance().getWidgetManager().mo9630ad();
    }

    public void setPreviewEnable(boolean z) {
        this.f11651e = z;
    }

    public void setForegroundDrawable(Drawable drawable) {
        this.f11649c = drawable;
    }

    public void setBackgroundHighlighted(boolean z) {
        this.f11657k = z;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f11650d = drawable;
    }

    public void setForegroundDrawableState(int[] iArr) {
        if (this.f11649c != null) {
            this.f11649c.setState(iArr);
        }
    }

    public void setPreviewText(String str) {
        this.f11652f = str;
    }

    public void setPreviewDrawable(Drawable drawable) {
        this.f11653g = drawable;
    }

    /* renamed from: a */
    public void mo8777a() {
        if (this.f11655i >= 0 && Engine.isInitialized()) {
            Engine.getInstance().fireKeyOperation(this.f11655i, 0);
            Engine.getInstance().processEvent();
        }
    }

    public void setMultiLongPressEnable(boolean z) {
        this.f11658l = z;
        if (z) {
            setOnLongClickListener(f11648b);
        } else {
            setOnLongClickListener((View.OnLongClickListener) null);
        }
    }

    public boolean performLongClick() {
        boolean performLongClick = super.performLongClick();
        if (this.f11658l && this.f11659m) {
            removeCallbacks(this.f11661o);
            postDelayed(this.f11661o, 50);
        }
        return performLongClick;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f11650d == null && this.f11649c != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (measuredWidth != 0 || measuredWidth < this.f11649c.getIntrinsicWidth()) {
            }
            if (measuredHeight != 0 || measuredHeight < this.f11649c.getIntrinsicHeight()) {
            }
            setMeasuredDimension(getWidth(), getHeight());
        }
    }

    public void onDraw(Canvas canvas) {
        if (Engine.isInitialized() && this.f11649c != null) {
            this.f11649c.getIntrinsicWidth();
            this.f11649c.getIntrinsicHeight();
            int l = Engine.getInstance().getWidgetManager().mo9651i().mo9726l();
            int l2 = Engine.getInstance().getWidgetManager().mo9651i().mo9726l();
            int n = Engine.getInstance().getWidgetManager().mo9651i().mo9728n();
            float max = Math.max(((float) this.f11649c.getIntrinsicWidth()) / ((float) ((getWidth() - l) - l2)), ((float) this.f11649c.getIntrinsicHeight()) / ((float) ((getHeight() - n) - n)));
            int intrinsicWidth = (int) (((float) this.f11649c.getIntrinsicWidth()) / max);
            int intrinsicHeight = (int) (((float) this.f11649c.getIntrinsicHeight()) / max);
            int width = (getWidth() - intrinsicWidth) / 2;
            int height = (getHeight() - intrinsicHeight) / 2;
            canvas.translate((float) width, (float) height);
            this.f11649c.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f11649c.draw(canvas);
            canvas.translate((float) (-width), (float) (-height));
        }
        super.onDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!Engine.isInitialized()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11659m = true;
            m11991c();
        } else if (action == 2) {
            m11991c();
        } else {
            if (action == 1) {
                Engine.getInstance().feedback();
            }
            this.f11659m = false;
            m11992d();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean isSelected = isSelected();
        Drawable drawable = this.f11650d;
        if (drawable != null && drawable.isStateful()) {
            if (!this.f11657k) {
                drawable.setState(getDrawableState());
            } else if (isSelected) {
                drawable.setState(new int[]{16842913});
            } else {
                drawable.setState(getDrawableState());
            }
            super.setBackgroundDrawable(drawable);
        }
        invalidate();
    }

    /* renamed from: c */
    private void m11991c() {
        if (this.f11651e && Settings.getInstance().getIntSetting(Settings.PREVIEW_LEVEL) != 0) {
            String str = this.f11652f;
            C2833K x = Engine.getInstance().getWidgetManager().mo9667x();
            Rect c = C2833K.m12975c((View) this);
            if (TextUtils.isEmpty(str)) {
                x.mo9297a(c, this.f11653g != null ? this.f11653g : this.f11649c);
            } else {
                x.mo9301a(c, str);
            }
        }
    }

    /* renamed from: d */
    private void m11992d() {
        Engine.getInstance().getWidgetManager().mo9667x().mo9306a(false, true);
    }
}
