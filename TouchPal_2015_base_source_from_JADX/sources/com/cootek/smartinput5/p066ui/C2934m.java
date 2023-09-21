package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.cootek.presentation.sdk.PresentationManager;
import com.cootek.presentation.service.toast.NextWordToast;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.CommitManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.VerboseManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.control.C2826E;
import com.cootek.smartinput5.presentations.C2515q;
import com.cootek.smartinput5.teaching.p065a.C2564f;
import com.emoji.keyboard.touchpal.R;
import java.util.Arrays;
import java.util.Hashtable;

/* renamed from: com.cootek.smartinput5.ui.m */
/* compiled from: CandidateViewWidget */
public class C2934m implements CandidateManager.ICandidateListener, CommitManager.ICommitTextListener, FilterManager.IFilterListener, VerboseManager.IVerboseListener {

    /* renamed from: J */
    private static final String f13293J = "top_bar=";

    /* renamed from: K */
    private static final String f13294K = "candidate_bar";

    /* renamed from: L */
    private static final String f13295L = "function_bar";

    /* renamed from: M */
    private static final String f13296M = "dialect_bar";

    /* renamed from: N */
    private static final String f13297N = "adduserword_bar";

    /* renamed from: O */
    private static final String f13298O = "filter_bar";

    /* renamed from: P */
    private static final String f13299P = "number_bar";

    /* renamed from: Q */
    private static final String f13300Q = "hard_candidate_bar";

    /* renamed from: R */
    private static final String f13301R = "handwrite_bar";

    /* renamed from: S */
    private static final String f13302S = "hard_symbol_bar";

    /* renamed from: T */
    private static final String f13303T = "handwrite_half_bar";

    /* renamed from: U */
    private static final String f13304U = "handwrite_half_filter_bar";

    /* renamed from: a */
    public static final int f13305a = 54;

    /* renamed from: b */
    public static final int f13306b = 4;

    /* renamed from: c */
    public static final int f13307c = 1;

    /* renamed from: d */
    public static final int f13308d = 1;

    /* renamed from: e */
    private static final String f13309e = "CandidateViewWidget";

    /* renamed from: A */
    private int f13310A;

    /* renamed from: B */
    private int f13311B;

    /* renamed from: C */
    private int f13312C;

    /* renamed from: D */
    private boolean f13313D;

    /* renamed from: E */
    private boolean f13314E = false;

    /* renamed from: F */
    private Hashtable<String, Integer> f13315F = new Hashtable<>();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f13316G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f13317H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public NextWordToast f13318I;

    /* renamed from: V */
    private int f13319V = -1;

    /* renamed from: f */
    private InputMethodService f13320f;

    /* renamed from: g */
    private LayoutInflater f13321g;

    /* renamed from: h */
    private final int f13322h = -2;

    /* renamed from: i */
    private final int f13323i = -1;

    /* renamed from: j */
    private final int f13324j = 0;

    /* renamed from: k */
    private final int f13325k = 1;

    /* renamed from: l */
    private final int f13326l = 2;

    /* renamed from: m */
    private final int f13327m = 3;

    /* renamed from: n */
    private final int f13328n = 4;

    /* renamed from: o */
    private final int f13329o = 5;

    /* renamed from: p */
    private final int f13330p = 6;

    /* renamed from: q */
    private final int f13331q = 7;

    /* renamed from: r */
    private final int f13332r = 8;

    /* renamed from: s */
    private final int f13333s = 9;

    /* renamed from: t */
    private final int f13334t = 10;

    /* renamed from: u */
    private final int f13335u = 11;

    /* renamed from: v */
    private C2935a[] f13336v;

    /* renamed from: w */
    private View f13337w;

    /* renamed from: x */
    private TextView f13338x;

    /* renamed from: y */
    private ImageView f13339y;

    /* renamed from: z */
    private FrameLayout.LayoutParams f13340z;

    /* renamed from: com.cootek.smartinput5.ui.m$a */
    /* compiled from: CandidateViewWidget */
    interface C2935a {
        /* renamed from: a */
        boolean mo8475a();

        /* renamed from: a_ */
        void mo8497a_(int i);

        /* renamed from: b */
        boolean mo8478b();
    }

