package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.cootek.smartinput5.p066ui.control.C2846V;
import com.cootek.smartinput5.p066ui.control.LinearScrollView;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.ag */
/* compiled from: ExtendWidget */
public class C2694ag {

    /* renamed from: f */
    private static final String f12041f = "ExtendWidget";

    /* renamed from: g */
    private static final String f12042g = "◂";

    /* renamed from: h */
    private static final String f12043h = "▸";

    /* renamed from: i */
    private static final int f12044i = 6;

    /* renamed from: k */
    private static final int f12045k = -1;

    /* renamed from: l */
    private static final int f12046l = 0;

    /* renamed from: A */
    private boolean f12047A = false;

    /* renamed from: B */
    private int f12048B;

    /* renamed from: C */
    private int f12049C;

    /* renamed from: D */
    private int f12050D;

    /* renamed from: E */
    private int f12051E;

    /* renamed from: F */
    private int f12052F;

    /* renamed from: G */
    private int f12053G;

    /* renamed from: H */
    private int f12054H;

    /* renamed from: I */
    private int f12055I;

    /* renamed from: J */
    private boolean f12056J;

    /* renamed from: K */
    private C2846V.C2847a f12057K = new C2696ah(this);

    /* renamed from: a */
    protected Context f12058a;

    /* renamed from: b */
    LinearScrollView f12059b;

    /* renamed from: c */
    C2833K f12060c;

    /* renamed from: d */
    int[] f12061d = new int[2];

    /* renamed from: e */
    int[] f12062e;

    /* renamed from: j */
    private int f12063j = 0;

    /* renamed from: m */
    private float f12064m;

    /* renamed from: n */
    private int f12065n;

    /* renamed from: o */
    private int f12066o;

    /* renamed from: p */
    private int f12067p;

    /* renamed from: q */
    private int f12068q;

    /* renamed from: r */
    private Drawable f12069r;

    /* renamed from: s */
    private SoftKeyInfo f12070s = null;

    /* renamed from: t */
    private int f12071t = 0;

    /* renamed from: u */
    private int[] f12072u = null;

    /* renamed from: v */
    private int f12073v = -1;

    /* renamed from: w */
    private int f12074w = -1;

    /* renamed from: x */
    private boolean f12075x = false;

    /* renamed from: y */
    private boolean f12076y = false;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2695a f12077z;

    /* renamed from: com.cootek.smartinput5.ui.ag$a */
    /* compiled from: ExtendWidget */
    public interface C2695a {
        void onClickExtendKey(int i);
    }

    public C2694ag(Context context, C2833K k) {
        this.f12058a = context;
        this.f12059b = new LinearScrollView(context);
        this.f12059b.setBackgroundDrawable((Drawable) null);
        this.f12059b.setOrientation(0);
        this.f12059b.setPadding(0, 0, 0, 0);
        this.f12059b.setGravity(17);
        this.f12060c = k;
        this.f12055I = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.preview_height);
        m12426f();
        m12425e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo8943a() {
        return this.f12059b;
    }

    /* renamed from: a */
    public void mo8944a(Rect rect, int[] iArr, int i) {
        this.f12047A = true;
        mo8946a(iArr);
        this.f12060c.mo9306a(false, true);
        this.f12060c.mo9316c((int) R.style.ExtendPopupAnimation);
        this.f12060c.mo9300a(rect, (View) this.f12059b);
    }

    /* renamed from: b */
    public void mo8948b() {
        this.f12047A = false;
        this.f12060c.mo9294a();
    }

    /* renamed from: c */
    public boolean mo8951c() {
        return this.f12047A;
    }

