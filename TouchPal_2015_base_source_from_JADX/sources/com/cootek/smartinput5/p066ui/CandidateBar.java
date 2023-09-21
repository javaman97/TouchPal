package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.engine.SurfaceManager;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1626bx;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.func.resource.C1974m;
import com.cootek.smartinput5.func.yahoosearch.C2137q;
import com.cootek.smartinput5.p066ui.C2934m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.CandidateBar */
public class CandidateBar extends TopScrollView implements CandidateManager.ICandidateListener, C2934m.C2935a {

    /* renamed from: x */
    private static final String f11163x = "CandidateBar";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f11164A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f11165B = false;

    /* renamed from: C */
    private boolean f11166C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f11167D;

    /* renamed from: E */
    private boolean f11168E = true;

    /* renamed from: a */
    protected int f11169a;

    /* renamed from: b */
    protected C2794cR f11170b;

    /* renamed from: c */
    protected CandidateManager.ICandidateProvider f11171c;

    /* renamed from: y */
    private boolean f11172y;

    /* renamed from: z */
    private CandidateItem[] f11173z;

    public CandidateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        this.f11170b = new C2794cR(context);
        this.f11166C = Settings.getInstance().getBoolSetting(Settings.WUBI_AUTO_ADJUST_TIP_OCCURED);
        this.f11815q = new C2930i(this);
        String[] f = C1368X.m6320c().mo5841n().mo6272f((int) R.array.dummy_item_text);
        this.f11173z = new CandidateItem[f.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < f.length) {
                this.f11173z[i2] = new CandidateItem();
                this.f11173z[i2].setData(-1, f[i2], i2 == 0 ? 1 : 0, 0, false, false, false, false, false, false, false);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8473a(int i) {
        m11579j(i);
        int i2 = this.f11169a + i;
        m11581l(i2);
        Engine.getInstance().fireSelectCandidateOperation(i2);
        Engine.getInstance().processEvent();
        m11580k(i2);
        this.f11165B = false;
    }

    /* renamed from: j */
    private void m11579j(int i) {
        if (!this.f11166C && TextUtils.equals(Engine.getInstance().getCurrentLanguageId(), C1549b.f4833d)) {
            if (mo8477b(i) == null || (mo8477b(i).getTag() == 0 && ((CandidateItem) mo8477b(i)).getSource() != 6)) {
                String languageCategory = C1368X.m6320c().mo5835h().getLanguageCategory(C1549b.f4833d, 13);
                C2618H h = new C2618H(C1368X.m6313b());
                h.mo8572a(C1974m.m9063a(getContext(), (int) R.string.wubi_auto_adjust_tip_title));
                h.mo8580b(C1974m.m9063a(getContext(), (int) R.string.wubi_auto_adjust_tip_msg));
                h.mo8584c(C1974m.m9063a(getContext(), (int) R.string.wubi_auto_adjust_reselection_tips));
                h.mo8574a(C1974m.m9063a(getContext(), (int) R.string.enable_button), (View.OnClickListener) new C2931j(this, languageCategory));
                h.mo8581b(C1974m.m9063a(getContext(), (int) R.string.disable_button), (View.OnClickListener) new C2932k(this, languageCategory));
                h.mo8582b(true);
                this.f11166C = true;
                Settings.getInstance().setBoolSetting(Settings.WUBI_AUTO_ADJUST_TIP_OCCURED, true);
            }
        }
    }

    /* renamed from: k */
    private void m11580k(int i) {
        CandidateItem candidateItem = null;
        if (this.f11171c != null) {
            candidateItem = this.f11171c.get(i);
        }
        if (candidateItem != null && candidateItem.getSource() == 6) {
            C1368X.m6320c().mo5823I().mo6393k();
        }
    }

    /* renamed from: l */
    private void m11581l(int i) {
        CandidateItem candidateItem = null;
        if (this.f11171c != null) {
            candidateItem = this.f11171c.get(i);
        }
        if (candidateItem != null) {
            C1626bx I = C1368X.m6320c().mo5823I();
            if (candidateItem.errorCorrectionCount > 0) {
                I.mo6387e();
            }
            if (candidateItem.isCloudPredict() && candidateItem.word != null) {
                I.mo6382a(candidateItem.word.length());
            }
        }
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        if (this.f11164A) {
            z = true;
        }
        this.f11172y = z;
        if (this.f11172y) {
            this.f11169a = iCandidateProvider.getFirstIndex();
            this.f11171c = iCandidateProvider;
            mo8490a(z4);
        }
        this.f11170b.mo9534b_();
        this.f11165B = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2727bG mo8477b(int i) {
        if (this.f11164A) {
            if (i >= 0 && i < this.f11173z.length) {
                return this.f11173z[i];
            }
        } else if (this.f11171c != null) {
            return this.f11171c.get(this.f11169a + i);
        }
        return null;
    }

    /* renamed from: d */
    public float mo8493d(int i) {
        switch (i) {
            case 0:
                return 1.4f;
            case 1:
                return 1.2f;
            default:
                return 1.0f;
        }
    }

    /* renamed from: a */
    public boolean mo8475a() {
        if (this.f11164A) {
            return true;
        }
        return this.f11172y;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8490a(boolean z) {
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
        mo8825k();
        if (!this.f11168E) {
            return;
        }
        if (!Engine.getInstance().isMultitouch || !Engine.getInstance().isClickTransMode() || Engine.getInstance().getWidgetManager().mo9646f().mo9200v() != 0) {
            invalidate();
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8494f() {
        if (Engine.isInitialized() && Engine.getInstance().isClickTransMode()) {
            Engine.getInstance().setClickTransMode(false);
            this.f11168E = false;
            Engine.getInstance().fireTransactionOperation(2);
            Engine.getInstance().processEvent();
            this.f11168E = true;
        }
        return true;
    }

    /* renamed from: b */
    public void mo8492b(boolean z) {
        this.f11164A = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m_ */
    public boolean mo8482m_() {
        return CandidateManager.useSimpleCandidateStyle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8491a(boolean z, boolean z2) {
        String str;
        if (z) {
            str = C1712h.f5600v;
        } else {
            str = C1712h.f5601w;
        }
        Engine.getInstance().updateInputOp(str + (z2 ? 1 : 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8480e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8495g() {
        return C2137q.m9701d();
    }
}
