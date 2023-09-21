package android.support.p001v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.support.p001v4.view.C0333F;
import android.support.p001v4.view.C0505v;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;

/* renamed from: android.support.v4.widget.SwipeRefreshLayout */
public class SwipeRefreshLayout extends ViewGroup {

    /* renamed from: C */
    private static final int[] f1310C = {16842766};

    /* renamed from: a */
    private static final String f1311a = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: b */
    private static final long f1312b = 300;

    /* renamed from: c */
    private static final float f1313c = 1.5f;

    /* renamed from: d */
    private static final float f1314d = 2.0f;

    /* renamed from: e */
    private static final float f1315e = 4.0f;

    /* renamed from: f */
    private static final float f1316f = 0.6f;

    /* renamed from: g */
    private static final int f1317g = 120;

    /* renamed from: h */
    private static final int f1318h = -1;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final DecelerateInterpolator f1319A;

    /* renamed from: B */
    private final AccelerateInterpolator f1320B;

    /* renamed from: D */
    private final Animation f1321D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Animation f1322E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final Animation.AnimationListener f1323F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Animation.AnimationListener f1324G;

    /* renamed from: H */
    private final Runnable f1325H;

    /* renamed from: I */
    private final Runnable f1326I;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0517C f1327i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f1328j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f1329k;

    /* renamed from: l */
    private C0547b f1330l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f1331m;

    /* renamed from: n */
    private boolean f1332n;

    /* renamed from: o */
    private int f1333o;

    /* renamed from: p */
    private float f1334p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f1335q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1336r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1337s;

    /* renamed from: t */
    private int f1338t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1339u;

    /* renamed from: v */
    private float f1340v;

    /* renamed from: w */
    private float f1341w;

    /* renamed from: x */
    private boolean f1342x;

