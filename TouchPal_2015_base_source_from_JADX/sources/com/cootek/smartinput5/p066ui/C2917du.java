package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.cootek.smartinput.p044a.C0978q;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1403aO;
import com.cootek.smartinput5.func.C1439ao;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.paopaopanel.C1937f;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.smileypanel.C2061k;
import com.cootek.smartinput5.func.smileypanel.C2063m;
import com.cootek.smartinput5.func.smileypanel.SmileyListView;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.C2934m;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.cootek.smartinput5.p066ui.control.C2849W;
import com.cootek.smartinput5.p066ui.control.C2863h;
import com.cootek.smartinput5.p066ui.control.MoveContrailView;
import com.cootek.smartinput5.p066ui.control.SlideSentenceView;
import com.cootek.smartinput5.p066ui.settings.C3007aV;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.cootek.smartinput5.urlnavigator.C3265f;
import com.cootek.smartinput5.urlnavigator.C3280s;
import com.emoji.keyboard.touchpal.R;
import com.google.android.voiceime.VoiceRecognitionTrigger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.du */
/* compiled from: WidgetManager */
public class C2917du implements C1403aO.C1404a, C1602bh.C1604b {

    /* renamed from: T */
    private static final int f13158T = 4;

    /* renamed from: a */
    public static final int f13159a = 0;

    /* renamed from: b */
    public static final int f13160b = 1;

    /* renamed from: c */
    public static final int f13161c = 2;

    /* renamed from: d */
    private static final String f13162d = "WidgetManager";

    /* renamed from: e */
    private static final String f13163e = "chs_sym_types";

    /* renamed from: f */
    private static final String f13164f = "eng_sym_types";

    /* renamed from: g */
    private static final String f13165g = "smiley_pad";

    /* renamed from: h */
    private static final String f13166h = "smiley_pad_international";

    /* renamed from: i */
    private static final String f13167i = "smiley_pad_with_emojiart";

    /* renamed from: A */
    private SymGridView f13168A;

    /* renamed from: B */
    private SmileyListView f13169B;

    /* renamed from: C */
    private C2833K f13170C;

    /* renamed from: D */
    private C2863h f13171D;

    /* renamed from: E */
    private C2694ag f13172E;

    /* renamed from: F */
    private C2722bB f13173F;

    /* renamed from: G */
    private C2649V f13174G;

    /* renamed from: H */
    private HandWriteView f13175H;

    /* renamed from: I */
    private VoiceView f13176I;

    /* renamed from: J */
    private ClipboardView f13177J;

    /* renamed from: K */
    private C3280s f13178K;

    /* renamed from: L */
    private C1937f f13179L;

    /* renamed from: M */
    private C2826E f13180M;

    /* renamed from: N */
    private C3007aV f13181N;

    /* renamed from: O */
    private C2061k f13182O;

    /* renamed from: P */
    private C2906dj f13183P;

    /* renamed from: Q */
    private C2811cf f13184Q;

    /* renamed from: R */
    private LinkedList<Object[]> f13185R;

    /* renamed from: S */
    private boolean f13186S;

    /* renamed from: U */
    private boolean f13187U = false;

    /* renamed from: j */
    private InputMethodService f13188j;

    /* renamed from: k */
    private LayoutInflater f13189k;

    /* renamed from: l */
    private C2929h f13190l;

    /* renamed from: m */
    private ViewGroup f13191m;

    /* renamed from: n */
    private C2934m f13192n;

    /* renamed from: o */
    private C2792cP f13193o;

    /* renamed from: p */
    private SoftKeyboardView f13194p;

    /* renamed from: q */
    private MoveContrailView f13195q;

    /* renamed from: r */
    private HandWriteHalfView f13196r;

    /* renamed from: s */
    private HandWriteMask f13197s;

    /* renamed from: t */
    private HandWriteMaskView f13198t;

    /* renamed from: u */
    private SlideSentenceView f13199u;

    /* renamed from: v */
    private EmotionScroll f13200v;

    /* renamed from: w */
    private FilterScroll f13201w;

    /* renamed from: x */
    private String f13202x = "";

    /* renamed from: y */
    private SymTypesScroll f13203y;

    /* renamed from: z */
    private SymTypesScroll f13204z;

    /* renamed from: com.cootek.smartinput5.ui.du$a */
    /* compiled from: WidgetManager */
    public static class C2918a {

        /* renamed from: a */
        public C1443as f13205a;
    }

