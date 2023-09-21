package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.p066ui.C2728bH;
import com.cootek.smartinput5.p066ui.C2934m;

/* renamed from: com.cootek.smartinput5.ui.FilterBarHW */
public class FilterBarHW extends TopPageView implements FilterManager.IFilterListener, C2728bH.C2729a, C2934m.C2935a {

    /* renamed from: b */
    private static final String f11214b = "CandidateBar";

    /* renamed from: a */
    protected FilterManager.IFilterProvider f11215a;

    /* renamed from: c */
    private boolean f11216c;

    public FilterBarHW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11689j = new C2728bH(this);
        this.f11691l = new C2698aj(this);
    }

    /* renamed from: a */
    public C2727bG mo8496a(int i) {
        if (this.f11215a == null) {
            return null;
        }
        return this.f11215a.get(i);
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        if (iFilterProvider.getType() == 4 || !z) {
            this.f11216c = z;
            this.f11689j.mo9004b();
            if (z) {
                this.f11215a = iFilterProvider;
                mo8791a(z2);
            }
            HandWriteMask p = Engine.getInstance().getWidgetManager().mo9659p();
            if (p != null && p.mo8612a()) {
                if (p.getStatus() == 4 || p.getStatus() == 5) {
                    p.setStatus(4);
                    return;
                }
                return;
            }
            return;
        }
        this.f11216c = false;
        this.f11689j.mo9004b();
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return this.f11216c;
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
