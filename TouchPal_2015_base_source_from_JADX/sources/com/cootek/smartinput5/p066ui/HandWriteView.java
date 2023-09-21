package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cootek.smartinput5.TouchPalIME;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2835M;
import com.cootek.smartinput5.p066ui.control.MoveContrailView;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.cootek.smartinput5.ui.HandWriteView */
public class HandWriteView extends MoveContrailView implements CandidateManager.ICandidateListener, FilterManager.IFilterListener {

    /* renamed from: c */
    private static final String f11386c = "HandWriteView";

    /* renamed from: d */
    private static final int f11387d = 10;

    /* renamed from: e */
    private static final int f11388e = -1;

    /* renamed from: f */
    private static final int f11389f = 0;

    /* renamed from: g */
    private static final int f11390g = 1;

    /* renamed from: h */
    private static final int f11391h = 2;

    /* renamed from: i */
    private static final int f11392i = 3;

    /* renamed from: j */
    private static final int f11393j = 1500;

    /* renamed from: k */
    private static final int f11394k = 400;

    /* renamed from: l */
    private static final int[] f11395l = {16842919};

    /* renamed from: A */
    private Runnable f11396A;

    /* renamed from: B */
    private int f11397B;

    /* renamed from: C */
    private Rect f11398C = new Rect();

    /* renamed from: D */
    private int f11399D;

    /* renamed from: E */
    private Paint f11400E = new Paint();

    /* renamed from: F */
    private Paint f11401F = new Paint();

    /* renamed from: G */
    private Rect f11402G = new Rect();

    /* renamed from: H */
    private Paint f11403H = new Paint();

    /* renamed from: I */
    private Paint f11404I = new Paint();

    /* renamed from: J */
    private String f11405J;

    /* renamed from: K */
    private boolean f11406K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Handler f11407L = new Handler();

    /* renamed from: M */
    private boolean f11408M;

    /* renamed from: N */
    private boolean f11409N;

    /* renamed from: O */
    private boolean f11410O;

    /* renamed from: P */
    private boolean f11411P;

    /* renamed from: Q */
    private long f11412Q;

    /* renamed from: R */
    private final float f11413R;

    /* renamed from: S */
    private WindowManager f11414S;

    /* renamed from: T */
    private Class<?> f11415T;

    /* renamed from: U */
    private Method f11416U;

    /* renamed from: V */
    private Method f11417V;

    /* renamed from: W */
    private boolean f11418W = false;

    /* renamed from: X */
    private boolean f11419X;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public PopupWindow f11420m;

    /* renamed from: n */
    private View f11421n;

    /* renamed from: o */
    private View f11422o;

    /* renamed from: p */
    private int f11423p;

    /* renamed from: q */
    private int f11424q;

    /* renamed from: r */
    private MoveContrail f11425r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public View f11426s;

    /* renamed from: t */
    private int f11427t;

    /* renamed from: u */
    private View f11428u;

    /* renamed from: v */
    private int f11429v;

    /* renamed from: w */
    private int f11430w;

    /* renamed from: x */
    private int f11431x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f11432y;

    /* renamed from: z */
    private Runnable f11433z;

