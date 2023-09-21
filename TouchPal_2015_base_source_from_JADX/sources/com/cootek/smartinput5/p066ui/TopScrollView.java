package com.cootek.smartinput5.p066ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.cootek.p042a.p043a.C0898b;
import com.cootek.p042a.p043a.C0904g;
import com.cootek.smartinput.utilities.C0985B;
import com.cootek.smartinput.utilities.C0989E;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.HighFreqSettings;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.SurfaceManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1602bh;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.yahoosearch.C2137q;
import com.cootek.smartinput5.p045a.C1060e;
import com.cootek.smartinput5.p048d.C1246d;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2829G;
import com.cootek.smartinput5.p066ui.control.C2833K;
import com.cootek.smartinput5.p066ui.control.C2856c;
import com.emoji.keyboard.touchpal.C3305b;
import com.emoji.keyboard.touchpal.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.cootek.smartinput5.ui.TopScrollView */
public abstract class TopScrollView extends View implements C2826E.C2827a {

    /* renamed from: Z */
    private static final int f11703Z = 40;

    /* renamed from: a */
    private static final int f11704a = 16;

    /* renamed from: aC */
    private static final int[] f11705aC = {16842919};

    /* renamed from: aT */
    private static int f11706aT = 0;

    /* renamed from: aV */
    private static int f11707aV = 0;

    /* renamed from: aW */
    private static int f11708aW = 0;

    /* renamed from: aX */
    private static int f11709aX = 0;

    /* renamed from: aa */
    private static int f11710aa = 8;

    /* renamed from: ab */
    private static final int f11711ab = (f11710aa * 2);

    /* renamed from: ac */
    private static final int f11712ac = 1;

    /* renamed from: ad */
    private static final int f11713ad = 2;

    /* renamed from: ae */
    private static final int f11714ae = 3;

    /* renamed from: af */
    private static final int f11715af = 10;

    /* renamed from: ag */
    private static final String f11716ag = "CandidateView";

    /* renamed from: b */
    private static final int f11717b = 36;

    /* renamed from: bk */
    private static final int f11718bk = 5;

    /* renamed from: bl */
    private static final int f11719bl = 300;

    /* renamed from: bn */
    private static final int f11720bn = 255;

    /* renamed from: bo */
    private static final int f11721bo = 125;

    /* renamed from: bp */
    private static final int f11722bp = 80;

    /* renamed from: c */
    private static final String f11723c = "..";

    /* renamed from: d */
    public static final int f11724d = 2;

    /* renamed from: e */
    protected static final int f11725e = 0;

    /* renamed from: f */
    protected static final int f11726f = 1;

    /* renamed from: g */
    protected static final int f11727g = 2;

    /* renamed from: h */
    protected static final int f11728h = 0;

    /* renamed from: i */
    protected static final int f11729i = 1;

    /* renamed from: j */
    protected static final int f11730j = 2;

    /* renamed from: m */
    protected static final int f11731m = 100;

    /* renamed from: n */
    protected static final int f11732n = 3;

    /* renamed from: x */
    private static final float f11733x = 0.36f;

    /* renamed from: y */
    private static final int f11734y = -1;

    /* renamed from: A */
    private String f11735A;

    /* renamed from: B */
    private int f11736B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f11737C;

    /* renamed from: D */
    private boolean f11738D;

    /* renamed from: E */
    private int f11739E;

    /* renamed from: F */
    private int f11740F;

    /* renamed from: G */
    private int f11741G = -1;

    /* renamed from: H */
    private Drawable f11742H = null;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public Drawable f11743I = null;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Drawable f11744J = null;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public Drawable f11745K = null;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Drawable f11746L = null;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public Drawable f11747M = null;

    /* renamed from: N */
    private Drawable f11748N = null;

    /* renamed from: O */
    private String f11749O;

    /* renamed from: P */
    private Drawable f11750P = null;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Drawable f11751Q = null;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public Drawable f11752R = null;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Drawable f11753S = null;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Drawable f11754T = null;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Drawable f11755U = null;

    /* renamed from: V */
    private Drawable f11756V = null;

    /* renamed from: W */
    private Drawable f11757W = null;

    /* renamed from: X */
    private Drawable f11758X = null;

    /* renamed from: Y */
    private Drawable f11759Y = null;
    /* access modifiers changed from: private */

    /* renamed from: aA */
    public final int[] f11760aA;
    /* access modifiers changed from: private */

    /* renamed from: aB */
    public final int[] f11761aB;
    /* access modifiers changed from: private */

    /* renamed from: aD */
    public int f11762aD;

    /* renamed from: aE */
    private final boolean f11763aE;

    /* renamed from: aF */
    private boolean f11764aF;

    /* renamed from: aG */
    private boolean f11765aG;

    /* renamed from: aH */
    private boolean f11766aH;

    /* renamed from: aI */
    private boolean f11767aI;
    /* access modifiers changed from: private */

    /* renamed from: aJ */
    public boolean f11768aJ;

    /* renamed from: aK */
    private boolean f11769aK;

    /* renamed from: aL */
    private boolean f11770aL;
    /* access modifiers changed from: private */

    /* renamed from: aM */
    public Handler f11771aM;
    /* access modifiers changed from: private */

    /* renamed from: aN */
    public C2641a f11772aN;

    /* renamed from: aO */
    private C2826E f11773aO;

    /* renamed from: aP */
    private C2646f[] f11774aP;

    /* renamed from: aQ */
    private C2919e f11775aQ;

    /* renamed from: aR */
    private final boolean f11776aR;
    /* access modifiers changed from: private */

    /* renamed from: aS */
    public final float f11777aS;
    /* access modifiers changed from: private */

    /* renamed from: aU */
    public int f11778aU;

    /* renamed from: aY */
    private final int f11779aY;

    /* renamed from: aZ */
    private boolean f11780aZ = false;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public final int f11781ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public final int f11782ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public final int f11783aj;

    /* renamed from: ak */
    private final C2856c f11784ak;

    /* renamed from: al */
    private final C2856c f11785al;

    /* renamed from: am */
    private int f11786am;

    /* renamed from: an */
    private int f11787an;

    /* renamed from: ao */
    private int f11788ao;

    /* renamed from: ap */
    private int f11789ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f11790aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public boolean f11791ar;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public boolean f11792as;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public boolean f11793at;

    /* renamed from: au */
    private final int f11794au = 6;

    /* renamed from: av */
    private final double f11795av = 2.3d;

    /* renamed from: aw */
    private int f11796aw;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public int f11797ax;

    /* renamed from: ay */
    private final GestureDetector f11798ay;

    /* renamed from: az */
    private final boolean[] f11799az;
    /* access modifiers changed from: private */

    /* renamed from: ba */
    public C2644d f11800ba = null;

    /* renamed from: bb */
    private C2644d f11801bb = null;

    /* renamed from: bc */
    private C2644d f11802bc = null;

    /* renamed from: bd */
    private Paint f11803bd;

    /* renamed from: be */
    private boolean f11804be = false;
    /* access modifiers changed from: private */

    /* renamed from: bf */
    public boolean f11805bf = false;

    /* renamed from: bg */
    private boolean f11806bg = false;
    /* access modifiers changed from: private */

    /* renamed from: bh */
    public Integer f11807bh = 0;
    /* access modifiers changed from: private */

    /* renamed from: bi */
    public C2645e f11808bi = new C2645e();

    /* renamed from: bj */
    private boolean f11809bj = true;

    /* renamed from: bm */
    private boolean f11810bm = true;

    /* renamed from: k */
    protected Drawable f11811k = null;

    /* renamed from: l */
    protected Drawable f11812l = null;

    /* renamed from: o */
    protected int f11813o;

    /* renamed from: p */
    protected int f11814p;

    /* renamed from: q */
    protected C2647g f11815q;

    /* renamed from: r */
    protected C2727bG f11816r;

    /* renamed from: s */
    protected boolean f11817s;

    /* renamed from: t */
    protected boolean f11818t;

    /* renamed from: u */
    protected int f11819u = 255;

    /* renamed from: v */
    protected int f11820v = 125;

    /* renamed from: w */
    protected float f11821w = 80.0f;

    /* renamed from: z */
    private Context f11822z;

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$d */
    protected interface C2644d {
        /* renamed from: a */
        float mo8838a(int i, int i2);

        /* renamed from: a */
        int mo8839a(int i);

        /* renamed from: a */
        void mo8840a(boolean z);

        /* renamed from: a */
        boolean mo8841a(int i, int i2, int i3);

        /* renamed from: a */
        boolean mo8842a(int i, int i2, int i3, int i4);

        /* renamed from: b */
        int mo8843b(int i, int i2);

        /* renamed from: b */
        int mo8844b(int i, int i2, int i3);

        /* renamed from: b */
        LinearGradient mo8845b(int i);

        /* renamed from: b */
        void mo8846b(boolean z);

        /* renamed from: b */
        boolean mo8847b(int i, int i2, int i3, int i4);

        /* renamed from: c */
        int mo8848c(int i, int i2);

        /* renamed from: c */
        boolean mo8849c(int i);

        /* renamed from: c */
        boolean mo8850c(int i, int i2, int i3, int i4);

        /* renamed from: d */
        void mo8851d(int i, int i2);

        /* renamed from: d */
        boolean mo8852d(int i);

        /* renamed from: d */
        boolean mo8853d(int i, int i2, int i3, int i4);

        /* renamed from: e */
        void mo8854e(int i, int i2);

        /* renamed from: f */
        boolean mo8855f(int i, int i2);

        /* renamed from: g */
        boolean mo8856g(int i, int i2);

        /* renamed from: h */
        void mo8857h(int i, int i2);
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$g */
    protected interface C2647g {
        /* renamed from: a */
        void mo8647a();

        /* renamed from: a */
        void mo8648a(int i);

        /* renamed from: b */
        void mo8649b();

        /* renamed from: b */
        void mo8650b(int i);

        /* renamed from: c */
        void mo8651c();

        /* renamed from: c */
        void mo8652c(int i);

        /* renamed from: d */
        void mo8653d();

        /* renamed from: d */
        void mo8654d(int i);

        /* renamed from: e */
        void mo8655e();

        /* renamed from: f */
        void mo8656f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C2727bG mo8477b(int i);

    /* renamed from: e */
    public static int m12056e(int i) {
        switch (i) {
            case 0:
                return 0;
            case 4:
                return 2;
            default:
                return 1;
        }
    }

    /* renamed from: f */
    public static int m12060f(int i) {
        switch (i) {
            case 0:
                return 0;
            case 2:
                return 4;
            default:
                return 2;
        }
    }

    /* renamed from: g */
    public static int m12064g(int i) {
        int e = m12056e(i);
        String[] f = C1368X.m6320c().mo5841n().mo6272f((int) R.array.candidate_size_scale);
        return Integer.valueOf(f[(f.length - e) - 1]).intValue();
    }

    public TopScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11822z = context;
        this.f11777aS = context.getResources().getDisplayMetrics().density;
        this.f11773aO = Engine.getInstance().getWidgetManager().mo9630ad();
        this.f11773aO.mo9238a((C2826E.C2827a) this);
        mo8475a();
        this.f11779aY = context.getResources().getInteger(R.integer.eng_candidate_max_words);
        f11709aX = (this.f11778aU - Engine.getInstance().getWidgetManager().mo9651i().mo9718d()) / (this.f11779aY + 1);
        this.f11799az = new boolean[100];
        this.f11760aA = new int[100];
        this.f11761aB = new int[100];
        this.f11771aM = new C2788cL(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3305b.C3322q.TopView);
        this.f11763aE = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f11818t = false;
        C1602bh n = C1368X.m6320c().mo5841n();
        this.f11781ah = n.mo6248a((int) R.color.candidate_normal, C2787cK.CANDIDATE_NORMAL);
        this.f11782ai = n.mo6248a((int) R.color.candidate_default, C2787cK.CANDIDATE_HIGHLIGHT);
        this.f11783aj = n.mo6248a((int) R.color.candidate_selected, C2787cK.CANDIDATE_SELECTED);
        this.f11784ak = new C2856c(false);
        this.f11784ak.setColor(this.f11781ah);
        this.f11784ak.setAntiAlias(true);
        C1602bh.C1605c m = n.mo6287m();
        if (m.f5164a) {
            this.f11784ak.setShadowLayer((float) m.f5166c, (float) m.f5167d, (float) m.f5168e, m.f5165b);
        }
        this.f11784ak.setStrokeWidth(0.0f);
        this.f11784ak.setTextAlign(Paint.Align.CENTER);
        this.f11784ak.setTypeface(C1624bv.m7418a());
        this.f11785al = new C2856c(false);
        this.f11785al.setColor(this.f11781ah);
        this.f11785al.setAntiAlias(true);
        this.f11785al.setStrokeWidth(0.0f);
        this.f11785al.setTextAlign(Paint.Align.CENTER);
        this.f11785al.setTypeface(C1624bv.m7418a());
        if (m.f5164a) {
            this.f11785al.setShadowLayer((float) m.f5166c, (float) m.f5167d, (float) m.f5168e, m.f5165b);
        }
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setBackgroundDrawable(n.mo6250a((int) R.drawable.candidate_bar, C2726bF.FUNCTION_BAR_BG));
        scrollTo(0, 0);
        mo8820h();
        this.f11772aN = new C2641a(this.f11796aw);
        this.f11798ay = new GestureDetector(this.f11772aN);
        this.f11776aR = n.mo6298t();
    }

    /* renamed from: c */
    public void mo8538c() {
        mo8475a();
        mo8820h();
    }

    /* renamed from: p_ */
    public void mo8556p_() {
    }

