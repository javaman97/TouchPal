package p100m.framework.p103ui.widget.viewpager;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import p100m.framework.p102b.C4284g;

/* renamed from: m.framework.ui.widget.viewpager.ViewPagerClassic */
public class ViewPagerClassic extends ViewGroup {

    /* renamed from: a */
    private static final int f17576a = 500;

    /* renamed from: g */
    private static final int f17577g = 0;

    /* renamed from: h */
    private static final int f17578h = 1;

    /* renamed from: b */
    private int f17579b;

    /* renamed from: c */
    private Scroller f17580c;

    /* renamed from: d */
    private VelocityTracker f17581d;

    /* renamed from: e */
    private float f17582e;

    /* renamed from: f */
    private float f17583f;

    /* renamed from: i */
    private int f17584i;

    /* renamed from: j */
    private int f17585j;

    /* renamed from: k */
    private int f17586k;

    /* renamed from: l */
    private C4329a f17587l;

    public ViewPagerClassic(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewPagerClassic(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerClassic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17584i = 0;
        m18095a(context);
    }

    /* renamed from: a */
    private void m18095a(Context context) {
        this.f17580c = new Scroller(getContext(), new C4330b(this));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17585j = viewConfiguration.getScaledTouchSlop();
        this.f17586k = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public int getCurrentScreen() {
        return this.f17579b;
    }

    public void setCurrentScreen(int i) {
        if (this.f17587l != null) {
            if (!this.f17580c.isFinished()) {
                this.f17580c.abortAnimation();
            }
            int i2 = this.f17579b;
            this.f17579b = Math.max(0, Math.min(i, getChildCount()));
            this.f17587l.onScreenChange(this.f17579b, i2);
            int a = C4284g.m17937a(getContext()) * this.f17579b;
            this.f17580c.startScroll(0, 0, a, 0);
            scrollTo(a, 0);
        }
    }

    public void computeScroll() {
        if (this.f17587l != null) {
            if (this.f17580c.computeScrollOffset()) {
                scrollTo(this.f17580c.getCurrX(), this.f17580c.getCurrY());
                postInvalidate();
                return;
            }
            int i = this.f17579b;
            int currX = this.f17580c.getCurrX();
            int width = getWidth();
            int i2 = currX / width;
            if (currX % width > width / 2) {
                i2++;
            }
            this.f17579b = Math.max(0, Math.min(i2, getChildCount() - 1));
            if (i != this.f17579b && this.f17587l != null) {
                this.f17587l.onScreenChange(this.f17579b, i);
            }
        }
    }

    public void setAdapter(C4329a aVar) {
        this.f17587l = aVar;
        removeAllViews();
        this.f17579b = 0;
        if (this.f17587l != null) {
            int count = aVar.getCount();
            for (int i = 0; i < count; i++) {
                addView(aVar.getView(i, this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f17587l != null && getChildCount() > 0) {
            long drawingTime = getDrawingTime();
            if (this.f17579b > 0) {
                drawChild(canvas, getChildAt(this.f17579b - 1), drawingTime);
            }
            drawChild(canvas, getChildAt(this.f17579b), drawingTime);
            if (this.f17579b < getChildCount() - 1) {
                drawChild(canvas, getChildAt(this.f17579b + 1), drawingTime);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f17587l == null) {
            super.onMeasure(i, i2);
            return;
        }
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C4284g.m17937a(getContext()), 1073741824);
        int i3 = 0;
        int i4 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            childAt.measure(makeMeasureSpec, 0);
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight <= i4) {
                measuredHeight = i4;
            }
            i3++;
            i4 = measuredHeight;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec2);
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f17587l != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int childCount = getChildCount();
            int i7 = 0;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    childAt.layout(i7, 0, i7 + i5, i6);
                    i7 += i5;
                }
            }
        }
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (this.f17587l == null) {
            return super.dispatchUnhandledMove(view, i);
        }
        if (i == 17) {
            if (this.f17579b > 0) {
                mo16097a(this.f17579b - 1);
                return true;
            }
        } else if (i == 66 && this.f17579b < getChildCount() - 1) {
            mo16097a(this.f17579b + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f17584i != 0) {
            return true;
        }
        if (this.f17581d == null) {
            this.f17581d = VelocityTracker.obtain();
        }
        this.f17581d.addMovement(motionEvent);
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f17582e = x;
                this.f17583f = y;
                this.f17584i = this.f17580c.isFinished() ? 0 : 1;
                break;
            case 1:
            case 3:
                if (this.f17581d != null) {
                    this.f17581d.recycle();
                    this.f17581d = null;
                }
                this.f17584i = 0;
                break;
            case 2:
                m18096a(motionEvent);
                break;
        }
        if (this.f17584i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m18096a(MotionEvent motionEvent) {
        boolean z = false;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int abs = (int) Math.abs(x - this.f17582e);
        int abs2 = (int) Math.abs(y - this.f17583f);
        boolean z2 = abs > this.f17585j;
        if (abs2 > this.f17585j) {
            z = true;
        }
        if ((z2 || z) && z2) {
            this.f17584i = 1;
            this.f17582e = x;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17587l == null) {
            return false;
        }
        if (this.f17581d == null) {
            this.f17581d = VelocityTracker.obtain();
        }
        this.f17581d.addMovement(motionEvent);
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        switch (action) {
            case 0:
                if (this.f17584i != 0) {
                    if (!this.f17580c.isFinished()) {
                        this.f17580c.abortAnimation();
                    }
                    this.f17582e = x;
                    break;
                }
                break;
            case 1:
                if (this.f17584i == 1) {
                    VelocityTracker velocityTracker = this.f17581d;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f17586k);
                    int xVelocity = (int) velocityTracker.getXVelocity();
                    if (xVelocity > 500 && this.f17579b > 0) {
                        mo16097a(this.f17579b - 1);
                    } else if (xVelocity >= -500 || this.f17579b >= getChildCount() - 1) {
                        int width = getWidth();
                        mo16097a((getScrollX() + (width / 2)) / width);
                    } else {
                        mo16097a(this.f17579b + 1);
                    }
                    if (this.f17581d != null) {
                        this.f17581d.recycle();
                        this.f17581d = null;
                    }
                }
                this.f17584i = 0;
                break;
            case 2:
                if (this.f17584i != 1) {
                    if (onInterceptTouchEvent(motionEvent) && this.f17584i == 1) {
                        m18097b(motionEvent);
                        break;
                    }
                } else {
                    m18097b(motionEvent);
                    break;
                }
            case 3:
                this.f17584i = 0;
                break;
        }
        return true;
    }

    /* renamed from: b */
    private void m18097b(MotionEvent motionEvent) {
        int right;
        if (this.f17587l != null) {
            float x = motionEvent.getX();
            int i = (int) (this.f17582e - x);
            this.f17582e = x;
            if (i < 0) {
                if (getScrollX() > 0) {
                    scrollBy(Math.max(-getScrollX(), i), 0);
                }
            } else if (i > 0 && getChildCount() != 0 && (right = (getChildAt(getChildCount() - 1).getRight() - getScrollX()) - getWidth()) > 0) {
                scrollBy(Math.min(right, i), 0);
            }
        }
    }

    /* renamed from: a */
    public void mo16097a(int i) {
        m18094a(i, false);
    }

    /* renamed from: a */
    private void m18094a(int i, boolean z) {
        boolean z2 = i != this.f17579b;
        View focusedChild = getFocusedChild();
        if (focusedChild != null && z2 && focusedChild == getChildAt(this.f17579b)) {
            focusedChild.clearFocus();
        }
        int width = (getWidth() * i) - getScrollX();
        this.f17580c.startScroll(getScrollX(), 0, width, 0, z ? 0 : Math.abs(width) / 2);
        invalidate();
    }

    /* renamed from: a */
    public void mo16096a() {
        if (this.f17587l != null && this.f17579b > 0 && this.f17580c.isFinished()) {
            mo16097a(this.f17579b - 1);
        }
    }

    /* renamed from: b */
    public void mo16098b() {
        if (this.f17587l != null && this.f17579b < getChildCount() - 1 && this.f17580c.isFinished()) {
            mo16097a(this.f17579b + 1);
        }
    }
}
