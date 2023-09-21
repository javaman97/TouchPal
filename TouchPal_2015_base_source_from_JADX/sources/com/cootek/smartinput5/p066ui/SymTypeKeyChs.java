package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SymTypeKeyChs */
public class SymTypeKeyChs extends SymTypeKey {
    public SymTypeKeyChs(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public boolean isCurrent() {
        return this.keyName != null && this.keyName.endsWith(Settings.getInstance().getStringSetting(Settings.SYM_CURRENT_TAB_CHS));
    }
}