    /* renamed from: y */
    private int f1343y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f1344z;

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$b */
    public interface C0547b {
        /* renamed from: a */
        void mo1884a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1332n = false;
        this.f1334p = -1.0f;
        this.f1336r = 0.0f;
        this.f1337s = 0.0f;
        this.f1343y = -1;
        this.f1321D = new C0518D(this);
        this.f1322E = new C0527E(this);
        this.f1323F = new C0528F(this);
        this.f1324G = new C0529G(this);
        this.f1325H = new C0530H(this);
        this.f1326I = new C0531I(this);
        this.f1333o = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f1335q = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f1327i = new C0517C(this);
        this.f1338t = (int) (getResources().getDisplayMetrics().density * f1315e);
        this.f1319A = new DecelerateInterpolator(f1314d);
        this.f1320B = new AccelerateInterpolator(f1313c);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1310C);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f1326I);
        removeCallbacks(this.f1325H);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1325H);
        removeCallbacks(this.f1326I);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3124a(int i, Animation.AnimationListener animationListener) {
        this.f1331m = i;
        this.f1321D.reset();
        this.f1321D.setDuration((long) this.f1335q);
        this.f1321D.setAnimationListener(animationListener);
        this.f1321D.setInterpolator(this.f1319A);
        this.f1328j.startAnimation(this.f1321D);
    }

    public void setOnRefreshListener(C0547b bVar) {
        this.f1330l = bVar;
    }

    private void setTriggerPercentage(float f) {
        if (f == 0.0f) {
            this.f1337s = 0.0f;
            return;
        }
        this.f1337s = f;
        this.f1327i.mo1699a(f);
    }

    public void setRefreshing(boolean z) {
        if (this.f1332n != z) {
            m3133c();
            this.f1337s = 0.0f;
            this.f1332n = z;
            if (this.f1332n) {
                this.f1327i.mo1698a();
            } else {
                this.f1327i.mo1702b();
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo1867a(int i, int i2, int i3, int i4) {
        mo1869b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public void mo1869b(int i, int i2, int i3, int i4) {
        Resources resources = getResources();
        mo1871c(resources.getColor(i), resources.getColor(i2), resources.getColor(i3), resources.getColor(i4));
    }

    /* renamed from: c */
    public void mo1871c(int i, int i2, int i3, int i4) {
        m3133c();
        this.f1327i.mo1700a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public boolean mo1868a() {
        return this.f1332n;
    }

    /* renamed from: c */
    private void m3133c() {
        if (this.f1328j == null) {
            if (getChildCount() <= 1 || isInEditMode()) {
                this.f1328j = getChildAt(0);
                this.f1329k = this.f1328j.getTop() + getPaddingTop();
            } else {
                throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
            }
        }
        if (this.f1334p == -1.0f && getParent() != null && ((View) getParent()).getHeight() > 0) {
            this.f1334p = (float) ((int) Math.min(((float) ((View) getParent()).getHeight()) * f1316f, getResources().getDisplayMetrics().density * 120.0f));
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f1327i.mo1701a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f1327i.mo1703b(0, 0, measuredWidth, this.f1338t);
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft();
            int paddingTop = this.f1339u + getPaddingTop();
            childAt.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getChildCount() > 1 && !isInEditMode()) {
            throw new IllegalStateException("SwipeRefreshLayout can host only one direct child");
        } else if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    /* renamed from: b */
    public boolean mo1870b() {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 14) {
            return C0333F.m1351b(this.f1328j, -1);
        }
        if (this.f1328j instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f1328j;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        if (this.f1328j.getScrollY() <= 0) {
            z = false;
        }
        return z;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m3133c();
        int a = C0505v.m2867a(motionEvent);
        if (this.f1344z && a == 0) {
            this.f1344z = false;
        }
        if (!isEnabled() || this.f1344z || mo1870b()) {
            return false;
        }
        switch (a) {
            case 0:
                float y = motionEvent.getY();
                this.f1340v = y;
                this.f1341w = y;
                this.f1343y = C0505v.m2870b(motionEvent, 0);
                this.f1342x = false;
                this.f1337s = 0.0f;
                break;
            case 1:
            case 3:
                this.f1342x = false;
                this.f1337s = 0.0f;
                this.f1343y = -1;
                break;
            case 2:
                if (this.f1343y != -1) {
                    int a2 = C0505v.m2868a(motionEvent, this.f1343y);
                    if (a2 >= 0) {
                        float d = C0505v.m2873d(motionEvent, a2);
                        if (d - this.f1340v > ((float) this.f1333o)) {
                            this.f1341w = d;
                            this.f1342x = true;
                            break;
                        }
                    } else {
                        Log.e(f1311a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                } else {
                    Log.e(f1311a, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                break;
            case 6:
                m3127a(motionEvent);
                break;
        }
        return this.f1342x;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0505v.m2867a(motionEvent);
        if (this.f1344z && a == 0) {
            this.f1344z = false;
        }
        if (!isEnabled() || this.f1344z || mo1870b()) {
            return false;
        }
        switch (a) {
            case 0:
                float y = motionEvent.getY();
                this.f1340v = y;
                this.f1341w = y;
                this.f1343y = C0505v.m2870b(motionEvent, 0);
                this.f1342x = false;
                this.f1337s = 0.0f;
                break;
            case 1:
            case 3:
                this.f1342x = false;
                this.f1337s = 0.0f;
                this.f1343y = -1;
                return false;
            case 2:
                int a2 = C0505v.m2868a(motionEvent, this.f1343y);
                if (a2 >= 0) {
                    float d = C0505v.m2873d(motionEvent, a2);
                    float f = d - this.f1340v;
                    if (!this.f1342x && f > ((float) this.f1333o)) {
                        this.f1342x = true;
                    }
                    if (this.f1342x) {
                        if (f > this.f1334p) {
                            m3135d();
                        } else {
                            setTriggerPercentage(this.f1320B.getInterpolation(f / this.f1334p));
                            m3123a((int) f);
                            if (this.f1341w <= d || this.f1328j.getTop() != getPaddingTop()) {
                                m3137e();
                            } else {
                                removeCallbacks(this.f1326I);
                            }
                        }
                        this.f1341w = d;
                        break;
                    }
                } else {
                    Log.e(f1311a, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                break;
            case 5:
                int b = C0505v.m2869b(motionEvent);
                this.f1341w = C0505v.m2873d(motionEvent, b);
                this.f1343y = C0505v.m2870b(motionEvent, b);
                break;
            case 6:
                m3127a(motionEvent);
                break;
        }
        return true;
    }

    /* renamed from: d */
    private void m3135d() {
        removeCallbacks(this.f1326I);
        this.f1325H.run();
        setRefreshing(true);
        this.f1330l.mo1884a();
    }

    /* renamed from: a */
    private void m3123a(int i) {
        int top = this.f1328j.getTop();
        if (((float) i) > this.f1334p) {
            i = (int) this.f1334p;
        } else if (i < 0) {
            i = 0;
        }
        setTargetOffsetTopAndBottom(i - top);
    }

    /* access modifiers changed from: private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f1328j.offsetTopAndBottom(i);
        this.f1339u = this.f1328j.getTop();
    }

    /* renamed from: e */
    private void m3137e() {
        removeCallbacks(this.f1326I);
        postDelayed(this.f1326I, f1312b);
    }

    /* renamed from: a */
    private void m3127a(MotionEvent motionEvent) {
        int b = C0505v.m2869b(motionEvent);
        if (C0505v.m2870b(motionEvent, b) == this.f1343y) {
            int i = b == 0 ? 1 : 0;
            this.f1341w = C0505v.m2873d(motionEvent, i);
            this.f1343y = C0505v.m2870b(motionEvent, i);
        }
    }

    /* renamed from: android.support.v4.widget.SwipeRefreshLayout$a */
    private class C0546a implements Animation.AnimationListener {
        private C0546a() {
        }

        /* synthetic */ C0546a(SwipeRefreshLayout swipeRefreshLayout, C0518D d) {
            this();
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }
}
