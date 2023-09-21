package com.cootek.smartinput5.func.smileypanel;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.SoftKeyboardView;
import com.emoji.keyboard.touchpal.R;

public class SmileyScrollView extends RelativeLayout {

    /* renamed from: F */
    private static Handler f6915F = new Handler();

    /* renamed from: a */
    private static final String f6916a = "SmileyScrollView";

    /* renamed from: b */
    private static final int f6917b = 0;

    /* renamed from: c */
    private static final int f6918c = 1;

    /* renamed from: d */
    private static final int f6919d = 2;

    /* renamed from: e */
    private static final int f6920e = 0;

    /* renamed from: f */
    private static final int f6921f = 1;

    /* renamed from: g */
    private static final int f6922g = 2;

    /* renamed from: h */
    private static final int f6923h = 3;

    /* renamed from: i */
    private static final int f6924i = 130;

    /* renamed from: j */
    private static final int f6925j = 195;

    /* renamed from: k */
    private static final int f6926k = 150;

    /* renamed from: l */
    private static final int f6927l = 200;

    /* renamed from: m */
    private static final int f6928m = 1000;

    /* renamed from: o */
    private static final int f6929o = 204;

    /* renamed from: p */
    private static final int f6930p = 0;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f6931A = 0;

    /* renamed from: B */
    private int f6932B;

    /* renamed from: C */
    private int f6933C;

    /* renamed from: D */
    private int f6934D = 0;

    /* renamed from: E */
    private boolean f6935E = true;

    /* renamed from: G */
    private int f6936G;

    /* renamed from: H */
    private int f6937H;

    /* renamed from: I */
    private int f6938I;

    /* renamed from: n */
    private int f6939n;

    /* renamed from: q */
    private Context f6940q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Scroller f6941r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C2000a f6942s;

    /* renamed from: t */
    private C2001b f6943t;

    /* renamed from: u */
    private int f6944u = 0;

    /* renamed from: v */
    private int f6945v = 0;

    /* renamed from: w */
    private C2002c f6946w;

    /* renamed from: x */
    private GestureDetector f6947x;

    /* renamed from: y */
    private int f6948y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f6949z = 0;

    /* renamed from: com.cootek.smartinput5.func.smileypanel.SmileyScrollView$a */
    public interface C2000a {
        /* renamed from: g */
        void mo7343g();

        /* renamed from: h */
        void mo7344h();
    }

    /* renamed from: com.cootek.smartinput5.func.smileypanel.SmileyScrollView$b */
    public interface C2001b {
        /* renamed from: a */
        void mo7327a(int i);
    }

    public SmileyScrollView(Context context) {
        super(context);
        m9246a(context);
    }

