package com.cootek.smartinput5.p066ui.control;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.cootek.smartinput5.func.C1368X;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.control.H */
/* compiled from: MoveContrailShrinkPathStruct */
public class C2830H {

    /* renamed from: i */
    private static final int f12677i = 10;

    /* renamed from: j */
    private static float f12678j;

    /* renamed from: k */
    private static float f12679k;

    /* renamed from: l */
    private static float f12680l;

    /* renamed from: m */
    private static int f12681m;

    /* renamed from: n */
    private static int f12682n;

    /* renamed from: o */
    private static int f12683o;

    /* renamed from: p */
    private static int f12684p;

    /* renamed from: q */
    private static int[] f12685q;

    /* renamed from: a */
    long f12686a = 0;

    /* renamed from: b */
    long f12687b = 0;

    /* renamed from: c */
    long f12688c = 0;

    /* renamed from: d */
    int f12689d = 0;

    /* renamed from: e */
    public Path f12690e = new Path();

    /* renamed from: f */
    public Paint f12691f = new Paint();

    /* renamed from: g */
    public float f12692g;

    /* renamed from: h */
    public float f12693h;

    /* renamed from: r */
    private int f12694r = f12681m;

    /* renamed from: s */
    private float f12695s = f12679k;

    /* renamed from: t */
    private int f12696t;

    /* renamed from: u */
    private long f12697u = 0;

    public C2830H() {
        this.f12691f.setColor(f12685q[0]);
        this.f12691f.setStrokeWidth(f12679k);
        this.f12691f.setAntiAlias(true);
        this.f12691f.setStyle(Paint.Style.STROKE);
        this.f12691f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f12691f.setStrokeCap(Paint.Cap.ROUND);
        this.f12696t = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.contrail_bounded_length);
    }

    /* renamed from: a */
    public static void m12942a(float f, float f2, int i, int i2, int[] iArr) {
        m12941a();
        f12679k = f;
        f12680l = f2;
        f12678j = f12679k / f12680l;
        f12681m = i;
        f12682n = i2;
        f12683o = (int) (((float) (f12681m - f12682n)) / f12678j);
        f12685q = iArr;
        f12684p = (int) (f12678j / ((float) f12685q.length));
    }

    /* renamed from: a */
    public static void m12941a() {
        f12679k = 0.0f;
        f12680l = 0.0f;
        f12678j = 0.0f;
        f12681m = 0;
        f12682n = 0;
        f12683o = 0;
        f12685q = null;
        f12684p = 0;
    }

    /* renamed from: a */
    public void mo9277a(long j, float f, float f2) {
        this.f12690e.moveTo(f, f2);
        this.f12686a = j;
    }

    /* renamed from: a */
    public void mo9278a(long j, float f, float f2, float f3, float f4) {
        if (this.f12686a != 0) {
            this.f12690e.quadTo(f, f2, f3, f4);
        }
    }

    /* renamed from: b */
    public void mo9281b(long j, float f, float f2) {
        if (this.f12687b == 0) {
            this.f12690e.lineTo(f, f2);
            this.f12687b = j;
        }
    }

    /* renamed from: b */
    public void mo9282b(long j, float f, float f2, float f3, float f4) {
        if (this.f12687b == 0) {
            this.f12690e.quadTo(f, f2, f3, f4);
            this.f12687b = j;
        }
    }

    /* renamed from: a */
    public boolean mo9279a(long j) {
        int i = 1;
        if (this.f12688c != 0 && j - this.f12688c < 10) {
            return false;
        }
        this.f12688c = j;
        if (this.f12694r - f12683o > 0) {
            this.f12694r -= f12683o;
        } else {
            this.f12694r = 0;
        }
        this.f12695s -= f12680l;
        this.f12689d++;
        if (this.f12695s <= 1.0f || this.f12694r <= 10) {
            m12943b();
            return true;
        }
        int i2 = this.f12689d;
        if (f12684p != 0) {
            i = f12684p;
        }
        int i3 = i2 / i;
        if (i3 < f12685q.length) {
            this.f12691f.setColor(f12685q[i3]);
        }
        this.f12691f.setStrokeWidth(this.f12695s);
        this.f12691f.setAlpha(this.f12694r);
        return false;
    }

    /* renamed from: a */
    public boolean mo9280a(long j, float f, long j2) {
        if (this.f12688c != 0 && j - this.f12688c < 10) {
            return false;
        }
        this.f12688c = j;
        if (j2 > ((long) this.f12696t)) {
            m12943b();
            return true;
        } else if (this.f12697u == j2) {
            return mo9279a(j);
        } else {
            this.f12697u = j2;
            this.f12691f.setColor(f12685q[(int) (((float) (f12685q.length - 1)) * f)]);
            this.f12695s = f12679k * f;
            this.f12694r = (int) (((float) f12681m) * f);
            this.f12691f.setStrokeWidth(this.f12695s);
            this.f12691f.setAlpha(this.f12694r);
            return false;
        }
    }

    /* renamed from: a */
    public void mo9276a(int i) {
        this.f12696t = i;
    }

    /* renamed from: b */
    private void m12943b() {
        this.f12689d = 0;
        this.f12690e = null;
        this.f12691f = null;
    }
}
