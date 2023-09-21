package p100m.framework.p103ui.widget.slidingmenu;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;

/* renamed from: m.framework.ui.widget.slidingmenu.BodyContainer */
public class BodyContainer extends HorizontalScrollView {

    /* renamed from: a */
    private static final int f17527a = 500;

    /* renamed from: b */
    private static final int f17528b = 230;

    /* renamed from: c */
    private float f17529c = 2.14748365E9f;

    /* renamed from: d */
    private SlidingMenu f17530d;

    /* renamed from: e */
    private int f17531e;

    /* renamed from: f */
    private VelocityTracker f17532f;

    public BodyContainer(SlidingMenu slidingMenu) {
        super(slidingMenu.getContext());
        this.f17530d = slidingMenu;
        this.f17531e = ViewConfiguration.get(slidingMenu.getContext()).getScaledMaximumFlingVelocity();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f17529c = motionEvent.getX();
                if (this.f17530d.mo16055e() && this.f17529c > ((float) this.f17530d.getMenuWidth()) && motionEvent.getY() > ((float) this.f17530d.getMenuConfig().f17557i)) {
                    super.onInterceptTouchEvent(motionEvent);
                    return true;
                }
            case 1:
            case 3:
                this.f17529c = 2.14748365E9f;
                break;
            case 2:
                if (!this.f17530d.mo16055e() && this.f17529c > ((float) this.f17530d.getShowMenuWidth())) {
                    super.onInterceptTouchEvent(motionEvent);
                    return false;
                }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17532f == null) {
            this.f17532f = VelocityTracker.obtain();
        }
        this.f17532f.addMovement(motionEvent);
        switch (motionEvent.getAction()) {
            case 1:
            case 3:
                if (this.f17530d.mo16055e() && this.f17529c < ((float) this.f17530d.getMenuWidth())) {
                    return false;
                }
                this.f17529c = 2.14748365E9f;
                this.f17532f.computeCurrentVelocity(1000, (float) this.f17531e);
                float xVelocity = this.f17532f.getXVelocity();
                this.f17532f.recycle();
                this.f17532f = null;
                int scrollX = getScrollX();
                if (xVelocity - 500.0f > 0.0f) {
                    this.f17530d.mo16053c();
                } else if (xVelocity + 500.0f < 0.0f) {
                    this.f17530d.mo16054d();
                } else if (scrollX > this.f17530d.getMenuWidth() / 2) {
                    this.f17530d.mo16054d();
                } else {
                    this.f17530d.mo16053c();
                }
                return true;
            default:
                if (!this.f17530d.mo16055e() || this.f17529c >= ((float) this.f17530d.getMenuWidth())) {
                    return super.onTouchEvent(motionEvent);
                }
                return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f17530d.getMenuCover().setBackgroundColor(Color.argb((i * 230) / this.f17530d.getMenuWidth(), 0, 0, 0));
    }
}