    public SmileyScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9246a(context);
    }

    public SmileyScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9246a(context);
    }

    /* renamed from: a */
    private void m9246a(Context context) {
        this.f6940q = context;
        this.f6935E = Engine.getInstance().getWidgetManager().mo9630ad().mo9266x() == 0 || Engine.getInstance().getWidgetManager().mo9630ad().mo9259q();
        if (this.f6935E) {
            this.f6939n = C1368X.m6320c().mo5841n().mo6260b((int) R.color.smiley_panel_mask_color);
            setBackgroundColor(this.f6939n);
        } else {
            SmileyListView r = Engine.getInstance().getWidgetManager().mo9661r();
            if (r != null) {
                r.setViewAlpha(0);
            }
        }
        this.f6941r = new Scroller(context, new LinearInterpolator());
        this.f6946w = new C2002c(this, (C2062l) null);
        this.f6947x = new GestureDetector(this.f6946w);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9244a(int i) {
        float f = 1.0f;
        if (Engine.isInitialized()) {
            float scrollHeight = ((float) i) / ((float) getScrollHeight());
            if (this.f6935E) {
                getBackground().setAlpha((int) (((1.0f - scrollHeight) * 204.0f) + 0.0f));
                SmileyListView r = Engine.getInstance().getWidgetManager().mo9661r();
                if (r != null) {
                    r.setViewAlpha(255);
                    return;
                }
                return;
            }
            if (scrollHeight + 0.05f < 1.0f) {
                f = scrollHeight == 0.0f ? 0.0f : scrollHeight + 0.05f;
            }
            int i2 = (int) (f * 255.0f);
            C2917du widgetManager = Engine.getInstance().getWidgetManager();
            if (widgetManager != null) {
                SoftKeyboardView g = widgetManager.mo9648g();
                if (g != null && (g.getKeyboard() instanceof C2063m)) {
                    g.setViewAlpha(i2);
                }
                SmileyListView r2 = widgetManager.mo9661r();
                if (r2 != null) {
                    r2.setViewAlpha(i2);
                }
            }
        }
    }

    public void setOnScrollFinishedListener(C2000a aVar) {
        this.f6942s = aVar;
    }

    public void setOnScrollPositionChangedListener(C2001b bVar) {
        this.f6943t = bVar;
    }

    public void computeScroll() {
        if (this.f6941r.computeScrollOffset()) {
            int currY = this.f6941r.getCurrY();
            if (this.f6931A == 2) {
                if (currY == this.f6941r.getFinalY()) {
                    this.f6941r.forceFinished(true);
                    this.f6941r.abortAnimation();
                    this.f6931A = 0;
                    if (currY == 0 || currY == getScrollHeight()) {
                        m9243a();
                    } else {
                        mo7332a(this.f6948y, true);
                    }
                }
            } else if (this.f6941r.timePassed() >= this.f6941r.getDuration()) {
                m9243a();
            }
            scrollTo(this.f6941r.getCurrX(), currY);
            postInvalidate();
        }
    }

    /* renamed from: a */
    private void m9243a() {
        this.f6941r.forceFinished(true);
        this.f6933C = 0;
        this.f6938I = 0;
        if (this.f6931A == 3) {
            this.f6931A = 0;
        } else {
            f6915F.post(new C2062l(this));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!(this.f6931A == 2 || this.f6931A == 1 || this.f6947x.onTouchEvent(motionEvent))) {
            if (this.f6931A != 3) {
                if (motionEvent.getAction() == 1) {
                    z = true;
                } else if (motionEvent.getAction() == 2) {
                }
                if (m9248a(motionEvent)) {
                    int y = (int) motionEvent.getY();
                    if (!z && this.f6949z == 0) {
                        y = m9250b(motionEvent);
                    }
                    mo7332a(m9249b(y, z), z);
                    this.f6936G = motionEvent.getAction();
                    this.f6937H = y;
                }
            } else if (motionEvent.getAction() == 1) {
                this.f6941r.forceFinished(true);
                this.f6941r.abortAnimation();
                this.f6931A = 0;
                mo7332a(m9249b((int) motionEvent.getY(), true), true);
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m9248a(MotionEvent motionEvent) {
        return (this.f6936G == 2 && motionEvent.getAction() == 2 && this.f6937H == ((int) motionEvent.getY())) ? false : true;
    }

    public void setFuncbarPositionY(int i) {
        this.f6938I = i;
    }

    /* renamed from: b */
    private int m9250b(MotionEvent motionEvent) {
        if (motionEvent != null) {
            return ((int) motionEvent.getRawY()) - this.f6938I;
        }
        return 0;
    }

    /* renamed from: b */
    private int m9249b(int i, boolean z) {
        int i2;
        int scrollHeight = getScrollHeight() - this.f6933C;
        if (!z) {
            int i3 = scrollHeight - i;
            if (i3 < 0) {
                return 0;
            }
            if (i3 > scrollHeight) {
                return scrollHeight;
            }
            return i3;
        }
        if (this.f6934D == 0) {
            i2 = (scrollHeight * 4) / 5;
        } else {
            i2 = scrollHeight / 2;
        }
        if (i < i2) {
            return scrollHeight;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo7332a(int i, boolean z) {
        int i2 = 0;
        int scrollY = i - getScrollY();
        int abs = (Math.abs(scrollY) * 130) / getScrollHeight();
        if (z) {
            if (this.f6949z == 0) {
                abs = (Math.abs(scrollY) * 195) / getScrollHeight();
            }
            this.f6931A = 1;
            this.f6941r.startScroll(getScrollX(), getScrollY(), 0, scrollY, abs);
        } else {
            abs = (Math.abs(scrollY) * 150) / getScrollHeight();
            this.f6931A = 3;
            this.f6941r.startScroll(getScrollX(), getScrollY(), 0, scrollY, abs);
        }
        if (abs == 0) {
            m9243a();
        }
        if (this.f6949z != 2) {
            this.f6934D = this.f6949z;
        }
        this.f6949z = 2;
        int scrollX = getScrollX();
        if (getScrollY() > 0) {
            i2 = getScrollY() - 1;
        } else if (i > 0) {
            i2 = 1;
        }
        scrollTo(scrollX, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9245a(int i, int i2) {
        int i3 = 0;
        this.f6948y = i;
        if (i == getScrollY()) {
            m9243a();
            return;
        }
        this.f6931A = 2;
        int scrollY = i - getScrollY();
        this.f6941r.startScroll(getScrollX(), getScrollY(), 0, scrollY, (Math.abs(scrollY) * 200) / getScrollHeight());
        int scrollX = getScrollX();
        if (getScrollY() > 0) {
            i3 = getScrollY() - 1;
        } else if (i > 0) {
            i3 = 1;
        }
        scrollTo(scrollX, i3);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        m9244a(i2);
        if (this.f6943t != null) {
            this.f6943t.mo7327a(i2);
        }
    }

    public int getScrollHeight() {
        if (this.f6944u == 0) {
            this.f6944u = this.f6932B;
        }
        return this.f6944u;
    }

    /* renamed from: com.cootek.smartinput5.func.smileypanel.SmileyScrollView$c */
    private class C2002c extends GestureDetector.SimpleOnGestureListener {
        private C2002c() {
        }

        /* synthetic */ C2002c(SmileyScrollView smileyScrollView, C2062l lVar) {
            this();
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int scrollHeight;
            if (f2 == 0.0f || Math.abs(f2) < 1000.0f) {
                return false;
            }
            if (f2 > 0.0f) {
                scrollHeight = 0;
            } else {
                scrollHeight = SmileyScrollView.this.getScrollHeight();
            }
            if (SmileyScrollView.this.f6931A == 3) {
                SmileyScrollView.this.f6941r.forceFinished(true);
                SmileyScrollView.this.f6941r.abortAnimation();
                int unused = SmileyScrollView.this.f6931A = 0;
            }
            SmileyScrollView.this.m9245a(scrollHeight, (int) f2);
            return true;
        }
    }

    public void setTotolHeight(int i) {
        this.f6932B = i;
    }

    public int getDragBarHeight() {
        return this.f6945v;
    }

    public void setBottomHeight(int i) {
        this.f6933C = i;
    }
}
