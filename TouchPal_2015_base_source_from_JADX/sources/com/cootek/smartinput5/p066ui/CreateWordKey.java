package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.Point;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1599be;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.CreateWordKey */
public class CreateWordKey extends C2806cb {
    private boolean mUserWordMode;

    public CreateWordKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        String packageName = this.mKeyboard.f12571ac.getPackageName();
        this.mainTextPos = new Point(C1599be.m7199a(resources, packageName, "50%p", this.width, 0), C1599be.m7199a(resources, packageName, "69%p", this.height, 0));
    }

    /* access modifiers changed from: protected */
    public int[] getForeState() {
        boolean a = C1368X.m6320c().mo5841n().mo6256a(this.icon);
        this.mUserWordMode = Engine.getInstance().isUserWordMode();
        return this.mUserWordMode ? a ? STATE_BIN_ON_DEFAULT : STATE_BIN_ON_CURRENT : a ? STATE_BIN_OFF_DEFAULT : STATE_BIN_OFF_CURRENT;
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        if (this.mUserWordMode != Engine.getInstance().isUserWordMode()) {
            this.mSoftKeyInfo.needUpdate = true;
        }
        super.updateKeyInfo();
    }
}
