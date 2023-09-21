package com.cootek.smartinput5.p066ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.cootek.smartinput5.engine.Settings;
import com.emoji.keyboard.touchpal.R;

/* renamed from: com.cootek.smartinput5.ui.HardSymbolCandidateBar */
public class HardSymbolCandidateBar extends HardCandidateBar {

    /* renamed from: o */
    private static final String f11440o = "sk_symbol_";

    public HardSymbolCandidateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11691l = new C2675aO(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8638e() {
        return super.mo8638e() && !Settings.getInstance().getBoolSetting(112);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo8639f() {
        return super.mo8639f() && !Settings.getInstance().getBoolSetting(112);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo8640g() {
        return !Settings.getInstance().getBoolSetting(112);
    }

    /* renamed from: a_ */
    public void mo8497a_(int i) {
        View findViewById = ((View) getParent()).findViewById(R.id.hard_symbol_tab);
        if (findViewById != null) {
            if (i == 3145775) {
                mo8791a(true);
            }
            HardSymbolTypeBar hardSymbolTypeBar = (HardSymbolTypeBar) findViewById;
            if (i >= 3145772 && i <= 3145783) {
                hardSymbolTypeBar.mo8643d(i);
            }
        }
    }
}
