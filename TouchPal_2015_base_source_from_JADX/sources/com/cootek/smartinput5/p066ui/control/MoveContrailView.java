package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.view.View;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.control.MoveContrailView */
public class MoveContrailView extends View {

    /* renamed from: B */
    private static final float f12752B = 4.0f;

    /* renamed from: C */
    private static final int f12753C = 0;

    /* renamed from: b */
    protected static final int f12754b = 20;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f12755A;

    /* renamed from: D */
    private Handler f12756D = new C2831I(this);

    /* renamed from: a */
    protected final float f12757a = (0.1f * this.f12771p);

    /* renamed from: c */
    private LinkedList<C2830H> f12758c;

    /* renamed from: d */
    private ArrayList<C2830H> f12759d;

    /* renamed from: e */
    private Path[] f12760e = new Path[20];

    /* renamed from: f */
    private int[] f12761f = new int[this.f12760e.length];

    /* renamed from: g */
    private int f12762g;

    /* renamed from: h */
    private int f12763h;

    /* renamed from: i */
    private boolean f12764i = true;

    /* renamed from: j */
    private Paint f12765j;

    /* renamed from: k */
    private float f12766k;

    /* renamed from: l */
    private float f12767l;

    /* renamed from: m */
    private int f12768m = 0;

    /* renamed from: n */
    private float f12769n;

    /* renamed from: o */
    private float f12770o;

    /* renamed from: p */
    private float f12771p = getResources().getDisplayMetrics().density;

    /* renamed from: q */
    private int f12772q = Color.rgb(37, Settings.KEY_SPEED_TOTAL_KEY_TIMES, 255);

    /* renamed from: r */
    private float f12773r = (f12752B * this.f12771p);

    /* renamed from: s */
    private final int f12774s = C1368X.m6320c().mo5841n().mo6260b((int) R.color.ani_curve_stroke_start_color);

    /* renamed from: t */
    private final int f12775t = C1368X.m6320c().mo5841n().mo6260b((int) R.color.ani_curve_stroke_middle_color);

    /* renamed from: u */
    private final int f12776u = C1368X.m6320c().mo5841n().mo6260b((int) R.color.ani_curve_stroke_end_color);

    /* renamed from: v */
    private final int f12777v = Color.alpha(C1368X.m6320c().mo5841n().mo6260b((int) R.color.ani_curve_stroke_start_alpha));

    /* renamed from: w */
    private final int f12778w = Color.alpha(C1368X.m6320c().mo5841n().mo6260b((int) R.color.ani_curve_stroke_end_alpha));

    /* renamed from: x */
    private boolean f12779x = Settings.getInstance().getBoolSetting(87);

    /* renamed from: y */
    private boolean f12780y = true;

