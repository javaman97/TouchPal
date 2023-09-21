package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.CandidateItem;
import com.cootek.smartinput5.engine.CandidateManager;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.C2728bH;
import com.cootek.smartinput5.p066ui.C2934m;

/* renamed from: com.cootek.smartinput5.ui.NumberCandidateBar */
public class NumberCandidateBar extends TopPageView implements CandidateManager.ICandidateListener, C2728bH.C2729a, C2934m.C2935a {

    /* renamed from: b */
    private static final String f11477b = "NumberCandidateBar";

    /* renamed from: a */
    protected CandidateManager.ICandidateProvider f11478a;

    /* renamed from: c */
    private boolean f11479c;

    public NumberCandidateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11688i = Engine.getInstance().getWidgetManager().mo9630ad().mo9262t() / 10;
        this.f11687g = 0;
        this.f11689j = new C2728bH(this);
        this.f11691l = new C2765bp(this);
    }

    /* renamed from: h */
    public boolean mo8671h() {
        this.f11688i = Engine.getInstance().getWidgetManager().mo9630ad().mo9262t() / 10;
        return true;
    }

    public void onCandidateUpdated(boolean z, CandidateManager.ICandidateProvider iCandidateProvider, boolean z2, CandidateManager.ICandidateProvider iCandidateProvider2, boolean z3, CandidateManager.ICandidateProvider iCandidateProvider3, boolean z4) {
        if (Engine.isInitialized() && !Engine.getInstance().getWidgetManager().mo9651i().mo9724j()) {
            if (Engine.getInstance().isClickTransMode()) {
                Engine.getInstance().setClickTransMode(false);
                Engine.getInstance().fireTransactionOperation(2);
                Engine.getInstance().processEvent();
            }
            this.f11479c = z;
            if (z) {
                this.f11689j.mo9004b();
                this.f11478a = iCandidateProvider;
                mo8791a(z4);
            }
        }
    }

    /* renamed from: a */
    public C2727bG mo8496a(int i) {
        if (this.f11478a == null) {
            return null;
        }
        return this.f11478a.get(i);
    }

    /* renamed from: a */
    public boolean mo8475a() {
        if (!this.f11479c) {
            return false;
        }
        CandidateItem candidateItem = this.f11478a.get(0);
        String displayString = candidateItem == null ? null : candidateItem.getDisplayString();
        if ("1".equals(displayString) || "(".equals(displayString)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
    }
}
