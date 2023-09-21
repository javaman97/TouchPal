package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.MoveContrailView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.HandWriteHalfView */
public class HandWriteHalfView extends MoveContrailView implements CandidateManager.ICandidateListener, FilterManager.IFilterListener {

    /* renamed from: c */
    private static final String f11292c = "HandWriteHalfView";

    /* renamed from: d */
    private static final int f11293d = 10;

    /* renamed from: e */
    private static final int f11294e = -1;

    /* renamed from: f */
    private static final int f11295f = 0;

    /* renamed from: g */
    private static final int f11296g = 1;

    /* renamed from: h */
    private static final int f11297h = 2;

    /* renamed from: i */
    private static final int f11298i = 3;

    /* renamed from: j */
    private static final int f11299j = 1500;

    /* renamed from: k */
    private static final int f11300k = 400;

    /* renamed from: l */
    private static final float f11301l = 0.825f;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Handler f11302A = new Handler();

    /* renamed from: B */
    private boolean f11303B;

    /* renamed from: C */
    private boolean f11304C;

    /* renamed from: D */
    private boolean f11305D;

    /* renamed from: E */
    private boolean f11306E;

    /* renamed from: F */
    private long f11307F;

    /* renamed from: G */
    private final float f11308G;

    /* renamed from: H */
    private View f11309H;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public PopupWindow f11310m;

    /* renamed from: n */
    private MoveContrail f11311n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public View f11312o;

    /* renamed from: p */
    private int f11313p;

    /* renamed from: q */
    private View f11314q;

    /* renamed from: r */
    private int f11315r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f11316s;

    /* renamed from: t */
    private Runnable f11317t;

    /* renamed from: u */
    private Runnable f11318u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f11319v;

    /* renamed from: w */
    private Runnable f11320w;

    /* renamed from: x */
    private Paint f11321x = new Paint();

    /* renamed from: y */
    private Paint f11322y = new Paint();

    /* renamed from: z */
    private Paint f11323z = new Paint();

