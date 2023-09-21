package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.p066ui.C2934m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.HardSymbolBar */
public class HardSymbolBar extends LinearLayout implements CandidateManager.ICandidateListener, C2934m.C2935a {

    /* renamed from: a */
    private HardSymbolCandidateBar f11439a;

    public HardSymbolBar(Context context) {
        super(context);
    }

    public HardSymbolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        if (this.f11439a == null) {
            this.f11439a = (HardSymbolCandidateBar) findViewById(R.id.hard_candidates);
        }
        this.f11439a.onCandidateUpdated(z, iCandidateProvider, z2, iCandidateProvider2, z3, iCandidateProvider3, z4);
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
        this.f11439a.mo8497a_(i);
    }
}
