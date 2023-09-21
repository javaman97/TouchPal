package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.NumberKey */
public class NumberKey extends C2806cb {
    Drawable numberIcon;
    Drawable previewIcon;

    public NumberKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        super.updateKeyInfo();
        if (this.numberIcon == null || this.previewIcon == null) {
            this.numberIcon = this.icon;
            this.previewIcon = this.iconPreview;
        }
        if (!Engine.isInitialized()) {
            return;
        }
        if (Engine.getInstance().getEditor().getInputType() == 8) {
            this.mSoftKeyInfo.printTitle = 1;
            this.icon = null;
            this.iconPreview = null;
            return;
        }
        this.mSoftKeyInfo.printTitle = 0;
        this.icon = this.numberIcon;
        this.iconPreview = this.previewIcon;
    }
}
