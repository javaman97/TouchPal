package com.cootek.smartinput5.p066ui.control;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p001v4.p009e.p010a.C0230a;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1624bv;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.p049e.C1250a;
import com.cootek.smartinput5.p049e.C1252b;
import com.cootek.smartinput5.p066ui.C2787cK;
import com.cootek.smartinput5.p066ui.C2806cb;
import com.cootek.smartinput5.p066ui.C2915ds;
import com.cootek.smartinput5.p066ui.C2919e;
import com.cootek.smartinput5.p066ui.SlideSentenceMoveContrailView;
import com.emoji.keyboard.touchpal.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: com.cootek.smartinput5.ui.control.SlideSentenceView */
public class SlideSentenceView extends View implements C1252b.C1253a {

    /* renamed from: a */
    public static final boolean f12821a = false;

    /* renamed from: aA */
    private static int f12822aA = 0;

    /* renamed from: aB */
    private static final int f12823aB = 0;

    /* renamed from: aC */
    private static final int f12824aC = 1;

    /* renamed from: aD */
    private static final int f12825aD = 2;

    /* renamed from: aE */
    private static final int f12826aE = 3;

    /* renamed from: aF */
    private static final int f12827aF = 4;

    /* renamed from: aG */
    private static final int f12828aG = 5;

    /* renamed from: aH */
    private static final int f12829aH = 6;

    /* renamed from: ao */
    private static final int f12830ao = 2000;

    /* renamed from: ap */
    private static final int f12831ap = 1000;

    /* renamed from: t */
    private static final String f12832t = "SlideSentenceView";

    /* renamed from: u */
    private static final int f12833u = 0;

    /* renamed from: v */
    private static final int f12834v = 1;

    /* renamed from: w */
    private static final int f12835w = 2;

    /* renamed from: x */
    private static final int f12836x = 3;

    /* renamed from: y */
    private static final int f12837y = 4;

    /* renamed from: z */
    private static final int f12838z = 5;

    /* renamed from: A */
    private int f12839A;

    /* renamed from: B */
    private int f12840B;

    /* renamed from: C */
    private Context f12841C;

    /* renamed from: D */
    private SlideSentenceMoveContrailView f12842D;

    /* renamed from: E */
    private int f12843E;

    /* renamed from: F */
    private int f12844F;

    /* renamed from: G */
    private C2856c f12845G;

    /* renamed from: H */
    private C2856c f12846H;

    /* renamed from: I */
    private Paint f12847I;

    /* renamed from: J */
    private Paint f12848J;

    /* renamed from: K */
    private Paint f12849K;

    /* renamed from: L */
    private Paint f12850L;

    /* renamed from: M */
    private Paint f12851M;

    /* renamed from: N */
    private Paint f12852N;

    /* renamed from: O */
    private Paint f12853O;

    /* renamed from: P */
    private int f12854P;

    /* renamed from: Q */
    private int f12855Q;

    /* renamed from: R */
    private int f12856R;

    /* renamed from: S */
    private int f12857S;

    /* renamed from: T */
    private int f12858T;

    /* renamed from: U */
    private int f12859U;

    /* renamed from: V */
    private Rect f12860V;

    /* renamed from: W */
    private Rect f12861W;

    /* renamed from: X */
    private Path f12862X;

    /* renamed from: Y */
    private ArrayList<Point> f12863Y;

    /* renamed from: Z */
    private Point f12864Z;

    /* renamed from: aI */
    private Handler f12865aI = new C2839Q(this);

    /* renamed from: aa */
    private Point f12866aa;

    /* renamed from: ab */
    private HashSet<Point[]> f12867ab;

    /* renamed from: ac */
    private Point f12868ac;

    /* renamed from: ad */
    private Point f12869ad;

    /* renamed from: ae */
    private C2843b f12870ae;

    /* renamed from: af */
    private LinkedList<Point> f12871af;

    /* renamed from: ag */
    private LinkedList<Point> f12872ag;

    /* renamed from: ah */
    private ArrayList<C2843b> f12873ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public C2915ds f12874ai;

    /* renamed from: aj */
    private C1250a f12875aj;

    /* renamed from: ak */
    private ArrayList<CandidateItem> f12876ak;

    /* renamed from: al */
    private ArrayList<Object[]> f12877al;

    /* renamed from: am */
    private String f12878am;

    /* renamed from: an */
    private String f12879an;

    /* renamed from: aq */
    private C2919e f12880aq;

    /* renamed from: ar */
    private boolean f12881ar = false;

    /* renamed from: as */
    private boolean f12882as = true;

    /* renamed from: at */
    private boolean f12883at = false;
    /* access modifiers changed from: private */

    /* renamed from: au */
    public boolean f12884au = true;

    /* renamed from: av */
    private boolean f12885av = true;

    /* renamed from: aw */
    private boolean f12886aw = false;

    /* renamed from: ax */
    private boolean f12887ax = false;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public boolean f12888ay = false;

    /* renamed from: az */
    private int f12889az;

    /* renamed from: b */
    protected int f12890b;

    /* renamed from: c */
    protected float f12891c;

    /* renamed from: d */
    protected int f12892d;

    /* renamed from: e */
    protected int f12893e;

    /* renamed from: f */
    protected int f12894f;

    /* renamed from: g */
    protected int f12895g;

    /* renamed from: h */
    protected int f12896h;

    /* renamed from: i */
    protected int f12897i;

    /* renamed from: j */
    protected int f12898j;

    /* renamed from: k */
    protected int f12899k;

    /* renamed from: l */
    protected int f12900l;

    /* renamed from: m */
    protected int f12901m;

    /* renamed from: n */
    protected int f12902n;

    /* renamed from: o */
    protected int f12903o;

    /* renamed from: p */
    protected float f12904p;

    /* renamed from: q */
    protected float f12905q;

    /* renamed from: r */
    protected final int f12906r = 3;

    /* renamed from: s */
    protected int[] f12907s;

