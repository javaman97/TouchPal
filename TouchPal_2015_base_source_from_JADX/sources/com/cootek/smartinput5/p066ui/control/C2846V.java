package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.cootek.smartinput.utilities.C1000h;
import com.cootek.smartinput.utilities.C1001i;
import com.cootek.smartinput.utilities.C1018z;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1624bv;
import com.emoji.keyboard.touchpal.R;
import java.util.Arrays;

/* renamed from: com.cootek.smartinput5.ui.control.V */
/* compiled from: SubView */
public class C2846V implements C2882z {

    /* renamed from: w */
    static C1000h<C2846V> f12970w;

    /* renamed from: x */
    static int f12971x = 20;

    /* renamed from: a */
    Context f12972a;

    /* renamed from: b */
    Drawable f12973b;

    /* renamed from: c */
    Paint f12974c;

    /* renamed from: d */
    int f12975d;

    /* renamed from: e */
    int f12976e;

    /* renamed from: f */
    int f12977f;

    /* renamed from: g */
    int f12978g;

    /* renamed from: h */
    int f12979h;

    /* renamed from: i */
    int f12980i;

    /* renamed from: j */
    int f12981j;

    /* renamed from: k */
    int f12982k;

    /* renamed from: l */
    String f12983l;

    /* renamed from: m */
    String f12984m;

    /* renamed from: n */
    Rect f12985n;

    /* renamed from: o */
    Rect f12986o;

    /* renamed from: p */
    Rect f12987p;

    /* renamed from: q */
    int[] f12988q;

    /* renamed from: r */
    boolean f12989r;

    /* renamed from: s */
    ViewGroup.LayoutParams f12990s;

    /* renamed from: t */
    Object f12991t;

    /* renamed from: u */
    protected ViewParent f12992u;

    /* renamed from: v */
    C2847a f12993v;

    /* renamed from: y */
    private float f12994y;

    /* renamed from: com.cootek.smartinput5.ui.control.V$a */
    /* compiled from: SubView */
    public interface C2847a {
        /* renamed from: a */
        void mo8953a(C2846V v);
    }

    /* renamed from: com.cootek.smartinput5.ui.control.V$b */
    /* compiled from: SubView */
    static class C2848b implements C1001i<C2846V> {
        C2848b() {
        }

        /* renamed from: a */
        public C2846V createInstance(Object... objArr) {
            return new C2846V(objArr[0]);
        }
    }

    /* renamed from: a */
    public static C2846V m13133a(Context context) {
        if (f12970w == null) {
            f12970w = new C1018z(new C2848b(), f12971x);
        }
        C2846V a = f12970w.mo4087a(context);
        a.mo9442d();
        return a;
    }

    /* renamed from: c */
    static void m13134c() {
        if (f12970w != null) {
            f12970w.mo4088a();
        }
    }

    public C2846V(Context context) {
        this.f12972a = context;
        mo9442d();
    }