    public HandWriteView(Context context) {
        super(context);
        setAniEffectEnable(false);
        setStrokeFadeOut(true);
        this.f11418W = C1132b.m5654a(context).mo4395a(C1135d.HANDWRITE_FULL_SYMBOL_AREA.toString(), (Boolean) true).booleanValue();
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f11413R = displayMetrics.density;
        this.f11423p = displayMetrics.widthPixels;
        this.f11424q = displayMetrics.heightPixels;
        this.f11420m = getPopupWindow();
        mo8629a(true);
        this.f11425r = new MoveContrail();
        this.f11432y = false;
        this.f11414S = (WindowManager) context.getSystemService("window");
        this.f11433z = new C2671aK(this);
        this.f11396A = new C2672aL(this);
        this.f11397B = -1;
        this.f11403H.setColor(-4144960);
        this.f11403H.setStyle(Paint.Style.STROKE);
        this.f11403H.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.border_line_width));
        this.f11403H.setPathEffect(new DashPathEffect(new float[]{15.0f, 5.0f}, 1.0f));
        this.f11404I.setColor(Integer.MIN_VALUE);
        this.f11404I.setStyle(Paint.Style.FILL);
        this.f11421n = inflate(context, R.layout.handwrite_frame, (ViewGroup) null);
        int strokeWidth = ((int) this.f11403H.getStrokeWidth()) * 2;
        ((FrameLayout) this.f11421n.findViewById(R.id.main_frame)).setPadding(strokeWidth, strokeWidth, strokeWidth, strokeWidth);
        if (this.f11418W) {
            this.f11400E.setColor(1627389951);
            this.f11400E.setStyle(Paint.Style.STROKE);
            this.f11400E.setStrokeWidth((float) resources.getDimensionPixelSize(R.dimen.magic_line_width));
            this.f11400E.setPathEffect(new DashPathEffect(new float[]{6.0f, 2.0f}, 1.0f));
            this.f11399D = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.magic_area_bottom_space);
            this.f11405J = C1974m.m9063a(getContext(), (int) R.string.handwrite_magic_rect_title);
            this.f11401F.setColor(1627389951);
            this.f11401F.setTextSize((float) C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.magic_text_size));
            this.f11422o = inflate(context, R.layout.handwrite_frame, (ViewGroup) null);
            this.f11422o.setPadding(0, 0, strokeWidth, strokeWidth);
        }
        this.f11419X = true;
    }

    private PopupWindow getPopupWindow() {
        return m11816a(this.f11423p, this.f11424q);
    }

    /* renamed from: a */
    private PopupWindow m11816a(int i, int i2) {
        PopupWindow popupWindow = new PopupWindow(this);
        popupWindow.setHeight(i2);
        popupWindow.setWidth(i);
        return popupWindow;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11820b(boolean z) {
        if (this.f11420m != null) {
            if (this.f11420m.isShowing()) {
                this.f11420m.dismiss();
            }
            if (z) {
                this.f11420m = getPopupWindow();
            } else {
                this.f11420m = m11816a(1, 1);
                this.f11420m.setOutsideTouchable(true);
                this.f11420m.setFocusable(false);
            }
            try {
                this.f11420m.showAtLocation(this.f11426s, 80, 0, C2835M.m13017a(this.f11426s));
            } catch (RuntimeException e) {
            }
        }
        this.f11419X = z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!this.f11419X) {
            super.onDraw(canvas);
            return;
        }
        setStrokeColor(Color.parseColor(Settings.getInstance().getStringSetting(100)));
        setCurveWidth((((float) Settings.getInstance().getIntSetting(Settings.HANDWRITE_WIDTH)) * this.f11413R) + 0.5f);
        int[] iArr = new int[2];
        this.f11426s.getLocationOnScreen(iArr);
        this.f11427t = iArr[1];
        this.f11429v = this.f11427t - Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        getLocationOnScreen(iArr);
        this.f11431x = iArr[1];
        getLocalVisibleRect(this.f11402G);
        this.f11402G.bottom = this.f11429v - this.f11431x;
        if (this.f11416U == null) {
            canvas.drawRect(this.f11402G, this.f11404I);
        }
        if (this.f11418W) {
            m11824g();
            this.f11422o.measure(this.f11398C.width() | 1073741824, this.f11398C.height() | 1073741824);
            this.f11422o.layout(this.f11398C.left, this.f11398C.top, this.f11398C.right, this.f11398C.bottom);
            canvas.translate((float) this.f11398C.left, (float) this.f11398C.top);
            this.f11422o.draw(canvas);
            canvas.translate((float) (-this.f11398C.left), (float) (-this.f11398C.top));
            canvas.drawText(this.f11405J, ((float) this.f11398C.left) + this.f11403H.getStrokeWidth(), (((float) this.f11398C.top) - this.f11401F.ascent()) + this.f11403H.getStrokeWidth(), this.f11401F);
        }
        this.f11421n.measure(this.f11402G.width() | 1073741824, this.f11402G.height() | 1073741824);
        this.f11421n.layout(this.f11402G.left, this.f11402G.top, this.f11402G.right, this.f11402G.bottom);
        canvas.translate((float) this.f11402G.left, (float) this.f11402G.top);
        this.f11421n.draw(canvas);
        canvas.translate((float) (-this.f11402G.left), (float) (-this.f11402G.top));
        super.onDraw(canvas);
    }

    /* renamed from: g */
    private void m11824g() {
        float f;
        if (getContext().getResources().getConfiguration().orientation == 2) {
            f = 0.5f;
        } else {
            f = 0.4f;
        }
        this.f11398C.set((int) (((double) this.f11402G.width()) * 0.6d), (this.f11402G.bottom - this.f11399D) - ((int) (f * ((float) this.f11402G.height()))), this.f11423p, this.f11402G.bottom + 0);
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
        int i = 2;
        int action = motionEvent.getAction();
        if (!this.f11419X) {
            if (action == 4 || action == 1) {
                m11820b(true);
            }
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = new int[2];
        this.f11426s.getLocationOnScreen(iArr);
        this.f11427t = iArr[1];
        this.f11428u = Engine.getInstance().getWidgetManager().mo9651i().mo9716b();
        if (this.f11428u != null) {
            this.f11428u.getLocationOnScreen(iArr);
            this.f11429v = iArr[1];
        }
        getLocationOnScreen(iArr);
        this.f11430w = iArr[0];
        this.f11431x = iArr[1];
        int i2 = this.f11430w + x;
        int i3 = this.f11431x + y;
        if (this.f11397B == -1) {
            this.f11397B = m11819b(i2, i3);
        }
        if (this.f11397B == 2) {
            if (action == 3 || action == 1 || action == 0) {
                i = action;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, motionEvent.getX() - ((float) getOffsetX()), (motionEvent.getY() + ((float) this.f11431x)) - ((float) this.f11427t), motionEvent.getMetaState());
            this.f11426s.dispatchTouchEvent(obtain);
            if (action == 3 || action == 1) {
                this.f11397B = -1;
            }
            obtain.recycle();
            mo8628a(this.f11426s, false);
        } else if (this.f11397B == 1) {
            if (action == 3 || action == 1 || action == 0) {
                i = action;
            }
            MotionEvent obtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), i, motionEvent.getX() - ((float) getOffsetX()), (motionEvent.getY() + ((float) this.f11431x)) - ((float) this.f11429v), motionEvent.getMetaState());
            this.f11428u.dispatchTouchEvent(obtain2);
            if (action == 3 || action == 1) {
                this.f11397B = -1;
            }
            obtain2.recycle();
            mo8628a(this.f11426s, false);
        } else {
            if (action == 0) {
                if (this.f11425r.isEmpty()) {
                    this.f11411P = true;
                    if (this.f11418W && this.f11398C.contains(x, y)) {
                        this.f11406K = true;
                    }
                } else {
                    this.f11411P = false;
                }
                this.f11412Q = motionEvent.getEventTime();
            }
            this.f11425r.addPoint(x, y, action);
            mo9343a(this.f11425r);
            if (action == 0) {
                this.f11407L.removeCallbacks(this.f11396A);
            } else if (action == 1) {
                if (!this.f11411P || motionEvent.getEventTime() - this.f11412Q >= 1500 || this.f11425r.getMaxOffsetSquare() >= f11394k) {
                    this.f11407L.postDelayed(this.f11396A, (long) Settings.getInstance().getIntSetting(102));
                    mo8628a(this.f11426s, false);
                } else {
                    mo8602b();
                    mo8628a(this.f11426s, true);
                    m11820b(false);
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private int m11819b(int i, int i2) {
        if (i2 >= this.f11429v && i2 < this.f11427t && ((TouchPalIME) Engine.getInstance().getIms()).isCandidatesViewShown()) {
            return 1;
        }
        if (i2 >= this.f11427t) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo8601a() {
        if (Engine.isInitialized()) {
            this.f11425r.addPoint(-1, -1, 10);
            Settings instance = Settings.getInstance();
            int intSetting = instance.getIntSetting(29, 8, C1549b.f4835f, (Config) null);
            if (this.f11406K) {
                instance.setIntSetting(29, 9, 8, C1549b.f4835f, (Config) null, true);
            }
            Engine.getInstance().updateInputOp(C1712h.f5595q);
            Engine.getInstance().fireHandwriteOperation(this.f11425r);
            Engine.getInstance().processEvent();
            if (this.f11406K) {
                instance.setIntSetting(29, intSetting, 8, C1549b.f4835f, (Config) null, true);
            }
            mo8628a(this.f11426s, false);
        }
    }

    /* renamed from: b */
    public void mo8602b() {
        super.mo8602b();
        this.f11425r.clear();
        this.f11406K = false;
        this.f11397B = -1;
    }

    /* renamed from: c */
    public void mo8630c() {
        this.f11432y = true;
        this.f11433z.run();
    }

    /* renamed from: d */
    public boolean mo8631d() {
        return this.f11420m.isShowing();
    }

    /* renamed from: e */
    public void mo8632e() {
        this.f11432y = false;
        this.f11433z.run();
    }

    public void setInputView(View view) {
        this.f11426s = view;
        TextView textView = (TextView) this.f11421n.findViewById(R.id.watermark);
        textView.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.handwrite_engine_provider_watermark_color));
        if (this.f11410O && this.f11416U == null) {
            textView.setText(C1974m.m9063a(getContext(), (int) R.string.handwrite_engine_provider_watermark));
        }
        if (!C1132b.m5654a(getContext()).mo4392a(C1135d.SHOW_HANDWRITE_ENGINE_PROVIDER_WATERMARK, (Boolean) false).booleanValue()) {
            textView.setVisibility(4);
        }
    }

    public void setTopView(View view) {
        this.f11428u = view;
    }

    public void setEngineProviderWatermark(boolean z) {
        this.f11410O = z;
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f11408M = z;
        postInvalidate();
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11409N = z;
        postInvalidate();
    }

    /* renamed from: h */
    private boolean m11825h() {
        return this.f11408M || this.f11409N;
    }

    /* renamed from: a */
    public void mo8629a(boolean z) {
        this.f11415T = this.f11420m.getClass();
        try {
            if (this.f11416U == null) {
                this.f11416U = this.f11415T.getDeclaredMethod("setBlockMode", new Class[]{Boolean.TYPE});
            }
            this.f11416U.setAccessible(true);
            this.f11416U.invoke(this.f11420m, new Object[]{Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
        }
    }

    /* renamed from: a */
    public void mo8628a(View view, boolean z) {
        this.f11415T = this.f11414S.getClass();
        try {
            if (this.f11417V == null) {
                this.f11417V = this.f11415T.getDeclaredMethod("relayInputEvent", new Class[]{View.class, Boolean.TYPE});
            }
            this.f11417V.setAccessible(true);
            this.f11417V.invoke(this.f11414S, new Object[]{view, Boolean.valueOf(z)});
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8606f() {
        return true;
    }
}