    public SlideSentenceView(Context context) {
        super(context);
        this.f12841C = context;
        this.f12876ak = new ArrayList<>();
        this.f12877al = new ArrayList<>();
        this.f12871af = new LinkedList<>();
        this.f12872ag = new LinkedList<>();
        this.f12873ah = new ArrayList<>();
        setVisibility(0);
        setBackgroundDrawable((Drawable) null);
        this.f12891c = getResources().getDisplayMetrics().density;
        this.f12890b = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.key_padding_outer_bottom);
        this.f12843E = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.slidesentence_text_text_size);
        this.f12844F = C1368X.m6320c().mo5841n().mo6265c((int) R.dimen.slidesentence_text_hint_text_size);
        m13093m();
        this.f12860V = new Rect();
        this.f12907s = new int[3];
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        this.f12845G.getFontMetricsInt(fontMetricsInt);
        this.f12892d = (fontMetricsInt.ascent + fontMetricsInt.descent) / 2;
        this.f12895g = (fontMetricsInt.bottom - fontMetricsInt.top) / 2;
        this.f12846H.getFontMetricsInt(fontMetricsInt);
        this.f12896h = (fontMetricsInt.bottom - fontMetricsInt.top) / 2;
        this.f12893e = this.f12896h;
        this.f12897i = this.f12896h;
        mo9389a();
        this.f12862X = new Path();
        this.f12864Z = new Point();
        this.f12866aa = new Point();
        m13099s();
        m13094n();
        this.f12874ai = new C2915ds(this.f12841C);
        this.f12868ac = new Point();
        this.f12869ad = new Point();
        this.f12842D = new SlideSentenceMoveContrailView(context);
    }

    /* renamed from: m */
    private void m13093m() {
        this.f12856R = C1368X.m6320c().mo5841n().mo6248a((int) R.color.candidate_default, C2787cK.CANDIDATE_HIGHLIGHT);
        this.f12855Q = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_blue_color);
        this.f12854P = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_hint_bg_color);
        this.f12859U = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_hint_underline_color);
        this.f12857S = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_pre_text_color);
        this.f12858T = C1368X.m6320c().mo5841n().mo6260b((int) R.color.wave_nor_text_color);
        this.f12848J = new Paint();
        this.f12848J.setStyle(Paint.Style.FILL);
        this.f12848J.setColor(this.f12854P);
        this.f12848J.setAntiAlias(true);
        this.f12849K = new Paint();
        this.f12849K.setStyle(Paint.Style.STROKE);
        this.f12849K.setColor(this.f12859U);
        this.f12849K.setAntiAlias(true);
        this.f12849K.setStrokeWidth(2.0f);
        this.f12847I = new Paint();
        this.f12847I.setColor(Color.argb(200, 0, 0, 0));
        this.f12845G = new C2856c(true);
        this.f12845G.setTypeface(C1624bv.m7418a());
        this.f12845G.setColor(this.f12858T);
        this.f12845G.setTextAlign(Paint.Align.CENTER);
        this.f12845G.setAntiAlias(true);
        this.f12845G.setTextSize((float) this.f12843E);
        this.f12846H = new C2856c(true);
        this.f12846H.set(this.f12845G);
        this.f12846H.setTextSize((float) this.f12844F);
        this.f12850L = new Paint();
        this.f12850L.setStyle(Paint.Style.STROKE);
        this.f12850L.setColor(this.f12854P);
        this.f12851M = new Paint();
        this.f12851M.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f12851M.setColor(-256);
        this.f12852N = new Paint();
        this.f12852N.setStyle(Paint.Style.STROKE);
        this.f12852N.setColor(C0230a.f588c);
        this.f12853O = new Paint();
        this.f12853O.setStyle(Paint.Style.FILL);
        this.f12853O.setColor(this.f12859U);
        this.f12853O.setAlpha(100);
        this.f12853O.setShadowLayer(4.0f, 0.0f, 0.0f, this.f12859U);
    }

    /* renamed from: n */
    private void m13094n() {
        this.f12880aq = new C2919e(this.f12841C, this, R.style.SlideSentenceTextAnimation, 400);
        this.f12880aq.mo9671a(this.f12856R, (float) this.f12843E);
    }

    /* renamed from: a */
    public void mo9389a() {
        this.f12860V.right = Engine.getInstance().getWidgetManager().mo9630ad().mo9262t();
        this.f12904p = (float) Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9134g();
        C2806cb b = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9182b("sk_sp");
        if (b != null) {
            this.f12860V.bottom = b.f12454y;
            this.f12861W = new Rect(b.f12453x, b.f12454y, b.f12453x + b.width, b.height + b.f12454y);
        } else {
            this.f12860V.bottom = 0;
            this.f12861W = new Rect();
        }
        this.f12898j = this.f12860V.right / 10;
        for (int i = 0; i < 3; i++) {
            C2806cb b2 = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9182b("sk_" + (i + 1) + "_2");
            if (b2 != null) {
                this.f12907s[i] = (b2.height / 2) + b2.f12454y;
            } else {
                this.f12907s[i] = -1;
            }
        }
        C2806cb b3 = Engine.getInstance().getWidgetManager().mo9648g().getKeyboard().mo9182b("sk_bk");
        if (b3 != null) {
            this.f12893e = (-b3.height) / 2;
            this.f12892d = (b3.height / 2) - ((this.f12895g * 5) / 4);
        }
        this.f12894f = this.f12893e;
        this.f12899k = this.f12860V.right / 2;
        this.f12900l = this.f12860V.bottom + 20;
    }

    public View getContrailView() {
        return this.f12842D;
    }

    public Rect getTipWordRect() {
        if (this.f12873ah == null || this.f12873ah.size() <= 0) {
            return null;
        }
        return this.f12873ah.get(0).f12925f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0776  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x075e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            super.onDraw(r18)
            r17.m13096p()
            r0 = r17
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r2 = r0.f12876ak
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0018
            r0 = r17
            com.cootek.smartinput5.ui.ds r2 = r0.f12874ai
            r2.mo9590c()
        L_0x0017:
            return
        L_0x0018:
            r0 = r17
            boolean r2 = r0.f12888ay
            if (r2 == 0) goto L_0x02ff
            android.graphics.Rect r2 = new android.graphics.Rect
            r0 = r17
            android.graphics.Rect r3 = r0.f12860V
            int r3 = r3.left
            r0 = r17
            android.graphics.Rect r4 = r0.f12860V
            int r4 = r4.top
            r0 = r17
            android.graphics.Rect r5 = r0.f12860V
            int r5 = r5.right
            r0 = r17
            android.graphics.Rect r6 = r0.f12861W
            int r6 = r6.bottom
            r2.<init>(r3, r4, r5, r6)
            r0 = r17
            android.graphics.Paint r3 = r0.f12847I
            r0 = r18
            r0.drawRect(r2, r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            java.lang.String r3 = "#104ebfff"
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setColor(r3)
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE
            r2.setStyle(r3)
            r0 = r17
            android.graphics.Rect r3 = r0.f12861W
            r0 = r18
            r0.drawRect(r3, r2)
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            com.cootek.smartinput5.func.X r2 = com.cootek.smartinput5.func.C1368X.m6320c()
            com.cootek.smartinput5.func.bh r2 = r2.mo5841n()
            r3 = 2131296778(0x7f09020a, float:1.8211482E38)
            int r8 = r2.mo6260b((int) r3)
            java.lang.String r2 = "#1b1b1b"
            int r11 = android.graphics.Color.parseColor(r2)
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            r0 = r17
            android.graphics.Rect r3 = r0.f12861W
            int r3 = r3.left
            float r3 = (float) r3
            r0 = r17
            android.graphics.Rect r4 = r0.f12861W
            int r4 = r4.top
            float r4 = (float) r4
            r0 = r17
            android.graphics.Rect r5 = r0.f12861W
            int r5 = r5.left
            float r5 = (float) r5
            r0 = r17
            android.graphics.Rect r6 = r0.f12861W
            int r6 = r6.bottom
            float r6 = (float) r6
            r7 = 3
            int[] r7 = new int[r7]
            r9 = 0
            r0 = r17
            int r12 = r0.f12855Q
            r7[r9] = r12
            r9 = 1
            r7[r9] = r8
            r8 = 2
            r7[r8] = r11
            r8 = 0
            android.graphics.Shader$TileMode r9 = android.graphics.Shader.TileMode.CLAMP
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3 = 1073741824(0x40000000, float:2.0)
            r10.setStrokeWidth(r3)
            r10.setShader(r2)
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.left
            float r3 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            float r4 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.left
            float r5 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.bottom
            float r6 = (float) r2
            r2 = r18
            r7 = r10
            r2.drawLine(r3, r4, r5, r6, r7)
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.right
            float r3 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            float r4 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.right
            float r5 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.bottom
            float r6 = (float) r2
            r2 = r18
            r7 = r10
            r2.drawLine(r3, r4, r5, r6, r7)
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r2 = 1073741824(0x40000000, float:2.0)
            r7.setStrokeWidth(r2)
            r0 = r17
            int r2 = r0.f12855Q
            r7.setColor(r2)
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.left
            float r3 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            float r4 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.right
            float r5 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            float r6 = (float) r2
            r2 = r18
            r2.drawLine(r3, r4, r5, r6, r7)
            r7.setColor(r11)
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.left
            float r3 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.bottom
            float r4 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.right
            float r5 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.bottom
            float r6 = (float) r2
            r2 = r18
            r2.drawLine(r3, r4, r5, r6, r7)
            r0 = r17
            android.content.Context r2 = r0.f12841C
            r3 = 2131625745(0x7f0e0711, float:1.8878707E38)
            java.lang.String r12 = com.cootek.smartinput5.func.resource.C1974m.m9063a((android.content.Context) r2, (int) r3)
            android.graphics.Paint r4 = new android.graphics.Paint
            r0 = r17
            com.cootek.smartinput5.ui.control.c r2 = r0.f12845G
            r4.<init>(r2)
            r2 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            r0 = r17
            int r5 = r0.f12843E
            double r6 = (double) r5
            double r2 = r2 * r6
            float r2 = (float) r2
            r4.setTextSize(r2)
            r0 = r17
            int r2 = r0.f12855Q
            r4.setColor(r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r2)
            android.graphics.Paint$FontMetricsInt r2 = new android.graphics.Paint$FontMetricsInt
            r2.<init>()
            r4.getFontMetricsInt(r2)
            int r3 = r2.ascent
            int r5 = r2.descent
            int r3 = r3 + r5
            int r11 = r3 / 2
            int r3 = r2.bottom
            int r2 = r2.top
            int r2 = r3 - r2
            int r8 = r2 / 2
            com.cootek.smartinput5.ui.control.SlideSentenceView$a r2 = new com.cootek.smartinput5.ui.control.SlideSentenceView$a
            r0 = r17
            android.graphics.Rect r3 = r0.f12861W
            int r5 = r3.centerX()
            r0 = r17
            android.graphics.Rect r3 = r0.f12861W
            int r6 = r3.centerY()
            float r7 = r4.measureText(r12)
            r9 = 0
            r10 = 0
            r3 = r17
            r2.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            int r3 = r2.f12912e
            float r3 = (float) r3
            int r2 = r2.f12913f
            float r2 = (float) r2
            r0 = r18
            r0.drawText(r12, r3, r2, r4)
            r0 = r17
            com.cootek.smartinput5.ui.ds r2 = r0.f12874ai
            r2.mo9592e()
        L_0x01c5:
            r0 = r17
            android.graphics.Paint r2 = r0.f12848J
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            float r4 = r0.f12905q
            float r3 = r3 - r4
            r4 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.setAlpha(r3)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r2 = r0.f12846H
            r0 = r17
            int r3 = r0.f12844F
            float r3 = (float) r3
            r0 = r17
            float r4 = r0.f12905q
            r0 = r17
            int r5 = r0.f12843E
            r0 = r17
            int r6 = r0.f12844F
            int r5 = r5 - r6
            float r5 = (float) r5
            float r4 = r4 * r5
            float r3 = r3 + r4
            r2.setTextSize(r3)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r2 = r0.f12846H
            r3 = 1132396544(0x437f0000, float:255.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r17
            float r5 = r0.f12905q
            float r4 = r4 - r5
            float r3 = r3 * r4
            int r3 = (int) r3
            r4 = 1132396544(0x437f0000, float:255.0)
            r0 = r17
            float r5 = r0.f12905q
            r6 = 1115422720(0x427c0000, float:63.0)
            float r5 = r5 * r6
            float r4 = r4 - r5
            int r4 = (int) r4
            r5 = 255(0xff, float:3.57E-43)
            int r3 = android.graphics.Color.rgb(r3, r4, r5)
            r2.setColor(r3)
            r0 = r17
            int r2 = r0.f12894f
            float r2 = (float) r2
            r0 = r17
            float r3 = r0.f12905q
            r0 = r17
            int r4 = r0.f12894f
            r0 = r17
            int r5 = r0.f12892d
            int r4 = r4 - r5
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 - r3
            int r2 = (int) r2
            r0 = r17
            r0.f12893e = r2
            r0 = r17
            int r2 = r0.f12897i
            float r2 = (float) r2
            r0 = r17
            float r3 = r0.f12905q
            r0 = r17
            int r4 = r0.f12895g
            r0 = r17
            int r5 = r0.f12897i
            int r4 = r4 - r5
            float r4 = (float) r4
            float r3 = r3 * r4
            float r2 = r2 + r3
            int r2 = (int) r2
            r0 = r17
            r0.f12896h = r2
            r0 = r17
            boolean r2 = r0.f12882as
            if (r2 == 0) goto L_0x02e7
            r0 = r17
            float r2 = r0.f12905q
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x02e7
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.left
            r0 = r17
            int r3 = r0.f12890b
            int r2 = r2 + r3
            float r3 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            r0 = r17
            int r4 = r0.f12890b
            int r2 = r2 + r4
            float r4 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.right
            r0 = r17
            int r5 = r0.f12890b
            int r2 = r2 - r5
            float r5 = (float) r2
            r0 = r17
            android.graphics.Rect r2 = r0.f12861W
            int r2 = r2.top
            r0 = r17
            int r6 = r0.f12890b
            int r2 = r2 + r6
            float r6 = (float) r2
            r0 = r17
            android.graphics.Paint r7 = r0.f12849K
            r2 = r18
            r2.drawLine(r3, r4, r5, r6, r7)
            r0 = r17
            float r2 = r0.f12905q
            r0 = r17
            android.graphics.Rect r3 = r0.f12861W
            int r3 = r3.height()
            float r3 = (float) r3
            float r2 = r2 * r3
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r0 = r17
            android.graphics.Rect r4 = r0.f12861W
            int r4 = r4.left
            r0 = r17
            int r5 = r0.f12890b
            int r4 = r4 + r5
            float r4 = (float) r4
            r0 = r17
            android.graphics.Rect r5 = r0.f12861W
            int r5 = r5.top
            r0 = r17
            int r6 = r0.f12890b
            int r5 = r5 + r6
            float r5 = (float) r5
            float r5 = r5 - r2
            r0 = r17
            android.graphics.Rect r6 = r0.f12861W
            int r6 = r6.right
            r0 = r17
            int r7 = r0.f12890b
            int r6 = r6 - r7
            float r6 = (float) r6
            r0 = r17
            android.graphics.Rect r7 = r0.f12861W
            int r7 = r7.top
            r0 = r17
            int r8 = r0.f12890b
            int r7 = r7 + r8
            float r7 = (float) r7
            float r2 = r2 + r7
            r3.<init>(r4, r5, r6, r2)
            r4 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            r6 = 1
            r0 = r17
            android.graphics.Paint r7 = r0.f12853O
            r2 = r18
            r2.drawArc(r3, r4, r5, r6, r7)
        L_0x02e7:
            r3 = 0
            r2 = 0
            r14 = r2
            r15 = r3
        L_0x02eb:
            r0 = r17
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r2 = r0.f12876ak
            int r2 = r2.size()
            if (r14 >= r2) goto L_0x02f8
            r2 = 4
            if (r15 < r2) goto L_0x0308
        L_0x02f8:
            r2 = 1
            r0 = r17
            r0.f12885av = r2
            goto L_0x0017
        L_0x02ff:
            r0 = r17
            com.cootek.smartinput5.ui.ds r2 = r0.f12874ai
            r2.mo9590c()
            goto L_0x01c5
        L_0x0308:
            r0 = r17
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r2 = r0.f12876ak
            java.lang.Object r2 = r2.get(r14)
            r13 = r2
            com.cootek.smartinput5.engine.CandidateItem r13 = (com.cootek.smartinput5.engine.CandidateItem) r13
            r0 = r17
            boolean r2 = r0.f12882as
            if (r2 == 0) goto L_0x032d
            int r2 = r13.f4013y
            r0 = r17
            int[] r3 = r0.f12907s
            r4 = 2
            r3 = r3[r4]
            if (r2 != r3) goto L_0x032d
            r0 = r17
            int[] r2 = r0.f12907s
            r3 = 1
            r2 = r2[r3]
            r13.f4013y = r2
        L_0x032d:
            com.cootek.smartinput5.ui.control.SlideSentenceView$a r2 = new com.cootek.smartinput5.ui.control.SlideSentenceView$a
            r0 = r17
            com.cootek.smartinput5.ui.control.c r4 = r0.f12845G
            int r5 = r13.f4012x
            int r6 = r13.f4013y
            r0 = r17
            com.cootek.smartinput5.ui.control.c r3 = r0.f12845G
            java.lang.String r7 = r13.word
            int r3 = com.cootek.smartinput5.p066ui.control.C2829G.m12928a((android.graphics.Paint) r3, (java.lang.CharSequence) r7)
            float r7 = (float) r3
            r0 = r17
            int r8 = r0.f12895g
            r9 = 10
            r0 = r17
            int r10 = r0.f12898j
            r0 = r17
            int r11 = r0.f12892d
            r3 = r17
            r2.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.cootek.smartinput5.ui.control.SlideSentenceView$a r3 = new com.cootek.smartinput5.ui.control.SlideSentenceView$a
            r0 = r17
            com.cootek.smartinput5.ui.control.c r5 = r0.f12846H
            int r6 = r13.f4012x
            int r7 = r13.f4013y
            r0 = r17
            com.cootek.smartinput5.ui.control.c r4 = r0.f12846H
            java.lang.String r8 = r13.word
            int r4 = com.cootek.smartinput5.p066ui.control.C2829G.m12928a((android.graphics.Paint) r4, (java.lang.CharSequence) r8)
            float r8 = (float) r4
            r0 = r17
            int r9 = r0.f12896h
            r10 = 4
            r0 = r17
            int r11 = r0.f12898j
            r0 = r17
            int r12 = r0.f12893e
            r4 = r17
            r3.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r17
            java.lang.String r4 = r0.f12879an
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0508
            java.lang.String r4 = r13.word
            java.lang.String r4 = r4.toLowerCase()
            r0 = r17
            java.lang.String r5 = r0.f12879an
            java.lang.String r5 = r5.toLowerCase()
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x0508
            r4 = 1
            r10 = r4
        L_0x039c:
            r5 = 0
            r4 = 0
            r6 = r5
            r5 = r4
        L_0x03a0:
            android.graphics.Rect r4 = r2.f12916i
            r0 = r17
            android.graphics.Rect r12 = r0.m13073b((android.graphics.Rect) r4)
            android.graphics.Rect r4 = r3.f12916i
            r0 = r17
            android.graphics.Rect r16 = r0.m13082c((android.graphics.Rect) r4)
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r7 = 2
            r4 = r4[r7]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x077a
            r0 = r17
            java.util.ArrayList<com.cootek.smartinput5.ui.control.SlideSentenceView$b> r4 = r0.f12873ah
            java.util.Iterator r7 = r4.iterator()
        L_0x03cd:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0403
            java.lang.Object r4 = r7.next()
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r4 = (com.cootek.smartinput5.p066ui.control.SlideSentenceView.C2843b) r4
            android.graphics.Rect r4 = r4.f12924e
            r0 = r17
            boolean r8 = r0.m13071a((android.graphics.Rect) r4, (android.graphics.Rect) r12)
            if (r8 == 0) goto L_0x03f1
            r0 = r17
            boolean r8 = r0.f12882as
            if (r8 != 0) goto L_0x03cd
            r0 = r17
            boolean r4 = r0.m13078b((android.graphics.Rect) r4, (android.graphics.Rect) r12)
            if (r4 != 0) goto L_0x03cd
        L_0x03f1:
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r7 = 1
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4[r7] = r8
        L_0x0403:
            if (r5 == 0) goto L_0x077a
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 1
            r4 = r4[r5]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x050c
            r4 = 1
        L_0x041b:
            r11 = r4
        L_0x041c:
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 1
            r4 = r4[r5]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0776
            r0 = r17
            boolean r4 = r0.f12882as
            if (r4 != 0) goto L_0x050f
            r0 = r17
            android.graphics.Point r4 = r0.f12864Z
            r0 = r17
            android.graphics.Point r5 = r0.f12866aa
            r0 = r17
            boolean r4 = r0.m13070a((android.graphics.Point) r4, (android.graphics.Point) r5, (android.graphics.Rect) r12)
            if (r4 == 0) goto L_0x050f
            r0 = r17
            boolean r4 = r0.f12884au
            if (r4 != 0) goto L_0x0462
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r4 = r4[r5]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x050f
        L_0x0462:
            int r4 = r13.index
            java.lang.String r5 = r13.word
            android.graphics.Rect r6 = r2.f12916i
            r0 = r17
            r0.m13058a((int) r4, (java.lang.String) r5, (android.graphics.Rect) r6)
            r0 = r17
            r1 = r16
            r0.m13059a((android.graphics.Rect) r12, (android.graphics.Rect) r1, (com.cootek.smartinput5.engine.CandidateItem) r13)
            int r15 = r15 + 1
            r7 = r11
            r6 = r15
        L_0x0478:
            if (r7 == 0) goto L_0x075e
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 1
            r8 = 1
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r4[r5] = r8
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r8 = 3
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r5 = r0.f12877al
            java.lang.Object r5 = r5.get(r14)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r9 = 3
            r5 = r5[r9]
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            int r5 = r13.f4013y
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r8 = 3
            r4 = r4[r8]
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = r17
            int r4 = r0.m13081c(r5, r4)
            r5 = -1
            if (r4 != r5) goto L_0x0755
            r2.mo9407a()
            r0 = r17
            r1 = r16
            r0.m13059a((android.graphics.Rect) r12, (android.graphics.Rect) r1, (com.cootek.smartinput5.engine.CandidateItem) r13)
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r2 = r0.f12877al
            java.lang.Object r2 = r2.get(r14)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 2
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r4
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r2 = r0.f12877al
            java.lang.Object r2 = r2.get(r14)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 1
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r4
        L_0x0502:
            int r2 = r14 + 1
            r14 = r2
            r15 = r6
            goto L_0x02eb
        L_0x0508:
            r4 = 0
            r10 = r4
            goto L_0x039c
        L_0x050c:
            r4 = 0
            goto L_0x041b
        L_0x050f:
            r0 = r17
            android.graphics.Rect r4 = r0.m13054a((android.graphics.Rect) r12)
            r0 = r17
            int r5 = r0.f12839A
            r0 = r17
            int r6 = r0.f12840B
            boolean r4 = r4.contains(r5, r6)
            if (r4 != 0) goto L_0x068e
            r0 = r17
            r1 = r16
            r0.m13059a((android.graphics.Rect) r12, (android.graphics.Rect) r1, (com.cootek.smartinput5.engine.CandidateItem) r13)
            r0 = r17
            boolean r4 = r0.f12882as
            if (r4 == 0) goto L_0x064b
            android.graphics.RectF r4 = new android.graphics.RectF
            android.graphics.Rect r5 = r3.f12916i
            r4.<init>(r5)
            r5 = 1077936128(0x40400000, float:3.0)
            r6 = 1077936128(0x40400000, float:3.0)
            r0 = r17
            android.graphics.Paint r7 = r0.f12848J
            r0 = r18
            r0.drawRoundRect(r4, r5, r6, r7)
            r0 = r17
            float r4 = r0.f12905q
            r5 = 1088421888(0x40e00000, float:7.0)
            float r4 = r4 * r5
            int r4 = (int) r4
            android.graphics.RectF r5 = new android.graphics.RectF
            android.graphics.Rect r6 = r3.f12916i
            int r6 = r6.left
            r0 = r17
            int r7 = r0.f12898j
            int r7 = r7 / 5
            int r6 = r6 + r7
            float r6 = (float) r6
            android.graphics.Rect r7 = r3.f12916i
            int r7 = r7.bottom
            int r7 = r7 - r4
            float r7 = (float) r7
            android.graphics.Rect r8 = r3.f12916i
            int r8 = r8.right
            r0 = r17
            int r9 = r0.f12898j
            int r9 = r9 / 5
            int r8 = r8 - r9
            float r8 = (float) r8
            android.graphics.Rect r9 = r3.f12916i
            int r9 = r9.bottom
            int r4 = r4 + r9
            float r4 = (float) r4
            r5.<init>(r6, r7, r8, r4)
            r6 = 0
            r7 = -1020002304(0xffffffffc3340000, float:-180.0)
            r8 = 1
            r0 = r17
            android.graphics.Paint r9 = r0.f12853O
            r4 = r18
            r4.drawArc(r5, r6, r7, r8, r9)
            android.graphics.Rect r4 = r3.f12916i
            int r4 = r4.left
            float r5 = (float) r4
            android.graphics.Rect r4 = r3.f12916i
            int r4 = r4.bottom
            float r6 = (float) r4
            android.graphics.Rect r4 = r3.f12916i
            int r4 = r4.right
            float r7 = (float) r4
            android.graphics.Rect r4 = r3.f12916i
            int r4 = r4.bottom
            float r8 = (float) r4
            r0 = r17
            android.graphics.Paint r9 = r0.f12849K
            r4 = r18
            r4.drawLine(r5, r6, r7, r8, r9)
            if (r10 == 0) goto L_0x0639
            java.lang.String r4 = r13.word
            r5 = 0
            r0 = r17
            java.lang.String r6 = r0.f12879an
            int r6 = r6.length()
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r5 = r13.word
            r0 = r17
            java.lang.String r6 = r0.f12879an
            int r6 = r6.length()
            java.lang.String r7 = r13.word
            int r7 = r7.length()
            java.lang.String r5 = r5.substring(r6, r7)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r6 = r0.f12846H
            int r6 = com.cootek.smartinput5.p066ui.control.C2829G.m12928a((android.graphics.Paint) r6, (java.lang.CharSequence) r4)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r7 = r0.f12846H
            int r7 = com.cootek.smartinput5.p066ui.control.C2829G.m12928a((android.graphics.Paint) r7, (java.lang.CharSequence) r5)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r8 = r0.f12846H
            r0 = r17
            int r9 = r0.f12857S
            r8.setColor(r9)
            int r8 = r3.f12912e
            int r7 = r7 / 2
            int r7 = r8 - r7
            float r7 = (float) r7
            int r8 = r3.f12913f
            float r8 = (float) r8
            r0 = r17
            com.cootek.smartinput5.ui.control.c r9 = r0.f12846H
            r0 = r18
            r0.drawText(r4, r7, r8, r9)
            r0 = r17
            com.cootek.smartinput5.ui.control.c r4 = r0.f12846H
            r0 = r17
            int r7 = r0.f12858T
            r4.setColor(r7)
            int r4 = r3.f12912e
            int r6 = r6 / 2
            int r4 = r4 + r6
            float r4 = (float) r4
            int r6 = r3.f12913f
            float r6 = (float) r6
            r0 = r17
            com.cootek.smartinput5.ui.control.c r7 = r0.f12846H
            r0 = r18
            r0.drawText(r5, r4, r6, r7)
        L_0x060f:
            int r15 = r15 + 1
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r5] = r6
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 4
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r5] = r6
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x0639:
            java.lang.String r4 = r13.word
            int r5 = r3.f12912e
            float r5 = (float) r5
            int r6 = r3.f12913f
            float r6 = (float) r6
            r0 = r17
            com.cootek.smartinput5.ui.control.c r7 = r0.f12846H
            r0 = r18
            r0.drawText(r4, r5, r6, r7)
            goto L_0x060f
        L_0x064b:
            android.graphics.RectF r4 = new android.graphics.RectF
            android.graphics.Rect r5 = r2.f12916i
            r4.<init>(r5)
            r5 = 1084227584(0x40a00000, float:5.0)
            r6 = 1084227584(0x40a00000, float:5.0)
            r0 = r17
            android.graphics.Paint r7 = r0.f12848J
            r0 = r18
            r0.drawRoundRect(r4, r5, r6, r7)
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.left
            float r5 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.bottom
            float r6 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.right
            float r7 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.bottom
            float r8 = (float) r4
            r0 = r17
            android.graphics.Paint r9 = r0.f12849K
            r4 = r18
            r4.drawLine(r5, r6, r7, r8, r9)
            java.lang.String r4 = r13.word
            int r5 = r2.f12912e
            float r5 = (float) r5
            int r6 = r2.f12913f
            float r6 = (float) r6
            r0 = r17
            com.cootek.smartinput5.ui.control.c r7 = r0.f12845G
            r0 = r18
            r0.drawText(r4, r5, r6, r7)
            goto L_0x060f
        L_0x068e:
            r0 = r17
            int r4 = r0.f12839A
            r0 = r17
            int r5 = r0.f12840B
            boolean r4 = r12.contains(r4, r5)
            if (r4 == 0) goto L_0x06d4
            r0 = r17
            boolean r4 = r0.f12884au
            if (r4 != 0) goto L_0x06b7
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r4 = r4[r5]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x06cf
        L_0x06b7:
            int r4 = r13.index
            java.lang.String r5 = r13.word
            android.graphics.Rect r6 = r2.f12916i
            r0 = r17
            r0.m13058a((int) r4, (java.lang.String) r5, (android.graphics.Rect) r6)
            r0 = r17
            r1 = r16
            r0.m13059a((android.graphics.Rect) r12, (android.graphics.Rect) r1, (com.cootek.smartinput5.engine.CandidateItem) r13)
            int r15 = r15 + 1
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x06cf:
            r11 = 1
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x06d4:
            r0 = r17
            boolean r4 = r0.f12882as
            if (r4 != 0) goto L_0x0750
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r4 = r4[r5]
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0750
            r0 = r17
            r1 = r16
            r0.m13059a((android.graphics.Rect) r12, (android.graphics.Rect) r1, (com.cootek.smartinput5.engine.CandidateItem) r13)
            android.graphics.RectF r4 = new android.graphics.RectF
            android.graphics.Rect r5 = r2.f12916i
            r4.<init>(r5)
            r5 = 1084227584(0x40a00000, float:5.0)
            r6 = 1084227584(0x40a00000, float:5.0)
            r0 = r17
            android.graphics.Paint r7 = r0.f12848J
            r0 = r18
            r0.drawRoundRect(r4, r5, r6, r7)
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.left
            float r5 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.bottom
            float r6 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.right
            float r7 = (float) r4
            android.graphics.Rect r4 = r2.f12916i
            int r4 = r4.bottom
            float r8 = (float) r4
            r0 = r17
            android.graphics.Paint r9 = r0.f12849K
            r4 = r18
            r4.drawLine(r5, r6, r7, r8, r9)
            java.lang.String r4 = r13.word
            int r5 = r2.f12912e
            float r5 = (float) r5
            int r6 = r2.f12913f
            float r6 = (float) r6
            r0 = r17
            com.cootek.smartinput5.ui.control.c r7 = r0.f12845G
            r0 = r18
            r0.drawText(r4, r5, r6, r7)
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r4 = r0.f12877al
            java.lang.Object r4 = r4.get(r14)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 4
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r5] = r6
            int r15 = r15 + 1
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x0750:
            r11 = 1
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x0755:
            r2.mo9408a(r4)
            r4 = 1
            r5 = r4
            r15 = r6
            r6 = r7
            goto L_0x03a0
        L_0x075e:
            int r2 = r2.f12908a
            r13.f4013y = r2
            r0 = r17
            java.util.ArrayList<java.lang.Object[]> r2 = r0.f12877al
            java.lang.Object r2 = r2.get(r14)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 2
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2[r3] = r4
            goto L_0x0502
        L_0x0776:
            r7 = r11
            r6 = r15
            goto L_0x0478
        L_0x077a:
            r11 = r6
            goto L_0x041c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.control.SlideSentenceView.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13056a(int i) {
        Engine.getInstance().fireConfirmCandidateOperation(i);
        Engine.getInstance().processEvent();
    }

    /* renamed from: b */
    private void m13074b(int i) {
        Message obtainMessage = this.f12865aI.obtainMessage(3);
        obtainMessage.arg1 = i;
        this.f12865aI.sendMessage(obtainMessage);
    }

    /* renamed from: a */
    private void m13058a(int i, String str, Rect rect) {
        Message obtainMessage = this.f12865aI.obtainMessage(0);
        obtainMessage.arg1 = i;
        obtainMessage.arg2 = f12822aA;
        obtainMessage.obj = new Object[]{str, rect};
        this.f12878am = str;
        this.f12865aI.removeMessages(0);
        this.f12865aI.sendMessage(obtainMessage);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13057a(int i, int i2, String str) {
        this.f12889az++;
        switch (i2) {
            case 0:
                Engine.getInstance().fireConfirmNextwordOperation(i);
                break;
            case 1:
                Engine.getInstance().fireConfirmNextphraseOperation(i);
                break;
            case 2:
                Engine.getInstance().fireConfirmCandidateOperation(i);
                break;
        }
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN)) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN, false);
        } else if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_CONTINUE_SLIDE) && this.f12889az > 1) {
            Settings.getInstance().setBoolSetting(Settings.SHOW_WAVE_TIP_CONTINUE_SLIDE, false);
        }
        if (Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_CONTINUE_SLIDE)) {
            this.f12874ai.mo9591d();
        }
        Engine.getInstance().processEvent();
        Engine.getInstance().feedback();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m13095o() {
        Engine.getInstance().fireRetrieveNextwordOperation();
        Engine.getInstance().processEvent();
    }

    /* renamed from: a */
    private void m13059a(Rect rect, Rect rect2, CandidateItem candidateItem) {
        this.f12873ah.add(new C2843b(candidateItem, rect, rect2));
    }

    /* renamed from: p */
    private void m13096p() {
        this.f12873ah.clear();
    }

    /* renamed from: c */
    private int m13081c(int i, int i2) {
        if (i2 > 2) {
            return -1;
        }
        if (i == this.f12907s[0]) {
            if (i2 == 1) {
                return this.f12907s[1];
            }
            return -1;
        } else if (i != this.f12907s[2]) {
            for (int i3 = 1; i3 < 2; i3++) {
                if (i == this.f12907s[i3]) {
                    if (i2 == 1) {
                        return this.f12907s[i3 - 1];
                    }
                    if (i2 == 2) {
                        return this.f12907s[i3 + 1];
                    }
                }
            }
            return -1;
        } else if (i2 == 1) {
            return this.f12907s[1];
        } else {
            return -1;
        }
    }

    /* renamed from: a */
    private void m13066a(ArrayList<CandidateItem> arrayList, int i, int i2) {
        if (this.f12875aj == null) {
            this.f12875aj = new C1250a(this.f12841C);
        }
        this.f12875aj.mo4607a(arrayList, i, i2);
    }

    /* renamed from: q */
    private void m13097q() {
        if (this.f12875aj != null) {
            this.f12875aj.mo4606a();
        }
    }

    /* renamed from: d */
    private boolean m13085d(int i, int i2) {
        if (this.f12875aj != null) {
            return this.f12875aj.mo4608a(i, i2);
        }
        return false;
    }

    private CandidateItem getSelectedNextwordPopupCandidateItem() {
        if (this.f12875aj != null) {
            return this.f12875aj.mo4609b();
        }
        return null;
    }

    private Rect getSelectedNextwordPopupRect() {
        if (this.f12875aj != null) {
            return this.f12875aj.mo4610c();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m13086e(int i, int i2) {
        if (i + i2 >= this.f12860V.right) {
            return this.f12860V.right - i2;
        }
        if (i > i2) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public boolean mo9392b() {
        return this.f12881ar && !this.f12882as;
    }

    /* renamed from: c */
    public void mo9394c() {
        mo9391a(this.f12882as);
    }

    /* renamed from: a */
    public void mo9391a(boolean z) {
        if (this.f12881ar && this.f12882as && !z) {
            this.f12883at = true;
        }
        if (z || this.f12883at) {
            m13088f(this.f12899k, this.f12900l);
        }
        this.f12881ar = true;
        this.f12882as = z;
        if (this.f12883at) {
            invalidate();
        }
    }

    /* renamed from: r */
    private void m13098r() {
        this.f12905q = 0.0f;
        m13101u();
        m13099s();
        m13100t();
    }

    /* renamed from: d */
    public void mo9395d() {
        if (this.f12881ar) {
            this.f12842D.mo8682a();
            this.f12881ar = false;
            this.f12882as = true;
            this.f12883at = false;
            this.f12884au = true;
            this.f12905q = 0.0f;
            m13097q();
            this.f12880aq.mo9670a();
            m13101u();
            m13099s();
            m13100t();
            this.f12876ak.clear();
            this.f12877al.clear();
        }
    }

    /* renamed from: e */
    public void mo9396e() {
        this.f12875aj = null;
        this.f12880aq.mo9676b();
        this.f12874ai.mo9589b();
    }

    /* renamed from: f */
    private void m13088f(int i, int i2) {
        this.f12839A = i;
        this.f12840B = i2;
    }

    /* renamed from: g */
    private void m13090g(int i, int i2) {
        if (this.f12866aa.x == -1 || this.f12866aa.y == -1 || this.f12864Z.x == -1 || this.f12864Z.y == -1) {
            this.f12864Z.set(i, i2);
            this.f12866aa.set(i, i2);
        }
        if (this.f12885av) {
            this.f12864Z.set(this.f12866aa.x, this.f12866aa.y);
            this.f12885av = false;
        }
        this.f12866aa.set(i, i2);
    }

    /* renamed from: s */
    private void m13099s() {
        this.f12864Z.set(-1, -1);
        this.f12866aa.set(-1, -1);
        this.f12885av = true;
    }

    /* renamed from: h */
    private void m13091h(int i, int i2) {
        if (this.f12868ac.x == 0 && this.f12868ac.y == 0 && this.f12869ad.x == 0 && this.f12869ad.y == 0) {
            this.f12868ac.set(i, i2);
            this.f12869ad.set(i, i2);
        }
        this.f12868ac.set(this.f12869ad.x, this.f12869ad.y);
        this.f12869ad.set(i, i2);
        this.f12901m = m13051a(this.f12868ac, this.f12869ad);
        this.f12903o = this.f12869ad.y - this.f12868ac.y;
        this.f12902n += this.f12901m;
    }

    /* renamed from: t */
    private void m13100t() {
        this.f12868ac.set(0, 0);
        this.f12869ad.set(0, 0);
        this.f12901m = 0;
        this.f12902n = 0;
        this.f12903o = 0;
        this.f12886aw = false;
        this.f12870ae = null;
    }

    /* renamed from: i */
    private void m13092i(int i, int i2) {
        if (this.f12862X.isEmpty()) {
            this.f12862X.moveTo((float) i, (float) i2);
        }
        this.f12862X.lineTo((float) i, (float) i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m13101u() {
        this.f12862X.reset();
        this.f12871af.clear();
        this.f12872ag.clear();
    }

    /* renamed from: f */
    public void mo9397f() {
        this.f12865aI.removeMessages(2);
        this.f12865aI.sendEmptyMessage(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m13102v() {
        int intSetting;
        if (!TextUtils.isEmpty(this.f12878am)) {
            mo9395d();
            String str = new String(this.f12878am);
            this.f12878am = "";
            this.f12889az = 0;
            Engine.getInstance().fireCommitOperation(str);
            Engine.getInstance().processEvent();
            if (C1252b.f4005j && (intSetting = Settings.getInstance().getIntSetting(Settings.SHOW_WAVE_QUICK_SLIDE_TIPS_TIMES)) > 0 && !Settings.getInstance().getBoolSetting(31)) {
                Toast.makeText(this.f12841C, C1974m.m9063a(this.f12841C, (int) R.string.wave_tips_quick_slide), 1).show();
                Settings.getInstance().setIntSetting(Settings.SHOW_WAVE_QUICK_SLIDE_TIPS_TIMES, intSetting - 1);
                C1252b.f4005j = false;
            }
        }
    }

    /* renamed from: g */
    public void mo9398g() {
        this.f12865aI.removeMessages(1);
        this.f12865aI.sendEmptyMessage(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m13103w() {
        Engine.getInstance().fireClearNextwordOperation();
        Engine.getInstance().processEvent();
    }

    /* renamed from: a */
    public void mo9390a(int i, int i2) {
        CandidateItem selectedNextwordPopupCandidateItem;
        if (!this.f12883at) {
            m13088f(i, i2);
            m13092i(i, i2);
            m13090g(i, i2);
            if (m13085d(i, i2) && (selectedNextwordPopupCandidateItem = getSelectedNextwordPopupCandidateItem()) != null) {
                m13058a(selectedNextwordPopupCandidateItem.index, selectedNextwordPopupCandidateItem.word, getSelectedNextwordPopupRect());
            }
        } else {
            this.f12883at = false;
            this.f12905q = 0.0f;
        }
        if (this.f12881ar) {
            this.f12842D.mo8683a((float) i, (float) i2);
        }
        invalidate();
    }

    /* renamed from: h */
    public boolean mo9401h() {
        if (!Engine.getInstance().isMultitouch && mo9404k() && ((double) this.f12905q) > 0.3d && !Engine.getInstance().getWidgetManager().mo9646f().f12547T.mo9208a(3)) {
            m13058a(this.f12870ae.f12920a, this.f12870ae.f12923d, this.f12870ae.f12924e);
        }
        this.f12865aI.removeMessages(5);
        this.f12874ai.mo9589b();
        m13098r();
        if (!TextUtils.isEmpty(this.f12878am)) {
            mo9397f();
            return true;
        }
        this.f12889az = 0;
        invalidate();
        return false;
    }

    /* renamed from: i */
    public void mo9402i() {
        this.f12887ax = true;
        mo9395d();
    }

    /* renamed from: j */
    public void mo9403j() {
        this.f12887ax = false;
    }

    /* renamed from: b */
    private void m13076b(String str) {
        this.f12865aI.removeMessages(5);
        Message obtainMessage = this.f12865aI.obtainMessage(5);
        obtainMessage.obj = str;
        this.f12865aI.sendMessageDelayed(obtainMessage, 1000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9393b(int r11, int r12) {
        /*
            r10 = this;
            r9 = 215(0xd7, float:3.01E-43)
            r4 = 1
            r3 = 0
            boolean r0 = r10.f12881ar
            if (r0 == 0) goto L_0x0024
            boolean r0 = r10.f12882as
            if (r0 == 0) goto L_0x0024
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r0 = r10.f12876ak
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0024
            int r0 = r10.f12903o
            if (r0 >= 0) goto L_0x0025
            int r0 = r10.f12902n
            float r0 = (float) r0
            float r1 = r10.f12904p
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0025
            r10.mo9395d()
        L_0x0024:
            return r3
        L_0x0025:
            r10.m13091h(r11, r12)
            android.os.Handler r0 = r10.f12865aI
            r1 = 4
            r0.removeMessages(r1)
            boolean r0 = r10.f12886aw
            if (r0 != 0) goto L_0x00de
            java.util.LinkedList<android.graphics.Point> r0 = r10.f12871af
            int r0 = r10.m13053a((java.util.LinkedList<android.graphics.Point>) r0)
            r1 = 70
            if (r0 >= r1) goto L_0x0024
            android.graphics.Rect r0 = r10.f12861W
            boolean r0 = r0.contains(r11, r12)
            if (r0 != 0) goto L_0x0024
            java.util.LinkedList<android.graphics.Point> r0 = r10.f12871af
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r11, r12)
            r0.offer(r1)
            java.util.LinkedList<android.graphics.Point> r0 = r10.f12871af
            java.lang.Object r0 = r0.getFirst()
            android.graphics.Point r0 = (android.graphics.Point) r0
            java.util.LinkedList<android.graphics.Point> r1 = r10.f12871af
            java.lang.Object r1 = r1.getLast()
            android.graphics.Point r1 = (android.graphics.Point) r1
            java.util.ArrayList<com.cootek.smartinput5.ui.control.SlideSentenceView$b> r2 = r10.f12873ah
            java.util.Iterator r5 = r2.iterator()
        L_0x0064:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r5.next()
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r2 = (com.cootek.smartinput5.p066ui.control.SlideSentenceView.C2843b) r2
            android.graphics.Rect r6 = r2.f12925f
            int r7 = r0.x
            int r8 = r0.y
            boolean r6 = r6.contains(r7, r8)
            if (r6 != 0) goto L_0x0090
            android.graphics.Rect r6 = r2.f12925f
            int r7 = r1.x
            int r8 = r1.y
            boolean r6 = r6.contains(r7, r8)
            if (r6 != 0) goto L_0x0090
            android.graphics.Rect r6 = r2.f12925f
            boolean r6 = r10.m13070a((android.graphics.Point) r0, (android.graphics.Point) r1, (android.graphics.Rect) r6)
            if (r6 == 0) goto L_0x0064
        L_0x0090:
            r10.f12870ae = r2
            r10.f12886aw = r4
            r1 = r3
        L_0x0095:
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r0 = r10.f12876ak
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00c3
            java.util.ArrayList<com.cootek.smartinput5.engine.CandidateItem> r0 = r10.f12876ak
            java.lang.Object r0 = r0.get(r1)
            com.cootek.smartinput5.engine.CandidateItem r0 = (com.cootek.smartinput5.engine.CandidateItem) r0
            java.lang.String r0 = r0.word
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r2 = r10.f12870ae
            java.lang.String r2 = r2.f12923d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00bf
            java.util.ArrayList<java.lang.Object[]> r0 = r10.f12877al
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0[r4] = r2
        L_0x00bf:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0095
        L_0x00c3:
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r9)
            if (r0 == 0) goto L_0x0024
            com.cootek.smartinput5.ui.ds r0 = r10.f12874ai
            boolean r0 = r0.mo9593f()
            if (r0 != 0) goto L_0x0024
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r0 = r10.f12870ae
            java.lang.String r0 = r0.f12923d
            r10.m13076b((java.lang.String) r0)
            goto L_0x0024
        L_0x00de:
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r0 = r10.f12870ae
            if (r0 == 0) goto L_0x0024
            com.cootek.smartinput5.engine.Settings r0 = com.cootek.smartinput5.engine.Settings.getInstance()
            boolean r0 = r0.getBoolSetting(r9)
            if (r0 == 0) goto L_0x0101
            com.cootek.smartinput5.ui.ds r0 = r10.f12874ai
            boolean r0 = r0.mo9593f()
            if (r0 != 0) goto L_0x0101
            int r0 = r10.f12901m
            r1 = 10
            if (r0 <= r1) goto L_0x0101
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r0 = r10.f12870ae
            java.lang.String r0 = r0.f12923d
            r10.m13076b((java.lang.String) r0)
        L_0x0101:
            android.graphics.Rect r0 = r10.f12861W
            boolean r0 = r0.contains(r11, r12)
            if (r0 == 0) goto L_0x013c
            int r0 = f12822aA
            r1 = 2
            if (r0 == r1) goto L_0x0127
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            int r0 = r0.getDefaultCandidateItemIndex()
            r1 = -1
            if (r0 == r1) goto L_0x0127
            com.cootek.smartinput5.engine.Engine r1 = com.cootek.smartinput5.engine.Engine.getInstance()
            int r1 = r1.getCandidateItemSource(r0)
            r2 = 6
            if (r1 == r2) goto L_0x0127
            r10.m13074b((int) r0)
        L_0x0127:
            r10.mo9391a((boolean) r3)
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r0 = r10.f12870ae
            int r0 = r0.f12920a
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r1 = r10.f12870ae
            java.lang.String r1 = r1.f12923d
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r2 = r10.f12870ae
            android.graphics.Rect r2 = r2.f12924e
            r10.m13058a((int) r0, (java.lang.String) r1, (android.graphics.Rect) r2)
            r3 = r4
            goto L_0x0024
        L_0x013c:
            r0 = 0
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r1 = r10.f12870ae
            int r1 = r1.f12922c
            int r1 = r12 - r1
            float r1 = (float) r1
            float r0 = java.lang.Math.max(r0, r1)
            android.graphics.Rect r1 = r10.f12861W
            int r1 = r1.top
            com.cootek.smartinput5.ui.control.SlideSentenceView$b r2 = r10.f12870ae
            int r2 = r2.f12922c
            int r1 = r1 - r2
            float r1 = (float) r1
            float r0 = r0 / r1
            r10.f12905q = r0
            r10.invalidate()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.control.SlideSentenceView.mo9393b(int, int):boolean");
    }

    /* renamed from: a */
    private int m13053a(LinkedList<Point> linkedList) {
        if (linkedList.size() == 0) {
            return -1;
        }
        if (linkedList.size() == 1) {
            return 0;
        }
        return m13051a(linkedList.getFirst(), linkedList.getLast());
    }

    /* renamed from: a */
    private int m13051a(Point point, Point point2) {
        return (int) Math.sqrt((double) (((point.x - point2.x) * (point.x - point2.x)) + ((point.y - point2.y) * (point.y - point2.y))));
    }

    /* renamed from: a */
    private boolean m13071a(Rect rect, Rect rect2) {
        return rect.left > rect2.right || rect2.left > rect.right || rect.top > rect2.bottom || rect2.top > rect.bottom;
    }

    /* renamed from: k */
    public boolean mo9404k() {
        return this.f12886aw && this.f12870ae != null;
    }

    /* renamed from: l */
    public void mo9405l() {
        this.f12865aI.removeMessages(6);
        this.f12865aI.sendEmptyMessage(6);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m13104x() {
        this.f12874ai.mo9589b();
        this.f12865aI.removeMessages(4);
        this.f12865aI.removeMessages(5);
        if (this.f12888ay) {
            this.f12888ay = false;
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo4626a(boolean z, C1252b.C1254b bVar, boolean z2, int i) {
        CandidateItem candidateItem;
        this.f12876ak.clear();
        this.f12877al.clear();
        if (!z || (i == 2 && this.f12887ax)) {
            mo9395d();
            return;
        }
        CandidateItem candidateItem2 = bVar.get(0);
        if (i != 2 || candidateItem2 == null || candidateItem2.getSource() != 8) {
            m13098r();
            f12822aA = i;
            this.f12879an = Engine.getInstance().getInlineText();
            int defaultCandidateItemIndex = Engine.getInstance().getDefaultCandidateItemIndex();
            int i2 = 0;
            while (i2 < 6 && (candidateItem = bVar.get(i2)) != null) {
                if (i != 2 || (i2 >= defaultCandidateItemIndex && m13079b(candidateItem))) {
                    m13060a(candidateItem);
                }
                i2++;
            }
            m13097q();
            if (this.f12876ak.size() > 0 && this.f12889az >= 2) {
                if (this.f12889az == 2) {
                    m13066a(this.f12876ak, this.f12839A, this.f12840B);
                }
                this.f12876ak.clear();
                this.f12877al.clear();
            }
            if (!TextUtils.isEmpty(this.f12878am)) {
                mo9391a(false);
            } else {
                mo9394c();
            }
            if (!this.f12874ai.mo9594g() || this.f12876ak.size() <= 0) {
                this.f12874ai.mo9589b();
            }
            this.f12888ay = false;
            if (this.f12882as && Settings.getInstance().getBoolSetting(Settings.SHOW_WAVE_TIP_SLIDE_DOWN) && !Engine.getInstance().getEditor().isSpecialMode()) {
                this.f12865aI.removeMessages(4);
                if (f12822aA == 2) {
                    this.f12865aI.sendEmptyMessageDelayed(4, 2000);
                } else {
                    this.f12888ay = true;
                }
            }
            invalidate();
        } else if (!Engine.getInstance().isTransactionMode()) {
            m13095o();
        }
    }

    /* renamed from: a */
    private void m13060a(CandidateItem candidateItem) {
        if (f12822aA != 2 || TextUtils.isEmpty(this.f12879an)) {
            candidateItem.calculatePosition();
        } else {
            candidateItem.calculatePosition(this.f12879an.length());
        }
        this.f12876ak.add(candidateItem);
        this.f12877al.add(new Object[]{true, true, false, 0, false});
    }

    /* renamed from: b */
    private boolean m13079b(CandidateItem candidateItem) {
        int source;
        if (candidateItem == null || (source = candidateItem.getSource()) == 1 || source == 9) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo4625a(String str) {
        this.f12878am = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13065a(String str, Rect rect) {
        if (!this.f12880aq.mo9677b(str, rect.left, rect.bottom)) {
            this.f12880aq.mo9675a(str, rect.left, rect.bottom, rect.width(), rect.height());
        }
    }

    /* renamed from: a */
    private Rect m13054a(Rect rect) {
        return m13055a(rect, this.f12898j, this.f12898j * 2, this.f12898j, 0);
    }

    /* renamed from: b */
    private Rect m13073b(Rect rect) {
        return m13055a(rect, this.f12898j / 4, this.f12898j / 4, 0, this.f12861W.height() / 2);
    }

    /* renamed from: c */
    private Rect m13082c(Rect rect) {
        return m13055a(rect, this.f12898j / 4, this.f12898j / 4, (this.f12861W.height() * 3) / 4, this.f12861W.height() / 4);
    }

    /* renamed from: a */
    private Rect m13055a(Rect rect, int i, int i2, int i3, int i4) {
        int min = Math.min(i2, Math.max(rect.width() / 2, i));
        return new Rect(rect.left - min, rect.top - i3, min + rect.right, rect.bottom + i4);
    }

    /* renamed from: b */
    private boolean m13078b(Rect rect, Rect rect2) {
        if (m13054a(rect).contains(this.f12839A, this.f12840B) || m13054a(rect2).contains(this.f12839A, this.f12840B)) {
            return true;
        }
        int centerX = rect.centerX();
        int centerX2 = rect2.centerX();
        int centerY = rect.centerY();
        int centerY2 = rect2.centerY();
        if ((centerY - this.f12840B) * (centerY2 - this.f12840B) <= 0) {
            return true;
        }
        if ((centerX - this.f12839A) * (centerX2 - this.f12839A) > 0) {
            float abs = ((float) Math.abs(centerY - this.f12840B)) / ((float) Math.abs(centerX - this.f12839A));
            float abs2 = ((float) Math.abs(centerY2 - this.f12840B)) / ((float) Math.abs(centerX2 - this.f12839A));
            if (abs == abs2 || ((((double) abs) < 0.577d && ((double) abs2) < 0.577d) || ((((double) abs) > 1.732d && ((double) abs2) > 1.732d) || Math.abs(Math.atan((double) abs) - Math.atan((double) abs2)) < 0.524d))) {
                return false;
            }
            int max = Math.max(1, Math.abs(rect.top - this.f12840B));
            int max2 = Math.max(1, Math.abs(rect.bottom - this.f12840B));
            int max3 = Math.max(1, Math.abs(rect2.top - this.f12840B));
            int max4 = Math.max(1, Math.abs(rect2.bottom - this.f12840B));
            float abs3 = ((float) Math.abs(centerX - this.f12839A)) / ((float) Math.abs(centerY - this.f12840B));
            float abs4 = ((float) Math.abs(centerX2 - this.f12839A)) / ((float) Math.abs(centerY2 - this.f12840B));
            int min = Math.min(Math.min(max, max2), Math.min(max3, max4));
            if (max <= max3) {
                if (Math.abs(abs3 - abs4) * ((float) min) > ((float) (rect.width() / 2))) {
                    return true;
                }
                return false;
            } else if (Math.abs(abs3 - abs4) * ((float) min) > ((float) (rect2.width() / 2))) {
                return true;
            } else {
                return false;
            }
        } else if (centerY == centerY2) {
            return true;
        } else {
            if ((rect.left - this.f12839A) * (rect2.left - this.f12839A) <= 0 && (rect.right - this.f12839A) * (rect2.right - this.f12839A) <= 0) {
                return true;
            }
            int max5 = Math.max(1, Math.abs(rect.top - this.f12840B));
            int max6 = Math.max(1, Math.abs(rect.bottom - this.f12840B));
            int max7 = Math.max(1, Math.abs(rect2.top - this.f12840B));
            int max8 = Math.max(1, Math.abs(rect2.bottom - this.f12840B));
            float abs5 = ((float) Math.abs(centerX - this.f12839A)) / ((float) Math.abs(centerY - this.f12840B));
            float abs6 = ((float) Math.abs(centerX2 - this.f12839A)) / ((float) Math.abs(centerY2 - this.f12840B));
            int min2 = Math.min(Math.min(max5, max6), Math.min(max7, max8));
            if (max5 <= max7) {
                if ((abs5 + abs6) * ((float) min2) > ((float) (rect.width() / 2))) {
                    return true;
                }
                return false;
            } else if ((abs5 + abs6) * ((float) min2) > ((float) (rect2.width() / 2))) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    private boolean m13070a(Point point, Point point2, Rect rect) {
        if (rect.contains(point.x, point.y) || rect.contains(point2.x, point2.y)) {
            return false;
        }
        if ((point.x == rect.right && point.y >= rect.top && point.y <= rect.bottom) || ((point.y == rect.bottom && point.x >= rect.left && point.x <= rect.right) || ((point2.x == rect.right && point2.y >= rect.top && point2.y <= rect.bottom) || (point2.y == rect.bottom && point2.x >= rect.left && point2.x <= rect.right)))) {
            return true;
        }
        if (!m13068a(point.x, point.y, point2.x, point2.y, rect.top, rect.left, rect.right)) {
            if (!m13068a(point.x, point.y, point2.x, point2.y, rect.bottom, rect.left, rect.right)) {
                if (!m13077b(point.x, point.y, point2.x, point2.y, rect.left, rect.top, rect.bottom)) {
                    if (!m13077b(point.x, point.y, point2.x, point2.y, rect.right, rect.top, rect.bottom)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m13068a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 == i4) {
            return false;
        }
        int i8 = (((i2 * i3) - (i4 * i)) - ((i3 - i) * i5)) / (i2 - i4);
        return m13067a(i8, i5, i6, i5, i7, i5) && m13067a(i8, i5, i, i2, i3, i4);
    }

    /* renamed from: b */
    private boolean m13077b(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 == i) {
            return false;
        }
        int i8 = (((i2 * i3) - (i4 * i)) - ((i2 - i4) * i5)) / (i3 - i);
        return m13067a(i5, i8, i5, i6, i5, i7) && m13067a(i5, i8, i, i2, i3, i4);
    }

    /* renamed from: a */
    private boolean m13067a(int i, int i2, int i3, int i4, int i5, int i6) {
        return (i - i3) * (i - i5) <= 0 && (i2 - i4) * (i2 - i6) <= 0;
    }

    /* renamed from: a */
    private boolean m13069a(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(0, 0);
        if (Math.abs(point2.y - point.y) + Math.abs(point2.x - point.x) + Math.abs(point4.y - point3.y) + Math.abs(point4.x - point3.x) == 0) {
            return false;
        }
        int i = ((point2.y - point.y) * (point3.x - point4.x)) - ((point2.x - point.x) * (point3.y - point4.y));
        if (i == 0) {
            return false;
        }
        point5.x = (((((point2.x - point.x) * (point3.x - point4.x)) * (point3.y - point.y)) - ((point3.x * (point2.x - point.x)) * (point3.y - point4.y))) + ((point.x * (point2.y - point.y)) * (point3.x - point4.x))) / i;
        point5.y = (((((point2.y - point.y) * (point3.y - point4.y)) * (point3.x - point.x)) - ((point3.y * (point2.y - point.y)) * (point3.x - point4.x))) + ((point.y * (point2.x - point.x)) * (point3.y - point4.y))) / (0 - i);
        if (m13067a(point5.x, point5.y, point.x, point.y, point2.x, point2.y)) {
            if (m13067a(point5.x, point5.y, point3.x, point3.y, point4.x, point4.y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.cootek.smartinput5.ui.control.SlideSentenceView$b */
    private class C2843b {

        /* renamed from: a */
        int f12920a;

        /* renamed from: b */
        int f12921b;

        /* renamed from: c */
        int f12922c;

        /* renamed from: d */
        String f12923d;

        /* renamed from: e */
        Rect f12924e;

        /* renamed from: f */
        Rect f12925f;

        public C2843b(CandidateItem candidateItem, Rect rect, Rect rect2) {
            this.f12920a = candidateItem.index;
            this.f12923d = candidateItem.word;
            this.f12921b = candidateItem.f4012x;
            this.f12922c = candidateItem.f4013y;
            this.f12924e = rect;
            this.f12925f = rect2;
        }
    }

    /* renamed from: com.cootek.smartinput5.ui.control.SlideSentenceView$a */
    private class C2842a {

        /* renamed from: a */
        int f12908a;

        /* renamed from: b */
        int f12909b;

        /* renamed from: c */
        int f12910c;

        /* renamed from: d */
        int f12911d;

        /* renamed from: e */
        int f12912e;

        /* renamed from: f */
        int f12913f;

        /* renamed from: g */
        int f12914g;

        /* renamed from: h */
        int f12915h;

        /* renamed from: i */
        final Rect f12916i = new Rect();

        /* renamed from: k */
        private int f12918k;

        /* renamed from: l */
        private int f12919l;

        public C2842a(Paint paint, int i, int i2, float f, int i3, int i4, int i5, int i6) {
            this.f12908a = i2;
            this.f12914g = i6;
            this.f12911d = i3;
            this.f12915h = i4;
            m13122a(paint, i, i2, f, i5);
            m13124c();
        }

        /* renamed from: a */
        private void m13122a(Paint paint, int i, int i2, float f, int i3) {
            Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
            paint.getFontMetricsInt(fontMetricsInt);
            Rect rect = new Rect();
            paint.getTextBounds("gif", 0, 3, rect);
            this.f12909b = (int) (((float) (Math.abs((rect.top - fontMetricsInt.top) - (fontMetricsInt.bottom - rect.bottom)) / 2)) + (4.0f * SlideSentenceView.this.f12891c));
            this.f12910c = Math.max(((int) (f / 2.0f)) + this.f12915h, i3 / 2);
            this.f12912e = SlideSentenceView.this.m13086e(i, this.f12910c);
            this.f12913f = i2 - this.f12914g;
            m13123b();
        }

        /* renamed from: b */
        private void m13123b() {
            this.f12916i.set(this.f12912e - this.f12910c, (this.f12913f - this.f12909b) - this.f12911d, this.f12912e + this.f12910c, (this.f12913f - this.f12909b) + this.f12911d);
        }

        /* renamed from: a */
        public void mo9408a(int i) {
            this.f12908a = i;
            this.f12913f = i - this.f12914g;
            m13123b();
        }

        /* renamed from: a */
        public void mo9407a() {
            m13125d();
            m13123b();
        }

        /* renamed from: c */
        private void m13124c() {
            this.f12918k = this.f12908a;
            this.f12919l = this.f12913f;
        }

        /* renamed from: d */
        private void m13125d() {
            this.f12908a = this.f12918k;
            this.f12913f = this.f12919l;
        }
    }
}