    /* renamed from: z */
    private boolean f12781z = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoveContrailView(Context context) {
        super(context);
        int i = 255;
        if (this.f12779x && this.f12780y) {
            this.f12758c = new LinkedList<>();
            this.f12759d = new ArrayList<>();
        }
        for (int i2 = 0; i2 < this.f12760e.length; i2++) {
            this.f12760e[i2] = new Path();
            this.f12761f[i2] = i;
            i = (int) (((double) i) * 0.75d);
        }
        this.f12765j = new Paint();
        this.f12765j.setStyle(Paint.Style.STROKE);
        this.f12765j.setAntiAlias(true);
        this.f12765j.setDither(true);
        this.f12765j.setStrokeJoin(Paint.Join.ROUND);
        this.f12765j.setStrokeCap(Paint.Cap.ROUND);
        this.f12765j.setColor(this.f12772q);
        this.f12765j.setAlpha(Settings.VIBRATE_TIME);
        this.f12765j.setStrokeWidth(this.f12773r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8606f() {
        return C1132b.m5654a(getContext()).mo4392a(C1135d.CURVE_PATH_ANIMATION, (Boolean) true).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if ((this.f12781z || this.f12755A) && mo8606f()) {
            this.f12781z = false;
            if (!this.f12779x || !this.f12780y) {
                this.f12765j.setStrokeWidth(this.f12773r);
                if (this.f12764i) {
                    int min = Math.min(this.f12763h, this.f12760e.length);
                    int length = this.f12763h < this.f12760e.length ? 0 : (this.f12762g + 1) % this.f12760e.length;
                    for (int i = 0; i < min; i++) {
                        this.f12765j.setAlpha(this.f12761f[(min - 1) - i]);
                        canvas.drawPath(this.f12760e[(length + i) % this.f12760e.length], this.f12765j);
                    }
                    return;
                }
                canvas.drawPath(this.f12760e[0], this.f12765j);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = this.f12758c.iterator();
            while (it.hasNext()) {
                C2830H h = (C2830H) it.next();
                canvas.drawPath(h.f12690e, h.f12691f);
                if (h.mo9279a(currentTimeMillis)) {
                    this.f12759d.add(h);
                }
            }
            Iterator<C2830H> it2 = this.f12759d.iterator();
            while (it2.hasNext()) {
                this.f12758c.remove(it2.next());
            }
            this.f12759d.clear();
        }
    }

    /* renamed from: b */
    public void mo8602b() {
        boolean z = this.f12781z;
        this.f12756D.removeMessages(0);
        if (!this.f12779x || !this.f12780y) {
            if (z || this.f12762g > 0) {
                z = true;
            } else {
                z = false;
            }
            for (Path reset : this.f12760e) {
                reset.reset();
            }
        } else {
            this.f12758c.clear();
        }
        this.f12762g = 0;
        this.f12763h = 0;
        this.f12768m = 0;
        this.f12765j.setColor(this.f12772q);
        if (z) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo9343a(MoveContrail moveContrail) {
        this.f12781z = true;
        for (int i = this.f12768m; i < moveContrail.size(); i++) {
            int x = moveContrail.getX(i);
            int y = moveContrail.getY(i);
            int action = moveContrail.getAction(i);
            if (action == 1) {
                m13024c(x, y);
            } else if (action == 0) {
                if (this.f12764i) {
                    this.f12763h++;
                    this.f12762g = (this.f12763h - 1) % this.f12760e.length;
                    this.f12760e[this.f12762g].reset();
                }
                mo8600a(x, y);
            } else {
                m13023b(x, y);
            }
        }
        this.f12768m = moveContrail.size();
    }

    /* renamed from: a */
    private void mo8600a(int i, int i2) {
        float f = (float) i;
        this.f12769n = f;
        this.f12766k = f;
        float f2 = (float) i2;
        this.f12770o = f2;
        this.f12767l = f2;
        if (!this.f12779x || !this.f12780y) {
            this.f12760e[this.f12762g].moveTo((float) i, (float) i2);
            return;
        }
        C2830H.m12942a(this.f12773r, this.f12757a, this.f12777v, this.f12778w, C2862g.m13251a(15, this.f12774s, this.f12775t, this.f12776u));
        C2830H h = new C2830H();
        h.mo9277a(System.currentTimeMillis(), (float) i, (float) i2);
        this.f12758c.add(h);
    }

    /* renamed from: i */
    public void mo9344i() {
        this.f12779x = true;
        this.f12780y = true;
    }

    /* renamed from: b */
    private void m13023b(int i, int i2) {
        boolean z;
        float abs = Math.abs(((float) i) - this.f12766k);
        float abs2 = Math.abs(((float) i2) - this.f12767l);
        float f = (float) i;
        float f2 = (float) i2;
        if (abs >= f12752B || abs2 >= f12752B) {
            if (!this.f12779x || !this.f12780y) {
                this.f12760e[this.f12762g].quadTo(this.f12766k, this.f12767l, (((float) i) + this.f12766k) / 2.0f, (((float) i2) + this.f12767l) / 2.0f);
                z = false;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.f12758c.isEmpty()) {
                    this.f12758c.getLast().mo9282b(currentTimeMillis, this.f12769n, this.f12770o, (this.f12766k + this.f12769n) / 2.0f, (this.f12767l + this.f12770o) / 2.0f);
                }
                C2830H h = new C2830H();
                h.mo9277a(currentTimeMillis, (this.f12766k + this.f12769n) / 2.0f, (this.f12767l + this.f12770o) / 2.0f);
                this.f12758c.add(h);
                z = true;
            }
            this.f12769n = this.f12766k;
            this.f12770o = this.f12767l;
            this.f12766k = f;
            this.f12767l = f2;
        } else {
            z = false;
        }
        this.f12755A = false;
        if (z) {
            this.f12756D.removeMessages(0);
            mo8601a();
            return;
        }
        invalidate();
    }

    /* renamed from: c */
    private void m13024c(int i, int i2) {
        invalidate();
    }

    public void setAniEffectEnable(boolean z) {
        this.f12780y = z;
    }

    public void setStrokeColor(int i) {
        this.f12772q = i;
        this.f12765j.setColor(this.f12772q);
    }

    public void setCurveWidth(float f) {
        this.f12773r = f;
    }

    public void setStrokeFadeOut(boolean z) {
        this.f12764i = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo8601a() {
        invalidate();
        this.f12756D.sendEmptyMessageDelayed(0, 20);
    }
}