    /* renamed from: a */
    private void mo8475a() {
        Context b = C1368X.m6313b();
        f11706aT = this.f11773aO.mo9262t();
        this.f11778aU = (f11706aT - getEmojiBtnWidth()) - getLeftPaddingWidth();
        f11707aV = this.f11778aU / (b.getResources().getInteger(R.integer.eng_candidate_max_words) + 1);
        f11708aW = this.f11778aU / (b.getResources().getInteger(R.integer.chs_candidate_max_words) + 1);
        int i = 0;
        if (Engine.isInitialized()) {
            i = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        }
        f11709aX = (this.f11778aU - i) / (this.f11779aY + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable m12023a(Drawable drawable, C2726bF bFVar) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f, 0.5f, 0.5f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Bitmap) new WeakReference(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true)).get());
        bFVar.mo8999a().mo8995a(bitmapDrawable);
        return bitmapDrawable;
    }

    /* renamed from: h */
    public void mo8820h() {
        this.f11784ak.mo9502a();
        this.f11785al.mo9502a();
        Resources resources = getContext().getResources();
        C1602bh n = C1368X.m6320c().mo5841n();
        float g = (((float) m12064g(Settings.getInstance().getIntSetting(123))) / 10.0f) + 1.0f;
        float f = ((g - 1.0f) / 2.0f) + 1.0f;
        this.f11787an = (int) (((double) (((float) n.mo6265c((int) R.dimen.candidate_min_textsize)) * g)) * this.f11773aO.mo9251i());
        this.f11786am = (int) (((double) (g * ((float) n.mo6265c((int) R.dimen.candidate_textsize)))) * this.f11773aO.mo9251i());
        mo8478b();
        this.f11813o = (int) (((double) (((float) n.mo6265c((int) R.dimen.candidate_gap)) * f)) * this.f11773aO.mo9250h());
        this.f11796aw = (int) (((double) (((float) resources.getDimensionPixelSize(R.dimen.min_candidate_width)) * f)) * this.f11773aO.mo9250h());
    }

    /* renamed from: b */
    private void mo8478b() {
        float g = (((float) m12064g(Settings.getInstance().getIntSetting(123))) / 10.0f) + 1.0f;
        int c = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.candidate_Chs_textsize);
        this.f11789ap = (int) (((double) ((((g - 1.0f) / 2.0f) + 1.0f) * ((float) c))) * this.f11773aO.mo9251i());
        this.f11788ao = (int) (((double) (g * ((float) c))) * this.f11773aO.mo9251i());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (Engine.isInitialized()) {
            i3 = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        }
        setMeasuredDimension(f11706aT, i3);
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$a */
    private class C2641a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        private final int f11824b;

        /* renamed from: c */
        private final int f11825c;

        /* renamed from: d */
        private int f11826d;

        /* renamed from: e */
        private int f11827e = ((int) (750.0f * TopScrollView.this.f11777aS));

        public C2641a(int i) {
            this.f11824b = i;
            this.f11825c = i / 2;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (TopScrollView.this.f11737C >= 0 && !TopScrollView.this.f11768aJ && !TopScrollView.this.f11790aq && !TopScrollView.this.f11792as && !TopScrollView.this.f11793at) {
                boolean unused = TopScrollView.this.f11768aJ = true;
                TopScrollView.this.f11815q.mo8652c(TopScrollView.this.f11737C);
                TopScrollView.this.mo8827m();
                TopScrollView.this.invalidate();
            }
        }

        public boolean onDown(MotionEvent motionEvent) {
            boolean unused = TopScrollView.this.f11790aq = false;
            boolean unused2 = TopScrollView.this.f11791ar = false;
            this.f11826d = TopScrollView.this.getScrollX();
            boolean unused3 = TopScrollView.this.f11792as = false;
            boolean unused4 = TopScrollView.this.f11793at = false;
            return false;
        }

        /* renamed from: a */
        private boolean m12130a(MotionEvent motionEvent, MotionEvent motionEvent2) {
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            int i = this.f11824b;
            if (y > this.f11825c) {
                i *= 6;
            }
            if (abs < i) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        private boolean m12131b(MotionEvent motionEvent, MotionEvent motionEvent2) {
            int y = (int) (motionEvent2.getY() - motionEvent.getY());
            int abs = (int) Math.abs(motionEvent2.getX() - motionEvent.getX());
            int i = this.f11824b;
            if (abs > this.f11825c) {
                i *= 6;
            }
            if (y >= i && ((double) y) > 2.3d * ((double) TopScrollView.this.getHeight())) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private boolean m12132c(MotionEvent motionEvent, MotionEvent motionEvent2) {
            return ((double) (motionEvent2.getY() - motionEvent.getY())) > 0.5d * ((double) TopScrollView.this.getHeight());
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            int i3;
            boolean z3;
            boolean z4 = true;
            if (TopScrollView.this.mo8482m_() || Math.abs(f) < ((float) this.f11827e) || m12130a(motionEvent, motionEvent2)) {
                return false;
            }
            C2644d unused = TopScrollView.this.f11800ba = TopScrollView.this.getDisplayTypeHandler();
            TopScrollView.this.f11771aM.removeMessages(1);
            int i4 = this.f11826d;
            int height = TopScrollView.this.getHeight();
            int width = TopScrollView.this.getWidth() - height;
            boolean unused2 = TopScrollView.this.f11791ar = true;
            boolean unused3 = TopScrollView.this.f11790aq = true;
            if (SurfaceManager.isRightToLeftMode) {
                if (f < 0.0f) {
                    int i5 = i4 + width;
                    if (i5 > (-(width >> 1))) {
                        i = i5;
                        z = false;
                    } else {
                        i = i5;
                        z = true;
                    }
                } else {
                    i = i4 - width;
                    z = true;
                }
                if (Math.abs(i) > TopScrollView.this.f11797ax) {
                    boolean z5 = z;
                    i2 = (-TopScrollView.this.f11797ax) - height;
                    z2 = z5;
                }
                boolean z6 = z;
                i2 = i;
                z2 = z6;
            } else {
                if (f < 0.0f) {
                    i3 = i4 + width;
                    z3 = true;
                } else {
                    int i6 = i4 - width;
                    if (i6 < (-(width >> 1))) {
                        i3 = i6;
                        z3 = false;
                    } else {
                        i3 = i6;
                        z3 = true;
                    }
                }
                if (i + width > TopScrollView.this.f11797ax) {
                    boolean z7 = z;
                    i2 = TopScrollView.this.f11797ax - (width - height);
                    z2 = z7;
                }
                boolean z62 = z;
                i2 = i;
                z2 = z62;
            }
            if (z2) {
                int a = TopScrollView.this.m12020a(0, TopScrollView.this.f11762aD - 1, i2);
                if (f < 0.0f) {
                    a--;
                }
                if (a < 0) {
                    a = 0;
                }
                i2 = TopScrollView.this.f11800ba.mo8839a(a);
            }
            if (SurfaceManager.isRightToLeftMode) {
                if (i2 < (-width)) {
                    TopScrollView.this.f11814p = i2;
                    TopScrollView.this.m12079p();
                } else {
                    int i7 = -width;
                    TopScrollView.this.scrollTo(i7, 0);
                    TopScrollView.this.f11814p = i7;
                    z4 = false;
                }
            } else if (i2 >= 0) {
                TopScrollView.this.f11814p = i2;
                TopScrollView.this.m12079p();
            } else {
                int i8 = -height;
                TopScrollView.this.scrollTo(i8, 0);
                TopScrollView.this.f11814p = i8;
                z4 = false;
            }
            TopScrollView.this.f11815q.mo8653d();
            TopScrollView.this.mo8827m();
            TopScrollView.this.invalidate();
            return z4;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (m12132c(motionEvent, motionEvent2)) {
                boolean unused = TopScrollView.this.f11793at = true;
            }
            if (TopScrollView.this.f11792as) {
                return false;
            }
            if (!TopScrollView.this.f11790aq && m12131b(motionEvent, motionEvent2)) {
                boolean unused2 = TopScrollView.this.f11792as = true;
                return false;
            } else if (!TopScrollView.this.mo8482m_()) {
                if (!TopScrollView.this.f11790aq) {
                    if (m12130a(motionEvent, motionEvent2)) {
                        return false;
                    }
                    f -= (float) (((int) (motionEvent2.getX() - motionEvent.getX())) >> 1);
                }
                TopScrollView.this.f11771aM.removeMessages(1);
                int width = TopScrollView.this.getWidth();
                boolean unused3 = TopScrollView.this.f11790aq = true;
                int scrollX = TopScrollView.this.getScrollX() + ((int) f);
                if (SurfaceManager.isRightToLeftMode) {
                    int height = TopScrollView.this.getHeight();
                    if (scrollX > (-TopScrollView.this.getWidth()) + height) {
                        scrollX = (-TopScrollView.this.getWidth()) + height;
                    }
                } else {
                    int height2 = TopScrollView.this.getHeight();
                    if (scrollX < (-height2)) {
                        scrollX = -height2;
                    }
                }
                if (f > 0.0f && width + scrollX > TopScrollView.this.f11797ax) {
                    scrollX -= (int) f;
                } else if (f < 0.0f && Math.abs(scrollX) > TopScrollView.this.f11797ax) {
                    scrollX -= (int) f;
                }
                TopScrollView.this.f11814p = scrollX;
                TopScrollView.this.scrollTo(scrollX, 0);
                TopScrollView.this.mo8827m();
                TopScrollView.this.invalidate();
                return true;
            } else if (!Settings.getInstance().getBoolSetting(Settings.SHOW_FORBID_SIMPLE_CANDIDATE_STYLE_DIALOG) || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= ((float) (TopScrollView.this.f11778aU / 3))) {
                return false;
            } else {
                if (!TopScrollView.this.f11790aq && !TopScrollView.this.f11768aJ) {
                    boolean unused4 = TopScrollView.this.f11790aq = true;
                    TopScrollView.this.m12086s();
                }
                return true;
            }
        }
    }

    public int computeHorizontalScrollRange() {
        return this.f11797ax;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo8476a(boolean z, C2727bG bGVar) {
        if (mo8482m_() || z || !(bGVar instanceof CandidateItem)) {
            return false;
        }
        CandidateItem candidateItem = (CandidateItem) bGVar;
        if (candidateItem.isDialect || candidateItem.getSource() == 6) {
            return true;
        }
        if (candidateItem.getSource() != 7 || !m12083r()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8494f() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8807a(C2645e eVar) {
        int i;
        if (eVar.f11840e != null) {
            mo8494f();
        }
        if (mo8482m_()) {
            i = 3;
        } else {
            i = 20;
        }
        ArrayList<C2727bG> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < i; i2++) {
            C2727bG b = mo8477b(i2);
            if (b == null) {
                break;
            }
            if (b instanceof CandidateItem) {
                ((CandidateItem) b).getSource();
            }
            arrayList.add(b);
        }
        eVar.f11844i = arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8812b(C2645e eVar) {
        int i;
        WeakReference<Bitmap> weakReference;
        int i2 = f11706aT;
        if (Engine.isInitialized()) {
            i = Engine.getInstance().getWidgetManager().mo9651i().mo9718d();
        } else {
            i = 0;
        }
        WeakReference<Bitmap> weakReference2 = eVar.f11841f;
        Bitmap bitmap = null;
        if (weakReference2 != null) {
            bitmap = (Bitmap) weakReference2.get();
        }
        if ((weakReference2 == null || bitmap == null || bitmap.getWidth() < i2 || bitmap.getHeight() < i) && i2 > 0 && i > 0) {
            if (bitmap != null) {
                System.gc();
            }
            bitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            weakReference = new WeakReference<>(bitmap);
        } else {
            weakReference = weakReference2;
        }
        if (!(weakReference == null || bitmap == null)) {
            eVar.f11841f = weakReference;
            if (eVar.f11840e == null) {
                eVar.f11840e = new Canvas(bitmap);
            } else {
                eVar.f11840e.setBitmap(bitmap);
            }
        }
        if (this.f11803bd == null) {
            this.f11803bd = new Paint();
        }
        eVar.f11842g = getScrollX();
        eVar.f11843h = this.f11814p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8821i() {
        this.f11771aM.removeMessages(2);
        if (this.f11808bi.mo4031b()) {
            this.f11808bi.mo4032c();
        }
        if (this.f11804be && this.f11808bi.f11840e != null) {
            this.f11808bi.f11840e.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        this.f11807bh = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo8824j() {
        C0989E.m5117a().mo4046a((C0985B) this.f11808bi);
    }

    public void invalidate() {
        this.f11804be = C0989E.m5117a().mo4047a(1);
        this.f11805bf = true;
        if (!this.f11804be || this.f11814p != 0) {
            mo8821i();
            this.f11806bg = false;
            super.invalidate();
            return;
        }
        this.f11806bg = true;
        this.f11771aM.removeMessages(2);
        this.f11771aM.sendEmptyMessage(2);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        this.f11809bj = true;
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8813c(C2645e eVar) {
        C0904g.m4916a().mo3404a(C0898b.CANDBAR_BUF_DRAW);
        mo8816e(eVar);
        C1060e.m5598b().mo4271a(C1060e.C1062b.cand_buff_draw);
        C0904g.m4916a().mo3409b(C0898b.CANDBAR_BUF_DRAW);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo8815d(C2645e eVar) {
        mo8816e(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public synchronized void mo8816e(C2645e eVar) {
        if (!this.f11805bf) {
        }
        this.f11805bf = false;
        if (this.f11804be) {
            mo8812b(eVar);
        }
        Canvas canvas = eVar.f11840e;
        if (this.f11804be && canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        this.f11762aD = 0;
        mo8475a();
        if (mo8482m_()) {
            m12035a(canvas, eVar);
        } else {
            m12045b(canvas, eVar);
        }
        if (mo8480e() && mo8482m_()) {
            m12050c(canvas);
        }
        if (mo8495g() && mo8482m_()) {
            m12054d(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (canvas != null) {
            C0904g.m4916a().mo3404a(C0898b.CANDBAR_DRAW);
            if (canvas != null) {
                if (mo8494f()) {
                    super.onDraw(canvas);
                } else {
                    return;
                }
            }
            if (!this.f11806bg || !this.f11804be) {
                mo8475a();
                if (mo8482m_()) {
                    m12034a(canvas);
                } else {
                    m12044b(canvas);
                }
                if (mo8480e() && mo8482m_()) {
                    m12050c(canvas);
                }
                if (mo8495g() && mo8482m_()) {
                    m12054d(canvas);
                }
            }
            if (this.f11806bg && this.f11804be && canvas != null && this.f11808bi != null) {
                synchronized (this.f11808bi) {
                    if (this.f11809bj) {
                        this.f11771aM.removeMessages(2);
                        this.f11808bi.mo4035f();
                        mo8813c(this.f11808bi);
                        this.f11809bj = false;
                    }
                    WeakReference<Bitmap> weakReference = this.f11808bi.f11841f;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        canvas.drawBitmap((Bitmap) weakReference.get(), 0.0f, 0.0f, this.f11803bd);
                    }
                    this.f11808bi.mo4029a(false);
                    synchronized (this.f11807bh) {
                        this.f11807bh = 0;
                    }
                }
            }
            C1060e.m5598b().mo4271a(C1060e.C1062b.cand_draw);
            C0904g.m4916a().mo3409b(C0898b.CANDBAR_DRAW);
        }
    }

    /* renamed from: a */
    private void m12034a(Canvas canvas) {
        m12035a(canvas, (C2645e) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12035a(android.graphics.Canvas r18, com.cootek.smartinput5.p066ui.TopScrollView.C2645e r19) {
        /*
            r17 = this;
            if (r18 != 0) goto L_0x0003
        L_0x0002:
            return
        L_0x0003:
            if (r19 != 0) goto L_0x002c
            r2 = 0
        L_0x0006:
            r5 = 0
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            if (r3 != 0) goto L_0x0031
            r3 = 3
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = new com.cootek.smartinput5.p066ui.TopScrollView.C2646f[r3]
            r0 = r17
            r0.f11774aP = r3
            r3 = 0
        L_0x0015:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0045
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            com.cootek.smartinput5.ui.TopScrollView$f r6 = new com.cootek.smartinput5.ui.TopScrollView$f
            r0 = r17
            r6.<init>()
            r4[r3] = r6
            int r3 = r3 + 1
            goto L_0x0015
        L_0x002c:
            r0 = r19
            java.util.ArrayList<com.cootek.smartinput5.ui.bG> r2 = r0.f11844i
            goto L_0x0006
        L_0x0031:
            r3 = 0
        L_0x0032:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            int r4 = r4.length
            if (r3 >= r4) goto L_0x0045
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r3]
            r4.mo8867g()
            int r3 = r3 + 1
            goto L_0x0032
        L_0x0045:
            r3 = -1
            r4 = 0
            r10 = r5
        L_0x0048:
            r5 = 3
            if (r4 >= r5) goto L_0x0053
            r0 = r17
            com.cootek.smartinput5.ui.bG r6 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r2, (int) r4)
            if (r6 != 0) goto L_0x00ff
        L_0x0053:
            if (r10 == 0) goto L_0x0002
            r0 = r17
            com.cootek.smartinput5.ui.control.c r4 = r0.f11784ak
            r0 = r17
            int r5 = r0.f11819u
            r4.setAlpha(r5)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r11 = r0.f11784ak
            r4 = 0
            r11.setShader(r4)
            r0 = r17
            int r4 = r0.f11778aU
            com.cootek.smartinput5.engine.Engine r5 = com.cootek.smartinput5.engine.Engine.getInstance()
            com.cootek.smartinput5.ui.du r5 = r5.getWidgetManager()
            com.cootek.smartinput5.ui.m r5 = r5.mo9651i()
            int r12 = r5.mo9718d()
            r0 = r17
            int r9 = r0.f11741G
            int r13 = r17.getHeight()
            com.cootek.smartinput5.ui.TopScrollView$d r5 = r17.getDisplayTypeHandler()
            r0 = r17
            r0.f11800ba = r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r5 = r0.f11800ba
            r6 = 0
            r0 = r17
            int r7 = r0.f11778aU
            int r14 = r5.mo8844b(r6, r7, r13)
            r5 = 0
            r6 = 0
            r0 = r17
            com.cootek.smartinput5.ui.bG r6 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r2, (int) r6)
            r0 = r17
            boolean r5 = r0.mo8476a((boolean) r5, (com.cootek.smartinput5.p066ui.C2727bG) r6)
            r0 = r17
            r0.f11770aL = r5
            r0 = r17
            boolean r5 = r0.f11770aL
            if (r5 == 0) goto L_0x00c1
            int r4 = r4 - r13
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r5 = r0.f11800ba
            boolean r5 = r5 instanceof com.cootek.smartinput5.p066ui.TopScrollView.C2643c
            if (r5 == 0) goto L_0x00c1
            float r5 = (float) r13
            r6 = 0
            r0 = r18
            r0.translate(r5, r6)
        L_0x00c1:
            r6 = r4
            r4 = -1
            if (r3 != r4) goto L_0x010d
            r3 = 0
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r0 = r17
            int r5 = r0.f11781ah
            r4.f11854i = r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r5 = 0
            r4.f11848c = r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r5 = 0
            r4.f11849d = r5
        L_0x00e7:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r0 = r17
            com.cootek.smartinput5.ui.bG r5 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r2, (int) r3)
            r4.mo8859a((com.cootek.smartinput5.p066ui.C2727bG) r5, (int) r3)
            r5 = 0
        L_0x00f8:
            if (r5 >= r10) goto L_0x017d
            if (r5 != r3) goto L_0x0138
        L_0x00fc:
            int r5 = r5 + 1
            goto L_0x00f8
        L_0x00ff:
            int r5 = r4 + 1
            int r6 = r6.getTag()
            if (r6 == 0) goto L_0x0108
            r3 = r4
        L_0x0108:
            int r4 = r4 + 1
            r10 = r5
            goto L_0x0048
        L_0x010d:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r0 = r17
            int r5 = r0.f11782ai
            r4.f11854i = r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r5 = 1
            r4.f11848c = r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r5 = 0
            r4 = r4[r5]
            r5 = 1
            r4.f11849d = r5
            r4 = 0
            r0 = r17
            r0.f11739E = r4
            r0 = r17
            r0.f11740F = r3
            goto L_0x00e7
        L_0x0138:
            r0 = r17
            com.cootek.smartinput5.ui.bG r7 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r2, (int) r5)
            r4 = 0
            int r4 = java.lang.Math.min(r4, r3)
            if (r5 < r4) goto L_0x017b
            r4 = 0
            int r4 = java.lang.Math.max(r4, r3)
            if (r5 > r4) goto L_0x017b
            int r4 = r3 + 0
            int r4 = java.lang.Integer.signum(r4)
            int r4 = r4 + r5
        L_0x0153:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r8 = r0.f11774aP
            r8 = r8[r4]
            r8.mo8859a((com.cootek.smartinput5.p066ui.C2727bG) r7, (int) r5)
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r7 = r0.f11774aP
            r7 = r7[r4]
            r8 = 0
            r7.f11848c = r8
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r7 = r0.f11774aP
            r7 = r7[r4]
            r8 = 0
            r7.f11849d = r8
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r7 = r0.f11774aP
            r4 = r7[r4]
            r0 = r17
            int r7 = r0.f11781ah
            r4.f11854i = r7
            goto L_0x00fc
        L_0x017b:
            r4 = r5
            goto L_0x0153
        L_0x017d:
            r2 = 3
            r3 = 1
            if (r10 != r3) goto L_0x02ca
            r2 = 1
            r8 = r2
        L_0x0183:
            r2 = 3
            if (r8 != r2) goto L_0x02d7
            r4 = 1
        L_0x0187:
            if (r4 == 0) goto L_0x02da
            float r2 = (float) r6
            r3 = 1052266988(0x3eb851ec, float:0.36)
            float r2 = r2 * r3
            int r2 = (int) r2
            r7 = r2
        L_0x0190:
            r2 = 1
            if (r8 <= r2) goto L_0x02df
            int r2 = r6 - r7
            int r3 = r8 + -1
            int r2 = r2 / r3
            r3 = r2
        L_0x0199:
            int r15 = r17.getLeftPaddingWidth()
            int r5 = r7 / 2
            if (r4 == 0) goto L_0x02e3
            r2 = r3
        L_0x01a2:
            int r2 = r2 + r5
            int r16 = r2 + r15
            int r2 = r3 / 2
            int r5 = r2 + r15
            int r2 = r3 / 2
            int r2 = r6 - r2
            int r6 = r2 + r15
            if (r4 == 0) goto L_0x0517
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r15 = 1
            r2 = r2[r15]
            com.cootek.smartinput5.ui.bG r2 = r2.f11846a
            if (r2 == 0) goto L_0x0517
            boolean r15 = r2 instanceof com.cootek.smartinput5.engine.CandidateItem
            if (r15 == 0) goto L_0x0517
            com.cootek.smartinput5.engine.CandidateItem r2 = (com.cootek.smartinput5.engine.CandidateItem) r2
            int r2 = r2.getSource()
            r4 = 9
            if (r2 == r4) goto L_0x02e6
            r2 = 1
        L_0x01cb:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r15 = 0
            r4 = r4[r15]
            r4.f11856k = r7
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 0
            r4 = r4[r7]
            r0 = r16
            r4.f11857l = r0
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 0
            r4 = r4[r7]
            r7 = 0
            r4.f11852g = r7
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 0
            r7 = r4[r7]
            r4 = 1
            if (r8 > r4) goto L_0x02e9
            r4 = 1
        L_0x01f4:
            r7.f11858m = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 1
            r4 = r4[r7]
            r4.f11856k = r3
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 1
            r7 = r4[r7]
            if (r2 == 0) goto L_0x02ec
            r4 = r5
        L_0x0209:
            r7.f11857l = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 1
            r7 = r4[r7]
            if (r2 == 0) goto L_0x02ef
            r4 = 1
        L_0x0215:
            r7.f11852g = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 1
            r7 = r4[r7]
            r4 = 1
            if (r8 > r4) goto L_0x02f2
            r4 = 1
        L_0x0222:
            r7.f11858m = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r7 = 2
            r4 = r4[r7]
            r4.f11856k = r3
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r4 = 2
            r3 = r3[r4]
            if (r2 == 0) goto L_0x02f5
        L_0x0236:
            r3.f11857l = r6
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r4 = 2
            r3 = r3[r4]
            if (r2 == 0) goto L_0x02f8
            r2 = 2
        L_0x0242:
            r3.f11852g = r2
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r3 = 2
            r3 = r2[r3]
            r2 = 1
            if (r8 > r2) goto L_0x02fb
            r2 = 1
        L_0x024f:
            r3.f11858m = r2
            r2 = -1
            if (r9 == r2) goto L_0x027e
            r2 = -1
            r0 = r17
            r0.f11736B = r2
            r2 = -1
            r0 = r17
            r0.f11737C = r2
            r2 = 0
            r0 = r17
            r0.f11735A = r2
            r2 = 0
            r0 = r17
            r0.f11765aG = r2
            r0 = r17
            boolean r2 = r0.f11770aL
            if (r2 == 0) goto L_0x02fe
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r2 = r0.f11800ba
            r3 = 0
            boolean r2 = r2.mo8841a(r9, r3, r14)
            if (r2 == 0) goto L_0x02fe
            r2 = 1
            r0 = r17
            r0.f11765aG = r2
        L_0x027e:
            r2 = 0
        L_0x027f:
            if (r2 >= r10) goto L_0x038d
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            r0 = r17
            int r4 = r0.f11786am
            r3.f11853h = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            r0 = r17
            int r4 = r0.f11787an
            boolean r3 = r3.mo8860a((com.cootek.smartinput5.p066ui.control.C2856c) r11, (int) r4)
            if (r3 == 0) goto L_0x02a0
            r11.mo9502a()
        L_0x02a0:
            r0 = r17
            int[] r3 = r0.f11761aB
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r2]
            int r4 = r4.f11857l
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r5 = r0.f11774aP
            r5 = r5[r2]
            int r5 = r5.f11856k
            int r5 = r5 / 2
            int r4 = r4 - r5
            r3[r2] = r4
            r0 = r17
            int[] r3 = r0.f11760aA
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r2]
            int r4 = r4.f11856k
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x027f
        L_0x02ca:
            r3 = 2
            if (r10 != r3) goto L_0x051a
            boolean r3 = r17.mo8483n_()
            if (r3 == 0) goto L_0x051a
            r2 = 2
            r8 = r2
            goto L_0x0183
        L_0x02d7:
            r4 = 0
            goto L_0x0187
        L_0x02da:
            int r2 = r6 / r8
            r7 = r2
            goto L_0x0190
        L_0x02df:
            r2 = 0
            r3 = r2
            goto L_0x0199
        L_0x02e3:
            r2 = 0
            goto L_0x01a2
        L_0x02e6:
            r2 = 0
            goto L_0x01cb
        L_0x02e9:
            r4 = 0
            goto L_0x01f4
        L_0x02ec:
            r4 = r6
            goto L_0x0209
        L_0x02ef:
            r4 = 2
            goto L_0x0215
        L_0x02f2:
            r4 = 0
            goto L_0x0222
        L_0x02f5:
            r6 = r5
            goto L_0x0236
        L_0x02f8:
            r2 = 1
            goto L_0x0242
        L_0x02fb:
            r2 = 0
            goto L_0x024f
        L_0x02fe:
            boolean r2 = r17.mo8480e()
            if (r2 == 0) goto L_0x0315
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r2 = r0.f11800ba
            boolean r2 = r2.mo8849c(r9)
            if (r2 == 0) goto L_0x0315
            r2 = 1
            r0 = r17
            r0.f11766aH = r2
            goto L_0x027e
        L_0x0315:
            boolean r2 = r17.mo8495g()
            if (r2 == 0) goto L_0x032c
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r2 = r0.f11800ba
            boolean r2 = r2.mo8852d(r9)
            if (r2 == 0) goto L_0x032c
            r2 = 1
            r0 = r17
            r0.f11767aI = r2
            goto L_0x027e
        L_0x032c:
            r2 = 0
        L_0x032d:
            if (r2 >= r10) goto L_0x027e
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            int r3 = r3.f11857l
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r2]
            int r4 = r4.f11856k
            int r4 = r4 / 2
            int r3 = r3 - r4
            if (r9 < r3) goto L_0x038a
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            int r3 = r3.f11857l
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r2]
            int r4 = r4.f11856k
            int r4 = r4 / 2
            int r3 = r3 + r4
            if (r9 > r3) goto L_0x038a
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            java.lang.String r3 = r3.f11847b
            r0 = r17
            r0.f11735A = r3
            r0 = r17
            r0.f11736B = r2
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            int r3 = r3.f11851f
            r0 = r17
            r0.f11737C = r3
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            r0 = r17
            int r4 = r0.f11783aj
            r3.f11854i = r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r2]
            r4 = 1
            r3.f11850e = r4
        L_0x038a:
            int r2 = r2 + 1
            goto L_0x032d
        L_0x038d:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r0 = r17
            r1 = r18
            r0.mo8474a((android.graphics.Canvas) r1, (com.cootek.smartinput5.p066ui.TopScrollView.C2646f[]) r2, (int) r10, (int) r12)
            r2 = 0
            r9 = r2
        L_0x039a:
            if (r9 >= r10) goto L_0x04d6
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            com.cootek.smartinput5.ui.control.c r7 = r2.m12200b((com.cootek.smartinput5.p066ui.control.C2856c) r11)
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            boolean r2 = r2.f11862q
            if (r2 == 0) goto L_0x04af
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            float r2 = r2.f11863r
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x04af
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            float r2 = r2.f11863r
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            r0.scale(r2, r3)
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.f11857l
            float r2 = (float) r2
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            float r3 = r3.f11863r
            float r5 = r2 / r3
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            java.lang.String r4 = r2.mo8866f()
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.mo8862b(r7, r12)
            float r6 = (float) r2
            r2 = r17
            r3 = r18
            r2.mo8805a((android.graphics.Canvas) r3, (java.lang.String) r4, (float) r5, (float) r6, (android.graphics.Paint) r7)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            float r3 = r3.f11863r
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            r0.scale(r2, r3)
        L_0x0417:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            com.cootek.smartinput5.ui.bG r2 = r2.f11846a
            if (r2 == 0) goto L_0x04aa
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            com.cootek.smartinput5.ui.bG r2 = r2.f11846a
            boolean r2 = r2.hasAdditionalIcon()
            if (r2 == 0) goto L_0x04aa
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.f11855j
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            boolean r3 = r3.f11862q
            if (r3 == 0) goto L_0x0467
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            float r3 = r3.f11863r
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0467
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.f11855j
            float r2 = (float) r2
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            float r3 = r3.f11863r
            float r2 = r2 * r3
            int r2 = (int) r2
        L_0x0467:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            int r3 = r3.f11856k
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r4 = r0.f11774aP
            r4 = r4[r9]
            int r4 = r4.f11856k
            int r4 = r4 - r2
            int r4 = r4 / 2
            int r8 = r3 - r4
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            com.cootek.smartinput5.ui.bG r4 = r3.f11846a
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            int r3 = r3.f11857l
            int r5 = r2 / 2
            int r5 = r3 - r5
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r3 = r0.f11774aP
            r3 = r3[r9]
            int r3 = r3.f11856k
            r0 = r17
            int r3 = r0.mo8819h((int) r3)
            int r3 = r3 * 2
            int r6 = r2 + r3
            r2 = r17
            r3 = r18
            r7 = r12
            r2.m12036a(r3, r4, r5, r6, r7, r8)
        L_0x04aa:
            int r2 = r9 + 1
            r9 = r2
            goto L_0x039a
        L_0x04af:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.f11857l
            float r5 = (float) r2
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            java.lang.String r4 = r2.mo8866f()
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$f[] r2 = r0.f11774aP
            r2 = r2[r9]
            int r2 = r2.mo8862b(r7, r12)
            float r6 = (float) r2
            r2 = r17
            r3 = r18
            r2.mo8805a((android.graphics.Canvas) r3, (java.lang.String) r4, (float) r5, (float) r6, (android.graphics.Paint) r7)
            goto L_0x0417
        L_0x04d6:
            r0 = r17
            boolean r2 = r0.f11770aL
            if (r2 == 0) goto L_0x0002
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r2 = r0.f11800ba
            boolean r2 = r2 instanceof com.cootek.smartinput5.p066ui.TopScrollView.C2643c
            if (r2 == 0) goto L_0x04ec
            int r2 = -r13
            float r2 = (float) r2
            r3 = 0
            r0 = r18
            r0.translate(r2, r3)
        L_0x04ec:
            r0 = r17
            com.cootek.smartinput5.ui.TopScrollView$d r2 = r0.f11800ba
            r0 = r17
            boolean r3 = r0.f11765aG
            r2.mo8846b((boolean) r3)
            r0 = r17
            android.graphics.drawable.Drawable r2 = r0.f11751Q
            r3 = 0
            int r4 = r14 + r13
            r2.setBounds(r14, r3, r4, r13)
            r0 = r17
            android.graphics.drawable.Drawable r2 = r0.f11751Q
            r0 = r17
            int r3 = r0.f11819u
            r2.setAlpha(r3)
            r0 = r17
            android.graphics.drawable.Drawable r2 = r0.f11751Q
            r0 = r18
            r2.draw(r0)
            goto L_0x0002
        L_0x0517:
            r2 = r4
            goto L_0x01cb
        L_0x051a:
            r8 = r2
            goto L_0x0183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.TopScrollView.m12035a(android.graphics.Canvas, com.cootek.smartinput5.ui.TopScrollView$e):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8805a(Canvas canvas, String str, float f, float f2, Paint paint) {
        mo8810b(canvas, str, f, f2, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8806a(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        mo8811b(canvas, str, i, i2, f, f2, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8810b(Canvas canvas, String str, float f, float f2, Paint paint) {
        canvas.drawText(str, f, f2, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8811b(Canvas canvas, String str, int i, int i2, float f, float f2, Paint paint) {
        canvas.drawText(str, i, i2, f, f2, paint);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8474a(Canvas canvas, C2646f[] fVarArr, int i, int i2) {
        boolean z;
        if (canvas != null && fVarArr != null && fVarArr.length >= i) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = fVarArr.length;
            }
            for (int i3 = 0; i3 < i; i3++) {
                Drawable a = mo8804a(fVarArr[i3]);
                if (a != null) {
                    if (fVarArr[i3].f11850e) {
                        a.setState(f11705aC);
                    } else {
                        a.setState((int[]) null);
                    }
                    int i4 = this.f11774aP[i3].f11857l - (this.f11774aP[i3].f11856k / 2);
                    if (z) {
                        i4 = 0;
                    }
                    canvas.translate((float) i4, 0.0f);
                    int i5 = fVarArr[i3].f11856k;
                    if (z) {
                        i5 = f11706aT;
                    }
                    a.setBounds(0, 0, i5, i2);
                    a.setAlpha(this.f11819u);
                    a.draw(canvas);
                    canvas.translate((float) (-i4), 0.0f);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo8804a(C2646f fVar) {
        C2726bF bFVar = C2726bF.CANDIDATE_ITEM_BG;
        switch (fVar.f11852g) {
            case 0:
                if (fVar.f11849d) {
                    if (this.f11756V == null) {
                        this.f11756V = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_candidate_item_middle_ctrl, bFVar);
                    }
                    return this.f11756V;
                }
                if (this.f11757W == null) {
                    this.f11757W = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_candidate_item_middle_undefault_ctrl, bFVar);
                }
                return this.f11757W;
            case 1:
                if (this.f11758X == null) {
                    this.f11758X = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_candidate_item_left_ctrl, bFVar);
                }
                return this.f11758X;
            case 2:
                if (this.f11759Y == null) {
                    this.f11759Y = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.bg_candidate_item_right_ctrl, bFVar);
                }
                return this.f11759Y;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private C2727bG m12029a(ArrayList<C2727bG> arrayList, int i) {
        if (arrayList == null) {
            return mo8477b(i);
        }
        if (i < 0 || i >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i);
    }

    /* renamed from: b */
    private void m12044b(Canvas canvas) {
        m12045b(canvas, (C2645e) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03fc, code lost:
        if (java.lang.Math.abs(r29.f11800ba.mo8848c(r21, r7)) < r25) goto L_0x0630;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12045b(android.graphics.Canvas r30, com.cootek.smartinput5.p066ui.TopScrollView.C2645e r31) {
        /*
            r29 = this;
            if (r31 != 0) goto L_0x011e
            r3 = 0
            r17 = r3
        L_0x0005:
            r3 = 0
            r0 = r29
            r0.f11774aP = r3
            int r8 = r29.getHeight()
            if (r8 != 0) goto L_0x0020
            com.cootek.smartinput5.engine.Engine r3 = com.cootek.smartinput5.engine.Engine.getInstance()
            com.cootek.smartinput5.ui.du r3 = r3.getWidgetManager()
            com.cootek.smartinput5.ui.m r3 = r3.mo9651i()
            int r8 = r3.mo9718d()
        L_0x0020:
            r0 = r29
            com.cootek.smartinput5.ui.control.c r13 = r0.f11784ak
            r0 = r29
            int r0 = r0.f11741G
            r23 = r0
            int r24 = r29.getScrollX()
            r0 = r29
            int r0 = r0.f11778aU
            r25 = r0
            r0 = r29
            boolean r0 = r0.f11790aq
            r26 = r0
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r29.getDisplayTypeHandler()
            r0 = r29
            r0.f11800ba = r3
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r24
            r1 = r25
            int r27 = r3.mo8844b(r0, r1, r8)
            r7 = 0
            r6 = 0
            r5 = 0
            r0 = r29
            boolean r3 = r0.f11763aE
            if (r3 == 0) goto L_0x0126
            boolean r3 = r29.mo8482m_()
            if (r3 != 0) goto L_0x0126
            r3 = 1
            r18 = r3
        L_0x0060:
            r10 = 0
            r4 = 0
            java.lang.String r3 = ""
            r0 = r29
            r1 = r17
            com.cootek.smartinput5.ui.bG r9 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r1, (int) r10)
            if (r9 == 0) goto L_0x0690
            java.lang.String r3 = r9.getDisplayString()
            int r4 = r3.length()
            r11 = r3
            r12 = r4
        L_0x0078:
            r3 = 10
            if (r12 <= r3) goto L_0x012b
            r3 = 1
        L_0x007d:
            r0 = r29
            int r4 = r0.f11786am
            if (r3 == 0) goto L_0x068c
            if (r12 <= 0) goto L_0x0131
            r3 = 0
            char r3 = r11.charAt(r3)
            boolean r3 = com.cootek.smartinput5.p066ui.control.C2829G.m12929a(r3)
            if (r3 != 0) goto L_0x009c
            int r3 = r12 + -1
            char r3 = r11.charAt(r3)
            boolean r3 = com.cootek.smartinput5.p066ui.control.C2829G.m12929a(r3)
            if (r3 == 0) goto L_0x012e
        L_0x009c:
            r3 = 1
        L_0x009d:
            if (r3 != 0) goto L_0x068c
            r3 = 0
            r11 = r9
            r12 = r10
        L_0x00a2:
            r4 = 3
            if (r12 >= r4) goto L_0x00ae
            if (r11 == 0) goto L_0x00ae
            int r4 = r11.getTag()
            if (r4 == 0) goto L_0x0134
            r3 = 1
        L_0x00ae:
            r0 = r29
            int r14 = r0.f11778aU
            r0 = r29
            int r4 = r0.f11786am
        L_0x00b6:
            if (r3 == 0) goto L_0x068c
            r0 = r29
            int r9 = r0.f11787an
            if (r4 <= r9) goto L_0x068c
            if (r11 == 0) goto L_0x068c
            float r9 = (float) r4
            r13.setTextSize(r9)
            android.graphics.Typeface r9 = com.cootek.smartinput5.func.C1624bv.m7418a()
            r13.setTypeface(r9)
            r10 = 0
            r9 = 0
        L_0x00cd:
            if (r9 >= r12) goto L_0x0142
            r15 = 0
            java.lang.String r16 = r11.getDisplayString()
            int r16 = r16.length()
            java.lang.String r19 = r11.getDisplayString()
            r0 = r16
            r1 = r19
            int r15 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r13, r15, r0, r1)
            float r15 = (float) r15
            r0 = r29
            int r0 = r0.f11796aw
            r16 = r0
            r0 = r16
            float r0 = (float) r0
            r16 = r0
            float r15 = java.lang.Math.max(r15, r16)
            int r16 = r29.getGap()
            r0 = r16
            float r0 = (float) r0
            r16 = r0
            r0 = r29
            float r19 = r0.mo8493d((int) r6)
            float r16 = r16 * r19
            r19 = 1073741824(0x40000000, float:2.0)
            float r16 = r16 * r19
            float r15 = r15 + r16
            int r16 = f11707aV
            r0 = r16
            float r0 = (float) r0
            r16 = r0
            float r15 = java.lang.Math.max(r15, r16)
            int r15 = (int) r15
            float r15 = (float) r15
            float r10 = (float) r10
            float r10 = r10 + r15
            int r10 = (int) r10
            int r9 = r9 + 1
            goto L_0x00cd
        L_0x011e:
            r0 = r31
            java.util.ArrayList<com.cootek.smartinput5.ui.bG> r3 = r0.f11844i
            r17 = r3
            goto L_0x0005
        L_0x0126:
            r3 = 0
            r18 = r3
            goto L_0x0060
        L_0x012b:
            r3 = 0
            goto L_0x007d
        L_0x012e:
            r3 = 0
            goto L_0x009d
        L_0x0131:
            r3 = 0
            goto L_0x009d
        L_0x0134:
            int r9 = r12 + 1
            r0 = r29
            r1 = r17
            com.cootek.smartinput5.ui.bG r4 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r1, (int) r9)
            r11 = r4
            r12 = r9
            goto L_0x00a2
        L_0x0142:
            android.graphics.Typeface r9 = com.cootek.smartinput5.func.C1624bv.m7422b()
            r13.setTypeface(r9)
            r13.mo9502a()
            r9 = 0
            java.lang.String r15 = r11.getDisplayString()
            int r15 = r15.length()
            java.lang.String r16 = r11.getDisplayString()
            r0 = r16
            int r9 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r13, r9, r15, r0)
            float r9 = (float) r9
            r0 = r29
            int r15 = r0.f11796aw
            float r15 = (float) r15
            float r9 = java.lang.Math.max(r9, r15)
            int r15 = r29.getGap()
            float r15 = (float) r15
            r0 = r29
            float r16 = r0.mo8493d((int) r6)
            float r15 = r15 * r16
            r16 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 * r16
            float r9 = r9 + r15
            int r15 = f11707aV
            float r15 = (float) r15
            float r9 = java.lang.Math.max(r9, r15)
            int r9 = (int) r9
            float r9 = (float) r9
            float r10 = (float) r10
            float r9 = r9 + r10
            int r9 = (int) r9
            if (r9 > r14) goto L_0x01ff
            r19 = r4
        L_0x018b:
            r0 = r29
            boolean r3 = r0.f11776aR
            if (r3 == 0) goto L_0x019a
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r27
            r3.mo8857h(r0, r8)
        L_0x019a:
            r3 = r5
            r20 = r6
            r21 = r7
        L_0x019f:
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r4 = r0.f11800ba
            r0 = r21
            r1 = r25
            boolean r4 = r4.mo8855f(r0, r1)
            if (r4 != 0) goto L_0x01b3
            r0 = r29
            boolean r4 = r0.f11818t
            if (r4 == 0) goto L_0x01b9
        L_0x01b3:
            r4 = 100
            r0 = r20
            if (r0 < r4) goto L_0x0203
        L_0x01b9:
            int r4 = java.lang.Math.abs(r21)
            r0 = r29
            r0.f11797ax = r4
            if (r3 == 0) goto L_0x064d
            r0 = r29
            int r3 = r0.f11797ax
            int r3 = r3 + r8
            r0 = r29
            r0.f11797ax = r3
            r3 = 1
            r0 = r29
            r0.f11770aL = r3
            if (r30 == 0) goto L_0x01fe
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r29
            boolean r4 = r0.f11765aG
            r3.mo8846b((boolean) r4)
            r0 = r29
            android.graphics.drawable.Drawable r3 = r0.f11751Q
            r4 = 0
            int r5 = r27 + r8
            r0 = r27
            r3.setBounds(r0, r4, r5, r8)
            r0 = r29
            android.graphics.drawable.Drawable r3 = r0.f11751Q
            r0 = r29
            int r4 = r0.f11819u
            r3.setAlpha(r4)
            r0 = r29
            android.graphics.drawable.Drawable r3 = r0.f11751Q
            r0 = r30
            r3.draw(r0)
        L_0x01fe:
            return
        L_0x01ff:
            int r4 = r4 + -1
            goto L_0x00b6
        L_0x0203:
            if (r31 == 0) goto L_0x020b
            boolean r4 = r31.mo4033d()
            if (r4 != 0) goto L_0x01fe
        L_0x020b:
            r0 = r29
            r1 = r17
            r2 = r20
            com.cootek.smartinput5.ui.bG r5 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r1, (int) r2)
            if (r5 != 0) goto L_0x0238
            java.lang.String r4 = "worker"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "draw.item."
            java.lang.StringBuilder r5 = r5.append(r6)
            r0 = r20
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = "==null"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.i(r4, r5)
            goto L_0x01b9
        L_0x0238:
            java.lang.String r7 = r5.getDisplayString()
            int r6 = r7.length()
            if (r6 <= 0) goto L_0x04b7
            int r4 = r6 + -1
            char r4 = r7.charAt(r4)
            boolean r4 = com.cootek.smartinput5.p066ui.control.C2829G.m12929a(r4)
        L_0x024c:
            r0 = r29
            int r9 = r0.f11762aD
            int r9 = r9 + -1
            r0 = r20
            if (r0 <= r9) goto L_0x052b
            int r9 = f11710aa
            if (r6 <= r9) goto L_0x04ba
            if (r4 == 0) goto L_0x04ba
            r9 = 1
            r10 = r9
        L_0x025e:
            if (r10 == 0) goto L_0x04be
            r0 = r29
            com.cootek.smartinput5.ui.control.c r9 = r0.f11785al
            r0 = r29
            int r11 = r0.f11789ap
            float r11 = (float) r11
            r9.setTextSize(r11)
            int r11 = f11711ab
            if (r6 <= r11) goto L_0x0285
            r6 = 0
            int r11 = f11711ab
            int r11 = r11 + -1
            java.lang.CharSequence r6 = r7.subSequence(r6, r11)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "…"
            java.lang.String r7 = r6.concat(r7)
            int r6 = f11711ab
        L_0x0285:
            r11 = 0
            int r12 = f11710aa
            int r11 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r9, r11, r12, r7)
            float r11 = (float) r11
            int r12 = f11710aa
            int r9 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r9, r12, r6, r7)
            float r9 = (float) r9
            float r9 = java.lang.Math.max(r11, r9)
            r28 = r9
            r9 = r7
            r7 = r6
            r6 = r28
        L_0x029e:
            com.cootek.smartinput5.func.X r11 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.aD r11 = r11.mo5842o()
            boolean r11 = r11.mo5955l()
            if (r11 == 0) goto L_0x0506
            r0 = r29
            int r11 = r0.f11796aw
            float r11 = (float) r11
            float r6 = java.lang.Math.max(r6, r11)
            int r11 = r29.getGap()
            float r11 = (float) r11
            r0 = r29
            r1 = r20
            float r12 = r0.mo8493d((int) r1)
            float r11 = r11 * r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r12
            float r6 = r6 + r11
            int r11 = f11708aW
            float r11 = (float) r11
            float r6 = java.lang.Math.max(r6, r11)
            int r6 = (int) r6
        L_0x02cf:
            r0 = r29
            int[] r11 = r0.f11760aA
            r11[r20] = r6
            r0 = r29
            boolean[] r11 = r0.f11799az
            r11[r20] = r10
            int r10 = r20 + 1
            r0 = r29
            r0.f11762aD = r10
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r10 = r0.f11800ba
            r0 = r20
            r1 = r21
            r10.mo8854e(r0, r1)
            r13 = r7
            r11 = r9
            r7 = r6
        L_0x02ef:
            if (r30 == 0) goto L_0x04a5
            r0 = r29
            boolean r6 = r0.f11818t
            if (r6 != 0) goto L_0x0307
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r6 = r0.f11800ba
            r0 = r21
            r1 = r24
            r2 = r25
            boolean r6 = r6.mo8842a(r0, r1, r7, r2)
            if (r6 == 0) goto L_0x04a5
        L_0x0307:
            r0 = r29
            boolean[] r6 = r0.f11799az
            boolean r6 = r6[r20]
            if (r6 == 0) goto L_0x0536
            r0 = r29
            com.cootek.smartinput5.ui.control.c r0 = r0.f11785al
            r16 = r0
            r0 = r29
            int r6 = r0.f11789ap
            float r6 = (float) r6
            r0 = r16
            r0.setTextSize(r6)
        L_0x031f:
            if (r3 != 0) goto L_0x0329
            r0 = r29
            boolean r3 = r0.mo8476a((boolean) r3, (com.cootek.smartinput5.p066ui.C2727bG) r5)
            if (r3 == 0) goto L_0x055f
        L_0x0329:
            r3 = 1
            r22 = r3
        L_0x032c:
            int r3 = r5.getTag()
            if (r3 == 0) goto L_0x056f
            if (r4 == 0) goto L_0x0564
            android.graphics.Typeface r3 = com.cootek.smartinput5.func.C1624bv.m7418a()
            r0 = r16
            r0.setTypeface(r3)
        L_0x033d:
            r0 = r29
            int r3 = r0.f11782ai
            r0 = r16
            r0.setColor(r3)
            r0 = r20
            r1 = r29
            r1.f11739E = r0
            r0 = r20
            r1 = r29
            r1.f11740F = r0
            r3 = 1
            r0 = r29
            r0.f11780aZ = r3
            r0 = r29
            boolean r3 = r0.f11817s
            if (r3 == 0) goto L_0x0377
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            boolean r3 = r3.mo8856g(r0, r7)
            if (r3 != 0) goto L_0x0377
            r3 = 0
            r0 = r29
            r0.f11817s = r3
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            r3.mo8851d(r0, r7)
        L_0x0377:
            r3 = 0
            r0 = r29
            r0.f11764aF = r3
            r3 = 0
            r0 = r29
            r0.f11765aG = r3
            r3 = -1
            r0 = r23
            if (r0 == r3) goto L_0x03be
            if (r26 != 0) goto L_0x03be
            r0 = r29
            boolean r3 = r0.f11769aK
            if (r3 != 0) goto L_0x0394
            r0 = r29
            boolean r3 = r0.f11770aL
            if (r3 == 0) goto L_0x059f
        L_0x0394:
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r23
            r1 = r24
            r2 = r27
            boolean r3 = r3.mo8841a(r0, r1, r2)
            if (r3 == 0) goto L_0x059f
            r0 = r29
            boolean r3 = r0.f11769aK
            if (r3 == 0) goto L_0x0583
            r3 = -1
            r0 = r29
            r0.f11736B = r3
            r3 = -1
            r0 = r29
            r0.f11737C = r3
            r3 = 0
            r0 = r29
            r0.f11735A = r3
            r3 = 1
            r0 = r29
            r0.f11764aF = r3
        L_0x03be:
            boolean r3 = r5.hasAdditionalIcon()
            if (r3 == 0) goto L_0x03d6
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            int r6 = r3.mo8843b(r0, r7)
            r9 = 0
            r3 = r29
            r4 = r30
            r3.m12036a(r4, r5, r6, r7, r8, r9)
        L_0x03d6:
            r0 = r29
            boolean r3 = r0.f11776aR
            if (r3 == 0) goto L_0x041d
            if (r22 != 0) goto L_0x03fe
            if (r18 == 0) goto L_0x0630
            int r3 = r20 + 1
            r0 = r29
            r1 = r17
            com.cootek.smartinput5.ui.bG r3 = r0.m12029a((java.util.ArrayList<com.cootek.smartinput5.p066ui.C2727bG>) r1, (int) r3)
            if (r3 != 0) goto L_0x03fe
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            int r3 = r3.mo8848c(r0, r7)
            int r3 = java.lang.Math.abs(r3)
            r0 = r25
            if (r3 < r0) goto L_0x0630
        L_0x03fe:
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            r1 = r27
            boolean r3 = r3.mo8850c(r0, r7, r1, r8)
            if (r3 == 0) goto L_0x0630
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            int r4 = r16.getColor()
            android.graphics.LinearGradient r3 = r3.mo8845b((int) r4)
            r0 = r16
            r0.setShader(r3)
        L_0x041d:
            r0 = r29
            int r3 = r0.f11819u
            r0 = r16
            r0.setAlpha(r3)
            float r3 = r16.descent()
            int r3 = (int) r3
            float r4 = (float) r8
            float r5 = r16.getTextSize()
            float r4 = r4 + r5
            float r3 = (float) r3
            float r3 = r4 - r3
            int r3 = (int) r3
            int r4 = r3 / 2
            r0 = r29
            boolean[] r3 = r0.f11799az
            boolean r3 = r3[r20]
            if (r3 == 0) goto L_0x0638
            int r3 = f11711ab
            if (r13 <= r3) goto L_0x0689
            r3 = 0
            int r5 = f11711ab
            int r5 = r5 + -1
            java.lang.CharSequence r3 = r11.subSequence(r3, r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "…"
            java.lang.String r11 = r3.concat(r5)
            int r13 = f11711ab
            r3 = r13
        L_0x0459:
            r12 = 0
            int r13 = f11710aa
            int r5 = r7 / 2
            int r5 = r5 + r21
            float r14 = (float) r5
            int r5 = r4 * 2
            int r5 = r5 / 3
            float r15 = (float) r5
            r9 = r29
            r10 = r30
            r9.mo8806a(r10, r11, r12, r13, r14, r15, r16)
            int r5 = f11710aa
            r0 = r16
            int r5 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r0, r5, r3, r11)
            float r5 = (float) r5
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            int r6 = r29.getGap()
            float r6 = (float) r6
            r0 = r29
            r1 = r20
            float r9 = r0.mo8493d((int) r1)
            float r6 = r6 * r9
            float r5 = r5 + r6
            int r12 = f11710aa
            r0 = r21
            float r6 = (float) r0
            float r14 = r6 + r5
            int r4 = r4 * 4
            int r4 = r4 / 3
            float r15 = (float) r4
            r9 = r29
            r10 = r30
            r13 = r3
            r9.mo8806a(r10, r11, r12, r13, r14, r15, r16)
        L_0x049c:
            r3 = 255(0xff, float:3.57E-43)
            r0 = r16
            r0.setAlpha(r3)
            r3 = r22
        L_0x04a5:
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r4 = r0.f11800ba
            r0 = r21
            int r5 = r4.mo8848c(r0, r7)
            int r4 = r20 + 1
            r20 = r4
            r21 = r5
            goto L_0x019f
        L_0x04b7:
            r4 = 0
            goto L_0x024c
        L_0x04ba:
            r9 = 0
            r10 = r9
            goto L_0x025e
        L_0x04be:
            r0 = r29
            com.cootek.smartinput5.ui.control.c r9 = r0.f11784ak
            r0 = r29
            int r11 = r0.f11786am
            r0 = r19
            if (r0 == r11) goto L_0x04cd
            r9.mo9502a()
        L_0x04cd:
            if (r4 != 0) goto L_0x04f5
            r0 = r19
            float r11 = (float) r0
            r9.setTextSize(r11)
        L_0x04d5:
            int r11 = r5.getTag()
            if (r11 == 0) goto L_0x04e4
            if (r4 == 0) goto L_0x04fe
            android.graphics.Typeface r11 = com.cootek.smartinput5.func.C1624bv.m7418a()
            r9.setTypeface(r11)
        L_0x04e4:
            r9.mo9502a()
            r11 = 0
            int r9 = com.cootek.smartinput5.p066ui.control.C2829G.m12927a(r9, r11, r6, r7)
            float r9 = (float) r9
            r28 = r9
            r9 = r7
            r7 = r6
            r6 = r28
            goto L_0x029e
        L_0x04f5:
            r0 = r29
            int r11 = r0.f11788ao
            float r11 = (float) r11
            r9.setTextSize(r11)
            goto L_0x04d5
        L_0x04fe:
            android.graphics.Typeface r11 = com.cootek.smartinput5.func.C1624bv.m7422b()
            r9.setTypeface(r11)
            goto L_0x04e4
        L_0x0506:
            r0 = r29
            int r11 = r0.f11796aw
            float r11 = (float) r11
            float r6 = java.lang.Math.max(r6, r11)
            int r11 = r29.getGap()
            float r11 = (float) r11
            r0 = r29
            r1 = r20
            float r12 = r0.mo8493d((int) r1)
            float r11 = r11 * r12
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 * r12
            float r6 = r6 + r11
            int r11 = f11707aV
            float r11 = (float) r11
            float r6 = java.lang.Math.max(r6, r11)
            int r6 = (int) r6
            goto L_0x02cf
        L_0x052b:
            r0 = r29
            int[] r9 = r0.f11760aA
            r9 = r9[r20]
            r13 = r6
            r11 = r7
            r7 = r9
            goto L_0x02ef
        L_0x0536:
            r0 = r29
            com.cootek.smartinput5.ui.control.c r0 = r0.f11784ak
            r16 = r0
            r0 = r29
            int r6 = r0.f11786am
            r0 = r19
            if (r0 == r6) goto L_0x0547
            r16.mo9502a()
        L_0x0547:
            if (r4 != 0) goto L_0x0553
            r0 = r19
            float r6 = (float) r0
            r0 = r16
            r0.setTextSize(r6)
            goto L_0x031f
        L_0x0553:
            r0 = r29
            int r6 = r0.f11788ao
            float r6 = (float) r6
            r0 = r16
            r0.setTextSize(r6)
            goto L_0x031f
        L_0x055f:
            r3 = 0
            r22 = r3
            goto L_0x032c
        L_0x0564:
            android.graphics.Typeface r3 = com.cootek.smartinput5.func.C1624bv.m7422b()
            r0 = r16
            r0.setTypeface(r3)
            goto L_0x033d
        L_0x056f:
            android.graphics.Typeface r3 = com.cootek.smartinput5.func.C1624bv.m7418a()
            r0 = r16
            r0.setTypeface(r3)
            r0 = r29
            int r3 = r0.f11781ah
            r0 = r16
            r0.setColor(r3)
            goto L_0x0377
        L_0x0583:
            r0 = r29
            boolean r3 = r0.f11770aL
            if (r3 == 0) goto L_0x03be
            r3 = -1
            r0 = r29
            r0.f11736B = r3
            r3 = -1
            r0 = r29
            r0.f11737C = r3
            r3 = 0
            r0 = r29
            r0.f11735A = r3
            r3 = 1
            r0 = r29
            r0.f11765aG = r3
            goto L_0x03be
        L_0x059f:
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r23
            r1 = r24
            r2 = r21
            boolean r3 = r3.mo8847b(r0, r1, r2, r7)
            if (r3 == 0) goto L_0x03be
            int r3 = r5.getTag()
            r4 = -1
            if (r3 == r4) goto L_0x03be
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            int r3 = r3.mo8843b(r0, r7)
            float r4 = (float) r3
            r6 = 0
            r0 = r30
            r0.translate(r4, r6)
            r0 = r29
            android.graphics.drawable.Drawable r4 = r0.f11742H
            if (r4 != 0) goto L_0x05e0
            com.cootek.smartinput5.func.X r4 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r4 = r4.mo5841n()
            r6 = 2130837599(0x7f02005f, float:1.7280157E38)
            android.graphics.drawable.Drawable r4 = r4.mo6249a((int) r6)
            r0 = r29
            r0.f11742H = r4
        L_0x05e0:
            r0 = r29
            android.graphics.drawable.Drawable r4 = r0.f11742H
            r6 = 0
            r9 = 0
            r4.setBounds(r6, r9, r7, r8)
            r0 = r29
            android.graphics.drawable.Drawable r4 = r0.f11742H
            r0 = r29
            int r6 = r0.f11819u
            r4.setAlpha(r6)
            r0 = r29
            android.graphics.drawable.Drawable r4 = r0.f11742H
            r0 = r30
            r4.draw(r0)
            int r3 = -r3
            float r3 = (float) r3
            r4 = 0
            r0 = r30
            r0.translate(r3, r4)
            r0 = r29
            r0.f11735A = r11
            r0 = r20
            r1 = r29
            r1.f11736B = r0
            r0 = r20
            r1 = r29
            r1.f11737C = r0
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            r1 = r25
            boolean r3 = r3.mo8853d(r0, r7, r1, r8)
            r0 = r29
            r0.f11738D = r3
            r0 = r29
            int r3 = r0.f11783aj
            r0 = r16
            r0.setColor(r3)
            goto L_0x03be
        L_0x0630:
            r3 = 0
            r0 = r16
            r0.setShader(r3)
            goto L_0x041d
        L_0x0638:
            r12 = 0
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r21
            float r14 = r3.mo8838a(r0, r7)
            float r15 = (float) r4
            r9 = r29
            r10 = r30
            r9.mo8806a(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x049c
        L_0x064d:
            if (r18 == 0) goto L_0x01fe
            r0 = r29
            int r3 = r0.f11797ax
            r0 = r25
            if (r3 <= r0) goto L_0x01fe
            r0 = r29
            int r3 = r0.f11797ax
            int r3 = r3 + r8
            r0 = r29
            r0.f11797ax = r3
            r3 = 1
            r0 = r29
            r0.f11769aK = r3
            if (r30 == 0) goto L_0x01fe
            r0 = r29
            com.cootek.smartinput5.ui.TopScrollView$d r3 = r0.f11800ba
            r0 = r29
            boolean r4 = r0.f11764aF
            r3.mo8840a((boolean) r4)
            r0 = r29
            android.graphics.drawable.Drawable r3 = r0.f11743I
            r4 = 0
            int r5 = r27 + r8
            r0 = r27
            r3.setBounds(r0, r4, r5, r8)
            r0 = r29
            android.graphics.drawable.Drawable r3 = r0.f11743I
            r0 = r30
            r3.draw(r0)
            goto L_0x01fe
        L_0x0689:
            r3 = r13
            goto L_0x0459
        L_0x068c:
            r19 = r4
            goto L_0x018b
        L_0x0690:
            r11 = r3
            r12 = r4
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.TopScrollView.m12045b(android.graphics.Canvas, com.cootek.smartinput5.ui.TopScrollView$e):void");
    }

    /* renamed from: c */
    private void m12050c(Canvas canvas) {
        if (canvas != null && Engine.isInitialized()) {
            Drawable a = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.widget_func_smiley_ctrl, C2726bF.FUNCTION_BAR_SMILEY);
            if (this.f11766aH) {
                a.setState(f11705aC);
            } else {
                a.setState((int[]) null);
            }
            C2934m i = Engine.getInstance().getWidgetManager().mo9651i();
            int d = i.mo9718d();
            int n = d - (i.mo9728n() * 2);
            int emojiBtnWidth = f11706aT - getEmojiBtnWidth();
            int k = i.mo9725k();
            int intrinsicWidth = a.getIntrinsicWidth();
            int intrinsicHeight = a.getIntrinsicHeight();
            float min = Math.min(((float) k) / ((float) intrinsicWidth), ((float) n) / ((float) intrinsicHeight));
            if (n > 0 && k > 0) {
                int i2 = (int) (((((float) intrinsicWidth) * min) * this.f11821w) / 100.0f);
                int i3 = (int) (((((float) intrinsicHeight) * min) * this.f11821w) / 100.0f);
                a.setBounds(0, 0, i2, i3);
                canvas.translate((float) (((k - i2) / 2) + emojiBtnWidth), (float) ((d - i3) / 2));
                a.setAlpha(this.f11820v);
                a.draw(canvas);
                canvas.translate((float) ((-emojiBtnWidth) - ((k - i2) / 2)), (float) ((-(d - i3)) / 2));
                a.setAlpha(255);
            }
        }
    }

    /* renamed from: d */
    private void m12054d(Canvas canvas) {
        if (canvas != null && Engine.isInitialized()) {
            Drawable a = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.widget_func_search, C2726bF.PLUGIN_BAR);
            if (this.f11767aI) {
                a.setState(f11705aC);
            } else {
                a.setState((int[]) null);
            }
            C2934m i = Engine.getInstance().getWidgetManager().mo9651i();
            int d = i.mo9718d();
            int n = d - (i.mo9728n() * 2);
            int k = i.mo9725k();
            int m = i.mo9727m();
            int intrinsicWidth = a.getIntrinsicWidth();
            int intrinsicHeight = a.getIntrinsicHeight();
            float min = Math.min(((float) k) / ((float) intrinsicWidth), ((float) n) / ((float) intrinsicHeight));
            if (n > 0 && k > 0) {
                int i2 = (int) (((((float) intrinsicWidth) * min) * this.f11821w) / 100.0f);
                int i3 = (int) (((((float) intrinsicHeight) * min) * this.f11821w) / 100.0f);
                a.setBounds(0, 0, i2, i3);
                a.setAlpha(this.f11820v);
                canvas.translate((float) (((k - i2) / 2) + m), (float) ((d - i3) / 2));
                a.draw(canvas);
                canvas.translate((float) ((-m) - ((k - i2) / 2)), (float) ((-(d - i3)) / 2));
                a.setAlpha(255);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable mo8473a(int i) {
        return C1368X.m6320c().mo5841n().mo6250a(i, C2726bF.CANDIDATE_BAR);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12036a(android.graphics.Canvas r7, com.cootek.smartinput5.p066ui.C2727bG r8, int r9, int r10, int r11, int r12) {
        /*
            r6 = this;
            r5 = 0
            r1 = 0
            float r0 = (float) r9
            r7.translate(r0, r5)
            boolean r2 = r8.hasLongPressIcon()
            boolean r0 = r8 instanceof com.cootek.smartinput5.engine.CandidateItem
            if (r0 == 0) goto L_0x00f9
            r3 = 4
            if (r12 > 0) goto L_0x0013
            int r12 = r10 + r3
        L_0x0013:
            r0 = r8
            com.cootek.smartinput5.engine.CandidateItem r0 = (com.cootek.smartinput5.engine.CandidateItem) r0
            boolean r0 = r0.isBigram()
            if (r0 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r0 = r6.f11812l
            if (r0 != 0) goto L_0x0031
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r0 = r0.mo5841n()
            r2 = 2130837852(0x7f02015c, float:1.728067E38)
            android.graphics.drawable.Drawable r0 = r0.mo6249a((int) r2)
            r6.f11812l = r0
        L_0x0031:
            android.graphics.drawable.Drawable r0 = r6.f11812l
            int r2 = r10 + r3
            if (r2 <= r12) goto L_0x0067
        L_0x0037:
            r0.setBounds(r1, r1, r12, r11)
            android.graphics.drawable.Drawable r0 = r6.f11812l
            r0.draw(r7)
            r0 = r1
        L_0x0040:
            if (r0 == 0) goto L_0x0061
            android.graphics.drawable.Drawable r0 = r6.f11811k
            if (r0 != 0) goto L_0x0057
            com.cootek.smartinput5.func.X r0 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r0 = r0.mo5841n()
            r2 = 2130837854(0x7f02015e, float:1.7280674E38)
            android.graphics.drawable.Drawable r0 = r0.mo6249a((int) r2)
            r6.f11811k = r0
        L_0x0057:
            android.graphics.drawable.Drawable r0 = r6.f11811k
            r0.setBounds(r1, r1, r10, r11)
            android.graphics.drawable.Drawable r0 = r6.f11811k
            r0.draw(r7)
        L_0x0061:
            int r0 = -r9
            float r0 = (float) r0
            r7.translate(r0, r5)
            return
        L_0x0067:
            int r12 = r10 + r3
            goto L_0x0037
        L_0x006a:
            r0 = r8
            com.cootek.smartinput5.engine.CandidateItem r0 = (com.cootek.smartinput5.engine.CandidateItem) r0
            boolean r0 = r0.isCloudPredict()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r6.f11749O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = r6.f11749O
            java.lang.String r4 = r8.getDisplayString()
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x00f9
        L_0x0087:
            android.graphics.drawable.Drawable r0 = r6.f11748N
            if (r0 != 0) goto L_0x009e
            com.cootek.smartinput5.ui.bF r0 = com.cootek.smartinput5.p066ui.C2726bF.CANDIDATE_ITEM_ADD_ICON
            com.cootek.smartinput5.func.X r2 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r2 = r2.mo5841n()
            r4 = 2130837600(0x7f020060, float:1.7280159E38)
            android.graphics.drawable.Drawable r0 = r2.mo6250a((int) r4, (com.cootek.smartinput5.p066ui.C2726bF) r0)
            r6.f11748N = r0
        L_0x009e:
            android.graphics.drawable.Drawable r0 = r6.f11748N
            int r2 = r10 + r3
            if (r2 <= r12) goto L_0x00ba
        L_0x00a4:
            r0.setBounds(r1, r1, r12, r11)
            android.graphics.drawable.Drawable r0 = r6.f11748N
            r0.draw(r7)
            java.lang.String r0 = r8.getDisplayString()
            r6.f11749O = r0
            boolean r0 = r6.f11810bm
            if (r0 == 0) goto L_0x00fc
            r6.f11810bm = r1
            r0 = r1
            goto L_0x0040
        L_0x00ba:
            int r12 = r10 + r3
            goto L_0x00a4
        L_0x00bd:
            r0 = r8
            com.cootek.smartinput5.engine.CandidateItem r0 = (com.cootek.smartinput5.engine.CandidateItem) r0
            boolean r0 = r0.isCapitalizeLast()
            if (r0 != 0) goto L_0x00ce
            com.cootek.smartinput5.engine.CandidateItem r8 = (com.cootek.smartinput5.engine.CandidateItem) r8
            boolean r0 = r8.isCorrectLast()
            if (r0 == 0) goto L_0x00f9
        L_0x00ce:
            android.graphics.drawable.Drawable r0 = r6.f11750P
            if (r0 != 0) goto L_0x00e5
            com.cootek.smartinput5.ui.bF r0 = com.cootek.smartinput5.p066ui.C2726bF.CANDIDATE_ITEM_ADD_ICON
            com.cootek.smartinput5.func.X r2 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r2 = r2.mo5841n()
            r4 = 2130837615(0x7f02006f, float:1.728019E38)
            android.graphics.drawable.Drawable r0 = r2.mo6250a((int) r4, (com.cootek.smartinput5.p066ui.C2726bF) r0)
            r6.f11750P = r0
        L_0x00e5:
            android.graphics.drawable.Drawable r0 = r6.f11750P
            int r2 = r10 + r3
            if (r2 <= r12) goto L_0x00f6
        L_0x00eb:
            r0.setBounds(r1, r1, r12, r11)
            android.graphics.drawable.Drawable r0 = r6.f11750P
            r0.draw(r7)
            r0 = r1
            goto L_0x0040
        L_0x00f6:
            int r12 = r10 + r3
            goto L_0x00eb
        L_0x00f9:
            r0 = r2
            goto L_0x0040
        L_0x00fc:
            r0 = r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.TopScrollView.m12036a(android.graphics.Canvas, com.cootek.smartinput5.ui.bG, int, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public C2644d getDisplayTypeHandler() {
        if (SurfaceManager.isRightToLeftMode) {
            if (this.f11801bb == null) {
                this.f11801bb = new C2643c(this, (C2788cL) null);
                this.f11802bc = null;
            }
            return this.f11801bb;
        }
        if (this.f11802bc == null) {
            this.f11802bc = new C2642b(this, (C2788cL) null);
            this.f11801bb = null;
        }
        return this.f11802bc;
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$c */
    private class C2643c implements C2644d {

        /* renamed from: b */
        private LinearGradient f11835b;

        /* renamed from: c */
        private LinearGradient f11836c;

        /* renamed from: d */
        private LinearGradient f11837d;

        /* renamed from: e */
        private int f11838e;

        /* renamed from: f */
        private int f11839f;

        private C2643c() {
        }

        /* synthetic */ C2643c(TopScrollView topScrollView, C2788cL cLVar) {
            this();
        }

        /* renamed from: a */
        public float mo8838a(int i, int i2) {
            return (float) (i - (i2 / 2));
        }

        /* renamed from: b */
        public int mo8843b(int i, int i2) {
            return i - i2;
        }

        /* renamed from: a */
        public boolean mo8841a(int i, int i2, int i3) {
            return i + i2 <= TopScrollView.this.getHeight() + i3;
        }

        /* renamed from: c */
        public boolean mo8849c(int i) {
            int o = TopScrollView.this.f11778aU + TopScrollView.this.getLeftPaddingWidth();
            return i > o && i < o + TopScrollView.this.getEmojiBtnWidth();
        }

        /* renamed from: d */
        public boolean mo8852d(int i) {
            return i > 0 && i < TopScrollView.this.getLeftPaddingWidth();
        }

        /* renamed from: c */
        public int mo8848c(int i, int i2) {
            return i - i2;
        }

        /* renamed from: b */
        public int mo8844b(int i, int i2, int i3) {
            return i;
        }

        /* renamed from: d */
        public void mo8851d(int i, int i2) {
            TopScrollView.this.f11814p = i - i2;
            if (TopScrollView.this.f11814p < (-TopScrollView.this.f11797ax)) {
                TopScrollView.this.f11814p = -TopScrollView.this.f11797ax;
                if (TopScrollView.this.f11814p > 0) {
                    TopScrollView.this.f11814p = 0;
                }
            }
        }

        /* renamed from: e */
        public void mo8854e(int i, int i2) {
            if (i == 0) {
                TopScrollView.this.f11761aB[i] = i2;
            } else {
                TopScrollView.this.f11761aB[i] = i2 - TopScrollView.this.f11760aA[i - 1];
            }
        }

        /* renamed from: a */
        public boolean mo8842a(int i, int i2, int i3, int i4) {
            return i > i2 && i < (i2 + i3) + i4;
        }

        /* renamed from: f */
        public boolean mo8855f(int i, int i2) {
            return i > TopScrollView.this.f11814p - (i2 * 2);
        }

        /* renamed from: g */
        public boolean mo8856g(int i, int i2) {
            return i > TopScrollView.this.f11814p && i < (TopScrollView.this.f11814p + TopScrollView.this.getWidth()) + i2;
        }

        /* renamed from: b */
        public boolean mo8847b(int i, int i2, int i3, int i4) {
            return i + i2 > i3 - i4 && i + i2 <= i3;
        }

        /* renamed from: c */
        public boolean mo8850c(int i, int i2, int i3, int i4) {
            return i - i2 <= i3 + i4 && i >= i3;
        }

        /* renamed from: a */
        public void mo8840a(boolean z) {
            C2726bF bFVar = C2726bF.CANDIDATE_BAR;
            if (z) {
                if (TopScrollView.this.f11744J == null) {
                    if (TopScrollView.this.f11746L == null) {
                        Drawable unused = TopScrollView.this.f11746L = TopScrollView.this.mo8473a((int) R.drawable.key_fun_more_h);
                    }
                    Drawable unused2 = TopScrollView.this.f11744J = TopScrollView.this.m12023a(TopScrollView.this.f11746L.getCurrent(), bFVar);
                }
                Drawable unused3 = TopScrollView.this.f11743I = TopScrollView.this.f11744J;
                return;
            }
            if (TopScrollView.this.f11745K == null) {
                if (TopScrollView.this.f11747M == null) {
                    Drawable unused4 = TopScrollView.this.f11747M = TopScrollView.this.mo8473a((int) R.drawable.key_fun_more);
                }
                Drawable unused5 = TopScrollView.this.f11745K = TopScrollView.this.m12023a(TopScrollView.this.f11747M.getCurrent(), bFVar);
            }
            Drawable unused6 = TopScrollView.this.f11743I = TopScrollView.this.f11745K;
        }

        /* renamed from: b */
        public void mo8846b(boolean z) {
            C2726bF bFVar = C2726bF.CANDIDATE_BAR;
            C1602bh n = C1368X.m6320c().mo5841n();
            if (z) {
                if (TopScrollView.this.f11752R == null) {
                    if (TopScrollView.this.f11754T == null) {
                        Drawable unused = TopScrollView.this.f11754T = n.mo6250a((int) R.drawable.key_fun_clear_h, bFVar);
                    }
                    Drawable unused2 = TopScrollView.this.f11752R = TopScrollView.this.m12023a(TopScrollView.this.f11754T.getCurrent(), bFVar);
                }
                Drawable unused3 = TopScrollView.this.f11751Q = TopScrollView.this.f11752R;
                return;
            }
            if (TopScrollView.this.f11753S == null) {
                if (TopScrollView.this.f11755U == null) {
                    Drawable unused4 = TopScrollView.this.f11755U = n.mo6250a((int) R.drawable.key_fun_clear, bFVar);
                }
                Drawable unused5 = TopScrollView.this.f11753S = TopScrollView.this.m12023a(TopScrollView.this.f11755U.getCurrent(), bFVar);
            }
            Drawable unused6 = TopScrollView.this.f11751Q = TopScrollView.this.f11753S;
        }

        /* renamed from: a */
        public int mo8839a(int i) {
            return TopScrollView.this.f11761aB[i] - TopScrollView.this.f11760aA[i];
        }

        /* renamed from: h */
        public void mo8857h(int i, int i2) {
            this.f11838e = i;
            this.f11839f = i2;
            this.f11835b = null;
            this.f11836c = null;
            this.f11837d = null;
        }

        /* renamed from: b */
        public LinearGradient mo8845b(int i) {
            if (i == TopScrollView.this.f11781ah) {
                if (this.f11835b == null) {
                    this.f11835b = new LinearGradient((float) this.f11838e, 0.0f, (float) (this.f11838e + this.f11839f), 0.0f, new int[]{0, TopScrollView.this.f11781ah}, new float[]{0.95f, 1.0f}, Shader.TileMode.CLAMP);
                }
                return this.f11835b;
            } else if (i == TopScrollView.this.f11782ai) {
                if (this.f11836c == null) {
                    this.f11836c = new LinearGradient((float) this.f11838e, 0.0f, (float) (this.f11838e + this.f11839f), 0.0f, new int[]{0, TopScrollView.this.f11782ai}, new float[]{0.95f, 1.0f}, Shader.TileMode.CLAMP);
                }
                return this.f11836c;
            } else if (i != TopScrollView.this.f11783aj) {
                return null;
            } else {
                if (this.f11837d == null) {
                    this.f11837d = new LinearGradient((float) this.f11838e, 0.0f, (float) (this.f11838e + this.f11839f), 0.0f, new int[]{0, TopScrollView.this.f11783aj}, new float[]{0.95f, 1.0f}, Shader.TileMode.CLAMP);
                }
                return this.f11837d;
            }
        }

        /* renamed from: d */
        public boolean mo8853d(int i, int i2, int i3, int i4) {
            return i - (i2 / 2) < i4 - i3;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$b */
    private class C2642b implements C2644d {

        /* renamed from: b */
        private LinearGradient f11829b;

        /* renamed from: c */
        private LinearGradient f11830c;

        /* renamed from: d */
        private LinearGradient f11831d;

        /* renamed from: e */
        private int f11832e;

        /* renamed from: f */
        private int f11833f;

        private C2642b() {
        }

        /* synthetic */ C2642b(TopScrollView topScrollView, C2788cL cLVar) {
            this();
        }

        /* renamed from: a */
        public float mo8838a(int i, int i2) {
            return (float) ((i2 / 2) + i);
        }

        /* renamed from: b */
        public int mo8843b(int i, int i2) {
            return i;
        }

        /* renamed from: a */
        public boolean mo8841a(int i, int i2, int i3) {
            return i + i2 >= i3;
        }

        /* renamed from: c */
        public int mo8848c(int i, int i2) {
            return i + i2;
        }

        /* renamed from: b */
        public int mo8844b(int i, int i2, int i3) {
            return ((TopScrollView.this.getLeftPaddingWidth() + i2) - i3) + i;
        }

        /* renamed from: d */
        public void mo8851d(int i, int i2) {
            TopScrollView.this.f11814p = i;
            if (TopScrollView.this.f11814p + TopScrollView.this.getWidth() > TopScrollView.this.f11797ax) {
                TopScrollView.this.f11814p = TopScrollView.this.f11797ax - TopScrollView.this.getWidth();
                if (TopScrollView.this.f11814p < 0) {
                    TopScrollView.this.f11814p = 0;
                }
            }
        }

        /* renamed from: e */
        public void mo8854e(int i, int i2) {
            TopScrollView.this.f11761aB[i] = i2;
        }

        /* renamed from: a */
        public boolean mo8842a(int i, int i2, int i3, int i4) {
            return i > i2 - i3 && i < i2 + i4;
        }

        /* renamed from: f */
        public boolean mo8855f(int i, int i2) {
            return i < TopScrollView.this.f11814p + (i2 * 2);
        }

        /* renamed from: g */
        public boolean mo8856g(int i, int i2) {
            return i > TopScrollView.this.f11814p && i < (TopScrollView.this.f11814p + TopScrollView.this.getWidth()) - i2;
        }

        /* renamed from: b */
        public boolean mo8847b(int i, int i2, int i3, int i4) {
            return i + i2 >= i3 && i + i2 < i3 + i4;
        }

        /* renamed from: c */
        public boolean mo8850c(int i, int i2, int i3, int i4) {
            return i + i2 >= i3 && i <= i3 + i4;
        }

        /* renamed from: a */
        public void mo8840a(boolean z) {
            if (z) {
                if (TopScrollView.this.f11746L == null) {
                    Drawable unused = TopScrollView.this.f11746L = TopScrollView.this.mo8473a((int) R.drawable.key_fun_more_h);
                }
                Drawable unused2 = TopScrollView.this.f11743I = TopScrollView.this.f11746L;
            } else {
                if (TopScrollView.this.f11747M == null) {
                    Drawable unused3 = TopScrollView.this.f11747M = TopScrollView.this.mo8473a((int) R.drawable.key_fun_more);
                }
                Drawable unused4 = TopScrollView.this.f11743I = TopScrollView.this.f11747M;
            }
            Drawable unused5 = TopScrollView.this.f11745K = null;
            Drawable unused6 = TopScrollView.this.f11744J = null;
        }

        /* renamed from: b */
        public void mo8846b(boolean z) {
            if (z) {
                if (TopScrollView.this.f11754T == null) {
                    Drawable unused = TopScrollView.this.f11754T = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.key_fun_clear_h, C2726bF.CANDIDATE_BAR);
                }
                Drawable unused2 = TopScrollView.this.f11751Q = TopScrollView.this.f11754T;
            } else {
                if (TopScrollView.this.f11755U == null) {
                    Drawable unused3 = TopScrollView.this.f11755U = C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.key_fun_clear, C2726bF.CANDIDATE_BAR);
                }
                Drawable unused4 = TopScrollView.this.f11751Q = TopScrollView.this.f11755U;
            }
            Drawable unused5 = TopScrollView.this.f11753S = null;
            Drawable unused6 = TopScrollView.this.f11752R = null;
        }

        /* renamed from: a */
        public int mo8839a(int i) {
            return TopScrollView.this.f11761aB[i];
        }

        /* renamed from: h */
        public void mo8857h(int i, int i2) {
            this.f11832e = i;
            this.f11833f = i2;
            this.f11829b = null;
            this.f11830c = null;
            this.f11831d = null;
        }

        /* renamed from: b */
        public LinearGradient mo8845b(int i) {
            if (i == TopScrollView.this.f11781ah) {
                if (this.f11829b == null) {
                    this.f11829b = new LinearGradient((float) this.f11832e, 0.0f, (float) (this.f11832e + this.f11833f), 0.0f, new int[]{TopScrollView.this.f11781ah, 0}, new float[]{0.0f, 0.05f}, Shader.TileMode.CLAMP);
                }
                return this.f11829b;
            } else if (i == TopScrollView.this.f11782ai) {
                if (this.f11830c == null) {
                    this.f11830c = new LinearGradient((float) this.f11832e, 0.0f, (float) (this.f11832e + this.f11833f), 0.0f, new int[]{TopScrollView.this.f11782ai, 0}, new float[]{0.0f, 0.05f}, Shader.TileMode.CLAMP);
                }
                return this.f11830c;
            } else if (i != TopScrollView.this.f11783aj) {
                return null;
            } else {
                if (this.f11831d == null) {
                    this.f11831d = new LinearGradient((float) this.f11832e, 0.0f, (float) (this.f11832e + this.f11833f), 0.0f, new int[]{TopScrollView.this.f11783aj, 0}, new float[]{0.0f, 0.05f}, Shader.TileMode.CLAMP);
                }
                return this.f11831d;
            }
        }

        /* renamed from: d */
        public boolean mo8853d(int i, int i2, int i3, int i4) {
            return (i2 / 2) + i > i3 - i4;
        }

        /* renamed from: c */
        public boolean mo8849c(int i) {
            int o = TopScrollView.this.f11778aU + TopScrollView.this.getLeftPaddingWidth();
            return i > o && i < o + TopScrollView.this.getEmojiBtnWidth();
        }

        /* renamed from: d */
        public boolean mo8852d(int i) {
            return i > 0 && i < TopScrollView.this.getLeftPaddingWidth();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo8493d(int i) {
        return 1.0f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12032a(int i, int i2) {
        if (i > i2) {
            int i3 = (int) (((float) i2) + (this.f11777aS * 40.0f));
            if (i3 >= i) {
                scrollTo(i, 0);
                requestLayout();
                return;
            }
            scrollTo(i3, 0);
            return;
        }
        int i4 = (int) (((float) i2) - (this.f11777aS * 40.0f));
        if (i4 <= i) {
            scrollTo(i, 0);
            requestLayout();
            return;
        }
        scrollTo(i4, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m12079p() {
        m12032a(this.f11814p, getScrollX());
        invalidate();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongCall"})
    /* renamed from: a */
    public void mo8490a(boolean z) {
        mo8825k();
        if (z) {
            if (!SurfaceManager.isRightToLeftMode || mo8482m_()) {
                this.f11814p = 0;
            } else {
                int width = getWidth();
                if (width == 0) {
                    measure(0, 0);
                    width = getMeasuredWidth();
                }
                this.f11814p = 0 - width;
            }
            scrollTo(this.f11814p, 0);
        }
        if (this.f11818t) {
            this.f11817s = true;
        }
        onDraw((Canvas) null);
        invalidate();
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo8825k() {
        this.f11741G = -1;
        this.f11768aJ = false;
        this.f11735A = null;
        this.f11736B = -1;
        this.f11737C = -1;
        this.f11740F = -1;
        this.f11739E = -1;
        this.f11780aZ = false;
        this.f11762aD = 0;
        this.f11749O = null;
        this.f11769aK = false;
        this.f11770aL = false;
        this.f11810bm = true;
        if (this.f11775aQ != null) {
            this.f11775aQ.mo9670a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0904g.m4916a().mo3411c();
        if (!this.f11798ay.onTouchEvent(motionEvent)) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            if (!this.f11768aJ) {
                this.f11741G = x;
            }
            switch (action) {
                case 0:
                    invalidate();
                    this.f11771aM.sendEmptyMessageDelayed(1, 600);
                    break;
                case 1:
                case 6:
                    if (!this.f11768aJ && !this.f11790aq) {
                        if (this.f11764aF) {
                            Engine.getInstance().feedback();
                            this.f11815q.mo8647a();
                        } else if (this.f11765aG) {
                            Engine.getInstance().feedback();
                            this.f11815q.mo8649b();
                        } else if (this.f11766aH) {
                            Engine.getInstance().feedback();
                            this.f11815q.mo8655e();
                        } else if (this.f11767aI) {
                            Engine.getInstance().feedback();
                            this.f11815q.mo8656f();
                        } else if (this.f11735A != null) {
                            Engine.getInstance().feedback();
                            boolean q = m12081q();
                            mo8491a(!this.f11738D, this.f11740F != -1 && this.f11740F == this.f11736B);
                            if (this.f11792as) {
                                this.f11815q.mo8650b(this.f11737C);
                            } else {
                                this.f11815q.mo8648a(this.f11737C);
                            }
                            if (q) {
                                Engine.getInstance().commitKeyEvent(Engine.KEYCODE_FUN_VOICE);
                            }
                        }
                    }
                    if (this.f11790aq) {
                        if (SurfaceManager.isRightToLeftMode) {
                            if (getScrollX() > (-getWidth())) {
                                this.f11814p = -getWidth();
                            }
                        } else if (getScrollX() < 0) {
                            this.f11814p = 0;
                        }
                        m12079p();
                        if (!this.f11791ar) {
                            this.f11815q.mo8651c();
                        }
                    }
                    this.f11771aM.removeMessages(1);
                    this.f11768aJ = false;
                    this.f11735A = null;
                    this.f11736B = -1;
                    this.f11737C = -1;
                    this.f11740F = -1;
                    this.f11739E = -1;
                    this.f11780aZ = false;
                    this.f11764aF = false;
                    this.f11765aG = false;
                    this.f11766aH = false;
                    this.f11767aI = false;
                    requestLayout();
                    mo8827m();
                    invalidate();
                    break;
            }
        }
        return true;
    }

    /* renamed from: q */
    private boolean m12081q() {
        if (m12083r()) {
            C2727bG b = mo8477b(this.f11737C);
            if (!(b instanceof CandidateItem) || ((CandidateItem) b).getSource() != 7) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m12083r() {
        VoiceView f;
        if (!Engine.isInitialized() || (f = Engine.getInstance().getWidgetManager().mo9645f(false)) == null || !f.isShown()) {
            return false;
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo8826l() {
        C2727bG b;
        if (this.f11737C >= 0 && HighFreqSettings.getInstance().previewLevel != 0 && (b = mo8477b(this.f11737C)) != null) {
            C2833K x = Engine.getInstance().getWidgetManager().mo9667x();
            x.mo9295a(0);
            x.mo9301a(C2833K.m12972a((View) this, this.f11761aB[this.f11736B] - getScrollX(), getTop(), this.f11760aA[this.f11736B], getHeight()), b.getDisplayString());
        }
    }

    /* renamed from: a */
    public void mo8808a(String str, String str2) {
        int i = this.f11736B != -1 ? this.f11736B : this.f11739E;
        int i2 = this.f11737C != -1 ? this.f11737C : this.f11740F;
        if (i != -1 && i2 != -1 && mo8477b(i2) != null) {
            String displayString = mo8477b(i2).getDisplayString();
            if (!TextUtils.isEmpty(displayString) && !displayString.equalsIgnoreCase(str2)) {
                if (this.f11737C != -1 || m12047b(displayString, str)) {
                    int i3 = this.f11760aA[i];
                    int i4 = this.f11761aB[i];
                    if (this.f11775aQ == null) {
                        this.f11775aQ = new C2919e(C1368X.m6313b(), this, R.style.CandidateConfirmAnimation, 300);
                        this.f11775aQ.mo9671a(this.f11782ai, (float) this.f11786am);
                    }
                    this.f11775aQ.mo9675a(displayString, i4 - getScrollX(), getTop() - getHeight(), i3, -1);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m12047b(String str, String str2) {
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        String[] commitTextArray = Engine.getInstance().getCommitManager().getCommitTextArray();
        if (commitTextArray == null || commitTextArray.length <= 1 || !TextUtils.equals(str, commitTextArray[0])) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo8827m() {
        this.f11741G = -1;
        Engine.getInstance().getWidgetManager().mo9667x().mo9294a();
    }

    /* renamed from: a_ */
    public void mo8809a_(int i) {
        int b;
        int b2;
        if (this.f11762aD >= 1) {
            int i2 = this.f11739E != -1 ? this.f11739E : 0;
            if (i == 3145768) {
                if (this.f11761aB[i2] < getScrollX()) {
                    b2 = m12040b(i2, this.f11762aD - 1);
                } else {
                    b2 = m12040b(0, i2);
                }
                this.f11815q.mo8654d(b2 + -1 < 0 ? 0 : b2 - 1);
                if (this.f11761aB[b2] > getWidth() - getHeight()) {
                    this.f11814p = (this.f11761aB[b2] + getHeight()) - getWidth();
                } else {
                    this.f11814p = 0;
                }
            } else if (i == 3145769) {
                if (this.f11761aB[i2] < getScrollX()) {
                    b = m12040b(i2, this.f11762aD - 1);
                } else {
                    b = m12040b(0, i2);
                }
                if (this.f11780aZ) {
                    int i3 = b;
                    while (true) {
                        if (i3 >= this.f11762aD) {
                            break;
                        } else if (this.f11761aB[i3] >= (getScrollX() + getWidth()) - getHeight()) {
                            b = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                this.f11815q.mo8654d(b);
                if (this.f11761aB[b] + getWidth() < this.f11797ax) {
                    this.f11814p = this.f11761aB[b];
                }
            } else if (i == 3145770) {
                if (this.f11761aB[i2] < getScrollX() + this.f11760aA[i2]) {
                    if (this.f11761aB[i2] > getWidth()) {
                        this.f11814p = (this.f11761aB[i2] + getHeight()) - getWidth();
                    } else {
                        this.f11814p = 0;
                    }
                }
            } else if (i == 3145771) {
                int i4 = i2 + 1 < this.f11762aD ? i2 + 1 : this.f11762aD - 1;
                if (this.f11761aB[i2] >= getScrollX() && this.f11761aB[i2] <= getScrollX() + getWidth() && this.f11761aB[i4] + this.f11760aA[i4] > (getScrollX() + getWidth()) - getHeight()) {
                    if (i4 < this.f11761aB[this.f11762aD + -1 < 0 ? 0 : this.f11762aD - 1]) {
                        this.f11814p = this.f11761aB[i4];
                    }
                }
            } else {
                return;
            }
            scrollTo(this.f11814p, 0);
            requestLayout();
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m12020a(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return i;
        }
        if (SurfaceManager.isRightToLeftMode) {
            if (this.f11761aB[(i + i2) / 2] - this.f11760aA[(i + i2) / 2] < i3) {
                i4 = m12020a(i, (i + i2) / 2, i3);
            } else if (this.f11761aB[(i + i2) / 2] > i3) {
                i4 = m12020a(((i + i2) / 2) + 1, i2, i3);
            } else {
                i4 = (i + i2) / 2;
            }
        } else if (this.f11761aB[(i + i2) / 2] + this.f11760aA[(i + i2) / 2] > i3) {
            i4 = m12020a(i, (i + i2) / 2, i3);
        } else if (this.f11761aB[(i + i2) / 2] < i3) {
            i4 = m12020a(((i + i2) / 2) + 1, i2, i3);
        } else {
            i4 = (i + i2) / 2;
        }
        return i4;
    }

    /* renamed from: b */
    private int m12040b(int i, int i2) {
        return m12020a(i, i2, getScrollX());
    }

    /* renamed from: n */
    public void mo8828n() {
        measure(0, 0);
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m_ */
    public boolean mo8482m_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n_ */
    public boolean mo8483n_() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8480e() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8495g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8829o() {
        C2137q.m9700a(C1368X.m6313b()).mo7538a("");
        C1246d.m6010a(C1368X.m6313b()).mo4591a(C1246d.f3928dv, C1246d.f3890dA, C1246d.f3923dq);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m12086s() {
        C2618H h = new C2618H(C1368X.m6313b());
        h.mo8572a(m12073j((int) R.string.forbid_simple_candidate_style_dialog_title));
        h.mo8586e((int) R.drawable.classic_candidate_pic);
        h.mo8580b(m12073j((int) R.string.forbid_simple_candidate_style_dialog_content));
        h.mo8574a(m12073j((int) R.string.yes), (View.OnClickListener) new C2789cM(this));
        h.mo8581b(m12073j((int) R.string.no), (View.OnClickListener) null);
        Settings.getInstance().setBoolSetting(Settings.SHOW_FORBID_SIMPLE_CANDIDATE_STYLE_DIALOG, false);
        h.mo8567a();
    }

    /* renamed from: j */
    private String m12073j(int i) {
        return C1974m.m9063a(getContext(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8491a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    public int getGap() {
        return this.f11813o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo8819h(int i) {
        return i / 10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo8479c(int i) {
        return 0;
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$f */
    protected class C2646f {

        /* renamed from: a */
        public C2727bG f11846a;

        /* renamed from: b */
        public String f11847b;

        /* renamed from: c */
        public boolean f11848c = false;

        /* renamed from: d */
        public boolean f11849d = false;

        /* renamed from: e */
        public boolean f11850e = false;

        /* renamed from: f */
        public int f11851f;

        /* renamed from: g */
        public int f11852g;

        /* renamed from: h */
        public int f11853h;

        /* renamed from: i */
        public int f11854i;

        /* renamed from: j */
        public int f11855j;

        /* renamed from: k */
        public int f11856k;

        /* renamed from: l */
        public int f11857l;

        /* renamed from: m */
        public boolean f11858m = false;

        /* renamed from: o */
        private String f11860o;

        /* renamed from: p */
        private boolean f11861p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public boolean f11862q = false;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public float f11863r;

        public C2646f() {
            mo8867g();
        }

        /* renamed from: a */
        public void mo8859a(C2727bG bGVar, int i) {
            this.f11846a = bGVar;
            if (bGVar != null) {
                this.f11847b = bGVar.getDisplayString();
            }
            this.f11851f = i;
            this.f11861p = false;
        }

        /* renamed from: a */
        private int m12196a(C2856c cVar) {
            cVar.setTextSize((float) this.f11853h);
            this.f11855j = C2829G.m12928a((Paint) cVar, (CharSequence) mo8866f());
            return this.f11855j;
        }

        /* renamed from: a */
        public int mo8858a() {
            return TopScrollView.this.mo8819h(this.f11856k) / 2;
        }

        /* renamed from: b */
        public int mo8861b() {
            return TopScrollView.this.mo8819h(this.f11856k) / 2;
        }

        /* renamed from: c */
        public int mo8863c() {
            return TopScrollView.this.mo8819h(this.f11856k);
        }

        /* renamed from: d */
        public boolean mo8864d() {
            return this.f11862q;
        }

        /* renamed from: e */
        public float mo8865e() {
            return this.f11863r;
        }

        /* renamed from: a */
        public boolean mo8860a(C2856c cVar, int i) {
            if (this.f11861p) {
                return false;
            }
            this.f11862q = false;
            C2856c b = m12200b(cVar);
            int h = (this.f11856k - TopScrollView.this.mo8819h(this.f11856k)) - TopScrollView.this.mo8479c(this.f11856k);
            int a = m12196a(b);
            if (a > h) {
                this.f11862q = true;
                this.f11863r = (((float) h) * 1.0f) / ((float) a);
                return true;
            }
            this.f11862q = false;
            this.f11863r = 0.0f;
            return false;
        }

        /* renamed from: f */
        public String mo8866f() {
            if (this.f11861p) {
                return null;
            }
            if (TextUtils.isEmpty(this.f11860o)) {
                if (this.f11847b == null) {
                    this.f11847b = "";
                }
                this.f11860o = new String(this.f11847b);
            }
            String str = this.f11860o;
            int length = this.f11860o.length();
            int i = 16;
            if (this.f11858m) {
                i = 36;
            }
            if (length >= i) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str.substring(0, (i / 2) - 1));
                stringBuffer.append(TopScrollView.f11723c);
                stringBuffer.append(str.substring((length - (i / 2)) + 1, length));
                this.f11860o = stringBuffer.toString();
            }
            return this.f11860o;
        }

        /* renamed from: b */
        public int mo8862b(C2856c cVar, int i) {
            if (this.f11861p) {
                return -1;
            }
            C2856c b = m12200b(cVar);
            return ((int) ((b.getTextSize() + ((float) i)) - ((float) ((int) b.descent())))) / 2;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C2856c m12200b(C2856c cVar) {
            cVar.setTextSize((float) this.f11853h);
            cVar.setColor(this.f11854i);
            cVar.setAlpha(TopScrollView.this.f11819u);
            if (this.f11848c) {
                cVar.setTypeface(C1624bv.m7422b());
            } else {
                cVar.setTypeface(C1624bv.m7418a());
            }
            return cVar;
        }

        /* renamed from: g */
        public void mo8867g() {
            this.f11860o = null;
            this.f11861p = true;
            this.f11850e = false;
        }

        /* renamed from: h */
        public boolean mo8868h() {
            return this.f11861p;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.TopScrollView$e */
    public class C2645e extends C0985B {

        /* renamed from: e */
        Canvas f11840e;

        /* renamed from: f */
        WeakReference<Bitmap> f11841f;

        /* renamed from: g */
        int f11842g;

        /* renamed from: h */
        int f11843h;

        /* renamed from: i */
        ArrayList<C2727bG> f11844i;

        public C2645e() {
            this.f2552b = 1;
        }

        /* renamed from: f */
        public void mo4035f() {
            super.mo4035f();
            boolean unused = TopScrollView.this.f11805bf = true;
            TopScrollView.this.mo8807a(this);
        }

        public void run() {
            TopScrollView.this.mo8815d(this);
        }

        /* renamed from: c */
        public void mo4032c() {
            synchronized (TopScrollView.this.f11807bh) {
                if (TopScrollView.this.f11807bh = Integer.valueOf(TopScrollView.this.f11807bh.intValue() + 1).intValue() <= 5) {
                    super.mo4032c();
                }
            }
        }

        /* renamed from: g */
        public void mo4036g() {
            if (mo4033d()) {
                mo4029a(false);
                return;
            }
            if (this.f11843h != this.f11842g) {
                TopScrollView.this.m12032a(this.f11843h, this.f11842g);
            }
            TopScrollView.super.invalidate();
            mo4029a(true);
        }
    }

    /* access modifiers changed from: protected */
    public int getEmojiBtnWidth() {
        if (!mo8480e() || !mo8482m_() || !Engine.isInitialized()) {
            return 0;
        }
        C2934m i = Engine.getInstance().getWidgetManager().mo9651i();
        return i.mo9727m() + i.mo9725k();
    }

    /* access modifiers changed from: protected */
    public int getLeftPaddingWidth() {
        return getEmojiBtnWidth();
    }

    /* renamed from: i */
    public void mo8822i(int i) {
        int max = Math.max(10, i);
        this.f11819u = 0;
        this.f11820v = 255;
        this.f11821w = 100.0f;
        invalidate();
        m12033a(10, 255 / (max / 10), 130 / (max / 10), 20 / (max / 10));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m12033a(int i, int i2, int i3, int i4) {
        new Handler().postDelayed(new C2791cO(this, i2, i3, i4, i), (long) i);
    }
}
