package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Config;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.p052b.C1549b;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.HandWriteRecogKey */
public class HandWriteRecogKey extends C2806cb {
    public HandWriteRecogKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2670aJ(this);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (this.intTag == Settings.getInstance().getIntSetting(29, 8, C1549b.f4835f, (Config) null)) {
            return STATE_FOCUSED;
        }
        return super.getBackState();
    }
}
