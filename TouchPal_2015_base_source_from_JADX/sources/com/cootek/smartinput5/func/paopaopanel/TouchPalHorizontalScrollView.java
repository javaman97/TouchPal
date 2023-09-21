package com.cootek.smartinput5.func.paopaopanel;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.yahoo.mobile.client.share.search.data.SearchStatusData;

public class TouchPalHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private final int f6532a = SearchStatusData.RESPONSE_STATUS_SERVER_ERROR;

    /* renamed from: b */
    private final int f6533b = 50;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Scroller f6534c;

    /* renamed from: d */
    private LinearLayout f6535d;

    /* renamed from: e */
    private Context f6536e;

    /* renamed from: f */
    private int[] f6537f;

    /* renamed from: g */
    private int f6538g = 0;

    /* renamed from: h */
    private C1930b f6539h;

    /* renamed from: i */
    private GestureDetector f6540i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f6541j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f6542k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f6543l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f6544m;

    /* renamed from: n */
    private C1931c f6545n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f6546o = new Handler();

    /* renamed from: p */
    private C1929a f6547p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f6548q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f6549r = false;

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView$c */
    public interface C1931c {
        /* renamed from: a */
        void mo4155a(int i);
    }

    /* renamed from: b */
    static /* synthetic */ int m8839b(TouchPalHorizontalScrollView touchPalHorizontalScrollView) {
        int i = touchPalHorizontalScrollView.f6542k;
        touchPalHorizontalScrollView.f6542k = i + 1;
        return i;
    }

    public TouchPalHorizontalScrollView(Context context) {
        super(context);
        m8834a(context);
    }

    public TouchPalHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m8834a(context);
    }

    public TouchPalHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8834a(context);
    }

    public void setPageListener(C1931c cVar) {
        this.f6545n = cVar;
    }

    /* renamed from: a */
    private void m8834a(Context context) {
        this.f6536e = context;
        this.f6534c = new Scroller(context);
        this.f6535d = new LinearLayout(context);
        this.f6535d.setOrientation(0);
        super.addView(this.f6535d);
        super.setHorizontalFadingEdgeEnabled(false);
        super.setHorizontalScrollBarEnabled(false);
        this.f6539h = new C1930b();
        this.f6540i = new GestureDetector(this.f6539h);
        this.f6542k = 0;
        this.f6537f = new int[1];
        this.f6537f[0] = 0;
    }

    /* renamed from: b */
    private void m8842b(int i) {
        this.f6538g++;
        int[] iArr = new int[(this.f6538g + 1)];
        for (int i2 = 0; i2 < this.f6538g; i2++) {
            iArr[i2] = this.f6537f[i2];
        }
        iArr[this.f6538g] = iArr[this.f6538g - 1] + i;
        this.f6537f = iArr;
    }

    /* renamed from: a */
    public void mo7103a(View view) {
        this.f6535d.addView(view);
        m8842b(view.getLayoutParams().width);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6540i.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 || !this.f6541j) {
            return super.onTouchEvent(motionEvent);
        }
        if (!m8837a(this.f6544m, this.f6543l, 50)) {
            this.f6542k = m8832a(this.f6544m, this.f6543l);
        }
        m8836a(false);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m8844c(int i) {
        for (int i2 = 0; i2 < this.f6538g; i2++) {
            if (i < this.f6537f[i2 + 1] && i >= this.f6537f[i2]) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo7102a(int i) {
        if (i >= 0 && i < this.f6538g) {
            this.f6542k = i;
            m8836a(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8836a(boolean z) {
        this.f6549r = z;
        if (this.f6542k >= this.f6538g) {
            this.f6542k = z ? 0 : this.f6538g - 1;
        } else if (this.f6542k < 0) {
            this.f6542k = 0;
        }
        if (this.f6545n != null) {
            this.f6545n.mo4155a(this.f6542k);
        }
        this.f6541j = false;
        this.f6534c.startScroll(getScrollX(), getScrollY(), this.f6537f[this.f6542k] - getScrollX(), getScrollY(), SearchStatusData.RESPONSE_STATUS_SERVER_ERROR);
        invalidate();
    }

    public void computeScroll() {
        if (this.f6534c.computeScrollOffset()) {
            smoothScrollTo(this.f6534c.getCurrX(), this.f6534c.getCurrY());
            postInvalidate();
        }
    }

    /* renamed from: a */
    public void mo7101a() {
        if (this.f6547p != null) {
            this.f6546o.removeCallbacks(this.f6547p);
        }
        this.f6547p = new C1929a();
        this.f6546o.post(this.f6547p);
    }

    /* renamed from: b */
    public void mo7104b() {
        if (this.f6547p != null) {
            this.f6546o.removeCallbacks(this.f6547p);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView$a */
    private class C1929a implements Runnable {

        /* renamed from: b */
        private static final int f6550b = 3000;

        private C1929a() {
        }

        public void run() {
            if (TouchPalHorizontalScrollView.this.f6548q) {
                TouchPalHorizontalScrollView.this.mo7104b();
                return;
            }
            TouchPalHorizontalScrollView.this.m8836a(true);
            TouchPalHorizontalScrollView.m8839b(TouchPalHorizontalScrollView.this);
            TouchPalHorizontalScrollView.this.f6546o.postDelayed(this, 3000);
        }
    }

    /* renamed from: com.cootek.smartinput5.func.paopaopanel.TouchPalHorizontalScrollView$b */
    private class C1930b extends GestureDetector.SimpleOnGestureListener {
        private C1930b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            boolean unused = TouchPalHorizontalScrollView.this.f6548q = true;
            if (!TouchPalHorizontalScrollView.this.f6534c.isFinished()) {
                TouchPalHorizontalScrollView.this.f6534c.abortAnimation();
                TouchPalHorizontalScrollView.this.mo7104b();
            }
            int unused2 = TouchPalHorizontalScrollView.this.f6542k = TouchPalHorizontalScrollView.this.m8844c(TouchPalHorizontalScrollView.this.getScrollX());
            if (!TouchPalHorizontalScrollView.this.f6549r) {
                return false;
            }
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            TouchPalHorizontalScrollView touchPalHorizontalScrollView = TouchPalHorizontalScrollView.this;
            TouchPalHorizontalScrollView touchPalHorizontalScrollView2 = TouchPalHorizontalScrollView.this;
            if (f > 0.0f) {
                z = false;
            } else {
                z = true;
            }
            int unused = touchPalHorizontalScrollView.f6542k = touchPalHorizontalScrollView2.m8841b(z);
            TouchPalHorizontalScrollView.this.m8836a(false);
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean unused = TouchPalHorizontalScrollView.this.f6541j = true;
            if (motionEvent != null) {
                int unused2 = TouchPalHorizontalScrollView.this.f6544m = (int) motionEvent.getX();
            }
            if (motionEvent2 == null) {
                return false;
            }
            int unused3 = TouchPalHorizontalScrollView.this.f6543l = (int) motionEvent2.getX();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m8841b(boolean z) {
        if (z) {
            return this.f6542k + 1;
        }
        return this.f6542k - 1;
    }

    /* renamed from: a */
    private int m8832a(int i, int i2) {
        return m8841b(i - i2 > 0);
    }

    /* renamed from: a */
    private boolean m8837a(int i, int i2, int i3) {
        if (Math.abs(i - i2) < i3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo7105c() {
        if (this.f6535d != null) {
            this.f6535d.removeAllViews();
        }
        this.f6542k = 0;
        this.f6537f = new int[1];
        this.f6537f[0] = 0;
        this.f6538g = 0;
    }
}
