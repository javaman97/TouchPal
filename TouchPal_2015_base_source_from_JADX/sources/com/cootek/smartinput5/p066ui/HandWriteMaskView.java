package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.MoveContrailView;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.HandWriteMaskView */
public class HandWriteMaskView extends MoveContrailView implements CandidateManager.ICandidateListener, FilterManager.IFilterListener, C2826E.C2827a {

    /* renamed from: F */
    private static final int f11354F = 0;

    /* renamed from: c */
    private static final String f11355c = "HandWriteMaskView";

    /* renamed from: d */
    private static final int f11356d = 10;

    /* renamed from: e */
    private static final int f11357e = -1;

    /* renamed from: f */
    private static final int f11358f = 0;

    /* renamed from: g */
    private static final int f11359g = 1;

    /* renamed from: h */
    private static final int f11360h = 2;

    /* renamed from: i */
    private static final int f11361i = 1500;

    /* renamed from: j */
    private static final int f11362j = 400;

    /* renamed from: A */
    private long f11363A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C2826E f11364B;

    /* renamed from: C */
    private final float f11365C;

    /* renamed from: D */
    private MotionEvent f11366D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public LinkedList<MotionEvent> f11367E;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Handler f11368G = new C2664aD(this);

    /* renamed from: H */
    private ArrayList<C2620a> f11369H;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public PopupWindow f11370k;

    /* renamed from: l */
    private MoveContrail f11371l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public View f11372m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f11373n;

    /* renamed from: o */
    private View f11374o;

    /* renamed from: p */
    private int f11375p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f11376q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Runnable f11377r;

    /* renamed from: s */
    private Runnable f11378s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f11379t;

    /* renamed from: u */
    private Paint f11380u = new Paint();

    /* renamed from: v */
    private Paint f11381v = new Paint();

    /* renamed from: w */
    private Paint f11382w = new Paint();

    /* renamed from: x */
    private boolean f11383x;

    /* renamed from: y */
    private boolean f11384y;

    /* renamed from: z */
    private boolean f11385z;

    /* renamed from: com.cootek.smartinput5.ui.HandWriteMaskView$a */
    public interface C2620a {
        /* renamed from: b */
        void mo7425b(MotionEvent motionEvent);
    }

