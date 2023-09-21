package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2728bH;
import com.cootek.smartinput5.p066ui.C2934m;

/* renamed from: com.cootek.smartinput5.ui.HardCandidateBar */
public class HardCandidateBar extends TopPageView implements CandidateManager.ICandidateListener, C2728bH.C2729a, C2934m.C2935a {

    /* renamed from: o */
    private static final String f11434o = "HardCandidateBar";

    /* renamed from: a */
    protected int f11435a;

    /* renamed from: b */
    protected C2794cR f11436b = new C2794cR(getContext());

    /* renamed from: c */
    protected CandidateManager.ICandidateProvider f11437c;

    /* renamed from: p */
    private boolean f11438p;

    public HardCandidateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11689j = new C2728bH(this);
        this.f11691l = new C2673aM(this);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11438p = z;
        if (z) {
            Engine.getInstance().getIms().setCandidatesViewShown(true);
        }
        this.f11689j.mo9004b();
        if (z) {
            this.f11435a = iCandidateProvider.getFirstIndex();
            this.f11437c = iCandidateProvider;
        }
        mo8791a(z4);
        this.f11436b.mo9534b_();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8637c(int i) {
        Engine.getInstance().fireCandidateEndOperation(this.f11435a + i);
        Engine.getInstance().processEvent();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8638e() {
        return this.f11435a != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8639f() {
        return mo8792e(this.f11690k) != null;
    }

    /* renamed from: a */
    public C2727bG mo8496a(int i) {
        if (this.f11437c != null) {
            return this.f11437c.get(this.f11435a + i);
        }
        return null;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return this.f11438p;
    }
}
