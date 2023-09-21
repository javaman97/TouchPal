package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.p066ui.C2934m;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.HandWriteBar */
public class HandWriteBar extends LinearLayout implements CandidateManager.ICandidateListener, FilterManager.IFilterListener, C2934m.C2935a {

    /* renamed from: a */
    private CandidateBarHW f11288a;

    /* renamed from: b */
    private FilterBarHW f11289b;

    /* renamed from: c */
    private boolean f11290c;

    /* renamed from: d */
    private boolean f11291d;

    public HandWriteBar(Context context) {
        super(context);
    }

    public HandWriteBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        if (this.f11289b == null) {
            this.f11289b = (FilterBarHW) findViewById(R.id.filters_hw);
        }
        this.f11289b.onFilterUpdated(z, iFilterProvider, z2);
        this.f11290c = z;
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        if (this.f11288a == null) {
            this.f11288a = (CandidateBarHW) findViewById(R.id.candidates_hw);
        }
        this.f11288a.onCandidateUpdated(z, iCandidateProvider, z2, iCandidateProvider2, z3, iCandidateProvider3, z4);
        this.f11291d = z;
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return this.f11291d || this.f11290c;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
    }
}
