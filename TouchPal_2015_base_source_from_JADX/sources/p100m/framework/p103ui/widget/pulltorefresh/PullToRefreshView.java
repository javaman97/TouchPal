package p100m.framework.p103ui.widget.pulltorefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: m.framework.ui.widget.pulltorefresh.PullToRefreshView */
public class PullToRefreshView extends RelativeLayout {

    /* renamed from: a */
    private static final long f17485a = 1000;

    /* renamed from: b */
    private C4302e f17486b;

    /* renamed from: c */
    private View f17487c;

    /* renamed from: d */
    private View f17488d;

    /* renamed from: e */
    private int f17489e;

    /* renamed from: f */
    private int f17490f;

    /* renamed from: g */
    private float f17491g;

    /* renamed from: h */
    private boolean f17492h;

    /* renamed from: i */
    private boolean f17493i;

    /* renamed from: j */
    private Runnable f17494j;

    /* renamed from: k */
    private long f17495k;

    public PullToRefreshView(Context context) {
        super(context);
        m18000d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18000d();
    }

    public PullToRefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m18000d();
    }

    /* renamed from: d */
    private void m18000d() {
        this.f17494j = new C4311n(this);
    }

    public void setAdapter(C4302e eVar) {
        this.f17486b = eVar;
        removeAllViews();
        this.f17488d = (View) eVar.getBodyView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(11, -1);
        layoutParams.addRule(10, -1);
        addView(this.f17488d, layoutParams);
        this.f17487c = eVar.getHeaderView();
        this.f17487c.measure(0, 0);
        this.f17489e = this.f17487c.getMeasuredHeight();
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, this.f17489e);
        layoutParams2.addRule(9, -1);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.topMargin = -this.f17489e;
        addView(this.f17487c, layoutParams2);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f17491g = motionEvent.getY();
                break;
            case 1:
            case 3:
                if (!this.f17492h) {
                    if (this.f17490f <= this.f17489e) {
                        if (this.f17490f != 0) {
                            m18003g();
                            if (this.f17486b != null) {
                                this.f17486b.onPullDown(0);
                                break;
                            }
                        }
                    } else {
                        this.f17490f = this.f17489e;
                        scrollTo(0, -this.f17490f);
                        if (this.f17486b != null) {
                            this.f17486b.onPullDown(100);
                        }
                        m18001e();
                        motionEvent = m17997a(motionEvent);
                        break;
                    }
                } else {
                    this.f17490f = this.f17489e;
                    scrollTo(0, -this.f17490f);
                    break;
                }
                break;
            case 2:
                float y = motionEvent.getY();
                if (this.f17492h || m18004h()) {
                    this.f17490f = (int) (((float) this.f17490f) + ((y - this.f17491g) / 2.0f));
                    if (this.f17490f > 0) {
                        scrollTo(0, -this.f17490f);
                        if (!this.f17492h && this.f17486b != null) {
                            this.f17486b.onPullDown((this.f17490f * 100) / this.f17489e);
                        }
                        motionEvent = m17997a(motionEvent);
                    } else {
                        this.f17490f = 0;
                        scrollTo(0, 0);
                    }
                }
                this.f17491g = y;
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private MotionEvent m17997a(MotionEvent motionEvent) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    /* renamed from: e */
    private void m18001e() {
        this.f17495k = System.currentTimeMillis();
        this.f17492h = true;
        if (this.f17486b != null) {
            this.f17486b.onRequest();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m18002f() {
        this.f17492h = false;
    }

    /* renamed from: a */
    public void mo15997a(boolean z) {
        this.f17490f = this.f17489e;
        scrollTo(0, -this.f17490f);
        if (z) {
            m18001e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m18003g() {
        this.f17490f = 0;
        scrollTo(0, 0);
        if (this.f17486b != null) {
            this.f17486b.onReversed();
        }
    }

    /* renamed from: a */
    public void mo15996a() {
        long currentTimeMillis = System.currentTimeMillis() - this.f17495k;
        if (currentTimeMillis < 1000) {
            postDelayed(this.f17494j, 1000 - currentTimeMillis);
        } else {
            post(this.f17494j);
        }
    }

    /* renamed from: b */
    public void mo15998b() {
        this.f17493i = true;
    }

    /* renamed from: c */
    public void mo15999c() {
        this.f17493i = false;
    }

    /* renamed from: h */
    private boolean m18004h() {
        return !this.f17493i && this.f17486b.isPullReady();
    }
}