    /* renamed from: d */
    public void mo9442d() {
        this.f12988q = new int[0];
        this.f12975d = -1;
        this.f12976e = this.f12972a.getResources().getColor(R.color.candidate_normal);
        if (this.f12973b != null) {
            this.f12973b = null;
        }
        if (this.f12974c == null) {
            this.f12974c = new Paint();
        }
        this.f12974c.setColor(this.f12975d);
        this.f12974c.setAntiAlias(true);
        this.f12974c.setTextAlign(Paint.Align.CENTER);
        this.f12974c.setTypeface(C1624bv.m7418a());
        this.f12994y = this.f12974c.getTextSize();
        if (this.f12985n == null) {
            this.f12985n = new Rect(0, 0, 0, 0);
        } else {
            this.f12985n.setEmpty();
        }
        if (this.f12986o == null) {
            this.f12986o = new Rect(0, 0, 0, 0);
        }
        if (this.f12987p == null) {
            this.f12987p = new Rect(0, 0, 0, 0);
        }
        this.f12989r = true;
        this.f12992u = null;
        this.f12991t = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9418a(Canvas canvas) {
        if (this.f12989r) {
            if (this.f12973b != null) {
                this.f12973b.setBounds(mo9432b());
                this.f12973b.setState(mo9453g());
                this.f12973b.draw(canvas);
            }
            if (mo9458j()) {
                this.f12974c.setColor(-1);
            } else if (mo9459k()) {
                this.f12974c.setColor(this.f12976e);
            } else {
                this.f12974c.setColor(this.f12975d);
            }
            if (this.f12983l != null) {
                this.f12987p.set(this.f12985n.left + 1, this.f12985n.top, this.f12985n.right - 3, this.f12985n.bottom);
                Rect rect = this.f12987p;
                this.f12986o.setEmpty();
                this.f12974c.getTextBounds(this.f12983l, 0, this.f12983l.length(), this.f12986o);
                float centerX = ((float) rect.centerX()) - C2829G.m12926a(this.f12974c, this.f12983l);
                float centerY = ((float) rect.centerY()) - ((this.f12974c.ascent() + this.f12974c.descent()) / 2.0f);
                if (this.f12986o.width() < rect.width()) {
                    canvas.drawText(this.f12983l, centerX, centerY, this.f12974c);
                    return;
                }
                float textSize = this.f12974c.getTextSize();
                float width = (((float) rect.width()) * textSize) / ((float) this.f12986o.width());
                if (width > this.f12994y) {
                    this.f12974c.setTextSize(width);
                    canvas.drawText(this.f12983l, centerX, centerY, this.f12974c);
                    this.f12974c.setTextSize(textSize);
                    return;
                }
                canvas.drawText(this.f12983l, centerX, centerY, this.f12974c);
            }
        }
    }

    /* renamed from: a */
    public void mo9419a(Rect rect) {
        this.f12985n.set(rect);
        mo9435b(rect);
    }

    /* renamed from: b */
    public Rect mo9432b() {
        return this.f12985n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9435b(Rect rect) {
        if (this.f12973b != null) {
            this.f12973b.setBounds(rect);
        }
    }

    /* renamed from: a */
    public boolean mo9428a() {
        return mo9472x() && mo9455h() && mo9458j();
    }

    /* renamed from: a */
    public boolean mo9430a(int i, int i2) {
        return mo9472x() && mo9455h() && this.f12985n.contains(i, i2);
    }

    /* renamed from: c */
    public boolean mo9441c(Rect rect) {
        return mo9472x() && mo9455h() && this.f12985n.contains(rect);
    }

    /* renamed from: a */
    public void mo9426a(boolean z) {
        if (mo9472x() && mo9455h()) {
            mo9444d(z);
        }
    }

    /* renamed from: e */
    public ViewGroup.LayoutParams mo9445e() {
        return this.f12990s;
    }

    /* renamed from: a */
    public void mo9421a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            throw new NullPointerException("params == null");
        }
        this.f12990s = layoutParams;
        mo9466r();
    }