    /* renamed from: a */
    public void mo8945a(C2695a aVar) {
        this.f12077z = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8946a(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            this.f12059b.mo9328b();
            this.f12072u = iArr;
            C1602bh n = C1368X.m6320c().mo5841n();
            this.f12064m = (float) n.mo6265c((int) R.dimen.preview_extendkey_textsize);
            this.f12065n = n.mo6265c((int) R.dimen.extend_key_width);
            this.f12066o = n.mo6265c((int) R.dimen.extend_key_padding);
            this.f12067p = n.mo6248a((int) R.color.popup_extend_key_default_color, C2787cK.POPUP_TEXT);
            this.f12068q = n.mo6260b((int) R.color.popup_extend_key_select_color);
            this.f12069r = n.mo6250a((int) R.drawable.bg_popup_extend_key_ctrl, C2726bF.POPUP_CTRL);
            this.f12070s = new SoftKeyInfo();
            this.f12053G = Engine.getInstance().getDefaultKeyId();
            if (this.f12053G == -1) {
                this.f12053G = 0;
            }
            this.f12054H = this.f12053G;
            m12424d(iArr.length);
            if (this.f12053G == 0 || iArr.length <= this.f12063j) {
                m12422a(iArr, 0, this.f12063j);
            } else {
                m12422a(iArr, iArr.length - this.f12063j, iArr.length);
            }
        }
    }

    /* renamed from: d */
    private void m12424d(int i) {
        if (i > 6) {
            this.f12063j = (i / 2) + 1;
        } else {
            this.f12063j = i;
        }
        if (this.f12053G >= this.f12063j) {
            this.f12048B = this.f12063j - 1;
            this.f12053G = this.f12048B;
        } else {
            this.f12048B = this.f12053G;
        }
        this.f12071t = (i / this.f12063j) + 1;
        if (i % this.f12063j == 0) {
            this.f12071t--;
        }
        this.f12073v = -1;
        this.f12074w = -1;
        this.f12075x = false;
        this.f12076y = false;
    }

    /* renamed from: d */
    private void m12423d() {
        if (this.f12071t <= 1) {
            return;
        }
        if (this.f12048B > 0) {
            this.f12075x = true;
            this.f12076y = false;
            this.f12073v = 0;
            this.f12074w = -1;
            return;
        }
        this.f12075x = false;
        this.f12076y = true;
        this.f12074w = this.f12063j;
        this.f12073v = -1;
    }

    /* renamed from: a */
    private C2846V m12420a(int i, String str) {
        C2846V a = C2846V.m13133a(this.f12058a);
        a.mo9417a(0, 0, 0, 0);
        a.mo9425a(str);
        a.mo9436b(str);
        a.mo9420a(this.f12069r);
        a.mo9437b(true);
        a.mo9456i(true);
        a.mo9447e(false);
        a.mo9416a(this.f12064m);
        a.mo9433b(this.f12064m);
        a.mo9448f(this.f12067p);
        a.mo9451g(this.f12068q);
        a.mo9424a((Object) Integer.valueOf(i));
        a.mo9443d(Math.max(this.f12065n, C2829G.m12928a(a.mo9470v(), (CharSequence) str) + (this.f12066o * 2)));
        if (this.f12077z != null) {
            a.mo9423a(this.f12057K);
        } else {
            a.mo9423a((C2846V.C2847a) null);
        }
        if (i == this.f12054H) {
            a.mo9447e(true);
        }
        return a;
    }

    /* renamed from: a */
    private C2846V m12421a(String str) {
        C2846V a = m12420a(-1, str);
        a.mo9448f(this.f12068q);
        a.mo9416a(this.f12064m - 5.0f);
        a.mo9470v().setTypeface(C1624bv.m7424d());
        Rect rect = new Rect();
        a.mo9470v().getTextBounds(str, 0, str.length(), rect);
        a.mo9443d(rect.width() + (this.f12066o * 2));
        return a;
    }

    /* renamed from: a */
    private void m12422a(int[] iArr, int i, int i2) {
        m12423d();
        if (this.f12075x) {
            C2846V a = m12421a(f12042g);
            this.f12059b.mo9327a(a, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(a.mo9410B(), -1));
            this.f12053G++;
            this.f12048B = this.f12053G;
        }
        while (i < i2 && i < iArr.length) {
            int i3 = iArr[i];
            Engine.getInstance().updateKey(i3, this.f12070s);
            C2846V a2 = m12420a(i3, this.f12070s.mainTitle);
            this.f12059b.mo9327a(a2, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(a2.mo9410B(), -1));
            i++;
        }
        if (this.f12076y) {
            C2846V a3 = m12421a(f12043h);
            this.f12059b.mo9327a(a3, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(a3.mo9410B(), -1));
        }
    }

