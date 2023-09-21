package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SmileyTabKey */
public class SmileyTabKey extends C2806cb {
    public SmileyTabKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public boolean isCurrent() {
        return this.keyName != null && this.keyName.endsWith(Settings.getInstance().getStringSetting(Settings.CURRENT_SMILEY_TAB));
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2741bT(this);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
        super.updateKeyInfo();
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (isCurrent()) {
            return STATE_PRESSED;
        }
        return super.getBackState();
    }
}
