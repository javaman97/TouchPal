package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.LanguageKey */
public class LanguageKey extends C2806cb {
    private static String CHINESE_SHORT_NAME = "中";
    private boolean showingPreviewText;

    LanguageKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
    }

    public void updateKeyInfo() {
        this.showingPreviewText = false;
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
        }
        this.icon = null;
        this.iconPreview = this.icon;
        this.mSoftKeyInfo.printTitle |= 1;
        if (C1368X.m6320c().mo5842o().mo5955l()) {
            this.mSoftKeyInfo.mainTitle = CHINESE_SHORT_NAME;
        } else {
            this.mSoftKeyInfo.mainTitle = Engine.getInstance().getCurrentLanguageShortName();
        }
        this.mSoftKeyInfo.needUpdate = true;
        this.backgroundType = 1;
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public String getPreviewText(int i) {
        if (this.showingPreviewText) {
            return this.mSoftKeyInfo.mainTitle;
        }
        return super.getPreviewText(i);
    }

    /* access modifiers changed from: protected */
    public void onPress() {
        super.onPress();
        updateKeyInfo();
    }

    /* access modifiers changed from: protected */
    public void onRelease() {
        super.onRelease();
        updateKeyInfo();
    }

    /* access modifiers changed from: protected */
    public void refreshIconColor() {
        super.refreshIconColor();
    }
}
