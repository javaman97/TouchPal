package android.support.p001v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.PagerTabStrip */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: f */
    private static final String f849f = "PagerTabStrip";

    /* renamed from: g */
    private static final int f850g = 3;

    /* renamed from: h */
    private static final int f851h = 6;

    /* renamed from: i */
    private static final int f852i = 16;

    /* renamed from: j */
    private static final int f853j = 32;

    /* renamed from: k */
    private static final int f854k = 64;

    /* renamed from: l */
    private static final int f855l = 1;

    /* renamed from: m */
    private static final int f856m = 32;

    /* renamed from: A */
    private float f857A;

    /* renamed from: B */
    private float f858B;

    /* renamed from: C */
    private int f859C;

    /* renamed from: n */
    private int f860n;

    /* renamed from: o */
    private int f861o;

    /* renamed from: p */
    private int f862p;

    /* renamed from: q */
    private int f863q;

    /* renamed from: r */
    private int f864r;

    /* renamed from: s */
    private int f865s;

    /* renamed from: t */
    private final Paint f866t;

    /* renamed from: u */
    private final Rect f867u;

    /* renamed from: v */
    private int f868v;

    /* renamed from: w */
    private boolean f869w;

    /* renamed from: x */
    private boolean f870x;

    /* renamed from: y */
    private int f871y;

    /* renamed from: z */
    private boolean f872z;

    public PagerTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f866t = new Paint();
        this.f867u = new Rect();
        this.f868v = 255;
        this.f869w = false;
        this.f870x = false;
        this.f860n = this.f883e;
        this.f866t.setColor(this.f860n);
        float f = context.getResources().getDisplayMetrics().density;
        this.f861o = (int) ((3.0f * f) + 0.5f);
        this.f862p = (int) ((6.0f * f) + 0.5f);
        this.f863q = (int) (64.0f * f);
        this.f865s = (int) ((16.0f * f) + 0.5f);
        this.f871y = (int) ((1.0f * f) + 0.5f);
        this.f864r = (int) ((f * 32.0f) + 0.5f);
        this.f859C = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f880b.setFocusable(true);
        this.f880b.setOnClickListener(new C0511y(this));
        this.f882d.setFocusable(true);
        this.f882d.setOnClickListener(new C0512z(this));
        if (getBackground() == null) {
            this.f869w = true;
        }
    }

    public void setTabIndicatorColor(int i) {
        this.f860n = i;
        this.f866t.setColor(this.f860n);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i) {
        setTabIndicatorColor(getContext().getResources().getColor(i));
    }

    public int getTabIndicatorColor() {
        return this.f860n;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f862p) {
            i4 = this.f862p;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTextSpacing(int i) {
        if (i < this.f863q) {
            i = this.f863q;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f870x) {
            this.f869w = drawable == null;
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (!this.f870x) {
            this.f869w = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (!this.f870x) {
            this.f869w = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f869w = z;
        this.f870x = true;
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f869w;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f864r);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f872z) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f857A = x;
                this.f858B = y;
                this.f872z = false;
                break;
            case 1:
                if (x >= ((float) (this.f881c.getLeft() - this.f865s))) {
                    if (x > ((float) (this.f881c.getRight() + this.f865s))) {
                        this.f879a.setCurrentItem(this.f879a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f879a.setCurrentItem(this.f879a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f857A) > ((float) this.f859C) || Math.abs(y - this.f858B) > ((float) this.f859C)) {
                    this.f872z = true;
                    break;
                }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f881c.getLeft() - this.f865s;
        int right = this.f881c.getRight() + this.f865s;
        int i = height - this.f861o;
        this.f866t.setColor((this.f868v << 24) | (this.f860n & C0333F.f834r));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f866t);
        if (this.f869w) {
            this.f866t.setColor(-16777216 | (this.f860n & C0333F.f834r));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f871y), (float) (getWidth() - getPaddingRight()), (float) height, this.f866t);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1117a(int i, float f, boolean z) {
        Rect rect = this.f867u;
        int height = getHeight();
        int left = this.f881c.getLeft() - this.f865s;
        int right = this.f881c.getRight() + this.f865s;
        int i2 = height - this.f861o;
        rect.set(left, i2, right, height);
        super.mo1117a(i, f, z);
        this.f868v = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f881c.getLeft() - this.f865s, i2, this.f881c.getRight() + this.f865s, height);
        invalidate(rect);
    }
}