    /* renamed from: a */
    public boolean mo8947a(MotionEvent motionEvent) {
        this.f12059b.getLocationOnScreen(this.f12061d);
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.f12052F == -1) {
            this.f12052F = y;
        }
        if (this.f12049C == -1) {
            this.f12049C = x;
        }
        if (this.f12050D != this.f12049C - this.f12061d[0]) {
            this.f12050D = this.f12049C - this.f12061d[0];
            this.f12056J = true;
        }
        if (motionEvent.getAction() == 2) {
            if (Engine.getInstance().getWidgetManager().mo9657n() == null || !Engine.getInstance().getWidgetManager().mo9657n().mo9404k() || y - this.f12052F < this.f12055I) {
                mo8949b(mo8942a(x - this.f12061d[0]));
            } else {
                m12426f();
                m12425e();
                return false;
            }
        } else if (motionEvent.getAction() == 1) {
            mo8950c(this.f12048B);
            m12426f();
            m12425e();
        }
        return true;
    }

    /* renamed from: e */
    private void m12425e() {
        this.f12052F = -1;
    }

    /* renamed from: f */
    private void m12426f() {
        this.f12049C = -1;
        this.f12051E = 0;
        this.f12056J = true;
        this.f12062e = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo8942a(int i) {
        int i2 = 0;
        int i3 = this.f12048B;
        int childrenCount = this.f12059b.getChildrenCount();
        if (!(this.f12056J || this.f12062e == null || this.f12062e.length == childrenCount)) {
            this.f12056J = true;
        }
        if (this.f12056J) {
            this.f12056J = false;
            this.f12062e = new int[childrenCount];
            C2846V[] children = this.f12059b.getChildren();
            C2846V v = children[0];
            int i4 = this.f12065n / 2;
            while (i2 < childrenCount) {
                C2846V v2 = children[i2];
                this.f12062e[i2] = ((v2.mo9432b().right + v2.mo9432b().left) / 2) - ((i2 - this.f12053G) * i4);
                i2++;
            }
            this.f12051E = this.f12050D - this.f12062e[this.f12053G];
            return this.f12048B;
        }
        this.f12059b.measure(0, 0);
        int i5 = i - this.f12051E;
        if (this.f12062e == null) {
            return i3;
        }
        if (i5 < this.f12062e[0] - (this.f12065n / 4)) {
            return 0;
        }
        if (i5 > this.f12062e[childrenCount - 1] + (this.f12065n / 4)) {
            return childrenCount - 1;
        }
        while (true) {
            if (i2 >= childrenCount - 1) {
                i2 = i3;
                break;
            } else if (Math.abs(i5 - this.f12062e[i2]) <= this.f12065n / 4) {
                break;
            } else {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8949b(int i) {
        this.f12048B = i;
        int i2 = 0;
        while (i2 < this.f12059b.getChildrenCount()) {
            C2846V v = this.f12059b.getChildren()[i2];
            if (i == this.f12073v) {
                m12426f();
                m12427g();
                return;
            } else if (i == this.f12074w) {
                m12428h();
                return;
            } else {
                if (i2 == i) {
                    if (!v.mo9459k()) {
                        v.mo9447e(true);
                        this.f12059b.invalidate(v.mo9432b());
                    }
                } else if (v.mo9459k()) {
                    v.mo9447e(false);
                    this.f12059b.invalidate(v.mo9432b());
                }
                i2++;
            }
        }
    }

    /* renamed from: g */
    private void m12427g() {
        this.f12059b.mo9328b();
        this.f12053G = 0;
        m12422a(this.f12072u, 0, this.f12063j);
    }

    /* renamed from: h */
    private void m12428h() {
        this.f12059b.mo9328b();
        this.f12053G = this.f12063j - 1;
        m12422a(this.f12072u, this.f12072u.length - this.f12063j, this.f12072u.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8950c(int i) {
        if (i >= 0 && i < this.f12059b.getChildrenCount() && i != this.f12073v && i != this.f12074w) {
            this.f12059b.getChildren()[i].mo9471w();
        }
    }
}
