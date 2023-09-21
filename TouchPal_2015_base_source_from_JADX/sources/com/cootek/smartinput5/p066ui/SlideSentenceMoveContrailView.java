package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2830H;
import com.cootek.smartinput5.p066ui.control.C2862g;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.SlideSentenceMoveContrailView */
public class SlideSentenceMoveContrailView extends View {

    /* renamed from: g */
    protected static final int f11509g = 20;

    /* renamed from: h */
    private static final int f11510h = 5;

    /* renamed from: t */
    private static final int f11511t = 0;

    /* renamed from: a */
    protected LinkedList<C2830H> f11512a;

    /* renamed from: b */
    protected ArrayList<C2830H> f11513b;

    /* renamed from: c */
    protected final int[] f11514c;

    /* renamed from: d */
    protected float f11515d = getResources().getDisplayMetrics().density;

    /* renamed from: e */
    protected final float f11516e = (8.0f * this.f11515d);

    /* renamed from: f */
    protected final float f11517f = (0.4f * this.f11515d);

    /* renamed from: i */
    private float f11518i;

    /* renamed from: j */
    private float f11519j;

    /* renamed from: k */
    private float f11520k;

    /* renamed from: l */
    private float f11521l;

    /* renamed from: m */
    private float f11522m;

    /* renamed from: n */
    private float f11523n;

    /* renamed from: o */
    private final int f11524o;

    /* renamed from: p */
    private final int f11525p;

    /* renamed from: q */
    private final int f11526q;

    /* renamed from: r */
    private final int f11527r;

    /* renamed from: s */
    private final int f11528s;

    /* renamed from: u */
    private Handler f11529u = new C2737bP(this);

    /* renamed from: v */
    private boolean f11530v;

    public SlideSentenceMoveContrailView(Context context) {
        super(context);
        m11907c();
        this.f11524o = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_stroke_start_color);
        this.f11525p = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_stroke_middle_color);
        this.f11526q = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_stroke_end_color);
        this.f11527r = Color.alpha(C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_stroke_start_alpha));
        this.f11528s = Color.alpha(C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_stroke_end_alpha));
        this.f11514c = C2862g.m13251a(20, this.f11524o, this.f11525p, this.f11526q);
        this.f11512a = new LinkedList<>();
        this.f11513b = new ArrayList<>();
        setBackgroundDrawable((Drawable) null);
        this.f11530v = false;
    }

    public void setContrailLengthBounded(boolean z) {
        this.f11530v = z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        for (int size = this.f11512a.size() - 1; size >= 0; size--) {
            C2830H h = this.f11512a.get(size);
            if (size != this.f11512a.size() - 1) {
                float f = this.f11512a.get(size + 1).f12692g - this.f11512a.get(size).f12692g;
                float f2 = this.f11512a.get(size + 1).f12693h - this.f11512a.get(size).f12693h;
                j = (long) (((double) j) + Math.sqrt((double) ((f2 * f2) + (f * f))));
            }
            canvas.drawPath(h.f12690e, h.f12691f);
            if ((!this.f11530v && h.mo9279a(currentTimeMillis)) || (this.f11530v && h.mo9280a(currentTimeMillis, ((float) (size + 1)) / ((float) this.f11512a.size()), j))) {
                this.f11513b.add(h);
            }
        }
        Iterator<C2830H> it = this.f11513b.iterator();
        while (it.hasNext()) {
            this.f11512a.remove(it.next());
        }
        this.f11513b.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11905b() {
        invalidate();
        this.f11529u.sendEmptyMessageDelayed(0, 20);
    }

    /* renamed from: a */
    public void mo8683a(float f, float f2) {
        m11906b(f, f2);
        float abs = Math.abs(this.f11518i - this.f11522m);
        float abs2 = Math.abs(this.f11519j - this.f11523n);
        long currentTimeMillis = System.currentTimeMillis();
        if (abs > 5.0f || abs2 > 5.0f) {
            if (!this.f11512a.isEmpty()) {
                this.f11512a.getLast().mo9282b(currentTimeMillis, this.f11520k, this.f11521l, (this.f11518i + this.f11520k) / 2.0f, (this.f11519j + this.f11521l) / 2.0f);
            } else {
                C2830H.m12942a(this.f11516e, this.f11517f, this.f11527r, this.f11528s, this.f11514c);
            }
            this.f11522m = f;
            this.f11523n = f2;
            C2830H h = new C2830H();
            h.f12692g = f;
            h.f12693h = f2;
            h.mo9277a(currentTimeMillis, (this.f11518i + this.f11520k) / 2.0f, (this.f11519j + this.f11521l) / 2.0f);
            this.f11512a.add(h);
        } else if (!this.f11512a.isEmpty()) {
            this.f11512a.getLast().mo9278a(currentTimeMillis, this.f11520k, this.f11521l, (this.f11518i + this.f11520k) / 2.0f, (this.f11519j + this.f11521l) / 2.0f);
        }
        this.f11529u.removeMessages(0);
        m11905b();
    }

    /* renamed from: a */
    public void mo8682a() {
        m11907c();
        this.f11512a.clear();
        this.f11529u.removeMessages(0);
        invalidate();
    }

    /* renamed from: b */
    private void m11906b(float f, float f2) {
        if (this.f11518i == -1.0f || this.f11519j == -1.0f || this.f11520k == -1.0f || this.f11521l == -1.0f) {
            this.f11518i = f;
            this.f11519j = f2;
        }
        this.f11520k = this.f11518i;
        this.f11521l = this.f11519j;
        this.f11518i = f;
        this.f11519j = f2;
    }

    /* renamed from: c */
    private void m11907c() {
        this.f11521l = -1.0f;
        this.f11520k = -1.0f;
        this.f11519j = -1.0f;
        this.f11518i = -1.0f;
        this.f11523n = -1.0f;
        this.f11522m = -1.0f;
    }
}
