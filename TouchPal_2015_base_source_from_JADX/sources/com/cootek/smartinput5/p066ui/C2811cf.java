package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.cootek.smartinput.utilities.C1017y;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.MoveContrail;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1389aD;
import com.cootek.smartinput5.func.C1443as;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.func.C1811k;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.paopaopanel.C1933b;
import com.cootek.smartinput5.p066ui.C2917du;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.p066ui.control.C2832J;
import com.cootek.smartinput5.p066ui.schema.C2944b;
import com.cootek.smartinput5.p066ui.schema.C2945c;
import com.cootek.smartinput5.p066ui.schema.C2946d;
import com.cootek.smartinput5.p066ui.schema.KeyboardSchema;
import com.cootek.smartinput5.p066ui.schema.RowSchema;
import com.emoji.keyboard.touchpal.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.cootek.smartinput5.ui.cf */
/* compiled from: SoftKeyboard */
public class C2811cf {

    /* renamed from: U */
    static final int f12481U = -1;

    /* renamed from: V */
    static final int f12482V = -2;

    /* renamed from: X */
    static final int f12483X = 300;

    /* renamed from: Y */
    static final int f12484Y = 12;

    /* renamed from: Z */
    static final int f12485Z = 18;

    /* renamed from: a */
    private static final String f12486a = "SoftKeyboard";

    /* renamed from: aA */
    private static final String f12487aA = "BackSpaceKey";

    /* renamed from: aB */
    private static final String f12488aB = "SmileyCategoryKey";

    /* renamed from: aC */
    private static final String f12489aC = "SmileyKey";

    /* renamed from: aN */
    private static final int f12490aN = 10;

    /* renamed from: aO */
    private static final int f12491aO = 5;

    /* renamed from: aP */
    private static final int f12492aP = 50;

    /* renamed from: ag */
    static int f12493ag = 3;

    /* renamed from: aj */
    private static final String f12494aj = "SingleWordKey";

    /* renamed from: ak */
    private static final String f12495ak = "SeparatorKey";

    /* renamed from: al */
    private static final String f12496al = "ClearKey";

    /* renamed from: am */
    private static final String f12497am = "LanguageKey";

    /* renamed from: an */
    private static final String f12498an = "EnterKey";

    /* renamed from: ao */
    private static final String f12499ao = "SymTypeKey";

    /* renamed from: ap */
    private static final String f12500ap = "SymTypeKeyChs";

    /* renamed from: aq */
    private static final String f12501aq = "HandWriteRecogKey";

    /* renamed from: ar */
    private static final String f12502ar = "EditKey";

    /* renamed from: as */
    private static final String f12503as = "SpaceKey";

    /* renamed from: at */
    private static final String f12504at = "CreateWordKey";

    /* renamed from: au */
    private static final String f12505au = "CommaKey";

    /* renamed from: av */
    private static final String f12506av = "WebKey";

    /* renamed from: aw */
    private static final String f12507aw = "PageKey";

    /* renamed from: ax */
    private static final String f12508ax = "NumberKey";

    /* renamed from: ay */
    private static final String f12509ay = "EmojiKey";

    /* renamed from: az */
    private static final String f12510az = "SmileyTabKey";

    /* renamed from: b */
    private static final float f12511b = 0.65f;

    /* renamed from: c */
    private static final String f12512c = "Key";

    /* renamed from: d */
    private static final String f12513d = "Filter";

    /* renamed from: e */
    private static final String f12514e = "CandidatePage";

    /* renamed from: f */
    public static final String f12515f = ":";

    /* renamed from: g */
    public static final int f12516g = 4;

    /* renamed from: h */
    public static final int f12517h = 1;

    /* renamed from: i */
    public static final int f12518i = 2;

    /* renamed from: j */
    public static final int f12519j = 4;

    /* renamed from: k */
    public static final int f12520k = 8;

    /* renamed from: l */
    public static final Hashtable<String, Integer> f12521l = new Hashtable<>();

    /* renamed from: m */
    public static final int f12522m = 0;

    /* renamed from: n */
    public static final int f12523n = 1;

    /* renamed from: o */
    public static final int f12524o = 2;

    /* renamed from: p */
    public static final int f12525p = 4;

    /* renamed from: q */
    public static final int f12526q = 8;

    /* renamed from: r */
    public static final Hashtable<String, Integer> f12527r = new Hashtable<>();

    /* renamed from: A */
    int f12528A;

    /* renamed from: B */
    int f12529B;

    /* renamed from: C */
    int f12530C;

    /* renamed from: D */
    int f12531D;

    /* renamed from: E */
    protected int f12532E;

    /* renamed from: F */
    protected int f12533F;

    /* renamed from: G */
    protected int f12534G;

    /* renamed from: H */
    int f12535H;

