package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SoftCandidatePage */
class SoftCandidatePage extends C2806cb {
    private static final boolean NEED_SURFACE_ANIMATION = true;

    SoftCandidatePage(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2746bY(this);
    }

    /* access modifiers changed from: package-private */
    public void updateDisplay() {
        if (!this.keyName.contains(EnterKey.NEXT) || ((C2744bW) this.mKeyboard).mo9019d()) {
            this.mSoftKeyInfo.mainTitle = null;
            return;
        }
        this.mSoftKeyInfo.mainTitle = Integer.toString(((C2744bW) this.mKeyboard).mo9018c() + 1);
    }

    public void updateKeyInfo() {
        this.mSoftKeyInfo.printTitle = 1;
        this.mSoftKeyInfo.setSupportedOperation(1);
    }
}