    public C2917du(InputMethodService inputMethodService) {
        this.f13188j = inputMethodService;
        this.f13189k = inputMethodService.getLayoutInflater();
        this.f13185R = new LinkedList<>();
        this.f13190l = new C2929h();
        C1368X.m6320c().mo5824J().mo6007a(this.f13190l);
        C1368X.m6320c().mo5824J().mo6007a(this);
        C1368X.m6320c().mo5841n().mo6254a((C1602bh.C1604b) this);
    }

    /* renamed from: b */
    public ViewGroup mo9637b() {
        View findViewById = Engine.getInstance().getIms().getWindow().findViewById(16908317);
        if (findViewById != null && findViewById.getParent() != null) {
            return (ViewGroup) findViewById.getParent().getParent();
        }
        if (this.f13191m == null || this.f13191m.getParent() == null) {
            return null;
        }
        return (ViewGroup) this.f13191m.getParent().getParent();
    }

    /* renamed from: c */
    public View mo9640c() {
        if (this.f13191m == null) {
            this.f13191m = (ViewGroup) this.f13189k.inflate(R.layout.input, (ViewGroup) null);
        }
        if (this.f13191m.getParent() != null) {
            ((ViewGroup) this.f13191m.getParent()).removeAllViews();
        }
        m13397ak();
        return this.f13191m;
    }

    /* renamed from: ak */
    private void m13397ak() {
        Class<ViewGroup> cls = ViewGroup.class;
        try {
            Method method = cls.getMethod("setMotionEventSplittingEnabled", new Class[]{Boolean.TYPE});
            if (method != null && mo9637b() != null) {
                try {
                    method.invoke(mo9637b(), new Object[]{false});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                }
            }
        } catch (NoSuchMethodException e2) {
        }
    }

    /* renamed from: e */
    public ViewGroup mo9643e() {
        return this.f13191m;
    }

    /* renamed from: f */
    public C2811cf mo9646f() {
        return this.f13184Q;
    }

    /* renamed from: g */
    public SoftKeyboardView mo9648g() {
        return this.f13194p;
    }

    /* renamed from: h */
    public FunctionBar mo9650h() {
        return mo9651i().mo9719e();
    }

    /* renamed from: i */
    public C2934m mo9651i() {
        if (this.f13192n == null) {
            this.f13192n = new C2934m(this.f13188j);
        }
        return this.f13192n;
    }

    /* renamed from: j */
    public C2792cP mo9653j() {
        return mo9623a(true);
    }

    /* renamed from: a */
    public C2792cP mo9623a(boolean z) {
        if (this.f13193o == null && z) {
            this.f13193o = new C2792cP(this.f13188j);
        }
        return this.f13193o;
    }

    /* renamed from: a */
    public SoftKeyboardView mo9622a(String str) {
        SoftKeyboardView softKeyboardView;
        boolean z;
        if (str == null) {
            return null;
        }
        C2826E ad = mo9630ad();
        Iterator it = this.f13185R.iterator();
        while (true) {
            if (!it.hasNext()) {
                softKeyboardView = null;
                break;
            }
            Object[] objArr = (Object[]) it.next();
            if (objArr.length == 4) {
                boolean z2 = ad.mo9266x() == 5;
                if (((Integer) objArr[2]).intValue() == 5) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = z2 ^ z;
                if (str.equals(objArr[0]) && ad.mo9260r() == ((Boolean) objArr[3]).booleanValue() && !z3) {
                    this.f13185R.remove(objArr);
                    this.f13185R.addLast(objArr);
                    softKeyboardView = (SoftKeyboardView) ((ViewGroup) objArr[1]).findViewById(R.id.keyboard);
                    this.f13184Q = softKeyboardView.getKeyboard();
                    this.f13184Q.mo9020e();
                    if (ad.mo9266x() != ((Integer) objArr[2]).intValue()) {
                        objArr[2] = Integer.valueOf(ad.mo9266x());
                        softKeyboardView.mo8725a();
                    }
                }
            }
        }
        if (softKeyboardView != null) {
            return softKeyboardView;
        }
        int i = R.layout.keyboard_view;
        if (Engine.getInstance().getSurfaceType() == 3) {
            this.f13184Q = new C2744bW(str);
        } else if (str.equals("eng_sym_grid_international") || str.equals("chs_sym_grid") || str.equals("chs_sym_grid_international")) {
            this.f13184Q = new C2885cr(str);
            i = R.layout.sym_keyboard_view;
        } else if (f13165g.equals(str) || f13166h.equals(str) || f13167i.equals(str)) {
            this.f13184Q = new C2063m(str);
            i = R.layout.smiley_keyboard_view;
        } else {
            this.f13184Q = new C2811cf(str);
        }
        ViewGroup viewGroup = (ViewGroup) this.f13189k.inflate(i, (ViewGroup) null);
        SoftKeyboardView softKeyboardView2 = (SoftKeyboardView) viewGroup.findViewById(R.id.keyboard);
        softKeyboardView2.setKeyboard(this.f13184Q);
        if (this.f13185R.size() == 4) {
            m13396a(this.f13185R.removeFirst());
        }
        this.f13185R.add(new Object[]{str, viewGroup, Integer.valueOf(ad.mo9266x()), Boolean.valueOf(ad.mo9260r())});
        return softKeyboardView2;
    }