    /* renamed from: f */
    public boolean mo9450f() {
        return this.f12973b != null && this.f12973b.isStateful();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9431a(int[] iArr) {
        if (this.f12973b == null || !this.f12973b.setState(iArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo9438b(int[] iArr) {
        if (Arrays.equals(this.f12988q, iArr)) {
            return false;
        }
        this.f12988q = iArr;
        return mo9431a(iArr);
    }

    /* renamed from: g */
    public int[] mo9453g() {
        return this.f12988q;
    }

    /* renamed from: h */
    public boolean mo9455h() {
        return mo9429a(16842910);
    }

    /* renamed from: b */
    public void mo9437b(boolean z) {
        mo9427a(z, 16842910);
    }

    /* renamed from: i */
    public boolean mo9457i() {
        return mo9429a(16842908);
    }

    /* renamed from: c */
    public void mo9440c(boolean z) {
        mo9427a(z, 16842908);
    }

    /* renamed from: j */
    public boolean mo9458j() {
        return mo9429a(16842919);
    }

    /* renamed from: d */
    public void mo9444d(boolean z) {
        mo9427a(z, 16842919);
    }

    /* renamed from: k */
    public boolean mo9459k() {
        return mo9429a(16842913);
    }

    /* renamed from: e */
    public void mo9447e(boolean z) {
        mo9427a(z, 16842913);
    }

    /* renamed from: l */
    public boolean mo9460l() {
        return mo9429a(16842909);
    }

    /* renamed from: f */
    public void mo9449f(boolean z) {
        mo9427a(z, 16842909);
    }

    /* renamed from: m */
    public boolean mo9461m() {
        return mo9429a(16842916);
    }

    /* renamed from: g */
    public void mo9452g(boolean z) {
        mo9427a(z, 16842916);
    }

    /* renamed from: n */
    public boolean mo9462n() {
        return mo9429a(16842918);
    }

    /* renamed from: h */
    public void mo9454h(boolean z) {
        mo9427a(z, 16842918);
    }

    /* renamed from: a */
    public boolean mo9429a(int i) {
        for (int i2 : this.f12988q) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9427a(boolean z, int i) {
        if (z) {
            mo9438b(LinearScrollView.m13006a(this.f12988q, new int[]{i}));
            return;
        }
        mo9438b(LinearScrollView.m13008b(this.f12988q, new int[]{i}));
    }

    /* renamed from: o */
    public Object mo9463o() {
        return this.f12991t;
    }

    /* renamed from: a */
    public void mo9424a(Object obj) {
        this.f12991t = obj;
    }

    /* renamed from: a */
    public void mo9425a(String str) {
        this.f12983l = str;
    }

    /* renamed from: p */
    public String mo9464p() {
        return this.f12983l;
    }

    /* renamed from: b */
    public void mo9436b(String str) {
        this.f12984m = str;
    }

    /* renamed from: q */
    public String mo9465q() {
        return this.f12984m;
    }

    /* renamed from: b */
    public void mo9434b(int i) {
        mo9420a(C1368X.m6320c().mo5841n().mo6249a(i));
    }

    /* renamed from: a */
    public void mo9420a(Drawable drawable) {
        this.f12973b = drawable;
    }

    /* renamed from: a */
    public void mo9423a(C2847a aVar) {
        this.f12993v = aVar;
    }

    /* renamed from: r */
    public void mo9466r() {
        if (this.f12992u != null && !this.f12992u.isLayoutRequested()) {
            this.f12992u.requestLayout();
        }
    }

    /* renamed from: s */
    public final ViewParent mo9467s() {
        return this.f12992u;
    }

    /* renamed from: a */
    public void mo9422a(ViewParent viewParent) {
        if (this.f12992u == null) {
            this.f12992u = viewParent;
        } else if (viewParent == null) {
            this.f12992u = null;
        } else {
            throw new RuntimeException("view " + this + " being added, but" + " it already has a parent");
        }
    }

    /* renamed from: t */
    public int mo9468t() {
        return Math.max(Math.max(this.f12973b == null ? 0 : this.f12973b.getBounds().width(), (int) (this.f12983l == null ? 0.0f : this.f12974c.measureText(this.f12983l))) + mo9412D() + mo9414F(), this.f12978g);
    }

    /* renamed from: u */
    public int mo9469u() {
        return Math.max(Math.max(this.f12973b == null ? 0 : this.f12973b.getBounds().height(), (int) (this.f12983l == null ? 0.0f : this.f12974c.getTextSize())) + mo9413E() + mo9415G(), this.f12977f);
    }

    /* renamed from: v */
    public Paint mo9470v() {
        return this.f12974c;
    }

    /* renamed from: w */
    public boolean mo9471w() {
        if (this.f12993v == null || !this.f12989r || !mo9455h()) {
            return false;
        }
        this.f12993v.mo8953a(this);
        return true;
    }

    /* renamed from: x */
    public boolean mo9472x() {
        return this.f12989r;
    }

    /* renamed from: i */
    public void mo9456i(boolean z) {
        this.f12989r = z;
    }

    /* renamed from: c */
    public void mo9439c(int i) {
        this.f12974c.setColor(i);
    }

    /* renamed from: y */
    public int mo9473y() {
        return this.f12974c.getColor();
    }

    /* renamed from: a */
    public void mo9416a(float f) {
        this.f12974c.setTextSize(f);
    }

    /* renamed from: z */
    public float mo9474z() {
        return this.f12974c.getTextSize();
    }

    /* renamed from: b */
    public void mo9433b(float f) {
        this.f12994y = f;
    }

    /* renamed from: A */
    public float mo9409A() {
        return this.f12994y;
    }

    /* renamed from: d */
    public void mo9443d(int i) {
        this.f12978g = i;
    }

    /* renamed from: B */
    public int mo9410B() {
        return this.f12978g;
    }

    /* renamed from: e */
    public void mo9446e(int i) {
        this.f12977f = i;
    }

    /* renamed from: C */
    public int mo9411C() {
        return this.f12977f;
    }

    /* renamed from: a */
    public void mo9417a(int i, int i2, int i3, int i4) {
        this.f12979h = i;
        this.f12981j = i2;
        this.f12980i = i3;
        this.f12982k = i4;
    }

    /* renamed from: D */
    public int mo9412D() {
        return this.f12979h;
    }

    /* renamed from: E */
    public int mo9413E() {
        return this.f12981j;
    }

    /* renamed from: F */
    public int mo9414F() {
        return this.f12980i;
    }

    /* renamed from: G */
    public int mo9415G() {
        return this.f12982k;
    }

    /* renamed from: f */
    public void mo9448f(int i) {
        this.f12975d = i;
    }

    /* renamed from: g */
    public void mo9451g(int i) {
        this.f12976e = i;
    }
}