    /* renamed from: I */
    int f12536I;

    /* renamed from: J */
    int f12537J;

    /* renamed from: K */
    public Rect f12538K;

    /* renamed from: L */
    public Rect[] f12539L;

    /* renamed from: M */
    public Rect f12540M;

    /* renamed from: N */
    protected int f12541N;

    /* renamed from: O */
    protected int f12542O;

    /* renamed from: P */
    protected boolean f12543P;

    /* renamed from: Q */
    protected C2806cb f12544Q;

    /* renamed from: R */
    protected ArrayList<C2806cb> f12545R;

    /* renamed from: S */
    public SoftKeyboardView f12546S;

    /* renamed from: T */
    public C2816cj f12547T;

    /* renamed from: W */
    protected C2812a f12548W;

    /* renamed from: aD */
    private boolean f12549aD;

    /* renamed from: aE */
    private HashMap<String, C2806cb> f12550aE;

    /* renamed from: aF */
    private int f12551aF;

    /* renamed from: aG */
    private int f12552aG;

    /* renamed from: aH */
    private int f12553aH;

    /* renamed from: aI */
    private int f12554aI;

    /* renamed from: aJ */
    private int f12555aJ;

    /* renamed from: aK */
    private MoveContrail f12556aK;

    /* renamed from: aL */
    private int f12557aL;

    /* renamed from: aM */
    private boolean f12558aM;

    /* renamed from: aQ */
    private int f12559aQ;

    /* renamed from: aR */
    private int f12560aR;

    /* renamed from: aS */
    private int[][] f12561aS;

    /* renamed from: aT */
    private int f12562aT;

    /* renamed from: aU */
    private Handler f12563aU;

    /* renamed from: aV */
    private MoveContrail f12564aV;

    /* renamed from: aW */
    private long f12565aW;

    /* renamed from: aX */
    private int f12566aX;

    /* renamed from: aY */
    private int f12567aY;

    /* renamed from: aZ */
    private int f12568aZ;

    /* renamed from: aa */
    final int f12569aa;

    /* renamed from: ab */
    final int f12570ab;

    /* renamed from: ac */
    C1443as f12571ac;

    /* renamed from: ad */
    boolean f12572ad;

    /* renamed from: ae */
    int f12573ae;

    /* renamed from: af */
    int f12574af;

    /* renamed from: ah */
    public int f12575ah;

    /* renamed from: ai */
    public int f12576ai;

    /* renamed from: ba */
    private boolean f12577ba;

    /* renamed from: bb */
    private boolean f12578bb;

    /* renamed from: bc */
    private boolean f12579bc;

    /* renamed from: bd */
    private boolean f12580bd;

    /* renamed from: be */
    private C2832J f12581be;

    /* renamed from: bf */
    private KeyboardSchema f12582bf;

    /* renamed from: s */
    boolean f12583s;

    /* renamed from: t */
    int f12584t;

    /* renamed from: u */
    int f12585u;

    /* renamed from: v */
    int f12586v;

    /* renamed from: w */
    boolean f12587w;

    /* renamed from: x */
    int f12588x;

    /* renamed from: y */
    int f12589y;

    /* renamed from: z */
    int f12590z;

    /* renamed from: com.cootek.smartinput5.ui.cf$a */
    /* compiled from: SoftKeyboard */
    protected interface C2812a {
        /* renamed from: a */
        void mo9205a(int i);

        /* renamed from: a */
        void mo9206a(MoveContrail moveContrail);
    }

    static {
        f12521l.put(Settings.KEYBOARD_MARGIN_LEFT, 1);
        f12521l.put(Settings.KEYBOARD_MARGIN_RIGHT, 2);
        f12521l.put("top", 4);
        f12521l.put("bottom", 8);
        f12527r.put("shift", 1);
        f12527r.put("ctrl", 2);
        f12527r.put("alt", 4);
        f12527r.put("func", 8);
    }