    /* renamed from: a */
    private void m13396a(Object[] objArr) {
        if (objArr != null) {
            SoftKeyboardView softKeyboardView = (SoftKeyboardView) objArr[1].findViewById(R.id.keyboard);
            if (softKeyboardView.getKeyboard() != null) {
                softKeyboardView.getKeyboard().mo9190l();
            }
        }
    }

    /* renamed from: a */
    public void mo9626a(SoftKeyboardView softKeyboardView) {
        if (this.f13191m != null) {
            this.f13191m.removeAllViews();
        }
        if (softKeyboardView != null) {
            if (this.f13191m != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, softKeyboardView.getKeyboard().mo9134g());
                if (!(softKeyboardView.getParent() == null || softKeyboardView.getParent().getParent() == null)) {
                    ((ViewGroup) softKeyboardView.getParent().getParent()).removeView((View) softKeyboardView.getParent());
                }
                this.f13191m.addView((ViewGroup) softKeyboardView.getParent(), layoutParams);
                this.f13191m.setLayoutParams(new FrameLayout.LayoutParams(-1, softKeyboardView.getKeyboard().mo9134g()));
            }
            this.f13194p = softKeyboardView;
            if (mo9651i().mo9715a() && mo9650h() != null) {
                mo9650h().mo8552o();
            }
        }
    }

    /* renamed from: k */
    public void mo9654k() {
        this.f13195q = new MoveContrailView(this.f13188j);
        this.f13195q.setBackgroundDrawable((Drawable) null);
        if (this.f13191m != null && this.f13194p != null && this.f13194p.getKeyboard() != null) {
            this.f13191m.addView(this.f13195q, new FrameLayout.LayoutParams(-1, this.f13194p.getKeyboard().mo9134g()));
        }
    }

    /* renamed from: l */
    public MoveContrailView mo9655l() {
        return this.f13195q;
    }

    /* renamed from: m */
    public void mo9656m() {
        if (this.f13199u != null) {
            if (this.f13199u.getParent() != null) {
                ((ViewGroup) this.f13199u.getParent()).removeView(this.f13199u);
            }
            if (!(this.f13199u.getContrailView() == null || this.f13199u.getContrailView().getParent() == null)) {
                ((ViewGroup) this.f13199u.getContrailView().getParent()).removeView(this.f13199u.getContrailView());
            }
        }
        if (this.f13199u == null) {
            this.f13199u = new SlideSentenceView(this.f13188j);
        } else {
            this.f13199u.mo9389a();
        }
        if (this.f13191m != null && this.f13194p != null && this.f13194p.getKeyboard() != null) {
            this.f13191m.addView(this.f13199u, new ViewGroup.LayoutParams(-1, this.f13194p.getKeyboard().mo9134g()));
            this.f13191m.addView(this.f13199u.getContrailView(), new ViewGroup.LayoutParams(-1, this.f13194p.getKeyboard().mo9134g()));
        }
    }

    /* renamed from: n */
    public SlideSentenceView mo9657n() {
        return this.f13199u;
    }

    /* renamed from: o */
    public void mo9658o() {
        if (this.f13197s == null) {
            this.f13197s = new HandWriteMask(this.f13188j);
        }
        if (this.f13191m != null && this.f13194p != null && this.f13194p.getKeyboard() != null) {
            this.f13191m.addView(this.f13197s, new FrameLayout.LayoutParams(-1, this.f13194p.getKeyboard().mo9134g()));
            if (Engine.isInitialized() && Engine.getInstance().isHandwriteMaskVisible()) {
                Engine.getInstance().getHandWriteMaskManager().updateHandWriteMask(true);
            }
        }
    }

    /* renamed from: p */
    public HandWriteMask mo9659p() {
        return this.f13197s;
    }

    /* renamed from: q */
    public void mo9660q() {
        if (this.f13200v == null) {
            this.f13200v = (EmotionScroll) this.f13189k.inflate(R.layout.emotion_view, (ViewGroup) null);
        }
        this.f13200v.mo8526a();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f13200v.getDisplayWidth(), this.f13200v.getDisplayHeight());
        if (this.f13194p != null) {
            if (this.f13200v.getParent() != null) {
                ((ViewGroup) this.f13200v.getParent()).removeView(this.f13200v);
            }
            ((ViewGroup) this.f13194p.getParent()).addView(this.f13200v, layoutParams);
        }
        if (this.f13201w == null) {
            this.f13201w = (FilterScroll) this.f13189k.inflate(R.layout.filter_view, (ViewGroup) null);
        }
        this.f13201w.mo8526a();
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(this.f13201w.getDisplayWidth(), this.f13201w.getDisplayHeight());
        if (this.f13194p != null) {
            if (this.f13201w.getParent() != null) {
                ((ViewGroup) this.f13201w.getParent()).removeView(this.f13201w);
            }
            ((ViewGroup) this.f13194p.getParent()).addView(this.f13201w, layoutParams2);
        }
        this.f13186S = true;
        mo9639b(false);
    }

    /* renamed from: b */
    public void mo9639b(boolean z) {
        if (z != this.f13186S) {
            if (z) {
                if (this.f13201w != null) {
                    this.f13201w.setVisibility(0);
                }
                if (this.f13200v != null) {
                    this.f13200v.setVisibility(4);
                }
            } else {
                if (this.f13201w != null) {
                    this.f13201w.setVisibility(4);
                }
                if (this.f13200v != null) {
                    this.f13200v.setVisibility(0);
                }
            }
            this.f13186S = z;
        }
    }

    /* renamed from: c */
    private void m13402c(String str) {
        boolean z = false;
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        if (str.equals(f13163e)) {
            this.f13202x = f13163e;
            if (this.f13204z == null || this.f13204z.getZoomingStateRecord() != ad.mo9260r()) {
                this.f13204z = (SymTypesScroll) this.f13189k.inflate(R.layout.sym_types_scroll, (ViewGroup) null);
                this.f13204z.setXmlLayout(f13163e);
                this.f13204z.setZoomingStateRecord(ad.mo9260r());
            }
            this.f13204z.mo8526a();
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f13204z.getDisplayWidth(), this.f13204z.getDisplayHeight());
            if (this.f13194p != null) {
                if (this.f13204z.getParent() != null) {
                    ((ViewGroup) this.f13204z.getParent()).removeView(this.f13204z);
                }
                ((ViewGroup) this.f13194p.getParent()).addView(this.f13204z, layoutParams);
            }
            z = true;
        } else if (str.equals(f13164f)) {
            this.f13202x = f13164f;
            if (this.f13203y == null || this.f13203y.getZoomingStateRecord() != ad.mo9260r()) {
                this.f13203y = (SymTypesScroll) this.f13189k.inflate(R.layout.sym_types_scroll, (ViewGroup) null);
                this.f13203y.setXmlLayout(f13164f);
                this.f13203y.setZoomingStateRecord(ad.mo9260r());
            }
            this.f13203y.mo8526a();
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(this.f13203y.getDisplayWidth(), this.f13203y.getDisplayHeight());
            if (this.f13194p != null) {
                if (this.f13203y.getParent() != null) {
                    ((ViewGroup) this.f13203y.getParent()).removeView(this.f13203y);
                }
                ((ViewGroup) this.f13194p.getParent()).addView(this.f13203y, layoutParams2);
            }
            z = true;
        }
        if (z) {
            if (this.f13168A == null) {
                this.f13168A = (SymGridView) this.f13189k.inflate(R.layout.sym_grid_view, (ViewGroup) null);
            }
            if (this.f13184Q instanceof C2885cr) {
                ((C2885cr) this.f13184Q).mo9557a(this.f13168A);
            }
            if (this.f13194p != null) {
                if (this.f13168A.getParent() != null) {
                    ((ViewGroup) this.f13168A.getParent()).removeView(this.f13168A);
                }
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.f13168A.getDisplayWidth(), this.f13168A.getDisplayHeight(), 5);
                layoutParams3.setMargins(this.f13168A.getLeftMargin(), this.f13168A.getTopMargin(), this.f13168A.getRightMargin(), this.f13168A.getBottomMargin());
                ((ViewGroup) this.f13194p.getParent()).addView(this.f13168A, layoutParams3);
            }
        }
    }

    /* renamed from: d */
    private void m13403d(String str) {
        if (str.equals(f13165g)) {
            if (this.f13169B == null) {
                this.f13169B = (SmileyListView) this.f13189k.inflate(R.layout.smiley_panel, (ViewGroup) null);
            }
            if (this.f13184Q instanceof C2063m) {
                ((C2063m) this.f13184Q).mo7434a(this.f13169B);
            }
            if (this.f13194p != null) {
                if (this.f13169B.getParent() != null) {
                    ((ViewGroup) this.f13169B.getParent()).removeView(this.f13169B);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f13169B.getDisplayWidth(), this.f13169B.getDisplayHeight(), 5);
                layoutParams.setMargins(this.f13169B.getLeftMargin(), this.f13169B.getTopMargin(), this.f13169B.getRightMargin(), this.f13169B.getBottomMargin());
                ((ViewGroup) this.f13194p.getParent()).addView(this.f13169B, layoutParams);
            }
        }
    }

    /* renamed from: b */
    public void mo9638b(String str) {
        m13402c(str);
        m13403d(str);
    }

    /* renamed from: r */
    public SmileyListView mo9661r() {
        return this.f13169B;
    }

    /* renamed from: s */
    public void mo9662s() {
        m13395a((View) this.f13168A);
        m13395a((View) this.f13203y);
        m13395a((View) this.f13204z);
        m13395a((View) this.f13169B);
    }

    /* renamed from: t */
    public View mo9663t() {
        return mo9651i().mo9716b();
    }

    /* renamed from: u */
    public void mo9664u() {
    }

    /* renamed from: v */
    public void mo9665v() {
        if (this.f13179L != null) {
            this.f13179L.mo7132g();
        }
        if (this.f13182O != null) {
            this.f13182O.mo7421a(true, false);
        }
        if (!(this.f13192n == null || this.f13192n.mo9719e() == null)) {
            this.f13192n.mo9719e().mo8542g();
        }
        if (this.f13194p != null) {
            this.f13194p.mo8733b();
        }
        if (this.f13170C != null) {
            this.f13170C.mo9305a(true);
        }
        if (this.f13171D != null) {
            this.f13171D.mo9511a();
        }
        if (this.f13172E != null) {
            this.f13172E.mo8948b();
        }
        if (this.f13173F != null) {
            this.f13173F.dismiss();
        }
        if (this.f13174G != null) {
            this.f13174G.mo8873a();
        }
        if (this.f13175H != null) {
            this.f13175H.mo8632e();
        }
        if (this.f13196r != null) {
            this.f13196r.mo8605e();
        }
        if (this.f13198t != null) {
            this.f13198t.mo8624h();
        }
        if (this.f13193o != null) {
            this.f13193o.mo9120b();
        }
        if (this.f13199u != null) {
            this.f13199u.mo9395d();
            this.f13199u.mo9396e();
        }
        if (C2721bA.m12494a().mo8991b()) {
            C2721bA.m12494a().mo8992c();
        }
        mo9625a(0, 0, 0);
    }

    /* renamed from: w */
    public void mo9666w() {
        if (Engine.isInitialized()) {
            Engine.getInstance().getSurfaceManager().stopAnimation();
        }
        mo9665v();
        if (!(this.f13191m == null || this.f13194p == null)) {
            this.f13191m.removeView((ViewGroup) this.f13194p.getParent());
        }
        if (this.f13192n != null) {
            this.f13192n.mo9722h();
        }
        if (this.f13181N != null) {
            this.f13181N.mo10104f();
            this.f13181N = null;
        }
        mo9631ae();
        if (this.f13179L != null) {
            this.f13179L.mo7137l();
            this.f13179L = null;
        }
        mo9620Z();
        mo9628ab();
        mo9627aa();
        m13401ao();
        this.f13194p = null;
        this.f13170C = null;
        this.f13171D = null;
        this.f13173F = null;
        this.f13172E = null;
        if (this.f13174G != null) {
            this.f13174G.f11913e = true;
            this.f13174G = null;
        }
        this.f13193o = null;
        this.f13175H = null;
        this.f13196r = null;
        this.f13198t = null;
        this.f13176I = null;
        this.f13177J = null;
        this.f13185R.clear();
        this.f13190l.mo9708b();
    }

    /* renamed from: x */
    public C2833K mo9667x() {
        if (this.f13170C == null) {
            this.f13170C = new C2833K(this.f13188j);
            this.f13170C.mo9304a(this.f13188j.getWindow().getWindow().getDecorView());
        }
        return this.f13170C;
    }

    /* renamed from: y */
    public C2863h mo9668y() {
        if (this.f13171D == null) {
            this.f13171D = new C2863h(this.f13188j);
        }
        return this.f13171D;
    }

    /* renamed from: z */
    public C2694ag mo9669z() {
        if (this.f13172E == null) {
            this.f13172E = new C2694ag(this.f13188j, mo9667x());
        }
        return this.f13172E;
    }

    /* renamed from: A */
    public C2722bB mo9596A() {
        if (this.f13173F == null) {
            this.f13173F = new C2722bB(this.f13188j);
        }
        return this.f13173F;
    }

    /* renamed from: B */
    public C2649V mo9597B() {
        if (this.f13174G == null) {
            this.f13174G = new C2649V(this.f13188j);
        }
        return this.f13174G;
    }

    /* renamed from: C */
    public HandWriteView mo9598C() {
        return mo9641c(true);
    }

    /* renamed from: c */
    public HandWriteView mo9641c(boolean z) {
        if (this.f13175H == null && z) {
            this.f13175H = new HandWriteView(this.f13188j);
        }
        return this.f13175H;
    }

    /* renamed from: D */
    public HandWriteHalfView mo9599D() {
        return mo9642d(true);
    }

    /* renamed from: d */
    public HandWriteHalfView mo9642d(boolean z) {
        if (this.f13196r == null && z) {
            this.f13196r = new HandWriteHalfView(this.f13188j);
        }
        return this.f13196r;
    }

    /* renamed from: E */
    public HandWriteMaskView mo9600E() {
        return mo9644e(true);
    }

    /* renamed from: e */
    public HandWriteMaskView mo9644e(boolean z) {
        if (this.f13198t == null && z) {
            this.f13198t = new HandWriteMaskView(this.f13188j);
        }
        return this.f13198t;
    }

    /* renamed from: F */
    public void mo9601F() {
        Engine instance = Engine.getInstance();
        if (m13400an()) {
            m13394I();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo9609O().getDisplayWidth(), mo9609O().getDisplayHeight());
        if (this.f13194p != null) {
            if (this.f13176I.getParent() != null) {
                ((ViewGroup) this.f13176I.getParent()).removeView(this.f13176I);
            }
            this.f13191m.addView(this.f13176I, layoutParams);
            instance.commitKeyEvent(Engine.KEYCODE_FUN_VOICE);
        }
        if (this.f13176I != null) {
            this.f13176I.mo8883k();
        }
    }

    /* renamed from: G */
    public void mo9602G() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mo9610P().getDisplayWidth(), mo9610P().getDisplayHeight());
        if (this.f13194p != null) {
            if (this.f13177J.getParent() != null) {
                ((ViewGroup) this.f13177J.getParent()).removeView(this.f13177J);
            }
            this.f13191m.addView(this.f13177J, layoutParams);
        }
        if (this.f13177J != null) {
            this.f13177J.mo8510d();
        }
    }

    /* renamed from: H */
    public boolean mo9603H() {
        return "clipboard".equals(Engine.getInstance().getSurfaceTemplate());
    }

    /* renamed from: al */
    private boolean m13398al() {
        return "eng_edit".equals(Engine.getInstance().getSurfaceTemplate());
    }

    /* renamed from: am */
    private void m13399am() {
        Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_back"), 0);
        Engine.getInstance().processEvent();
    }

    /* renamed from: an */
    private boolean m13400an() {
        if (Settings.getInstance().getIntSetting(Settings.VOICE_INPUT_ENGINE) != 0 || !C0978q.m5067c()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static void m13394I() {
        Engine instance = Engine.getInstance();
        VoiceRecognitionTrigger voiceTypingTrigger = instance.getVoiceTypingTrigger();
        if (voiceTypingTrigger == null) {
            return;
        }
        if (!voiceTypingTrigger.isInstalled()) {
            instance.getVoiceProcessor().showDownloadVoiceEngineDialog();
            return;
        }
        try {
            voiceTypingTrigger.startVoiceRecognition();
        } catch (Exception e) {
            C2849W a = C2849W.m13205a();
            C1368X.m6320c();
            a.mo9476a(C1974m.m9063a(C1368X.m6313b(), (int) R.string.vi_voice_typing_not_available));
        }
    }

    /* renamed from: J */
    public FilterScroll mo9604J() {
        return this.f13201w;
    }

    /* renamed from: K */
    public SymTypesScroll mo9605K() {
        if (this.f13202x.equals(f13164f) && this.f13203y != null) {
            return this.f13203y;
        }
        if (!this.f13202x.equals(f13163e) || this.f13204z == null) {
            return null;
        }
        return this.f13204z;
    }

    /* renamed from: L */
    public C2929h mo9606L() {
        return this.f13190l;
    }

    /* renamed from: a */
    public void mo9624a(int i) {
        View t;
        if (i == 3276808 || i == 3276809) {
            if (this.f13178K == null || !Engine.getInstance().getSurfaceTemplate().equals(C3265f.f14360a)) {
                this.f13184Q.mo9016a(i);
            } else {
                this.f13178K.mo10478a(i);
            }
        }
        if (((i >= 3145768 && i <= 3145771) || (i >= 3145772 && i <= 3145783)) && (t = mo9663t()) != null) {
            ((C2934m.C2935a) t).mo8497a_(i);
        }
    }

    /* renamed from: d */
    public void mo6043d() {
        mo9665v();
        SoftKeyboardView.m11921a(C1368X.m6324d() ? C1368X.m6320c().mo5841n().mo6282k() : true);
        if (this.f13192n != null) {
            this.f13192n.mo9722h();
        }
        mo9619Y();
        this.f13170C = null;
        this.f13171D = null;
        this.f13173F = null;
        this.f13172E = null;
        if (this.f13174G != null) {
            this.f13174G.mo8873a();
            this.f13174G = null;
        }
        this.f13176I = null;
        this.f13177J = null;
        this.f13201w = null;
        this.f13200v = null;
        this.f13203y = null;
        this.f13204z = null;
        this.f13168A = null;
        this.f13169B = null;
        this.f13185R.clear();
        this.f13190l.mo9708b();
    }

    /* renamed from: M */
    public void mo9607M() {
        this.f13175H = null;
    }

    /* renamed from: N */
    public void mo9608N() {
        this.f13185R.clear();
    }

    /* renamed from: O */
    public VoiceView mo9609O() {
        return mo9645f(true);
    }

    /* renamed from: f */
    public VoiceView mo9645f(boolean z) {
        if (this.f13176I == null && z) {
            this.f13176I = (VoiceView) this.f13189k.inflate(R.layout.voice_view, (ViewGroup) null);
        }
        return this.f13176I;
    }

    /* renamed from: P */
    public ClipboardView mo9610P() {
        return mo9647g(true);
    }

    /* renamed from: g */
    public ClipboardView mo9647g(boolean z) {
        if (this.f13177J == null && z) {
            this.f13177J = (ClipboardView) this.f13189k.inflate(R.layout.clipboard_view, (ViewGroup) null);
        }
        this.f13177J.mo8511e();
        return this.f13177J;
    }

    /* renamed from: Q */
    public void mo9611Q() {
        if (Build.VERSION.SDK_INT >= 8) {
            if (m13400an()) {
                m13394I();
                return;
            }
            this.f13183P = new C2906dj(this.f13188j);
            this.f13183P.mo9579b();
        } else if (this.f13188j != null) {
            C2849W.m13205a().mo9476a(C1974m.m9063a((Context) this.f13188j, (int) R.string.vi_not_supported));
        }
    }

    /* renamed from: R */
    public boolean mo9612R() {
        return this.f13183P != null && this.f13183P.isShowing();
    }

    /* renamed from: S */
    public boolean mo9613S() {
        return this.f13183P != null && this.f13183P.mo9578a();
    }

    /* renamed from: a */
    public void mo9625a(long j, int i, int i2) {
        if (this.f13183P != null) {
            this.f13183P.mo9577a(j, i, i2);
        }
    }

    /* renamed from: T */
    public boolean mo9614T() {
        return this.f13183P != null && this.f13183P.mo9581e();
    }

    /* renamed from: U */
    public View mo9615U() {
        if (this.f13178K == null) {
            this.f13178K = new C3280s();
            this.f13178K.mo10476a((Context) Engine.getInstance().getIms());
        }
        return this.f13178K.mo10480c();
    }

    /* renamed from: V */
    public void mo9616V() {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (this.f13194p != null) {
            View U = mo9615U();
            if (U.getParent() != null) {
                ((ViewGroup) U.getParent()).removeView(U);
            }
            ((ViewGroup) this.f13194p.getParent()).addView(U, layoutParams);
            this.f13178K.mo10479b();
        }
    }

    /* renamed from: W */
    public C1937f mo9617W() {
        if (this.f13179L == null) {
            this.f13179L = new C1937f(this.f13188j);
        }
        return this.f13179L;
    }

    /* renamed from: X */
    public C2061k mo9618X() {
        return mo9649h(true);
    }

    /* renamed from: h */
    public C2061k mo9649h(boolean z) {
        if (this.f13182O == null && z) {
            this.f13182O = new C2061k(this.f13188j);
        }
        return this.f13182O;
    }

    /* renamed from: Y */
    public void mo9619Y() {
        if (this.f13178K != null) {
            this.f13178K.mo10477a();
            this.f13178K = null;
        }
    }

    /* renamed from: Z */
    public void mo9620Z() {
        m13395a((View) this.f13201w);
        m13395a((View) this.f13200v);
        m13395a((View) this.f13203y);
        m13395a((View) this.f13204z);
        this.f13201w = null;
        this.f13200v = null;
        this.f13203y = null;
        this.f13204z = null;
    }

    /* renamed from: aa */
    public void mo9627aa() {
        m13395a((View) this.f13169B);
        this.f13169B = null;
    }

    /* renamed from: ab */
    public void mo9628ab() {
        m13395a((View) this.f13168A);
        this.f13168A = null;
    }

    /* renamed from: ac */
    public void mo9629ac() {
        if (this.f13200v != null) {
            this.f13200v.mo8527b();
        }
        if (this.f13201w != null) {
            this.f13201w.mo8527b();
        }
    }

    /* renamed from: ao */
    private void m13401ao() {
        if (this.f13199u != null) {
            m13395a(this.f13199u.getContrailView());
        }
        m13395a((View) this.f13199u);
        this.f13199u = null;
    }

    /* renamed from: a */
    private void m13395a(View view) {
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: a */
    public int mo9621a(Context context) {
        double a = C1439ao.m6712a(context);
        if (a <= 4.7d) {
            return 0;
        }
        if (4.7d >= a || a >= 5.5d) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo6012a() {
        mo9666w();
        this.f13185R.clear();
    }

    /* renamed from: ad */
    public C2826E mo9630ad() {
        if (this.f13180M == null) {
            this.f13180M = new C2826E(C1368X.m6313b());
        }
        return this.f13180M;
    }

    /* renamed from: ae */
    public void mo9631ae() {
        if (this.f13180M != null) {
            this.f13180M.mo9233a();
            this.f13180M.mo9268z();
            this.f13180M = null;
        }
    }

    /* renamed from: af */
    public C3007aV mo9632af() {
        if (this.f13181N == null) {
            this.f13181N = new C3007aV(C1368X.m6313b());
        }
        return this.f13181N;
    }

    /* renamed from: ag */
    public boolean mo9633ag() {
        if ((mo9650h() != null && mo9650h().mo8545h()) || mo9612R()) {
            return true;
        }
        if ((mo9649h(false) != null && mo9649h(false).mo7427c() != C2061k.f8825a) || C2564f.m11470c()) {
            return true;
        }
        if ((mo9632af() != null && mo9632af().mo10105g()) || mo9603H() || m13398al()) {
            return true;
        }
        if ((mo9617W() == null || !mo9617W().isShowing()) && !C2721bA.m12494a().mo8991b()) {
            return false;
        }
        return true;
    }

    /* renamed from: ah */
    public void mo9634ah() {
        if (mo9650h() != null && mo9650h().mo8545h()) {
            mo9650h().mo8542g();
        } else if (mo9612R()) {
            mo9625a(0, 0, 0);
        } else if (mo9649h(false) != null && mo9649h(false).mo7427c() != C2061k.f8825a) {
            mo9649h(false).mo7420a(true);
        } else if (C2564f.m11470c()) {
            C1368X.m6320c().mo5851x().mo8421a(true);
        } else if (mo9632af() != null && mo9632af().mo10105g()) {
            mo9632af().mo10103e();
        } else if (mo9617W() != null && mo9617W().isShowing()) {
            mo9617W().mo7136k();
        } else if (mo9603H()) {
            Engine.getInstance().fireKeyOperation(Engine.getInstance().getKeyId("sk_back_from_clipboard"), 0);
            Engine.getInstance().processEvent();
            Context b = C1368X.m6313b();
            if (b != null) {
                C1246d.m6010a(b).mo4591a(C1246d.f3752aV, C1246d.f3814be, C1246d.f3783b);
            }
        } else if (m13398al()) {
            m13399am();
        } else if (C2721bA.m12494a().mo8991b()) {
            C2721bA.m12494a().mo8992c();
        }
    }

    /* renamed from: i */
    public void mo9652i(boolean z) {
        this.f13187U = z;
    }

    /* renamed from: ai */
    public boolean mo9635ai() {
        return this.f13187U;
    }

    /* renamed from: aj */
    public void mo9636aj() {
        if (C1368X.m6324d()) {
            new C2730bI(C1368X.m6313b()).mo8931f();
        }
    }
}
