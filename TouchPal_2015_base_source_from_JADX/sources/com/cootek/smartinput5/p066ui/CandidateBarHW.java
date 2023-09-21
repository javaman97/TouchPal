package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.p066ui.C2728bH;
import com.cootek.smartinput5.p066ui.C2934m;

/* renamed from: com.cootek.smartinput5.ui.CandidateBarHW */
public class CandidateBarHW extends TopPageView implements CandidateManager.ICandidateListener, C2728bH.C2729a, C2934m.C2935a {

    /* renamed from: b */
    private static final String f11174b = "CandidateBar";

    /* renamed from: a */
    protected CandidateManager.ICandidateProvider f11175a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f11176c;

    /* renamed from: o */
    private boolean f11177o;

    public CandidateBarHW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11689j = new C2728bH(this);
        this.f11691l = new C2933l(this);
    }

    /* renamed from: a */
    public C2727bG mo8496a(int i) {
        if (this.f11175a == null) {
            return null;
        }
        return this.f11175a.get(i);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        this.f11689j.mo9004b();
        this.f11177o = z;
        if (z) {
            this.f11176c = iCandidateProvider.getFirstIndex();
            this.f11175a = iCandidateProvider;
        }
        mo8791a(z4);
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return this.f11177o;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o_ */
    public void mo8498o_() {
    }
}