    public HandWriteHalfView(Context context) {
        super(context);
        setAniEffectEnable(false);
        setStrokeFadeOut(true);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f11308G = displayMetrics.density;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.addView(this, layoutParams);
        this.f11310m = new PopupWindow(relativeLayout, displayMetrics.widthPixels, 0);
        this.f11310m.setTouchable(true);
        this.f11311n = new MoveContrail();
        this.f11316s = false;
        this.f11317t = new C2712ax(this);
        this.f11318u = new C2713ay(this);
        this.f11319v = -1;
        this.f11322y.setColor(-4144960);
        this.f11322y.setStyle(Paint.Style.STROKE);
        this.f11322y.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.border_line_width));
        this.f11322y.setPathEffect(new DashPathEffect(new float[]{15.0f, 5.0f}, 1.0f));
        this.f11323z.setColor(Integer.MIN_VALUE);
        this.f11323z.setStyle(Paint.Style.FILL);
        this.f11321x.setColor(1627389951);
        this.f11321x.setTextSize((float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.magic_text_size));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m11757g() {
        if (C1368X.m6320c().mo5848u().mo5599c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        setStrokeColor(Color.parseColor(Settings.getInstance().getStringSetting(100)));
        setCurveWidth((((float) Settings.getInstance().getIntSetting(Settings.HANDWRITE_WIDTH)) * this.f11308G) + 0.5f);
        super.onDraw(canvas);
    }

    /* renamed from: a */
    public int mo8600a(int i, int i2) {
        int[] iArr = new int[2];
        if (this.f11309H == null) {
            return 0;
        }
        this.f11309H.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        if (i2 >= this.f11315r && i2 < this.f11313p && ((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            return 1;
        }
        if (i2 < this.f11313p || (i >= i3 && i < this.f11309H.getWidth() + i3 && i2 >= i4 && i2 < this.f11309H.getHeight() + i4)) {
            return 0;
        }
        return 2;
    }

    private int getOffsetX() {
        C2826E zoomController = getZoomController();
        if (zoomController != null) {
            return zoomController.mo9254l();
        }
        return 0;
    }

    private C2826E getZoomController() {
        return Engine.getInstance().getWidgetManager().mo9630ad();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = new int[2];
        this.f11312o.getLocationOnScreen(iArr);
        this.f11313p = iArr[1];
        this.f11314q = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        if (this.f11314q != null) {
            this.f11314q.getLocationOnScreen(iArr);
            this.f11315r = iArr[1];
        }
        getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = x + i3;
        int i6 = y + i4;
        if (this.f11319v == -1) {
            this.f11319v = mo8600a(i5, i6);
            if (1 == this.f11319v && (this.f11303B || this.f11304C)) {
                this.f11319v = 0;
            }
        }
        if (this.f11319v == 2) {
            if (action == 3 || action == 1 || action == 0) {
                i2 = action;
            } else {
                i2 = 2;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i2, motionEvent.getX() - ((float) getOffsetX()), (((float) i4) + motionEvent.getY()) - ((float) this.f11313p), motionEvent.getMetaState());
            this.f11312o.dispatchTouchEvent(obtain);
            if (action == 3 || action == 1) {
                this.f11319v = -1;
            }
            obtain.recycle();
        } else if (this.f11319v != 1) {
            if (action == 0) {
                if (this.f11311n.isEmpty()) {
                    this.f11306E = true;
                } else {
                    this.f11306E = false;
                }
                this.f11307F = motionEvent.getEventTime();
            }
            this.f11311n.addPoint(x, y, action);
            mo9343a(this.f11311n);
            if (action == 0) {
                this.f11302A.removeCallbacks(this.f11318u);
            } else if (action == 1) {
                if (!this.f11306E || motionEvent.getEventTime() - this.f11307F >= 1500 || this.f11311n.getMaxOffsetSquare() >= f11300k) {
                    this.f11302A.postDelayed(this.f11318u, (long) Settings.getInstance().getIntSetting(102));
                } else {
                    int a = mo8600a(i5, i6);
                    if (a != 0) {
                        MotionEvent obtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getDownTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                        MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                        this.f11302A.removeCallbacks(this.f11320w);
                        this.f11320w = new C2714az(this, a, obtain2, obtain3);
                        this.f11302A.post(this.f11320w);
                    }
                    mo8602b();
                }
            }
        } else if (this.f11314q != null) {
            if (action == 3 || action == 1 || action == 0) {
                i = action;
            } else {
                i = 2;
            }
            MotionEvent obtain4 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, motionEvent.getX() - ((float) getOffsetX()), (((float) i4) + motionEvent.getY()) - ((float) this.f11315r), motionEvent.getMetaState());
            this.f11314q.dispatchTouchEvent(obtain4);
            if (action == 3 || action == 1) {
                this.f11319v = -1;
            }
            obtain4.recycle();
        }
        return true;
    }

    /* renamed from: a */
    public void mo8601a() {
        if (Engine.isInitialized()) {
            this.f11311n.addPoint(-1, -1, 10);
            Engine.getInstance().updateInputOp(C1712h.f5595q);
            Engine.getInstance().fireHandwriteOperation(this.f11311n);
            Engine.getInstance().processEvent();
        }
    }

    /* renamed from: b */
    public void mo8602b() {
        super.mo8602b();
        this.f11311n.clear();
        this.f11319v = -1;
    }

    /* renamed from: c */
    public void mo8603c() {
        this.f11316s = true;
        this.f11302A.post(this.f11317t);
    }

    /* renamed from: d */
    public boolean mo8604d() {
        return this.f11310m.isShowing();
    }

    /* renamed from: e */
    public void mo8605e() {
        this.f11316s = false;
        this.f11317t.run();
    }

    public void setInputView(View view) {
        this.f11312o = view;
        C2917du widgetManager = Engine.getInstance().getWidgetManager();
        SoftKeyboardView g = widgetManager.mo9648g();
        this.f11310m.setHeight(g.getKeyboard().mo9134g() + widgetManager.mo9651i().mo9718d());
        if (this.f11309H == null) {
            this.f11309H = inflate(getContext(), R.layout.handwrite_pad, (ViewGroup) null);
        }
        this.f11309H.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.bg_handwrite_half_view));
        TextView textView = (TextView) this.f11309H.findViewById(R.id.watermark);
        textView.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.handwrite_half_engine_provider_watermark_color));
        if (this.f11305D) {
            textView.setText(C1974m.m9063a(C1368X.m6313b(), (int) R.string.handwrite_engine_provider_watermark));
        }
        if (!C1132b.m5654a(getContext()).mo4392a(C1135d.SHOW_HANDWRITE_ENGINE_PROVIDER_WATERMARK, (Boolean) false).booleanValue()) {
            textView.setVisibility(4);
        }
        if (this.f11309H.getParent() == null) {
            widgetManager.mo9643e().addView(this.f11309H, new FrameLayout.LayoutParams(g.getKeyboard().mo9177a("sk_bk").left, (int) (((float) g.getKeyboard().mo9134g()) * f11301l)));
        }
    }

    public void setTopView(View view) {
        this.f11314q = view;
    }

    public void setEngineProviderWatermark(boolean z) {
        this.f11305D = z;
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f11303B = z;
        invalidate();
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11304C = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8606f() {
        return true;
    }
}