    public C2934m(InputMethodService inputMethodService) {
        this.f13320f = inputMethodService;
        this.f13321g = inputMethodService.getLayoutInflater();
        this.f13336v = new C2935a[11];
        this.f13311B = -1;
        this.f13337w = this.f13321g.inflate(R.layout.presentation_msg_layout, (ViewGroup) null);
        this.f13338x = (TextView) this.f13337w.findViewById(R.id.presentation_text);
        this.f13337w.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.candidate_bar, C2726bF.CANDIDATE_BG));
        this.f13338x.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.candidate_normal));
        this.f13339y = (ImageView) this.f13337w.findViewById(R.id.presentation_close);
        this.f13339y.setImageDrawable(C1368X.m6320c().mo5841n().mo6249a((int) R.drawable.key_fun_backspace_clear));
        this.f13340z = new FrameLayout.LayoutParams(-1, mo9718d());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        m13569a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (com.cootek.smartinput5.engine.Engine.getInstance().isSoftKeyMode() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (com.cootek.smartinput5.engine.Engine.getInstance().isHardKeyMode() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r6.f13320f.setCandidatesViewShown(r4.mo8478b());
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0086  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m13574o() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r6.f13313D
            if (r2 == 0) goto L_0x0091
            boolean r2 = r6.f13316G
            if (r2 == 0) goto L_0x0091
            boolean r2 = r6.f13317H
            if (r2 == 0) goto L_0x0036
            com.cootek.presentation.service.toast.NextWordToast r2 = r6.f13318I
            if (r2 == 0) goto L_0x0036
            com.cootek.presentation.service.toast.NextWordToast r2 = r6.f13318I
            java.lang.String r2 = r2.getId()
            com.cootek.presentation.sdk.PresentationManager.shown(r2)
            r2 = -2
            r6.f13312C = r2
            android.inputmethodservice.InputMethodService r2 = r6.f13320f
            android.view.View r3 = r6.f13337w
            r2.setCandidatesView(r3)
            android.view.View r2 = r6.f13337w
            android.widget.FrameLayout$LayoutParams r3 = r6.f13340z
            r2.setLayoutParams(r3)
            android.inputmethodservice.InputMethodService r2 = r6.f13320f
            r2.setCandidatesViewShown(r0)
            r6.f13317H = r1
        L_0x0033:
            r6.f13316G = r1
        L_0x0035:
            return
        L_0x0036:
            boolean r2 = r6.f13317H
            if (r2 != 0) goto L_0x004a
            com.cootek.presentation.service.toast.NextWordToast r2 = r6.f13318I
            if (r2 == 0) goto L_0x004a
            com.cootek.presentation.service.toast.NextWordToast r2 = r6.f13318I
            java.lang.String r2 = r2.getId()
            com.cootek.presentation.sdk.PresentationManager.closed(r2)
            r2 = 0
            r6.f13318I = r2
        L_0x004a:
            int r2 = r6.f13310A
            r3 = r2
            r2 = r1
        L_0x004e:
            if (r3 <= 0) goto L_0x009b
            com.cootek.smartinput5.ui.m$a[] r4 = r6.f13336v
            r4 = r4[r2]
            boolean r5 = r6.f13314E
            if (r5 != 0) goto L_0x008c
            r5 = r3 & 1
            if (r5 == 0) goto L_0x0062
            boolean r5 = r4.mo8475a()
            if (r5 != 0) goto L_0x0064
        L_0x0062:
            if (r3 != r0) goto L_0x008c
        L_0x0064:
            r6.m13569a((int) r2)
            com.cootek.smartinput5.engine.Engine r2 = com.cootek.smartinput5.engine.Engine.getInstance()
            boolean r2 = r2.isSoftKeyMode()
            if (r2 != 0) goto L_0x007b
            com.cootek.smartinput5.engine.Engine r2 = com.cootek.smartinput5.engine.Engine.getInstance()
            boolean r2 = r2.isHardKeyMode()
            if (r2 == 0) goto L_0x009b
        L_0x007b:
            android.inputmethodservice.InputMethodService r2 = r6.f13320f
            boolean r3 = r4.mo8478b()
            r2.setCandidatesViewShown(r3)
        L_0x0084:
            if (r0 != 0) goto L_0x0033
            android.inputmethodservice.InputMethodService r0 = r6.f13320f
            r0.setCandidatesViewShown(r1)
            goto L_0x0033
        L_0x008c:
            int r2 = r2 + 1
            int r3 = r3 >>> 1
            goto L_0x004e
        L_0x0091:
            boolean r0 = r6.f13313D
            if (r0 != 0) goto L_0x0035
            android.inputmethodservice.InputMethodService r0 = r6.f13320f
            r0.setCandidatesViewShown(r1)
            goto L_0x0035
        L_0x009b:
            r0 = r1
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cootek.smartinput5.p066ui.C2934m.m13574o():void");
    }

    /* renamed from: a */
    public boolean mo9715a() {
        return this.f13313D;
    }

    public void onOperationFinished() {
        m13574o();
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f13316G = true;
    }

    public void commitText(CharSequence charSequence) {
        CandidateBar f;
        if (!TextUtils.isEmpty(charSequence)) {
            m13571a(charSequence);
            if (Settings.getInstance().getBoolSetting(Settings.COMMIT_ANIMATION_ENABLED) && (f = mo9720f()) != null && f.isShown()) {
                f.mo8808a(charSequence.toString().trim(), Engine.getInstance().getInlineText());
            }
        }
    }

    /* renamed from: a */
    private void m13571a(CharSequence charSequence) {
        if (C1368X.m6320c().mo5850w().mo8415d() || C2564f.m11470c()) {
            this.f13318I = null;
        } else if (C2515q.m11248a()) {
            this.f13318I = C2515q.m11251b().mo8310a(charSequence.toString());
        }
        if (this.f13318I != null) {
            String id = this.f13318I.getId();
            this.f13338x.setText(this.f13318I.getDisplay());
            this.f13338x.setOnClickListener(new C2936n(this, id));
            if (this.f13318I.canShowClose()) {
                this.f13339y.setVisibility(0);
                this.f13339y.setOnClickListener(new C2937o(this, id));
            } else {
                this.f13339y.setVisibility(8);
            }
            this.f13317H = true;
            PresentationManager.shown(id);
            return;
        }
        this.f13317H = false;
    }

    /* renamed from: a */
    private void m13569a(int i) {
        if (this.f13312C != i) {
            this.f13312C = i;
            this.f13320f.setCandidatesView((View) this.f13336v[i]);
            this.f13319V = i;
        }
    }

    /* renamed from: p */
    private boolean m13575p() {
        if (C1368X.m6324d() && !C1368X.m6320c().mo5842o().mo5955l() && this.f13319V == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public View mo9716b() {
        if (this.f13312C == -2) {
            return this.f13337w;
        }
        if (this.f13312C < 0 || this.f13312C >= 11) {
            return null;
        }
        return (View) this.f13336v[this.f13312C];
    }

    /* renamed from: c */
    public int mo9717c() {
        int dimensionPixelSize = this.f13320f.getResources().getDimensionPixelSize(R.dimen.fast_candidate_height);
        if (Settings.getInstance().getConfig().getOrientation() == 1) {
            return (int) (((float) dimensionPixelSize) * ((((float) C2811cf.m12750a(Settings.getInstance().getIntSetting(81), C2811cf.m12764e(Engine.getInstance().getWidgetManager().mo9621a(m13576q())))) / 100.0f) + 1.0f));
        }
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public int mo9718d() {
        if (this.f13311B == -1) {
            this.f13311B = (int) ((((double) mo9717c()) * Engine.getInstance().getWidgetManager().mo9630ad().mo9251i()) + 0.5d);
        }
        return this.f13311B;
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f13316G = true;
    }

    /* renamed from: q */
    private Context m13576q() {
        return this.f13320f;
    }

    /* renamed from: e */
    public FunctionBar mo9719e() {
        return (FunctionBar) this.f13336v[10];
    }

    /* renamed from: f */
    public CandidateBar mo9720f() {
        return (CandidateBar) this.f13336v[4];
    }

    /* renamed from: g */
    public DialectBar mo9721g() {
        return (DialectBar) this.f13336v[2];
    }

    /* renamed from: a */
    public void mo9712a(Engine engine) {
        String str;
        int i = 0;
        while (true) {
            if (i >= engine.getSurfaceExtraElementsCount()) {
                str = "function_bar/candidate_bar/adduserword_bar/dialect_bar";
                break;
            }
            String surfaceExtraElement = engine.getSurfaceExtraElement(i);
            if (!TextUtils.isEmpty(surfaceExtraElement) && surfaceExtraElement.startsWith(f13293J)) {
                str = surfaceExtraElement.substring(8);
                break;
            }
            i++;
        }
        if (str.equalsIgnoreCase("none")) {
            this.f13313D = false;
            this.f13320f.setCandidatesViewShown(false);
            return;
        }
        this.f13313D = true;
        mo9714a(str.split("/"), engine);
        this.f13337w.setBackgroundDrawable(C1368X.m6320c().mo5841n().mo6250a((int) R.drawable.candidate_bar, C2726bF.CANDIDATE_BG));
        this.f13338x.setTextColor(C1368X.m6320c().mo5841n().mo6260b((int) R.color.candidate_normal));
    }

    /* renamed from: a */
    public void mo9714a(String[] strArr, Engine engine) {
        int i;
        this.f13310A = 0;
        this.f13312C = -1;
        for (String str : strArr) {
            int a = m13567a(str);
            if (a != 0) {
                if (str.equals(f13294K)) {
                    i = 4;
                } else if (str.equals(f13295L)) {
                    i = 10;
                } else if (str.equals(f13296M)) {
                    i = 2;
                } else if (str.equals(f13297N)) {
                    i = 1;
                } else if (str.equals(f13298O)) {
                    i = 0;
                } else if (str.equals(f13299P)) {
                    i = 3;
                } else if (str.equals(f13300Q)) {
                    i = 5;
                } else if (str.equals(f13301R)) {
                    i = 6;
                } else if (str.equals(f13302S)) {
                    i = 7;
                } else if (str.equals(f13303T)) {
                    i = 9;
                } else if (str.equals(f13304U)) {
                    i = 8;
                } else {
                    i = -1;
                }
                if (i != -1) {
                    if (this.f13336v[i] == null) {
                        try {
                            this.f13336v[i] = (C2935a) this.f13321g.inflate(a, (ViewGroup) null);
                            if (i == 10) {
                                ((FunctionBar) this.f13336v[10]).mo8540e();
                            }
                        } catch (Exception e) {
                            return;
                        }
                    } else if (i == 10) {
                        ((FunctionBar) this.f13336v[10]).mo8546i();
                    }
                    this.f13310A |= 1 << i;
                    if (this.f13336v[i] instanceof CandidateManager.ICandidateListener) {
                        engine.getCandidateManager().registerCandidateListener((CandidateManager.ICandidateListener) this.f13336v[i]);
                    }
                    if (this.f13336v[i] instanceof FilterManager.IFilterListener) {
                        engine.getFilterManager().registerFilterListener((FilterManager.IFilterListener) this.f13336v[i]);
                    }
                    if (i == 10) {
                        FunctionBar functionBar = (FunctionBar) this.f13336v[10];
                        functionBar.mo8555p();
                        functionBar.mo8558r();
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public void mo9722h() {
        if (this.f13336v[10] != null) {
            ((FunctionBar) this.f13336v[10]).mo8549l();
        }
        this.f13313D = true;
        Arrays.fill(this.f13336v, (Object) null);
        this.f13310A = 0;
        this.f13311B = -1;
        this.f13315F.clear();
    }

    /* renamed from: i */
    public void mo9723i() {
        this.f13311B = -1;
    }

    /* renamed from: a */
    private int m13567a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Integer num = this.f13315F.get(str);
        if (num == null) {
            num = Integer.valueOf(m13576q().getResources().getIdentifier(str, "layout", m13576q().getPackageName()));
            this.f13315F.put(str, num);
        }
        return num.intValue();
    }

    /* renamed from: a */
    public void mo9713a(boolean z) {
        this.f13314E = z;
    }

    /* renamed from: j */
    public boolean mo9724j() {
        return this.f13314E;
    }

    /* renamed from: k */
    public int mo9725k() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        int integer = m13576q().getResources().getInteger(R.integer.shortcut_plugin_page_item_count) + 2;
        double d = (double) ((integer * 1) + ((integer - 1) * 1 * 2));
        return (int) (ad.mo9250h() * (((double) (ad.mo9227B() - (mo9727m() * 2))) / d) * 1.0d);
    }

    /* renamed from: l */
    public int mo9726l() {
        C2826E ad = Engine.getInstance().getWidgetManager().mo9630ad();
        int integer = m13576q().getResources().getInteger(R.integer.shortcut_plugin_page_item_count) + 2;
        double d = (double) ((integer * 1) + ((integer - 1) * 1 * 2));
        return (int) (ad.mo9250h() * (((double) (ad.mo9227B() - (mo9727m() * 2))) / d) * 1.0d);
    }

    /* renamed from: m */
    public int mo9727m() {
        return Engine.getInstance().getWidgetManager().mo9630ad().mo9227B() / 54;
    }

    /* renamed from: n */
    public int mo9728n() {
        return mo9718d() / 4;
    }
}