    /* renamed from: c */
    public static int m12759c(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static int m12761d(int i) {
        switch (i) {
            case 0:
                return -2;
            case 1:
                return -1;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static int m12750a(int i, int i2) {
        int c = m12759c(i);
        String[] f = C1368X.m6320c().mo5841n().mo6272f(i2);
        return Integer.valueOf(f[(f.length - c) - 1]).intValue();
    }

    /* renamed from: e */
    public static int m12764e(int i) {
        switch (i) {
            case 0:
                return R.array.portrait_keyboard_size_scale_small_model;
            case 2:
                return R.array.portrait_keyboard_size_scale_large_model;
            default:
                return R.array.portrait_keyboard_size_scale_middle_model;
        }
    }

    public C2811cf(String str) {
        this(str, 0);
    }

    public C2811cf(String str, int i) {
        KeyboardSchema d;
        this.f12574af = 0;
        this.f12575ah = 0;
        this.f12576ai = 0;
        C1443as asVar = m12760c(str).f13205a;
        this.f12571ac = asVar;
        this.f12556aK = new MoveContrail();
        this.f12564aV = new MoveContrail();
        float f = C1368X.m6313b().getResources().getDisplayMetrics().density;
        this.f12569aa = (int) (12.0f * f);
        this.f12570ab = (int) (f * 18.0f);
        this.f12547T = new C2816cj(this);
        DisplayMetrics displayMetrics = C1368X.m6313b().getResources().getDisplayMetrics();
        this.f12531D = displayMetrics.widthPixels;
        this.f12530C = displayMetrics.heightPixels;
        this.f12590z = 0;
        this.f12589y = this.f12531D / 10;
        this.f12528A = 0;
        this.f12588x = this.f12589y;
        int i2 = this.f12531D / 10;
        this.f12529B = i2 * i2;
        this.f12545R = new ArrayList<>();
        this.f12550aE = new HashMap<>();
        this.f12563aU = new C2813cg(this);
        if (!(str == null || (d = m12762d(str)) == null)) {
            if (this.f12581be == null) {
                this.f12581be = new C2832J(d, mo9197s());
            } else {
                this.f12581be.mo9286a(d);
                this.f12581be.mo9288a(mo9197s());
            }
            this.f12581be.mo9290b();
            this.f12534G = this.f12581be.mo9292c();
            m12756a(asVar, d);
            this.f12581be.mo9287a(this.f12545R);
        }
        mo9191m();
    }

    /* renamed from: c */
    private C2917du.C2918a m12760c(String str) {
        C2917du.C2918a aVar = new C2917du.C2918a();
        String str2 = null;
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            str2 = str.substring(0, indexOf);
        }
        aVar.f13205a = C1811k.m8322a().mo6824c(str2);
        return aVar;
    }

    /* renamed from: d */
    private KeyboardSchema m12762d(String str) {
        return C2946d.m13631a(str);
    }

    /* renamed from: j */
    public KeyboardSchema mo9188j() {
        return this.f12582bf;
    }

    /* renamed from: k */
    public void mo9189k() {
        if (this.f12581be == null) {
            this.f12581be = new C2832J(this.f12582bf, mo9197s());
        }
        this.f12581be.mo9287a(this.f12545R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo9020e() {
        for (C2806cb updateKeyInfo : mo9195q()) {
            updateKeyInfo.updateKeyInfo();
        }
    }

    /* renamed from: l */
    public void mo9190l() {
        for (C2806cb destroy : mo9195q()) {
            destroy.destroy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo9191m() {
        this.f12548W = new C2814ch(this);
    }

    /* renamed from: a */
    private C2806cb m12751a(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        return m12752a(resources, cqVar, i, i2, bVar, bVar.keyType);
    }

    /* renamed from: a */
    private C2806cb m12752a(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar, String str) {
        if (f12512c.equals(str)) {
            return new C2806cb(resources, this, cqVar, i, i2, bVar);
        }
        if (f12513d.equals(str)) {
            return new SoftFilter(resources, cqVar, i, i2, bVar);
        }
        if (f12514e.equals(str)) {
            return new SoftCandidatePage(resources, cqVar, i, i2, bVar);
        }
        if (f12494aj.equals(str)) {
            return new SingleWordKey(resources, cqVar, i, i2, bVar);
        }
        if (f12496al.equals(str)) {
            return new ClearKey(resources, cqVar, i, i2, bVar);
        }
        if (f12495ak.equals(str)) {
            return new SeparatorKey(resources, cqVar, i, i2, bVar);
        }
        if (f12497am.equals(str)) {
            return new LanguageKey(resources, cqVar, i, i2, bVar);
        }
        if ("EnterKey".equals(str)) {
            return new EnterKey(resources, cqVar, i, i2, bVar);
        }
        if (f12499ao.equals(str)) {
            return new SymTypeKey(resources, cqVar, i, i2, bVar);
        }
        if (f12500ap.equals(str)) {
            return new SymTypeKeyChs(resources, cqVar, i, i2, bVar);
        }
        if (f12501aq.equals(str)) {
            return new HandWriteRecogKey(resources, cqVar, i, i2, bVar);
        }
        if (f12502ar.equals(str)) {
            return new EditKey(resources, cqVar, i, i2, bVar);
        }
        if (f12503as.equals(str)) {
            return new SpaceKey(resources, cqVar, i, i2, bVar);
        }
        if (f12504at.equals(str)) {
            return new CreateWordKey(resources, cqVar, i, i2, bVar);
        }
        if (f12506av.equals(str)) {
            return new WebKey(resources, cqVar, i, i2, bVar);
        }
        if (f12507aw.equals(str)) {
            return new PageKey(resources, cqVar, i, i2, bVar);
        }
        if (f12508ax.equals(str)) {
            return new NumberKey(resources, cqVar, i, i2, bVar);
        }
        if (f12509ay.equals(str)) {
            return new EmojiKey(resources, cqVar, i, i2, bVar);
        }
        if (f12510az.equals(str)) {
            return new SmileyTabKey(resources, cqVar, i, i2, bVar);
        }
        if (f12487aA.equals(str)) {
            return new BackSpaceKey(resources, cqVar, i, i2, bVar);
        }
        if (f12488aB.equals(str)) {
            return new SmileyCategoryKey(resources, cqVar, i, i2, bVar);
        }
        if (f12505au.equals(str)) {
            return new CommaKey(resources, cqVar, i, i2, bVar);
        }
        if (f12489aC.equals(str)) {
            return new SmileyKey(resources, cqVar, i, i2, bVar);
        }
        try {
            return (C2806cb) Class.forName(getClass().getPackage().getName() + C1389aD.f4374j + str).getConstructor(new Class[]{Resources.class, C2884cq.class, Integer.TYPE, Integer.TYPE, C2944b.class}).newInstance(new Object[]{resources, cqVar, Integer.valueOf(i), Integer.valueOf(i2), bVar});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return null;
        }
    }

    /* renamed from: c */
    private int mo9018c() {
        if (!TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4835f) || !mo9197s()) {
            return Settings.getInstance().getIntSetting(Settings.KEYBOARD_HEIGHT_NORMAL);
        }
        if (2 != C1933b.m8860a()) {
            return Settings.getInstance().getIntSetting(255);
        }
        return -1;
    }

    /* renamed from: a */
    private void m12755a(Resources resources, KeyboardSchema keyboardSchema) {
        try {
            C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
            this.f12535H = (int) (((double) C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.width, this.f12531D, this.f12531D)) * ad.mo9250h());
            int c = mo9018c();
            int a = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.height, this.f12530C, this.f12530C);
            if (c == -1) {
                this.f12532E = a;
            } else {
                ad.mo9234a(((double) c) / ((double) a));
                this.f12532E = c;
            }
            this.f12532E = this.f12581be.mo9284a(this.f12532E, ((int) (((float) this.f12530C) * f12511b)) - Engine.getInstance().getWidgetManager().mo9651i().mo9718d());
            this.f12534G = this.f12581be.mo9292c();
            this.f12533F = this.f12581be.mo9293d();
            mo7435b();
            this.f12556aK.setCanvasSize(this.f12535H, this.f12532E);
            this.f12564aV.setCanvasSize(this.f12535H, this.f12533F);
            this.f12589y = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.keyWidth, this.f12535H, this.f12535H / 10);
            this.f12588x = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.keyHeight, this.f12532E, this.f12532E / 4);
            this.f12590z = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.horizontalGap, this.f12535H, 0);
            this.f12528A = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.verticalGap, this.f12532E, 0);
            this.f12553aH = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.slipThreshold, this.f12531D, this.f12531D / 2);
            this.f12554aI = (this.f12553aH * 2) / 3;
            int a2 = C1599be.m7199a(resources, this.f12571ac.getPackageName(), keyboardSchema.slideThreshold, this.f12535H, this.f12589y);
            float f = ((float) this.f12532E) / ((float) a);
            if (f < 1.0f) {
                a2 = (int) (((float) a2) * f);
            }
            this.f12529B = a2 * a2;
            this.f12549aD = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.enableDrawMoveContrail, true);
            this.f12541N = C1599be.m7198a(resources, this.f12571ac.getPackageName(), keyboardSchema.candidateRowCount, 3);
            this.f12542O = C1599be.m7198a(resources, this.f12571ac.getPackageName(), keyboardSchema.candidateColumCount, 4);
            this.f12543P = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.useDynamicGridPager, false);
            this.f12583s = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.altTextInCorner, false);
            this.f12584t = C1599be.m7216b(resources, this.f12571ac.getPackageName(), keyboardSchema.mainOnlyTextSize, -1);
            this.f12585u = C1599be.m7216b(resources, this.f12571ac.getPackageName(), keyboardSchema.mainTextSize, -1);
            this.f12586v = C1599be.m7216b(resources, this.f12571ac.getPackageName(), keyboardSchema.altTextSize, -1);
            this.f12587w = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.mainTextFontBold, true);
            this.f12580bd = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.hasDictSwitcher, false);
            this.f12579bc = C1599be.m7214a(resources, this.f12571ac.getPackageName(), keyboardSchema.supportSmileyAnimation, true);
            String str = keyboardSchema.animationAreaLeft;
            if (!TextUtils.isEmpty(str)) {
                this.f12538K = new Rect();
                this.f12538K.left = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str, this.f12535H, 0);
                String str2 = keyboardSchema.animationAreaTop;
                this.f12538K.top = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str2, this.f12532E, 0);
                String str3 = keyboardSchema.animationAreaWidth;
                this.f12538K.right = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str3, this.f12535H, 0) + this.f12538K.left;
                String str4 = keyboardSchema.animationAreaHeight;
                this.f12538K.bottom = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str4, this.f12532E, 0) + this.f12538K.top;
            }
            if (!TextUtils.isEmpty(keyboardSchema.shadowRect)) {
                this.f12539L = this.f12581be.mo9291b(this.f12535H, this.f12532E);
            }
            String str5 = keyboardSchema.backgroundLeftEdge;
            if (!TextUtils.isEmpty(str5)) {
                this.f12540M = new Rect();
                this.f12540M.left = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str5, this.f12535H, 0);
                String str6 = keyboardSchema.backgroundTopEdge;
                this.f12540M.top = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str6, this.f12532E, 0);
                String str7 = keyboardSchema.backgroundBottomWdith;
                this.f12540M.right = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str7, this.f12535H, this.f12535H) + this.f12538K.left;
                String str8 = keyboardSchema.backgroundBottomHeight;
                this.f12540M.bottom = C1599be.m7199a(resources, this.f12571ac.getPackageName(), str8, this.f12532E, this.f12532E) + this.f12538K.top;
            }
        } catch (Exception e) {
            C1017y.m5219b(f12486a, "Parse error:" + e);
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7435b() {
    }

    /* renamed from: a */
    private void m12756a(C1443as asVar, KeyboardSchema keyboardSchema) {
        if (asVar != null && keyboardSchema != null) {
            this.f12582bf = keyboardSchema;
            m12755a(asVar.getResources(), keyboardSchema);
            C2945c cVar = new C2945c();
            this.f12544Q = m12752a(asVar.getResources(), (C2884cq) null, 0, 0, keyboardSchema, f12512c);
            m12757a(asVar, keyboardSchema.mRows, cVar);
        }
    }

    /* renamed from: a */
    private void m12757a(C1443as asVar, RowSchema[] rowSchemaArr, C2945c cVar) {
        if (rowSchemaArr != null) {
            for (RowSchema rowSchema : rowSchemaArr) {
                if (rowSchema != null) {
                    C2884cq a = m12754a(asVar, rowSchema, cVar);
                    cVar.mo9755a(0);
                    int b = a.f13103e + cVar.mo9756b() + a.f13100b;
                    cVar.mo9757b(b);
                    this.f12536I = b - this.f12528A;
                }
            }
        }
    }

    /* renamed from: a */
    private C2884cq m12754a(C1443as asVar, RowSchema rowSchema, C2945c cVar) {
        C2884cq cqVar = new C2884cq(asVar.getResources(), this, rowSchema);
        cqVar.f13105g = m12752a(asVar.getResources(), cqVar, cVar.mo9754a(), cVar.mo9756b(), rowSchema, f12512c);
        C2944b[] bVarArr = rowSchema.keys;
        if (bVarArr != null) {
            for (C2944b a : bVarArr) {
                C2806cb a2 = m12753a(asVar, a, cqVar, cVar);
                if (cqVar.mo9556a(a2)) {
                    cVar.mo9755a(a2.f12453x + a2.width);
                    this.f12545R.add(a2);
                }
                if (cVar.mo9754a() > this.f12537J) {
                    this.f12537J = cVar.mo9754a();
                }
            }
        }
        return cqVar;
    }

    /* renamed from: a */
    private C2806cb m12753a(C1443as asVar, C2944b bVar, C2884cq cqVar, C2945c cVar) {
        if (bVar == null) {
            return null;
        }
        return m12751a(asVar.getResources(), cqVar, cVar.mo9754a(), cVar.mo9756b(), bVar);
    }

    /* renamed from: g */
    public int mo9134g() {
        return this.f12532E;
    }

    /* renamed from: n */
    public int mo9192n() {
        return this.f12535H;
    }

    /* renamed from: o */
    public int mo9193o() {
        return (int) (((double) this.f12536I) / Engine.getInstance().getWidgetManager().mo9630ad().mo9251i());
    }

    /* renamed from: p */
    public int mo9194p() {
        return (int) (((double) this.f12537J) / Engine.getInstance().getWidgetManager().mo9630ad().mo9250h());
    }

    /* renamed from: a */
    public Rect mo9177a(String str) {
        Rect rect = new Rect();
        C2806cb b = mo9182b(str);
        if (b != null) {
            rect.left = b.f12453x;
            rect.top = b.f12454y;
            rect.right = b.f12453x + b.width;
            rect.bottom = b.height + b.f12454y;
        }
        return rect;
    }

    /* renamed from: b */
    public int[] mo9184b(int i, int i2) {
        int i3;
        if (this.f12561aS == null) {
            mo9019d();
        }
        if (i < 0 || i >= mo9194p() || i2 < 0 || i2 >= mo9134g() || (i3 = ((i2 / this.f12560aR) * 10) + (i / this.f12559aQ)) >= 50) {
            return new int[0];
        }
        return this.f12561aS[i3];
    }

    /* renamed from: d */
    private void mo9019d() {
        this.f12559aQ = ((mo9194p() + 10) - 1) / 10;
        this.f12560aR = ((mo9134g() + 5) - 1) / 5;
        this.f12561aS = new int[50][];
        int[] iArr = new int[this.f12545R.size()];
        int i = this.f12559aQ * 10;
        int i2 = this.f12560aR * 5;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.f12545R.size(); i6++) {
                    C2806cb cbVar = this.f12545R.get(i6);
                    if (cbVar.squaredDistanceFrom(i3, i4) < this.f12562aT || cbVar.squaredDistanceFrom((this.f12559aQ + i3) - 1, i4) < this.f12562aT || cbVar.squaredDistanceFrom((this.f12559aQ + i3) - 1, (this.f12560aR + i4) - 1) < this.f12562aT || cbVar.squaredDistanceFrom(i3, (this.f12560aR + i4) - 1) < this.f12562aT) {
                        iArr[i5] = i6;
                        i5++;
                    }
                }
                int[] iArr2 = new int[i5];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                this.f12561aS[((i4 / this.f12560aR) * 10) + (i3 / this.f12559aQ)] = iArr2;
                i4 = this.f12560aR + i4;
            }
            i3 = this.f12559aQ + i3;
        }
    }

    /* renamed from: q */
    public List<C2806cb> mo9195q() {
        return this.f12545R;
    }

    /* renamed from: a */
    public void mo7433a() {
        Iterator<C2806cb> it = this.f12545R.iterator();
        while (it.hasNext()) {
            it.next().updateKeyInfo();
        }
    }

    /* renamed from: r */
    public Handler mo9196r() {
        return this.f12563aU;
    }

    /* renamed from: a */
    public boolean mo9180a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (mo9198t()) {
            this.f12556aK.addPoint(x, y, action);
            Engine.getInstance().getWidgetManager().mo9655l().mo9343a(this.f12556aK);
        }
        if (action == 0) {
            this.f12551aF = x;
            this.f12552aG = y;
            this.f12574af = 0;
            this.f12575ah = x;
            this.f12564aV.clear();
            this.f12556aK.clear();
            this.f12565aW = System.currentTimeMillis();
            this.f12566aX = -1;
            this.f12567aY = x;
            this.f12568aZ = y;
            this.f12564aV.addPoint(x, y, action);
            this.f12577ba = false;
            this.f12578bb = false;
            this.f12555aJ = -1;
        } else if (action == 2) {
            this.f12574af++;
            if (this.f12555aJ != -1) {
                return true;
            }
            if (mo9183b(this.f12556aK)) {
                this.f12555aJ = 3;
                SoftKeyboardView softKeyboardView = this.f12546S;
                if (this.f12574af <= 4 && Settings.getInstance().getBoolSetting(30)) {
                    Settings.getInstance().setBoolSetting(30, false);
                }
                if (softKeyboardView == null) {
                    this.f12564aV.addPoint(x, y, action);
                } else {
                    int a = softKeyboardView.mo8724a(x, y);
                    if (a != this.f12566aX || Math.abs(x - this.f12564aV.getX(this.f12564aV.size() - 1)) > this.f12569aa || Math.abs(y - this.f12564aV.getY(this.f12564aV.size() - 1)) > this.f12570ab) {
                        this.f12564aV.addPoint(x, y, action);
                    }
                    if (Settings.getInstance().getBoolSetting(82)) {
                        if (a != this.f12566aX) {
                            if (Math.abs(x - this.f12567aY) > this.f12569aa || Math.abs(y - this.f12568aZ) > this.f12570ab) {
                                this.f12577ba = false;
                                this.f12578bb = false;
                            } else {
                                this.f12577ba = true;
                                this.f12578bb = true;
                            }
                            this.f12565aW = System.currentTimeMillis();
                        } else if (System.currentTimeMillis() - this.f12565aW > 300) {
                            if (this.f12577ba) {
                                this.f12577ba = false;
                                this.f12578bb = false;
                            }
                            if (!this.f12578bb) {
                                if (!Settings.getInstance().getBoolSetting(30)) {
                                    Settings.getInstance().setBoolSetting(30, true);
                                }
                                this.f12548W.mo9206a(this.f12564aV);
                                this.f12578bb = true;
                            }
                        }
                    }
                    this.f12566aX = a;
                    this.f12567aY = x;
                    this.f12568aZ = y;
                }
                return true;
            } else if (mo9185c(this.f12556aK)) {
                this.f12555aJ = 2;
                return true;
            } else {
                int a2 = mo9176a(this.f12551aF, this.f12552aG, x, y, this.f12574af);
                if (a2 != -1 && a2 != -2) {
                    this.f12555aJ = a2;
                    this.f12548W.mo9205a(this.f12555aJ);
                    return true;
                } else if (a2 == -2) {
                    this.f12574af--;
                }
            }
        } else if (action == 1) {
            if (this.f12555aJ != -1) {
                if (this.f12555aJ == 3 || this.f12555aJ == 2) {
                    SoftKeyboardView softKeyboardView2 = this.f12546S;
                    if (softKeyboardView2 == null || this.f12555aJ != 3) {
                        this.f12548W.mo9206a(this.f12556aK);
                    } else {
                        if (softKeyboardView2.mo8724a(x, y) != this.f12566aX || Math.abs(x - this.f12564aV.getX(this.f12564aV.size() - 1)) > this.f12569aa || Math.abs(y - this.f12564aV.getY(this.f12564aV.size() - 1)) > this.f12570ab) {
                            this.f12564aV.addPoint(x, y, action);
                            this.f12578bb = false;
                        } else {
                            if (this.f12578bb && this.f12577ba) {
                                this.f12578bb = false;
                            }
                            this.f12564aV.addPoint(this.f12564aV.getX(this.f12564aV.size() - 1), this.f12564aV.getY(this.f12564aV.size() - 1), 1);
                        }
                        this.f12548W.mo9206a(this.f12564aV);
                    }
                }
                this.f12556aK.clear();
                this.f12564aV.clear();
                this.f12555aJ = -1;
                if (mo9198t()) {
                    Engine.getInstance().getWidgetManager().mo9655l().mo8602b();
                }
                return true;
            }
            this.f12556aK.clear();
            this.f12564aV.clear();
            if (mo9198t()) {
                Engine.getInstance().getWidgetManager().mo9655l().mo8602b();
            }
        } else if (action == 3) {
            this.f12556aK.clear();
            this.f12564aV.clear();
            this.f12555aJ = -1;
            if (mo9198t()) {
                Engine.getInstance().getWidgetManager().mo9655l().mo8602b();
            }
            return false;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo9197s() {
        return this.f12547T.mo9208a(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo9198t() {
        return this.f12549aD && (this.f12547T.mo9208a(3) || this.f12547T.mo9208a(2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9181a(MoveContrail moveContrail) {
        return mo9183b(moveContrail) || mo9185c(moveContrail);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9183b(MoveContrail moveContrail) {
        if (!this.f12547T.mo9208a(3) || moveContrail.size() <= f12493ag || moveContrail.getMaxOffsetSquare() <= this.f12529B) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9185c(MoveContrail moveContrail) {
        if (!this.f12547T.mo9208a(2) || moveContrail.size() <= f12493ag || moveContrail.getMaxOffsetSquare() <= this.f12529B) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9176a(int i, int i2, int i3, int i4, int i5) {
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i4);
        if (abs > this.f12553aH || abs2 > this.f12554aI) {
            int abs3 = Math.abs(this.f12575ah - i3);
            int abs4 = Math.abs(this.f12576ai - i4);
            if (abs3 <= this.f12569aa && abs4 <= this.f12570ab) {
                return -2;
            }
            this.f12575ah = i3;
            this.f12576ai = i4;
            if (i5 <= f12493ag) {
                return -1;
            }
            if (abs > abs2) {
                if (i > i3 && this.f12547T.mo9208a(0)) {
                    return 0;
                }
                if (i >= i3 || !this.f12547T.mo9208a(1)) {
                    return -1;
                }
                return 1;
            } else if (i2 > i4 && this.f12547T.mo9208a(5)) {
                return 5;
            } else {
                if (i2 >= i4 || !this.f12547T.mo9208a(6)) {
                    return -1;
                }
                return 6;
            }
        } else if (abs >= this.f12569aa || abs2 >= this.f12570ab) {
            return -1;
        } else {
            return -2;
        }
    }

    /* renamed from: a */
    public void mo9016a(int i) {
    }

    /* renamed from: u */
    public boolean mo9199u() {
        return this.f12549aD;
    }

    /* renamed from: b */
    public C2806cb mo9182b(String str) {
        Iterator<C2806cb> it = this.f12545R.iterator();
        while (it.hasNext()) {
            C2806cb next = it.next();
            if (str.equals(next.keyName)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C2806cb mo9178a(int i, String str, boolean z) {
        return mo9179a(i, str, z, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.cootek.smartinput5.p066ui.C2806cb mo9179a(int r9, java.lang.String r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r7 = 1
            r2 = 0
            if (r10 != 0) goto L_0x0006
            r0 = r2
        L_0x0005:
            return r0
        L_0x0006:
            r3 = 0
            if (r9 != r7) goto L_0x0035
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r0 = r8.f12550aE
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x001a
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r0 = r8.f12550aE
            java.lang.Object r0 = r0.get(r10)
            com.cootek.smartinput5.ui.cb r0 = (com.cootek.smartinput5.p066ui.C2806cb) r0
            goto L_0x0005
        L_0x001a:
            if (r12 != 0) goto L_0x0035
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r0 = r0.getOriginalLetters(r10)
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r1 = r8.f12550aE
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0036
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r1 = r8.f12550aE
            java.lang.Object r0 = r1.get(r0)
            com.cootek.smartinput5.ui.cb r0 = (com.cootek.smartinput5.p066ui.C2806cb) r0
            goto L_0x0005
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r12 != 0) goto L_0x00a7
            if (r0 != 0) goto L_0x00a7
            com.cootek.smartinput5.engine.Engine r0 = com.cootek.smartinput5.engine.Engine.getInstance()
            java.lang.String r0 = r0.getOriginalLetters(r10)
            r1 = r0
        L_0x0043:
            java.util.ArrayList<com.cootek.smartinput5.ui.cb> r0 = r8.f12545R
            java.util.Iterator r6 = r0.iterator()
            r4 = r3
            r3 = r2
        L_0x004b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r6.next()
            com.cootek.smartinput5.ui.cb r0 = (com.cootek.smartinput5.p066ui.C2806cb) r0
            if (r9 != r7) goto L_0x0073
            com.cootek.smartinput5.ui.SoftKeyInfo r3 = r0.mSoftKeyInfo
            java.lang.String r3 = r3.mainTitle
        L_0x005d:
            if (r3 == 0) goto L_0x004b
            if (r11 == 0) goto L_0x008c
            boolean r5 = r10.equalsIgnoreCase(r3)
            if (r12 != 0) goto L_0x006b
            boolean r4 = r3.equalsIgnoreCase(r1)
        L_0x006b:
            if (r5 == 0) goto L_0x0097
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r1 = r8.f12550aE
            r1.put(r10, r0)
            goto L_0x0005
        L_0x0073:
            r5 = 2
            if (r9 != r5) goto L_0x007b
            com.cootek.smartinput5.ui.SoftKeyInfo r3 = r0.mSoftKeyInfo
            java.lang.String r3 = r3.altTitle
            goto L_0x005d
        L_0x007b:
            r5 = 4
            if (r9 != r5) goto L_0x0083
            com.cootek.smartinput5.ui.SoftKeyInfo r3 = r0.mSoftKeyInfo
            java.lang.String r3 = r3.leftTitle
            goto L_0x005d
        L_0x0083:
            r5 = 8
            if (r9 != r5) goto L_0x005d
            com.cootek.smartinput5.ui.SoftKeyInfo r3 = r0.mSoftKeyInfo
            java.lang.String r3 = r3.rightTitle
            goto L_0x005d
        L_0x008c:
            boolean r5 = r10.equals(r3)
            if (r12 != 0) goto L_0x006b
            boolean r4 = r3.equals(r1)
            goto L_0x006b
        L_0x0097:
            if (r4 == 0) goto L_0x00a5
        L_0x0099:
            r2 = r0
            goto L_0x004b
        L_0x009b:
            if (r2 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.String, com.cootek.smartinput5.ui.cb> r0 = r8.f12550aE
            r0.put(r10, r2)
        L_0x00a2:
            r0 = r2
            goto L_0x0005
        L_0x00a5:
            r0 = r2
            goto L_0x0099
        L_0x00a7:
            r1 = r0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.C2811cf.mo9179a(int, java.lang.String, boolean, boolean):com.cootek.smartinput5.ui.cb");
    }

    /* renamed from: f */
    public void mo9186f(int i) {
        this.f12558aM = false;
        this.f12557aL |= i;
    }

    /* renamed from: g */
    public void mo9187g(int i) {
        this.f12557aL &= i ^ -1;
    }

    /* renamed from: v */
    public int mo9200v() {
        return this.f12557aL;
    }

    /* renamed from: w */
    public void mo9201w() {
        this.f12558aM = true;
    }

    /* renamed from: x */
    public boolean mo9202x() {
        return this.f12558aM;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo9203y() {
        this.f12572ad = true;
    }

    /* renamed from: z */
    public boolean mo9204z() {
        return this.f12579bc;
    }

    /* renamed from: A */
    public boolean mo9175A() {
        return this.f12580bd;
    }
}
