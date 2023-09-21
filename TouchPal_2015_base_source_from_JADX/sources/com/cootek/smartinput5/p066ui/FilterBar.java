package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.FilterManager;
import com.cootek.smartinput5.func.p054d.C1712h;
import com.cootek.smartinput5.p066ui.C2934m;

/* renamed from: com.cootek.smartinput5.ui.FilterBar */
public class FilterBar extends TopScrollView implements FilterManager.IFilterListener, C2934m.C2935a {

    /* renamed from: a */
    private static final String f11212a = "FilterBar";

    /* renamed from: b */
    private FilterManager.IFilterProvider f11213b;

    public FilterBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11818t = true;
        this.f11815q = new C2697ai(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8473a(int i) {
        Engine.getInstance().updateInputOp(C1712h.f5597s);
        Engine.getInstance().fireSelectFilterOperation(i);
        Engine.getInstance().processEvent();
    }

    public void onFilterUpdated(boolean z, FilterManager.IFilterProvider iFilterProvider, boolean z2) {
        this.f11213b = iFilterProvider;
        mo8490a(z2);
    }

    /* renamed from: b */
    public C2727bG mo8477b(int i) {
        return this.f11213b.get(i);
    }

    /* renamed from: d */
    public float mo8493d(int i) {
        return 1.4f;
    }

    /* renamed from: a */
    public boolean mo8475a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo8478b() {
        return true;
    }
}
