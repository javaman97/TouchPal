package com.cootek.smartinput5.teaching;

import com.cootek.smartinput5.engine.Engine;

/* renamed from: com.cootek.smartinput5.teaching.o */
/* compiled from: TeachingTipCurve */
class C2595o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2584d f11116a;

    /* renamed from: b */
    private final long f11117b = 5;

    /* renamed from: c */
    private int f11118c;

    /* renamed from: d */
    private float f11119d;

    /* renamed from: e */
    private float f11120e;

    /* renamed from: f */
    private float f11121f;

    /* renamed from: g */
    private float f11122g;

    /* renamed from: h */
    private int f11123h = 0;

    C2595o(C2584d dVar) {
        this.f11116a = dVar;
    }

    public void run() {
        if (this.f11116a.f11086j) {
            return;
        }
        if (this.f11118c == 0 || this.f11116a.f11081e < this.f11118c) {
            float f = this.f11116a.f11083g[this.f11116a.f11081e][0];
            float f2 = this.f11116a.f11083g[this.f11116a.f11081e + 1][0];
            float f3 = this.f11116a.f11083g[this.f11116a.f11081e][1];
            float f4 = this.f11116a.f11083g[this.f11116a.f11081e + 1][1];
            float f5 = (float) (this.f11116a.f11082f[this.f11116a.f11081e] / 5);
            this.f11119d = (f2 - f) / f5;
            this.f11120e = (f4 - f3) / f5;
            if (this.f11116a.f11081e == 0 && this.f11116a.f11085i) {
                this.f11121f = f;
                this.f11122g = f3;
                this.f11118c = this.f11116a.f11083g.length;
                this.f11116a.f11078b.moveTo(this.f11121f, this.f11122g);
                this.f11116a.f11087k.addPoint((int) this.f11121f, ((int) this.f11122g) - this.f11116a.f11084h, 0);
                boolean unused = this.f11116a.f11085i = false;
                this.f11116a.f11087k.setCanvasSize(Engine.getInstance().getWidgetManager().mo9646f().mo9192n(), Engine.getInstance().getWidgetManager().mo9646f().mo9134g());
            }
            this.f11123h++;
            this.f11121f += this.f11119d;
            this.f11122g += this.f11120e;
            this.f11116a.f11078b.lineTo(this.f11121f, this.f11122g);
            if (this.f11123h == 20) {
                this.f11116a.f11087k.addPoint((int) this.f11121f, ((int) this.f11122g) - this.f11116a.f11084h, 2);
                this.f11123h = 0;
            }
            this.f11116a.f11080d.invalidate();
            if (Math.abs(f2 - this.f11121f) < Math.abs(this.f11119d) && Math.abs(f4 - this.f11122g) < Math.abs(f4)) {
                C2584d.m11512j(this.f11116a);
                Engine.getInstance().fireHandwriteOperation(this.f11116a.f11087k);
                Engine.getInstance().processEvent();
            }
            if (this.f11116a.f11081e < this.f11118c - 1) {
                this.f11116a.f11088l.postDelayed(this.f11116a.f11090o, 5);
                return;
            }
            this.f11116a.f11087k.addPoint((int) this.f11121f, ((int) this.f11122g) - this.f11116a.f11084h, 1);
            Engine.getInstance().fireHandwriteOperation(this.f11116a.f11087k);
            Engine.getInstance().processEvent();
            this.f11116a.m11519y();
            this.f11116a.f11089m.run();
        }
    }
}
