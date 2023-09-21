package com.cootek.smartinput5.p066ui;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.cootek.smartinput5.engine.Engine;
import com.cootek.smartinput5.engine.Settings;
import com.cootek.smartinput5.func.C1368X;
import com.cootek.smartinput5.func.C1593bR;
import com.cootek.smartinput5.p046b.C1132b;
import com.cootek.smartinput5.p046b.C1135d;
import com.cootek.smartinput5.p066ui.schema.C2944b;

/* renamed from: com.cootek.smartinput5.ui.SymTypeKey */
public class SymTypeKey extends C2806cb {
    private boolean firstStart = false;

    public SymTypeKey(Resources resources, C2884cq cqVar, int i, int i2, C2944b bVar) {
        super(resources, cqVar, i, i2, bVar);
        int keyId = Engine.getInstance().getKeyId(this.keyName);
        if (keyId != -1) {
            this.mSoftKeyInfo.setSupportedOperation(Engine.getInstance().getKeySupportedOperation(keyId));
            Engine.getInstance().updateKey(keyId, this.mSoftKeyInfo);
        }
        this.firstStart = true;
        if (C1132b.m5654a(C1368X.m6313b()).mo4392a(C1135d.SYM_TYPE_DISPLAY_ICON, Boolean.valueOf(C1593bR.m7162a().f5075a)).booleanValue()) {
            this.mSoftKeyInfo.mainTitle = "";
            return;
        }
        this.icon = null;
        this.iconPreview = null;
    }

    /* access modifiers changed from: protected */
    public void updateActionListener() {
        this.mActionListener = new C2781cE(this);
    }

    /* access modifiers changed from: protected */
    public void updateKeyInfo() {
        if (this.mKeyboard.f12546S != null) {
            this.mKeyboard.f12546S.mo8732a((C2806cb) this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean isCurrent() {
        return this.keyName != null && this.keyName.endsWith(Settings.getInstance().getStringSetting(93));
    }

    /* access modifiers changed from: protected */
    public int[] getBackState() {
        if (isCurrent()) {
            if (this.mKeyboard.f12546S != null && this.firstStart) {
                ViewGroup viewGroup = (ViewGroup) this.mKeyboard.f12546S.getParent();
                if (viewGroup instanceof SymTypesScroll) {
                    ((SymTypesScroll) viewGroup).setScroll(this);
                }
            }
            this.firstStart = false;
            return STATE_FOCUSED;
        }
        this.firstStart = false;
        return super.getBackState();
    }

    /* access modifiers changed from: protected */
    public void showPreview(int i) {
    }
}