    public HandWriteMaskView(Context context) {
        super(context);
        setAniEffectEnable(false);
        setStrokeFadeOut(true);
        Resources resources = context.getResources();
        this.f11365C = resources.getDisplayMetrics().density;
        this.f11370k = new PopupWindow(this, Engine.getInstance().getWidgetManager().mo9630ad().mo9262t(), Engine.getInstance().getWidgetManager().mo9651i().mo9718d() + Engine.getInstance().getWidgetManager().mo9643e().getHeight());
        this.f11370k.setTouchable(true);
        this.f11370k.setOnDismissListener(new C2665aE(this));
        this.f11371l = new MoveContrail();
        this.f11376q = false;
        this.f11377r = new C2666aF(this);
        this.f11378s = new C2667aG(this);
        this.f11379t = -1;
        this.f11381v.setColor(-4144960);
        this.f11381v.setStyle(Paint.Style.STROKE);
        this.f11381v.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.border_line_width));
        this.f11381v.setPathEffect(new DashPathEffect(new float[]{15.0f, 5.0f}, 1.0f));
        this.f11382w.setColor(Integer.MIN_VALUE);
        this.f11382w.setStyle(Paint.Style.FILL);
        this.f11364B = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11364B.mo9238a((C2826E.C2827a) this);
        this.f11380u.setColor(1627389951);
        this.f11380u.setTextSize((float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.magic_text_size));
        this.f11369H = new ArrayList<>();
        this.f11367E = new LinkedList<>();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public boolean m11800j() {
        if (C1368X.m6320c().mo5848u().mo5599c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        setStrokeColor(Color.parseColor(Settings.getInstance().getStringSetting(100)));
        setCurveWidth((((float) Settings.getInstance().getIntSetting(Settings.HANDWRITE_WIDTH)) * this.f11365C) + 0.5f);
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public int mo8600a(int i, int i2) {
        HandWriteMask p = Engine.getInstance().getWidgetManager().mo9659p();
        int l = i - Engine.getInstance().getWidgetManager().mo9630ad().mo9254l();
        if (i2 >= this.f11375p && i2 < this.f11373n && ((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            return 1;
        }
        if (i2 < this.f11373n || p.mo8613a(l, i2 - this.f11373n)) {
            return 0;
        }
        return 2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 2;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = new int[2];
        this.f11372m.getLocationOnScreen(iArr);
        this.f11373n = iArr[1];
        this.f11374o = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        if (this.f11374o != null) {
            this.f11374o.getLocationOnScreen(iArr);
            this.f11375p = iArr[1];
            getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = x + i2;
            int i5 = y + i3;
            if (this.f11379t == -1) {
                this.f11379t = mo8600a(i4, i5);
                if (1 == this.f11379t && (this.f11383x || this.f11384y)) {
                    this.f11379t = 0;
                }
            }
            if (!this.f11376q) {
                this.f11368G.removeCallbacks(this.f11377r);
                if (this.f11366D != null) {
                    this.f11368G.removeCallbacks(this.f11377r);
                    MotionEvent obtain = MotionEvent.obtain(this.f11366D);
                    this.f11366D.recycle();
                    this.f11366D = null;
                    this.f11368G.post(new C2668aH(this, i3, obtain));
                }
                this.f11367E.offer(MotionEvent.obtain(motionEvent));
                if (!this.f11368G.hasMessages(0)) {
                    Message obtainMessage = this.f11368G.obtainMessage(0);
                    obtainMessage.arg1 = i3 - this.f11373n;
                    this.f11368G.sendMessage(obtainMessage);
                }
            } else if (this.f11379t == 2) {
                m11789a(motionEvent, (motionEvent.getY() + ((float) i3)) - ((float) this.f11373n));
            } else if (this.f11379t == 1) {
                if (action == 3 || action == 1 || action == 0) {
                    i = action;
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, motionEvent.getX(), (((float) i3) + motionEvent.getY()) - ((float) this.f11375p), motionEvent.getMetaState());
                this.f11374o.dispatchTouchEvent(obtain2);
                if (action == 3 || action == 1) {
                    this.f11379t = -1;
                }
                obtain2.recycle();
            } else {
                if (action == 0) {
                    if (this.f11371l.isEmpty()) {
                        this.f11385z = true;
                    } else {
                        this.f11385z = false;
                    }
                    this.f11363A = motionEvent.getEventTime();
                }
                this.f11371l.addPoint(x, y, action);
                mo9343a(this.f11371l);
                if (action == 0) {
                    this.f11368G.removeCallbacks(this.f11378s);
                    this.f11366D = MotionEvent.obtain(motionEvent);
                } else if (action == 1) {
                    if (!this.f11385z || motionEvent.getEventTime() - this.f11363A >= 1500 || this.f11371l.getMaxOffsetSquare() >= f11362j) {
                        Engine.getInstance().getWidgetManager().mo9659p().setStatus(5);
                        this.f11368G.postDelayed(this.f11378s, (long) Settings.getInstance().getIntSetting(102));
                        this.f11366D = null;
                    } else {
                        int a = mo8600a(i4, i5);
                        if (a != 0) {
                            i = a;
                        }
                        MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                        mo8602b();
                        if (this.f11366D != null) {
                            this.f11379t = i;
                            MotionEvent obtain4 = MotionEvent.obtain(this.f11366D);
                            this.f11366D.recycle();
                            this.f11366D = null;
                            onTouchEvent(obtain4);
                            obtain4.recycle();
                            this.f11379t = -1;
                        }
                        this.f11368G.post(new C2669aI(this, i, obtain3));
                    }
                } else if (action == 3) {
                    this.f11366D = null;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11789a(MotionEvent motionEvent, float f) {
        int action = motionEvent.getAction();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getX(), f);
        if (this.f11369H.size() > 0) {
            Iterator<C2620a> it = this.f11369H.iterator();
            while (it.hasNext()) {
                it.next().mo7425b(obtain);
            }
        } else {
            this.f11372m.dispatchTouchEvent(obtain);
        }
        if (action == 3 || action == 1) {
            this.f11379t = -1;
        }
        obtain.recycle();
    }

    /* renamed from: a */
    public void mo8601a() {
        if (Engine.isInitialized()) {
            this.f11371l.addPoint(-1, -1, 10);
            Engine.getInstance().updateInputOp(C1712h.f5595q);
            Engine.getInstance().fireHandwriteOperation(this.f11371l);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: b */
    public void mo8602b() {
        super.mo8602b();
        this.f11371l.clear();
        HandWriteMask p = Engine.getInstance().getWidgetManager().mo9659p();
        if (p != null && p.mo8612a() && (p.getStatus() == 4 || p.getStatus() == 5)) {
            p.setStatus(4);
        }
        this.f11379t = -1;
    }

    /* renamed from: e */
    public void mo8622e() {
        this.f11376q = true;
        this.f11368G.post(this.f11377r);
    }

    /* renamed from: c */
    public void mo8538c() {
    }

    /* renamed from: p_ */
    public void mo8556p_() {
        m11802k();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m11802k() {
        if (Engine.getInstance().isHandwriteMaskVisible()) {
            int l = this.f11364B.mo9254l();
            int[] iArr = new int[2];
            Engine.getInstance().getWidgetManager().mo9651i().mo9716b().getLocationInWindow(iArr);
            this.f11370k.update(l, iArr[1], this.f11364B.mo9262t(), -1, true);
        }
    }

    /* renamed from: g */
    public boolean mo8623g() {
        return this.f11370k.isShowing();
    }

    /* renamed from: h */
    public void mo8624h() {
        if (this.f11369H.size() == 0) {
            this.f11376q = false;
            if (this.f11366D == null) {
                this.f11368G.post(this.f11377r);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m11803l() {
        this.f11367E.clear();
        try {
            this.f11370k.dismiss();
        } catch (Exception e) {
            C1017y.m5219b(f11355c, "dismiss warning");
            Engine.getInstance().getWidgetManager().mo9607M();
        }
    }

    public void setInputView(View view) {
        this.f11372m = view;
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        if (widgetManager != null) {
            SoftKeyboardView g = widgetManager.mo9648g();
            C2826E ad = widgetManager.mo9630ad();
            if (g != null && ad != null) {
                this.f11370k.setHeight(((int) (((double) widgetManager.mo9651i().mo9718d()) * ad.mo9251i())) + g.getKeyboard().mo9134g() + ad.mo9256n());
            }
        }
    }

    public void setTopView(View view) {
        this.f11374o = view;
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f11383x = z;
        invalidate();
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11384y = z;
    }

    /* renamed from: a */
    public void mo8620a(C2620a aVar) {
        if (!this.f11369H.contains(aVar)) {
            this.f11369H.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo8621b(C2620a aVar) {
        this.f11369H.remove(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8606f() {
        return true;
    }
}
